// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.onebusawaykt.api.services.blocking

import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.models.AgencyRetrieveParams
import com.onebusawaykt.api.models.AgencyRetrieveResponse
import com.onebusawaykt.api.services.blocking.agencies.CoverageService
import com.onebusawaykt.api.services.blocking.agencies.RouteService
import com.onebusawaykt.api.services.blocking.agencies.RoutesIdService
import com.onebusawaykt.api.services.blocking.agencies.StopIdService
import com.onebusawaykt.api.services.blocking.agencies.VehicleService

interface AgencyService {

    fun coverage(): CoverageService

    fun routesIds(): RoutesIdService

    fun routes(): RouteService

    fun vehicles(): VehicleService

    fun stopIds(): StopIdService

    /** Retrieve information for a specific transit agency identified by its unique ID. */
    fun retrieve(
        params: AgencyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AgencyRetrieveResponse
}
