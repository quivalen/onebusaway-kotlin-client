// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.onebusawaykt.api.services.blocking.stops

import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.models.StopReportProblemRetrieveParams
import com.onebusawaykt.api.models.StopReportProblemRetrieveResponse

interface ReportProblemService {

    /** Submit a user-generated problem report for a stop */
    fun retrieve(
        params: StopReportProblemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): StopReportProblemRetrieveResponse
}
