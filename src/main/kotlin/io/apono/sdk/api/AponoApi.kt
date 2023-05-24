package io.apono.sdk.api

import io.apono.sdk.infrastructure.ApiClient
import okhttp3.OkHttpClient

class AponoApi(basePath: String = ConnectorsApi.defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://api.apono.io")
        }
    }

    val accessFlowsApi = AccessFlowsApi(basePath, client)
    val accessRequestsApi = AccessRequestsApi(basePath, client)
    val connectorsApi = ConnectorsApi(basePath, client)
    val identitiesApi = IdentitiesApi(basePath, client)
    val integrationsApi = IntegrationsApi(basePath, client)
    val usersApi = UsersApi(basePath, client)
}