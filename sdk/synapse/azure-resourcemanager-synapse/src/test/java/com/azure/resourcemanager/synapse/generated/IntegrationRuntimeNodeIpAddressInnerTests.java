// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.fluent.models.IntegrationRuntimeNodeIpAddressInner;

public final class IntegrationRuntimeNodeIpAddressInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IntegrationRuntimeNodeIpAddressInner model =
            BinaryData.fromString("{\"ipAddress\":\"tlt\"}").toObject(IntegrationRuntimeNodeIpAddressInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IntegrationRuntimeNodeIpAddressInner model = new IntegrationRuntimeNodeIpAddressInner();
        model = BinaryData.fromObject(model).toObject(IntegrationRuntimeNodeIpAddressInner.class);
    }
}