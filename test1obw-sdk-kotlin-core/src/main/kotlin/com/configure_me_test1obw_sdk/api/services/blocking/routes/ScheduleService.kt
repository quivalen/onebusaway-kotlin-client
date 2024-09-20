// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.configure_me_test1obw_sdk.api.services.blocking.routes

import com.configure_me_test1obw_sdk.api.core.RequestOptions
import com.configure_me_test1obw_sdk.api.models.RouteScheduleRetrieveParams
import com.configure_me_test1obw_sdk.api.models.RouteScheduleRetrieveResponse

interface ScheduleService {

    /** Retrieve the full schedule for a route on a particular day */
    fun retrieve(
        params: RouteScheduleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RouteScheduleRetrieveResponse
}
