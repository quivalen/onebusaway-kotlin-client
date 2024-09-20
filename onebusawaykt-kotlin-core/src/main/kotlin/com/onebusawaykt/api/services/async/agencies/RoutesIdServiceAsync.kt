// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.onebusawaykt.api.services.async.agencies

import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.models.AgencyRoutesIdListParams
import com.onebusawaykt.api.models.AgencyRoutesIdListResponse

interface RoutesIdServiceAsync {

    /** Get route IDs for a specific agency */
    suspend fun list(
        params: AgencyRoutesIdListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AgencyRoutesIdListResponse
}
