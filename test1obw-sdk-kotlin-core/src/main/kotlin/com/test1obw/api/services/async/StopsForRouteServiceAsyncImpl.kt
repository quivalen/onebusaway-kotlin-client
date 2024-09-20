// File generated from our OpenAPI spec by Stainless.

package com.test1obw.api.services.async

import com.test1obw.api.core.ClientOptions
import com.test1obw.api.core.RequestOptions
import com.test1obw.api.core.http.HttpMethod
import com.test1obw.api.core.http.HttpRequest
import com.test1obw.api.core.http.HttpResponse.Handler
import com.test1obw.api.errors.Test1obwSdkError
import com.test1obw.api.models.StopsForRouteListParams
import com.test1obw.api.models.StopsForRouteListResponse
import com.test1obw.api.services.errorHandler
import com.test1obw.api.services.jsonHandler
import com.test1obw.api.services.withErrorHandler

class StopsForRouteServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : StopsForRouteServiceAsync {

    private val errorHandler: Handler<Test1obwSdkError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<StopsForRouteListResponse> =
        jsonHandler<StopsForRouteListResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get stops for a specific route */
    override suspend fun list(
        params: StopsForRouteListParams,
        requestOptions: RequestOptions
    ): StopsForRouteListResponse {
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
