// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.test1obw.api.client

import com.test1obw.api.models.*
import com.test1obw.api.services.blocking.*

interface Test1obwSdkClient {

    fun async(): Test1obwSdkClientAsync

    fun agenciesWithCoverage(): AgenciesWithCoverageService

    fun agency(): AgencyService

    fun vehiclesForAgency(): VehiclesForAgencyService

    fun config(): ConfigService

    fun currentTime(): CurrentTimeService

    fun stopsForLocation(): StopsForLocationService

    fun stopsForRoute(): StopsForRouteService

    fun stop(): StopService

    fun stopIdsForAgency(): StopIdsForAgencyService

    fun scheduleForStop(): ScheduleForStopService

    fun route(): RouteService

    fun routeIdsForAgency(): RouteIdsForAgencyService

    fun routesForLocation(): RoutesForLocationService

    fun routesForAgency(): RoutesForAgencyService

    fun scheduleForRoute(): ScheduleForRouteService

    fun arrivalAndDeparture(): ArrivalAndDepartureService

    fun trip(): TripService

    fun tripsForLocation(): TripsForLocationService

    fun tripDetails(): TripDetailService

    fun tripForVehicle(): TripForVehicleService

    fun tripsForRoute(): TripsForRouteService

    fun reportProblemWithStop(): ReportProblemWithStopService

    fun reportProblemWithTrip(): ReportProblemWithTripService

    fun searchForStop(): SearchForStopService

    fun searchForRoute(): SearchForRouteService

    fun block(): BlockService

    fun shape(): ShapeService
}
