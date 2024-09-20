// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.configure_me_test1obw_sdk.api.services.blocking

import com.configure_me_test1obw_sdk.api.services.blocking.where.ArrivalAndDepartureForStopService
import com.configure_me_test1obw_sdk.api.services.blocking.where.ArrivalsAndDeparturesForStopService
import com.configure_me_test1obw_sdk.api.services.blocking.where.StopService
import com.configure_me_test1obw_sdk.api.services.blocking.where.StopsForRouteService
import com.configure_me_test1obw_sdk.api.services.blocking.where.TripDetailService
import com.configure_me_test1obw_sdk.api.services.blocking.where.TripForVehicleService
import com.configure_me_test1obw_sdk.api.services.blocking.where.TripService
import com.configure_me_test1obw_sdk.api.services.blocking.where.TripsForLocationService
import com.configure_me_test1obw_sdk.api.services.blocking.where.TripsForRouteService
import com.configure_me_test1obw_sdk.api.services.blocking.where.VehiclesForAgencyService

interface WhereService {

    fun arrivalAndDepartureForStop(): ArrivalAndDepartureForStopService

    fun vehiclesForAgency(): VehiclesForAgencyService

    fun arrivalsAndDeparturesForStop(): ArrivalsAndDeparturesForStopService

    fun trip(): TripService

    fun tripsForRoute(): TripsForRouteService

    fun tripsForLocation(): TripsForLocationService

    fun tripDetails(): TripDetailService

    fun tripForVehicle(): TripForVehicleService

    fun stopsForRoute(): StopsForRouteService

    fun stop(): StopService
}
