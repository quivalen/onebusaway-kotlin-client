// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.configure_me_test1obw_sdk.api.services.blocking

import com.configure_me_test1obw_sdk.api.core.RequestOptions
import com.configure_me_test1obw_sdk.api.models.RouteRetrieveParams
import com.configure_me_test1obw_sdk.api.models.RouteRetrieveResponse
import com.configure_me_test1obw_sdk.api.models.RouteSearchParams
import com.configure_me_test1obw_sdk.api.models.RouteSearchResponse
import com.configure_me_test1obw_sdk.api.services.blocking.routes.ScheduleService

interface RouteService {

    fun schedule(): ScheduleService

    /** Retrieve information for a specific route identified by its unique ID. */
    fun retrieve(
        params: RouteRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RouteRetrieveResponse

    /** Search for a route based on its name. */
    fun search(
        params: RouteSearchParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RouteSearchResponse
}
