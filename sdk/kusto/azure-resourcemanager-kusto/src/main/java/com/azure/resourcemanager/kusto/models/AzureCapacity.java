// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Azure capacity definition.
 */
@Fluent
public final class AzureCapacity implements JsonSerializable<AzureCapacity> {
    /*
     * Scale type.
     */
    private AzureScaleType scaleType;

    /*
     * Minimum allowed capacity.
     */
    private int minimum;

    /*
     * Maximum allowed capacity.
     */
    private int maximum;

    /*
     * The default capacity that would be used.
     */
    private int defaultProperty;

    /**
     * Creates an instance of AzureCapacity class.
     */
    public AzureCapacity() {
    }

    /**
     * Get the scaleType property: Scale type.
     * 
     * @return the scaleType value.
     */
    public AzureScaleType scaleType() {
        return this.scaleType;
    }

    /**
     * Set the scaleType property: Scale type.
     * 
     * @param scaleType the scaleType value to set.
     * @return the AzureCapacity object itself.
     */
    public AzureCapacity withScaleType(AzureScaleType scaleType) {
        this.scaleType = scaleType;
        return this;
    }

    /**
     * Get the minimum property: Minimum allowed capacity.
     * 
     * @return the minimum value.
     */
    public int minimum() {
        return this.minimum;
    }

    /**
     * Set the minimum property: Minimum allowed capacity.
     * 
     * @param minimum the minimum value to set.
     * @return the AzureCapacity object itself.
     */
    public AzureCapacity withMinimum(int minimum) {
        this.minimum = minimum;
        return this;
    }

    /**
     * Get the maximum property: Maximum allowed capacity.
     * 
     * @return the maximum value.
     */
    public int maximum() {
        return this.maximum;
    }

    /**
     * Set the maximum property: Maximum allowed capacity.
     * 
     * @param maximum the maximum value to set.
     * @return the AzureCapacity object itself.
     */
    public AzureCapacity withMaximum(int maximum) {
        this.maximum = maximum;
        return this;
    }

    /**
     * Get the defaultProperty property: The default capacity that would be used.
     * 
     * @return the defaultProperty value.
     */
    public int defaultProperty() {
        return this.defaultProperty;
    }

    /**
     * Set the defaultProperty property: The default capacity that would be used.
     * 
     * @param defaultProperty the defaultProperty value to set.
     * @return the AzureCapacity object itself.
     */
    public AzureCapacity withDefaultProperty(int defaultProperty) {
        this.defaultProperty = defaultProperty;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (scaleType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property scaleType in model AzureCapacity"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureCapacity.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("scaleType", this.scaleType == null ? null : this.scaleType.toString());
        jsonWriter.writeIntField("minimum", this.minimum);
        jsonWriter.writeIntField("maximum", this.maximum);
        jsonWriter.writeIntField("default", this.defaultProperty);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureCapacity from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureCapacity if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AzureCapacity.
     */
    public static AzureCapacity fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureCapacity deserializedAzureCapacity = new AzureCapacity();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("scaleType".equals(fieldName)) {
                    deserializedAzureCapacity.scaleType = AzureScaleType.fromString(reader.getString());
                } else if ("minimum".equals(fieldName)) {
                    deserializedAzureCapacity.minimum = reader.getInt();
                } else if ("maximum".equals(fieldName)) {
                    deserializedAzureCapacity.maximum = reader.getInt();
                } else if ("default".equals(fieldName)) {
                    deserializedAzureCapacity.defaultProperty = reader.getInt();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureCapacity;
        });
    }
}
