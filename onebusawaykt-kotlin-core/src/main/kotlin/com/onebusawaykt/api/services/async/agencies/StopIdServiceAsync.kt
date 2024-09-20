// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.onebusawaykt.api.services.async.agencies

import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.models.AgencyStopIdRetrieveParams
import com.onebusawaykt.api.models.AgencyStopIdRetrieveResponse

interface StopIdServiceAsync {

    /** Get stop IDs for a specific agency */
    suspend fun retrieve(
        params: AgencyStopIdRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AgencyStopIdRetrieveResponse
}
