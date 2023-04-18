// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confidentialledger.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.confidentialledger.models.Tags;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class TagsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Tags model =
            BinaryData.fromString("{\"tags\":{\"gxg\":\"gbwjzrnf\",\"fublj\":\"spemvtzfk\"}}").toObject(Tags.class);
        Assertions.assertEquals("gbwjzrnf", model.tags().get("gxg"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Tags model = new Tags().withTags(mapOf("gxg", "gbwjzrnf", "fublj", "spemvtzfk"));
        model = BinaryData.fromObject(model).toObject(Tags.class);
        Assertions.assertEquals("gbwjzrnf", model.tags().get("gxg"));
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
