// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.test1obw.api.services.blocking

import com.test1obw.api.core.RequestOptions
import com.test1obw.api.models.TripsForLocationListParams
import com.test1obw.api.models.TripsForLocationListResponse

interface TripsForLocationService {

    /** Retrieve trips for a given location */
    fun list(
        params: TripsForLocationListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TripsForLocationListResponse
}
