// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.onebusawaykt.api.services.async.stops

import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.models.StopArrivalAndDepartureRetrieveParams
import com.onebusawaykt.api.models.StopArrivalAndDepartureRetrieveResponse

interface ArrivalAndDepartureServiceAsync {

    /** arrival-and-departure-for-stop */
    suspend fun retrieve(
        params: StopArrivalAndDepartureRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): StopArrivalAndDepartureRetrieveResponse
}
