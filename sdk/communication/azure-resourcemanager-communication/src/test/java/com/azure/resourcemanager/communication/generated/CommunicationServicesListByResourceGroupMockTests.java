// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.communication.CommunicationManager;
import com.azure.resourcemanager.communication.models.CommunicationServiceResource;
import com.azure.resourcemanager.communication.models.ManagedServiceIdentityType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class CommunicationServicesListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"provisioningState\":\"Running\",\"hostName\":\"arbu\",\"dataLocation\":\"rcvpnazzmhjrunmp\",\"notificationHubId\":\"tdbhrbnla\",\"version\":\"xmyskp\",\"immutableResourceId\":\"enbtkcxywny\",\"linkedDomains\":[\"synlqidybyxczfc\"]},\"identity\":{\"principalId\":\"bfa69d02-3968-4be4-9d87-221572df2961\",\"tenantId\":\"7f7c03fd-d58a-4458-be31-beea03acf146\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"p\":{\"principalId\":\"208e16a6-34e2-4569-ab9e-b5cb951b992f\",\"clientId\":\"b1c1f6e7-9275-4a97-b342-c8b013bb8d96\"},\"rqlfktsthsucocmn\":{\"principalId\":\"f3b2b267-72c9-4ff4-9966-7a1094e10fd6\",\"clientId\":\"1148d21d-f15d-499f-ab16-8a29dff049fc\"},\"zt\":{\"principalId\":\"64b63f29-b56f-4b05-a9dd-e343b9fc50a9\",\"clientId\":\"7050f34d-8bcf-4964-b64a-a9f557eaf820\"}}},\"location\":\"twwrqp\",\"tags\":{\"xibxujwbhqwalm\":\"ckzywbiexzfeyue\",\"ux\":\"zyoxaepdkzjan\",\"zt\":\"hdwbavxbniwdjs\"},\"id\":\"dbpgnxytxhp\",\"name\":\"xbzpfzab\",\"type\":\"lcuhxwtctyqiklb\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        CommunicationManager manager = CommunicationManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<CommunicationServiceResource> response
            = manager.communicationServices().listByResourceGroup("buynhijggm", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("twwrqp", response.iterator().next().location());
        Assertions.assertEquals("ckzywbiexzfeyue", response.iterator().next().tags().get("xibxujwbhqwalm"));
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, response.iterator().next().identity().type());
        Assertions.assertEquals("rcvpnazzmhjrunmp", response.iterator().next().dataLocation());
        Assertions.assertEquals("synlqidybyxczfc", response.iterator().next().linkedDomains().get(0));
    }
}
