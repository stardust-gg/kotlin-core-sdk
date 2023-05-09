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
import gg.stardust.coresdk.models.SDTokenBurnRequest
import gg.stardust.coresdk.models.SDTokenGetResponse
import gg.stardust.coresdk.models.SDTokenMintBulkRequest
import gg.stardust.coresdk.models.SDTokenMutateRequest
import gg.stardust.coresdk.models.SDTokenTransferRequest
import gg.stardust.coresdk.models.SDTokenWithdrawRequest

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

class TokenEndpointsApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://core-api.stardust.gg/v1")
        }
    }

    /**
     * Burn Token
     * Burns token on-chain. Cannot be reversed.
     * @param sdTokenBurnRequest 
     * @return kotlin.Any
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun tokenBurnPost(sdTokenBurnRequest: SDTokenBurnRequest) : kotlin.Any {
        val localVarResponse = tokenBurnPostWithHttpInfo(sdTokenBurnRequest = sdTokenBurnRequest)

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
     * Burn Token
     * Burns token on-chain. Cannot be reversed.
     * @param sdTokenBurnRequest 
     * @return ApiResponse<kotlin.Any?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun tokenBurnPostWithHttpInfo(sdTokenBurnRequest: SDTokenBurnRequest) : ApiResponse<kotlin.Any?> {
        val localVariableConfig = tokenBurnPostRequestConfig(sdTokenBurnRequest = sdTokenBurnRequest)

        return request<SDTokenBurnRequest, kotlin.Any>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation tokenBurnPost
     *
     * @param sdTokenBurnRequest 
     * @return RequestConfig
     */
    fun tokenBurnPostRequestConfig(sdTokenBurnRequest: SDTokenBurnRequest) : RequestConfig<SDTokenBurnRequest> {
        val localVariableBody = sdTokenBurnRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/token/burn",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Get Token
     * Some of the details of this token are based upon the Template that it was created from (using token/mint)
     * @param tokenIds Stringify Array of token ids (ex. &#39;[3589, 3580]&#39;)
     * @return kotlin.collections.List<SDTokenGetResponse>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun tokenGetGet(tokenIds: kotlin.String) : kotlin.collections.List<SDTokenGetResponse> {
        val localVarResponse = tokenGetGetWithHttpInfo(tokenIds = tokenIds)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<SDTokenGetResponse>
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
     * Get Token
     * Some of the details of this token are based upon the Template that it was created from (using token/mint)
     * @param tokenIds Stringify Array of token ids (ex. &#39;[3589, 3580]&#39;)
     * @return ApiResponse<kotlin.collections.List<SDTokenGetResponse>?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun tokenGetGetWithHttpInfo(tokenIds: kotlin.String) : ApiResponse<kotlin.collections.List<SDTokenGetResponse>?> {
        val localVariableConfig = tokenGetGetRequestConfig(tokenIds = tokenIds)

        return request<Unit, kotlin.collections.List<SDTokenGetResponse>>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation tokenGetGet
     *
     * @param tokenIds Stringify Array of token ids (ex. &#39;[3589, 3580]&#39;)
     * @return RequestConfig
     */
    fun tokenGetGetRequestConfig(tokenIds: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                put("tokenIds", listOf(tokenIds.toString()))
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/token/get",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Mint Tokens
     * Mint tokens to a player
     * @param sdTokenMintBulkRequest 
     * @return kotlin.collections.List<kotlin.Int>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun tokenMintBulkPost(sdTokenMintBulkRequest: SDTokenMintBulkRequest) : kotlin.collections.List<kotlin.Int> {
        val localVarResponse = tokenMintBulkPostWithHttpInfo(sdTokenMintBulkRequest = sdTokenMintBulkRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<kotlin.Int>
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
     * Mint Tokens
     * Mint tokens to a player
     * @param sdTokenMintBulkRequest 
     * @return ApiResponse<kotlin.collections.List<kotlin.Int>?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun tokenMintBulkPostWithHttpInfo(sdTokenMintBulkRequest: SDTokenMintBulkRequest) : ApiResponse<kotlin.collections.List<kotlin.Int>?> {
        val localVariableConfig = tokenMintBulkPostRequestConfig(sdTokenMintBulkRequest = sdTokenMintBulkRequest)

        return request<SDTokenMintBulkRequest, kotlin.collections.List<kotlin.Int>>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation tokenMintBulkPost
     *
     * @param sdTokenMintBulkRequest 
     * @return RequestConfig
     */
    fun tokenMintBulkPostRequestConfig(sdTokenMintBulkRequest: SDTokenMintBulkRequest) : RequestConfig<SDTokenMintBulkRequest> {
        val localVariableBody = sdTokenMintBulkRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/token/mint-bulk",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Mutate Token
     * Mutates a Property of a Token
     * @param sdTokenMutateRequest 
     * @return kotlin.Any
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun tokenMutatePut(sdTokenMutateRequest: SDTokenMutateRequest) : kotlin.Any {
        val localVarResponse = tokenMutatePutWithHttpInfo(sdTokenMutateRequest = sdTokenMutateRequest)

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
     * Mutate Token
     * Mutates a Property of a Token
     * @param sdTokenMutateRequest 
     * @return ApiResponse<kotlin.Any?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun tokenMutatePutWithHttpInfo(sdTokenMutateRequest: SDTokenMutateRequest) : ApiResponse<kotlin.Any?> {
        val localVariableConfig = tokenMutatePutRequestConfig(sdTokenMutateRequest = sdTokenMutateRequest)

        return request<SDTokenMutateRequest, kotlin.Any>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation tokenMutatePut
     *
     * @param sdTokenMutateRequest 
     * @return RequestConfig
     */
    fun tokenMutatePutRequestConfig(sdTokenMutateRequest: SDTokenMutateRequest) : RequestConfig<SDTokenMutateRequest> {
        val localVariableBody = sdTokenMutateRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/token/mutate",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Remove Token Property
     * Removes a Tokens Property from Your Game
     * @param tokenId Token Id returned from token/create (ex. 5)
     * @param props Stringify Array of token mutable property names ex: &#39;[\&quot;exp\&quot;, \&quot;health\&quot;]&#39; }
     * @return kotlin.Any
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun tokenPropsRemoveDelete(tokenId: kotlin.String, props: kotlin.String) : kotlin.Any {
        val localVarResponse = tokenPropsRemoveDeleteWithHttpInfo(tokenId = tokenId, props = props)

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
     * Remove Token Property
     * Removes a Tokens Property from Your Game
     * @param tokenId Token Id returned from token/create (ex. 5)
     * @param props Stringify Array of token mutable property names ex: &#39;[\&quot;exp\&quot;, \&quot;health\&quot;]&#39; }
     * @return ApiResponse<kotlin.Any?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun tokenPropsRemoveDeleteWithHttpInfo(tokenId: kotlin.String, props: kotlin.String) : ApiResponse<kotlin.Any?> {
        val localVariableConfig = tokenPropsRemoveDeleteRequestConfig(tokenId = tokenId, props = props)

        return request<Unit, kotlin.Any>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation tokenPropsRemoveDelete
     *
     * @param tokenId Token Id returned from token/create (ex. 5)
     * @param props Stringify Array of token mutable property names ex: &#39;[\&quot;exp\&quot;, \&quot;health\&quot;]&#39; }
     * @return RequestConfig
     */
    fun tokenPropsRemoveDeleteRequestConfig(tokenId: kotlin.String, props: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                put("tokenId", listOf(tokenId.toString()))
                put("props", listOf(props.toString()))
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/token/props-remove",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Transfer Tokens
     * Use this Endpoint to Facilitate Moving Tokens from one Player to Another
     * @param sdTokenTransferRequest 
     * @return kotlin.Any
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun tokenTransferPost(sdTokenTransferRequest: SDTokenTransferRequest) : kotlin.Any {
        val localVarResponse = tokenTransferPostWithHttpInfo(sdTokenTransferRequest = sdTokenTransferRequest)

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
     * Transfer Tokens
     * Use this Endpoint to Facilitate Moving Tokens from one Player to Another
     * @param sdTokenTransferRequest 
     * @return ApiResponse<kotlin.Any?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun tokenTransferPostWithHttpInfo(sdTokenTransferRequest: SDTokenTransferRequest) : ApiResponse<kotlin.Any?> {
        val localVariableConfig = tokenTransferPostRequestConfig(sdTokenTransferRequest = sdTokenTransferRequest)

        return request<SDTokenTransferRequest, kotlin.Any>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation tokenTransferPost
     *
     * @param sdTokenTransferRequest 
     * @return RequestConfig
     */
    fun tokenTransferPostRequestConfig(sdTokenTransferRequest: SDTokenTransferRequest) : RequestConfig<SDTokenTransferRequest> {
        val localVariableBody = sdTokenTransferRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/token/transfer",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Withdraw Token
     * Withdraw tokens from a Stardust Wallet
     * @param sdTokenWithdrawRequest 
     * @return kotlin.Any
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun tokenWithdrawPost(sdTokenWithdrawRequest: SDTokenWithdrawRequest) : kotlin.Any {
        val localVarResponse = tokenWithdrawPostWithHttpInfo(sdTokenWithdrawRequest = sdTokenWithdrawRequest)

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
     * Withdraw Token
     * Withdraw tokens from a Stardust Wallet
     * @param sdTokenWithdrawRequest 
     * @return ApiResponse<kotlin.Any?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun tokenWithdrawPostWithHttpInfo(sdTokenWithdrawRequest: SDTokenWithdrawRequest) : ApiResponse<kotlin.Any?> {
        val localVariableConfig = tokenWithdrawPostRequestConfig(sdTokenWithdrawRequest = sdTokenWithdrawRequest)

        return request<SDTokenWithdrawRequest, kotlin.Any>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation tokenWithdrawPost
     *
     * @param sdTokenWithdrawRequest 
     * @return RequestConfig
     */
    fun tokenWithdrawPostRequestConfig(sdTokenWithdrawRequest: SDTokenWithdrawRequest) : RequestConfig<SDTokenWithdrawRequest> {
        val localVariableBody = sdTokenWithdrawRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/token/withdraw",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
