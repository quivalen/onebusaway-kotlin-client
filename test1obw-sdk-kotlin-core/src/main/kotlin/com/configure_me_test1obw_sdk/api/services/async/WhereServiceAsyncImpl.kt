// File generated from our OpenAPI spec by Stainless.

package com.configure_me_test1obw_sdk.api.services.async

import com.configure_me_test1obw_sdk.api.core.ClientOptions
import com.configure_me_test1obw_sdk.api.core.http.HttpResponse.Handler
import com.configure_me_test1obw_sdk.api.errors.Test1obwSdkError
import com.configure_me_test1obw_sdk.api.services.async.where.ArrivalAndDepartureForStopServiceAsync
import com.configure_me_test1obw_sdk.api.services.async.where.ArrivalAndDepartureForStopServiceAsyncImpl
import com.configure_me_test1obw_sdk.api.services.async.where.ArrivalsAndDeparturesForStopServiceAsync
import com.configure_me_test1obw_sdk.api.services.async.where.ArrivalsAndDeparturesForStopServiceAsyncImpl
import com.configure_me_test1obw_sdk.api.services.async.where.StopServiceAsync
import com.configure_me_test1obw_sdk.api.services.async.where.StopServiceAsyncImpl
import com.configure_me_test1obw_sdk.api.services.async.where.StopsForRouteServiceAsync
import com.configure_me_test1obw_sdk.api.services.async.where.StopsForRouteServiceAsyncImpl
import com.configure_me_test1obw_sdk.api.services.async.where.TripDetailServiceAsync
import com.configure_me_test1obw_sdk.api.services.async.where.TripDetailServiceAsyncImpl
import com.configure_me_test1obw_sdk.api.services.async.where.TripForVehicleServiceAsync
import com.configure_me_test1obw_sdk.api.services.async.where.TripForVehicleServiceAsyncImpl
import com.configure_me_test1obw_sdk.api.services.async.where.TripServiceAsync
import com.configure_me_test1obw_sdk.api.services.async.where.TripServiceAsyncImpl
import com.configure_me_test1obw_sdk.api.services.async.where.TripsForLocationServiceAsync
import com.configure_me_test1obw_sdk.api.services.async.where.TripsForLocationServiceAsyncImpl
import com.configure_me_test1obw_sdk.api.services.async.where.TripsForRouteServiceAsync
import com.configure_me_test1obw_sdk.api.services.async.where.TripsForRouteServiceAsyncImpl
import com.configure_me_test1obw_sdk.api.services.async.where.VehiclesForAgencyServiceAsync
import com.configure_me_test1obw_sdk.api.services.async.where.VehiclesForAgencyServiceAsyncImpl
import com.configure_me_test1obw_sdk.api.services.errorHandler

class WhereServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : WhereServiceAsync {

    private val errorHandler: Handler<Test1obwSdkError> = errorHandler(clientOptions.jsonMapper)

    private val arrivalAndDepartureForStop: ArrivalAndDepartureForStopServiceAsync by lazy {
        ArrivalAndDepartureForStopServiceAsyncImpl(clientOptions)
    }

    private val vehiclesForAgency: VehiclesForAgencyServiceAsync by lazy {
        VehiclesForAgencyServiceAsyncImpl(clientOptions)
    }

    private val arrivalsAndDeparturesForStop: ArrivalsAndDeparturesForStopServiceAsync by lazy {
        ArrivalsAndDeparturesForStopServiceAsyncImpl(clientOptions)
    }

    private val trip: TripServiceAsync by lazy { TripServiceAsyncImpl(clientOptions) }

    private val tripsForRoute: TripsForRouteServiceAsync by lazy {
        TripsForRouteServiceAsyncImpl(clientOptions)
    }

    private val tripsForLocation: TripsForLocationServiceAsync by lazy {
        TripsForLocationServiceAsyncImpl(clientOptions)
    }

    private val tripDetails: TripDetailServiceAsync by lazy {
        TripDetailServiceAsyncImpl(clientOptions)
    }

    private val tripForVehicle: TripForVehicleServiceAsync by lazy {
        TripForVehicleServiceAsyncImpl(clientOptions)
    }

    private val stopsForRoute: StopsForRouteServiceAsync by lazy {
        StopsForRouteServiceAsyncImpl(clientOptions)
    }

    private val stop: StopServiceAsync by lazy { StopServiceAsyncImpl(clientOptions) }

    override fun arrivalAndDepartureForStop(): ArrivalAndDepartureForStopServiceAsync =
        arrivalAndDepartureForStop

    override fun vehiclesForAgency(): VehiclesForAgencyServiceAsync = vehiclesForAgency

    override fun arrivalsAndDeparturesForStop(): ArrivalsAndDeparturesForStopServiceAsync =
        arrivalsAndDeparturesForStop

    override fun trip(): TripServiceAsync = trip

    override fun tripsForRoute(): TripsForRouteServiceAsync = tripsForRoute

    override fun tripsForLocation(): TripsForLocationServiceAsync = tripsForLocation

    override fun tripDetails(): TripDetailServiceAsync = tripDetails

    override fun tripForVehicle(): TripForVehicleServiceAsync = tripForVehicle

    override fun stopsForRoute(): StopsForRouteServiceAsync = stopsForRoute

    override fun stop(): StopServiceAsync = stop
}
