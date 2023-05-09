# OrderEndpointsApi

All URIs are relative to *https://core-api.stardust.gg/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**orderBuyPost**](OrderEndpointsApi.md#orderBuyPost) | **POST** /order/buy | Buy Order
[**orderCancelDelete**](OrderEndpointsApi.md#orderCancelDelete) | **DELETE** /order/cancel | Cancel Order
[**orderCreatePost**](OrderEndpointsApi.md#orderCreatePost) | **POST** /order/create | Create Order
[**orderGetAllGet**](OrderEndpointsApi.md#orderGetAllGet) | **GET** /order/get-all | Get All Orders
[**orderGetGet**](OrderEndpointsApi.md#orderGetGet) | **GET** /order/get | Get Order


<a name="orderBuyPost"></a>
# **orderBuyPost**
> kotlin.Any orderBuyPost(sdOrderBuyRequest)

Buy Order

Buy a Order

### Example
```kotlin
// Import classes:
//import gg.stardust.coresdk.infrastructure.*
//import gg.stardust.coresdk.models.*

val apiInstance = OrderEndpointsApi()
val sdOrderBuyRequest : SDOrderBuyRequest =  // SDOrderBuyRequest | 
try {
    val result : kotlin.Any = apiInstance.orderBuyPost(sdOrderBuyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrderEndpointsApi#orderBuyPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderEndpointsApi#orderBuyPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sdOrderBuyRequest** | [**SDOrderBuyRequest**](SDOrderBuyRequest.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orderCancelDelete"></a>
# **orderCancelDelete**
> kotlin.Any orderCancelDelete(orderId)

Cancel Order

Cancels a Order

### Example
```kotlin
// Import classes:
//import gg.stardust.coresdk.infrastructure.*
//import gg.stardust.coresdk.models.*

val apiInstance = OrderEndpointsApi()
val orderId : kotlin.String = orderId_example // kotlin.String | Order Id unsigned 32 bit integer
try {
    val result : kotlin.Any = apiInstance.orderCancelDelete(orderId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrderEndpointsApi#orderCancelDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderEndpointsApi#orderCancelDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **kotlin.String**| Order Id unsigned 32 bit integer |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="orderCreatePost"></a>
# **orderCreatePost**
> SDOrderCreateResponse orderCreatePost(sdOrderCreateRequest)

Create Order

Adds a New Order

### Example
```kotlin
// Import classes:
//import gg.stardust.coresdk.infrastructure.*
//import gg.stardust.coresdk.models.*

val apiInstance = OrderEndpointsApi()
val sdOrderCreateRequest : SDOrderCreateRequest =  // SDOrderCreateRequest | 
try {
    val result : SDOrderCreateResponse = apiInstance.orderCreatePost(sdOrderCreateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrderEndpointsApi#orderCreatePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderEndpointsApi#orderCreatePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sdOrderCreateRequest** | [**SDOrderCreateRequest**](SDOrderCreateRequest.md)|  |

### Return type

[**SDOrderCreateResponse**](SDOrderCreateResponse.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orderGetAllGet"></a>
# **orderGetAllGet**
> kotlin.collections.List&lt;SDOrderGetAllResponse&gt; orderGetAllGet(start, limit, playerId, status)

Get All Orders

Get the List of Game Orders

### Example
```kotlin
// Import classes:
//import gg.stardust.coresdk.infrastructure.*
//import gg.stardust.coresdk.models.*

val apiInstance = OrderEndpointsApi()
val start : kotlin.String = start_example // kotlin.String | position in list
val limit : kotlin.String = limit_example // kotlin.String | maximum templates returned in list
val playerId : kotlin.String = playerId_example // kotlin.String | A Games PlayerId to filter by player
val status : kotlin.String = status_example // kotlin.String | State of the order to filter. Default is offer. ('offer', 'accepted', 'cancelled')
try {
    val result : kotlin.collections.List<SDOrderGetAllResponse> = apiInstance.orderGetAllGet(start, limit, playerId, status)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrderEndpointsApi#orderGetAllGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderEndpointsApi#orderGetAllGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **kotlin.String**| position in list |
 **limit** | **kotlin.String**| maximum templates returned in list |
 **playerId** | **kotlin.String**| A Games PlayerId to filter by player | [optional]
 **status** | **kotlin.String**| State of the order to filter. Default is offer. (&#39;offer&#39;, &#39;accepted&#39;, &#39;cancelled&#39;) | [optional]

### Return type

[**kotlin.collections.List&lt;SDOrderGetAllResponse&gt;**](SDOrderGetAllResponse.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="orderGetGet"></a>
# **orderGetGet**
> SDOrderGetResponse orderGetGet(orderId)

Get Order

Get a Game Order

### Example
```kotlin
// Import classes:
//import gg.stardust.coresdk.infrastructure.*
//import gg.stardust.coresdk.models.*

val apiInstance = OrderEndpointsApi()
val orderId : kotlin.String = orderId_example // kotlin.String | An Order ID
try {
    val result : SDOrderGetResponse = apiInstance.orderGetGet(orderId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrderEndpointsApi#orderGetGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderEndpointsApi#orderGetGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **kotlin.String**| An Order ID |

### Return type

[**SDOrderGetResponse**](SDOrderGetResponse.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

