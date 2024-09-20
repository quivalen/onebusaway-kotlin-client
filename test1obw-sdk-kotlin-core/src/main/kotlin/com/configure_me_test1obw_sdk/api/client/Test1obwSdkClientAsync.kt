// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.configure_me_test1obw_sdk.api.client

import com.configure_me_test1obw_sdk.api.models.*
import com.configure_me_test1obw_sdk.api.services.async.*

interface Test1obwSdkClientAsync {

    fun sync(): Test1obwSdkClient

    fun agenciesWithCoverage(): AgenciesWithCoverageServiceAsync

    fun agencies(): AgencyServiceAsync

    fun routes(): RouteServiceAsync

    fun routesForLocation(): RoutesForLocationServiceAsync

    fun configurations(): ConfigurationServiceAsync

    fun currentTime(): CurrentTimeServiceAsync

    fun stopsForLocation(): StopsForLocationServiceAsync

    fun where(): WhereServiceAsync

    fun schedules(): ScheduleServiceAsync

    fun stops(): StopServiceAsync

    fun trips(): TripServiceAsync

    fun blocks(): BlockServiceAsync

    fun shapes(): ShapeServiceAsync
}
