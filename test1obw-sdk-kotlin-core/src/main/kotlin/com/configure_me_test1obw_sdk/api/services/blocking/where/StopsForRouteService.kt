// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.configure_me_test1obw_sdk.api.services.blocking.where

import com.configure_me_test1obw_sdk.api.core.RequestOptions
import com.configure_me_test1obw_sdk.api.models.WhereStopsForRouteListParams
import com.configure_me_test1obw_sdk.api.models.WhereStopsForRouteListResponse

interface StopsForRouteService {

    /** Get stops for a specific route */
    fun list(
        params: WhereStopsForRouteListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): WhereStopsForRouteListResponse
}