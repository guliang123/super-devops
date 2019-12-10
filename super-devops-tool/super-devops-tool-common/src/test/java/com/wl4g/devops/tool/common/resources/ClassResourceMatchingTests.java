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
package com.wl4g.devops.tool.common.resources;

import com.wl4g.devops.tool.common.resources.ClassResourceMatchResovlerUtils;

public class ClassResourceMatchingTests {

	public static void main(String[] args) {
		// String locationPattern = "org.xerial.snappy";
		String locationPattern = "com.wl4g.devops.tool.common";
		ClassResourceMatchResovlerUtils.doSearch(locationPattern, null, (type, classLoader, pathname) -> {
			try {
				System.out.println(pathname);
				// InputStream in = classLoader.getResourceAsStream(pathname);
				// System.out.println(in.available());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}, null);
	}

}
