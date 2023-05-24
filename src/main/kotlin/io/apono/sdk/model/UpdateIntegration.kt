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
 * @param name 
 * @param metadata 
 * @param provisionerId 
 * @param secretConfig 
 */


data class UpdateIntegration (

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("metadata")
    val metadata: kotlin.Any,

    @field:JsonProperty("provisioner_id")
    val provisionerId: kotlin.String? = null,

    @field:JsonProperty("secret_config")
    val secretConfig: kotlin.Any? = null

)
