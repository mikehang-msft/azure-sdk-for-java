// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.generated;

import com.azure.resourcemanager.streamanalytics.models.PrivateLinkServiceConnection;
import java.util.Arrays;

/** Samples for PrivateEndpoints CreateOrUpdate. */
public final class PrivateEndpointsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/streamanalytics/resource-manager/Microsoft.StreamAnalytics/stable/2020-03-01/examples/PrivateEndpoint_Create.json
     */
    /**
     * Sample code: Create a private endpoint.
     *
     * @param manager Entry point to StreamAnalyticsManager.
     */
    public static void createAPrivateEndpoint(
        com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager manager) {
        manager
            .privateEndpoints()
            .define("testpe")
            .withExistingCluster("sjrg", "testcluster")
            .withManualPrivateLinkServiceConnections(
                Arrays
                    .asList(
                        new PrivateLinkServiceConnection()
                            .withPrivateLinkServiceId(
                                "/subscriptions/subId/resourceGroups/rg1/providers/Microsoft.Network/privateLinkServices/testPls")
                            .withGroupIds(Arrays.asList("groupIdFromResource"))))
            .create();
    }
}
