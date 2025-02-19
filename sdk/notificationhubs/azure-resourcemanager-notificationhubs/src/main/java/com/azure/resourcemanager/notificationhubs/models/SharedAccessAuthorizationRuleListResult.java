// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.notificationhubs.fluent.models.SharedAccessAuthorizationRuleResourceInner;
import java.io.IOException;
import java.util.List;

/**
 * The response of the List Namespace operation.
 */
@Fluent
public final class SharedAccessAuthorizationRuleListResult
    implements JsonSerializable<SharedAccessAuthorizationRuleListResult> {
    /*
     * Result of the List AuthorizationRules operation.
     */
    private List<SharedAccessAuthorizationRuleResourceInner> value;

    /*
     * Link to the next set of results. Not empty if Value contains incomplete list of AuthorizationRules
     */
    private String nextLink;

    /**
     * Creates an instance of SharedAccessAuthorizationRuleListResult class.
     */
    public SharedAccessAuthorizationRuleListResult() {
    }

    /**
     * Get the value property: Result of the List AuthorizationRules operation.
     * 
     * @return the value value.
     */
    public List<SharedAccessAuthorizationRuleResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Result of the List AuthorizationRules operation.
     * 
     * @param value the value value to set.
     * @return the SharedAccessAuthorizationRuleListResult object itself.
     */
    public SharedAccessAuthorizationRuleListResult withValue(List<SharedAccessAuthorizationRuleResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to the next set of results. Not empty if Value contains incomplete list of
     * AuthorizationRules.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link to the next set of results. Not empty if Value contains incomplete list of
     * AuthorizationRules.
     * 
     * @param nextLink the nextLink value to set.
     * @return the SharedAccessAuthorizationRuleListResult object itself.
     */
    public SharedAccessAuthorizationRuleListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SharedAccessAuthorizationRuleListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SharedAccessAuthorizationRuleListResult if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SharedAccessAuthorizationRuleListResult.
     */
    public static SharedAccessAuthorizationRuleListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SharedAccessAuthorizationRuleListResult deserializedSharedAccessAuthorizationRuleListResult
                = new SharedAccessAuthorizationRuleListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<SharedAccessAuthorizationRuleResourceInner> value
                        = reader.readArray(reader1 -> SharedAccessAuthorizationRuleResourceInner.fromJson(reader1));
                    deserializedSharedAccessAuthorizationRuleListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedSharedAccessAuthorizationRuleListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSharedAccessAuthorizationRuleListResult;
        });
    }
}
