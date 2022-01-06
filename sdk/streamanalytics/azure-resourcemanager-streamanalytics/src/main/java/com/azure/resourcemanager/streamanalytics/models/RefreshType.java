// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RefreshType. */
public final class RefreshType extends ExpandableStringEnum<RefreshType> {
    /** Static value Static for RefreshType. */
    public static final RefreshType STATIC = fromString("Static");

    /** Static value RefreshPeriodicallyWithFull for RefreshType. */
    public static final RefreshType REFRESH_PERIODICALLY_WITH_FULL = fromString("RefreshPeriodicallyWithFull");

    /** Static value RefreshPeriodicallyWithDelta for RefreshType. */
    public static final RefreshType REFRESH_PERIODICALLY_WITH_DELTA = fromString("RefreshPeriodicallyWithDelta");

    /**
     * Creates or finds a RefreshType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RefreshType.
     */
    @JsonCreator
    public static RefreshType fromString(String name) {
        return fromString(name, RefreshType.class);
    }

    /** @return known RefreshType values. */
    public static Collection<RefreshType> values() {
        return values(RefreshType.class);
    }
}
