// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.configure_me_test1obw_sdk.api.services.async.where

import com.configure_me_test1obw_sdk.api.core.RequestOptions
import com.configure_me_test1obw_sdk.api.models.WhereStopRetrieveParams
import com.configure_me_test1obw_sdk.api.models.WhereStopRetrieveResponse

interface StopServiceAsync {

    /** Get details of a specific stop */
    suspend fun retrieve(
        params: WhereStopRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): WhereStopRetrieveResponse
}
