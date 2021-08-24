/*
 * Copyright 2000-2021 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.vaadin.base.devserver.stats;

public class StatisticsConstants {

    /*
     * Client-side statistics parameter.
     */
    public static final String CLIENT_USAGE_DATA = "vaadin_telemetry_data";

    /*
     * Name of the default JSON file containing all the statistics.
     */
    static final String STATISTICS_FILE_NAME = "usage-statistics.json";

    /*
     * Meta fields for reporting and scheduling.
     */
    static final String FIELD_LAST_SENT = "lastSent";
    static final String FIELD_LAST_STATUS = "lastSendStatus";
    static final String FIELD_SEND_INTERVAL = "reportInterval";
    static final String FIELD_SERVER_MESSAGE = "serverMessage";

    /*
     * Data fields.
     */
    static final String FIELD_PROJECT_ID = "id";
    static final String FIELD_PROJECT_DEVMODE_STARTS = "devModeStarts";
    static final String FIELD_PROJECT_DEVMODE_RELOADS = "devModeReloads";
    static final String FIELD_OPEARATING_SYSTEM = "os";
    static final String FIELD_JVM = "jvm";
    static final String FIELD_FLOW_VERSION = "flowVersion";
    static final String FIELD_SOURCE_ID = "sourceId";
    static final String FIELD_PROKEY = "proKey";
    static final String FIELD_USER_KEY = "userKey";
    static final String FIELD_PROJECTS = "projects";
    static final String VAADIN_PROJECT_SOURCE_TEXT = "Vaadin project from";

    /*
     * Default data values and limits.
     */
    static final String MISSING_DATA = "[NA]";
    static final String DEFAULT_PROJECT_ID = "default-project-id";
    static final String GENERATED_USERNAME = "GENERATED";
    static final long TIME_SEC_12H = 43200L;
    static final long TIME_SEC_24H = 86400L;
    static final long TIME_SEC_30D = 2592000L;
    static final int MAX_TELEMETRY_LENGTH = 1024 * 1000; // 1MB maximum data
    static final String INVALID_SERVER_RESPONSE = "Invalid server response.";

    /*
     *  Default remote URL.
     */
    static final String USAGE_REPORT_URL = "https://tools.vaadin.com/usage-stats/v2/submit";

    /*
     * External parameters and file names.
     */
    static final String PROPERTY_USER_HOME = "user.home";
    static final String VAADIN_FOLDER_NAME = ".vaadin";
    static final String PRO_KEY_FILE_NAME = "proKey";
    static final String USER_KEY_FILE_NAME = "userKey";

}
