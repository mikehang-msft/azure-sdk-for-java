// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.resourcemanager.machinelearning.models.QuotaBaseProperties;
import com.azure.resourcemanager.machinelearning.models.QuotaUnit;
import com.azure.resourcemanager.machinelearning.models.QuotaUpdateParameters;
import java.util.Arrays;

/** Samples for Quotas Update. */
public final class QuotasUpdateSamples {
    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/stable/2022-10-01/examples/Quota/update.json
     */
    /**
     * Sample code: update quotas.
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void updateQuotas(com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager
            .quotas()
            .updateWithResponse(
                "eastus",
                new QuotaUpdateParameters()
                    .withValue(
                        Arrays
                            .asList(
                                new QuotaBaseProperties()
                                    .withId(
                                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg/providers/Microsoft.MachineLearningServices/workspaces/demo_workspace1/quotas/Standard_DSv2_Family_Cluster_Dedicated_vCPUs")
                                    .withType("Microsoft.MachineLearningServices/workspaces/quotas")
                                    .withLimit(100L)
                                    .withUnit(QuotaUnit.COUNT),
                                new QuotaBaseProperties()
                                    .withId(
                                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg/providers/Microsoft.MachineLearningServices/workspaces/demo_workspace2/quotas/Standard_DSv2_Family_Cluster_Dedicated_vCPUs")
                                    .withType("Microsoft.MachineLearningServices/workspaces/quotas")
                                    .withLimit(200L)
                                    .withUnit(QuotaUnit.COUNT))),
                com.azure.core.util.Context.NONE);
    }
}
