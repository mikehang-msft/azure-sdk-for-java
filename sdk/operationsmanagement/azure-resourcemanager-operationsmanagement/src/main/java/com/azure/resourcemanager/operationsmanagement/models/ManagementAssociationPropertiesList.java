// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationsmanagement.models;

import com.azure.resourcemanager.operationsmanagement.fluent.models.ManagementAssociationPropertiesListInner;
import java.util.List;

/** An immutable client-side representation of ManagementAssociationPropertiesList. */
public interface ManagementAssociationPropertiesList {
    /**
     * Gets the value property: List of Management Association properties within the subscription.
     *
     * @return the value value.
     */
    List<ManagementAssociation> value();

    /**
     * Gets the inner
     * com.azure.resourcemanager.operationsmanagement.fluent.models.ManagementAssociationPropertiesListInner object.
     *
     * @return the inner object.
     */
    ManagementAssociationPropertiesListInner innerModel();
}
