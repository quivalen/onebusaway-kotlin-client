// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.services.async.routes

import com.onebusawaykt.api.core.ClientOptions
import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.core.http.HttpMethod
import com.onebusawaykt.api.core.http.HttpRequest
import com.onebusawaykt.api.core.http.HttpResponse.Handler
import com.onebusawaykt.api.errors.OnebusawayktError
import com.onebusawaykt.api.models.RouteStopListParams
import com.onebusawaykt.api.models.RouteStopListResponse
import com.onebusawaykt.api.services.errorHandler
import com.onebusawaykt.api.services.jsonHandler
import com.onebusawaykt.api.services.withErrorHandler

class StopServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : StopServiceAsync {

    private val errorHandler: Handler<OnebusawayktError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<RouteStopListResponse> =
        jsonHandler<RouteStopListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get stops for a specific route */
    override suspend fun list(
        params: RouteStopListParams,
        requestOptions: RequestOptions
    ): RouteStopListResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "where", "stops-for-route", "{routeID}.json")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
