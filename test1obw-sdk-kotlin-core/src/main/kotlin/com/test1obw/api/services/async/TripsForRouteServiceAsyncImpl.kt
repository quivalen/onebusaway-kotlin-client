// File generated from our OpenAPI spec by Stainless.

package com.test1obw.api.services.async

import com.test1obw.api.core.ClientOptions
import com.test1obw.api.core.RequestOptions
import com.test1obw.api.core.http.HttpMethod
import com.test1obw.api.core.http.HttpRequest
import com.test1obw.api.core.http.HttpResponse.Handler
import com.test1obw.api.errors.Test1obwSdkError
import com.test1obw.api.models.TripsForRouteListParams
import com.test1obw.api.models.TripsForRouteListResponse
import com.test1obw.api.services.errorHandler
import com.test1obw.api.services.jsonHandler
import com.test1obw.api.services.withErrorHandler

class TripsForRouteServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : TripsForRouteServiceAsync {

    private val errorHandler: Handler<Test1obwSdkError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<TripsForRouteListResponse> =
        jsonHandler<TripsForRouteListResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Search for active trips for a specific route. */
    override suspend fun list(
        params: TripsForRouteListParams,
        requestOptions: RequestOptions
    ): TripsForRouteListResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "where", "trips-for-route", "{routeID}.json")
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
