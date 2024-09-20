// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.configure_me_test1obw_sdk.api.services.async

import com.configure_me_test1obw_sdk.api.services.async.where.ArrivalAndDepartureForStopServiceAsync
import com.configure_me_test1obw_sdk.api.services.async.where.ArrivalsAndDeparturesForStopServiceAsync
import com.configure_me_test1obw_sdk.api.services.async.where.StopServiceAsync
import com.configure_me_test1obw_sdk.api.services.async.where.StopsForRouteServiceAsync
import com.configure_me_test1obw_sdk.api.services.async.where.TripDetailServiceAsync
import com.configure_me_test1obw_sdk.api.services.async.where.TripForVehicleServiceAsync
import com.configure_me_test1obw_sdk.api.services.async.where.TripServiceAsync
import com.configure_me_test1obw_sdk.api.services.async.where.TripsForLocationServiceAsync
import com.configure_me_test1obw_sdk.api.services.async.where.TripsForRouteServiceAsync
import com.configure_me_test1obw_sdk.api.services.async.where.VehiclesForAgencyServiceAsync

interface WhereServiceAsync {

    fun arrivalAndDepartureForStop(): ArrivalAndDepartureForStopServiceAsync

    fun vehiclesForAgency(): VehiclesForAgencyServiceAsync

    fun arrivalsAndDeparturesForStop(): ArrivalsAndDeparturesForStopServiceAsync

    fun trip(): TripServiceAsync

    fun tripsForRoute(): TripsForRouteServiceAsync

    fun tripsForLocation(): TripsForLocationServiceAsync

    fun tripDetails(): TripDetailServiceAsync

    fun tripForVehicle(): TripForVehicleServiceAsync

    fun stopsForRoute(): StopsForRouteServiceAsync

    fun stop(): StopServiceAsync
}
