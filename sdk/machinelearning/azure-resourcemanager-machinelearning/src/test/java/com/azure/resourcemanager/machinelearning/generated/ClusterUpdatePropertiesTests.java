// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.fluent.models.ClusterUpdateProperties;
import com.azure.resourcemanager.machinelearning.models.ScaleSettings;
import com.azure.resourcemanager.machinelearning.models.ScaleSettingsInformation;
import java.time.Duration;
import org.junit.jupiter.api.Assertions;

public final class ClusterUpdatePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterUpdateProperties model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"scaleSettings\":{\"maxNodeCount\":735455048,\"minNodeCount\":1281560612,\"nodeIdleTimeBeforeScaleDown\":\"PT89H36M53S\"}}}")
                .toObject(ClusterUpdateProperties.class);
        Assertions.assertEquals(735455048, model.properties().scaleSettings().maxNodeCount());
        Assertions.assertEquals(1281560612, model.properties().scaleSettings().minNodeCount());
        Assertions
            .assertEquals(
                Duration.parse("PT89H36M53S"), model.properties().scaleSettings().nodeIdleTimeBeforeScaleDown());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterUpdateProperties model =
            new ClusterUpdateProperties()
                .withProperties(
                    new ScaleSettingsInformation()
                        .withScaleSettings(
                            new ScaleSettings()
                                .withMaxNodeCount(735455048)
                                .withMinNodeCount(1281560612)
                                .withNodeIdleTimeBeforeScaleDown(Duration.parse("PT89H36M53S"))));
        model = BinaryData.fromObject(model).toObject(ClusterUpdateProperties.class);
        Assertions.assertEquals(735455048, model.properties().scaleSettings().maxNodeCount());
        Assertions.assertEquals(1281560612, model.properties().scaleSettings().minNodeCount());
        Assertions
            .assertEquals(
                Duration.parse("PT89H36M53S"), model.properties().scaleSettings().nodeIdleTimeBeforeScaleDown());
    }
}
