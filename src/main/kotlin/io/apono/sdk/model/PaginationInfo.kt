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
 * @param total 
 * @param limit 
 * @param offset 
 */


data class PaginationInfo (

    @field:JsonProperty("total")
    val total: kotlin.Int,

    @field:JsonProperty("limit")
    val limit: kotlin.Int,

    @field:JsonProperty("offset")
    val offset: kotlin.Int

)

