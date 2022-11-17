// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The UsernamePasswordAuthTypeWorkspaceConnectionProperties model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "authType")
@JsonTypeName("UsernamePassword")
@Fluent
public final class UsernamePasswordAuthTypeWorkspaceConnectionProperties extends WorkspaceConnectionPropertiesV2 {
    /*
     * The credentials property.
     */
    @JsonProperty(value = "credentials")
    private WorkspaceConnectionUsernamePassword credentials;

    /** Creates an instance of UsernamePasswordAuthTypeWorkspaceConnectionProperties class. */
    public UsernamePasswordAuthTypeWorkspaceConnectionProperties() {
    }

    /**
     * Get the credentials property: The credentials property.
     *
     * @return the credentials value.
     */
    public WorkspaceConnectionUsernamePassword credentials() {
        return this.credentials;
    }

    /**
     * Set the credentials property: The credentials property.
     *
     * @param credentials the credentials value to set.
     * @return the UsernamePasswordAuthTypeWorkspaceConnectionProperties object itself.
     */
    public UsernamePasswordAuthTypeWorkspaceConnectionProperties withCredentials(
        WorkspaceConnectionUsernamePassword credentials) {
        this.credentials = credentials;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public UsernamePasswordAuthTypeWorkspaceConnectionProperties withCategory(ConnectionCategory category) {
        super.withCategory(category);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public UsernamePasswordAuthTypeWorkspaceConnectionProperties withTarget(String target) {
        super.withTarget(target);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public UsernamePasswordAuthTypeWorkspaceConnectionProperties withValue(String value) {
        super.withValue(value);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public UsernamePasswordAuthTypeWorkspaceConnectionProperties withValueFormat(ValueFormat valueFormat) {
        super.withValueFormat(valueFormat);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (credentials() != null) {
            credentials().validate();
        }
    }
}