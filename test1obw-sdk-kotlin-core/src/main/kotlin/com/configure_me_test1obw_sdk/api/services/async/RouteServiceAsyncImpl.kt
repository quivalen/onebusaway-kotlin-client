// File generated from our OpenAPI spec by Stainless.

package com.configure_me_test1obw_sdk.api.services.async

import com.configure_me_test1obw_sdk.api.core.ClientOptions
import com.configure_me_test1obw_sdk.api.core.RequestOptions
import com.configure_me_test1obw_sdk.api.core.http.HttpMethod
import com.configure_me_test1obw_sdk.api.core.http.HttpRequest
import com.configure_me_test1obw_sdk.api.core.http.HttpResponse.Handler
import com.configure_me_test1obw_sdk.api.errors.Test1obwSdkError
import com.configure_me_test1obw_sdk.api.models.RouteRetrieveParams
import com.configure_me_test1obw_sdk.api.models.RouteRetrieveResponse
import com.configure_me_test1obw_sdk.api.models.RouteSearchParams
import com.configure_me_test1obw_sdk.api.models.RouteSearchResponse
import com.configure_me_test1obw_sdk.api.services.async.routes.ScheduleServiceAsync
import com.configure_me_test1obw_sdk.api.services.async.routes.ScheduleServiceAsyncImpl
import com.configure_me_test1obw_sdk.api.services.errorHandler
import com.configure_me_test1obw_sdk.api.services.jsonHandler
import com.configure_me_test1obw_sdk.api.services.withErrorHandler

class RouteServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : RouteServiceAsync {

    private val errorHandler: Handler<Test1obwSdkError> = errorHandler(clientOptions.jsonMapper)

    private val schedule: ScheduleServiceAsync by lazy { ScheduleServiceAsyncImpl(clientOptions) }

    override fun schedule(): ScheduleServiceAsync = schedule

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

    private val searchHandler: Handler<RouteSearchResponse> =
        jsonHandler<RouteSearchResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Search for a route based on its name. */
    override suspend fun search(
        params: RouteSearchParams,
        requestOptions: RequestOptions
    ): RouteSearchResponse {
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
                .use { searchHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
