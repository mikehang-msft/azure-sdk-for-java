// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for EarlyTerminationPolicyType. */
public final class EarlyTerminationPolicyType extends ExpandableStringEnum<EarlyTerminationPolicyType> {
    /** Static value Bandit for EarlyTerminationPolicyType. */
    public static final EarlyTerminationPolicyType BANDIT = fromString("Bandit");

    /** Static value MedianStopping for EarlyTerminationPolicyType. */
    public static final EarlyTerminationPolicyType MEDIAN_STOPPING = fromString("MedianStopping");

    /** Static value TruncationSelection for EarlyTerminationPolicyType. */
    public static final EarlyTerminationPolicyType TRUNCATION_SELECTION = fromString("TruncationSelection");

    /**
     * Creates a new instance of EarlyTerminationPolicyType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public EarlyTerminationPolicyType() {
    }

    /**
     * Creates or finds a EarlyTerminationPolicyType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EarlyTerminationPolicyType.
     */
    @JsonCreator
    public static EarlyTerminationPolicyType fromString(String name) {
        return fromString(name, EarlyTerminationPolicyType.class);
    }

    /**
     * Gets known EarlyTerminationPolicyType values.
     *
     * @return known EarlyTerminationPolicyType values.
     */
    public static Collection<EarlyTerminationPolicyType> values() {
        return values(EarlyTerminationPolicyType.class);
    }
}
