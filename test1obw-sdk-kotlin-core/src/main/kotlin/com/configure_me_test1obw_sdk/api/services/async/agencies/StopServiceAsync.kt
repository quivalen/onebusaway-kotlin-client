// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.configure_me_test1obw_sdk.api.services.async.agencies

import com.configure_me_test1obw_sdk.api.core.RequestOptions
import com.configure_me_test1obw_sdk.api.models.AgencyStopListParams
import com.configure_me_test1obw_sdk.api.models.AgencyStopListResponse

interface StopServiceAsync {

    /** Get stop IDs for a specific agency */
    suspend fun list(
        params: AgencyStopListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AgencyStopListResponse
}
