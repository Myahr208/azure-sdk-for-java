// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.models;

import com.azure.resourcemanager.customerinsights.fluent.models.AuthorizationPolicyInner;
import java.util.List;

/**
 * An immutable client-side representation of AuthorizationPolicy.
 */
public interface AuthorizationPolicy {
    /**
     * Gets the policyName property: Name of the policy.
     * 
     * @return the policyName value.
     */
    String policyName();

    /**
     * Gets the permissions property: The permissions associated with the policy.
     * 
     * @return the permissions value.
     */
    List<PermissionTypes> permissions();

    /**
     * Gets the primaryKey property: Primary key associated with the policy.
     * 
     * @return the primaryKey value.
     */
    String primaryKey();

    /**
     * Gets the secondaryKey property: Secondary key associated with the policy.
     * 
     * @return the secondaryKey value.
     */
    String secondaryKey();

    /**
     * Gets the inner com.azure.resourcemanager.customerinsights.fluent.models.AuthorizationPolicyInner object.
     * 
     * @return the inner object.
     */
    AuthorizationPolicyInner innerModel();
}
