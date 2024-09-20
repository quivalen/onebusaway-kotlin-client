// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.test1obw.api.services.blocking

import com.test1obw.api.core.RequestOptions
import com.test1obw.api.models.StopsForLocationListParams
import com.test1obw.api.models.StopsForLocationListResponse

interface StopsForLocationService {

    /** stops-for-location */
    fun list(
        params: StopsForLocationListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): StopsForLocationListResponse
}
