// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.education.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.education.EducationManager;
import com.azure.resourcemanager.education.models.OperationListResult;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class OperationsListWithResponseMockTests {
    @Test
    public void testListWithResponse() throws Exception {
        String responseStr
            = "{\"value\":[{\"name\":\"sxlzevgbmqj\",\"isDataAction\":false,\"display\":{\"provider\":\"pmivkwlzu\",\"resource\":\"c\",\"operation\":\"nfnbacfionlebxe\",\"description\":\"gtzxdpn\"},\"origin\":\"user\",\"actionType\":\"Internal\"}],\"nextLink\":\"rjfeallnwsubisnj\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        EducationManager manager = EducationManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        OperationListResult response
            = manager.operations().listWithResponse(com.azure.core.util.Context.NONE).getValue();

    }
}
