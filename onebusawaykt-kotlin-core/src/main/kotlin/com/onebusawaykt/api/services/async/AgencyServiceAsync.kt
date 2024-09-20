// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.onebusawaykt.api.services.async

import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.models.AgencyRetrieveParams
import com.onebusawaykt.api.models.AgencyRetrieveResponse
import com.onebusawaykt.api.services.async.agencies.CoverageServiceAsync
import com.onebusawaykt.api.services.async.agencies.RouteServiceAsync
import com.onebusawaykt.api.services.async.agencies.RoutesIdServiceAsync
import com.onebusawaykt.api.services.async.agencies.StopIdServiceAsync
import com.onebusawaykt.api.services.async.agencies.VehicleServiceAsync

interface AgencyServiceAsync {

    fun coverage(): CoverageServiceAsync

    fun routesIds(): RoutesIdServiceAsync

    fun routes(): RouteServiceAsync

    fun vehicles(): VehicleServiceAsync

    fun stopIds(): StopIdServiceAsync

    /** Retrieve information for a specific transit agency identified by its unique ID. */
    suspend fun retrieve(
        params: AgencyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AgencyRetrieveResponse
}
