// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.onebusawaykt.api.services.async.stops

import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.models.StopArrivalsAndDepartureListParams
import com.onebusawaykt.api.models.StopArrivalsAndDepartureListResponse

interface ArrivalsAndDepartureServiceAsync {

    /** arrivals-and-departures-for-stop */
    suspend fun list(
        params: StopArrivalsAndDepartureListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): StopArrivalsAndDepartureListResponse
}
