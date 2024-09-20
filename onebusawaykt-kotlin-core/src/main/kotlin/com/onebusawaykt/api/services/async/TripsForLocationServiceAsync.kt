// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.onebusawaykt.api.services.async

import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.models.TripsForLocationListParams
import com.onebusawaykt.api.models.TripsForLocationListResponse

interface TripsForLocationServiceAsync {

    /** Retrieve trips for a given location */
    suspend fun list(
        params: TripsForLocationListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TripsForLocationListResponse
}
