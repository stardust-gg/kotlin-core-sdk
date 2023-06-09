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

import gg.stardust.coresdk.models.SDTemplateGetTokensResponseTokenProps

import com.squareup.moshi.Json
import java.io.Serializable

/**
 * 
 *
 * @param id Token ID Number (unsigned 32 bit integer)
 * @param amount u64 Number as String, min: 0, max: 9223372036854775807 (ex. \"6\")
 * @param templateId Template ID Number (unsigned 32 bit integer)
 * @param name Template Name
 * @param props 
 * @param publicMetadata Returned to marketplaces as token metadata
 */


data class SDTemplateGetTokensResponseToken (

    /* Token ID Number (unsigned 32 bit integer) */
    @Json(name = "id")
    val id: kotlin.Int,

    /* u64 Number as String, min: 0, max: 9223372036854775807 (ex. \"6\") */
    @Json(name = "amount")
    val amount: kotlin.String,

    /* Template ID Number (unsigned 32 bit integer) */
    @Json(name = "templateId")
    val templateId: kotlin.Int? = null,

    /* Template Name */
    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "props")
    val props: SDTemplateGetTokensResponseTokenProps? = null,

    /* Returned to marketplaces as token metadata */
    @Json(name = "publicMetadata")
    val publicMetadata: kotlin.Any? = null

) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

