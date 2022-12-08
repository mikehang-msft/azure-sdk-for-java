// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.webpubsub.models.EventNameFilter;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class EventNameFilterTests {
    @Test
    public void testDeserialize() {
        EventNameFilter model =
            BinaryData
                .fromString("{\"type\":\"EventName\",\"systemEvents\":[\"n\"],\"userEventPattern\":\"ph\"}")
                .toObject(EventNameFilter.class);
        Assertions.assertEquals("n", model.systemEvents().get(0));
        Assertions.assertEquals("ph", model.userEventPattern());
    }

    @Test
    public void testSerialize() {
        EventNameFilter model = new EventNameFilter().withSystemEvents(Arrays.asList("n")).withUserEventPattern("ph");
        model = BinaryData.fromObject(model).toObject(EventNameFilter.class);
        Assertions.assertEquals("n", model.systemEvents().get(0));
        Assertions.assertEquals("ph", model.userEventPattern());
    }
}