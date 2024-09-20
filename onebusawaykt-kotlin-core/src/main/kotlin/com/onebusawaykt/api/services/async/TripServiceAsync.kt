// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.onebusawaykt.api.services.async

import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.models.TripRetrieveParams
import com.onebusawaykt.api.models.TripRetrieveResponse
import com.onebusawaykt.api.services.async.trips.DetailServiceAsync
import com.onebusawaykt.api.services.async.trips.ReportProblemServiceAsync

interface TripServiceAsync {

    fun details(): DetailServiceAsync

    fun reportProblem(): ReportProblemServiceAsync

    /** Get details of a specific trip */
    suspend fun retrieve(
        params: TripRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TripRetrieveResponse
}
