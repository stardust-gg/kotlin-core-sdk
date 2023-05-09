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

import gg.stardust.coresdk.models.SDOrderCreateTokens

import com.squareup.moshi.Json
import java.io.Serializable

/**
 * 
 *
 * @param offeredBy PlayerId creating the order
 * @param tokensOffered 
 * @param tokensRequested 
 */


data class SDOrderCreateRequest (

    /* PlayerId creating the order */
    @Json(name = "offeredBy")
    val offeredBy: kotlin.String,

    @Json(name = "tokensOffered")
    val tokensOffered: kotlin.collections.List<SDOrderCreateTokens>,

    @Json(name = "tokensRequested")
    val tokensRequested: kotlin.collections.List<SDOrderCreateTokens>

) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

