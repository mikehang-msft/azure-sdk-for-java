// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DataMaskingPolicyName. */
public final class DataMaskingPolicyName extends ExpandableStringEnum<DataMaskingPolicyName> {
    /** Static value Default for DataMaskingPolicyName. */
    public static final DataMaskingPolicyName DEFAULT = fromString("Default");

    /**
     * Creates or finds a DataMaskingPolicyName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DataMaskingPolicyName.
     */
    @JsonCreator
    public static DataMaskingPolicyName fromString(String name) {
        return fromString(name, DataMaskingPolicyName.class);
    }

    /**
     * Gets known DataMaskingPolicyName values.
     *
     * @return known DataMaskingPolicyName values.
     */
    public static Collection<DataMaskingPolicyName> values() {
        return values(DataMaskingPolicyName.class);
    }
}