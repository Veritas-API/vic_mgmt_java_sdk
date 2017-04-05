# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.PatternsApi;

import java.io.File;
import java.util.*;

public class PatternsApiExample {

    public static void main(String[] args) {
        
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://veritas-nonprod-dev.apigee.net/vic/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*PatternsApi* | [**createPattern**](docs/PatternsApi.md#createPattern) | **POST** /management/patterns | Create pattern
*PatternsApi* | [**deletePattern**](docs/PatternsApi.md#deletePattern) | **DELETE** /management/patterns/{id} | Delete pattern
*PatternsApi* | [**getPattern**](docs/PatternsApi.md#getPattern) | **GET** /management/patterns/{id} | Get pattern
*PatternsApi* | [**getPatternCollection**](docs/PatternsApi.md#getPatternCollection) | **GET** /management/patterns | List patterns
*PatternsApi* | [**getPoliciesByPattern**](docs/PatternsApi.md#getPoliciesByPattern) | **GET** /management/patterns/{id}/policies | List policies that use a pattern
*PatternsApi* | [**updatePattern**](docs/PatternsApi.md#updatePattern) | **PUT** /management/patterns/{id} | Update pattern
*PoliciesApi* | [**createPolicy**](docs/PoliciesApi.md#createPolicy) | **POST** /management/policies | Create policy
*PoliciesApi* | [**deletePolicy**](docs/PoliciesApi.md#deletePolicy) | **DELETE** /management/policies/{id} | Delete policy
*PoliciesApi* | [**getMetadataDefinitions**](docs/PoliciesApi.md#getMetadataDefinitions) | **GET** /management/policies/metadata | List metadata definitions
*PoliciesApi* | [**getPolicy**](docs/PoliciesApi.md#getPolicy) | **GET** /management/policies/{id} | Get policy
*PoliciesApi* | [**getPolicyCollection**](docs/PoliciesApi.md#getPolicyCollection) | **GET** /management/policies | List policies
*PoliciesApi* | [**patchPolicy**](docs/PoliciesApi.md#patchPolicy) | **PATCH** /management/policies/{id} | Patch policy
*PoliciesApi* | [**resetPolicy**](docs/PoliciesApi.md#resetPolicy) | **DELETE** /management/policies/{id}/overrides | Reset policy to defaults
*PoliciesApi* | [**updatePolicy**](docs/PoliciesApi.md#updatePolicy) | **PUT** /management/policies/{id} | Update policy
*TagsApi* | [**createOrUpdateTag**](docs/TagsApi.md#createOrUpdateTag) | **PUT** /management/tags/{tag} | Create or update tag
*TagsApi* | [**deleteTag**](docs/TagsApi.md#deleteTag) | **DELETE** /management/tags/{tag} | Delete tag
*TagsApi* | [**getPoliciesByTag**](docs/TagsApi.md#getPoliciesByTag) | **GET** /management/tags/{tag}/policies | List policies that use a tag
*TagsApi* | [**getTag**](docs/TagsApi.md#getTag) | **GET** /management/tags/{tag} | Get tag
*TagsApi* | [**getTagPropertyDefinitions**](docs/TagsApi.md#getTagPropertyDefinitions) | **GET** /management/tags/propertyDefinitions | List tag property definitions
*TagsApi* | [**getTagsCollection**](docs/TagsApi.md#getTagsCollection) | **GET** /management/tags | List tags


## Documentation for Models

 - [AllowedValue](docs/AllowedValue.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [JsonPatchDocument](docs/JsonPatchDocument.md)
 - [Link](docs/Link.md)
 - [MetadataDefinition](docs/MetadataDefinition.md)
 - [MetadataDefinitionCollection](docs/MetadataDefinitionCollection.md)
 - [Node](docs/Node.md)
 - [OperatorNode](docs/OperatorNode.md)
 - [Pattern](docs/Pattern.md)
 - [PatternCollection](docs/PatternCollection.md)
 - [Policy](docs/Policy.md)
 - [PolicyBody](docs/PolicyBody.md)
 - [PolicyCollection](docs/PolicyCollection.md)
 - [Tag](docs/Tag.md)
 - [TagProperty](docs/TagProperty.md)
 - [TagPropertyAllowedValue](docs/TagPropertyAllowedValue.md)
 - [TagPropertyDefinition](docs/TagPropertyDefinition.md)
 - [TagPropertyDefinitionCollection](docs/TagPropertyDefinitionCollection.md)
 - [TagsCollection](docs/TagsCollection.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



