// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.management.SubResource;
import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.frontdoor.fluent.models.RoutingRuleProperties;
import com.azure.resourcemanager.frontdoor.models.FrontDoorProtocol;
import com.azure.resourcemanager.frontdoor.models.RouteConfiguration;
import com.azure.resourcemanager.frontdoor.models.RoutingRuleEnabledState;
import com.azure.resourcemanager.frontdoor.models.RoutingRuleUpdateParametersWebApplicationFirewallPolicyLink;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class RoutingRulePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RoutingRuleProperties model =
            BinaryData
                .fromString(
                    "{\"resourceState\":\"Enabling\",\"frontendEndpoints\":[{\"id\":\"uvjfdxxive\"},{\"id\":\"t\"},{\"id\":\"aqtdoqmcbx\"}],\"acceptedProtocols\":[\"Http\",\"Https\"],\"patternsToMatch\":[\"qbhsfxobl\",\"tkblmpewww\"],\"enabledState\":\"Enabled\",\"routeConfiguration\":{\"@odata.type\":\"RouteConfiguration\"},\"rulesEngine\":{\"id\":\"nsvs\"},\"webApplicationFirewallPolicyLink\":{\"id\":\"ohxcrsbfova\"}}")
                .toObject(RoutingRuleProperties.class);
        Assertions.assertEquals("uvjfdxxive", model.frontendEndpoints().get(0).id());
        Assertions.assertEquals(FrontDoorProtocol.HTTP, model.acceptedProtocols().get(0));
        Assertions.assertEquals("qbhsfxobl", model.patternsToMatch().get(0));
        Assertions.assertEquals(RoutingRuleEnabledState.ENABLED, model.enabledState());
        Assertions.assertEquals("nsvs", model.rulesEngine().id());
        Assertions.assertEquals("ohxcrsbfova", model.webApplicationFirewallPolicyLink().id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RoutingRuleProperties model =
            new RoutingRuleProperties()
                .withFrontendEndpoints(
                    Arrays
                        .asList(
                            new SubResource().withId("uvjfdxxive"),
                            new SubResource().withId("t"),
                            new SubResource().withId("aqtdoqmcbx")))
                .withAcceptedProtocols(Arrays.asList(FrontDoorProtocol.HTTP, FrontDoorProtocol.HTTPS))
                .withPatternsToMatch(Arrays.asList("qbhsfxobl", "tkblmpewww"))
                .withEnabledState(RoutingRuleEnabledState.ENABLED)
                .withRouteConfiguration(new RouteConfiguration())
                .withRulesEngine(new SubResource().withId("nsvs"))
                .withWebApplicationFirewallPolicyLink(
                    new RoutingRuleUpdateParametersWebApplicationFirewallPolicyLink().withId("ohxcrsbfova"));
        model = BinaryData.fromObject(model).toObject(RoutingRuleProperties.class);
        Assertions.assertEquals("uvjfdxxive", model.frontendEndpoints().get(0).id());
        Assertions.assertEquals(FrontDoorProtocol.HTTP, model.acceptedProtocols().get(0));
        Assertions.assertEquals("qbhsfxobl", model.patternsToMatch().get(0));
        Assertions.assertEquals(RoutingRuleEnabledState.ENABLED, model.enabledState());
        Assertions.assertEquals("nsvs", model.rulesEngine().id());
        Assertions.assertEquals("ohxcrsbfova", model.webApplicationFirewallPolicyLink().id());
    }
}
