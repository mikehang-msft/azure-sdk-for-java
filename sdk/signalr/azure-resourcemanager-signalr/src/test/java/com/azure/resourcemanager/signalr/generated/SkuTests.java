// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.signalr.models.Sku;
import org.junit.jupiter.api.Test;

public final class SkuTests {
    @Test
    public void testDeserialize() {
        Sku model =
            BinaryData
                .fromString(
                    "{\"resourceType\":\"bzyh\",\"sku\":{\"name\":\"tsmypyynpcdp\",\"tier\":\"Standard\",\"size\":\"g\",\"family\":\"z\",\"capacity\":1417683929},\"capacity\":{\"minimum\":859745448,\"maximum\":1095888431,\"default\":1347586165,\"allowedValues\":[1287311603,1807799282],\"scaleType\":\"Automatic\"}}")
                .toObject(Sku.class);
    }

    @Test
    public void testSerialize() {
        Sku model = new Sku();
        model = BinaryData.fromObject(model).toObject(Sku.class);
    }
}