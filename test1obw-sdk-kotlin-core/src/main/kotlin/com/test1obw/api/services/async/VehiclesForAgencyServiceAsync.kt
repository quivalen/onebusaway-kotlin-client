// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.test1obw.api.services.async

import com.test1obw.api.core.RequestOptions
import com.test1obw.api.models.VehiclesForAgencyListParams
import com.test1obw.api.models.VehiclesForAgencyListResponse

interface VehiclesForAgencyServiceAsync {

    /** Get vehicles for a specific agency */
    suspend fun list(
        params: VehiclesForAgencyListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): VehiclesForAgencyListResponse
}
