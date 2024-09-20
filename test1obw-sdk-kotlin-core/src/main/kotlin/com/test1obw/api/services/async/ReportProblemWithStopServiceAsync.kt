// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.test1obw.api.services.async

import com.test1obw.api.core.RequestOptions
import com.test1obw.api.models.ReportProblemWithStopRetrieveParams
import com.test1obw.api.models.ResponseWrapper

interface ReportProblemWithStopServiceAsync {

    /** Submit a user-generated problem report for a stop */
    suspend fun retrieve(
        params: ReportProblemWithStopRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ResponseWrapper
}
