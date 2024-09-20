// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.onebusawaykt.api.services.blocking.routes

import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.models.RouteSearchRetrieveParams
import com.onebusawaykt.api.models.RouteSearchRetrieveResponse

interface SearchService {

    /** Search for a route based on its name. */
    fun retrieve(
        params: RouteSearchRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RouteSearchRetrieveResponse
}
