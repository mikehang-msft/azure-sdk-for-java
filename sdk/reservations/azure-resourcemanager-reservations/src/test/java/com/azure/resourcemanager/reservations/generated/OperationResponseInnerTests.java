// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.reservations.fluent.models.OperationResponseInner;
import com.azure.resourcemanager.reservations.models.OperationDisplay;
import org.junit.jupiter.api.Assertions;

public final class OperationResponseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationResponseInner model =
            BinaryData
                .fromString(
                    "{\"name\":\"dkzjancuxrh\",\"isDataAction\":true,\"display\":{\"provider\":\"xbniwdjs\",\"resource\":\"tsdbpgn\",\"operation\":\"txhp\",\"description\":\"bzpfzab\"},\"origin\":\"cuh\",\"properties\":\"datatcty\"}")
                .toObject(OperationResponseInner.class);
        Assertions.assertEquals("dkzjancuxrh", model.name());
        Assertions.assertEquals(true, model.isDataAction());
        Assertions.assertEquals("xbniwdjs", model.display().provider());
        Assertions.assertEquals("tsdbpgn", model.display().resource());
        Assertions.assertEquals("txhp", model.display().operation());
        Assertions.assertEquals("bzpfzab", model.display().description());
        Assertions.assertEquals("cuh", model.origin());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationResponseInner model =
            new OperationResponseInner()
                .withName("dkzjancuxrh")
                .withIsDataAction(true)
                .withDisplay(
                    new OperationDisplay()
                        .withProvider("xbniwdjs")
                        .withResource("tsdbpgn")
                        .withOperation("txhp")
                        .withDescription("bzpfzab"))
                .withOrigin("cuh")
                .withProperties("datatcty");
        model = BinaryData.fromObject(model).toObject(OperationResponseInner.class);
        Assertions.assertEquals("dkzjancuxrh", model.name());
        Assertions.assertEquals(true, model.isDataAction());
        Assertions.assertEquals("xbniwdjs", model.display().provider());
        Assertions.assertEquals("tsdbpgn", model.display().resource());
        Assertions.assertEquals("txhp", model.display().operation());
        Assertions.assertEquals("bzpfzab", model.display().description());
        Assertions.assertEquals("cuh", model.origin());
    }
}