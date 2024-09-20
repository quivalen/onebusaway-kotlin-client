// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.test1obw.api.services.async

import com.test1obw.api.core.RequestOptions
import com.test1obw.api.models.ArrivalAndDepartureListParams
import com.test1obw.api.models.ArrivalAndDepartureListResponse
import com.test1obw.api.models.ArrivalAndDepartureRetrieveParams
import com.test1obw.api.models.ArrivalAndDepartureRetrieveResponse

interface ArrivalAndDepartureServiceAsync {

    /** arrival-and-departure-for-stop */
    suspend fun retrieve(
        params: ArrivalAndDepartureRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ArrivalAndDepartureRetrieveResponse

    /** arrivals-and-departures-for-stop */
    suspend fun list(
        params: ArrivalAndDepartureListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ArrivalAndDepartureListResponse
}
