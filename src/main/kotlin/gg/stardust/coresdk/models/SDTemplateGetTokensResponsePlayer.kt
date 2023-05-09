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
 * @param id Player ID in the form of a UUID
 * @param uniqueId Player ID in the form of a the game owner's internal playerId, i.e. email address
 * @param image URL of image cached by Stardust
 * @param deletedAt Timestamp of when a player was deleted
 */


data class SDTemplateGetTokensResponsePlayer (

    /* Player ID in the form of a UUID */
    @Json(name = "id")
    val id: kotlin.String,

    /* Player ID in the form of a the game owner's internal playerId, i.e. email address */
    @Json(name = "uniqueId")
    val uniqueId: kotlin.String,

    /* URL of image cached by Stardust */
    @Json(name = "image")
    val image: kotlin.String? = null,

    /* Timestamp of when a player was deleted */
    @Json(name = "deletedAt")
    val deletedAt: kotlin.String? = null

) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}
