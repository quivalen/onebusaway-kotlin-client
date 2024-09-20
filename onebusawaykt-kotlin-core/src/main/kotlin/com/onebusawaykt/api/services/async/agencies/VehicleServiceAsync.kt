// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.onebusawaykt.api.services.async.agencies

import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.models.AgencyVehicleListParams
import com.onebusawaykt.api.models.AgencyVehicleListResponse

interface VehicleServiceAsync {

    /** Get vehicles for a specific agency */
    suspend fun list(
        params: AgencyVehicleListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AgencyVehicleListResponse
}
