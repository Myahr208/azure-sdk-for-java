// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Telegram channel definition.
 */
@Fluent
public final class TelegramChannel extends Channel {
    /*
     * The channel name
     */
    private String channelName = "TelegramChannel";

    /*
     * The set of properties specific to Telegram channel resource
     */
    private TelegramChannelProperties properties;

    /**
     * Creates an instance of TelegramChannel class.
     */
    public TelegramChannel() {
    }

    /**
     * Get the channelName property: The channel name.
     * 
     * @return the channelName value.
     */
    @Override
    public String channelName() {
        return this.channelName;
    }

    /**
     * Get the properties property: The set of properties specific to Telegram channel resource.
     * 
     * @return the properties value.
     */
    public TelegramChannelProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The set of properties specific to Telegram channel resource.
     * 
     * @param properties the properties value to set.
     * @return the TelegramChannel object itself.
     */
    public TelegramChannel withProperties(TelegramChannelProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TelegramChannel withEtag(String etag) {
        super.withEtag(etag);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TelegramChannel withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("etag", etag());
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeStringField("channelName", this.channelName);
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TelegramChannel from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TelegramChannel if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the TelegramChannel.
     */
    public static TelegramChannel fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TelegramChannel deserializedTelegramChannel = new TelegramChannel();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("etag".equals(fieldName)) {
                    deserializedTelegramChannel.withEtag(reader.getString());
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedTelegramChannel.withProvisioningState(reader.getString());
                } else if ("location".equals(fieldName)) {
                    deserializedTelegramChannel.withLocation(reader.getString());
                } else if ("channelName".equals(fieldName)) {
                    deserializedTelegramChannel.channelName = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedTelegramChannel.properties = TelegramChannelProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTelegramChannel;
        });
    }
}
