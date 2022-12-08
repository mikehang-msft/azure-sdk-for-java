// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.fluent.models.CheckNameAvailabilityResultInner;
import org.junit.jupiter.api.Test;

public final class CheckNameAvailabilityResultInnerTests {
    @Test
    public void testDeserialize() {
        CheckNameAvailabilityResultInner model =
            BinaryData
                .fromString("{\"nameAvailable\":false,\"reason\":\"Invalid\",\"message\":\"dvjsllrmvvdf\"}")
                .toObject(CheckNameAvailabilityResultInner.class);
    }

    @Test
    public void testSerialize() {
        CheckNameAvailabilityResultInner model = new CheckNameAvailabilityResultInner();
        model = BinaryData.fromObject(model).toObject(CheckNameAvailabilityResultInner.class);
    }
}