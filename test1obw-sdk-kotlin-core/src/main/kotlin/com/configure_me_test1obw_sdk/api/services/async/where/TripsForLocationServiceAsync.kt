// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.configure_me_test1obw_sdk.api.services.async.where

import com.configure_me_test1obw_sdk.api.core.RequestOptions
import com.configure_me_test1obw_sdk.api.models.WhereTripsForLocationListParams
import com.configure_me_test1obw_sdk.api.models.WhereTripsForLocationListResponse

interface TripsForLocationServiceAsync {

    /** Retrieve trips for a given location */
    suspend fun list(
        params: WhereTripsForLocationListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): WhereTripsForLocationListResponse
}
