// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Disable protection reason. It can have values NotSpecified/MigrationComplete. */
public final class DisableProtectionReason extends ExpandableStringEnum<DisableProtectionReason> {
    /** Static value NotSpecified for DisableProtectionReason. */
    public static final DisableProtectionReason NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value MigrationComplete for DisableProtectionReason. */
    public static final DisableProtectionReason MIGRATION_COMPLETE = fromString("MigrationComplete");

    /**
     * Creates a new instance of DisableProtectionReason value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DisableProtectionReason() {
    }

    /**
     * Creates or finds a DisableProtectionReason from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DisableProtectionReason.
     */
    @JsonCreator
    public static DisableProtectionReason fromString(String name) {
        return fromString(name, DisableProtectionReason.class);
    }

    /**
     * Gets known DisableProtectionReason values.
     *
     * @return known DisableProtectionReason values.
     */
    public static Collection<DisableProtectionReason> values() {
        return values(DisableProtectionReason.class);
    }
}