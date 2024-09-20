// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.configure_me_test1obw_sdk.api.services.async

import com.configure_me_test1obw_sdk.api.core.RequestOptions
import com.configure_me_test1obw_sdk.api.models.ResponseWrapper
import com.configure_me_test1obw_sdk.api.models.TripReportProblemParams

interface TripServiceAsync {

    /** Submit a user-generated problem report for a particular trip. */
    suspend fun reportProblem(
        params: TripReportProblemParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ResponseWrapper
}
