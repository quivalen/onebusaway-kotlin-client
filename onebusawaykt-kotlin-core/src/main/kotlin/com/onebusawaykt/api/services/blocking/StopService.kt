// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.onebusawaykt.api.services.blocking

import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.models.StopRetrieveParams
import com.onebusawaykt.api.models.StopRetrieveResponse
import com.onebusawaykt.api.services.blocking.stops.ArrivalAndDepartureService
import com.onebusawaykt.api.services.blocking.stops.ArrivalsAndDepartureService
import com.onebusawaykt.api.services.blocking.stops.LocationService
import com.onebusawaykt.api.services.blocking.stops.ReportProblemService
import com.onebusawaykt.api.services.blocking.stops.ScheduleForStopService
import com.onebusawaykt.api.services.blocking.stops.SearchService

interface StopService {

    fun location(): LocationService

    fun arrivalAndDeparture(): ArrivalAndDepartureService

    fun arrivalsAndDepartures(): ArrivalsAndDepartureService

    fun scheduleForStop(): ScheduleForStopService

    fun reportProblem(): ReportProblemService

    fun search(): SearchService

    /** Get details of a specific stop */
    fun retrieve(
        params: StopRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): StopRetrieveResponse
}
