// File generated from our OpenAPI spec by Stainless.

package com.test1obw.api.services.blocking

import com.test1obw.api.core.RequestOptions
import com.test1obw.api.models.StopIdsForAgencyListParams
import com.test1obw.api.models.StopIdsForAgencyListResponse

interface StopIdsForAgencyService {

    /** Get stop IDs for a specific agency */
    fun list(
        params: StopIdsForAgencyListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): StopIdsForAgencyListResponse
}
