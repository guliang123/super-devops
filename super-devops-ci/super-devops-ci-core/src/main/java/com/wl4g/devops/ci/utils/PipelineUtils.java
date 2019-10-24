/*
 * Copyright 2017 ~ 2025 the original author or authors. <wanglsir@gmail.com, 983708408@qq.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wl4g.devops.ci.utils;

import static org.apache.commons.lang3.StringUtils.EMPTY;
import static org.apache.commons.lang3.StringUtils.contains;
import static org.springframework.util.Assert.hasText;

/**
 * Pipeline utility tools.
 * 
 * @author Wangl.sir &lt;Wanglsir@gmail.com, 983708408@qq.com&gt;
 * @version v1.0.0 2019-10-24
 * @since
 */
public abstract class PipelineUtils {

	/**
	 * Get package Name from path.
	 * 
	 * @param path
	 * @return
	 */
	public static String subPackname(String path) {
		hasText(path, "Path must not be empty.");
		if (contains(path, "/")) {
			String[] a = path.split("/");
			return a[a.length - 1];
		}
		return EMPTY;
	}

	/**
	 * Get package WithOut suffix from path.
	 * 
	 * @param path
	 * @return
	 */
	public static String subPacknameWithOutPostfix(String path) {
		String a = subPackname(path);
		return a.substring(0, a.lastIndexOf("."));
	}

}
