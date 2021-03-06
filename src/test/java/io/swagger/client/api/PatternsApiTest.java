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
import io.swagger.client.model.Pattern;
import io.swagger.client.model.PatternCollection;
import io.swagger.client.model.PolicyCollection;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PatternsApi
 */
@Ignore
public class PatternsApiTest {

    private final PatternsApi api = new PatternsApi();

    
    /**
     * Create pattern
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPatternTest() throws ApiException {
        Pattern body = null;
        String tenantId = null;
        Pattern response = api.createPattern(body, tenantId);

        // TODO: test validations
    }
    
    /**
     * Delete pattern
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePatternTest() throws ApiException {
        String id = null;
        String tenantId = null;
        api.deletePattern(id, tenantId);

        // TODO: test validations
    }
    
    /**
     * Get pattern
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPatternTest() throws ApiException {
        String id = null;
        String tenantId = null;
        Pattern response = api.getPattern(id, tenantId);

        // TODO: test validations
    }
    
    /**
     * List patterns
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPatternCollectionTest() throws ApiException {
        String tenantId = null;
        String ifNoneMatch = null;
        PatternCollection response = api.getPatternCollection(tenantId, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * List policies that use a pattern
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPoliciesByPatternTest() throws ApiException {
        String id = null;
        String tenantId = null;
        PolicyCollection response = api.getPoliciesByPattern(id, tenantId);

        // TODO: test validations
    }
    
    /**
     * Update pattern
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePatternTest() throws ApiException {
        String id = null;
        Pattern body = null;
        String tenantId = null;
        Pattern response = api.updatePattern(id, body, tenantId);

        // TODO: test validations
    }
    
}
