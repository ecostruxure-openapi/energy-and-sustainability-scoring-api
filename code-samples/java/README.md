# energy-sustainabilty-scoring-api

EcoStruxure™ Energy &amp; Sustainability Scoring API

- API version: User Edition 1.0.0

- Build date: 2023-02-08T13:21:09.999+05:30[Asia/Calcutta]

# Overview

EcoStruxure™ Energy and Sustainability Scoring API allows customers to configure buildings that needs benchmarking by calculating performance scores using the building energy and sustainability data.

## API overview and usage

This API enables the following operations:

**Sites**
* Retrieve all sites belonging to which the connected user has access, along site metadata needed for performance scores calculation (e.g. gross area, building occupants, operating hours, etc)

**Performance Scores**
* Allows the user to request site for performance score calculation 
* Read current and historical scores for a given site
* Supported Types: Daily, Monthly, Average, LocalAverage
* Supported Categories: Energy, Water, Waste, Transportation, Human Experience, Re-Entry


## How it works

This API works for any Schneider Electric customer who has an identity in Schneider Electric(SE) cIAM system.

**Step 1:** In order to enquire the customer data, the user have to generate a Personal Access Token(PAT) from the Exchange Developer Portal on the product page after subscription.
> Customer will have to provide their consent while generating PAT to share the building measurement data with scoring partner

**Step 2:** Enquire all the sites which the customer is authorized to calculate the performance scores.

**Step 3:** Send requests to calculate the performance score for a given site

**Step 4:** Fetch all current and historical scores

![High-level flow diagram](https://raw.githubusercontent.com/ecostruxure-openapi/public-images/main/energy-sustainability-scoring/user-edition.png \"High-level flow diagram\")

# Documentation
    
## How to sign up
    
**Step 1:** [Register or login](https://exchange.se.com) with an Exchange account.

**Step 2:** Subscribe to the [API product in our Shop](https://exchange.se.com).

**Step 3:** After subscription, API credentials and usage details for the API are available in developer portal.

## Code Samples

You can leverage the code samples provided to integrate faster in your application.

  * ### [Postman collection](https://github.com/ecostruxure-openapi/energy-and-sustainability-scoring/tree/main/code_samples/postman_collection)

  * ### [Java](https://github.com/ecostruxure-openapi/energy-and-sustainability-scoring/tree/main/code_samples/java)


## Support

Contact the SE Exchange support team at exchange.support@se.com and include,

    - Endpoint URL
    - Request/Response of the URL
    - Any additional information like Screenshots, Postman collections

---


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

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

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/energy-sustainabilty-scoring-api-0.0.1.jar`
- `target/lib/*.jar`

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

## Documentation for API Endpoints

All URIs are relative to *https://se-exchange-uat-uat.apigee.net/ecostruxure/user/v1*

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


## Documentation for Authorization

Authentication schemes defined for the API:
### PersonalAccessToken


- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


