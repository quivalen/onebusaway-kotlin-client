// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.services.blocking

import com.onebusawaykt.api.core.ClientOptions
import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.core.http.HttpMethod
import com.onebusawaykt.api.core.http.HttpRequest
import com.onebusawaykt.api.core.http.HttpResponse.Handler
import com.onebusawaykt.api.errors.OnebusawayktError
import com.onebusawaykt.api.models.ConfigRetrieveParams
import com.onebusawaykt.api.models.ConfigRetrieveResponse
import com.onebusawaykt.api.services.errorHandler
import com.onebusawaykt.api.services.jsonHandler
import com.onebusawaykt.api.services.withErrorHandler

class ConfigServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : ConfigService {

    private val errorHandler: Handler<OnebusawayktError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<ConfigRetrieveResponse> =
        jsonHandler<ConfigRetrieveResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** config */
    override fun retrieve(
        params: ConfigRetrieveParams,
        requestOptions: RequestOptions
    ): ConfigRetrieveResponse {
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
