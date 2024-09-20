// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.services.async

import com.onebusawaykt.api.core.ClientOptions
import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.core.http.HttpMethod
import com.onebusawaykt.api.core.http.HttpRequest
import com.onebusawaykt.api.core.http.HttpResponse.Handler
import com.onebusawaykt.api.errors.OnebusawayktError
import com.onebusawaykt.api.models.StopRetrieveParams
import com.onebusawaykt.api.models.StopRetrieveResponse
import com.onebusawaykt.api.services.async.stops.ArrivalAndDepartureServiceAsync
import com.onebusawaykt.api.services.async.stops.ArrivalAndDepartureServiceAsyncImpl
import com.onebusawaykt.api.services.async.stops.ArrivalsAndDepartureServiceAsync
import com.onebusawaykt.api.services.async.stops.ArrivalsAndDepartureServiceAsyncImpl
import com.onebusawaykt.api.services.async.stops.LocationServiceAsync
import com.onebusawaykt.api.services.async.stops.LocationServiceAsyncImpl
import com.onebusawaykt.api.services.async.stops.ReportProblemServiceAsync
import com.onebusawaykt.api.services.async.stops.ReportProblemServiceAsyncImpl
import com.onebusawaykt.api.services.async.stops.ScheduleForStopServiceAsync
import com.onebusawaykt.api.services.async.stops.ScheduleForStopServiceAsyncImpl
import com.onebusawaykt.api.services.async.stops.SearchServiceAsync
import com.onebusawaykt.api.services.async.stops.SearchServiceAsyncImpl
import com.onebusawaykt.api.services.errorHandler
import com.onebusawaykt.api.services.jsonHandler
import com.onebusawaykt.api.services.withErrorHandler

class StopServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : StopServiceAsync {

    private val errorHandler: Handler<OnebusawayktError> = errorHandler(clientOptions.jsonMapper)

    private val location: LocationServiceAsync by lazy { LocationServiceAsyncImpl(clientOptions) }

    private val arrivalAndDeparture: ArrivalAndDepartureServiceAsync by lazy {
        ArrivalAndDepartureServiceAsyncImpl(clientOptions)
    }

    private val arrivalsAndDepartures: ArrivalsAndDepartureServiceAsync by lazy {
        ArrivalsAndDepartureServiceAsyncImpl(clientOptions)
    }

    private val scheduleForStop: ScheduleForStopServiceAsync by lazy {
        ScheduleForStopServiceAsyncImpl(clientOptions)
    }

    private val reportProblem: ReportProblemServiceAsync by lazy {
        ReportProblemServiceAsyncImpl(clientOptions)
    }

    private val search: SearchServiceAsync by lazy { SearchServiceAsyncImpl(clientOptions) }

    override fun location(): LocationServiceAsync = location

    override fun arrivalAndDeparture(): ArrivalAndDepartureServiceAsync = arrivalAndDeparture

    override fun arrivalsAndDepartures(): ArrivalsAndDepartureServiceAsync = arrivalsAndDepartures

    override fun scheduleForStop(): ScheduleForStopServiceAsync = scheduleForStop

    override fun reportProblem(): ReportProblemServiceAsync = reportProblem

    override fun search(): SearchServiceAsync = search

    private val retrieveHandler: Handler<StopRetrieveResponse> =
        jsonHandler<StopRetrieveResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get details of a specific stop */
    override suspend fun retrieve(
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
