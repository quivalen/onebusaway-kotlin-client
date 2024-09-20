// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.services.blocking

import com.onebusawaykt.api.core.ClientOptions
import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.core.http.HttpMethod
import com.onebusawaykt.api.core.http.HttpRequest
import com.onebusawaykt.api.core.http.HttpResponse.Handler
import com.onebusawaykt.api.errors.OnebusawayktError
import com.onebusawaykt.api.models.RouteRetrieveParams
import com.onebusawaykt.api.models.RouteRetrieveResponse
import com.onebusawaykt.api.services.blocking.routes.LocationService
import com.onebusawaykt.api.services.blocking.routes.LocationServiceImpl
import com.onebusawaykt.api.services.blocking.routes.ScheduleService
import com.onebusawaykt.api.services.blocking.routes.ScheduleServiceImpl
import com.onebusawaykt.api.services.blocking.routes.SearchService
import com.onebusawaykt.api.services.blocking.routes.SearchServiceImpl
import com.onebusawaykt.api.services.blocking.routes.StopService
import com.onebusawaykt.api.services.blocking.routes.StopServiceImpl
import com.onebusawaykt.api.services.blocking.routes.TripService
import com.onebusawaykt.api.services.blocking.routes.TripServiceImpl
import com.onebusawaykt.api.services.errorHandler
import com.onebusawaykt.api.services.jsonHandler
import com.onebusawaykt.api.services.withErrorHandler

class RouteServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : RouteService {

    private val errorHandler: Handler<OnebusawayktError> = errorHandler(clientOptions.jsonMapper)

    private val schedule: ScheduleService by lazy { ScheduleServiceImpl(clientOptions) }

    private val location: LocationService by lazy { LocationServiceImpl(clientOptions) }

    private val trips: TripService by lazy { TripServiceImpl(clientOptions) }

    private val stops: StopService by lazy { StopServiceImpl(clientOptions) }

    private val search: SearchService by lazy { SearchServiceImpl(clientOptions) }

    override fun schedule(): ScheduleService = schedule

    override fun location(): LocationService = location

    override fun trips(): TripService = trips

    override fun stops(): StopService = stops

    override fun search(): SearchService = search

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
}
