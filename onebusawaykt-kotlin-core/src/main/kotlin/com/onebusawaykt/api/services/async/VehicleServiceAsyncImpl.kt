// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.services.async

import com.onebusawaykt.api.core.ClientOptions
import com.onebusawaykt.api.core.http.HttpResponse.Handler
import com.onebusawaykt.api.errors.OnebusawayktError
import com.onebusawaykt.api.services.async.vehicles.TripServiceAsync
import com.onebusawaykt.api.services.async.vehicles.TripServiceAsyncImpl
import com.onebusawaykt.api.services.errorHandler

class VehicleServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : VehicleServiceAsync {

    private val errorHandler: Handler<OnebusawayktError> = errorHandler(clientOptions.jsonMapper)

    private val trip: TripServiceAsync by lazy { TripServiceAsyncImpl(clientOptions) }

    override fun trip(): TripServiceAsync = trip
}
