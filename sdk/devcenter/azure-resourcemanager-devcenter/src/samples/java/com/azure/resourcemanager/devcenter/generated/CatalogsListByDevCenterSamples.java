// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

/**
 * Samples for Catalogs ListByDevCenter.
 */
public final class CatalogsListByDevCenterSamples {
    /*
     * x-ms-original-file:
     * specification/devcenter/resource-manager/Microsoft.DevCenter/stable/2024-02-01/examples/Catalogs_List.json
     */
    /**
     * Sample code: Catalogs_ListByDevCenter.
     * 
     * @param manager Entry point to DevCenterManager.
     */
    public static void catalogsListByDevCenter(com.azure.resourcemanager.devcenter.DevCenterManager manager) {
        manager.catalogs().listByDevCenter("rg1", "Contoso", null, com.azure.core.util.Context.NONE);
    }
}
