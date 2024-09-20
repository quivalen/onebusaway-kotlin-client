// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.onebusawaykt.api.services.async.routes

import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.models.RouteStopListParams
import com.onebusawaykt.api.models.RouteStopListResponse

interface StopServiceAsync {

    /** Get stops for a specific route */
    suspend fun list(
        params: RouteStopListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RouteStopListResponse
}
