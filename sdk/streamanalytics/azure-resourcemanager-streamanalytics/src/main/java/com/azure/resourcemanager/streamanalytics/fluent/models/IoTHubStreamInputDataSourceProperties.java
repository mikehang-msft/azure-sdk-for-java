// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties that are associated with a IoT Hub input containing stream data. */
@Fluent
public final class IoTHubStreamInputDataSourceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IoTHubStreamInputDataSourceProperties.class);

    /*
     * The name or the URI of the IoT Hub. Required on PUT (CreateOrReplace)
     * requests.
     */
    @JsonProperty(value = "iotHubNamespace")
    private String iotHubNamespace;

    /*
     * The shared access policy name for the IoT Hub. This policy must contain
     * at least the Service connect permission. Required on PUT
     * (CreateOrReplace) requests.
     */
    @JsonProperty(value = "sharedAccessPolicyName")
    private String sharedAccessPolicyName;

    /*
     * The shared access policy key for the specified shared access policy.
     * Required on PUT (CreateOrReplace) requests.
     */
    @JsonProperty(value = "sharedAccessPolicyKey")
    private String sharedAccessPolicyKey;

    /*
     * The name of an IoT Hub Consumer Group that should be used to read events
     * from the IoT Hub. If not specified, the input uses the Iot Hub’s default
     * consumer group.
     */
    @JsonProperty(value = "consumerGroupName")
    private String consumerGroupName;

    /*
     * The IoT Hub endpoint to connect to (ie. messages/events,
     * messages/operationsMonitoringEvents, etc.).
     */
    @JsonProperty(value = "endpoint")
    private String endpoint;

    /**
     * Get the iotHubNamespace property: The name or the URI of the IoT Hub. Required on PUT (CreateOrReplace) requests.
     *
     * @return the iotHubNamespace value.
     */
    public String iotHubNamespace() {
        return this.iotHubNamespace;
    }

    /**
     * Set the iotHubNamespace property: The name or the URI of the IoT Hub. Required on PUT (CreateOrReplace) requests.
     *
     * @param iotHubNamespace the iotHubNamespace value to set.
     * @return the IoTHubStreamInputDataSourceProperties object itself.
     */
    public IoTHubStreamInputDataSourceProperties withIotHubNamespace(String iotHubNamespace) {
        this.iotHubNamespace = iotHubNamespace;
        return this;
    }

    /**
     * Get the sharedAccessPolicyName property: The shared access policy name for the IoT Hub. This policy must contain
     * at least the Service connect permission. Required on PUT (CreateOrReplace) requests.
     *
     * @return the sharedAccessPolicyName value.
     */
    public String sharedAccessPolicyName() {
        return this.sharedAccessPolicyName;
    }

    /**
     * Set the sharedAccessPolicyName property: The shared access policy name for the IoT Hub. This policy must contain
     * at least the Service connect permission. Required on PUT (CreateOrReplace) requests.
     *
     * @param sharedAccessPolicyName the sharedAccessPolicyName value to set.
     * @return the IoTHubStreamInputDataSourceProperties object itself.
     */
    public IoTHubStreamInputDataSourceProperties withSharedAccessPolicyName(String sharedAccessPolicyName) {
        this.sharedAccessPolicyName = sharedAccessPolicyName;
        return this;
    }

    /**
     * Get the sharedAccessPolicyKey property: The shared access policy key for the specified shared access policy.
     * Required on PUT (CreateOrReplace) requests.
     *
     * @return the sharedAccessPolicyKey value.
     */
    public String sharedAccessPolicyKey() {
        return this.sharedAccessPolicyKey;
    }

    /**
     * Set the sharedAccessPolicyKey property: The shared access policy key for the specified shared access policy.
     * Required on PUT (CreateOrReplace) requests.
     *
     * @param sharedAccessPolicyKey the sharedAccessPolicyKey value to set.
     * @return the IoTHubStreamInputDataSourceProperties object itself.
     */
    public IoTHubStreamInputDataSourceProperties withSharedAccessPolicyKey(String sharedAccessPolicyKey) {
        this.sharedAccessPolicyKey = sharedAccessPolicyKey;
        return this;
    }

    /**
     * Get the consumerGroupName property: The name of an IoT Hub Consumer Group that should be used to read events from
     * the IoT Hub. If not specified, the input uses the Iot Hub’s default consumer group.
     *
     * @return the consumerGroupName value.
     */
    public String consumerGroupName() {
        return this.consumerGroupName;
    }

    /**
     * Set the consumerGroupName property: The name of an IoT Hub Consumer Group that should be used to read events from
     * the IoT Hub. If not specified, the input uses the Iot Hub’s default consumer group.
     *
     * @param consumerGroupName the consumerGroupName value to set.
     * @return the IoTHubStreamInputDataSourceProperties object itself.
     */
    public IoTHubStreamInputDataSourceProperties withConsumerGroupName(String consumerGroupName) {
        this.consumerGroupName = consumerGroupName;
        return this;
    }

    /**
     * Get the endpoint property: The IoT Hub endpoint to connect to (ie. messages/events,
     * messages/operationsMonitoringEvents, etc.).
     *
     * @return the endpoint value.
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Set the endpoint property: The IoT Hub endpoint to connect to (ie. messages/events,
     * messages/operationsMonitoringEvents, etc.).
     *
     * @param endpoint the endpoint value to set.
     * @return the IoTHubStreamInputDataSourceProperties object itself.
     */
    public IoTHubStreamInputDataSourceProperties withEndpoint(String endpoint) {
        this.endpoint = endpoint;
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
