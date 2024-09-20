// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.configure_me_test1obw_sdk.api.services.blocking

import com.configure_me_test1obw_sdk.api.core.RequestOptions
import com.configure_me_test1obw_sdk.api.models.ResponseWrapper
import com.configure_me_test1obw_sdk.api.models.TripReportProblemParams

interface TripService {

    /** Submit a user-generated problem report for a particular trip. */
    fun reportProblem(
        params: TripReportProblemParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ResponseWrapper
}
