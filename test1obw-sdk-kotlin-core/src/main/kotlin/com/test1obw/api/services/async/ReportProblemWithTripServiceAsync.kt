// File generated from our OpenAPI spec by Stainless.

package com.test1obw.api.services.async

import com.test1obw.api.core.RequestOptions
import com.test1obw.api.models.ReportProblemWithTripRetrieveParams
import com.test1obw.api.models.ResponseWrapper

interface ReportProblemWithTripServiceAsync {

    /** Submit a user-generated problem report for a particular trip. */
    suspend fun retrieve(
        params: ReportProblemWithTripRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ResponseWrapper
}
