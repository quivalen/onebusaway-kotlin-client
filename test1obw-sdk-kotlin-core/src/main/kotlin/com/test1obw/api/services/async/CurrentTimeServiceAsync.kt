// File generated from our OpenAPI spec by Stainless.

package com.test1obw.api.services.async

import com.test1obw.api.core.RequestOptions
import com.test1obw.api.models.CurrentTimeRetrieveParams
import com.test1obw.api.models.CurrentTimeRetrieveResponse

interface CurrentTimeServiceAsync {

    /** current-time */
    suspend fun retrieve(
        params: CurrentTimeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CurrentTimeRetrieveResponse
}
