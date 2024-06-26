// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.health.insights.radiologyinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Provides guide for interpretation of component result
 * Based on [FHIR Observation.referenceRange](https://www.hl7.org/fhir/R4/observation.html).
 */
@Fluent
public final class FhirR4ObservationReferenceRange {

    /*
     * Low Range, if relevant
     */
    @Generated
    @JsonProperty(value = "low")
    private FhirR4Quantity low;

    /*
     * High Range, if relevant
     */
    @Generated
    @JsonProperty(value = "high")
    private FhirR4Quantity high;

    /*
     * Reference range qualifier
     */
    @Generated
    @JsonProperty(value = "type")
    private FhirR4CodeableConcept type;

    /*
     * Reference range population
     */
    @Generated
    @JsonProperty(value = "appliesTo")
    private List<FhirR4CodeableConcept> appliesTo;

    /*
     * Applicable age range, if relevant
     */
    @Generated
    @JsonProperty(value = "age")
    private FhirR4Range age;

    /*
     * Text based reference range in an observation
     */
    @Generated
    @JsonProperty(value = "text")
    private String text;

    /**
     * Creates an instance of FhirR4ObservationReferenceRange class.
     */
    @Generated
    public FhirR4ObservationReferenceRange() {
    }

    /**
     * Get the low property: Low Range, if relevant.
     *
     * @return the low value.
     */
    @Generated
    public FhirR4Quantity getLow() {
        return this.low;
    }

    /**
     * Set the low property: Low Range, if relevant.
     *
     * @param low the low value to set.
     * @return the FhirR4ObservationReferenceRange object itself.
     */
    @Generated
    public FhirR4ObservationReferenceRange setLow(FhirR4Quantity low) {
        this.low = low;
        return this;
    }

    /**
     * Get the high property: High Range, if relevant.
     *
     * @return the high value.
     */
    @Generated
    public FhirR4Quantity getHigh() {
        return this.high;
    }

    /**
     * Set the high property: High Range, if relevant.
     *
     * @param high the high value to set.
     * @return the FhirR4ObservationReferenceRange object itself.
     */
    @Generated
    public FhirR4ObservationReferenceRange setHigh(FhirR4Quantity high) {
        this.high = high;
        return this;
    }

    /**
     * Get the type property: Reference range qualifier.
     *
     * @return the type value.
     */
    @Generated
    public FhirR4CodeableConcept getType() {
        return this.type;
    }

    /**
     * Set the type property: Reference range qualifier.
     *
     * @param type the type value to set.
     * @return the FhirR4ObservationReferenceRange object itself.
     */
    @Generated
    public FhirR4ObservationReferenceRange setType(FhirR4CodeableConcept type) {
        this.type = type;
        return this;
    }

    /**
     * Get the appliesTo property: Reference range population.
     *
     * @return the appliesTo value.
     */
    @Generated
    public List<FhirR4CodeableConcept> getAppliesTo() {
        return this.appliesTo;
    }

    /**
     * Set the appliesTo property: Reference range population.
     *
     * @param appliesTo the appliesTo value to set.
     * @return the FhirR4ObservationReferenceRange object itself.
     */
    @Generated
    public FhirR4ObservationReferenceRange setAppliesTo(List<FhirR4CodeableConcept> appliesTo) {
        this.appliesTo = appliesTo;
        return this;
    }

    /**
     * Get the age property: Applicable age range, if relevant.
     *
     * @return the age value.
     */
    @Generated
    public FhirR4Range getAge() {
        return this.age;
    }

    /**
     * Set the age property: Applicable age range, if relevant.
     *
     * @param age the age value to set.
     * @return the FhirR4ObservationReferenceRange object itself.
     */
    @Generated
    public FhirR4ObservationReferenceRange setAge(FhirR4Range age) {
        this.age = age;
        return this;
    }

    /**
     * Get the text property: Text based reference range in an observation.
     *
     * @return the text value.
     */
    @Generated
    public String getText() {
        return this.text;
    }

    /**
     * Set the text property: Text based reference range in an observation.
     *
     * @param text the text value to set.
     * @return the FhirR4ObservationReferenceRange object itself.
     */
    @Generated
    public FhirR4ObservationReferenceRange setText(String text) {
        this.text = text;
        return this;
    }
}
