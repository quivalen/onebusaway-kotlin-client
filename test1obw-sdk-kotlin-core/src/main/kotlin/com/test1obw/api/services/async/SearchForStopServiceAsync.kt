// File generated from our OpenAPI spec by Stainless.

package com.test1obw.api.services.async

import com.test1obw.api.core.RequestOptions
import com.test1obw.api.models.SearchForStopListParams
import com.test1obw.api.models.SearchForStopListResponse

interface SearchForStopServiceAsync {

    /** Search for a stop based on its name. */
    suspend fun list(
        params: SearchForStopListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): SearchForStopListResponse
}
