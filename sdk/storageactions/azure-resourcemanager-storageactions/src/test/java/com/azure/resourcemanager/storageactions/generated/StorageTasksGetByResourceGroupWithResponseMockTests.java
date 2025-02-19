// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storageactions.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.storageactions.StorageActionsManager;
import com.azure.resourcemanager.storageactions.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.storageactions.models.StorageTask;
import com.azure.resourcemanager.storageactions.models.StorageTaskOperationName;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class StorageTasksGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        String responseStr
            = "{\"identity\":{\"principalId\":\"dd346b4e-f036-411b-88ea-baa83a1b9240\",\"tenantId\":\"4ddc9b95-5d48-4052-8c06-348c77ba6aa8\",\"type\":\"None\",\"userAssignedIdentities\":{\"noc\":{\"principalId\":\"5ae34fa1-5435-45b8-bd67-35737de83ec5\",\"clientId\":\"a69f306b-dbcb-4933-be58-2c2942e620b4\"}}},\"properties\":{\"taskVersion\":3525992913673198952,\"enabled\":false,\"description\":\"yaxuconuqszfkb\",\"action\":{\"if\":{\"condition\":\"ypewrmjmwvvjekt\",\"operations\":[{\"name\":\"SetBlobExpiry\"},{\"name\":\"SetBlobLegalHold\"}]},\"else\":{\"operations\":[{\"name\":\"SetBlobTags\"},{\"name\":\"SetBlobLegalHold\"}]}},\"provisioningState\":\"ValidateSubscriptionQuotaBegin\",\"creationTimeInUtc\":\"2021-01-30T03:05:29Z\"},\"location\":\"zpwv\",\"tags\":{\"biqylihkaet\":\"q\",\"fcivfsnkym\":\"kt\",\"jf\":\"ctq\",\"fuwutttxf\":\"ebrjcxe\"},\"id\":\"jrbirphxepcyv\",\"name\":\"hfnljkyq\",\"type\":\"j\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        StorageActionsManager manager = StorageActionsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        StorageTask response = manager.storageTasks()
            .getByResourceGroupWithResponse("cohoq", "nwvlryavwhheunmm", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("zpwv", response.location());
        Assertions.assertEquals("q", response.tags().get("biqylihkaet"));
        Assertions.assertEquals(ManagedServiceIdentityType.NONE, response.identity().type());
        Assertions.assertEquals(false, response.properties().enabled());
        Assertions.assertEquals("yaxuconuqszfkb", response.properties().description());
        Assertions.assertEquals("ypewrmjmwvvjekt", response.properties().action().ifProperty().condition());
        Assertions.assertEquals(StorageTaskOperationName.SET_BLOB_EXPIRY,
            response.properties().action().ifProperty().operations().get(0).name());
        Assertions.assertEquals(StorageTaskOperationName.SET_BLOB_TAGS,
            response.properties().action().elseProperty().operations().get(0).name());
    }
}
