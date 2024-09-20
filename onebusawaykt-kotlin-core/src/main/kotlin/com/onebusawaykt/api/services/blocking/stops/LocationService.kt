// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.onebusawaykt.api.services.blocking.stops

import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.models.StopLocationListParams
import com.onebusawaykt.api.models.StopLocationListResponse

interface LocationService {

    /** stops-for-location */
    fun list(
        params: StopLocationListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): StopLocationListResponse
}
