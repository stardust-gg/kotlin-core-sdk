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
 * @param count Game ID Number (unsigned 32 bit integer)
 */


data class SDTemplateCountResponse (

    /* Game ID Number (unsigned 32 bit integer) */
    @Json(name = "count")
    val count: kotlin.Int

) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

