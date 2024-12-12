// File generated from our OpenAPI spec by Stainless.

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
