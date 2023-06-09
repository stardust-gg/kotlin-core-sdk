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
 * @param immutable 
 * @param mutable 
 * @param dollarMutable 
 */


data class SDTemplateGetAllResponseProps (

    @Json(name = "immutable")
    val immutable: kotlin.Any,

    @Json(name = "mutable")
    val mutable: kotlin.Any,

    @Json(name = "\$mutable")
    val dollarMutable: kotlin.Any

) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

