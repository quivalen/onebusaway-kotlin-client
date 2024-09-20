// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.services.async

import com.onebusawaykt.api.core.ClientOptions
import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.core.http.HttpMethod
import com.onebusawaykt.api.core.http.HttpRequest
import com.onebusawaykt.api.core.http.HttpResponse.Handler
import com.onebusawaykt.api.errors.OnebusawayktError
import com.onebusawaykt.api.models.RouteRetrieveParams
import com.onebusawaykt.api.models.RouteRetrieveResponse
import com.onebusawaykt.api.services.async.routes.LocationServiceAsync
import com.onebusawaykt.api.services.async.routes.LocationServiceAsyncImpl
import com.onebusawaykt.api.services.async.routes.ScheduleServiceAsync
import com.onebusawaykt.api.services.async.routes.ScheduleServiceAsyncImpl
import com.onebusawaykt.api.services.async.routes.SearchServiceAsync
import com.onebusawaykt.api.services.async.routes.SearchServiceAsyncImpl
import com.onebusawaykt.api.services.async.routes.StopServiceAsync
import com.onebusawaykt.api.services.async.routes.StopServiceAsyncImpl
import com.onebusawaykt.api.services.async.routes.TripServiceAsync
import com.onebusawaykt.api.services.async.routes.TripServiceAsyncImpl
import com.onebusawaykt.api.services.errorHandler
import com.onebusawaykt.api.services.jsonHandler
import com.onebusawaykt.api.services.withErrorHandler

class RouteServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : RouteServiceAsync {

    private val errorHandler: Handler<OnebusawayktError> = errorHandler(clientOptions.jsonMapper)

    private val schedule: ScheduleServiceAsync by lazy { ScheduleServiceAsyncImpl(clientOptions) }

    private val location: LocationServiceAsync by lazy { LocationServiceAsyncImpl(clientOptions) }

    private val trips: TripServiceAsync by lazy { TripServiceAsyncImpl(clientOptions) }

    private val stops: StopServiceAsync by lazy { StopServiceAsyncImpl(clientOptions) }

    private val search: SearchServiceAsync by lazy { SearchServiceAsyncImpl(clientOptions) }

    override fun schedule(): ScheduleServiceAsync = schedule

    override fun location(): LocationServiceAsync = location

    override fun trips(): TripServiceAsync = trips

    override fun stops(): StopServiceAsync = stops

    override fun search(): SearchServiceAsync = search

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
