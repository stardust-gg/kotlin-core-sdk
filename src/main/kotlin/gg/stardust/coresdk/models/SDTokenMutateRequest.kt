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


import com.squareup.moshi.Json
import java.io.Serializable

/**
 * 
 *
 * @param tokenId Specifies which tokenId you want to manipulate (ex. 11)
 * @param props Specifies which properties you want to change (ex. {prop1: 5, prop2: 6, prop3: 7})
 * @param publicMetadata Returned to marketplaces as token metadata
 */


data class SDTokenMutateRequest (

    /* Specifies which tokenId you want to manipulate (ex. 11) */
    @Json(name = "tokenId")
    val tokenId: kotlin.Int,

    /* Specifies which properties you want to change (ex. {prop1: 5, prop2: 6, prop3: 7}) */
    @Json(name = "props")
    val props: kotlin.Any,

    /* Returned to marketplaces as token metadata */
    @Json(name = "publicMetadata")
    val publicMetadata: kotlin.Any? = null

) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

