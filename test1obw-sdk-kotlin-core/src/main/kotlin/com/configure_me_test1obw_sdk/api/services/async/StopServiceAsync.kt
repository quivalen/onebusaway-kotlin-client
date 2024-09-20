// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.configure_me_test1obw_sdk.api.services.async

import com.configure_me_test1obw_sdk.api.core.RequestOptions
import com.configure_me_test1obw_sdk.api.models.ResponseWrapper
import com.configure_me_test1obw_sdk.api.models.StopReportProblemParams
import com.configure_me_test1obw_sdk.api.models.StopSearchParams
import com.configure_me_test1obw_sdk.api.models.StopSearchResponse

interface StopServiceAsync {

    /** Submit a user-generated problem report for a stop */
    suspend fun reportProblem(
        params: StopReportProblemParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ResponseWrapper

    /** Search for a stop based on its name. */
    suspend fun search(
        params: StopSearchParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): StopSearchResponse
}
