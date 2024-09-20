// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.onebusawaykt.api.services.async

import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.models.ShapeRetrieveParams
import com.onebusawaykt.api.models.ShapeRetrieveResponse

interface ShapeServiceAsync {

    /** Retrieve a shape (the path traveled by a transit vehicle) by ID. */
    suspend fun retrieve(
        params: ShapeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ShapeRetrieveResponse
}
