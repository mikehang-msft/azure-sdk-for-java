// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.implementation;

import com.azure.resourcemanager.batch.fluent.models.BatchLocationQuotaInner;
import com.azure.resourcemanager.batch.models.BatchLocationQuota;

public final class BatchLocationQuotaImpl implements BatchLocationQuota {
    private BatchLocationQuotaInner innerObject;

    private final com.azure.resourcemanager.batch.BatchManager serviceManager;

    BatchLocationQuotaImpl(BatchLocationQuotaInner innerObject,
        com.azure.resourcemanager.batch.BatchManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Integer accountQuota() {
        return this.innerModel().accountQuota();
    }

    public BatchLocationQuotaInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.batch.BatchManager manager() {
        return this.serviceManager;
    }
}
