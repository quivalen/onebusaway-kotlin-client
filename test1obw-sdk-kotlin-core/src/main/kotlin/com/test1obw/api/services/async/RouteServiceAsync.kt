// File generated from our OpenAPI spec by Stainless.

package com.test1obw.api.services.async

import com.test1obw.api.core.RequestOptions
import com.test1obw.api.models.RouteRetrieveParams
import com.test1obw.api.models.RouteRetrieveResponse

interface RouteServiceAsync {

    /** Retrieve information for a specific route identified by its unique ID. */
    suspend fun retrieve(
        params: RouteRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RouteRetrieveResponse
}
