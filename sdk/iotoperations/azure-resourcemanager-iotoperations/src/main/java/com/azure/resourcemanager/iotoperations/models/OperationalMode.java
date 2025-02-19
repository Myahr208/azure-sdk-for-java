// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.iotoperations.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Mode properties.
 */
public final class OperationalMode extends ExpandableStringEnum<OperationalMode> {
    /**
     * Enabled is equivalent to True.
     */
    public static final OperationalMode ENABLED = fromString("Enabled");

    /**
     * Disabled is equivalent to False.
     */
    public static final OperationalMode DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of OperationalMode value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public OperationalMode() {
    }

    /**
     * Creates or finds a OperationalMode from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding OperationalMode.
     */
    public static OperationalMode fromString(String name) {
        return fromString(name, OperationalMode.class);
    }

    /**
     * Gets known OperationalMode values.
     * 
     * @return known OperationalMode values.
     */
    public static Collection<OperationalMode> values() {
        return values(OperationalMode.class);
    }
}
