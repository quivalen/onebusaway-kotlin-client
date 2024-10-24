// File generated from our OpenAPI spec by Stainless.

package com.test1obw.api.services.blocking

import com.test1obw.api.core.RequestOptions
import com.test1obw.api.models.ShapeRetrieveParams
import com.test1obw.api.models.ShapeRetrieveResponse

interface ShapeService {

    /** Retrieve a shape (the path traveled by a transit vehicle) by ID. */
    fun retrieve(
        params: ShapeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ShapeRetrieveResponse
}
