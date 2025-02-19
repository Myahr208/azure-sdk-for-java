// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.timeseriesinsights.fluent.models.Gen1EnvironmentCreationProperties;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

/**
 * Parameters supplied to the Create or Update Environment operation for a Gen1 environment.
 */
@Fluent
public final class Gen1EnvironmentCreateOrUpdateParameters extends EnvironmentCreateOrUpdateParameters {
    /*
     * The kind of the environment.
     */
    private EnvironmentKind kind = EnvironmentKind.GEN1;

    /*
     * Properties used to create a Gen1 environment.
     */
    private Gen1EnvironmentCreationProperties innerProperties = new Gen1EnvironmentCreationProperties();

    /**
     * Creates an instance of Gen1EnvironmentCreateOrUpdateParameters class.
     */
    public Gen1EnvironmentCreateOrUpdateParameters() {
    }

    /**
     * Get the kind property: The kind of the environment.
     * 
     * @return the kind value.
     */
    @Override
    public EnvironmentKind kind() {
        return this.kind;
    }

    /**
     * Get the innerProperties property: Properties used to create a Gen1 environment.
     * 
     * @return the innerProperties value.
     */
    private Gen1EnvironmentCreationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Gen1EnvironmentCreateOrUpdateParameters withSku(Sku sku) {
        super.withSku(sku);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Gen1EnvironmentCreateOrUpdateParameters withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Gen1EnvironmentCreateOrUpdateParameters withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the dataRetentionTime property: ISO8601 timespan specifying the minimum number of days the environment's
     * events will be available for query.
     * 
     * @return the dataRetentionTime value.
     */
    public Duration dataRetentionTime() {
        return this.innerProperties() == null ? null : this.innerProperties().dataRetentionTime();
    }

    /**
     * Set the dataRetentionTime property: ISO8601 timespan specifying the minimum number of days the environment's
     * events will be available for query.
     * 
     * @param dataRetentionTime the dataRetentionTime value to set.
     * @return the Gen1EnvironmentCreateOrUpdateParameters object itself.
     */
    public Gen1EnvironmentCreateOrUpdateParameters withDataRetentionTime(Duration dataRetentionTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new Gen1EnvironmentCreationProperties();
        }
        this.innerProperties().withDataRetentionTime(dataRetentionTime);
        return this;
    }

    /**
     * Get the storageLimitExceededBehavior property: The behavior the Time Series Insights service should take when the
     * environment's capacity has been exceeded. If "PauseIngress" is specified, new events will not be read from the
     * event source. If "PurgeOldData" is specified, new events will continue to be read and old events will be deleted
     * from the environment. The default behavior is PurgeOldData.
     * 
     * @return the storageLimitExceededBehavior value.
     */
    public StorageLimitExceededBehavior storageLimitExceededBehavior() {
        return this.innerProperties() == null ? null : this.innerProperties().storageLimitExceededBehavior();
    }

    /**
     * Set the storageLimitExceededBehavior property: The behavior the Time Series Insights service should take when the
     * environment's capacity has been exceeded. If "PauseIngress" is specified, new events will not be read from the
     * event source. If "PurgeOldData" is specified, new events will continue to be read and old events will be deleted
     * from the environment. The default behavior is PurgeOldData.
     * 
     * @param storageLimitExceededBehavior the storageLimitExceededBehavior value to set.
     * @return the Gen1EnvironmentCreateOrUpdateParameters object itself.
     */
    public Gen1EnvironmentCreateOrUpdateParameters
        withStorageLimitExceededBehavior(StorageLimitExceededBehavior storageLimitExceededBehavior) {
        if (this.innerProperties() == null) {
            this.innerProperties = new Gen1EnvironmentCreationProperties();
        }
        this.innerProperties().withStorageLimitExceededBehavior(storageLimitExceededBehavior);
        return this;
    }

    /**
     * Get the partitionKeyProperties property: The list of event properties which will be used to partition data in the
     * environment. Currently, only a single partition key property is supported.
     * 
     * @return the partitionKeyProperties value.
     */
    public List<TimeSeriesIdProperty> partitionKeyProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().partitionKeyProperties();
    }

    /**
     * Set the partitionKeyProperties property: The list of event properties which will be used to partition data in the
     * environment. Currently, only a single partition key property is supported.
     * 
     * @param partitionKeyProperties the partitionKeyProperties value to set.
     * @return the Gen1EnvironmentCreateOrUpdateParameters object itself.
     */
    public Gen1EnvironmentCreateOrUpdateParameters
        withPartitionKeyProperties(List<TimeSeriesIdProperty> partitionKeyProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new Gen1EnvironmentCreationProperties();
        }
        this.innerProperties().withPartitionKeyProperties(partitionKeyProperties);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerProperties in model Gen1EnvironmentCreateOrUpdateParameters"));
        } else {
            innerProperties().validate();
        }
        if (location() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property location in model Gen1EnvironmentCreateOrUpdateParameters"));
        }
        if (sku() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property sku in model Gen1EnvironmentCreateOrUpdateParameters"));
        } else {
            sku().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(Gen1EnvironmentCreateOrUpdateParameters.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeJsonField("sku", sku());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Gen1EnvironmentCreateOrUpdateParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Gen1EnvironmentCreateOrUpdateParameters if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the Gen1EnvironmentCreateOrUpdateParameters.
     */
    public static Gen1EnvironmentCreateOrUpdateParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Gen1EnvironmentCreateOrUpdateParameters deserializedGen1EnvironmentCreateOrUpdateParameters
                = new Gen1EnvironmentCreateOrUpdateParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("location".equals(fieldName)) {
                    deserializedGen1EnvironmentCreateOrUpdateParameters.withLocation(reader.getString());
                } else if ("sku".equals(fieldName)) {
                    deserializedGen1EnvironmentCreateOrUpdateParameters.withSku(Sku.fromJson(reader));
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedGen1EnvironmentCreateOrUpdateParameters.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedGen1EnvironmentCreateOrUpdateParameters.innerProperties
                        = Gen1EnvironmentCreationProperties.fromJson(reader);
                } else if ("kind".equals(fieldName)) {
                    deserializedGen1EnvironmentCreateOrUpdateParameters.kind
                        = EnvironmentKind.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGen1EnvironmentCreateOrUpdateParameters;
        });
    }
}
