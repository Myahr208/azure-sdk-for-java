// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.sqlvirtualmachine.models.AgConfiguration;
import com.azure.resourcemanager.sqlvirtualmachine.models.LoadBalancerConfiguration;
import com.azure.resourcemanager.sqlvirtualmachine.models.MultiSubnetIpConfiguration;
import java.io.IOException;
import java.util.List;

/**
 * A SQL Server availability group listener.
 */
@Fluent
public final class AvailabilityGroupListenerInner extends ProxyResource {
    /*
     * Resource properties.
     */
    private AvailabilityGroupListenerProperties innerProperties;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    private SystemData systemData;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of AvailabilityGroupListenerInner class.
     */
    public AvailabilityGroupListenerInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     * 
     * @return the innerProperties value.
     */
    private AvailabilityGroupListenerProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the provisioningState property: Provisioning state to track the async operation status.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the availabilityGroupName property: Name of the availability group.
     * 
     * @return the availabilityGroupName value.
     */
    public String availabilityGroupName() {
        return this.innerProperties() == null ? null : this.innerProperties().availabilityGroupName();
    }

    /**
     * Set the availabilityGroupName property: Name of the availability group.
     * 
     * @param availabilityGroupName the availabilityGroupName value to set.
     * @return the AvailabilityGroupListenerInner object itself.
     */
    public AvailabilityGroupListenerInner withAvailabilityGroupName(String availabilityGroupName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AvailabilityGroupListenerProperties();
        }
        this.innerProperties().withAvailabilityGroupName(availabilityGroupName);
        return this;
    }

    /**
     * Get the loadBalancerConfigurations property: List of load balancer configurations for an availability group
     * listener.
     * 
     * @return the loadBalancerConfigurations value.
     */
    public List<LoadBalancerConfiguration> loadBalancerConfigurations() {
        return this.innerProperties() == null ? null : this.innerProperties().loadBalancerConfigurations();
    }

    /**
     * Set the loadBalancerConfigurations property: List of load balancer configurations for an availability group
     * listener.
     * 
     * @param loadBalancerConfigurations the loadBalancerConfigurations value to set.
     * @return the AvailabilityGroupListenerInner object itself.
     */
    public AvailabilityGroupListenerInner
        withLoadBalancerConfigurations(List<LoadBalancerConfiguration> loadBalancerConfigurations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AvailabilityGroupListenerProperties();
        }
        this.innerProperties().withLoadBalancerConfigurations(loadBalancerConfigurations);
        return this;
    }

    /**
     * Get the multiSubnetIpConfigurations property: List of multi subnet IP configurations for an AG listener.
     * 
     * @return the multiSubnetIpConfigurations value.
     */
    public List<MultiSubnetIpConfiguration> multiSubnetIpConfigurations() {
        return this.innerProperties() == null ? null : this.innerProperties().multiSubnetIpConfigurations();
    }

    /**
     * Set the multiSubnetIpConfigurations property: List of multi subnet IP configurations for an AG listener.
     * 
     * @param multiSubnetIpConfigurations the multiSubnetIpConfigurations value to set.
     * @return the AvailabilityGroupListenerInner object itself.
     */
    public AvailabilityGroupListenerInner
        withMultiSubnetIpConfigurations(List<MultiSubnetIpConfiguration> multiSubnetIpConfigurations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AvailabilityGroupListenerProperties();
        }
        this.innerProperties().withMultiSubnetIpConfigurations(multiSubnetIpConfigurations);
        return this;
    }

    /**
     * Get the createDefaultAvailabilityGroupIfNotExist property: Create a default availability group if it does not
     * exist.
     * 
     * @return the createDefaultAvailabilityGroupIfNotExist value.
     */
    public Boolean createDefaultAvailabilityGroupIfNotExist() {
        return this.innerProperties() == null
            ? null
            : this.innerProperties().createDefaultAvailabilityGroupIfNotExist();
    }

    /**
     * Set the createDefaultAvailabilityGroupIfNotExist property: Create a default availability group if it does not
     * exist.
     * 
     * @param createDefaultAvailabilityGroupIfNotExist the createDefaultAvailabilityGroupIfNotExist value to set.
     * @return the AvailabilityGroupListenerInner object itself.
     */
    public AvailabilityGroupListenerInner
        withCreateDefaultAvailabilityGroupIfNotExist(Boolean createDefaultAvailabilityGroupIfNotExist) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AvailabilityGroupListenerProperties();
        }
        this.innerProperties().withCreateDefaultAvailabilityGroupIfNotExist(createDefaultAvailabilityGroupIfNotExist);
        return this;
    }

    /**
     * Get the port property: Listener port.
     * 
     * @return the port value.
     */
    public Integer port() {
        return this.innerProperties() == null ? null : this.innerProperties().port();
    }

    /**
     * Set the port property: Listener port.
     * 
     * @param port the port value to set.
     * @return the AvailabilityGroupListenerInner object itself.
     */
    public AvailabilityGroupListenerInner withPort(Integer port) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AvailabilityGroupListenerProperties();
        }
        this.innerProperties().withPort(port);
        return this;
    }

    /**
     * Get the availabilityGroupConfiguration property: Availability Group configuration.
     * 
     * @return the availabilityGroupConfiguration value.
     */
    public AgConfiguration availabilityGroupConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().availabilityGroupConfiguration();
    }

    /**
     * Set the availabilityGroupConfiguration property: Availability Group configuration.
     * 
     * @param availabilityGroupConfiguration the availabilityGroupConfiguration value to set.
     * @return the AvailabilityGroupListenerInner object itself.
     */
    public AvailabilityGroupListenerInner
        withAvailabilityGroupConfiguration(AgConfiguration availabilityGroupConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AvailabilityGroupListenerProperties();
        }
        this.innerProperties().withAvailabilityGroupConfiguration(availabilityGroupConfiguration);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AvailabilityGroupListenerInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AvailabilityGroupListenerInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AvailabilityGroupListenerInner.
     */
    public static AvailabilityGroupListenerInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AvailabilityGroupListenerInner deserializedAvailabilityGroupListenerInner
                = new AvailabilityGroupListenerInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedAvailabilityGroupListenerInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedAvailabilityGroupListenerInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedAvailabilityGroupListenerInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedAvailabilityGroupListenerInner.innerProperties
                        = AvailabilityGroupListenerProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedAvailabilityGroupListenerInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAvailabilityGroupListenerInner;
        });
    }
}
