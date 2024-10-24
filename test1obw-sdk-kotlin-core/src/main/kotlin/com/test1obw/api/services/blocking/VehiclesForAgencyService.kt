// File generated from our OpenAPI spec by Stainless.

package com.test1obw.api.services.blocking

import com.test1obw.api.core.RequestOptions
import com.test1obw.api.models.VehiclesForAgencyListParams
import com.test1obw.api.models.VehiclesForAgencyListResponse

interface VehiclesForAgencyService {

    /** Get vehicles for a specific agency */
    fun list(
        params: VehiclesForAgencyListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): VehiclesForAgencyListResponse
}
