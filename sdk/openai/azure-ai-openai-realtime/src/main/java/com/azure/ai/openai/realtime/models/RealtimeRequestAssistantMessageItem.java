// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.realtime.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The RealtimeRequestAssistantMessageItem model.
 */
@Fluent
public final class RealtimeRequestAssistantMessageItem extends RealtimeRequestMessageItem {

    /*
     * The type property.
     */
    @Generated
    private RealtimeItemType type = RealtimeItemType.MESSAGE;

    /*
     * The role property.
     */
    @Generated
    private RealtimeMessageRole role = RealtimeMessageRole.ASSISTANT;

    /*
     * The content property.
     */
    @Generated
    private final List<RealtimeRequestTextContentPart> content;

    /**
     * Creates an instance of RealtimeRequestAssistantMessageItem class.
     *
     * @param content the content value to set.
     */
    @Generated
    public RealtimeRequestAssistantMessageItem(List<RealtimeRequestTextContentPart> content) {
        this.content = content;
    }

    /**
     * Get the type property: The type property.
     *
     * @return the type value.
     */
    @Generated
    @Override
    public RealtimeItemType getType() {
        return this.type;
    }

    /**
     * Get the role property: The role property.
     *
     * @return the role value.
     */
    @Generated
    @Override
    public RealtimeMessageRole getRole() {
        return this.role;
    }

    /**
     * Get the content property: The content property.
     *
     * @return the content value.
     */
    @Generated
    public List<RealtimeRequestTextContentPart> getContent() {
        return this.content;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public RealtimeRequestAssistantMessageItem setStatus(RealtimeItemStatus status) {
        super.setStatus(status);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public RealtimeRequestAssistantMessageItem setId(String id) {
        super.setId(id);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeStringField("id", getId());
        jsonWriter.writeStringField("status", getStatus() == null ? null : getStatus().toString());
        jsonWriter.writeArrayField("content", this.content, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("role", this.role == null ? null : this.role.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RealtimeRequestAssistantMessageItem from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of RealtimeRequestAssistantMessageItem if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RealtimeRequestAssistantMessageItem.
     */
    @Generated
    public static RealtimeRequestAssistantMessageItem fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String id = null;
            RealtimeItemStatus status = null;
            List<RealtimeRequestTextContentPart> content = null;
            RealtimeMessageRole role = RealtimeMessageRole.ASSISTANT;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("id".equals(fieldName)) {
                    id = reader.getString();
                } else if ("status".equals(fieldName)) {
                    status = RealtimeItemStatus.fromString(reader.getString());
                } else if ("content".equals(fieldName)) {
                    content = reader.readArray(reader1 -> RealtimeRequestTextContentPart.fromJson(reader1));
                } else if ("role".equals(fieldName)) {
                    role = RealtimeMessageRole.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            RealtimeRequestAssistantMessageItem deserializedRealtimeRequestAssistantMessageItem
                = new RealtimeRequestAssistantMessageItem(content);
            deserializedRealtimeRequestAssistantMessageItem.setId(id);
            deserializedRealtimeRequestAssistantMessageItem.setStatus(status);
            deserializedRealtimeRequestAssistantMessageItem.role = role;
            return deserializedRealtimeRequestAssistantMessageItem;
        });
    }
}
