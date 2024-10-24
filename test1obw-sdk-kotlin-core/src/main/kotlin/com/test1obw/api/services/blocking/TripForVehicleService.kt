// File generated from our OpenAPI spec by Stainless.

package com.test1obw.api.services.blocking

import com.test1obw.api.core.RequestOptions
import com.test1obw.api.models.TripForVehicleRetrieveParams
import com.test1obw.api.models.TripForVehicleRetrieveResponse

interface TripForVehicleService {

    /** Retrieve trip for a specific vehicle */
    fun retrieve(
        params: TripForVehicleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TripForVehicleRetrieveResponse
}
