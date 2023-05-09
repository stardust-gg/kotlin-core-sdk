# HealthEndpointsApi

All URIs are relative to *https://core-api.stardust.gg/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**healthGet**](HealthEndpointsApi.md#healthGet) | **GET** /health | Get Health


<a name="healthGet"></a>
# **healthGet**
> SDHealthResponse healthGet()

Get Health

Get system health info

### Example
```kotlin
// Import classes:
//import gg.stardust.coresdk.infrastructure.*
//import gg.stardust.coresdk.models.*

val apiInstance = HealthEndpointsApi()
try {
    val result : SDHealthResponse = apiInstance.healthGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling HealthEndpointsApi#healthGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling HealthEndpointsApi#healthGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SDHealthResponse**](SDHealthResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

