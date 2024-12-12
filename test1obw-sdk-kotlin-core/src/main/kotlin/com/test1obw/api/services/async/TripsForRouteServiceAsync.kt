// File generated from our OpenAPI spec by Stainless.

package com.test1obw.api.services.async

import com.test1obw.api.core.RequestOptions
import com.test1obw.api.models.TripsForRouteListParams
import com.test1obw.api.models.TripsForRouteListResponse

interface TripsForRouteServiceAsync {

    /** Search for active trips for a specific route. */
    suspend fun list(
        params: TripsForRouteListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TripsForRouteListResponse
}
