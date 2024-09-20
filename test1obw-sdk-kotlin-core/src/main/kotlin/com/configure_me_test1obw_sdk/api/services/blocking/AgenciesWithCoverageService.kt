// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.configure_me_test1obw_sdk.api.services.blocking

import com.configure_me_test1obw_sdk.api.core.RequestOptions
import com.configure_me_test1obw_sdk.api.models.AgenciesWithCoverageListParams
import com.configure_me_test1obw_sdk.api.models.AgenciesWithCoverageListResponse

interface AgenciesWithCoverageService {

    /**
     * Returns a list of all transit agencies currently supported by OneBusAway along with the
     * center of their coverage area.
     */
    fun list(
        params: AgenciesWithCoverageListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AgenciesWithCoverageListResponse
}
