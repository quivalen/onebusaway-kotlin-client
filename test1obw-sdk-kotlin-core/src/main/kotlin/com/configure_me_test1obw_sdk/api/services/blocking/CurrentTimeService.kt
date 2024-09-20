// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.configure_me_test1obw_sdk.api.services.blocking

import com.configure_me_test1obw_sdk.api.core.RequestOptions
import com.configure_me_test1obw_sdk.api.models.CurrentTimeRetrieveParams
import com.configure_me_test1obw_sdk.api.models.CurrentTimeRetrieveResponse

interface CurrentTimeService {

    /** current-time */
    fun retrieve(
        params: CurrentTimeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CurrentTimeRetrieveResponse
}
