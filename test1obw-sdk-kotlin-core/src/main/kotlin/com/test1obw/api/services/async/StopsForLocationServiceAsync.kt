// File generated from our OpenAPI spec by Stainless.

package com.test1obw.api.services.async

import com.test1obw.api.core.RequestOptions
import com.test1obw.api.models.StopsForLocationListParams
import com.test1obw.api.models.StopsForLocationListResponse

interface StopsForLocationServiceAsync {

    /** stops-for-location */
    suspend fun list(
        params: StopsForLocationListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): StopsForLocationListResponse
}
