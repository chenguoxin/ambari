/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
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
package org.apache.ambari.infra.common;

public final class InfraManagerConstants {
  public static final int DEFAULT_PORT = 61890;
  public static final String DEFAULT_PROTOCOL = "http";
  public static final String INFRA_MANAGER_SESSION_ID = "INFRA_MANAGER_SESSIONID";
  public static final String PROTOCOL_SSL = "https";
  public static final String ROOT_CONTEXT = "/";
  public static final String WEB_RESOURCE_FOLDER = "webapp";
  public static final String DEFAULT_DATA_FOLDER_LOCATION = "/usr/ambari-infra-manager/data";
  public static final String DATA_FOLDER_LOCATION_PARAM = "dataFolderLocation";
  public static final Integer SESSION_TIMEOUT = 60 * 30;
}
