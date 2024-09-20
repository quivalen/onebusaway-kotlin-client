// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.configure_me_test1obw_sdk.api.services.blocking.agencies

import com.configure_me_test1obw_sdk.api.core.RequestOptions
import com.configure_me_test1obw_sdk.api.models.AgencyRouteIdListParams
import com.configure_me_test1obw_sdk.api.models.AgencyRouteIdListResponse

interface RouteIdService {

    /** Get route IDs for a specific agency */
    fun list(
        params: AgencyRouteIdListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AgencyRouteIdListResponse
}
