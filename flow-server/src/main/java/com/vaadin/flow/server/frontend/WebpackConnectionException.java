/*
 * Copyright 2000-2022 Vaadin Ltd.
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
package com.vaadin.flow.server.frontend;

/**
 * Exception thrown when webpack server doesn't respond with HTTP_OK for a
 * request.
 *
 * This exception usually means that webpack-dev-server failed compilation of
 * the frontend bundle and any error in the output should be fixed.
 * <p>
 * For internal use only. May be renamed or removed in a future release.
 */
public class WebpackConnectionException extends RuntimeException {

    /**
     * Constructs a new exception with the specified detail message.
     *
     * @param message
     *            the detailed message on the problem.
     */
    public WebpackConnectionException(String message) {
        super(message);
    }
}
