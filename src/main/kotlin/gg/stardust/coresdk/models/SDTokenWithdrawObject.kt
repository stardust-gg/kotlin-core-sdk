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
 * @param tokenId 
 * @param amount u64 Number as String, min: 1, max: 9223372036854775807
 */


data class SDTokenWithdrawObject (

    @Json(name = "tokenId")
    val tokenId: kotlin.Int,

    /* u64 Number as String, min: 1, max: 9223372036854775807 */
    @Json(name = "amount")
    val amount: kotlin.String

) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

