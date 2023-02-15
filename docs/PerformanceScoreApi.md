# PerformanceScoreApi

All URIs are relative to *https://se-exchange-uat-uat.apigee.net/ecostruxure/user/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createScoringRequest**](PerformanceScoreApi.md#createScoringRequest) | **POST** /sites/{site-id}/scoring-requests | Create Scoring Request |
| [**getScoringRequestStatus**](PerformanceScoreApi.md#getScoringRequestStatus) | **GET** /sites/{site-id}/scoring-requests | Scoring Request Status |
| [**listPerformanceScores**](PerformanceScoreApi.md#listPerformanceScores) | **GET** /sites/{site-id}/performance-scores | Get Performance Score |



## createScoringRequest

> ScoringRequest createScoringRequest(siteId)

Create Scoring Request

User select a site for scoring and thus automatically share timeseries related information to calculate scores

### Example

```java
// Import classes:
import se.ecostruxure.sdk.client.invoker.ApiClient;
import se.ecostruxure.sdk.client.invoker.ApiException;
import se.ecostruxure.sdk.client.invoker.Configuration;
import se.ecostruxure.sdk.client.invoker.auth.*;
import se.ecostruxure.sdk.client.invoker.models.*;
import se.ecostruxure.sdk.client.PerformanceScoreApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://se-exchange-uat-uat.apigee.net/ecostruxure/user/v1");
        
        // Configure HTTP bearer authorization: PersonalAccessToken
        HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
        PersonalAccessToken.setBearerToken("BEARER TOKEN");

        PerformanceScoreApi apiInstance = new PerformanceScoreApi(defaultClient);
        String siteId = "a483d4-e5be-4521-9f92-5400f5"; // String | 
        try {
            ScoringRequest result = apiInstance.createScoringRequest(siteId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PerformanceScoreApi#createScoringRequest");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **siteId** | **String**|  | |

### Return type

[**ScoringRequest**](ScoringRequest.md)

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **409** | Conflict |  -  |
| **500** | Internal Server Error |  -  |


## getScoringRequestStatus

> List&lt;ScoringRequest&gt; getScoringRequestStatus(siteId, id)

Scoring Request Status

Allows end user to check the status of the site configured for performance scoring.

### Example

```java
// Import classes:
import se.ecostruxure.sdk.client.invoker.ApiClient;
import se.ecostruxure.sdk.client.invoker.ApiException;
import se.ecostruxure.sdk.client.invoker.Configuration;
import se.ecostruxure.sdk.client.invoker.auth.*;
import se.ecostruxure.sdk.client.invoker.models.*;
import se.ecostruxure.sdk.client.PerformanceScoreApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://se-exchange-uat-uat.apigee.net/ecostruxure/user/v1");
        
        // Configure HTTP bearer authorization: PersonalAccessToken
        HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
        PersonalAccessToken.setBearerToken("BEARER TOKEN");

        PerformanceScoreApi apiInstance = new PerformanceScoreApi(defaultClient);
        String siteId = "a483d4-e5be-4521-9f92-5400f5"; // String | 
        Integer id = 12; // Integer | 
        try {
            List<ScoringRequest> result = apiInstance.getScoringRequestStatus(siteId, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PerformanceScoreApi#getScoringRequestStatus");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **siteId** | **String**|  | |
| **id** | **Integer**|  | [optional] |

### Return type

[**List&lt;ScoringRequest&gt;**](ScoringRequest.md)

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **500** | Internal Server Error |  -  |


## listPerformanceScores

> List&lt;PerformanceScore&gt; listPerformanceScores(siteId, type, category)

Get Performance Score

Retrieve all performance scores for a given site

### Example

```java
// Import classes:
import se.ecostruxure.sdk.client.invoker.ApiClient;
import se.ecostruxure.sdk.client.invoker.ApiException;
import se.ecostruxure.sdk.client.invoker.Configuration;
import se.ecostruxure.sdk.client.invoker.auth.*;
import se.ecostruxure.sdk.client.invoker.models.*;
import se.ecostruxure.sdk.client.PerformanceScoreApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://se-exchange-uat-uat.apigee.net/ecostruxure/user/v1");
        
        // Configure HTTP bearer authorization: PersonalAccessToken
        HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
        PersonalAccessToken.setBearerToken("BEARER TOKEN");

        PerformanceScoreApi apiInstance = new PerformanceScoreApi(defaultClient);
        String siteId = "a483d4-e5be-4521-9f92-5400f5"; // String | 
        List<String> type = Arrays.asList(); // List<String> | 
        List<String> category = Arrays.asList(); // List<String> | 
        try {
            List<PerformanceScore> result = apiInstance.listPerformanceScores(siteId, type, category);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PerformanceScoreApi#listPerformanceScores");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **siteId** | **String**|  | |
| **type** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: daily, monthly, localAverage, average] |
| **category** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: energy, water, waste, transportation, humanExperience, reEntry] |

### Return type

[**List&lt;PerformanceScore&gt;**](PerformanceScore.md)

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Found Scores |  -  |
| **400** | Bad Request |  -  |
| **404** | Site Not found |  -  |
| **500** | Internal Server Error |  -  |

