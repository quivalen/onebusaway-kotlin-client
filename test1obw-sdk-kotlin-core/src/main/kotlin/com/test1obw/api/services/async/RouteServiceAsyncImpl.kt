// File generated from our OpenAPI spec by Stainless.

package com.test1obw.api.services.async

import com.test1obw.api.core.ClientOptions
import com.test1obw.api.core.RequestOptions
import com.test1obw.api.core.http.HttpMethod
import com.test1obw.api.core.http.HttpRequest
import com.test1obw.api.core.http.HttpResponse.Handler
import com.test1obw.api.errors.Test1obwSdkError
import com.test1obw.api.models.RouteRetrieveParams
import com.test1obw.api.models.RouteRetrieveResponse
import com.test1obw.api.services.errorHandler
import com.test1obw.api.services.jsonHandler
import com.test1obw.api.services.withErrorHandler

class RouteServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : RouteServiceAsync {

    private val errorHandler: Handler<Test1obwSdkError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<RouteRetrieveResponse> =
        jsonHandler<RouteRetrieveResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve information for a specific route identified by its unique ID. */
    override suspend fun retrieve(
        params: RouteRetrieveParams,
        requestOptions: RequestOptions
    ): RouteRetrieveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "where", "route", "{routeID}.json")
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
