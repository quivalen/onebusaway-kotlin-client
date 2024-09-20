// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.onebusawaykt.api.services.blocking

import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.models.ConfigRetrieveParams
import com.onebusawaykt.api.models.ConfigRetrieveResponse

interface ConfigService {

    /** config */
    fun retrieve(
        params: ConfigRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ConfigRetrieveResponse
}
