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
 * @param immutable Properties for immutable on the Template
 * @param mutable Properties for mutable on the Template
 */


data class SDTemplateCreateRequestProps (

    /* Properties for immutable on the Template */
    @Json(name = "immutable")
    val immutable: kotlin.Any? = null,

    /* Properties for mutable on the Template */
    @Json(name = "mutable")
    val mutable: kotlin.Any? = null

) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

