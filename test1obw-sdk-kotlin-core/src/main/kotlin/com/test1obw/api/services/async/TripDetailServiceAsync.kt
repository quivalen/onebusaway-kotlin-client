// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.test1obw.api.services.async

import com.test1obw.api.core.RequestOptions
import com.test1obw.api.models.TripDetailRetrieveParams
import com.test1obw.api.models.TripDetailRetrieveResponse

interface TripDetailServiceAsync {

    /** Retrieve Trip Details */
    suspend fun retrieve(
        params: TripDetailRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TripDetailRetrieveResponse
}
