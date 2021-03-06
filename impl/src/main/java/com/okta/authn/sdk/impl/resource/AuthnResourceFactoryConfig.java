/*
 * Copyright 2018-Present Okta, Inc.
 *
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
 */
package com.okta.authn.sdk.impl.resource;

import com.okta.sdk.impl.ds.ResourceFactoryConfig;

import java.util.Collections;
import java.util.Set;

public class AuthnResourceFactoryConfig implements ResourceFactoryConfig {

    @Override
    public Set<String> getSupportedPackages() {
        return Collections.singleton("com.okta.authn.sdk");
    }
}