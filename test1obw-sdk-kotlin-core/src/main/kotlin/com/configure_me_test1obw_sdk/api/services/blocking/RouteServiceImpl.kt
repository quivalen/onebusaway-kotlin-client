// File generated from our OpenAPI spec by Stainless.

package com.configure_me_test1obw_sdk.api.services.blocking

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
import com.configure_me_test1obw_sdk.api.services.blocking.routes.ScheduleService
import com.configure_me_test1obw_sdk.api.services.blocking.routes.ScheduleServiceImpl
import com.configure_me_test1obw_sdk.api.services.errorHandler
import com.configure_me_test1obw_sdk.api.services.jsonHandler
import com.configure_me_test1obw_sdk.api.services.withErrorHandler

class RouteServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : RouteService {

    private val errorHandler: Handler<Test1obwSdkError> = errorHandler(clientOptions.jsonMapper)

    private val schedule: ScheduleService by lazy { ScheduleServiceImpl(clientOptions) }

    override fun schedule(): ScheduleService = schedule

    private val retrieveHandler: Handler<RouteRetrieveResponse> =
        jsonHandler<RouteRetrieveResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve information for a specific route identified by its unique ID. */
    override fun retrieve(
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

    private val searchHandler: Handler<RouteSearchResponse> =
        jsonHandler<RouteSearchResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Search for a route based on its name. */
    override fun search(
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
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
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
