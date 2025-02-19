// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.fluent.models.SettingsProperties;
import org.junit.jupiter.api.Assertions;

public final class SettingsPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SettingsProperties model = BinaryData
            .fromString("{\"tenantId\":\"ss\",\"gatewayProperties\":{\"gatewayResourceId\":\"twbdsrezpdrhn\"}}")
            .toObject(SettingsProperties.class);
        Assertions.assertEquals("twbdsrezpdrhn", model.gatewayResourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SettingsProperties model = new SettingsProperties().withGatewayResourceId("twbdsrezpdrhn");
        model = BinaryData.fromObject(model).toObject(SettingsProperties.class);
        Assertions.assertEquals("twbdsrezpdrhn", model.gatewayResourceId());
    }
}
