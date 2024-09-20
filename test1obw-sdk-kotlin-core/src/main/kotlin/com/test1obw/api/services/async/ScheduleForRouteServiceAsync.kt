// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.test1obw.api.services.async

import com.test1obw.api.core.RequestOptions
import com.test1obw.api.models.ScheduleForRouteRetrieveParams
import com.test1obw.api.models.ScheduleForRouteRetrieveResponse

interface ScheduleForRouteServiceAsync {

    /** Retrieve the full schedule for a route on a particular day */
    suspend fun retrieve(
        params: ScheduleForRouteRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ScheduleForRouteRetrieveResponse
}
