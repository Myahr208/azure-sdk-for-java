// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.models.ClusterMetricsConfigurationPatchParameters;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ClusterMetricsConfigurationPatchParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterMetricsConfigurationPatchParameters model = BinaryData.fromString(
            "{\"properties\":{\"collectionInterval\":4287701652301675834,\"enabledMetrics\":[\"uztlvtmva\"]},\"tags\":{\"oveofizrvjfnmj\":\"idqlvhu\"}}")
            .toObject(ClusterMetricsConfigurationPatchParameters.class);
        Assertions.assertEquals("idqlvhu", model.tags().get("oveofizrvjfnmj"));
        Assertions.assertEquals(4287701652301675834L, model.collectionInterval());
        Assertions.assertEquals("uztlvtmva", model.enabledMetrics().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterMetricsConfigurationPatchParameters model
            = new ClusterMetricsConfigurationPatchParameters().withTags(mapOf("oveofizrvjfnmj", "idqlvhu"))
                .withCollectionInterval(4287701652301675834L)
                .withEnabledMetrics(Arrays.asList("uztlvtmva"));
        model = BinaryData.fromObject(model).toObject(ClusterMetricsConfigurationPatchParameters.class);
        Assertions.assertEquals("idqlvhu", model.tags().get("oveofizrvjfnmj"));
        Assertions.assertEquals(4287701652301675834L, model.collectionInterval());
        Assertions.assertEquals("uztlvtmva", model.enabledMetrics().get(0));
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
