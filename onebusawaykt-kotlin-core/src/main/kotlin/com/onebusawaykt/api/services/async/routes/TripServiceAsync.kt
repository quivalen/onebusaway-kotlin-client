// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.onebusawaykt.api.services.async.routes

import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.models.RouteTripListParams
import com.onebusawaykt.api.models.RouteTripListResponse

interface TripServiceAsync {

    /** Search for active trips for a specific route. */
    suspend fun list(
        params: RouteTripListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RouteTripListResponse
}
