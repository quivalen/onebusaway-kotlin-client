// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.client

import com.onebusawaykt.api.core.ClientOptions
import com.onebusawaykt.api.core.http.HttpResponse.Handler
import com.onebusawaykt.api.errors.OnebusawayktError
import com.onebusawaykt.api.models.*
import com.onebusawaykt.api.services.async.*
import com.onebusawaykt.api.services.errorHandler

class OnebusawayktClientAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : OnebusawayktClientAsync {

    private val errorHandler: Handler<OnebusawayktError> = errorHandler(clientOptions.jsonMapper)

    private val sync: OnebusawayktClient by lazy { OnebusawayktClientImpl(clientOptions) }

    private val agencies: AgencyServiceAsync by lazy { AgencyServiceAsyncImpl(clientOptions) }

    private val routes: RouteServiceAsync by lazy { RouteServiceAsyncImpl(clientOptions) }

    private val config: ConfigServiceAsync by lazy { ConfigServiceAsyncImpl(clientOptions) }

    private val currentTime: CurrentTimeServiceAsync by lazy {
        CurrentTimeServiceAsyncImpl(clientOptions)
    }

    private val stops: StopServiceAsync by lazy { StopServiceAsyncImpl(clientOptions) }

    private val trips: TripServiceAsync by lazy { TripServiceAsyncImpl(clientOptions) }

    private val tripsForLocation: TripsForLocationServiceAsync by lazy {
        TripsForLocationServiceAsyncImpl(clientOptions)
    }

    private val vehicles: VehicleServiceAsync by lazy { VehicleServiceAsyncImpl(clientOptions) }

    private val blocks: BlockServiceAsync by lazy { BlockServiceAsyncImpl(clientOptions) }

    private val shapes: ShapeServiceAsync by lazy { ShapeServiceAsyncImpl(clientOptions) }

    override fun sync(): OnebusawayktClient = sync

    override fun agencies(): AgencyServiceAsync = agencies

    override fun routes(): RouteServiceAsync = routes

    override fun config(): ConfigServiceAsync = config

    override fun currentTime(): CurrentTimeServiceAsync = currentTime

    override fun stops(): StopServiceAsync = stops

    override fun trips(): TripServiceAsync = trips

    override fun tripsForLocation(): TripsForLocationServiceAsync = tripsForLocation

    override fun vehicles(): VehicleServiceAsync = vehicles

    override fun blocks(): BlockServiceAsync = blocks

    override fun shapes(): ShapeServiceAsync = shapes
}
