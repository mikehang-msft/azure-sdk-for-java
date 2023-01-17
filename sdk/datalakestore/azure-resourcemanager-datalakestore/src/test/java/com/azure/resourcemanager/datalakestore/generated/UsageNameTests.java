// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datalakestore.models.UsageName;

public final class UsageNameTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UsageName model =
            BinaryData
                .fromString("{\"value\":\"mjmvxieduugidyjr\",\"localizedValue\":\"byao\"}")
                .toObject(UsageName.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UsageName model = new UsageName();
        model = BinaryData.fromObject(model).toObject(UsageName.class);
    }
}