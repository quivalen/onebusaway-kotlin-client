// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.test1obw.api.services.async

import com.test1obw.api.core.RequestOptions
import com.test1obw.api.models.SearchForRouteListParams
import com.test1obw.api.models.SearchForRouteListResponse

interface SearchForRouteServiceAsync {

    /** Search for a route based on its name. */
    suspend fun list(
        params: SearchForRouteListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): SearchForRouteListResponse
}