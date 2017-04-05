/*
 * Veritas Information Classifier (VIC)
 * APIs
 *
 * OpenAPI spec version: Resource Specific
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.ErrorResponse;
import io.swagger.client.model.PolicyCollection;
import io.swagger.client.model.Tag;
import io.swagger.client.model.TagPropertyDefinitionCollection;
import io.swagger.client.model.TagsCollection;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TagsApi
 */
@Ignore
public class TagsApiTest {

    private final TagsApi api = new TagsApi();

    
    /**
     * Create or update tag
     *
     * Create or update a tag.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createOrUpdateTagTest() throws ApiException {
        String tag = null;
        Tag body = null;
        String tenantId = null;
        Tag response = api.createOrUpdateTag(tag, body, tenantId);

        // TODO: test validations
    }
    
    /**
     * Delete tag
     *
     * Delete a custom tag.  (Built-in tags cannot be deleted.)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTagTest() throws ApiException {
        String tag = null;
        String tenantId = null;
        api.deleteTag(tag, tenantId);

        // TODO: test validations
    }
    
    /**
     * List policies that use a tag
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPoliciesByTagTest() throws ApiException {
        String tag = null;
        String tenantId = null;
        PolicyCollection response = api.getPoliciesByTag(tag, tenantId);

        // TODO: test validations
    }
    
    /**
     * Get tag
     *
     * Get a tag.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTagTest() throws ApiException {
        String tag = null;
        String tenantId = null;
        Tag response = api.getTag(tag, tenantId);

        // TODO: test validations
    }
    
    /**
     * List tag property definitions
     *
     * Get definitions of properties that can be associated with a tag. This is useful, for example, for user interfaces that need to know the supported values for such properties. Generally the tag properties are application-specific and not part of the core service functionality.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTagPropertyDefinitionsTest() throws ApiException {
        String tenantId = null;
        TagPropertyDefinitionCollection response = api.getTagPropertyDefinitions(tenantId);

        // TODO: test validations
    }
    
    /**
     * List tags
     *
     * Retrieve all of the tags for a tenant.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTagsCollectionTest() throws ApiException {
        String tenantId = null;
        String ifNoneMatch = null;
        TagsCollection response = api.getTagsCollection(tenantId, ifNoneMatch);

        // TODO: test validations
    }
    
}