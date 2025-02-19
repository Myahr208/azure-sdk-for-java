// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

/**
 * Samples for Skus List.
 */
public final class SkusListSamples {
    /*
     * x-ms-original-file:
     * specification/devcenter/resource-manager/Microsoft.DevCenter/stable/2024-02-01/examples/Skus_ListBySubscription.
     * json
     */
    /**
     * Sample code: Skus_ListBySubscription.
     * 
     * @param manager Entry point to DevCenterManager.
     */
    public static void skusListBySubscription(com.azure.resourcemanager.devcenter.DevCenterManager manager) {
        manager.skus().list(null, com.azure.core.util.Context.NONE);
    }
}
