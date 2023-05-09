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

import gg.stardust.coresdk.models.SDPlayerWithdrawObject

import com.squareup.moshi.Json
import java.io.Serializable

/**
 * 
 *
 * @param address Blockchain Address
 * @param playerId The Player's id, can be found with Player/getId(s). Also returned from player/create (ex. CzySggxVQz51jciGRFDY7d5BER2fav6TNEnPGjusPJPd)
 * @param tokenObjects array of Token objects
 */


data class SDPlayerWithdrawRequest (

    /* Blockchain Address */
    @Json(name = "address")
    val address: kotlin.String,

    /* The Player's id, can be found with Player/getId(s). Also returned from player/create (ex. CzySggxVQz51jciGRFDY7d5BER2fav6TNEnPGjusPJPd) */
    @Json(name = "playerId")
    val playerId: kotlin.String,

    /* array of Token objects */
    @Json(name = "tokenObjects")
    val tokenObjects: kotlin.collections.List<SDPlayerWithdrawObject>

) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

