# PlayerEndpointsApi

All URIs are relative to *https://core-api.stardust.gg/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**playerCountGet**](PlayerEndpointsApi.md#playerCountGet) | **GET** /player/count | Get Player Count
[**playerCreatePost**](PlayerEndpointsApi.md#playerCreatePost) | **POST** /player/create | Create Player
[**playerGetAllGet**](PlayerEndpointsApi.md#playerGetAllGet) | **GET** /player/get-all | Get All Players
[**playerGetGet**](PlayerEndpointsApi.md#playerGetGet) | **GET** /player/get | Get Player
[**playerGetIdGet**](PlayerEndpointsApi.md#playerGetIdGet) | **GET** /player/get-id | Get Player ID
[**playerGetIdsGet**](PlayerEndpointsApi.md#playerGetIdsGet) | **GET** /player/get-ids | Get All Player IDs
[**playerGetInventoryGet**](PlayerEndpointsApi.md#playerGetInventoryGet) | **GET** /player/get-inventory | Get Player Inventory
[**playerMutatePut**](PlayerEndpointsApi.md#playerMutatePut) | **PUT** /player/mutate | Mutate Player
[**playerRemoveDelete**](PlayerEndpointsApi.md#playerRemoveDelete) | **DELETE** /player/remove | Remove Player
[**playerWalletGetGet**](PlayerEndpointsApi.md#playerWalletGetGet) | **GET** /player/wallet-get | Get Player Wallet
[**playerWithdrawPost**](PlayerEndpointsApi.md#playerWithdrawPost) | **POST** /player/withdraw | Withdraw From Player


<a name="playerCountGet"></a>
# **playerCountGet**
> SDPlayerCountResponse playerCountGet()

Get Player Count

Get Player count within a game

### Example
```kotlin
// Import classes:
//import gg.stardust.coresdk.infrastructure.*
//import gg.stardust.coresdk.models.*

val apiInstance = PlayerEndpointsApi()
try {
    val result : SDPlayerCountResponse = apiInstance.playerCountGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlayerEndpointsApi#playerCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayerEndpointsApi#playerCountGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SDPlayerCountResponse**](SDPlayerCountResponse.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playerCreatePost"></a>
# **playerCreatePost**
> SDPlayerCreateResponse playerCreatePost(sdPlayerCreateRequest)

Create Player

Create a Player for a game. Returns their player id which can be used to reference them later in Stardust&#39;s system

### Example
```kotlin
// Import classes:
//import gg.stardust.coresdk.infrastructure.*
//import gg.stardust.coresdk.models.*

val apiInstance = PlayerEndpointsApi()
val sdPlayerCreateRequest : SDPlayerCreateRequest =  // SDPlayerCreateRequest | 
try {
    val result : SDPlayerCreateResponse = apiInstance.playerCreatePost(sdPlayerCreateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlayerEndpointsApi#playerCreatePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayerEndpointsApi#playerCreatePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sdPlayerCreateRequest** | [**SDPlayerCreateRequest**](SDPlayerCreateRequest.md)|  |

### Return type

[**SDPlayerCreateResponse**](SDPlayerCreateResponse.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="playerGetAllGet"></a>
# **playerGetAllGet**
> kotlin.collections.List&lt;SDPlayerGetAllResponse&gt; playerGetAllGet(start, filter, limit)

Get All Players

Get the List of All Players in Game

### Example
```kotlin
// Import classes:
//import gg.stardust.coresdk.infrastructure.*
//import gg.stardust.coresdk.models.*

val apiInstance = PlayerEndpointsApi()
val start : kotlin.String = start_example // kotlin.String | position in list
val filter : kotlin.String = filter_example // kotlin.String | Find a substring within the Player unique ID field
val limit : kotlin.String = limit_example // kotlin.String | maximum items returned in list
try {
    val result : kotlin.collections.List<SDPlayerGetAllResponse> = apiInstance.playerGetAllGet(start, filter, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlayerEndpointsApi#playerGetAllGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayerEndpointsApi#playerGetAllGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **kotlin.String**| position in list | [optional]
 **filter** | **kotlin.String**| Find a substring within the Player unique ID field | [optional]
 **limit** | **kotlin.String**| maximum items returned in list | [optional]

### Return type

[**kotlin.collections.List&lt;SDPlayerGetAllResponse&gt;**](SDPlayerGetAllResponse.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playerGetGet"></a>
# **playerGetGet**
> SDPlayerGetResponse playerGetGet(playerId)

Get Player

Get Details of a Player Within a Game

### Example
```kotlin
// Import classes:
//import gg.stardust.coresdk.infrastructure.*
//import gg.stardust.coresdk.models.*

val apiInstance = PlayerEndpointsApi()
val playerId : kotlin.String = playerId_example // kotlin.String | Player id
try {
    val result : SDPlayerGetResponse = apiInstance.playerGetGet(playerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlayerEndpointsApi#playerGetGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayerEndpointsApi#playerGetGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playerId** | **kotlin.String**| Player id |

### Return type

[**SDPlayerGetResponse**](SDPlayerGetResponse.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playerGetIdGet"></a>
# **playerGetIdGet**
> SDPlayerGetIdResponse playerGetIdGet(uniqueId)

Get Player ID

Get a Player&#39;s ID via their Unique ID

### Example
```kotlin
// Import classes:
//import gg.stardust.coresdk.infrastructure.*
//import gg.stardust.coresdk.models.*

val apiInstance = PlayerEndpointsApi()
val uniqueId : kotlin.String = uniqueId_example // kotlin.String | Player's Unique ID
try {
    val result : SDPlayerGetIdResponse = apiInstance.playerGetIdGet(uniqueId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlayerEndpointsApi#playerGetIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayerEndpointsApi#playerGetIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uniqueId** | **kotlin.String**| Player&#39;s Unique ID |

### Return type

[**SDPlayerGetIdResponse**](SDPlayerGetIdResponse.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playerGetIdsGet"></a>
# **playerGetIdsGet**
> kotlin.collections.List&lt;SDPlayerGetIdsResponse&gt; playerGetIdsGet()

Get All Player IDs

Get All Player IDs for a Given Game

### Example
```kotlin
// Import classes:
//import gg.stardust.coresdk.infrastructure.*
//import gg.stardust.coresdk.models.*

val apiInstance = PlayerEndpointsApi()
try {
    val result : kotlin.collections.List<SDPlayerGetIdsResponse> = apiInstance.playerGetIdsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlayerEndpointsApi#playerGetIdsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayerEndpointsApi#playerGetIdsGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;SDPlayerGetIdsResponse&gt;**](SDPlayerGetIdsResponse.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playerGetInventoryGet"></a>
# **playerGetInventoryGet**
> kotlin.collections.List&lt;SDPlayerGetInventoryResponse&gt; playerGetInventoryGet(playerId, start, tokenIds, limit)

Get Player Inventory

Get a players inventory and all the items it holds

### Example
```kotlin
// Import classes:
//import gg.stardust.coresdk.infrastructure.*
//import gg.stardust.coresdk.models.*

val apiInstance = PlayerEndpointsApi()
val playerId : kotlin.String = playerId_example // kotlin.String | Player id
val start : kotlin.String = start_example // kotlin.String | position in list
val tokenIds : kotlin.String = tokenIds_example // kotlin.String | Comma-Separated String of token ids (ex. '3589, 3580')
val limit : kotlin.String = limit_example // kotlin.String | maximum items returned in list
try {
    val result : kotlin.collections.List<SDPlayerGetInventoryResponse> = apiInstance.playerGetInventoryGet(playerId, start, tokenIds, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlayerEndpointsApi#playerGetInventoryGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayerEndpointsApi#playerGetInventoryGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playerId** | **kotlin.String**| Player id |
 **start** | **kotlin.String**| position in list | [optional]
 **tokenIds** | **kotlin.String**| Comma-Separated String of token ids (ex. &#39;3589, 3580&#39;) | [optional]
 **limit** | **kotlin.String**| maximum items returned in list | [optional]

### Return type

[**kotlin.collections.List&lt;SDPlayerGetInventoryResponse&gt;**](SDPlayerGetInventoryResponse.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playerMutatePut"></a>
# **playerMutatePut**
> kotlin.Any playerMutatePut(sdPlayerMutateRequest)

Mutate Player

Change player data

### Example
```kotlin
// Import classes:
//import gg.stardust.coresdk.infrastructure.*
//import gg.stardust.coresdk.models.*

val apiInstance = PlayerEndpointsApi()
val sdPlayerMutateRequest : SDPlayerMutateRequest =  // SDPlayerMutateRequest | 
try {
    val result : kotlin.Any = apiInstance.playerMutatePut(sdPlayerMutateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlayerEndpointsApi#playerMutatePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayerEndpointsApi#playerMutatePut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sdPlayerMutateRequest** | [**SDPlayerMutateRequest**](SDPlayerMutateRequest.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="playerRemoveDelete"></a>
# **playerRemoveDelete**
> kotlin.Any playerRemoveDelete(playerId)

Remove Player

Removes (hides) a player from your game. This is not permanent.

### Example
```kotlin
// Import classes:
//import gg.stardust.coresdk.infrastructure.*
//import gg.stardust.coresdk.models.*

val apiInstance = PlayerEndpointsApi()
val playerId : kotlin.String = playerId_example // kotlin.String | Player Id returned from player/create a UUID, i.e. 802760b0-2bb5-4fba-9237-895ed02cf8d8
try {
    val result : kotlin.Any = apiInstance.playerRemoveDelete(playerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlayerEndpointsApi#playerRemoveDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayerEndpointsApi#playerRemoveDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playerId** | **kotlin.String**| Player Id returned from player/create a UUID, i.e. 802760b0-2bb5-4fba-9237-895ed02cf8d8 |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playerWalletGetGet"></a>
# **playerWalletGetGet**
> SDPlayerWalletGetResponse playerWalletGetGet(playerId)

Get Player Wallet

Get player&#39;s wallet within a game

### Example
```kotlin
// Import classes:
//import gg.stardust.coresdk.infrastructure.*
//import gg.stardust.coresdk.models.*

val apiInstance = PlayerEndpointsApi()
val playerId : kotlin.String = playerId_example // kotlin.String | Player id
try {
    val result : SDPlayerWalletGetResponse = apiInstance.playerWalletGetGet(playerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlayerEndpointsApi#playerWalletGetGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayerEndpointsApi#playerWalletGetGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playerId** | **kotlin.String**| Player id |

### Return type

[**SDPlayerWalletGetResponse**](SDPlayerWalletGetResponse.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playerWithdrawPost"></a>
# **playerWithdrawPost**
> kotlin.Any playerWithdrawPost(sdPlayerWithdrawRequest)

Withdraw From Player

Withdraw a Player&#39;s Tokens from their Stardust Wallet

### Example
```kotlin
// Import classes:
//import gg.stardust.coresdk.infrastructure.*
//import gg.stardust.coresdk.models.*

val apiInstance = PlayerEndpointsApi()
val sdPlayerWithdrawRequest : SDPlayerWithdrawRequest =  // SDPlayerWithdrawRequest | 
try {
    val result : kotlin.Any = apiInstance.playerWithdrawPost(sdPlayerWithdrawRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlayerEndpointsApi#playerWithdrawPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayerEndpointsApi#playerWithdrawPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sdPlayerWithdrawRequest** | [**SDPlayerWithdrawRequest**](SDPlayerWithdrawRequest.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

