# TemplateEndpointsApi

All URIs are relative to *https://core-api.stardust.gg/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**templateCountGet**](TemplateEndpointsApi.md#templateCountGet) | **GET** /template/count | Get Template Count
[**templateCreatePost**](TemplateEndpointsApi.md#templateCreatePost) | **POST** /template/create | Create Template
[**templateGetAllGet**](TemplateEndpointsApi.md#templateGetAllGet) | **GET** /template/get-all | Get All Templates
[**templateGetGet**](TemplateEndpointsApi.md#templateGetGet) | **GET** /template/get | Get Template
[**templateGetTokensGet**](TemplateEndpointsApi.md#templateGetTokensGet) | **GET** /template/get-tokens | Get Template Tokens
[**templateMutatePut**](TemplateEndpointsApi.md#templateMutatePut) | **PUT** /template/mutate | Mutate Template
[**templatePropsRemoveDelete**](TemplateEndpointsApi.md#templatePropsRemoveDelete) | **DELETE** /template/props-remove | Remove Template Property
[**templateRemoveDelete**](TemplateEndpointsApi.md#templateRemoveDelete) | **DELETE** /template/remove | Remove Template


<a name="templateCountGet"></a>
# **templateCountGet**
> SDTemplateCountResponse templateCountGet(filter)

Get Template Count

Get a Template&#39;s Count Within a Game

### Example
```kotlin
// Import classes:
//import gg.stardust.coresdk.infrastructure.*
//import gg.stardust.coresdk.models.*

val apiInstance = TemplateEndpointsApi()
val filter : kotlin.String = filter_example // kotlin.String | Find a substring within the Template name field
try {
    val result : SDTemplateCountResponse = apiInstance.templateCountGet(filter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplateEndpointsApi#templateCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplateEndpointsApi#templateCountGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **kotlin.String**| Find a substring within the Template name field | [optional]

### Return type

[**SDTemplateCountResponse**](SDTemplateCountResponse.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="templateCreatePost"></a>
# **templateCreatePost**
> SDTemplateCreateResponse templateCreatePost(sdTemplateCreateRequest)

Create Template

Adds a New Token Template that lets Players Acquire that Token using the Token/Mint Endpoint

### Example
```kotlin
// Import classes:
//import gg.stardust.coresdk.infrastructure.*
//import gg.stardust.coresdk.models.*

val apiInstance = TemplateEndpointsApi()
val sdTemplateCreateRequest : SDTemplateCreateRequest =  // SDTemplateCreateRequest | 
try {
    val result : SDTemplateCreateResponse = apiInstance.templateCreatePost(sdTemplateCreateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplateEndpointsApi#templateCreatePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplateEndpointsApi#templateCreatePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sdTemplateCreateRequest** | [**SDTemplateCreateRequest**](SDTemplateCreateRequest.md)|  |

### Return type

[**SDTemplateCreateResponse**](SDTemplateCreateResponse.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="templateGetAllGet"></a>
# **templateGetAllGet**
> kotlin.collections.List&lt;SDTemplateGetAllResponse&gt; templateGetAllGet(start, limit, filter)

Get All Templates

Get All of the Templates Within a Game

### Example
```kotlin
// Import classes:
//import gg.stardust.coresdk.infrastructure.*
//import gg.stardust.coresdk.models.*

val apiInstance = TemplateEndpointsApi()
val start : kotlin.String = start_example // kotlin.String | position in list
val limit : kotlin.String = limit_example // kotlin.String | maximum templates returned in list
val filter : kotlin.String = filter_example // kotlin.String | Find a substring within the Template name field
try {
    val result : kotlin.collections.List<SDTemplateGetAllResponse> = apiInstance.templateGetAllGet(start, limit, filter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplateEndpointsApi#templateGetAllGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplateEndpointsApi#templateGetAllGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **kotlin.String**| position in list |
 **limit** | **kotlin.String**| maximum templates returned in list |
 **filter** | **kotlin.String**| Find a substring within the Template name field | [optional]

### Return type

[**kotlin.collections.List&lt;SDTemplateGetAllResponse&gt;**](SDTemplateGetAllResponse.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="templateGetGet"></a>
# **templateGetGet**
> SDTemplateGetResponse templateGetGet(templateId)

Get Template

Get the Details of a Template

### Example
```kotlin
// Import classes:
//import gg.stardust.coresdk.infrastructure.*
//import gg.stardust.coresdk.models.*

val apiInstance = TemplateEndpointsApi()
val templateId : kotlin.String = templateId_example // kotlin.String | Template Id such as 3589)
try {
    val result : SDTemplateGetResponse = apiInstance.templateGetGet(templateId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplateEndpointsApi#templateGetGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplateEndpointsApi#templateGetGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **kotlin.String**| Template Id such as 3589) |

### Return type

[**SDTemplateGetResponse**](SDTemplateGetResponse.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="templateGetTokensGet"></a>
# **templateGetTokensGet**
> kotlin.collections.List&lt;SDTemplateGetTokensResponse&gt; templateGetTokensGet(templateId, start, limit, includeDeleted)

Get Template Tokens

Get a List of All Minted Tokens from a Given Template

### Example
```kotlin
// Import classes:
//import gg.stardust.coresdk.infrastructure.*
//import gg.stardust.coresdk.models.*

val apiInstance = TemplateEndpointsApi()
val templateId : kotlin.String = templateId_example // kotlin.String | The ID of the Template
val start : kotlin.String = start_example // kotlin.String | position in list
val limit : kotlin.String = limit_example // kotlin.String | maximum templates returned in list
val includeDeleted : kotlin.String = includeDeleted_example // kotlin.String | If true tokens from deleted players are included in the response
try {
    val result : kotlin.collections.List<SDTemplateGetTokensResponse> = apiInstance.templateGetTokensGet(templateId, start, limit, includeDeleted)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplateEndpointsApi#templateGetTokensGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplateEndpointsApi#templateGetTokensGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **kotlin.String**| The ID of the Template |
 **start** | **kotlin.String**| position in list | [optional]
 **limit** | **kotlin.String**| maximum templates returned in list | [optional]
 **includeDeleted** | **kotlin.String**| If true tokens from deleted players are included in the response | [optional]

### Return type

[**kotlin.collections.List&lt;SDTemplateGetTokensResponse&gt;**](SDTemplateGetTokensResponse.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="templateMutatePut"></a>
# **templateMutatePut**
> kotlin.Any templateMutatePut(sdTemplateMutateRequest)

Mutate Template

Mutates a Property of a Template, Which in Turn will Affect the Inherited Property on All of the Tokens Created from this Template (via token/mint)

### Example
```kotlin
// Import classes:
//import gg.stardust.coresdk.infrastructure.*
//import gg.stardust.coresdk.models.*

val apiInstance = TemplateEndpointsApi()
val sdTemplateMutateRequest : SDTemplateMutateRequest =  // SDTemplateMutateRequest | 
try {
    val result : kotlin.Any = apiInstance.templateMutatePut(sdTemplateMutateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplateEndpointsApi#templateMutatePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplateEndpointsApi#templateMutatePut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sdTemplateMutateRequest** | [**SDTemplateMutateRequest**](SDTemplateMutateRequest.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="templatePropsRemoveDelete"></a>
# **templatePropsRemoveDelete**
> kotlin.Any templatePropsRemoveDelete(templateId, props)

Remove Template Property

Removes a Templates Property from Your Game

### Example
```kotlin
// Import classes:
//import gg.stardust.coresdk.infrastructure.*
//import gg.stardust.coresdk.models.*

val apiInstance = TemplateEndpointsApi()
val templateId : kotlin.String = templateId_example // kotlin.String | Template Id returned from template/create (ex. 5)
val props : kotlin.String = props_example // kotlin.String | Stringify Array of template mutable property names ex: '[\"exp\", \"health\"]' }
try {
    val result : kotlin.Any = apiInstance.templatePropsRemoveDelete(templateId, props)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplateEndpointsApi#templatePropsRemoveDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplateEndpointsApi#templatePropsRemoveDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **kotlin.String**| Template Id returned from template/create (ex. 5) |
 **props** | **kotlin.String**| Stringify Array of template mutable property names ex: &#39;[\&quot;exp\&quot;, \&quot;health\&quot;]&#39; } |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="templateRemoveDelete"></a>
# **templateRemoveDelete**
> kotlin.Any templateRemoveDelete(templateId)

Remove Template

Removes a Template from Your Game. If Players have Instances of this Template from the token/mint Command, Their Tokens will NOT be Removed

### Example
```kotlin
// Import classes:
//import gg.stardust.coresdk.infrastructure.*
//import gg.stardust.coresdk.models.*

val apiInstance = TemplateEndpointsApi()
val templateId : kotlin.String = templateId_example // kotlin.String | Template Id returned from template/create (ex. 5)
try {
    val result : kotlin.Any = apiInstance.templateRemoveDelete(templateId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplateEndpointsApi#templateRemoveDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplateEndpointsApi#templateRemoveDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **kotlin.String**| Template Id returned from template/create (ex. 5) |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

