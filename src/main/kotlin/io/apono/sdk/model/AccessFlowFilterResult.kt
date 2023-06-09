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

import io.apono.sdk.model.FilterResult

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param accessFlowId 
 * @param results 
 */


data class AccessFlowFilterResult (

    @field:JsonProperty("access_flow_id")
    val accessFlowId: kotlin.String,

    @field:JsonProperty("results")
    val results: kotlin.collections.List<FilterResult>

)

