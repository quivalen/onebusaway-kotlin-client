// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.onebusawaykt.api.services.blocking.stops

import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.models.StopArrivalsAndDepartureListParams
import com.onebusawaykt.api.models.StopArrivalsAndDepartureListResponse

interface ArrivalsAndDepartureService {

    /** arrivals-and-departures-for-stop */
    fun list(
        params: StopArrivalsAndDepartureListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): StopArrivalsAndDepartureListResponse
}
