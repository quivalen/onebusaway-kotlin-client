// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.onebusawaykt.api.services.async

import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.models.CurrentTimeRetrieveParams
import com.onebusawaykt.api.models.CurrentTimeRetrieveResponse

interface CurrentTimeServiceAsync {

    /** current-time */
    suspend fun retrieve(
        params: CurrentTimeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CurrentTimeRetrieveResponse
}
