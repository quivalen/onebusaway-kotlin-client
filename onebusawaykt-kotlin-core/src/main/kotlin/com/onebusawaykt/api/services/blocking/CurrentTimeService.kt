// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.onebusawaykt.api.services.blocking

import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.models.CurrentTimeRetrieveParams
import com.onebusawaykt.api.models.CurrentTimeRetrieveResponse

interface CurrentTimeService {

    /** current-time */
    fun retrieve(
        params: CurrentTimeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CurrentTimeRetrieveResponse
}
