// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.onebusawaykt.api.services.blocking

import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.models.TripRetrieveParams
import com.onebusawaykt.api.models.TripRetrieveResponse
import com.onebusawaykt.api.services.blocking.trips.DetailService
import com.onebusawaykt.api.services.blocking.trips.ReportProblemService

interface TripService {

    fun details(): DetailService

    fun reportProblem(): ReportProblemService

    /** Get details of a specific trip */
    fun retrieve(
        params: TripRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TripRetrieveResponse
}
