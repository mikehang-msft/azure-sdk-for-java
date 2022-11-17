// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.fluent.models.DatastoreInner;
import com.azure.resourcemanager.machinelearning.models.DatastoreProperties;
import com.azure.resourcemanager.machinelearning.models.DatastoreResourceArmPaginatedResult;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DatastoreResourceArmPaginatedResultTests {
    @Test
    public void testDeserialize() {
        DatastoreResourceArmPaginatedResult model =
            BinaryData
                .fromString(
                    "{\"nextLink\":\"fmluiqtqzfavyvn\",\"value\":[{\"properties\":{\"datastoreType\":\"DatastoreProperties\",\"isDefault\":false,\"description\":\"yeua\",\"properties\":{},\"tags\":{}},\"id\":\"abqgzslesjcbh\",\"name\":\"rnntiewdjcv\",\"type\":\"quwrbehwag\"}]}")
                .toObject(DatastoreResourceArmPaginatedResult.class);
        Assertions.assertEquals("fmluiqtqzfavyvn", model.nextLink());
        Assertions.assertEquals("yeua", model.value().get(0).properties().description());
    }

    @Test
    public void testSerialize() {
        DatastoreResourceArmPaginatedResult model =
            new DatastoreResourceArmPaginatedResult()
                .withNextLink("fmluiqtqzfavyvn")
                .withValue(
                    Arrays
                        .asList(
                            new DatastoreInner()
                                .withProperties(
                                    new DatastoreProperties()
                                        .withDescription("yeua")
                                        .withProperties(mapOf())
                                        .withTags(mapOf()))));
        model = BinaryData.fromObject(model).toObject(DatastoreResourceArmPaginatedResult.class);
        Assertions.assertEquals("fmluiqtqzfavyvn", model.nextLink());
        Assertions.assertEquals("yeua", model.value().get(0).properties().description());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}