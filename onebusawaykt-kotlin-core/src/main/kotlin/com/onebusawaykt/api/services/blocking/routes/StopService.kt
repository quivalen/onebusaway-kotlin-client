// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.onebusawaykt.api.services.blocking.routes

import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.models.RouteStopListParams
import com.onebusawaykt.api.models.RouteStopListResponse

interface StopService {

    /** Get stops for a specific route */
    fun list(
        params: RouteStopListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RouteStopListResponse
}
