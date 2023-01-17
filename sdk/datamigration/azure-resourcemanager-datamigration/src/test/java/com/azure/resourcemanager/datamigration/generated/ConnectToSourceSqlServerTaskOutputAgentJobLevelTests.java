// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datamigration.models.ConnectToSourceSqlServerTaskOutputAgentJobLevel;

public final class ConnectToSourceSqlServerTaskOutputAgentJobLevelTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ConnectToSourceSqlServerTaskOutputAgentJobLevel model =
            BinaryData
                .fromString(
                    "{\"resultType\":\"AgentJobLevelOutput\",\"name\":\"pvjymjhxxjyng\",\"jobCategory\":\"ivkrtsw\",\"isEnabled\":false,\"jobOwner\":\"vszjfauvjfdxxi\",\"lastExecutedOn\":\"2021-01-09T05:59Z\",\"migrationEligibility\":{\"isEligibleForMigration\":true,\"validationMessages\":[\"qtdo\",\"mcbxvwvxysl\",\"bhsfxob\"]},\"id\":\"tkblmpewww\"}")
                .toObject(ConnectToSourceSqlServerTaskOutputAgentJobLevel.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ConnectToSourceSqlServerTaskOutputAgentJobLevel model = new ConnectToSourceSqlServerTaskOutputAgentJobLevel();
        model = BinaryData.fromObject(model).toObject(ConnectToSourceSqlServerTaskOutputAgentJobLevel.class);
    }
}