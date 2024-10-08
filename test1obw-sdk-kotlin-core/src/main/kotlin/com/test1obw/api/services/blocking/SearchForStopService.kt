// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.test1obw.api.services.blocking

import com.test1obw.api.core.RequestOptions
import com.test1obw.api.models.SearchForStopListParams
import com.test1obw.api.models.SearchForStopListResponse

interface SearchForStopService {

    /** Search for a stop based on its name. */
    fun list(
        params: SearchForStopListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): SearchForStopListResponse
}
