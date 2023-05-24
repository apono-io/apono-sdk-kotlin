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

import io.apono.sdk.model.PaginationInfo
import io.apono.sdk.model.PermissionV3

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param `data` 
 * @param pagination 
 */


data class PaginatedResponsePermissionV3Response (

    @field:JsonProperty("data")
    val `data`: kotlin.collections.List<PermissionV3>,

    @field:JsonProperty("pagination")
    val pagination: PaginationInfo

)

