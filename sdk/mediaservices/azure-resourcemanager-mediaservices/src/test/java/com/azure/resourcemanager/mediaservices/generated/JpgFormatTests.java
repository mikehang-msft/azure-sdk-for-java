// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.JpgFormat;
import org.junit.jupiter.api.Assertions;

public final class JpgFormatTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JpgFormat model =
            BinaryData
                .fromString("{\"@odata.type\":\"#Microsoft.Media.JpgFormat\",\"filenamePattern\":\"jglikkxwslolb\"}")
                .toObject(JpgFormat.class);
        Assertions.assertEquals("jglikkxwslolb", model.filenamePattern());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JpgFormat model = new JpgFormat().withFilenamePattern("jglikkxwslolb");
        model = BinaryData.fromObject(model).toObject(JpgFormat.class);
        Assertions.assertEquals("jglikkxwslolb", model.filenamePattern());
    }
}