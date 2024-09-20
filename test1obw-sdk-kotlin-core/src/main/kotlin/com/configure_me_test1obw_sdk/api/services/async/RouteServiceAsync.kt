// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.configure_me_test1obw_sdk.api.services.async

import com.configure_me_test1obw_sdk.api.core.RequestOptions
import com.configure_me_test1obw_sdk.api.models.RouteRetrieveParams
import com.configure_me_test1obw_sdk.api.models.RouteRetrieveResponse
import com.configure_me_test1obw_sdk.api.models.RouteSearchParams
import com.configure_me_test1obw_sdk.api.models.RouteSearchResponse
import com.configure_me_test1obw_sdk.api.services.async.routes.ScheduleServiceAsync

interface RouteServiceAsync {

    fun schedule(): ScheduleServiceAsync

    /** Retrieve information for a specific route identified by its unique ID. */
    suspend fun retrieve(
        params: RouteRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RouteRetrieveResponse

    /** Search for a route based on its name. */
    suspend fun search(
        params: RouteSearchParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RouteSearchResponse
}
