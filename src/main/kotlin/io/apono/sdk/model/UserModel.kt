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

package io.apono.sdk.model


import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param id 
 * @param email 
 * @param firstName 
 * @param lastName 
 */


data class UserModel (

    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("email")
    val email: kotlin.String,

    @field:JsonProperty("first_name")
    val firstName: kotlin.String,

    @field:JsonProperty("last_name")
    val lastName: kotlin.String

)

