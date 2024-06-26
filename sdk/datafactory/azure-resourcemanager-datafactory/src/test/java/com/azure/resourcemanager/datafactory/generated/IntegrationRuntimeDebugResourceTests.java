// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeDebugResource;
import com.azure.resourcemanager.datafactory.models.ManagedIntegrationRuntime;
import org.junit.jupiter.api.Assertions;

public final class IntegrationRuntimeDebugResourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IntegrationRuntimeDebugResource model = BinaryData.fromString(
            "{\"properties\":{\"type\":\"Managed\",\"description\":\"qwztcmwqkc\",\"\":{\"xfdeqvhpsyl\":\"datawaxfewzjkj\",\"bffmbmxz\":\"dataksh\",\"jx\":\"datargywwp\"}},\"name\":\"ptfujgicgaaoept\"}")
            .toObject(IntegrationRuntimeDebugResource.class);
        Assertions.assertEquals("ptfujgicgaaoept", model.name());
        Assertions.assertEquals("qwztcmwqkc", model.properties().description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IntegrationRuntimeDebugResource model = new IntegrationRuntimeDebugResource().withName("ptfujgicgaaoept")
            .withProperties(new ManagedIntegrationRuntime().withDescription("qwztcmwqkc"));
        model = BinaryData.fromObject(model).toObject(IntegrationRuntimeDebugResource.class);
        Assertions.assertEquals("ptfujgicgaaoept", model.name());
        Assertions.assertEquals("qwztcmwqkc", model.properties().description());
    }
}
