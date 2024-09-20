// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.test1obw.api.services.async

import com.test1obw.api.core.RequestOptions
import com.test1obw.api.models.TripForVehicleRetrieveParams
import com.test1obw.api.models.TripForVehicleRetrieveResponse

interface TripForVehicleServiceAsync {

    /** Retrieve trip for a specific vehicle */
    suspend fun retrieve(
        params: TripForVehicleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TripForVehicleRetrieveResponse
}
