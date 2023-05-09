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
 * @param uniqueId Identifier for the player
 * @param userData Metadata about the player
 * @param image URL of the player's image
 */


data class SDPlayerCreateRequest (

    /* Identifier for the player */
    @Json(name = "uniqueId")
    val uniqueId: kotlin.String,

    /* Metadata about the player */
    @Json(name = "userData")
    val userData: kotlin.Any,

    /* URL of the player's image */
    @Json(name = "image")
    val image: kotlin.String? = null

) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

