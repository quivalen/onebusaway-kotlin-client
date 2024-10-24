// File generated from our OpenAPI spec by Stainless.

package com.test1obw.api.services.blocking

import com.test1obw.api.core.RequestOptions
import com.test1obw.api.models.AgencyRetrieveParams
import com.test1obw.api.models.AgencyRetrieveResponse

interface AgencyService {

    /** Retrieve information for a specific transit agency identified by its unique ID. */
    fun retrieve(
        params: AgencyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AgencyRetrieveResponse
}
