// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.onebusawaykt.api.services.blocking.stops

import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.models.StopScheduleForStopRetrieveParams
import com.onebusawaykt.api.models.StopScheduleForStopRetrieveResponse

interface ScheduleForStopService {

    /** Get schedule for a specific stop */
    fun retrieve(
        params: StopScheduleForStopRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): StopScheduleForStopRetrieveResponse
}
