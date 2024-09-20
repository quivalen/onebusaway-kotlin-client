// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.configure_me_test1obw_sdk.api.services.async

import com.configure_me_test1obw_sdk.api.core.RequestOptions
import com.configure_me_test1obw_sdk.api.models.ScheduleRetrieveParams
import com.configure_me_test1obw_sdk.api.models.ScheduleRetrieveResponse

interface ScheduleServiceAsync {

    /** Get schedule for a specific stop */
    suspend fun retrieve(
        params: ScheduleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ScheduleRetrieveResponse
}
