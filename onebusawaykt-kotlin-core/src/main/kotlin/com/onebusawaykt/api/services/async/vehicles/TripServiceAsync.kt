// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.onebusawaykt.api.services.async.vehicles

import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.models.VehicleTripRetrieveParams
import com.onebusawaykt.api.models.VehicleTripRetrieveResponse

interface TripServiceAsync {

    /** Retrieve trip for a specific vehicle */
    suspend fun retrieve(
        params: VehicleTripRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): VehicleTripRetrieveResponse
}
