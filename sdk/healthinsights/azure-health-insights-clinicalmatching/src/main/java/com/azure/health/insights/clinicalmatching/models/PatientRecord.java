// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.health.insights.clinicalmatching.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A patient record, including their clinical information and data. */
@Fluent
public final class PatientRecord {
    /*
     * A given identifier for the patient. Has to be unique across all patients in a single request.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * Patient structured information, including demographics and known structured clinical information.
     */
    @JsonProperty(value = "info")
    private PatientInfo info;

    /*
     * Patient unstructured clinical data, given as documents.
     */
    @JsonProperty(value = "data")
    private List<PatientDocument> data;

    /**
     * Creates an instance of PatientRecord class.
     *
     * @param id the id value to set.
     */
    @JsonCreator
    public PatientRecord(@JsonProperty(value = "id", required = true) String id) {
        this.id = id;
    }

    /**
     * Get the id property: A given identifier for the patient. Has to be unique across all patients in a single
     * request.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the info property: Patient structured information, including demographics and known structured clinical
     * information.
     *
     * @return the info value.
     */
    public PatientInfo getInfo() {
        return this.info;
    }

    /**
     * Set the info property: Patient structured information, including demographics and known structured clinical
     * information.
     *
     * @param info the info value to set.
     * @return the PatientRecord object itself.
     */
    public PatientRecord setInfo(PatientInfo info) {
        this.info = info;
        return this;
    }

    /**
     * Get the data property: Patient unstructured clinical data, given as documents.
     *
     * @return the data value.
     */
    public List<PatientDocument> getData() {
        return this.data;
    }

    /**
     * Set the data property: Patient unstructured clinical data, given as documents.
     *
     * @param data the data value to set.
     * @return the PatientRecord object itself.
     */
    public PatientRecord setData(List<PatientDocument> data) {
        this.data = data;
        return this;
    }
}
