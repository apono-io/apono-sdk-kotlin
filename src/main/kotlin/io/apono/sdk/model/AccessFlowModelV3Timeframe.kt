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

import io.apono.sdk.model.DayOfWeek

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param startTimeSec 
 * @param endTimeSec 
 * @param daysInWeek 
 * @param timeZone 
 */


data class AccessFlowModelV3Timeframe (

    @field:JsonProperty("start_time_sec")
    val startTimeSec: kotlin.Long,

    @field:JsonProperty("end_time_sec")
    val endTimeSec: kotlin.Long,

    @field:JsonProperty("days_in_week")
    val daysInWeek: kotlin.collections.List<DayOfWeek>,

    @field:JsonProperty("time_zone")
    val timeZone: kotlin.String

)

