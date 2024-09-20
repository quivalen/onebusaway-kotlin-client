// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.onebusawaykt.api.services.async.stops

import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.models.StopSearchRetrieveParams
import com.onebusawaykt.api.models.StopSearchRetrieveResponse

interface SearchServiceAsync {

    /** Search for a stop based on its name. */
    suspend fun retrieve(
        params: StopSearchRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): StopSearchRetrieveResponse
}
