// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.test1obw.api.services.async

import com.test1obw.api.core.RequestOptions
import com.test1obw.api.models.ScheduleForStopRetrieveParams
import com.test1obw.api.models.ScheduleForStopRetrieveResponse

interface ScheduleForStopServiceAsync {

    /** Get schedule for a specific stop */
    suspend fun retrieve(
        params: ScheduleForStopRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ScheduleForStopRetrieveResponse
}
