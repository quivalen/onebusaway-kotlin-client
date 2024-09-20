// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.configure_me_test1obw_sdk.api.services.blocking

import com.configure_me_test1obw_sdk.api.core.RequestOptions
import com.configure_me_test1obw_sdk.api.models.AgencyRetrieveParams
import com.configure_me_test1obw_sdk.api.models.AgencyRetrieveResponse
import com.configure_me_test1obw_sdk.api.services.blocking.agencies.RouteIdService
import com.configure_me_test1obw_sdk.api.services.blocking.agencies.RouteService
import com.configure_me_test1obw_sdk.api.services.blocking.agencies.StopService

interface AgencyService {

    fun routeIds(): RouteIdService

    fun routes(): RouteService

    fun stops(): StopService

    /** Retrieve information for a specific transit agency identified by its unique ID. */
    fun retrieve(
        params: AgencyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AgencyRetrieveResponse
}
