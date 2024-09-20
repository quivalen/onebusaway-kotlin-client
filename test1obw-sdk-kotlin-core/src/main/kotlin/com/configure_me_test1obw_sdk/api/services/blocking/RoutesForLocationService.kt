// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.configure_me_test1obw_sdk.api.services.blocking

import com.configure_me_test1obw_sdk.api.core.RequestOptions
import com.configure_me_test1obw_sdk.api.models.RoutesForLocationListParams
import com.configure_me_test1obw_sdk.api.models.RoutesForLocationListResponse

interface RoutesForLocationService {

    /** routes-for-location */
    fun list(
        params: RoutesForLocationListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RoutesForLocationListResponse
}
