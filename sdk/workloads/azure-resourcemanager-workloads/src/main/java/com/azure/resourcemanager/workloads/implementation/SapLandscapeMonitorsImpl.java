// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.workloads.fluent.SapLandscapeMonitorsClient;
import com.azure.resourcemanager.workloads.fluent.models.SapLandscapeMonitorInner;
import com.azure.resourcemanager.workloads.fluent.models.SapLandscapeMonitorListResultInner;
import com.azure.resourcemanager.workloads.models.SapLandscapeMonitor;
import com.azure.resourcemanager.workloads.models.SapLandscapeMonitorListResult;
import com.azure.resourcemanager.workloads.models.SapLandscapeMonitors;

public final class SapLandscapeMonitorsImpl implements SapLandscapeMonitors {
    private static final ClientLogger LOGGER = new ClientLogger(SapLandscapeMonitorsImpl.class);

    private final SapLandscapeMonitorsClient innerClient;

    private final com.azure.resourcemanager.workloads.WorkloadsManager serviceManager;

    public SapLandscapeMonitorsImpl(
        SapLandscapeMonitorsClient innerClient, com.azure.resourcemanager.workloads.WorkloadsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<SapLandscapeMonitor> getWithResponse(
        String resourceGroupName, String monitorName, Context context) {
        Response<SapLandscapeMonitorInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, monitorName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SapLandscapeMonitorImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SapLandscapeMonitor get(String resourceGroupName, String monitorName) {
        SapLandscapeMonitorInner inner = this.serviceClient().get(resourceGroupName, monitorName);
        if (inner != null) {
            return new SapLandscapeMonitorImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SapLandscapeMonitor> createWithResponse(
        String resourceGroupName,
        String monitorName,
        SapLandscapeMonitorInner sapLandscapeMonitorParameter,
        Context context) {
        Response<SapLandscapeMonitorInner> inner =
            this
                .serviceClient()
                .createWithResponse(resourceGroupName, monitorName, sapLandscapeMonitorParameter, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SapLandscapeMonitorImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SapLandscapeMonitor create(
        String resourceGroupName, String monitorName, SapLandscapeMonitorInner sapLandscapeMonitorParameter) {
        SapLandscapeMonitorInner inner =
            this.serviceClient().create(resourceGroupName, monitorName, sapLandscapeMonitorParameter);
        if (inner != null) {
            return new SapLandscapeMonitorImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteByResourceGroupWithResponse(
        String resourceGroupName, String monitorName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, monitorName, context);
    }

    public void deleteByResourceGroup(String resourceGroupName, String monitorName) {
        this.serviceClient().delete(resourceGroupName, monitorName);
    }

    public Response<SapLandscapeMonitor> updateWithResponse(
        String resourceGroupName,
        String monitorName,
        SapLandscapeMonitorInner sapLandscapeMonitorParameter,
        Context context) {
        Response<SapLandscapeMonitorInner> inner =
            this
                .serviceClient()
                .updateWithResponse(resourceGroupName, monitorName, sapLandscapeMonitorParameter, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SapLandscapeMonitorImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SapLandscapeMonitor update(
        String resourceGroupName, String monitorName, SapLandscapeMonitorInner sapLandscapeMonitorParameter) {
        SapLandscapeMonitorInner inner =
            this.serviceClient().update(resourceGroupName, monitorName, sapLandscapeMonitorParameter);
        if (inner != null) {
            return new SapLandscapeMonitorImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SapLandscapeMonitorListResult> listWithResponse(
        String resourceGroupName, String monitorName, Context context) {
        Response<SapLandscapeMonitorListResultInner> inner =
            this.serviceClient().listWithResponse(resourceGroupName, monitorName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SapLandscapeMonitorListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SapLandscapeMonitorListResult list(String resourceGroupName, String monitorName) {
        SapLandscapeMonitorListResultInner inner = this.serviceClient().list(resourceGroupName, monitorName);
        if (inner != null) {
            return new SapLandscapeMonitorListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private SapLandscapeMonitorsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.workloads.WorkloadsManager manager() {
        return this.serviceManager;
    }
}