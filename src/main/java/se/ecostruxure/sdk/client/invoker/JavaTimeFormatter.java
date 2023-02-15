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

package se.ecostruxure.sdk.client.invoker;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * Class that add parsing/formatting support for Java 8+ {@code OffsetDateTime} class.
 * It's generated for java clients when {@code AbstractJavaCodegen#dateLibrary} specified as {@code java8}.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-08T13:21:09.999+05:30[Asia/Calcutta]")
public class JavaTimeFormatter {

    private DateTimeFormatter offsetDateTimeFormatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;

    /**
     * Get the date format used to parse/format {@code OffsetDateTime} parameters.
     * @return DateTimeFormatter
     */
    public DateTimeFormatter getOffsetDateTimeFormatter() {
        return offsetDateTimeFormatter;
    }

    /**
     * Set the date format used to parse/format {@code OffsetDateTime} parameters.
     * @param offsetDateTimeFormatter {@code DateTimeFormatter}
     */
    public void setOffsetDateTimeFormatter(DateTimeFormatter offsetDateTimeFormatter) {
        this.offsetDateTimeFormatter = offsetDateTimeFormatter;
    }

    /**
     * Parse the given string into {@code OffsetDateTime} object.
     * @param str String
     * @return {@code OffsetDateTime}
     */
    public OffsetDateTime parseOffsetDateTime(String str) {
        try {
            return OffsetDateTime.parse(str, offsetDateTimeFormatter);
        } catch (DateTimeParseException e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * Format the given {@code OffsetDateTime} object into string.
     * @param offsetDateTime {@code OffsetDateTime}
     * @return {@code OffsetDateTime} in string format
     */
    public String formatOffsetDateTime(OffsetDateTime offsetDateTime) {
        return offsetDateTimeFormatter.format(offsetDateTime);
    }
}
