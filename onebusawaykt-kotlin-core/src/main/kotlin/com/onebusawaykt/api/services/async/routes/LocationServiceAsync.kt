// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.onebusawaykt.api.services.async.routes

import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.models.RouteLocationListParams
import com.onebusawaykt.api.models.RouteLocationListResponse

interface LocationServiceAsync {

    /** routes-for-location */
    suspend fun list(
        params: RouteLocationListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RouteLocationListResponse
}
