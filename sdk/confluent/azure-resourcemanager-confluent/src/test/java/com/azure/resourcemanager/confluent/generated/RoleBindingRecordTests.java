// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.confluent.models.MetadataEntity;
import com.azure.resourcemanager.confluent.models.RoleBindingRecord;
import org.junit.jupiter.api.Assertions;

public final class RoleBindingRecordTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RoleBindingRecord model = BinaryData.fromString(
            "{\"kind\":\"vhelxprglyatdd\",\"id\":\"cbcuejrjxgciqi\",\"metadata\":{\"self\":\"osx\",\"resource_name\":\"qrhzoymibmrqyib\",\"created_at\":\"wfluszdt\",\"updated_at\":\"rkwofyyvoqa\",\"deleted_at\":\"iexpbtgiwbwo\"},\"principal\":\"washr\",\"role_name\":\"tkcnqxwb\",\"crn_pattern\":\"kulpiujwaasi\"}")
            .toObject(RoleBindingRecord.class);
        Assertions.assertEquals("vhelxprglyatdd", model.kind());
        Assertions.assertEquals("cbcuejrjxgciqi", model.id());
        Assertions.assertEquals("osx", model.metadata().self());
        Assertions.assertEquals("qrhzoymibmrqyib", model.metadata().resourceName());
        Assertions.assertEquals("wfluszdt", model.metadata().createdAt());
        Assertions.assertEquals("rkwofyyvoqa", model.metadata().updatedAt());
        Assertions.assertEquals("iexpbtgiwbwo", model.metadata().deletedAt());
        Assertions.assertEquals("washr", model.principal());
        Assertions.assertEquals("tkcnqxwb", model.roleName());
        Assertions.assertEquals("kulpiujwaasi", model.crnPattern());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RoleBindingRecord model = new RoleBindingRecord().withKind("vhelxprglyatdd")
            .withId("cbcuejrjxgciqi")
            .withMetadata(new MetadataEntity().withSelf("osx")
                .withResourceName("qrhzoymibmrqyib")
                .withCreatedAt("wfluszdt")
                .withUpdatedAt("rkwofyyvoqa")
                .withDeletedAt("iexpbtgiwbwo"))
            .withPrincipal("washr")
            .withRoleName("tkcnqxwb")
            .withCrnPattern("kulpiujwaasi");
        model = BinaryData.fromObject(model).toObject(RoleBindingRecord.class);
        Assertions.assertEquals("vhelxprglyatdd", model.kind());
        Assertions.assertEquals("cbcuejrjxgciqi", model.id());
        Assertions.assertEquals("osx", model.metadata().self());
        Assertions.assertEquals("qrhzoymibmrqyib", model.metadata().resourceName());
        Assertions.assertEquals("wfluszdt", model.metadata().createdAt());
        Assertions.assertEquals("rkwofyyvoqa", model.metadata().updatedAt());
        Assertions.assertEquals("iexpbtgiwbwo", model.metadata().deletedAt());
        Assertions.assertEquals("washr", model.principal());
        Assertions.assertEquals("tkcnqxwb", model.roleName());
        Assertions.assertEquals("kulpiujwaasi", model.crnPattern());
    }
}
