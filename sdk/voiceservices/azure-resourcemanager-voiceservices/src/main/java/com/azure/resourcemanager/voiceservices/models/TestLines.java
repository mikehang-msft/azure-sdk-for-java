// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.voiceservices.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of TestLines. */
public interface TestLines {
    /**
     * List TestLine resources by CommunicationsGateway.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param communicationsGatewayName Unique identifier for this deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a TestLine list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<TestLine> listByCommunicationsGateway(String resourceGroupName, String communicationsGatewayName);

    /**
     * List TestLine resources by CommunicationsGateway.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param communicationsGatewayName Unique identifier for this deployment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a TestLine list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<TestLine> listByCommunicationsGateway(
        String resourceGroupName, String communicationsGatewayName, Context context);

    /**
     * Get a TestLine.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param communicationsGatewayName Unique identifier for this deployment.
     * @param testLineName Unique identifier for this test line.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a TestLine along with {@link Response}.
     */
    Response<TestLine> getWithResponse(
        String resourceGroupName, String communicationsGatewayName, String testLineName, Context context);

    /**
     * Get a TestLine.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param communicationsGatewayName Unique identifier for this deployment.
     * @param testLineName Unique identifier for this test line.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a TestLine.
     */
    TestLine get(String resourceGroupName, String communicationsGatewayName, String testLineName);

    /**
     * Delete a TestLine.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param communicationsGatewayName Unique identifier for this deployment.
     * @param testLineName Unique identifier for this test line.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String communicationsGatewayName, String testLineName);

    /**
     * Delete a TestLine.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param communicationsGatewayName Unique identifier for this deployment.
     * @param testLineName Unique identifier for this test line.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String communicationsGatewayName, String testLineName, Context context);

    /**
     * Get a TestLine.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a TestLine along with {@link Response}.
     */
    TestLine getById(String id);

    /**
     * Get a TestLine.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a TestLine along with {@link Response}.
     */
    Response<TestLine> getByIdWithResponse(String id, Context context);

    /**
     * Delete a TestLine.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete a TestLine.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new TestLine resource.
     *
     * @param name resource name.
     * @return the first stage of the new TestLine definition.
     */
    TestLine.DefinitionStages.Blank define(String name);
}
