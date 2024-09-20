// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.test1obw.api.services.async

import com.test1obw.api.core.RequestOptions
import com.test1obw.api.models.StopIdsForAgencyListParams
import com.test1obw.api.models.StopIdsForAgencyListResponse

interface StopIdsForAgencyServiceAsync {

    /** Get stop IDs for a specific agency */
    suspend fun list(
        params: StopIdsForAgencyListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): StopIdsForAgencyListResponse
}
