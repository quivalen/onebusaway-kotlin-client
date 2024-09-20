// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.configure_me_test1obw_sdk.api.client

import com.configure_me_test1obw_sdk.api.models.*
import com.configure_me_test1obw_sdk.api.services.blocking.*

interface Test1obwSdkClient {

    fun async(): Test1obwSdkClientAsync

    fun agenciesWithCoverage(): AgenciesWithCoverageService

    fun agencies(): AgencyService

    fun routes(): RouteService

    fun routesForLocation(): RoutesForLocationService

    fun configurations(): ConfigurationService

    fun currentTime(): CurrentTimeService

    fun stopsForLocation(): StopsForLocationService

    fun where(): WhereService

    fun schedules(): ScheduleService

    fun stops(): StopService

    fun trips(): TripService

    fun blocks(): BlockService

    fun shapes(): ShapeService
}
