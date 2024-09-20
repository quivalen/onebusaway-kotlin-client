// File generated from our OpenAPI spec by Stainless.

package com.configure_me_test1obw_sdk.api.services.blocking

import com.configure_me_test1obw_sdk.api.core.ClientOptions
import com.configure_me_test1obw_sdk.api.core.RequestOptions
import com.configure_me_test1obw_sdk.api.core.http.HttpMethod
import com.configure_me_test1obw_sdk.api.core.http.HttpRequest
import com.configure_me_test1obw_sdk.api.core.http.HttpResponse.Handler
import com.configure_me_test1obw_sdk.api.errors.Test1obwSdkError
import com.configure_me_test1obw_sdk.api.models.ConfigurationRetrieveParams
import com.configure_me_test1obw_sdk.api.models.ConfigurationRetrieveResponse
import com.configure_me_test1obw_sdk.api.services.errorHandler
import com.configure_me_test1obw_sdk.api.services.jsonHandler
import com.configure_me_test1obw_sdk.api.services.withErrorHandler

class ConfigurationServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : ConfigurationService {

    private val errorHandler: Handler<Test1obwSdkError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<ConfigurationRetrieveResponse> =
        jsonHandler<ConfigurationRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** config */
    override fun retrieve(
        params: ConfigurationRetrieveParams,
        requestOptions: RequestOptions
    ): ConfigurationRetrieveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "where", "config.json")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
