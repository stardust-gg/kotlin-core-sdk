# TokenEndpointsApi

All URIs are relative to *https://core-api.stardust.gg/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tokenBurnPost**](TokenEndpointsApi.md#tokenBurnPost) | **POST** /token/burn | Burn Token
[**tokenGetGet**](TokenEndpointsApi.md#tokenGetGet) | **GET** /token/get | Get Token
[**tokenMintBulkPost**](TokenEndpointsApi.md#tokenMintBulkPost) | **POST** /token/mint-bulk | Mint Tokens
[**tokenMutatePut**](TokenEndpointsApi.md#tokenMutatePut) | **PUT** /token/mutate | Mutate Token
[**tokenPropsRemoveDelete**](TokenEndpointsApi.md#tokenPropsRemoveDelete) | **DELETE** /token/props-remove | Remove Token Property
[**tokenTransferPost**](TokenEndpointsApi.md#tokenTransferPost) | **POST** /token/transfer | Transfer Tokens
[**tokenWithdrawPost**](TokenEndpointsApi.md#tokenWithdrawPost) | **POST** /token/withdraw | Withdraw Token


<a name="tokenBurnPost"></a>
# **tokenBurnPost**
> kotlin.Any tokenBurnPost(sdTokenBurnRequest)

Burn Token

Burns token on-chain. Cannot be reversed.

### Example
```kotlin
// Import classes:
//import gg.stardust.coresdk.infrastructure.*
//import gg.stardust.coresdk.models.*

val apiInstance = TokenEndpointsApi()
val sdTokenBurnRequest : SDTokenBurnRequest =  // SDTokenBurnRequest | 
try {
    val result : kotlin.Any = apiInstance.tokenBurnPost(sdTokenBurnRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TokenEndpointsApi#tokenBurnPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TokenEndpointsApi#tokenBurnPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sdTokenBurnRequest** | [**SDTokenBurnRequest**](SDTokenBurnRequest.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="tokenGetGet"></a>
# **tokenGetGet**
> kotlin.collections.List&lt;SDTokenGetResponse&gt; tokenGetGet(tokenIds)

Get Token

Some of the details of this token are based upon the Template that it was created from (using token/mint)

### Example
```kotlin
// Import classes:
//import gg.stardust.coresdk.infrastructure.*
//import gg.stardust.coresdk.models.*

val apiInstance = TokenEndpointsApi()
val tokenIds : kotlin.String = tokenIds_example // kotlin.String | Stringify Array of token ids (ex. '[3589, 3580]')
try {
    val result : kotlin.collections.List<SDTokenGetResponse> = apiInstance.tokenGetGet(tokenIds)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TokenEndpointsApi#tokenGetGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TokenEndpointsApi#tokenGetGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenIds** | **kotlin.String**| Stringify Array of token ids (ex. &#39;[3589, 3580]&#39;) |

### Return type

[**kotlin.collections.List&lt;SDTokenGetResponse&gt;**](SDTokenGetResponse.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="tokenMintBulkPost"></a>
# **tokenMintBulkPost**
> kotlin.collections.List&lt;kotlin.Int&gt; tokenMintBulkPost(sdTokenMintBulkRequest)

Mint Tokens

Mint tokens to a player

### Example
```kotlin
// Import classes:
//import gg.stardust.coresdk.infrastructure.*
//import gg.stardust.coresdk.models.*

val apiInstance = TokenEndpointsApi()
val sdTokenMintBulkRequest : SDTokenMintBulkRequest =  // SDTokenMintBulkRequest | 
try {
    val result : kotlin.collections.List<kotlin.Int> = apiInstance.tokenMintBulkPost(sdTokenMintBulkRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TokenEndpointsApi#tokenMintBulkPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TokenEndpointsApi#tokenMintBulkPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sdTokenMintBulkRequest** | [**SDTokenMintBulkRequest**](SDTokenMintBulkRequest.md)|  |

### Return type

**kotlin.collections.List&lt;kotlin.Int&gt;**

### Authorization


Configure api_key:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="tokenMutatePut"></a>
# **tokenMutatePut**
> kotlin.Any tokenMutatePut(sdTokenMutateRequest)

Mutate Token

Mutates a Property of a Token

### Example
```kotlin
// Import classes:
//import gg.stardust.coresdk.infrastructure.*
//import gg.stardust.coresdk.models.*

val apiInstance = TokenEndpointsApi()
val sdTokenMutateRequest : SDTokenMutateRequest =  // SDTokenMutateRequest | 
try {
    val result : kotlin.Any = apiInstance.tokenMutatePut(sdTokenMutateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TokenEndpointsApi#tokenMutatePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TokenEndpointsApi#tokenMutatePut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sdTokenMutateRequest** | [**SDTokenMutateRequest**](SDTokenMutateRequest.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="tokenPropsRemoveDelete"></a>
# **tokenPropsRemoveDelete**
> kotlin.Any tokenPropsRemoveDelete(tokenId, props)

Remove Token Property

Removes a Tokens Property from Your Game

### Example
```kotlin
// Import classes:
//import gg.stardust.coresdk.infrastructure.*
//import gg.stardust.coresdk.models.*

val apiInstance = TokenEndpointsApi()
val tokenId : kotlin.String = tokenId_example // kotlin.String | Token Id returned from token/create (ex. 5)
val props : kotlin.String = props_example // kotlin.String | Stringify Array of token mutable property names ex: '[\"exp\", \"health\"]' }
try {
    val result : kotlin.Any = apiInstance.tokenPropsRemoveDelete(tokenId, props)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TokenEndpointsApi#tokenPropsRemoveDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TokenEndpointsApi#tokenPropsRemoveDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenId** | **kotlin.String**| Token Id returned from token/create (ex. 5) |
 **props** | **kotlin.String**| Stringify Array of token mutable property names ex: &#39;[\&quot;exp\&quot;, \&quot;health\&quot;]&#39; } |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="tokenTransferPost"></a>
# **tokenTransferPost**
> kotlin.Any tokenTransferPost(sdTokenTransferRequest)

Transfer Tokens

Use this Endpoint to Facilitate Moving Tokens from one Player to Another

### Example
```kotlin
// Import classes:
//import gg.stardust.coresdk.infrastructure.*
//import gg.stardust.coresdk.models.*

val apiInstance = TokenEndpointsApi()
val sdTokenTransferRequest : SDTokenTransferRequest =  // SDTokenTransferRequest | 
try {
    val result : kotlin.Any = apiInstance.tokenTransferPost(sdTokenTransferRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TokenEndpointsApi#tokenTransferPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TokenEndpointsApi#tokenTransferPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sdTokenTransferRequest** | [**SDTokenTransferRequest**](SDTokenTransferRequest.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="tokenWithdrawPost"></a>
# **tokenWithdrawPost**
> kotlin.Any tokenWithdrawPost(sdTokenWithdrawRequest)

Withdraw Token

Withdraw tokens from a Stardust Wallet

### Example
```kotlin
// Import classes:
//import gg.stardust.coresdk.infrastructure.*
//import gg.stardust.coresdk.models.*

val apiInstance = TokenEndpointsApi()
val sdTokenWithdrawRequest : SDTokenWithdrawRequest =  // SDTokenWithdrawRequest | 
try {
    val result : kotlin.Any = apiInstance.tokenWithdrawPost(sdTokenWithdrawRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TokenEndpointsApi#tokenWithdrawPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TokenEndpointsApi#tokenWithdrawPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sdTokenWithdrawRequest** | [**SDTokenWithdrawRequest**](SDTokenWithdrawRequest.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

