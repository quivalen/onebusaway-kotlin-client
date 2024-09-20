// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.configure_me_test1obw_sdk.api.services.blocking.where

import com.configure_me_test1obw_sdk.api.core.RequestOptions
import com.configure_me_test1obw_sdk.api.models.WhereTripRetrieveParams
import com.configure_me_test1obw_sdk.api.models.WhereTripRetrieveResponse

interface TripService {

    /** Get details of a specific trip */
    fun retrieve(
        params: WhereTripRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): WhereTripRetrieveResponse
}
