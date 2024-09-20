// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.configure_me_test1obw_sdk.api.services.blocking.agencies

import com.configure_me_test1obw_sdk.api.core.RequestOptions
import com.configure_me_test1obw_sdk.api.models.AgencyRouteListParams
import com.configure_me_test1obw_sdk.api.models.AgencyRouteListResponse

interface RouteService {

    /** Retrieve the list of all routes for a particular agency by id */
    fun list(
        params: AgencyRouteListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AgencyRouteListResponse
}
