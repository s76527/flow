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

package com.vaadin.flow.uitest.ui;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import com.vaadin.flow.component.html.testbench.NativeButtonElement;
import com.vaadin.flow.testutil.ChromeBrowserTest;

public class LogoutWithNotificationIT extends ChromeBrowserTest {

    @Override
    protected String getTestPath() {
        return "/logout-with-notification/logout-with-notification-view";
    }

    @Test
    public void setLocationWithNotificationEnabled_noErrorMessages() {
        open();

        $(NativeButtonElement.class).first().click();

        // There can be "Session Expired" message because of heartbeat
        // Strings defined in com.vaadin.flow.server.SystemMessages
        checkLogsForErrors(msg -> msg.contains("Session Expired")
                || msg.contains("Take note of any unsaved data, and <u>click "
                        + "here</u> or press ESC key to continue."));

        // There can't be any error dialog
        Assert.assertFalse(isElementPresent(By.className("v-system-error")));

        // Another view with span element should be shown
        waitForElementPresent(By.id("redirect-target-span"));
    }
}
