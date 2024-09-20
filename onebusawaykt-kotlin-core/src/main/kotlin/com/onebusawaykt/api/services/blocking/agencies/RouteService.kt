// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.onebusawaykt.api.services.blocking.agencies

import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.models.AgencyRouteListParams
import com.onebusawaykt.api.models.AgencyRouteListResponse

interface RouteService {

    /** Retrieve the list of all routes for a particular agency by id */
    fun list(
        params: AgencyRouteListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AgencyRouteListResponse
}
