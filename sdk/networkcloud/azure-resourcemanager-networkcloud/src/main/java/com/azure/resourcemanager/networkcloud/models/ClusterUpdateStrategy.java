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
 * ClusterUpdateStrategy represents the strategy for updating the cluster.
 */
@Fluent
public final class ClusterUpdateStrategy implements JsonSerializable<ClusterUpdateStrategy> {
    /*
     * The maximum number of worker nodes that can be offline within the increment of update, e.g., rack-by-rack.
     * Limited by the maximum number of machines in the increment. Defaults to the whole increment size.
     */
    private Long maxUnavailable;

    /*
     * The mode of operation for runtime protection.
     */
    private ClusterUpdateStrategyType strategyType;

    /*
     * Selection of how the threshold should be evaluated.
     */
    private ValidationThresholdType thresholdType;

    /*
     * The numeric threshold value.
     */
    private long thresholdValue;

    /*
     * The time to wait between the increments of update defined by the strategy.
     */
    private Long waitTimeMinutes;

    /**
     * Creates an instance of ClusterUpdateStrategy class.
     */
    public ClusterUpdateStrategy() {
    }

    /**
     * Get the maxUnavailable property: The maximum number of worker nodes that can be offline within the increment of
     * update, e.g., rack-by-rack.
     * Limited by the maximum number of machines in the increment. Defaults to the whole increment size.
     * 
     * @return the maxUnavailable value.
     */
    public Long maxUnavailable() {
        return this.maxUnavailable;
    }

    /**
     * Set the maxUnavailable property: The maximum number of worker nodes that can be offline within the increment of
     * update, e.g., rack-by-rack.
     * Limited by the maximum number of machines in the increment. Defaults to the whole increment size.
     * 
     * @param maxUnavailable the maxUnavailable value to set.
     * @return the ClusterUpdateStrategy object itself.
     */
    public ClusterUpdateStrategy withMaxUnavailable(Long maxUnavailable) {
        this.maxUnavailable = maxUnavailable;
        return this;
    }

    /**
     * Get the strategyType property: The mode of operation for runtime protection.
     * 
     * @return the strategyType value.
     */
    public ClusterUpdateStrategyType strategyType() {
        return this.strategyType;
    }

    /**
     * Set the strategyType property: The mode of operation for runtime protection.
     * 
     * @param strategyType the strategyType value to set.
     * @return the ClusterUpdateStrategy object itself.
     */
    public ClusterUpdateStrategy withStrategyType(ClusterUpdateStrategyType strategyType) {
        this.strategyType = strategyType;
        return this;
    }

    /**
     * Get the thresholdType property: Selection of how the threshold should be evaluated.
     * 
     * @return the thresholdType value.
     */
    public ValidationThresholdType thresholdType() {
        return this.thresholdType;
    }

    /**
     * Set the thresholdType property: Selection of how the threshold should be evaluated.
     * 
     * @param thresholdType the thresholdType value to set.
     * @return the ClusterUpdateStrategy object itself.
     */
    public ClusterUpdateStrategy withThresholdType(ValidationThresholdType thresholdType) {
        this.thresholdType = thresholdType;
        return this;
    }

    /**
     * Get the thresholdValue property: The numeric threshold value.
     * 
     * @return the thresholdValue value.
     */
    public long thresholdValue() {
        return this.thresholdValue;
    }

    /**
     * Set the thresholdValue property: The numeric threshold value.
     * 
     * @param thresholdValue the thresholdValue value to set.
     * @return the ClusterUpdateStrategy object itself.
     */
    public ClusterUpdateStrategy withThresholdValue(long thresholdValue) {
        this.thresholdValue = thresholdValue;
        return this;
    }

    /**
     * Get the waitTimeMinutes property: The time to wait between the increments of update defined by the strategy.
     * 
     * @return the waitTimeMinutes value.
     */
    public Long waitTimeMinutes() {
        return this.waitTimeMinutes;
    }

    /**
     * Set the waitTimeMinutes property: The time to wait between the increments of update defined by the strategy.
     * 
     * @param waitTimeMinutes the waitTimeMinutes value to set.
     * @return the ClusterUpdateStrategy object itself.
     */
    public ClusterUpdateStrategy withWaitTimeMinutes(Long waitTimeMinutes) {
        this.waitTimeMinutes = waitTimeMinutes;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (strategyType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property strategyType in model ClusterUpdateStrategy"));
        }
        if (thresholdType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property thresholdType in model ClusterUpdateStrategy"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ClusterUpdateStrategy.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("strategyType", this.strategyType == null ? null : this.strategyType.toString());
        jsonWriter.writeStringField("thresholdType", this.thresholdType == null ? null : this.thresholdType.toString());
        jsonWriter.writeLongField("thresholdValue", this.thresholdValue);
        jsonWriter.writeNumberField("maxUnavailable", this.maxUnavailable);
        jsonWriter.writeNumberField("waitTimeMinutes", this.waitTimeMinutes);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClusterUpdateStrategy from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClusterUpdateStrategy if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ClusterUpdateStrategy.
     */
    public static ClusterUpdateStrategy fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClusterUpdateStrategy deserializedClusterUpdateStrategy = new ClusterUpdateStrategy();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("strategyType".equals(fieldName)) {
                    deserializedClusterUpdateStrategy.strategyType
                        = ClusterUpdateStrategyType.fromString(reader.getString());
                } else if ("thresholdType".equals(fieldName)) {
                    deserializedClusterUpdateStrategy.thresholdType
                        = ValidationThresholdType.fromString(reader.getString());
                } else if ("thresholdValue".equals(fieldName)) {
                    deserializedClusterUpdateStrategy.thresholdValue = reader.getLong();
                } else if ("maxUnavailable".equals(fieldName)) {
                    deserializedClusterUpdateStrategy.maxUnavailable = reader.getNullable(JsonReader::getLong);
                } else if ("waitTimeMinutes".equals(fieldName)) {
                    deserializedClusterUpdateStrategy.waitTimeMinutes = reader.getNullable(JsonReader::getLong);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClusterUpdateStrategy;
        });
    }
}
