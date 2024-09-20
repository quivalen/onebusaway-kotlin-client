// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.onebusawaykt.api.services.blocking.trips

import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.models.TripDetailRetrieveParams
import com.onebusawaykt.api.models.TripDetailRetrieveResponse

interface DetailService {

    /** Retrieve Trip Details */
    fun retrieve(
        params: TripDetailRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TripDetailRetrieveResponse
}
