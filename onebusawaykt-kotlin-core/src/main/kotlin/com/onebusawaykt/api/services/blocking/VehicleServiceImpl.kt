// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.services.blocking

import com.onebusawaykt.api.core.ClientOptions
import com.onebusawaykt.api.core.http.HttpResponse.Handler
import com.onebusawaykt.api.errors.OnebusawayktError
import com.onebusawaykt.api.services.blocking.vehicles.TripService
import com.onebusawaykt.api.services.blocking.vehicles.TripServiceImpl
import com.onebusawaykt.api.services.errorHandler

class VehicleServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : VehicleService {

    private val errorHandler: Handler<OnebusawayktError> = errorHandler(clientOptions.jsonMapper)

    private val trip: TripService by lazy { TripServiceImpl(clientOptions) }

    override fun trip(): TripService = trip
}
