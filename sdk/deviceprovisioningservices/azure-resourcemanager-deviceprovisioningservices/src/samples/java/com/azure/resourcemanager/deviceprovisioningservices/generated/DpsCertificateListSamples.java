// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceprovisioningservices.generated;

import com.azure.core.util.Context;

/** Samples for DpsCertificate List. */
public final class DpsCertificateListSamples {
    /*
     * x-ms-original-file: specification/deviceprovisioningservices/resource-manager/Microsoft.Devices/stable/2021-10-15/examples/DPSGetCertificates.json
     */
    /**
     * Sample code: DPSGetCertificates.
     *
     * @param manager Entry point to IotDpsManager.
     */
    public static void dPSGetCertificates(com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager manager) {
        manager.dpsCertificates().listWithResponse("myResourceGroup", "myFirstProvisioningService", Context.NONE);
    }
}
