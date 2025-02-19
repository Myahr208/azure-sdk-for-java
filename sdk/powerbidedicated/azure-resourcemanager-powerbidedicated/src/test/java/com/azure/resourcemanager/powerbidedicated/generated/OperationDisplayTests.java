// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.powerbidedicated.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.powerbidedicated.models.OperationDisplay;
import org.junit.jupiter.api.Assertions;

public final class OperationDisplayTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationDisplay model = BinaryData.fromString(
            "{\"provider\":\"ajrmvdjwzrlovmc\",\"resource\":\"hijco\",\"operation\":\"ctbzaq\",\"description\":\"sycbkbfk\"}")
            .toObject(OperationDisplay.class);
        Assertions.assertEquals("sycbkbfk", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationDisplay model = new OperationDisplay().withDescription("sycbkbfk");
        model = BinaryData.fromObject(model).toObject(OperationDisplay.class);
        Assertions.assertEquals("sycbkbfk", model.description());
    }
}
