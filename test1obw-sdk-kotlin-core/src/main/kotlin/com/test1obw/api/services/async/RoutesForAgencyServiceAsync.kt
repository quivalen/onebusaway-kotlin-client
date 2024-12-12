// File generated from our OpenAPI spec by Stainless.

package com.test1obw.api.services.async

import com.test1obw.api.core.RequestOptions
import com.test1obw.api.models.RoutesForAgencyListParams
import com.test1obw.api.models.RoutesForAgencyListResponse

interface RoutesForAgencyServiceAsync {

    /** Retrieve the list of all routes for a particular agency by id */
    suspend fun list(
        params: RoutesForAgencyListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RoutesForAgencyListResponse
}
