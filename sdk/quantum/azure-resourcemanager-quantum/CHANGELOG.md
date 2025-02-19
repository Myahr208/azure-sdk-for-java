# Release History

## 1.0.0-beta.4 (Unreleased)

### Features Added

### Breaking Changes

### Bugs Fixed

### Other Changes

## 1.0.0-beta.3 (2024-12-03)

- Azure Resource Manager AzureQuantum client library for Java. This package contains Microsoft Azure SDK for AzureQuantum Management SDK.  Package tag package-2023-11-13-preview. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### Serialization/Deserialization change

- `Jackson` is removed from dependency and no longer supported.

##### Migration Guide

If you are using `Jackson`/`ObjectMapper` for manual serialization/deserialization, configure your `ObjectMapper` for backward compatibility:
```java
objectMapper.registerModule(com.azure.core.serializer.json.jackson.JacksonJsonProvider.getJsonSerializableDatabindModule());
```

#### `models.QuantumWorkspace$Definition` was modified

* `withStorageAccount(java.lang.String)` was removed
* `withProviders(java.util.List)` was removed
* `withApiKeyEnabled(java.lang.Boolean)` was removed

#### `models.QuantumWorkspace` was modified

* `apiKeyEnabled()` was removed
* `storageAccount()` was removed
* `provisioningState()` was removed
* `providers()` was removed
* `usable()` was removed
* `endpointUri()` was removed

### Features Added

* `models.WorkspaceResourceProperties` was added

#### `models.QuantumWorkspace$Definition` was modified

* `withProperties(models.WorkspaceResourceProperties)` was added

#### `models.QuantumWorkspace` was modified

* `properties()` was added

## 1.0.0-beta.2 (2024-03-15)

- Azure Resource Manager AzureQuantum client library for Java. This package contains Microsoft Azure SDK for AzureQuantum Management SDK.  Package tag package-2023-11-13-preview. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

* `models.ApiKey` was added

* `models.ApiKeys` was added

* `models.ListKeysResult` was added

* `models.KeyType` was added

#### `models.QuantumWorkspace$Definition` was modified

* `withApiKeyEnabled(java.lang.Boolean)` was added

#### `models.WorkspaceOperations` was modified

* `regenerateKeysWithResponse(java.lang.String,java.lang.String,models.ApiKeys,com.azure.core.util.Context)` was added
* `listKeys(java.lang.String,java.lang.String)` was added
* `listKeysWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `regenerateKeys(java.lang.String,java.lang.String,models.ApiKeys)` was added

#### `models.QuantumWorkspace` was modified

* `apiKeyEnabled()` was added

## 1.0.0-beta.1 (2023-07-21)

- Azure Resource Manager AzureQuantum client library for Java. This package contains Microsoft Azure SDK for AzureQuantum Management SDK.  Package tag package-2022-01-10-preview. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).
