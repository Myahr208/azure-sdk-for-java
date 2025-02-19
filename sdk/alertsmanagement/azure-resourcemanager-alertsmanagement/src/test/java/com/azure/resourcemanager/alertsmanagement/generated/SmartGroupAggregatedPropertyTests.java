// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.alertsmanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.alertsmanagement.models.SmartGroupAggregatedProperty;
import org.junit.jupiter.api.Assertions;

public final class SmartGroupAggregatedPropertyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SmartGroupAggregatedProperty model
            = BinaryData.fromString("{\"name\":\"sttktlahbqa\",\"count\":8616212085400187990}")
                .toObject(SmartGroupAggregatedProperty.class);
        Assertions.assertEquals("sttktlahbqa", model.name());
        Assertions.assertEquals(8616212085400187990L, model.count());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SmartGroupAggregatedProperty model
            = new SmartGroupAggregatedProperty().withName("sttktlahbqa").withCount(8616212085400187990L);
        model = BinaryData.fromObject(model).toObject(SmartGroupAggregatedProperty.class);
        Assertions.assertEquals("sttktlahbqa", model.name());
        Assertions.assertEquals(8616212085400187990L, model.count());
    }
}
