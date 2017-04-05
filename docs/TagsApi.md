# TagsApi

All URIs are relative to *http://veritas-nonprod-dev.apigee.net/vic/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrUpdateTag**](TagsApi.md#createOrUpdateTag) | **PUT** /management/tags/{tag} | Create or update tag
[**deleteTag**](TagsApi.md#deleteTag) | **DELETE** /management/tags/{tag} | Delete tag
[**getPoliciesByTag**](TagsApi.md#getPoliciesByTag) | **GET** /management/tags/{tag}/policies | List policies that use a tag
[**getTag**](TagsApi.md#getTag) | **GET** /management/tags/{tag} | Get tag
[**getTagPropertyDefinitions**](TagsApi.md#getTagPropertyDefinitions) | **GET** /management/tags/propertyDefinitions | List tag property definitions
[**getTagsCollection**](TagsApi.md#getTagsCollection) | **GET** /management/tags | List tags


<a name="createOrUpdateTag"></a>
# **createOrUpdateTag**
> Tag createOrUpdateTag(tag, body, tenantId)

Create or update tag

Create or update a tag.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagsApi;


TagsApi apiInstance = new TagsApi();
String tag = "tag_example"; // String | 
Tag body = new Tag(); // Tag | Tag
String tenantId = "_Default"; // String | The tenant identifier
try {
    Tag result = apiInstance.createOrUpdateTag(tag, body, tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#createOrUpdateTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tag** | **String**|  |
 **body** | [**Tag**](Tag.md)| Tag |
 **tenantId** | **String**| The tenant identifier | [optional] [default to _Default]

### Return type

[**Tag**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTag"></a>
# **deleteTag**
> deleteTag(tag, tenantId)

Delete tag

Delete a custom tag.  (Built-in tags cannot be deleted.)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagsApi;


TagsApi apiInstance = new TagsApi();
String tag = "tag_example"; // String | 
String tenantId = "_Default"; // String | The tenant identifier
try {
    apiInstance.deleteTag(tag, tenantId);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#deleteTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tag** | **String**|  |
 **tenantId** | **String**| The tenant identifier | [optional] [default to _Default]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getPoliciesByTag"></a>
# **getPoliciesByTag**
> PolicyCollection getPoliciesByTag(tag, tenantId)

List policies that use a tag



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagsApi;


TagsApi apiInstance = new TagsApi();
String tag = "tag_example"; // String | 
String tenantId = "_Default"; // String | The tenant identifier
try {
    PolicyCollection result = apiInstance.getPoliciesByTag(tag, tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#getPoliciesByTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tag** | **String**|  |
 **tenantId** | **String**| The tenant identifier | [optional] [default to _Default]

### Return type

[**PolicyCollection**](PolicyCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTag"></a>
# **getTag**
> Tag getTag(tag, tenantId)

Get tag

Get a tag.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagsApi;


TagsApi apiInstance = new TagsApi();
String tag = "tag_example"; // String | 
String tenantId = "_Default"; // String | The tenant identifier
try {
    Tag result = apiInstance.getTag(tag, tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#getTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tag** | **String**|  |
 **tenantId** | **String**| The tenant identifier | [optional] [default to _Default]

### Return type

[**Tag**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTagPropertyDefinitions"></a>
# **getTagPropertyDefinitions**
> TagPropertyDefinitionCollection getTagPropertyDefinitions(tenantId)

List tag property definitions

Get definitions of properties that can be associated with a tag. This is useful, for example, for user interfaces that need to know the supported values for such properties. Generally the tag properties are application-specific and not part of the core service functionality.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagsApi;


TagsApi apiInstance = new TagsApi();
String tenantId = "_Default"; // String | The tenant identifier
try {
    TagPropertyDefinitionCollection result = apiInstance.getTagPropertyDefinitions(tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#getTagPropertyDefinitions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **String**| The tenant identifier | [optional] [default to _Default]

### Return type

[**TagPropertyDefinitionCollection**](TagPropertyDefinitionCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTagsCollection"></a>
# **getTagsCollection**
> TagsCollection getTagsCollection(tenantId, ifNoneMatch)

List tags

Retrieve all of the tags for a tenant.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagsApi;


TagsApi apiInstance = new TagsApi();
String tenantId = "_Default"; // String | The tenant identifier
String ifNoneMatch = "ifNoneMatch_example"; // String | 
try {
    TagsCollection result = apiInstance.getTagsCollection(tenantId, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#getTagsCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **String**| The tenant identifier | [optional] [default to _Default]
 **ifNoneMatch** | **String**|  | [optional]

### Return type

[**TagsCollection**](TagsCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

