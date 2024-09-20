// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.onebusawaykt.api.services.blocking.routes

import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.models.RouteScheduleRetrieveParams
import com.onebusawaykt.api.models.RouteScheduleRetrieveResponse

interface ScheduleService {

    /** Retrieve the full schedule for a route on a particular day */
    fun retrieve(
        params: RouteScheduleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RouteScheduleRetrieveResponse
}
