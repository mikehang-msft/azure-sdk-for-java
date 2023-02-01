// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicefabric.fluent.models.ApplicationResourceInner;
import com.azure.resourcemanager.servicefabric.fluent.models.ApplicationResourceListInner;
import com.azure.resourcemanager.servicefabric.models.ManagedIdentity;
import com.azure.resourcemanager.servicefabric.models.ManagedIdentityType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ApplicationResourceListInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApplicationResourceListInner model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"identity\":{\"principalId\":\"jewgdrjerv\",\"tenantId\":\"enq\",\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{}},\"properties\":{\"provisioningState\":\"oygmift\",\"typeName\":\"zdnds\",\"typeVersion\":\"nayqi\",\"parameters\":{},\"minimumNodes\":7110253066335366033,\"maximumNodes\":3972584781562834775,\"removeApplicationCapacity\":false,\"metrics\":[],\"managedIdentities\":[]},\"location\":\"umaq\",\"tags\":{\"ertgccymva\":\"gycdu\",\"ssl\":\"l\",\"d\":\"lfmmdnbbglzpswi\",\"bzmnvdfznud\":\"cwyhzdxssa\"},\"etag\":\"dvxzbncblylpst\",\"id\":\"hh\",\"name\":\"srzdzucerscdn\",\"type\":\"nevf\"}],\"nextLink\":\"jmygtdsslswtmwer\"}")
                .toObject(ApplicationResourceListInner.class);
        Assertions.assertEquals(ManagedIdentityType.SYSTEM_ASSIGNED, model.value().get(0).identity().type());
        Assertions.assertEquals("umaq", model.value().get(0).location());
        Assertions.assertEquals("gycdu", model.value().get(0).tags().get("ertgccymva"));
        Assertions.assertEquals("zdnds", model.value().get(0).typeName());
        Assertions.assertEquals("nayqi", model.value().get(0).typeVersion());
        Assertions.assertEquals(7110253066335366033L, model.value().get(0).minimumNodes());
        Assertions.assertEquals(3972584781562834775L, model.value().get(0).maximumNodes());
        Assertions.assertEquals(false, model.value().get(0).removeApplicationCapacity());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApplicationResourceListInner model =
            new ApplicationResourceListInner()
                .withValue(
                    Arrays
                        .asList(
                            new ApplicationResourceInner()
                                .withIdentity(
                                    new ManagedIdentity()
                                        .withType(ManagedIdentityType.SYSTEM_ASSIGNED)
                                        .withUserAssignedIdentities(mapOf()))
                                .withLocation("umaq")
                                .withTags(
                                    mapOf(
                                        "ertgccymva",
                                        "gycdu",
                                        "ssl",
                                        "l",
                                        "d",
                                        "lfmmdnbbglzpswi",
                                        "bzmnvdfznud",
                                        "cwyhzdxssa"))
                                .withTypeName("zdnds")
                                .withTypeVersion("nayqi")
                                .withParameters(mapOf())
                                .withMinimumNodes(7110253066335366033L)
                                .withMaximumNodes(3972584781562834775L)
                                .withRemoveApplicationCapacity(false)
                                .withMetrics(Arrays.asList())
                                .withManagedIdentities(Arrays.asList())));
        model = BinaryData.fromObject(model).toObject(ApplicationResourceListInner.class);
        Assertions.assertEquals(ManagedIdentityType.SYSTEM_ASSIGNED, model.value().get(0).identity().type());
        Assertions.assertEquals("umaq", model.value().get(0).location());
        Assertions.assertEquals("gycdu", model.value().get(0).tags().get("ertgccymva"));
        Assertions.assertEquals("zdnds", model.value().get(0).typeName());
        Assertions.assertEquals("nayqi", model.value().get(0).typeVersion());
        Assertions.assertEquals(7110253066335366033L, model.value().get(0).minimumNodes());
        Assertions.assertEquals(3972584781562834775L, model.value().get(0).maximumNodes());
        Assertions.assertEquals(false, model.value().get(0).removeApplicationCapacity());
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