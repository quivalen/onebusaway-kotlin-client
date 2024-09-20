// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.onebusawaykt.api.services.async.trips

import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.models.TripReportProblemRetrieveParams
import com.onebusawaykt.api.models.TripReportProblemRetrieveResponse

interface ReportProblemServiceAsync {

    /** Submit a user-generated problem report for a particular trip. */
    suspend fun retrieve(
        params: TripReportProblemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TripReportProblemRetrieveResponse
}
