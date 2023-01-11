// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.resourcemanager.recoveryservicessiterecovery.models.PossibleOperationsDirections;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPlanHyperVReplicaAzureFailoverInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPlanUnplannedFailoverInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPlanUnplannedFailoverInputProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.SourceSiteOperations;
import java.util.Arrays;

/** Samples for ReplicationRecoveryPlans UnplannedFailover. */
public final class ReplicationRecoveryPlansUnplannedFailoverSamples {
    /*
     * x-ms-original-file: specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2022-10-01/examples/ReplicationRecoveryPlans_UnplannedFailover.json
     */
    /**
     * Sample code: Execute unplanned failover of the recovery plan.
     *
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void executeUnplannedFailoverOfTheRecoveryPlan(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager
            .replicationRecoveryPlans()
            .unplannedFailover(
                "vault1",
                "resourceGroupPS1",
                "RPtest1",
                new RecoveryPlanUnplannedFailoverInput()
                    .withProperties(
                        new RecoveryPlanUnplannedFailoverInputProperties()
                            .withFailoverDirection(PossibleOperationsDirections.PRIMARY_TO_RECOVERY)
                            .withSourceSiteOperations(SourceSiteOperations.REQUIRED)
                            .withProviderSpecificDetails(
                                Arrays.asList(new RecoveryPlanHyperVReplicaAzureFailoverInput()))),
                com.azure.core.util.Context.NONE);
    }
}