// File generated from our OpenAPI spec by Stainless.

package com.test1obw.api.services.async

import com.test1obw.api.core.RequestOptions
import com.test1obw.api.models.BlockRetrieveParams
import com.test1obw.api.models.BlockRetrieveResponse

interface BlockServiceAsync {

    /** Get details of a specific block by ID */
    suspend fun retrieve(
        params: BlockRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): BlockRetrieveResponse
}
