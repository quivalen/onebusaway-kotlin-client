// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.configure_me_test1obw_sdk.api.services.blocking

import com.configure_me_test1obw_sdk.api.core.RequestOptions
import com.configure_me_test1obw_sdk.api.models.BlockRetrieveParams
import com.configure_me_test1obw_sdk.api.models.BlockRetrieveResponse

interface BlockService {

    /** Get details of a specific block by ID */
    fun retrieve(
        params: BlockRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): BlockRetrieveResponse
}
