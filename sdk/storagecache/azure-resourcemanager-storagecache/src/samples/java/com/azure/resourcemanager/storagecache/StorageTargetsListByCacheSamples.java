// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache;

import com.azure.core.util.Context;

/** Samples for StorageTargets ListByCache. */
public final class StorageTargetsListByCacheSamples {
    /**
     * Sample code: StorageTargets_List.
     *
     * @param storageCacheManager Entry point to StorageCacheManager. A Storage Cache provides scalable caching service
     *     for NAS clients, serving data from either NFSv3 or Blob at-rest storage (referred to as "Storage Targets").
     *     These operations allow you to manage Caches.
     */
    public static void storageTargetsList(
        com.azure.resourcemanager.storagecache.StorageCacheManager storageCacheManager) {
        storageCacheManager.storageTargets().listByCache("scgroup", "sc1", Context.NONE);
    }
}
