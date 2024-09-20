// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.test1obw.api.services.async

import com.test1obw.api.core.RequestOptions
import com.test1obw.api.models.RouteIdsForAgencyListParams
import com.test1obw.api.models.RouteIdsForAgencyListResponse

interface RouteIdsForAgencyServiceAsync {

    /** Get route IDs for a specific agency */
    suspend fun list(
        params: RouteIdsForAgencyListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RouteIdsForAgencyListResponse
}
