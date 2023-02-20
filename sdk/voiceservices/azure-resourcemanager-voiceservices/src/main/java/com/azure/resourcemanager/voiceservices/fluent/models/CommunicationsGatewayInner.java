// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.voiceservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.voiceservices.models.AutoGeneratedDomainNameLabelScope;
import com.azure.resourcemanager.voiceservices.models.CommunicationsPlatform;
import com.azure.resourcemanager.voiceservices.models.Connectivity;
import com.azure.resourcemanager.voiceservices.models.E911Type;
import com.azure.resourcemanager.voiceservices.models.ProvisioningState;
import com.azure.resourcemanager.voiceservices.models.ServiceRegionProperties;
import com.azure.resourcemanager.voiceservices.models.Status;
import com.azure.resourcemanager.voiceservices.models.TeamsCodecs;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** A CommunicationsGateway resource. */
@Fluent
public final class CommunicationsGatewayInner extends Resource {
    /*
     * The resource-specific properties for this resource.
     */
    @JsonProperty(value = "properties")
    private CommunicationsGatewayProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of CommunicationsGatewayInner class. */
    public CommunicationsGatewayInner() {
    }

    /**
     * Get the innerProperties property: The resource-specific properties for this resource.
     *
     * @return the innerProperties value.
     */
    private CommunicationsGatewayProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public CommunicationsGatewayInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CommunicationsGatewayInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: Resource provisioning state.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the status property: The current status of the deployment.
     *
     * @return the status value.
     */
    public Status status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Get the serviceLocations property: The regions in which to deploy the resources needed for Teams Calling.
     *
     * @return the serviceLocations value.
     */
    public List<ServiceRegionProperties> serviceLocations() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceLocations();
    }

    /**
     * Set the serviceLocations property: The regions in which to deploy the resources needed for Teams Calling.
     *
     * @param serviceLocations the serviceLocations value to set.
     * @return the CommunicationsGatewayInner object itself.
     */
    public CommunicationsGatewayInner withServiceLocations(List<ServiceRegionProperties> serviceLocations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CommunicationsGatewayProperties();
        }
        this.innerProperties().withServiceLocations(serviceLocations);
        return this;
    }

    /**
     * Get the connectivity property: How to connect back to the operator network, e.g. MAPS.
     *
     * @return the connectivity value.
     */
    public Connectivity connectivity() {
        return this.innerProperties() == null ? null : this.innerProperties().connectivity();
    }

    /**
     * Set the connectivity property: How to connect back to the operator network, e.g. MAPS.
     *
     * @param connectivity the connectivity value to set.
     * @return the CommunicationsGatewayInner object itself.
     */
    public CommunicationsGatewayInner withConnectivity(Connectivity connectivity) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CommunicationsGatewayProperties();
        }
        this.innerProperties().withConnectivity(connectivity);
        return this;
    }

    /**
     * Get the codecs property: Voice codecs to support.
     *
     * @return the codecs value.
     */
    public List<TeamsCodecs> codecs() {
        return this.innerProperties() == null ? null : this.innerProperties().codecs();
    }

    /**
     * Set the codecs property: Voice codecs to support.
     *
     * @param codecs the codecs value to set.
     * @return the CommunicationsGatewayInner object itself.
     */
    public CommunicationsGatewayInner withCodecs(List<TeamsCodecs> codecs) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CommunicationsGatewayProperties();
        }
        this.innerProperties().withCodecs(codecs);
        return this;
    }

    /**
     * Get the e911Type property: How to handle 911 calls.
     *
     * @return the e911Type value.
     */
    public E911Type e911Type() {
        return this.innerProperties() == null ? null : this.innerProperties().e911Type();
    }

    /**
     * Set the e911Type property: How to handle 911 calls.
     *
     * @param e911Type the e911Type value to set.
     * @return the CommunicationsGatewayInner object itself.
     */
    public CommunicationsGatewayInner withE911Type(E911Type e911Type) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CommunicationsGatewayProperties();
        }
        this.innerProperties().withE911Type(e911Type);
        return this;
    }

    /**
     * Get the platforms property: What platforms to support.
     *
     * @return the platforms value.
     */
    public List<CommunicationsPlatform> platforms() {
        return this.innerProperties() == null ? null : this.innerProperties().platforms();
    }

    /**
     * Set the platforms property: What platforms to support.
     *
     * @param platforms the platforms value to set.
     * @return the CommunicationsGatewayInner object itself.
     */
    public CommunicationsGatewayInner withPlatforms(List<CommunicationsPlatform> platforms) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CommunicationsGatewayProperties();
        }
        this.innerProperties().withPlatforms(platforms);
        return this;
    }

    /**
     * Get the apiBridge property: Details of API bridge functionality, if required.
     *
     * @return the apiBridge value.
     */
    public Object apiBridge() {
        return this.innerProperties() == null ? null : this.innerProperties().apiBridge();
    }

    /**
     * Set the apiBridge property: Details of API bridge functionality, if required.
     *
     * @param apiBridge the apiBridge value to set.
     * @return the CommunicationsGatewayInner object itself.
     */
    public CommunicationsGatewayInner withApiBridge(Object apiBridge) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CommunicationsGatewayProperties();
        }
        this.innerProperties().withApiBridge(apiBridge);
        return this;
    }

    /**
     * Get the autoGeneratedDomainNameLabelScope property: The scope at which the auto-generated domain name can be
     * re-used.
     *
     * @return the autoGeneratedDomainNameLabelScope value.
     */
    public AutoGeneratedDomainNameLabelScope autoGeneratedDomainNameLabelScope() {
        return this.innerProperties() == null ? null : this.innerProperties().autoGeneratedDomainNameLabelScope();
    }

    /**
     * Set the autoGeneratedDomainNameLabelScope property: The scope at which the auto-generated domain name can be
     * re-used.
     *
     * @param autoGeneratedDomainNameLabelScope the autoGeneratedDomainNameLabelScope value to set.
     * @return the CommunicationsGatewayInner object itself.
     */
    public CommunicationsGatewayInner withAutoGeneratedDomainNameLabelScope(
        AutoGeneratedDomainNameLabelScope autoGeneratedDomainNameLabelScope) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CommunicationsGatewayProperties();
        }
        this.innerProperties().withAutoGeneratedDomainNameLabelScope(autoGeneratedDomainNameLabelScope);
        return this;
    }

    /**
     * Get the autoGeneratedDomainNameLabel property: The autogenerated label used as part of the FQDNs for accessing
     * the Communications Gateway.
     *
     * @return the autoGeneratedDomainNameLabel value.
     */
    public String autoGeneratedDomainNameLabel() {
        return this.innerProperties() == null ? null : this.innerProperties().autoGeneratedDomainNameLabel();
    }

    /**
     * Get the teamsVoicemailPilotNumber property: This number is used in Teams Phone Mobile scenarios for access to the
     * voicemail IVR from the native dialer.
     *
     * @return the teamsVoicemailPilotNumber value.
     */
    public String teamsVoicemailPilotNumber() {
        return this.innerProperties() == null ? null : this.innerProperties().teamsVoicemailPilotNumber();
    }

    /**
     * Set the teamsVoicemailPilotNumber property: This number is used in Teams Phone Mobile scenarios for access to the
     * voicemail IVR from the native dialer.
     *
     * @param teamsVoicemailPilotNumber the teamsVoicemailPilotNumber value to set.
     * @return the CommunicationsGatewayInner object itself.
     */
    public CommunicationsGatewayInner withTeamsVoicemailPilotNumber(String teamsVoicemailPilotNumber) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CommunicationsGatewayProperties();
        }
        this.innerProperties().withTeamsVoicemailPilotNumber(teamsVoicemailPilotNumber);
        return this;
    }

    /**
     * Get the onPremMcpEnabled property: Whether an on-premises Mobile Control Point is in use.
     *
     * @return the onPremMcpEnabled value.
     */
    public Boolean onPremMcpEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().onPremMcpEnabled();
    }

    /**
     * Set the onPremMcpEnabled property: Whether an on-premises Mobile Control Point is in use.
     *
     * @param onPremMcpEnabled the onPremMcpEnabled value to set.
     * @return the CommunicationsGatewayInner object itself.
     */
    public CommunicationsGatewayInner withOnPremMcpEnabled(Boolean onPremMcpEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CommunicationsGatewayProperties();
        }
        this.innerProperties().withOnPremMcpEnabled(onPremMcpEnabled);
        return this;
    }

    /**
     * Get the emergencyDialStrings property: A list of dial strings used for emergency calling.
     *
     * @return the emergencyDialStrings value.
     */
    public List<String> emergencyDialStrings() {
        return this.innerProperties() == null ? null : this.innerProperties().emergencyDialStrings();
    }

    /**
     * Set the emergencyDialStrings property: A list of dial strings used for emergency calling.
     *
     * @param emergencyDialStrings the emergencyDialStrings value to set.
     * @return the CommunicationsGatewayInner object itself.
     */
    public CommunicationsGatewayInner withEmergencyDialStrings(List<String> emergencyDialStrings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CommunicationsGatewayProperties();
        }
        this.innerProperties().withEmergencyDialStrings(emergencyDialStrings);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
