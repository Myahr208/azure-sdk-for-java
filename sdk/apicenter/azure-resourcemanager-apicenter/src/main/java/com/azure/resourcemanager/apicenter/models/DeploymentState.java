// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * State of the Deployment.
 */
public final class DeploymentState extends ExpandableStringEnum<DeploymentState> {
    /**
     * Static value active for DeploymentState.
     */
    public static final DeploymentState ACTIVE = fromString("active");

    /**
     * Static value inactive for DeploymentState.
     */
    public static final DeploymentState INACTIVE = fromString("inactive");

    /**
     * Creates a new instance of DeploymentState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DeploymentState() {
    }

    /**
     * Creates or finds a DeploymentState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DeploymentState.
     */
    public static DeploymentState fromString(String name) {
        return fromString(name, DeploymentState.class);
    }

    /**
     * Gets known DeploymentState values.
     * 
     * @return known DeploymentState values.
     */
    public static Collection<DeploymentState> values() {
        return values(DeploymentState.class);
    }
}
