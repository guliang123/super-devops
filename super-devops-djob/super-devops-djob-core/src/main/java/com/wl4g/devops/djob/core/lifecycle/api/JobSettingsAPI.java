/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package com.wl4g.devops.djob.core.lifecycle.api;

import com.wl4g.devops.djob.core.lifecycle.domain.JobSettings;

/**
 * 作业配置的API.
 *
 * @author zhangliang
 */
public interface JobSettingsAPI {
    
    /**
     * 获取作业设置.
     *
     * @param jobName 作业名称
     * @return 作业设置对象
     */
    JobSettings getJobSettings(String jobName);
    
    /**
     * 更新作业设置.
     *
     * @param jobSettings 作业设置对象
     */
    void updateJobSettings(JobSettings jobSettings);
    
    /**
     * 删除作业设置.
     *
     * @param jobName 作业名称
     */
    void removeJobSettings(String jobName);
}
