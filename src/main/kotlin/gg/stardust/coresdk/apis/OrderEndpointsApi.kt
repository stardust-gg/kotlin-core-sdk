/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package gg.stardust.coresdk.apis

import java.io.IOException
import okhttp3.OkHttpClient
import okhttp3.HttpUrl

import gg.stardust.coresdk.models.Error
import gg.stardust.coresdk.models.SDOrderBuyRequest
import gg.stardust.coresdk.models.SDOrderCreateRequest
import gg.stardust.coresdk.models.SDOrderCreateResponse
import gg.stardust.coresdk.models.SDOrderGetAllResponse
import gg.stardust.coresdk.models.SDOrderGetResponse

import com.squareup.moshi.Json

import gg.stardust.coresdk.infrastructure.ApiClient
import gg.stardust.coresdk.infrastructure.ApiResponse
import gg.stardust.coresdk.infrastructure.ClientException
import gg.stardust.coresdk.infrastructure.ClientError
import gg.stardust.coresdk.infrastructure.ServerException
import gg.stardust.coresdk.infrastructure.ServerError
import gg.stardust.coresdk.infrastructure.MultiValueMap
import gg.stardust.coresdk.infrastructure.PartConfig
import gg.stardust.coresdk.infrastructure.RequestConfig
import gg.stardust.coresdk.infrastructure.RequestMethod
import gg.stardust.coresdk.infrastructure.ResponseType
import gg.stardust.coresdk.infrastructure.Success
import gg.stardust.coresdk.infrastructure.toMultiValue

class OrderEndpointsApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://core-api.stardust.gg/v1")
        }
    }

    /**
     * Buy Order
     * Buy a Order
     * @param sdOrderBuyRequest 
     * @return kotlin.Any
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun orderBuyPost(sdOrderBuyRequest: SDOrderBuyRequest) : kotlin.Any {
        val localVarResponse = orderBuyPostWithHttpInfo(sdOrderBuyRequest = sdOrderBuyRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Any
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Buy Order
     * Buy a Order
     * @param sdOrderBuyRequest 
     * @return ApiResponse<kotlin.Any?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun orderBuyPostWithHttpInfo(sdOrderBuyRequest: SDOrderBuyRequest) : ApiResponse<kotlin.Any?> {
        val localVariableConfig = orderBuyPostRequestConfig(sdOrderBuyRequest = sdOrderBuyRequest)

        return request<SDOrderBuyRequest, kotlin.Any>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation orderBuyPost
     *
     * @param sdOrderBuyRequest 
     * @return RequestConfig
     */
    fun orderBuyPostRequestConfig(sdOrderBuyRequest: SDOrderBuyRequest) : RequestConfig<SDOrderBuyRequest> {
        val localVariableBody = sdOrderBuyRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/order/buy",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Cancel Order
     * Cancels a Order
     * @param orderId Order Id unsigned 32 bit integer
     * @return kotlin.Any
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun orderCancelDelete(orderId: kotlin.String) : kotlin.Any {
        val localVarResponse = orderCancelDeleteWithHttpInfo(orderId = orderId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Any
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Cancel Order
     * Cancels a Order
     * @param orderId Order Id unsigned 32 bit integer
     * @return ApiResponse<kotlin.Any?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun orderCancelDeleteWithHttpInfo(orderId: kotlin.String) : ApiResponse<kotlin.Any?> {
        val localVariableConfig = orderCancelDeleteRequestConfig(orderId = orderId)

        return request<Unit, kotlin.Any>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation orderCancelDelete
     *
     * @param orderId Order Id unsigned 32 bit integer
     * @return RequestConfig
     */
    fun orderCancelDeleteRequestConfig(orderId: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                put("orderId", listOf(orderId.toString()))
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/order/cancel",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Create Order
     * Adds a New Order
     * @param sdOrderCreateRequest 
     * @return SDOrderCreateResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun orderCreatePost(sdOrderCreateRequest: SDOrderCreateRequest) : SDOrderCreateResponse {
        val localVarResponse = orderCreatePostWithHttpInfo(sdOrderCreateRequest = sdOrderCreateRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as SDOrderCreateResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Create Order
     * Adds a New Order
     * @param sdOrderCreateRequest 
     * @return ApiResponse<SDOrderCreateResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun orderCreatePostWithHttpInfo(sdOrderCreateRequest: SDOrderCreateRequest) : ApiResponse<SDOrderCreateResponse?> {
        val localVariableConfig = orderCreatePostRequestConfig(sdOrderCreateRequest = sdOrderCreateRequest)

        return request<SDOrderCreateRequest, SDOrderCreateResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation orderCreatePost
     *
     * @param sdOrderCreateRequest 
     * @return RequestConfig
     */
    fun orderCreatePostRequestConfig(sdOrderCreateRequest: SDOrderCreateRequest) : RequestConfig<SDOrderCreateRequest> {
        val localVariableBody = sdOrderCreateRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/order/create",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Get All Orders
     * Get the List of Game Orders
     * @param start position in list
     * @param limit maximum templates returned in list
     * @param playerId A Games PlayerId to filter by player (optional)
     * @param status State of the order to filter. Default is offer. (&#39;offer&#39;, &#39;accepted&#39;, &#39;cancelled&#39;) (optional)
     * @return kotlin.collections.List<SDOrderGetAllResponse>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun orderGetAllGet(start: kotlin.String, limit: kotlin.String, playerId: kotlin.String? = null, status: kotlin.String? = null) : kotlin.collections.List<SDOrderGetAllResponse> {
        val localVarResponse = orderGetAllGetWithHttpInfo(start = start, limit = limit, playerId = playerId, status = status)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<SDOrderGetAllResponse>
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Get All Orders
     * Get the List of Game Orders
     * @param start position in list
     * @param limit maximum templates returned in list
     * @param playerId A Games PlayerId to filter by player (optional)
     * @param status State of the order to filter. Default is offer. (&#39;offer&#39;, &#39;accepted&#39;, &#39;cancelled&#39;) (optional)
     * @return ApiResponse<kotlin.collections.List<SDOrderGetAllResponse>?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun orderGetAllGetWithHttpInfo(start: kotlin.String, limit: kotlin.String, playerId: kotlin.String?, status: kotlin.String?) : ApiResponse<kotlin.collections.List<SDOrderGetAllResponse>?> {
        val localVariableConfig = orderGetAllGetRequestConfig(start = start, limit = limit, playerId = playerId, status = status)

        return request<Unit, kotlin.collections.List<SDOrderGetAllResponse>>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation orderGetAllGet
     *
     * @param start position in list
     * @param limit maximum templates returned in list
     * @param playerId A Games PlayerId to filter by player (optional)
     * @param status State of the order to filter. Default is offer. (&#39;offer&#39;, &#39;accepted&#39;, &#39;cancelled&#39;) (optional)
     * @return RequestConfig
     */
    fun orderGetAllGetRequestConfig(start: kotlin.String, limit: kotlin.String, playerId: kotlin.String?, status: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                put("start", listOf(start.toString()))
                if (playerId != null) {
                    put("playerId", listOf(playerId.toString()))
                }
                if (status != null) {
                    put("status", listOf(status.toString()))
                }
                put("limit", listOf(limit.toString()))
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/order/get-all",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Get Order
     * Get a Game Order
     * @param orderId An Order ID
     * @return SDOrderGetResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun orderGetGet(orderId: kotlin.String) : SDOrderGetResponse {
        val localVarResponse = orderGetGetWithHttpInfo(orderId = orderId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as SDOrderGetResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Get Order
     * Get a Game Order
     * @param orderId An Order ID
     * @return ApiResponse<SDOrderGetResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun orderGetGetWithHttpInfo(orderId: kotlin.String) : ApiResponse<SDOrderGetResponse?> {
        val localVariableConfig = orderGetGetRequestConfig(orderId = orderId)

        return request<Unit, SDOrderGetResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation orderGetGet
     *
     * @param orderId An Order ID
     * @return RequestConfig
     */
    fun orderGetGetRequestConfig(orderId: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                put("orderId", listOf(orderId.toString()))
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/order/get",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
