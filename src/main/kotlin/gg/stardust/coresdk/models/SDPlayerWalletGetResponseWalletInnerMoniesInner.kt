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
 * The Money object representation of the balance
 *
 * @param amount The balance in minor units. ex: 2000000 for 2 coins USDC
 * @param currency The currency code associated with the amount. ex: 'USDC'
 */


data class SDPlayerWalletGetResponseWalletInnerMoniesInner (

    /* The balance in minor units. ex: 2000000 for 2 coins USDC */
    @Json(name = "amount")
    val amount: kotlin.String? = null,

    /* The currency code associated with the amount. ex: 'USDC' */
    @Json(name = "currency")
    val currency: kotlin.String? = null

) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

