// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ScriptActionTaskDetails;
import org.junit.jupiter.api.Assertions;

public final class ScriptActionTaskDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScriptActionTaskDetails model = BinaryData.fromString(
            "{\"instanceType\":\"ScriptActionTaskDetails\",\"name\":\"pzwwytbdjzgh\",\"path\":\"mkgfmxpqkjnp\",\"output\":\"iwntotcxmmqmts\",\"isPrimarySideScript\":true}")
            .toObject(ScriptActionTaskDetails.class);
        Assertions.assertEquals("pzwwytbdjzgh", model.name());
        Assertions.assertEquals("mkgfmxpqkjnp", model.path());
        Assertions.assertEquals("iwntotcxmmqmts", model.output());
        Assertions.assertEquals(true, model.isPrimarySideScript());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScriptActionTaskDetails model = new ScriptActionTaskDetails().withName("pzwwytbdjzgh")
            .withPath("mkgfmxpqkjnp")
            .withOutput("iwntotcxmmqmts")
            .withIsPrimarySideScript(true);
        model = BinaryData.fromObject(model).toObject(ScriptActionTaskDetails.class);
        Assertions.assertEquals("pzwwytbdjzgh", model.name());
        Assertions.assertEquals("mkgfmxpqkjnp", model.path());
        Assertions.assertEquals("iwntotcxmmqmts", model.output());
        Assertions.assertEquals(true, model.isPrimarySideScript());
    }
}
