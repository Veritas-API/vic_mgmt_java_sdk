# PoliciesApi

All URIs are relative to *http://veritas-nonprod-dev.apigee.net/vic/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPolicy**](PoliciesApi.md#createPolicy) | **POST** /management/policies | Create policy
[**deletePolicy**](PoliciesApi.md#deletePolicy) | **DELETE** /management/policies/{id} | Delete policy
[**getMetadataDefinitions**](PoliciesApi.md#getMetadataDefinitions) | **GET** /management/policies/metadata | List metadata definitions
[**getPolicy**](PoliciesApi.md#getPolicy) | **GET** /management/policies/{id} | Get policy
[**getPolicyCollection**](PoliciesApi.md#getPolicyCollection) | **GET** /management/policies | List policies
[**patchPolicy**](PoliciesApi.md#patchPolicy) | **PATCH** /management/policies/{id} | Patch policy
[**resetPolicy**](PoliciesApi.md#resetPolicy) | **DELETE** /management/policies/{id}/overrides | Reset policy to defaults
[**updatePolicy**](PoliciesApi.md#updatePolicy) | **PUT** /management/policies/{id} | Update policy


<a name="createPolicy"></a>
# **createPolicy**
> Policy createPolicy(body, tenantId)

Create policy

Create a custom policy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PoliciesApi;


PoliciesApi apiInstance = new PoliciesApi();
Policy body = new Policy(); // Policy | New policy
String tenantId = "_Default"; // String | The tenant identifier
try {
    Policy result = apiInstance.createPolicy(body, tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoliciesApi#createPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Policy**](Policy.md)| New policy |
 **tenantId** | **String**| The tenant identifier | [optional] [default to _Default]

### Return type

[**Policy**](Policy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePolicy"></a>
# **deletePolicy**
> deletePolicy(id, tenantId)

Delete policy

Delete a custom policy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PoliciesApi;


PoliciesApi apiInstance = new PoliciesApi();
String id = "id_example"; // String | The policy identifier
String tenantId = "_Default"; // String | The tenant identifier
try {
    apiInstance.deletePolicy(id, tenantId);
} catch (ApiException e) {
    System.err.println("Exception when calling PoliciesApi#deletePolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The policy identifier |
 **tenantId** | **String**| The tenant identifier | [optional] [default to _Default]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getMetadataDefinitions"></a>
# **getMetadataDefinitions**
> MetadataDefinitionCollection getMetadataDefinitions(tenantId)

List metadata definitions



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PoliciesApi;


PoliciesApi apiInstance = new PoliciesApi();
String tenantId = "_Default"; // String | The tenant identifier
try {
    MetadataDefinitionCollection result = apiInstance.getMetadataDefinitions(tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoliciesApi#getMetadataDefinitions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **String**| The tenant identifier | [optional] [default to _Default]

### Return type

[**MetadataDefinitionCollection**](MetadataDefinitionCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPolicy"></a>
# **getPolicy**
> Policy getPolicy(id, tenantId)

Get policy

Retrieve a policy

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PoliciesApi;


PoliciesApi apiInstance = new PoliciesApi();
String id = "id_example"; // String | The policy identifier
String tenantId = "_Default"; // String | The tenant identifier
try {
    Policy result = apiInstance.getPolicy(id, tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoliciesApi#getPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The policy identifier |
 **tenantId** | **String**| The tenant identifier | [optional] [default to _Default]

### Return type

[**Policy**](Policy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPolicyCollection"></a>
# **getPolicyCollection**
> PolicyCollection getPolicyCollection(tenantId, includeDisabled, includeEngineBody, ifNoneMatch)

List policies

Retrieve the policies for a tenant.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PoliciesApi;


PoliciesApi apiInstance = new PoliciesApi();
String tenantId = "_Default"; // String | The tenant identifier
Boolean includeDisabled = true; // Boolean | Include disabled policies (as well as enabled ones)
Boolean includeEngineBody = true; // Boolean | Include the engine body for policies, and the engine rule sets.
String ifNoneMatch = "ifNoneMatch_example"; // String | 
try {
    PolicyCollection result = apiInstance.getPolicyCollection(tenantId, includeDisabled, includeEngineBody, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoliciesApi#getPolicyCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **String**| The tenant identifier | [optional] [default to _Default]
 **includeDisabled** | **Boolean**| Include disabled policies (as well as enabled ones) | [optional]
 **includeEngineBody** | **Boolean**| Include the engine body for policies, and the engine rule sets. | [optional]
 **ifNoneMatch** | **String**|  | [optional]

### Return type

[**PolicyCollection**](PolicyCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="patchPolicy"></a>
# **patchPolicy**
> Policy patchPolicy(id, patch, tenantId)

Patch policy

Update part of a policy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PoliciesApi;


PoliciesApi apiInstance = new PoliciesApi();
String id = "id_example"; // String | The policy identifier
List<JsonPatchDocument> patch = Arrays.asList(new JsonPatchDocument()); // List<JsonPatchDocument> | A patch containing instructions for how the policy should be modified. See RFC 6902.
String tenantId = "_Default"; // String | The tenant identifier
try {
    Policy result = apiInstance.patchPolicy(id, patch, tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoliciesApi#patchPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The policy identifier |
 **patch** | [**List&lt;JsonPatchDocument&gt;**](JsonPatchDocument.md)| A patch containing instructions for how the policy should be modified. See RFC 6902. |
 **tenantId** | **String**| The tenant identifier | [optional] [default to _Default]

### Return type

[**Policy**](Policy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/json-patch+json
 - **Accept**: application/json

<a name="resetPolicy"></a>
# **resetPolicy**
> resetPolicy(id, tenantId)

Reset policy to defaults

Reset a policy to its default settings.  Only valid for built-in policies.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PoliciesApi;


PoliciesApi apiInstance = new PoliciesApi();
String id = "id_example"; // String | The policy identifier
String tenantId = "_Default"; // String | The tenant identifier
try {
    apiInstance.resetPolicy(id, tenantId);
} catch (ApiException e) {
    System.err.println("Exception when calling PoliciesApi#resetPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The policy identifier |
 **tenantId** | **String**| The tenant identifier | [optional] [default to _Default]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updatePolicy"></a>
# **updatePolicy**
> Policy updatePolicy(id, body, tenantId)

Update policy

Update a policy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PoliciesApi;


PoliciesApi apiInstance = new PoliciesApi();
String id = "id_example"; // String | The policy identifier
Policy body = new Policy(); // Policy | Updated policy
String tenantId = "_Default"; // String | The tenant identifier
try {
    Policy result = apiInstance.updatePolicy(id, body, tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoliciesApi#updatePolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The policy identifier |
 **body** | [**Policy**](Policy.md)| Updated policy |
 **tenantId** | **String**| The tenant identifier | [optional] [default to _Default]

### Return type

[**Policy**](Policy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

