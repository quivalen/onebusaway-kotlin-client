// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.client

import com.onebusawaykt.api.core.ClientOptions
import com.onebusawaykt.api.core.http.HttpResponse.Handler
import com.onebusawaykt.api.errors.OnebusawayktError
import com.onebusawaykt.api.models.*
import com.onebusawaykt.api.services.blocking.*
import com.onebusawaykt.api.services.errorHandler

class OnebusawayktClientImpl
constructor(
    private val clientOptions: ClientOptions,
) : OnebusawayktClient {

    private val errorHandler: Handler<OnebusawayktError> = errorHandler(clientOptions.jsonMapper)

    private val async: OnebusawayktClientAsync by lazy {
        OnebusawayktClientAsyncImpl(clientOptions)
    }

    private val agencies: AgencyService by lazy { AgencyServiceImpl(clientOptions) }

    private val routes: RouteService by lazy { RouteServiceImpl(clientOptions) }

    private val config: ConfigService by lazy { ConfigServiceImpl(clientOptions) }

    private val currentTime: CurrentTimeService by lazy { CurrentTimeServiceImpl(clientOptions) }

    private val stops: StopService by lazy { StopServiceImpl(clientOptions) }

    private val trips: TripService by lazy { TripServiceImpl(clientOptions) }

    private val tripsForLocation: TripsForLocationService by lazy {
        TripsForLocationServiceImpl(clientOptions)
    }

    private val vehicles: VehicleService by lazy { VehicleServiceImpl(clientOptions) }

    private val blocks: BlockService by lazy { BlockServiceImpl(clientOptions) }

    private val shapes: ShapeService by lazy { ShapeServiceImpl(clientOptions) }

    override fun async(): OnebusawayktClientAsync = async

    override fun agencies(): AgencyService = agencies

    override fun routes(): RouteService = routes

    override fun config(): ConfigService = config

    override fun currentTime(): CurrentTimeService = currentTime

    override fun stops(): StopService = stops

    override fun trips(): TripService = trips

    override fun tripsForLocation(): TripsForLocationService = tripsForLocation

    override fun vehicles(): VehicleService = vehicles

    override fun blocks(): BlockService = blocks

    override fun shapes(): ShapeService = shapes
}
