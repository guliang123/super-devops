package com.wl4g.devops.djob.core.internal.schedule;

import com.wl4g.devops.djob.core.internal.election.LeaderService;
import com.wl4g.devops.djob.core.internal.instance.InstanceService;
import com.wl4g.devops.djob.core.reg.base.CoordinatorRegistryCenter;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.plugins.management.ShutdownHookPlugin;
import org.quartz.spi.ClassLoadHelper;

/**
 * 作业关闭钩子.
 *
 * @author zhangliang
 */
public final class JobShutdownHookPlugin extends ShutdownHookPlugin {
    
    private String jobName;
    
    @Override
    public void initialize(final String name, final Scheduler scheduler, final ClassLoadHelper classLoadHelper) throws SchedulerException {
        super.initialize(name, scheduler, classLoadHelper);
        jobName = scheduler.getSchedulerName();
    }
    
    @Override
    public void shutdown() {
        CoordinatorRegistryCenter regCenter = JobRegistry.getInstance().getRegCenter(jobName);
        if (null == regCenter) {
            return;
        }
        LeaderService leaderService = new LeaderService(regCenter, jobName);
        if (leaderService.isLeader()) {
            leaderService.removeLeader();
        }
        new InstanceService(regCenter, jobName).removeInstance();
    }
}
