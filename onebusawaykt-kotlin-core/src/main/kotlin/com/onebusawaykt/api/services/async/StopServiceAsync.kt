// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.onebusawaykt.api.services.async

import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.models.StopRetrieveParams
import com.onebusawaykt.api.models.StopRetrieveResponse
import com.onebusawaykt.api.services.async.stops.ArrivalAndDepartureServiceAsync
import com.onebusawaykt.api.services.async.stops.ArrivalsAndDepartureServiceAsync
import com.onebusawaykt.api.services.async.stops.LocationServiceAsync
import com.onebusawaykt.api.services.async.stops.ReportProblemServiceAsync
import com.onebusawaykt.api.services.async.stops.ScheduleForStopServiceAsync
import com.onebusawaykt.api.services.async.stops.SearchServiceAsync

interface StopServiceAsync {

    fun location(): LocationServiceAsync

    fun arrivalAndDeparture(): ArrivalAndDepartureServiceAsync

    fun arrivalsAndDepartures(): ArrivalsAndDepartureServiceAsync

    fun scheduleForStop(): ScheduleForStopServiceAsync

    fun reportProblem(): ReportProblemServiceAsync

    fun search(): SearchServiceAsync

    /** Get details of a specific stop */
    suspend fun retrieve(
        params: StopRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): StopRetrieveResponse
}
