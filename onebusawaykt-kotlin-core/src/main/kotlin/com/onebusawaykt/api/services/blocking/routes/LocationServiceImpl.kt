// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.services.blocking.routes

import com.onebusawaykt.api.core.ClientOptions
import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.core.http.HttpMethod
import com.onebusawaykt.api.core.http.HttpRequest
import com.onebusawaykt.api.core.http.HttpResponse.Handler
import com.onebusawaykt.api.errors.OnebusawayktError
import com.onebusawaykt.api.models.RouteLocationListParams
import com.onebusawaykt.api.models.RouteLocationListResponse
import com.onebusawaykt.api.services.errorHandler
import com.onebusawaykt.api.services.jsonHandler
import com.onebusawaykt.api.services.withErrorHandler

class LocationServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : LocationService {

    private val errorHandler: Handler<OnebusawayktError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<RouteLocationListResponse> =
        jsonHandler<RouteLocationListResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** routes-for-location */
    override fun list(
        params: RouteLocationListParams,
        requestOptions: RequestOptions
    ): RouteLocationListResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "where", "routes-for-location.json")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
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