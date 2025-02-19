// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.applicationinsights.models.MyWorkbooksListResult;
import org.junit.jupiter.api.Assertions;

public final class MyWorkbooksListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MyWorkbooksListResult model = BinaryData.fromString(
            "{\"value\":[{\"kind\":\"user\",\"properties\":{\"displayName\":\"yqagvrvm\",\"serializedData\":\"pkukghi\",\"version\":\"blxgwimf\",\"timeModified\":\"hfjx\",\"category\":\"mszkkfo\",\"tags\":[\"yfkzik\",\"jawneaiv\",\"wczelpci\"],\"userId\":\"lsfeaenwabfatkld\",\"sourceId\":\"bjhwuaan\",\"storageUri\":\"jos\"},\"identity\":{\"userAssignedIdentities\":{\"principalId\":\"l\",\"tenantId\":\"rvxaglrvimjwosy\"},\"type\":\"UserAssigned\"},\"id\":\"rw\",\"name\":\"yc\",\"type\":\"duhpk\",\"etag\":{\"fatpxllrxcyjmoa\":\"db\"},\"location\":\"su\",\"tags\":{\"wdmjsjqbjhhyx\":\"m\"}},{\"kind\":\"user\",\"properties\":{\"displayName\":\"mareqnajxqugj\",\"serializedData\":\"ky\",\"version\":\"beddgssofw\",\"timeModified\":\"zqalkrmnjijpx\",\"category\":\"cqqudf\",\"tags\":[\"xbaaabjyv\",\"yffimrzrtuzqogs\",\"xnevfdnwn\",\"mewzsyyc\"],\"userId\":\"zsoibjudpfrxtr\",\"sourceId\":\"zvaytdwkqbr\",\"storageUri\":\"bpaxhexiilivpdt\"},\"identity\":{\"userAssignedIdentities\":{\"principalId\":\"d\",\"tenantId\":\"axoruzfgsquy\"},\"type\":\"UserAssigned\"},\"id\":\"dxrbuukzcle\",\"name\":\"yhmlwpaztzp\",\"type\":\"fn\",\"etag\":{\"oo\":\"kniod\",\"ujhemmsbvdkcrodt\":\"bw\"},\"location\":\"infwjlfltkacjve\",\"tags\":{\"kfpagao\":\"lfoakg\",\"jnsjervtiagxsd\":\"pulpqblylsyxk\",\"beyvpnqicvinvkjj\":\"zuempsbzkf\"}},{\"kind\":\"shared\",\"properties\":{\"displayName\":\"yfzqwhxxbu\",\"serializedData\":\"qa\",\"version\":\"feqztppriol\",\"timeModified\":\"rjaltolmncw\",\"category\":\"obqwcsdbnwdcfh\",\"tags\":[\"dpfuvg\",\"sbjjc\",\"nvxbvt\",\"udutnco\"],\"userId\":\"r\",\"sourceId\":\"qtvcofudflvkgj\",\"storageUri\":\"gdknnqv\"},\"identity\":{\"userAssignedIdentities\":{\"principalId\":\"n\",\"tenantId\":\"rudsg\"},\"type\":\"UserAssigned\"},\"id\":\"oxciqopidoamcio\",\"name\":\"hkh\",\"type\":\"zxkhnzbonlwnto\",\"etag\":{\"kif\":\"xwabmqoe\"},\"location\":\"vtpuqujmqlgk\",\"tags\":{\"ongbjcnt\":\"ndo\",\"ojvdcpzfoqo\":\"jitcjedftwwaez\",\"ybxarzgszu\":\"i\"}}],\"nextLink\":\"okdwb\"}")
            .toObject(MyWorkbooksListResult.class);
        Assertions.assertEquals("okdwb", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MyWorkbooksListResult model = new MyWorkbooksListResult().withNextLink("okdwb");
        model = BinaryData.fromObject(model).toObject(MyWorkbooksListResult.class);
        Assertions.assertEquals("okdwb", model.nextLink());
    }
}
