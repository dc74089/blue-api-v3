# MatchApi

All URIs are relative to *https://www.thebluealliance.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEventMatchTimeseries**](MatchApi.md#getEventMatchTimeseries) | **GET** /event/{event_key}/matches/timeseries | 
[**getEventMatches**](MatchApi.md#getEventMatches) | **GET** /event/{event_key}/matches | 
[**getEventMatchesKeys**](MatchApi.md#getEventMatchesKeys) | **GET** /event/{event_key}/matches/keys | 
[**getEventMatchesSimple**](MatchApi.md#getEventMatchesSimple) | **GET** /event/{event_key}/matches/simple | 
[**getMatch**](MatchApi.md#getMatch) | **GET** /match/{match_key} | 
[**getMatchSimple**](MatchApi.md#getMatchSimple) | **GET** /match/{match_key}/simple | 
[**getMatchTimeseries**](MatchApi.md#getMatchTimeseries) | **GET** /match/{match_key}/timeseries | 
[**getMatchZebra**](MatchApi.md#getMatchZebra) | **GET** /match/{match_key}/zebra_motionworks | 
[**getTeamEventMatches**](MatchApi.md#getTeamEventMatches) | **GET** /team/{team_key}/event/{event_key}/matches | 
[**getTeamEventMatchesKeys**](MatchApi.md#getTeamEventMatchesKeys) | **GET** /team/{team_key}/event/{event_key}/matches/keys | 
[**getTeamEventMatchesSimple**](MatchApi.md#getTeamEventMatchesSimple) | **GET** /team/{team_key}/event/{event_key}/matches/simple | 
[**getTeamMatchesByYear**](MatchApi.md#getTeamMatchesByYear) | **GET** /team/{team_key}/matches/{year} | 
[**getTeamMatchesByYearKeys**](MatchApi.md#getTeamMatchesByYearKeys) | **GET** /team/{team_key}/matches/{year}/keys | 
[**getTeamMatchesByYearSimple**](MatchApi.md#getTeamMatchesByYearSimple) | **GET** /team/{team_key}/matches/{year}/simple | 

<a name="getEventMatchTimeseries"></a>
# **getEventMatchTimeseries**
> List&lt;String&gt; getEventMatchTimeseries(eventKey, ifModifiedSince)



Gets an array of Match Keys for the given event key that have timeseries data. Returns an empty array if no matches have timeseries data. *WARNING:* This is *not* official data, and is subject to a significant possibility of error, or missing data. Do not rely on this data for any purpose. In fact, pretend we made it up. *WARNING:* This endpoint and corresponding data models are under *active development* and may change at any time, including in breaking ways.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

MatchApi apiInstance = new MatchApi();
String eventKey = "eventKey_example"; // String | TBA Event Key, eg `2016nytr`
String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    List<String> result = apiInstance.getEventMatchTimeseries(eventKey, ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchApi#getEventMatchTimeseries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventKey** | **String**| TBA Event Key, eg &#x60;2016nytr&#x60; |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventMatches"></a>
# **getEventMatches**
> List&lt;Match&gt; getEventMatches(eventKey, ifModifiedSince)



Gets a list of matches for the given event.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

MatchApi apiInstance = new MatchApi();
String eventKey = "eventKey_example"; // String | TBA Event Key, eg `2016nytr`
String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    List<Match> result = apiInstance.getEventMatches(eventKey, ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchApi#getEventMatches");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventKey** | **String**| TBA Event Key, eg &#x60;2016nytr&#x60; |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**List&lt;Match&gt;**](Match.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventMatchesKeys"></a>
# **getEventMatchesKeys**
> List&lt;String&gt; getEventMatchesKeys(eventKey, ifModifiedSince)



Gets a list of match keys for the given event.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

MatchApi apiInstance = new MatchApi();
String eventKey = "eventKey_example"; // String | TBA Event Key, eg `2016nytr`
String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    List<String> result = apiInstance.getEventMatchesKeys(eventKey, ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchApi#getEventMatchesKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventKey** | **String**| TBA Event Key, eg &#x60;2016nytr&#x60; |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventMatchesSimple"></a>
# **getEventMatchesSimple**
> List&lt;MatchSimple&gt; getEventMatchesSimple(eventKey, ifModifiedSince)



Gets a short-form list of matches for the given event.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

MatchApi apiInstance = new MatchApi();
String eventKey = "eventKey_example"; // String | TBA Event Key, eg `2016nytr`
String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    List<MatchSimple> result = apiInstance.getEventMatchesSimple(eventKey, ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchApi#getEventMatchesSimple");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventKey** | **String**| TBA Event Key, eg &#x60;2016nytr&#x60; |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**List&lt;MatchSimple&gt;**](MatchSimple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMatch"></a>
# **getMatch**
> Match getMatch(matchKey, ifModifiedSince)



Gets a &#x60;Match&#x60; object for the given match key.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

MatchApi apiInstance = new MatchApi();
String matchKey = "matchKey_example"; // String | TBA Match Key, eg `2016nytr_qm1`
String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    Match result = apiInstance.getMatch(matchKey, ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchApi#getMatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **matchKey** | **String**| TBA Match Key, eg &#x60;2016nytr_qm1&#x60; |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**Match**](Match.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMatchSimple"></a>
# **getMatchSimple**
> MatchSimple getMatchSimple(matchKey, ifModifiedSince)



Gets a short-form &#x60;Match&#x60; object for the given match key.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

MatchApi apiInstance = new MatchApi();
String matchKey = "matchKey_example"; // String | TBA Match Key, eg `2016nytr_qm1`
String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    MatchSimple result = apiInstance.getMatchSimple(matchKey, ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchApi#getMatchSimple");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **matchKey** | **String**| TBA Match Key, eg &#x60;2016nytr_qm1&#x60; |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**MatchSimple**](MatchSimple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMatchTimeseries"></a>
# **getMatchTimeseries**
> List&lt;Object&gt; getMatchTimeseries(matchKey, ifModifiedSince)



Gets an array of game-specific Match Timeseries objects for the given match key or an empty array if not available. *WARNING:* This is *not* official data, and is subject to a significant possibility of error, or missing data. Do not rely on this data for any purpose. In fact, pretend we made it up. *WARNING:* This endpoint and corresponding data models are under *active development* and may change at any time, including in breaking ways.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

MatchApi apiInstance = new MatchApi();
String matchKey = "matchKey_example"; // String | TBA Match Key, eg `2016nytr_qm1`
String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    List<Object> result = apiInstance.getMatchTimeseries(matchKey, ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchApi#getMatchTimeseries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **matchKey** | **String**| TBA Match Key, eg &#x60;2016nytr_qm1&#x60; |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

**List&lt;Object&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMatchZebra"></a>
# **getMatchZebra**
> Zebra getMatchZebra(matchKey, ifModifiedSince)



Gets Zebra MotionWorks data for a Match for the given match key.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

MatchApi apiInstance = new MatchApi();
String matchKey = "matchKey_example"; // String | TBA Match Key, eg `2016nytr_qm1`
String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    Zebra result = apiInstance.getMatchZebra(matchKey, ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchApi#getMatchZebra");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **matchKey** | **String**| TBA Match Key, eg &#x60;2016nytr_qm1&#x60; |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**Zebra**](Zebra.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamEventMatches"></a>
# **getTeamEventMatches**
> List&lt;Match&gt; getTeamEventMatches(teamKey, eventKey, ifModifiedSince)



Gets a list of matches for the given team and event.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

MatchApi apiInstance = new MatchApi();
String teamKey = "teamKey_example"; // String | TBA Team Key, eg `frc254`
String eventKey = "eventKey_example"; // String | TBA Event Key, eg `2016nytr`
String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    List<Match> result = apiInstance.getTeamEventMatches(teamKey, eventKey, ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchApi#getTeamEventMatches");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; |
 **eventKey** | **String**| TBA Event Key, eg &#x60;2016nytr&#x60; |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**List&lt;Match&gt;**](Match.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamEventMatchesKeys"></a>
# **getTeamEventMatchesKeys**
> List&lt;String&gt; getTeamEventMatchesKeys(teamKey, eventKey, ifModifiedSince)



Gets a list of match keys for matches for the given team and event.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

MatchApi apiInstance = new MatchApi();
String teamKey = "teamKey_example"; // String | TBA Team Key, eg `frc254`
String eventKey = "eventKey_example"; // String | TBA Event Key, eg `2016nytr`
String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    List<String> result = apiInstance.getTeamEventMatchesKeys(teamKey, eventKey, ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchApi#getTeamEventMatchesKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; |
 **eventKey** | **String**| TBA Event Key, eg &#x60;2016nytr&#x60; |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamEventMatchesSimple"></a>
# **getTeamEventMatchesSimple**
> List&lt;Match&gt; getTeamEventMatchesSimple(teamKey, eventKey, ifModifiedSince)



Gets a short-form list of matches for the given team and event.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

MatchApi apiInstance = new MatchApi();
String teamKey = "teamKey_example"; // String | TBA Team Key, eg `frc254`
String eventKey = "eventKey_example"; // String | TBA Event Key, eg `2016nytr`
String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    List<Match> result = apiInstance.getTeamEventMatchesSimple(teamKey, eventKey, ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchApi#getTeamEventMatchesSimple");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; |
 **eventKey** | **String**| TBA Event Key, eg &#x60;2016nytr&#x60; |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**List&lt;Match&gt;**](Match.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamMatchesByYear"></a>
# **getTeamMatchesByYear**
> List&lt;Match&gt; getTeamMatchesByYear(teamKey, year, ifModifiedSince)



Gets a list of matches for the given team and year.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

MatchApi apiInstance = new MatchApi();
String teamKey = "teamKey_example"; // String | TBA Team Key, eg `frc254`
Integer year = 56; // Integer | Competition Year (or Season). Must be 4 digits.
String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    List<Match> result = apiInstance.getTeamMatchesByYear(teamKey, year, ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchApi#getTeamMatchesByYear");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; |
 **year** | **Integer**| Competition Year (or Season). Must be 4 digits. |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**List&lt;Match&gt;**](Match.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamMatchesByYearKeys"></a>
# **getTeamMatchesByYearKeys**
> List&lt;String&gt; getTeamMatchesByYearKeys(teamKey, year, ifModifiedSince)



Gets a list of match keys for matches for the given team and year.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

MatchApi apiInstance = new MatchApi();
String teamKey = "teamKey_example"; // String | TBA Team Key, eg `frc254`
Integer year = 56; // Integer | Competition Year (or Season). Must be 4 digits.
String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    List<String> result = apiInstance.getTeamMatchesByYearKeys(teamKey, year, ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchApi#getTeamMatchesByYearKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; |
 **year** | **Integer**| Competition Year (or Season). Must be 4 digits. |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamMatchesByYearSimple"></a>
# **getTeamMatchesByYearSimple**
> List&lt;MatchSimple&gt; getTeamMatchesByYearSimple(teamKey, year, ifModifiedSince)



Gets a short-form list of matches for the given team and year.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

MatchApi apiInstance = new MatchApi();
String teamKey = "teamKey_example"; // String | TBA Team Key, eg `frc254`
Integer year = 56; // Integer | Competition Year (or Season). Must be 4 digits.
String ifModifiedSince = "ifModifiedSince_example"; // String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    List<MatchSimple> result = apiInstance.getTeamMatchesByYearSimple(teamKey, year, ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchApi#getTeamMatchesByYearSimple");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamKey** | **String**| TBA Team Key, eg &#x60;frc254&#x60; |
 **year** | **Integer**| Competition Year (or Season). Must be 4 digits. |
 **ifModifiedSince** | **String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**List&lt;MatchSimple&gt;**](MatchSimple.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

