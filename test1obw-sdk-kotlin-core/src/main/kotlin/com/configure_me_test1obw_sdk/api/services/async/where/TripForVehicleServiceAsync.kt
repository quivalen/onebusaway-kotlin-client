// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.configure_me_test1obw_sdk.api.services.async.where

import com.configure_me_test1obw_sdk.api.core.RequestOptions
import com.configure_me_test1obw_sdk.api.models.WhereTripForVehicleRetrieveParams
import com.configure_me_test1obw_sdk.api.models.WhereTripForVehicleRetrieveResponse

interface TripForVehicleServiceAsync {

    /** Retrieve trip for a specific vehicle */
    suspend fun retrieve(
        params: WhereTripForVehicleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): WhereTripForVehicleRetrieveResponse
}
