// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

/** Samples for WorkflowTriggers ListCallbackUrl. */
public final class WorkflowTriggersListCallbackUrlSamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/WorkflowTriggers_ListCallbackUrl.json
     */
    /**
     * Sample code: Get the callback URL for a trigger.
     *
     * @param manager Entry point to LogicManager.
     */
    public static void getTheCallbackURLForATrigger(com.azure.resourcemanager.logic.LogicManager manager) {
        manager
            .workflowTriggers()
            .listCallbackUrlWithResponse(
                "test-resource-group", "test-workflow", "manual", com.azure.core.util.Context.NONE);
    }
}