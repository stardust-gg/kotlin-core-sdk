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

package gg.stardust.coresdk.models

import gg.stardust.coresdk.models.SDOrderGetAllResponseTokensRequestedInner

import com.squareup.moshi.Json
import java.io.Serializable

/**
 * 
 *
 * @param offeredBy The playerId who initiated the order
 * @param acceptedBy The playerId who is being offered a order
 * @param tokensRequested 
 * @param tokensOffered 
 * @param status The status of the order
 */


data class SDOrderGetAllResponse (

    /* The playerId who initiated the order */
    @Json(name = "offeredBy")
    val offeredBy: kotlin.String,

    /* The playerId who is being offered a order */
    @Json(name = "acceptedBy")
    val acceptedBy: kotlin.String,

    @Json(name = "tokensRequested")
    val tokensRequested: kotlin.collections.List<SDOrderGetAllResponseTokensRequestedInner>,

    @Json(name = "tokensOffered")
    val tokensOffered: kotlin.collections.List<SDOrderGetAllResponseTokensRequestedInner>,

    /* The status of the order */
    @Json(name = "status")
    val status: kotlin.String

) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}
