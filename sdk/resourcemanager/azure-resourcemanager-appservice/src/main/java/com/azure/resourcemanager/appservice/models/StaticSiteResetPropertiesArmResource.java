// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.fluent.models.StaticSiteResetPropertiesArmResourceProperties;
import java.io.IOException;

/**
 * Static Site Reset Properties ARM resource.
 */
@Fluent
public final class StaticSiteResetPropertiesArmResource extends ProxyOnlyResource {
    /*
     * StaticSiteResetPropertiesARMResource resource specific properties
     */
    private StaticSiteResetPropertiesArmResourceProperties innerProperties;

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
     * Creates an instance of StaticSiteResetPropertiesArmResource class.
     */
    public StaticSiteResetPropertiesArmResource() {
    }

    /**
     * Get the innerProperties property: StaticSiteResetPropertiesARMResource resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private StaticSiteResetPropertiesArmResourceProperties innerProperties() {
        return this.innerProperties;
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
     * {@inheritDoc}
     */
    @Override
    public StaticSiteResetPropertiesArmResource withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the repositoryToken property: The token which proves admin privileges to the repository.
     * 
     * @return the repositoryToken value.
     */
    public String repositoryToken() {
        return this.innerProperties() == null ? null : this.innerProperties().repositoryToken();
    }

    /**
     * Set the repositoryToken property: The token which proves admin privileges to the repository.
     * 
     * @param repositoryToken the repositoryToken value to set.
     * @return the StaticSiteResetPropertiesArmResource object itself.
     */
    public StaticSiteResetPropertiesArmResource withRepositoryToken(String repositoryToken) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StaticSiteResetPropertiesArmResourceProperties();
        }
        this.innerProperties().withRepositoryToken(repositoryToken);
        return this;
    }

    /**
     * Get the shouldUpdateRepository property: Determines whether the repository should be updated with the new
     * properties.
     * 
     * @return the shouldUpdateRepository value.
     */
    public Boolean shouldUpdateRepository() {
        return this.innerProperties() == null ? null : this.innerProperties().shouldUpdateRepository();
    }

    /**
     * Set the shouldUpdateRepository property: Determines whether the repository should be updated with the new
     * properties.
     * 
     * @param shouldUpdateRepository the shouldUpdateRepository value to set.
     * @return the StaticSiteResetPropertiesArmResource object itself.
     */
    public StaticSiteResetPropertiesArmResource withShouldUpdateRepository(Boolean shouldUpdateRepository) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StaticSiteResetPropertiesArmResourceProperties();
        }
        this.innerProperties().withShouldUpdateRepository(shouldUpdateRepository);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
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
        jsonWriter.writeStringField("kind", kind());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StaticSiteResetPropertiesArmResource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StaticSiteResetPropertiesArmResource if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the StaticSiteResetPropertiesArmResource.
     */
    public static StaticSiteResetPropertiesArmResource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StaticSiteResetPropertiesArmResource deserializedStaticSiteResetPropertiesArmResource
                = new StaticSiteResetPropertiesArmResource();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedStaticSiteResetPropertiesArmResource.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedStaticSiteResetPropertiesArmResource.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedStaticSiteResetPropertiesArmResource.type = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedStaticSiteResetPropertiesArmResource.withKind(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedStaticSiteResetPropertiesArmResource.innerProperties
                        = StaticSiteResetPropertiesArmResourceProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStaticSiteResetPropertiesArmResource;
        });
    }
}
