# GameEndpointsApi

All URIs are relative to *https://core-api.stardust.gg/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**gameGetGet**](GameEndpointsApi.md#gameGetGet) | **GET** /game/get | Get Game
[**gameMutatePut**](GameEndpointsApi.md#gameMutatePut) | **PUT** /game/mutate | Mutate Game


<a name="gameGetGet"></a>
# **gameGetGet**
> SDGameGetResponse gameGetGet()

Get Game

Get the Details of Your Game

### Example
```kotlin
// Import classes:
//import gg.stardust.coresdk.infrastructure.*
//import gg.stardust.coresdk.models.*

val apiInstance = GameEndpointsApi()
try {
    val result : SDGameGetResponse = apiInstance.gameGetGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GameEndpointsApi#gameGetGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GameEndpointsApi#gameGetGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SDGameGetResponse**](SDGameGetResponse.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gameMutatePut"></a>
# **gameMutatePut**
> kotlin.Any gameMutatePut(sdGameMutateRequest)

Mutate Game

Change a games data

### Example
```kotlin
// Import classes:
//import gg.stardust.coresdk.infrastructure.*
//import gg.stardust.coresdk.models.*

val apiInstance = GameEndpointsApi()
val sdGameMutateRequest : SDGameMutateRequest =  // SDGameMutateRequest | 
try {
    val result : kotlin.Any = apiInstance.gameMutatePut(sdGameMutateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GameEndpointsApi#gameMutatePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GameEndpointsApi#gameMutatePut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sdGameMutateRequest** | [**SDGameMutateRequest**](SDGameMutateRequest.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

