// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * ValidationThreshold indicates allowed machine and node hardware and deployment failures.
 */
@Fluent
public final class ValidationThreshold implements JsonSerializable<ValidationThreshold> {
    /*
     * Selection of how the type evaluation is applied to the cluster calculation.
     */
    private ValidationThresholdGrouping grouping;

    /*
     * Selection of how the threshold should be evaluated.
     */
    private ValidationThresholdType type;

    /*
     * The numeric threshold value.
     */
    private long value;

    /**
     * Creates an instance of ValidationThreshold class.
     */
    public ValidationThreshold() {
    }

    /**
     * Get the grouping property: Selection of how the type evaluation is applied to the cluster calculation.
     * 
     * @return the grouping value.
     */
    public ValidationThresholdGrouping grouping() {
        return this.grouping;
    }

    /**
     * Set the grouping property: Selection of how the type evaluation is applied to the cluster calculation.
     * 
     * @param grouping the grouping value to set.
     * @return the ValidationThreshold object itself.
     */
    public ValidationThreshold withGrouping(ValidationThresholdGrouping grouping) {
        this.grouping = grouping;
        return this;
    }

    /**
     * Get the type property: Selection of how the threshold should be evaluated.
     * 
     * @return the type value.
     */
    public ValidationThresholdType type() {
        return this.type;
    }

    /**
     * Set the type property: Selection of how the threshold should be evaluated.
     * 
     * @param type the type value to set.
     * @return the ValidationThreshold object itself.
     */
    public ValidationThreshold withType(ValidationThresholdType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the value property: The numeric threshold value.
     * 
     * @return the value value.
     */
    public long value() {
        return this.value;
    }

    /**
     * Set the value property: The numeric threshold value.
     * 
     * @param value the value value to set.
     * @return the ValidationThreshold object itself.
     */
    public ValidationThreshold withValue(long value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (grouping() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property grouping in model ValidationThreshold"));
        }
        if (type() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property type in model ValidationThreshold"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ValidationThreshold.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("grouping", this.grouping == null ? null : this.grouping.toString());
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeLongField("value", this.value);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ValidationThreshold from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ValidationThreshold if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ValidationThreshold.
     */
    public static ValidationThreshold fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ValidationThreshold deserializedValidationThreshold = new ValidationThreshold();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("grouping".equals(fieldName)) {
                    deserializedValidationThreshold.grouping
                        = ValidationThresholdGrouping.fromString(reader.getString());
                } else if ("type".equals(fieldName)) {
                    deserializedValidationThreshold.type = ValidationThresholdType.fromString(reader.getString());
                } else if ("value".equals(fieldName)) {
                    deserializedValidationThreshold.value = reader.getLong();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedValidationThreshold;
        });
    }
}
