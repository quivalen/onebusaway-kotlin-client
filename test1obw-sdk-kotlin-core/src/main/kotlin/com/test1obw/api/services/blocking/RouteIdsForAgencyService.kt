// File generated from our OpenAPI spec by Stainless.

package com.test1obw.api.services.blocking

import com.test1obw.api.core.RequestOptions
import com.test1obw.api.models.RouteIdsForAgencyListParams
import com.test1obw.api.models.RouteIdsForAgencyListResponse

interface RouteIdsForAgencyService {

    /** Get route IDs for a specific agency */
    fun list(
        params: RouteIdsForAgencyListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RouteIdsForAgencyListResponse
}
