// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.voiceservices.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The method for terminating emergency calls to the PSTN. */
public final class E911Type extends ExpandableStringEnum<E911Type> {
    /** Static value Standard for E911Type. */
    public static final E911Type STANDARD = fromString("Standard");

    /** Static value DirectToEsrp for E911Type. */
    public static final E911Type DIRECT_TO_ESRP = fromString("DirectToEsrp");

    /**
     * Creates a new instance of E911Type value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public E911Type() {
    }

    /**
     * Creates or finds a E911Type from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding E911Type.
     */
    @JsonCreator
    public static E911Type fromString(String name) {
        return fromString(name, E911Type.class);
    }

    /**
     * Gets known E911Type values.
     *
     * @return known E911Type values.
     */
    public static Collection<E911Type> values() {
        return values(E911Type.class);
    }
}
