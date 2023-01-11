// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Current state the recommended action is in. Some commonly used states are: Active -&gt; recommended action is active
 * and no action has been taken yet. Pending -&gt; recommended action is approved for and is awaiting execution.
 * Executing -&gt; recommended action is being applied on the user database. Verifying -&gt; recommended action was
 * applied and is being verified of its usefulness by the system. Success -&gt; recommended action was applied and
 * improvement found during verification. Pending Revert -&gt; verification found little or no improvement so
 * recommended action is queued for revert or user has manually reverted. Reverting -&gt; changes made while applying
 * recommended action are being reverted on the user database. Reverted -&gt; successfully reverted the changes made by
 * recommended action on user database. Ignored -&gt; user explicitly ignored/discarded the recommended action.
 */
public final class RecommendedActionCurrentState extends ExpandableStringEnum<RecommendedActionCurrentState> {
    /** Static value Active for RecommendedActionCurrentState. */
    public static final RecommendedActionCurrentState ACTIVE = fromString("Active");

    /** Static value Pending for RecommendedActionCurrentState. */
    public static final RecommendedActionCurrentState PENDING = fromString("Pending");

    /** Static value Executing for RecommendedActionCurrentState. */
    public static final RecommendedActionCurrentState EXECUTING = fromString("Executing");

    /** Static value Verifying for RecommendedActionCurrentState. */
    public static final RecommendedActionCurrentState VERIFYING = fromString("Verifying");

    /** Static value PendingRevert for RecommendedActionCurrentState. */
    public static final RecommendedActionCurrentState PENDING_REVERT = fromString("PendingRevert");

    /** Static value RevertCancelled for RecommendedActionCurrentState. */
    public static final RecommendedActionCurrentState REVERT_CANCELLED = fromString("RevertCancelled");

    /** Static value Reverting for RecommendedActionCurrentState. */
    public static final RecommendedActionCurrentState REVERTING = fromString("Reverting");

    /** Static value Reverted for RecommendedActionCurrentState. */
    public static final RecommendedActionCurrentState REVERTED = fromString("Reverted");

    /** Static value Ignored for RecommendedActionCurrentState. */
    public static final RecommendedActionCurrentState IGNORED = fromString("Ignored");

    /** Static value Expired for RecommendedActionCurrentState. */
    public static final RecommendedActionCurrentState EXPIRED = fromString("Expired");

    /** Static value Monitoring for RecommendedActionCurrentState. */
    public static final RecommendedActionCurrentState MONITORING = fromString("Monitoring");

    /** Static value Resolved for RecommendedActionCurrentState. */
    public static final RecommendedActionCurrentState RESOLVED = fromString("Resolved");

    /** Static value Success for RecommendedActionCurrentState. */
    public static final RecommendedActionCurrentState SUCCESS = fromString("Success");

    /** Static value Error for RecommendedActionCurrentState. */
    public static final RecommendedActionCurrentState ERROR = fromString("Error");

    /**
     * Creates or finds a RecommendedActionCurrentState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RecommendedActionCurrentState.
     */
    @JsonCreator
    public static RecommendedActionCurrentState fromString(String name) {
        return fromString(name, RecommendedActionCurrentState.class);
    }

    /**
     * Gets known RecommendedActionCurrentState values.
     *
     * @return known RecommendedActionCurrentState values.
     */
    public static Collection<RecommendedActionCurrentState> values() {
        return values(RecommendedActionCurrentState.class);
    }
}