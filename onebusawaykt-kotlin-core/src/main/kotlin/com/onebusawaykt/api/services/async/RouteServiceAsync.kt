// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.onebusawaykt.api.services.async

import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.models.RouteRetrieveParams
import com.onebusawaykt.api.models.RouteRetrieveResponse
import com.onebusawaykt.api.services.async.routes.LocationServiceAsync
import com.onebusawaykt.api.services.async.routes.ScheduleServiceAsync
import com.onebusawaykt.api.services.async.routes.SearchServiceAsync
import com.onebusawaykt.api.services.async.routes.StopServiceAsync
import com.onebusawaykt.api.services.async.routes.TripServiceAsync

interface RouteServiceAsync {

    fun schedule(): ScheduleServiceAsync

    fun location(): LocationServiceAsync

    fun trips(): TripServiceAsync

    fun stops(): StopServiceAsync

    fun search(): SearchServiceAsync

    /** Retrieve information for a specific route identified by its unique ID. */
    suspend fun retrieve(
        params: RouteRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RouteRetrieveResponse
}
