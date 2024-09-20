// File generated from our OpenAPI spec by Stainless.

package com.configure_me_test1obw_sdk.api.client

import com.configure_me_test1obw_sdk.api.core.ClientOptions
import com.configure_me_test1obw_sdk.api.core.http.HttpResponse.Handler
import com.configure_me_test1obw_sdk.api.errors.Test1obwSdkError
import com.configure_me_test1obw_sdk.api.models.*
import com.configure_me_test1obw_sdk.api.services.async.*
import com.configure_me_test1obw_sdk.api.services.errorHandler

class Test1obwSdkClientAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : Test1obwSdkClientAsync {

    private val errorHandler: Handler<Test1obwSdkError> = errorHandler(clientOptions.jsonMapper)

    private val sync: Test1obwSdkClient by lazy { Test1obwSdkClientImpl(clientOptions) }

    private val agenciesWithCoverage: AgenciesWithCoverageServiceAsync by lazy {
        AgenciesWithCoverageServiceAsyncImpl(clientOptions)
    }

    private val agencies: AgencyServiceAsync by lazy { AgencyServiceAsyncImpl(clientOptions) }

    private val routes: RouteServiceAsync by lazy { RouteServiceAsyncImpl(clientOptions) }

    private val routesForLocation: RoutesForLocationServiceAsync by lazy {
        RoutesForLocationServiceAsyncImpl(clientOptions)
    }

    private val configurations: ConfigurationServiceAsync by lazy {
        ConfigurationServiceAsyncImpl(clientOptions)
    }

    private val currentTime: CurrentTimeServiceAsync by lazy {
        CurrentTimeServiceAsyncImpl(clientOptions)
    }

    private val stopsForLocation: StopsForLocationServiceAsync by lazy {
        StopsForLocationServiceAsyncImpl(clientOptions)
    }

    private val where: WhereServiceAsync by lazy { WhereServiceAsyncImpl(clientOptions) }

    private val schedules: ScheduleServiceAsync by lazy { ScheduleServiceAsyncImpl(clientOptions) }

    private val stops: StopServiceAsync by lazy { StopServiceAsyncImpl(clientOptions) }

    private val trips: TripServiceAsync by lazy { TripServiceAsyncImpl(clientOptions) }

    private val blocks: BlockServiceAsync by lazy { BlockServiceAsyncImpl(clientOptions) }

    private val shapes: ShapeServiceAsync by lazy { ShapeServiceAsyncImpl(clientOptions) }

    override fun sync(): Test1obwSdkClient = sync

    override fun agenciesWithCoverage(): AgenciesWithCoverageServiceAsync = agenciesWithCoverage

    override fun agencies(): AgencyServiceAsync = agencies

    override fun routes(): RouteServiceAsync = routes

    override fun routesForLocation(): RoutesForLocationServiceAsync = routesForLocation

    override fun configurations(): ConfigurationServiceAsync = configurations

    override fun currentTime(): CurrentTimeServiceAsync = currentTime

    override fun stopsForLocation(): StopsForLocationServiceAsync = stopsForLocation

    override fun where(): WhereServiceAsync = where

    override fun schedules(): ScheduleServiceAsync = schedules

    override fun stops(): StopServiceAsync = stops

    override fun trips(): TripServiceAsync = trips

    override fun blocks(): BlockServiceAsync = blocks

    override fun shapes(): ShapeServiceAsync = shapes
}
