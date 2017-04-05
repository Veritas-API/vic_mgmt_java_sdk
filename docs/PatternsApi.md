# PatternsApi

All URIs are relative to *http://veritas-nonprod-dev.apigee.net/vic/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPattern**](PatternsApi.md#createPattern) | **POST** /management/patterns | Create pattern
[**deletePattern**](PatternsApi.md#deletePattern) | **DELETE** /management/patterns/{id} | Delete pattern
[**getPattern**](PatternsApi.md#getPattern) | **GET** /management/patterns/{id} | Get pattern
[**getPatternCollection**](PatternsApi.md#getPatternCollection) | **GET** /management/patterns | List patterns
[**getPoliciesByPattern**](PatternsApi.md#getPoliciesByPattern) | **GET** /management/patterns/{id}/policies | List policies that use a pattern
[**updatePattern**](PatternsApi.md#updatePattern) | **PUT** /management/patterns/{id} | Update pattern


<a name="createPattern"></a>
# **createPattern**
> Pattern createPattern(body, tenantId)

Create pattern



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PatternsApi;


PatternsApi apiInstance = new PatternsApi();
Pattern body = new Pattern(); // Pattern | New pattern
String tenantId = "_Default"; // String | The tenant identifier
try {
    Pattern result = apiInstance.createPattern(body, tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PatternsApi#createPattern");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Pattern**](Pattern.md)| New pattern |
 **tenantId** | **String**| The tenant identifier | [optional] [default to _Default]

### Return type

[**Pattern**](Pattern.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePattern"></a>
# **deletePattern**
> deletePattern(id, tenantId)

Delete pattern



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PatternsApi;


PatternsApi apiInstance = new PatternsApi();
String id = "id_example"; // String | The pattern identifier
String tenantId = "_Default"; // String | The tenant identifier
try {
    apiInstance.deletePattern(id, tenantId);
} catch (ApiException e) {
    System.err.println("Exception when calling PatternsApi#deletePattern");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The pattern identifier |
 **tenantId** | **String**| The tenant identifier | [optional] [default to _Default]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getPattern"></a>
# **getPattern**
> Pattern getPattern(id, tenantId)

Get pattern



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PatternsApi;


PatternsApi apiInstance = new PatternsApi();
String id = "id_example"; // String | The pattern identifier
String tenantId = "_Default"; // String | The tenant identifier
try {
    Pattern result = apiInstance.getPattern(id, tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PatternsApi#getPattern");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The pattern identifier |
 **tenantId** | **String**| The tenant identifier | [optional] [default to _Default]

### Return type

[**Pattern**](Pattern.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPatternCollection"></a>
# **getPatternCollection**
> PatternCollection getPatternCollection(tenantId, ifNoneMatch)

List patterns



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PatternsApi;


PatternsApi apiInstance = new PatternsApi();
String tenantId = "_Default"; // String | The tenant identifier
String ifNoneMatch = "ifNoneMatch_example"; // String | 
try {
    PatternCollection result = apiInstance.getPatternCollection(tenantId, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PatternsApi#getPatternCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **String**| The tenant identifier | [optional] [default to _Default]
 **ifNoneMatch** | **String**|  | [optional]

### Return type

[**PatternCollection**](PatternCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPoliciesByPattern"></a>
# **getPoliciesByPattern**
> PolicyCollection getPoliciesByPattern(id, tenantId)

List policies that use a pattern



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PatternsApi;


PatternsApi apiInstance = new PatternsApi();
String id = "id_example"; // String | 
String tenantId = "_Default"; // String | The tenant identifier
try {
    PolicyCollection result = apiInstance.getPoliciesByPattern(id, tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PatternsApi#getPoliciesByPattern");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **tenantId** | **String**| The tenant identifier | [optional] [default to _Default]

### Return type

[**PolicyCollection**](PolicyCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updatePattern"></a>
# **updatePattern**
> Pattern updatePattern(id, body, tenantId)

Update pattern



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PatternsApi;


PatternsApi apiInstance = new PatternsApi();
String id = "id_example"; // String | The pattern identifier
Pattern body = new Pattern(); // Pattern | Updated pattern
String tenantId = "_Default"; // String | The tenant identifier
try {
    Pattern result = apiInstance.updatePattern(id, body, tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PatternsApi#updatePattern");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The pattern identifier |
 **body** | [**Pattern**](Pattern.md)| Updated pattern |
 **tenantId** | **String**| The tenant identifier | [optional] [default to _Default]

### Return type

[**Pattern**](Pattern.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

