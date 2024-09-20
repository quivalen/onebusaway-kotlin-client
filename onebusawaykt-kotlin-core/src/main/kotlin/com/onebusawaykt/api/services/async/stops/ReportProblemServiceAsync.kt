// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.onebusawaykt.api.services.async.stops

import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.models.StopReportProblemRetrieveParams
import com.onebusawaykt.api.models.StopReportProblemRetrieveResponse

interface ReportProblemServiceAsync {

    /** Submit a user-generated problem report for a stop */
    suspend fun retrieve(
        params: StopReportProblemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): StopReportProblemRetrieveResponse
}
