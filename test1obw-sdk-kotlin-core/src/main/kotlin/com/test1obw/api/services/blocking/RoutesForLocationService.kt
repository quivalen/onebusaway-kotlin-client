// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.test1obw.api.services.blocking

import com.test1obw.api.core.RequestOptions
import com.test1obw.api.models.RoutesForLocationListParams
import com.test1obw.api.models.RoutesForLocationListResponse

interface RoutesForLocationService {

    /** routes-for-location */
    fun list(
        params: RoutesForLocationListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RoutesForLocationListResponse
}
