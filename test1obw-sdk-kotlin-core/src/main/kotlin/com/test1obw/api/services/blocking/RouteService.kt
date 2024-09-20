// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.test1obw.api.services.blocking

import com.test1obw.api.core.RequestOptions
import com.test1obw.api.models.RouteRetrieveParams
import com.test1obw.api.models.RouteRetrieveResponse

interface RouteService {

    /** Retrieve information for a specific route identified by its unique ID. */
    fun retrieve(
        params: RouteRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RouteRetrieveResponse
}
