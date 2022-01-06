// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parameters supplied to the Scale Streaming Job operation. */
@Fluent
public final class ScaleStreamingJobParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ScaleStreamingJobParameters.class);

    /*
     * Specifies the number of streaming units that the streaming job will
     * scale to.
     */
    @JsonProperty(value = "streamingUnits")
    private Integer streamingUnits;

    /**
     * Get the streamingUnits property: Specifies the number of streaming units that the streaming job will scale to.
     *
     * @return the streamingUnits value.
     */
    public Integer streamingUnits() {
        return this.streamingUnits;
    }

    /**
     * Set the streamingUnits property: Specifies the number of streaming units that the streaming job will scale to.
     *
     * @param streamingUnits the streamingUnits value to set.
     * @return the ScaleStreamingJobParameters object itself.
     */
    public ScaleStreamingJobParameters withStreamingUnits(Integer streamingUnits) {
        this.streamingUnits = streamingUnits;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
