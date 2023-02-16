/*
 * EcoStruxure™ Energy & Sustainability Scoring API
 * # Overview    EcoStruxure™ Energy and Sustainability Scoring API allows customers to configure buildings that needs benchmarking by calculating performance scores using the building energy and sustainability data.    ## API overview and usage    This API enables the following operations:    **Sites**  * Retrieve all sites belonging to which the connected user has access, along site metadata needed for performance scores calculation (e.g. gross area, building occupants, operating hours, etc)    **Performance Scores**  * Allows the user to request site for performance score calculation   * Read current and historical scores for a given site  * Supported Types: Daily, Monthly, Average, LocalAverage  * Supported Categories: Energy, Water, Waste, Transportation, Human Experience, Re-Entry      ## How it works    This API works for any Schneider Electric customer who has an identity in Schneider Electric(SE) cIAM system.    **Step 1:** In order to enquire the customer data, the user have to generate a Personal Access Token(PAT) from the Exchange Developer Portal on the product page after subscription.  > Customer will have to provide their consent while generating PAT to share the building measurement data with scoring partner    **Step 2:** Enquire all the sites which the customer is authorized to calculate the performance scores.    **Step 3:** Send requests to calculate the performance score for a given site    **Step 4:** Fetch all current and historical scores    ![High-level flow diagram](https://raw.githubusercontent.com/ecostruxure-openapi/public-images/main/energy-sustainability-scoring/user-edition.png \"High-level flow diagram\")    # Documentation        ## How to sign up        **Step 1:** [Register or login](https://exchange.se.com) with an Exchange account.    **Step 2:** Subscribe to the [API product in our Shop](https://exchange.se.com).    **Step 3:** After subscription, API credentials and usage details for the API are available in developer portal.    ## Code Samples    You can leverage the code samples provided to integrate faster in your application.      * ### [Postman collection](https://github.com/ecostruxure-openapi/energy-and-sustainability-scoring/tree/main/code_samples/postman_collection)      * ### [Java](https://github.com/ecostruxure-openapi/energy-and-sustainability-scoring/tree/main/code_samples/java)      ## Support    Contact the SE Exchange support team at exchange.support@se.com and include,        - Endpoint URL      - Request/Response of the URL      - Any additional information like Screenshots, Postman collections    ---
 *
 * The version of the OpenAPI document: User Edition 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package se.ecostruxure.sdk.client;

import se.ecostruxure.sdk.client.model.Error;
import se.ecostruxure.sdk.client.model.PerformanceScore;
import se.ecostruxure.sdk.client.model.ScoringRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PerformanceScoreApi
 */
@Ignore
public class PerformanceScoreApiTest {

    private final PerformanceScoreApi api = new PerformanceScoreApi();

    
    /**
     * Create Scoring Request
     *
     * User select a site for scoring and thus automatically share timeseries related information to calculate scores
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createScoringRequestTest() {
        String siteId = null;
        ScoringRequest response = api.createScoringRequest(siteId);

        // TODO: test validations
    }
    
    /**
     * Scoring Request Status
     *
     * Allows end user to check the status of the site configured for performance scoring.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getScoringRequestStatusTest() {
        String siteId = null;
        Integer id = null;
        List<ScoringRequest> response = api.getScoringRequestStatus(siteId, id);

        // TODO: test validations
    }
    
    /**
     * Get Performance Score
     *
     * Retrieve all performance scores for a given site
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPerformanceScoresTest() {
        String siteId = null;
        List<String> type = null;
        List<String> category = null;
        List<PerformanceScore> response = api.listPerformanceScores(siteId, type, category);

        // TODO: test validations
    }
    
}