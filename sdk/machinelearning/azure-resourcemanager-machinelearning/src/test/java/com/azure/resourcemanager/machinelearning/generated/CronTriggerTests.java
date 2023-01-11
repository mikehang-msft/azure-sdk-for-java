// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.CronTrigger;
import org.junit.jupiter.api.Assertions;

public final class CronTriggerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CronTrigger model =
            BinaryData
                .fromString(
                    "{\"triggerType\":\"Cron\",\"expression\":\"ksrl\",\"endTime\":\"desqplpvmjcdo\",\"startTime\":\"bidyv\",\"timeZone\":\"owx\"}")
                .toObject(CronTrigger.class);
        Assertions.assertEquals("desqplpvmjcdo", model.endTime());
        Assertions.assertEquals("bidyv", model.startTime());
        Assertions.assertEquals("owx", model.timeZone());
        Assertions.assertEquals("ksrl", model.expression());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CronTrigger model =
            new CronTrigger()
                .withEndTime("desqplpvmjcdo")
                .withStartTime("bidyv")
                .withTimeZone("owx")
                .withExpression("ksrl");
        model = BinaryData.fromObject(model).toObject(CronTrigger.class);
        Assertions.assertEquals("desqplpvmjcdo", model.endTime());
        Assertions.assertEquals("bidyv", model.startTime());
        Assertions.assertEquals("owx", model.timeZone());
        Assertions.assertEquals("ksrl", model.expression());
    }
}
