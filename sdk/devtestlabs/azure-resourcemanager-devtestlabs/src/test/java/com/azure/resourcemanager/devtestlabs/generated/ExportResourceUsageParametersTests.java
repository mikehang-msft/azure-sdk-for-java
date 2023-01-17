// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.models.ExportResourceUsageParameters;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class ExportResourceUsageParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExportResourceUsageParameters model =
            BinaryData
                .fromString("{\"blobStorageAbsoluteSasUri\":\"qmhhaowj\",\"usageStartDate\":\"2021-02-04T20:38:24Z\"}")
                .toObject(ExportResourceUsageParameters.class);
        Assertions.assertEquals("qmhhaowj", model.blobStorageAbsoluteSasUri());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-04T20:38:24Z"), model.usageStartDate());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExportResourceUsageParameters model =
            new ExportResourceUsageParameters()
                .withBlobStorageAbsoluteSasUri("qmhhaowj")
                .withUsageStartDate(OffsetDateTime.parse("2021-02-04T20:38:24Z"));
        model = BinaryData.fromObject(model).toObject(ExportResourceUsageParameters.class);
        Assertions.assertEquals("qmhhaowj", model.blobStorageAbsoluteSasUri());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-04T20:38:24Z"), model.usageStartDate());
    }
}