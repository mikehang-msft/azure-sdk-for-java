// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Provider specific input for apply recovery point. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "instanceType",
    defaultImpl = ApplyRecoveryPointProviderSpecificInput.class)
@JsonTypeName("ApplyRecoveryPointProviderSpecificInput")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "A2A", value = A2AApplyRecoveryPointInput.class),
    @JsonSubTypes.Type(
        name = "A2ACrossClusterMigration",
        value = A2ACrossClusterMigrationApplyRecoveryPointInput.class),
    @JsonSubTypes.Type(name = "HyperVReplicaAzure", value = HyperVReplicaAzureApplyRecoveryPointInput.class),
    @JsonSubTypes.Type(name = "InMageAzureV2", value = InMageAzureV2ApplyRecoveryPointInput.class),
    @JsonSubTypes.Type(name = "InMageRcm", value = InMageRcmApplyRecoveryPointInput.class)
})
@Immutable
public class ApplyRecoveryPointProviderSpecificInput {
    /** Creates an instance of ApplyRecoveryPointProviderSpecificInput class. */
    public ApplyRecoveryPointProviderSpecificInput() {
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}