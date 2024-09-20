// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.configure_me_test1obw_sdk.api.services.async.where

import com.configure_me_test1obw_sdk.api.core.RequestOptions
import com.configure_me_test1obw_sdk.api.models.WhereTripsForRouteListParams
import com.configure_me_test1obw_sdk.api.models.WhereTripsForRouteListResponse

interface TripsForRouteServiceAsync {

    /** Search for active trips for a specific route. */
    suspend fun list(
        params: WhereTripsForRouteListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): WhereTripsForRouteListResponse
}