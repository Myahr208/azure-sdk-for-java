// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.automation.fluent.models.RunbookDraftInner;
import com.azure.resourcemanager.automation.fluent.models.RunbookInner;
import com.azure.resourcemanager.automation.models.ContentHash;
import com.azure.resourcemanager.automation.models.ContentLink;
import com.azure.resourcemanager.automation.models.RunbookParameter;
import com.azure.resourcemanager.automation.models.RunbookProvisioningState;
import com.azure.resourcemanager.automation.models.RunbookState;
import com.azure.resourcemanager.automation.models.RunbookTypeEnum;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class RunbookInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RunbookInner model = BinaryData.fromString(
            "{\"properties\":{\"runbookType\":\"Script\",\"publishContentLink\":{\"uri\":\"yoyp\",\"contentHash\":{\"algorithm\":\"hbrnnhjx\",\"value\":\"qwjhqkbiwetpozyc\"},\"version\":\"iqyhgfse\"},\"state\":\"Published\",\"logVerbose\":true,\"logProgress\":false,\"logActivityTrace\":207278850,\"jobCount\":805982929,\"parameters\":{\"qsyclj\":{\"type\":\"jpziu\",\"isMandatory\":false,\"position\":129871378,\"defaultValue\":\"dtn\"}},\"outputTypes\":[\"pkpbafvafhlbylcc\",\"evxrhyz\",\"fwrsofpltdbmair\"],\"draft\":{\"inEdit\":false,\"draftContentLink\":{\"uri\":\"ra\",\"contentHash\":{\"algorithm\":\"npq\",\"value\":\"g\"},\"version\":\"ujwouhdawsi\"},\"creationTime\":\"2021-08-10T06:30:07Z\",\"lastModifiedTime\":\"2020-12-25T02:25:21Z\",\"parameters\":{\"zfnkfexlvxno\":{\"type\":\"ybvitvqkjyaznumt\",\"isMandatory\":false,\"position\":2045833128,\"defaultValue\":\"ch\"},\"xzcwxhmpejt\":{\"type\":\"izvoaiknaqlnuwi\",\"isMandatory\":false,\"position\":78336255,\"defaultValue\":\"kwph\"}},\"outputTypes\":[\"xaonwivkcqh\",\"xhxknlc\",\"rmmkyupiju\"]},\"provisioningState\":\"Succeeded\",\"lastModifiedBy\":\"fkak\",\"creationTime\":\"2021-11-11T13:29:18Z\",\"lastModifiedTime\":\"2021-07-21T09:43:27Z\",\"description\":\"myildudxjasc\"},\"etag\":\"vfdjkpdxp\",\"location\":\"lkksnmgzvyfi\",\"tags\":{\"yahluqwqulsutr\":\"zuqnwsithuqo\",\"rftb\":\"bhxykfhyqezvqqug\",\"reuquowtljvf\":\"ve\"},\"id\":\"hreagk\",\"name\":\"yxvrqtvbczsul\",\"type\":\"dgglmepjpfs\"}")
            .toObject(RunbookInner.class);
        Assertions.assertEquals("lkksnmgzvyfi", model.location());
        Assertions.assertEquals("zuqnwsithuqo", model.tags().get("yahluqwqulsutr"));
        Assertions.assertEquals("vfdjkpdxp", model.etag());
        Assertions.assertEquals(RunbookTypeEnum.SCRIPT, model.runbookType());
        Assertions.assertEquals("yoyp", model.publishContentLink().uri());
        Assertions.assertEquals("hbrnnhjx", model.publishContentLink().contentHash().algorithm());
        Assertions.assertEquals("qwjhqkbiwetpozyc", model.publishContentLink().contentHash().value());
        Assertions.assertEquals("iqyhgfse", model.publishContentLink().version());
        Assertions.assertEquals(RunbookState.PUBLISHED, model.state());
        Assertions.assertEquals(true, model.logVerbose());
        Assertions.assertEquals(false, model.logProgress());
        Assertions.assertEquals(207278850, model.logActivityTrace());
        Assertions.assertEquals(805982929, model.jobCount());
        Assertions.assertEquals("jpziu", model.parameters().get("qsyclj").type());
        Assertions.assertEquals(false, model.parameters().get("qsyclj").isMandatory());
        Assertions.assertEquals(129871378, model.parameters().get("qsyclj").position());
        Assertions.assertEquals("dtn", model.parameters().get("qsyclj").defaultValue());
        Assertions.assertEquals("pkpbafvafhlbylcc", model.outputTypes().get(0));
        Assertions.assertEquals(false, model.draft().inEdit());
        Assertions.assertEquals("ra", model.draft().draftContentLink().uri());
        Assertions.assertEquals("npq", model.draft().draftContentLink().contentHash().algorithm());
        Assertions.assertEquals("g", model.draft().draftContentLink().contentHash().value());
        Assertions.assertEquals("ujwouhdawsi", model.draft().draftContentLink().version());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-10T06:30:07Z"), model.draft().creationTime());
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-25T02:25:21Z"), model.draft().lastModifiedTime());
        Assertions.assertEquals("ybvitvqkjyaznumt", model.draft().parameters().get("zfnkfexlvxno").type());
        Assertions.assertEquals(false, model.draft().parameters().get("zfnkfexlvxno").isMandatory());
        Assertions.assertEquals(2045833128, model.draft().parameters().get("zfnkfexlvxno").position());
        Assertions.assertEquals("ch", model.draft().parameters().get("zfnkfexlvxno").defaultValue());
        Assertions.assertEquals("xaonwivkcqh", model.draft().outputTypes().get(0));
        Assertions.assertEquals(RunbookProvisioningState.SUCCEEDED, model.provisioningState());
        Assertions.assertEquals("fkak", model.lastModifiedBy());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-11T13:29:18Z"), model.creationTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-21T09:43:27Z"), model.lastModifiedTime());
        Assertions.assertEquals("myildudxjasc", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RunbookInner model = new RunbookInner().withLocation("lkksnmgzvyfi")
            .withTags(mapOf("yahluqwqulsutr", "zuqnwsithuqo", "rftb", "bhxykfhyqezvqqug", "reuquowtljvf", "ve"))
            .withEtag("vfdjkpdxp")
            .withRunbookType(RunbookTypeEnum.SCRIPT)
            .withPublishContentLink(new ContentLink().withUri("yoyp")
                .withContentHash(new ContentHash().withAlgorithm("hbrnnhjx").withValue("qwjhqkbiwetpozyc"))
                .withVersion("iqyhgfse"))
            .withState(RunbookState.PUBLISHED)
            .withLogVerbose(true)
            .withLogProgress(false)
            .withLogActivityTrace(207278850)
            .withJobCount(805982929)
            .withParameters(mapOf("qsyclj",
                new RunbookParameter().withType("jpziu")
                    .withIsMandatory(false)
                    .withPosition(129871378)
                    .withDefaultValue("dtn")))
            .withOutputTypes(Arrays.asList("pkpbafvafhlbylcc", "evxrhyz", "fwrsofpltdbmair"))
            .withDraft(new RunbookDraftInner().withInEdit(false)
                .withDraftContentLink(new ContentLink().withUri("ra")
                    .withContentHash(new ContentHash().withAlgorithm("npq").withValue("g"))
                    .withVersion("ujwouhdawsi"))
                .withCreationTime(OffsetDateTime.parse("2021-08-10T06:30:07Z"))
                .withLastModifiedTime(OffsetDateTime.parse("2020-12-25T02:25:21Z"))
                .withParameters(mapOf("zfnkfexlvxno",
                    new RunbookParameter().withType("ybvitvqkjyaznumt")
                        .withIsMandatory(false)
                        .withPosition(2045833128)
                        .withDefaultValue("ch"),
                    "xzcwxhmpejt",
                    new RunbookParameter().withType("izvoaiknaqlnuwi")
                        .withIsMandatory(false)
                        .withPosition(78336255)
                        .withDefaultValue("kwph")))
                .withOutputTypes(Arrays.asList("xaonwivkcqh", "xhxknlc", "rmmkyupiju")))
            .withProvisioningState(RunbookProvisioningState.SUCCEEDED)
            .withLastModifiedBy("fkak")
            .withCreationTime(OffsetDateTime.parse("2021-11-11T13:29:18Z"))
            .withLastModifiedTime(OffsetDateTime.parse("2021-07-21T09:43:27Z"))
            .withDescription("myildudxjasc");
        model = BinaryData.fromObject(model).toObject(RunbookInner.class);
        Assertions.assertEquals("lkksnmgzvyfi", model.location());
        Assertions.assertEquals("zuqnwsithuqo", model.tags().get("yahluqwqulsutr"));
        Assertions.assertEquals("vfdjkpdxp", model.etag());
        Assertions.assertEquals(RunbookTypeEnum.SCRIPT, model.runbookType());
        Assertions.assertEquals("yoyp", model.publishContentLink().uri());
        Assertions.assertEquals("hbrnnhjx", model.publishContentLink().contentHash().algorithm());
        Assertions.assertEquals("qwjhqkbiwetpozyc", model.publishContentLink().contentHash().value());
        Assertions.assertEquals("iqyhgfse", model.publishContentLink().version());
        Assertions.assertEquals(RunbookState.PUBLISHED, model.state());
        Assertions.assertEquals(true, model.logVerbose());
        Assertions.assertEquals(false, model.logProgress());
        Assertions.assertEquals(207278850, model.logActivityTrace());
        Assertions.assertEquals(805982929, model.jobCount());
        Assertions.assertEquals("jpziu", model.parameters().get("qsyclj").type());
        Assertions.assertEquals(false, model.parameters().get("qsyclj").isMandatory());
        Assertions.assertEquals(129871378, model.parameters().get("qsyclj").position());
        Assertions.assertEquals("dtn", model.parameters().get("qsyclj").defaultValue());
        Assertions.assertEquals("pkpbafvafhlbylcc", model.outputTypes().get(0));
        Assertions.assertEquals(false, model.draft().inEdit());
        Assertions.assertEquals("ra", model.draft().draftContentLink().uri());
        Assertions.assertEquals("npq", model.draft().draftContentLink().contentHash().algorithm());
        Assertions.assertEquals("g", model.draft().draftContentLink().contentHash().value());
        Assertions.assertEquals("ujwouhdawsi", model.draft().draftContentLink().version());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-10T06:30:07Z"), model.draft().creationTime());
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-25T02:25:21Z"), model.draft().lastModifiedTime());
        Assertions.assertEquals("ybvitvqkjyaznumt", model.draft().parameters().get("zfnkfexlvxno").type());
        Assertions.assertEquals(false, model.draft().parameters().get("zfnkfexlvxno").isMandatory());
        Assertions.assertEquals(2045833128, model.draft().parameters().get("zfnkfexlvxno").position());
        Assertions.assertEquals("ch", model.draft().parameters().get("zfnkfexlvxno").defaultValue());
        Assertions.assertEquals("xaonwivkcqh", model.draft().outputTypes().get(0));
        Assertions.assertEquals(RunbookProvisioningState.SUCCEEDED, model.provisioningState());
        Assertions.assertEquals("fkak", model.lastModifiedBy());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-11T13:29:18Z"), model.creationTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-21T09:43:27Z"), model.lastModifiedTime());
        Assertions.assertEquals("myildudxjasc", model.description());
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
