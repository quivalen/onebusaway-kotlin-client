// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.services.async.routes

import com.onebusawaykt.api.core.ClientOptions
import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.core.http.HttpMethod
import com.onebusawaykt.api.core.http.HttpRequest
import com.onebusawaykt.api.core.http.HttpResponse.Handler
import com.onebusawaykt.api.errors.OnebusawayktError
import com.onebusawaykt.api.models.RouteSearchRetrieveParams
import com.onebusawaykt.api.models.RouteSearchRetrieveResponse
import com.onebusawaykt.api.services.errorHandler
import com.onebusawaykt.api.services.jsonHandler
import com.onebusawaykt.api.services.withErrorHandler

class SearchServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : SearchServiceAsync {

    private val errorHandler: Handler<OnebusawayktError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<RouteSearchRetrieveResponse> =
        jsonHandler<RouteSearchRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Search for a route based on its name. */
    override suspend fun retrieve(
        params: RouteSearchRetrieveParams,
        requestOptions: RequestOptions
    ): RouteSearchRetrieveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "where", "search", "route.json")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
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
