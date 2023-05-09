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

import gg.stardust.coresdk.models.SDGameGetResponseFeesInner
import gg.stardust.coresdk.models.SDTemplateGetAllResponseProps

import com.squareup.moshi.Json
import java.io.Serializable

/**
 * 
 *
 * @param gameId Game ID Number (unsigned 32 bit integer)
 * @param id 
 * @param cap u96 Number as String, min: 0, max: 39614081257132168796771975167
 * @param totalSupply u96 Number as String, min: 0, max: 39614081257132168796771975167
 * @param name The name of the template
 * @param type 
 * @param props 
 * @param contractType The type of custom contract bieng used for this template.
 * @param publicContractMetadata Returned to marketplaces as contract metadata
 * @param publicTokenMetadata Inherited by tokens, and returned to marketplaces as token metadata
 * @param fees 
 */


data class SDTemplateGetResponse (

    /* Game ID Number (unsigned 32 bit integer) */
    @Json(name = "gameId")
    val gameId: kotlin.Int,

    @Json(name = "_id")
    val id: kotlin.Int,

    /* u96 Number as String, min: 0, max: 39614081257132168796771975167 */
    @Json(name = "cap")
    val cap: kotlin.String,

    /* u96 Number as String, min: 0, max: 39614081257132168796771975167 */
    @Json(name = "totalSupply")
    val totalSupply: kotlin.String,

    /* The name of the template */
    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "type")
    val type: SDTemplateGetResponse.Type,

    @Json(name = "props")
    val props: SDTemplateGetAllResponseProps,

    /* The type of custom contract bieng used for this template. */
    @Json(name = "contractType")
    val contractType: SDTemplateGetResponse.ContractType? = null,

    /* Returned to marketplaces as contract metadata */
    @Json(name = "publicContractMetadata")
    val publicContractMetadata: kotlin.Any? = null,

    /* Inherited by tokens, and returned to marketplaces as token metadata */
    @Json(name = "publicTokenMetadata")
    val publicTokenMetadata: kotlin.Any? = null,

    @Json(name = "fees")
    val fees: kotlin.collections.List<SDGameGetResponseFeesInner>? = null

) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

    /**
     * 
     *
     * Values: fT,nFT
     */
    enum class Type(val value: kotlin.String) {
        @Json(name = "FT") fT("FT"),
        @Json(name = "NFT") nFT("NFT");
    }
    /**
     * The type of custom contract bieng used for this template.
     *
     * Values: eRC721,internalMinusMint,externalMinusNoMinusMint
     */
    enum class ContractType(val value: kotlin.String) {
        @Json(name = "ERC721") eRC721("ERC721"),
        @Json(name = "internal-mint") internalMinusMint("internal-mint"),
        @Json(name = "external-no-mint") externalMinusNoMinusMint("external-no-mint");
    }
}

