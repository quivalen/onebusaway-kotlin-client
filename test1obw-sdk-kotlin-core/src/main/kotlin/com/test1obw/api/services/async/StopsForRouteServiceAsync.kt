// File generated from our OpenAPI spec by Stainless.

package com.test1obw.api.services.async

import com.test1obw.api.core.RequestOptions
import com.test1obw.api.models.StopsForRouteListParams
import com.test1obw.api.models.StopsForRouteListResponse

interface StopsForRouteServiceAsync {

    /** Get stops for a specific route */
    suspend fun list(
        params: StopsForRouteListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): StopsForRouteListResponse
}
