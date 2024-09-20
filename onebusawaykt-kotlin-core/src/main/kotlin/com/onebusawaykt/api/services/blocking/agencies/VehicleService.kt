// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.onebusawaykt.api.services.blocking.agencies

import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.models.AgencyVehicleListParams
import com.onebusawaykt.api.models.AgencyVehicleListResponse

interface VehicleService {

    /** Get vehicles for a specific agency */
    fun list(
        params: AgencyVehicleListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AgencyVehicleListResponse
}
