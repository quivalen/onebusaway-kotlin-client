// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.configure_me_test1obw_sdk.api.services.async

import com.configure_me_test1obw_sdk.api.core.RequestOptions
import com.configure_me_test1obw_sdk.api.models.AgencyRetrieveParams
import com.configure_me_test1obw_sdk.api.models.AgencyRetrieveResponse
import com.configure_me_test1obw_sdk.api.services.async.agencies.RouteIdServiceAsync
import com.configure_me_test1obw_sdk.api.services.async.agencies.RouteServiceAsync
import com.configure_me_test1obw_sdk.api.services.async.agencies.StopServiceAsync

interface AgencyServiceAsync {

    fun routeIds(): RouteIdServiceAsync

    fun routes(): RouteServiceAsync

    fun stops(): StopServiceAsync

    /** Retrieve information for a specific transit agency identified by its unique ID. */
    suspend fun retrieve(
        params: AgencyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AgencyRetrieveResponse
}
