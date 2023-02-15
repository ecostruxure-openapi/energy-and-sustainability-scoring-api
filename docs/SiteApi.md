# SiteApi

All URIs are relative to *https://se-exchange-uat-uat.apigee.net/ecostruxure/user/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listSites**](SiteApi.md#listSites) | **GET** /sites | Fetch sites |



## listSites

> List&lt;Site&gt; listSites()

Fetch sites

Retrieve all sites and related metadata

### Example

```java
// Import classes:
import se.ecostruxure.sdk.client.invoker.ApiClient;
import se.ecostruxure.sdk.client.invoker.ApiException;
import se.ecostruxure.sdk.client.invoker.Configuration;
import se.ecostruxure.sdk.client.invoker.auth.*;
import se.ecostruxure.sdk.client.invoker.models.*;
import se.ecostruxure.sdk.client.SiteApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://se-exchange-uat-uat.apigee.net/ecostruxure/user/v1");
        
        // Configure HTTP bearer authorization: PersonalAccessToken
        HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
        PersonalAccessToken.setBearerToken("BEARER TOKEN");

        SiteApi apiInstance = new SiteApi(defaultClient);
        try {
            List<Site> result = apiInstance.listSites();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SiteApi#listSites");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;Site&gt;**](Site.md)

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Found Sites |  -  |
| **500** | Internal Server Error |  -  |

