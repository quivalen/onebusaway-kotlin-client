// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.onebusawaykt.api.services.async.agencies

import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.models.AgencyCoverageListParams
import com.onebusawaykt.api.models.AgencyCoverageListResponse

interface CoverageServiceAsync {

    /**
     * Returns a list of all transit agencies currently supported by OneBusAway along with the
     * center of their coverage area.
     */
    suspend fun list(
        params: AgencyCoverageListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AgencyCoverageListResponse
}