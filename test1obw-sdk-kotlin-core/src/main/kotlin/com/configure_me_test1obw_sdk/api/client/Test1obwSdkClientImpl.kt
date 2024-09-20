// File generated from our OpenAPI spec by Stainless.

package com.configure_me_test1obw_sdk.api.client

import com.configure_me_test1obw_sdk.api.core.ClientOptions
import com.configure_me_test1obw_sdk.api.core.http.HttpResponse.Handler
import com.configure_me_test1obw_sdk.api.errors.Test1obwSdkError
import com.configure_me_test1obw_sdk.api.models.*
import com.configure_me_test1obw_sdk.api.services.blocking.*
import com.configure_me_test1obw_sdk.api.services.errorHandler

class Test1obwSdkClientImpl
constructor(
    private val clientOptions: ClientOptions,
) : Test1obwSdkClient {

    private val errorHandler: Handler<Test1obwSdkError> = errorHandler(clientOptions.jsonMapper)

    private val async: Test1obwSdkClientAsync by lazy { Test1obwSdkClientAsyncImpl(clientOptions) }

    private val agenciesWithCoverage: AgenciesWithCoverageService by lazy {
        AgenciesWithCoverageServiceImpl(clientOptions)
    }

    private val agencies: AgencyService by lazy { AgencyServiceImpl(clientOptions) }

    private val routes: RouteService by lazy { RouteServiceImpl(clientOptions) }

    private val routesForLocation: RoutesForLocationService by lazy {
        RoutesForLocationServiceImpl(clientOptions)
    }

    private val configurations: ConfigurationService by lazy {
        ConfigurationServiceImpl(clientOptions)
    }

    private val currentTime: CurrentTimeService by lazy { CurrentTimeServiceImpl(clientOptions) }

    private val stopsForLocation: StopsForLocationService by lazy {
        StopsForLocationServiceImpl(clientOptions)
    }

    private val where: WhereService by lazy { WhereServiceImpl(clientOptions) }

    private val schedules: ScheduleService by lazy { ScheduleServiceImpl(clientOptions) }

    private val stops: StopService by lazy { StopServiceImpl(clientOptions) }

    private val trips: TripService by lazy { TripServiceImpl(clientOptions) }

    private val blocks: BlockService by lazy { BlockServiceImpl(clientOptions) }

    private val shapes: ShapeService by lazy { ShapeServiceImpl(clientOptions) }

    override fun async(): Test1obwSdkClientAsync = async

    override fun agenciesWithCoverage(): AgenciesWithCoverageService = agenciesWithCoverage

    override fun agencies(): AgencyService = agencies

    override fun routes(): RouteService = routes

    override fun routesForLocation(): RoutesForLocationService = routesForLocation

    override fun configurations(): ConfigurationService = configurations

    override fun currentTime(): CurrentTimeService = currentTime

    override fun stopsForLocation(): StopsForLocationService = stopsForLocation

    override fun where(): WhereService = where

    override fun schedules(): ScheduleService = schedules

    override fun stops(): StopService = stops

    override fun trips(): TripService = trips

    override fun blocks(): BlockService = blocks

    override fun shapes(): ShapeService = shapes
}
