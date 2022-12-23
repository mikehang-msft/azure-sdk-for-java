// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicenetworking.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for AssociationType. */
public enum AssociationType {
    /** Enum value subnets. */
    SUBNETS("subnets");

    /** The actual serialized value for a AssociationType instance. */
    private final String value;

    AssociationType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AssociationType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed AssociationType object, or null if unable to parse.
     */
    @JsonCreator
    public static AssociationType fromString(String value) {
        if (value == null) {
            return null;
        }
        AssociationType[] items = AssociationType.values();
        for (AssociationType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /** {@inheritDoc} */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}