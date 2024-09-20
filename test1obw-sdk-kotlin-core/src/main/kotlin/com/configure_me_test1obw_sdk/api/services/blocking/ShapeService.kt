// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.configure_me_test1obw_sdk.api.services.blocking

import com.configure_me_test1obw_sdk.api.core.RequestOptions
import com.configure_me_test1obw_sdk.api.models.ShapeRetrieveParams
import com.configure_me_test1obw_sdk.api.models.ShapeRetrieveResponse

interface ShapeService {

    /** Retrieve a shape (the path traveled by a transit vehicle) by ID. */
    fun retrieve(
        params: ShapeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ShapeRetrieveResponse
}
