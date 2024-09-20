// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.services.blocking

import com.onebusawaykt.api.core.ClientOptions
import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.core.http.HttpMethod
import com.onebusawaykt.api.core.http.HttpRequest
import com.onebusawaykt.api.core.http.HttpResponse.Handler
import com.onebusawaykt.api.errors.OnebusawayktError
import com.onebusawaykt.api.models.StopRetrieveParams
import com.onebusawaykt.api.models.StopRetrieveResponse
import com.onebusawaykt.api.services.blocking.stops.ArrivalAndDepartureService
import com.onebusawaykt.api.services.blocking.stops.ArrivalAndDepartureServiceImpl
import com.onebusawaykt.api.services.blocking.stops.ArrivalsAndDepartureService
import com.onebusawaykt.api.services.blocking.stops.ArrivalsAndDepartureServiceImpl
import com.onebusawaykt.api.services.blocking.stops.LocationService
import com.onebusawaykt.api.services.blocking.stops.LocationServiceImpl
import com.onebusawaykt.api.services.blocking.stops.ReportProblemService
import com.onebusawaykt.api.services.blocking.stops.ReportProblemServiceImpl
import com.onebusawaykt.api.services.blocking.stops.ScheduleForStopService
import com.onebusawaykt.api.services.blocking.stops.ScheduleForStopServiceImpl
import com.onebusawaykt.api.services.blocking.stops.SearchService
import com.onebusawaykt.api.services.blocking.stops.SearchServiceImpl
import com.onebusawaykt.api.services.errorHandler
import com.onebusawaykt.api.services.jsonHandler
import com.onebusawaykt.api.services.withErrorHandler

class StopServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : StopService {

    private val errorHandler: Handler<OnebusawayktError> = errorHandler(clientOptions.jsonMapper)

    private val location: LocationService by lazy { LocationServiceImpl(clientOptions) }

    private val arrivalAndDeparture: ArrivalAndDepartureService by lazy {
        ArrivalAndDepartureServiceImpl(clientOptions)
    }

    private val arrivalsAndDepartures: ArrivalsAndDepartureService by lazy {
        ArrivalsAndDepartureServiceImpl(clientOptions)
    }

    private val scheduleForStop: ScheduleForStopService by lazy {
        ScheduleForStopServiceImpl(clientOptions)
    }

    private val reportProblem: ReportProblemService by lazy {
        ReportProblemServiceImpl(clientOptions)
    }

    private val search: SearchService by lazy { SearchServiceImpl(clientOptions) }

    override fun location(): LocationService = location

    override fun arrivalAndDeparture(): ArrivalAndDepartureService = arrivalAndDeparture

    override fun arrivalsAndDepartures(): ArrivalsAndDepartureService = arrivalsAndDepartures

    override fun scheduleForStop(): ScheduleForStopService = scheduleForStop

    override fun reportProblem(): ReportProblemService = reportProblem

    override fun search(): SearchService = search

    private val retrieveHandler: Handler<StopRetrieveResponse> =
        jsonHandler<StopRetrieveResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get details of a specific stop */
    override fun retrieve(
        params: StopRetrieveParams,
        requestOptions: RequestOptions
    ): StopRetrieveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "where", "stop", "{stopID}.json")
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
