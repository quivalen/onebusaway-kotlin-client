// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.onebusawaykt.api.services.blocking

import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.models.RouteRetrieveParams
import com.onebusawaykt.api.models.RouteRetrieveResponse
import com.onebusawaykt.api.services.blocking.routes.LocationService
import com.onebusawaykt.api.services.blocking.routes.ScheduleService
import com.onebusawaykt.api.services.blocking.routes.SearchService
import com.onebusawaykt.api.services.blocking.routes.StopService
import com.onebusawaykt.api.services.blocking.routes.TripService

interface RouteService {

    fun schedule(): ScheduleService

    fun location(): LocationService

    fun trips(): TripService

    fun stops(): StopService

    fun search(): SearchService

    /** Retrieve information for a specific route identified by its unique ID. */
    fun retrieve(
        params: RouteRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RouteRetrieveResponse
}
