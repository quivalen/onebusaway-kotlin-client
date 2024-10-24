// File generated from our OpenAPI spec by Stainless.

package com.test1obw.api.services.blocking

import com.test1obw.api.core.RequestOptions
import com.test1obw.api.models.ReportProblemWithStopRetrieveParams
import com.test1obw.api.models.ResponseWrapper

interface ReportProblemWithStopService {

    /** Submit a user-generated problem report for a stop */
    fun retrieve(
        params: ReportProblemWithStopRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ResponseWrapper
}
