// File generated from our OpenAPI spec by Stainless.

package com.test1obw.api.services.async

import com.test1obw.api.core.RequestOptions
import com.test1obw.api.models.AgenciesWithCoverageListParams
import com.test1obw.api.models.AgenciesWithCoverageListResponse

interface AgenciesWithCoverageServiceAsync {

    /**
     * Returns a list of all transit agencies currently supported by OneBusAway along with the
     * center of their coverage area.
     */
    suspend fun list(
        params: AgenciesWithCoverageListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AgenciesWithCoverageListResponse
}
