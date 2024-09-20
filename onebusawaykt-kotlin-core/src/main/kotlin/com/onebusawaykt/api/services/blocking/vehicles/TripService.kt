// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.onebusawaykt.api.services.blocking.vehicles

import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.models.VehicleTripRetrieveParams
import com.onebusawaykt.api.models.VehicleTripRetrieveResponse

interface TripService {

    /** Retrieve trip for a specific vehicle */
    fun retrieve(
        params: VehicleTripRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): VehicleTripRetrieveResponse
}
