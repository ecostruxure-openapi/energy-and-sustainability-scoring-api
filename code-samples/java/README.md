# EcoStruxure™ Energy &amp; Sustainability Scoring API

- API version: User Edition 1.0.0

- Build date: 2023-02-08T13:21:09.999+05:30[Asia/Calcutta]

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```
### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>se.ecostruxure.sdk</groupId>
  <artifactId>energy-sustainabilty-scoring-api</artifactId>
  <version>0.0.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'energy-sustainabilty-scoring-api' jar has been published to maven central.
    mavenLocal()       // Needed if the 'energy-sustainabilty-scoring-api' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "se.ecostruxure.sdk:energy-sustainabilty-scoring-api:0.0.1"
  }
```
## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import se.ecostruxure.sdk.client.invoker.*;
import se.ecostruxure.sdk.client.invoker.auth.*;
import se.ecostruxure.sdk.client.model.*;
import se.ecostruxure.sdk.client.PerformanceScoreApi;

public class PerformanceScoreApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.exchange.se.com/ecostruxure/user/v1");
        
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

## Documentation for API Endpoints

All URIs are relative to *https://api.exchange.se.com/ecostruxure/user/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*PerformanceScoreApi* | [**createScoringRequest**](docs/PerformanceScoreApi.md#createScoringRequest) | **POST** /sites/{site-id}/scoring-requests | Create Scoring Request
*PerformanceScoreApi* | [**getScoringRequestStatus**](docs/PerformanceScoreApi.md#getScoringRequestStatus) | **GET** /sites/{site-id}/scoring-requests | Scoring Request Status
*PerformanceScoreApi* | [**listPerformanceScores**](docs/PerformanceScoreApi.md#listPerformanceScores) | **GET** /sites/{site-id}/performance-scores | Get Performance Score
*SiteApi* | [**listSites**](docs/SiteApi.md#listSites) | **GET** /sites | Fetch sites


## Documentation for Models

 - [Address](docs/Address.md)
 - [Coordinates](docs/Coordinates.md)
 - [Error](docs/Error.md)
 - [ErrorInvalidParamsInner](docs/ErrorInvalidParamsInner.md)
 - [PerformanceScore](docs/PerformanceScore.md)
 - [ScoringRequest](docs/ScoringRequest.md)
 - [Site](docs/Site.md)
 - [SiteMetadata](docs/SiteMetadata.md)