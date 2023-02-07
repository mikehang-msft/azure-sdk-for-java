// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.workloads.models.SapDatabaseType;
import com.azure.resourcemanager.workloads.models.SapDeploymentType;
import com.azure.resourcemanager.workloads.models.SapDiskConfigurationsRequest;
import com.azure.resourcemanager.workloads.models.SapEnvironmentType;
import com.azure.resourcemanager.workloads.models.SapProductType;
import org.junit.jupiter.api.Assertions;

public final class SapDiskConfigurationsRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SapDiskConfigurationsRequest model =
            BinaryData
                .fromString(
                    "{\"appLocation\":\"tbmufpo\",\"environment\":\"NonProd\",\"sapProduct\":\"ECC\",\"databaseType\":\"HANA\",\"deploymentType\":\"SingleServer\",\"dbVmSku\":\"hwlrx\"}")
                .toObject(SapDiskConfigurationsRequest.class);
        Assertions.assertEquals("tbmufpo", model.appLocation());
        Assertions.assertEquals(SapEnvironmentType.NON_PROD, model.environment());
        Assertions.assertEquals(SapProductType.ECC, model.sapProduct());
        Assertions.assertEquals(SapDatabaseType.HANA, model.databaseType());
        Assertions.assertEquals(SapDeploymentType.SINGLE_SERVER, model.deploymentType());
        Assertions.assertEquals("hwlrx", model.dbVmSku());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SapDiskConfigurationsRequest model =
            new SapDiskConfigurationsRequest()
                .withAppLocation("tbmufpo")
                .withEnvironment(SapEnvironmentType.NON_PROD)
                .withSapProduct(SapProductType.ECC)
                .withDatabaseType(SapDatabaseType.HANA)
                .withDeploymentType(SapDeploymentType.SINGLE_SERVER)
                .withDbVmSku("hwlrx");
        model = BinaryData.fromObject(model).toObject(SapDiskConfigurationsRequest.class);
        Assertions.assertEquals("tbmufpo", model.appLocation());
        Assertions.assertEquals(SapEnvironmentType.NON_PROD, model.environment());
        Assertions.assertEquals(SapProductType.ECC, model.sapProduct());
        Assertions.assertEquals(SapDatabaseType.HANA, model.databaseType());
        Assertions.assertEquals(SapDeploymentType.SINGLE_SERVER, model.deploymentType());
        Assertions.assertEquals("hwlrx", model.dbVmSku());
    }
}