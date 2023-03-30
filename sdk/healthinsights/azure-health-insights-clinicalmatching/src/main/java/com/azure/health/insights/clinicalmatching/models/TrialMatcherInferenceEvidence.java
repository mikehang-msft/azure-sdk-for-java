// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.health.insights.clinicalmatching.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A piece of evidence corresponding to a Trial Matcher inference. */
@Immutable
public final class TrialMatcherInferenceEvidence {
    /*
     * A piece of evidence from the eligibility criteria text of a clinical trial.
     */
    @JsonProperty(value = "eligibilityCriteriaEvidence")
    private String eligibilityCriteriaEvidence;

    /*
     * A piece of evidence from a clinical note (text document).
     */
    @JsonProperty(value = "patientDataEvidence")
    private ClinicalNoteEvidence patientDataEvidence;

    /*
     * A piece of clinical information, expressed as a code in a clinical coding
     * system.
     */
    @JsonProperty(value = "patientInfoEvidence")
    private ClinicalCodedElement patientInfoEvidence;

    /*
     * A value indicating how important this piece of evidence is for the inference.
     */
    @JsonProperty(value = "importance")
    private Double importance;

    /** Creates an instance of TrialMatcherInferenceEvidence class. */
    private TrialMatcherInferenceEvidence() {}

    /**
     * Get the eligibilityCriteriaEvidence property: A piece of evidence from the eligibility criteria text of a
     * clinical trial.
     *
     * @return the eligibilityCriteriaEvidence value.
     */
    public String getEligibilityCriteriaEvidence() {
        return this.eligibilityCriteriaEvidence;
    }

    /**
     * Get the patientDataEvidence property: A piece of evidence from a clinical note (text document).
     *
     * @return the patientDataEvidence value.
     */
    public ClinicalNoteEvidence getPatientDataEvidence() {
        return this.patientDataEvidence;
    }

    /**
     * Get the patientInfoEvidence property: A piece of clinical information, expressed as a code in a clinical coding
     * system.
     *
     * @return the patientInfoEvidence value.
     */
    public ClinicalCodedElement getPatientInfoEvidence() {
        return this.patientInfoEvidence;
    }

    /**
     * Get the importance property: A value indicating how important this piece of evidence is for the inference.
     *
     * @return the importance value.
     */
    public Double getImportance() {
        return this.importance;
    }
}
