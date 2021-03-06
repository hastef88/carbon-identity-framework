/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.application.authentication.framework.config.model.graph;

/**
 * A virtual authentication step signifying it is an end node for an authentication graph.
 */
public class EndStep implements AuthGraphNode {

    private static final long serialVersionUID = -8969107833064916187L;
    private AuthGraphNode parentNode;

    @Override
    public String getName() {
        return null;
    }

    @Override
    public AuthGraphNode gerParent() {
        return parentNode;
    }

    @Override
    public void setParent(AuthGraphNode parentNode) {
        this.parentNode = parentNode;
    }
}
