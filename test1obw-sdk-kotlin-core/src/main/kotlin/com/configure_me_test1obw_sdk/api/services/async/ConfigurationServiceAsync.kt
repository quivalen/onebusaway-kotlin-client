// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.configure_me_test1obw_sdk.api.services.async

import com.configure_me_test1obw_sdk.api.core.RequestOptions
import com.configure_me_test1obw_sdk.api.models.ConfigurationRetrieveParams
import com.configure_me_test1obw_sdk.api.models.ConfigurationRetrieveResponse

interface ConfigurationServiceAsync {

    /** config */
    suspend fun retrieve(
        params: ConfigurationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ConfigurationRetrieveResponse
}
