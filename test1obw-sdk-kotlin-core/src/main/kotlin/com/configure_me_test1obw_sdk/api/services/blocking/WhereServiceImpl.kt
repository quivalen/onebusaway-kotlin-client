// File generated from our OpenAPI spec by Stainless.

package com.configure_me_test1obw_sdk.api.services.blocking

import com.configure_me_test1obw_sdk.api.core.ClientOptions
import com.configure_me_test1obw_sdk.api.core.http.HttpResponse.Handler
import com.configure_me_test1obw_sdk.api.errors.Test1obwSdkError
import com.configure_me_test1obw_sdk.api.services.blocking.where.ArrivalAndDepartureForStopService
import com.configure_me_test1obw_sdk.api.services.blocking.where.ArrivalAndDepartureForStopServiceImpl
import com.configure_me_test1obw_sdk.api.services.blocking.where.ArrivalsAndDeparturesForStopService
import com.configure_me_test1obw_sdk.api.services.blocking.where.ArrivalsAndDeparturesForStopServiceImpl
import com.configure_me_test1obw_sdk.api.services.blocking.where.StopService
import com.configure_me_test1obw_sdk.api.services.blocking.where.StopServiceImpl
import com.configure_me_test1obw_sdk.api.services.blocking.where.StopsForRouteService
import com.configure_me_test1obw_sdk.api.services.blocking.where.StopsForRouteServiceImpl
import com.configure_me_test1obw_sdk.api.services.blocking.where.TripDetailService
import com.configure_me_test1obw_sdk.api.services.blocking.where.TripDetailServiceImpl
import com.configure_me_test1obw_sdk.api.services.blocking.where.TripForVehicleService
import com.configure_me_test1obw_sdk.api.services.blocking.where.TripForVehicleServiceImpl
import com.configure_me_test1obw_sdk.api.services.blocking.where.TripService
import com.configure_me_test1obw_sdk.api.services.blocking.where.TripServiceImpl
import com.configure_me_test1obw_sdk.api.services.blocking.where.TripsForLocationService
import com.configure_me_test1obw_sdk.api.services.blocking.where.TripsForLocationServiceImpl
import com.configure_me_test1obw_sdk.api.services.blocking.where.TripsForRouteService
import com.configure_me_test1obw_sdk.api.services.blocking.where.TripsForRouteServiceImpl
import com.configure_me_test1obw_sdk.api.services.blocking.where.VehiclesForAgencyService
import com.configure_me_test1obw_sdk.api.services.blocking.where.VehiclesForAgencyServiceImpl
import com.configure_me_test1obw_sdk.api.services.errorHandler

class WhereServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : WhereService {

    private val errorHandler: Handler<Test1obwSdkError> = errorHandler(clientOptions.jsonMapper)

    private val arrivalAndDepartureForStop: ArrivalAndDepartureForStopService by lazy {
        ArrivalAndDepartureForStopServiceImpl(clientOptions)
    }

    private val vehiclesForAgency: VehiclesForAgencyService by lazy {
        VehiclesForAgencyServiceImpl(clientOptions)
    }

    private val arrivalsAndDeparturesForStop: ArrivalsAndDeparturesForStopService by lazy {
        ArrivalsAndDeparturesForStopServiceImpl(clientOptions)
    }

    private val trip: TripService by lazy { TripServiceImpl(clientOptions) }

    private val tripsForRoute: TripsForRouteService by lazy {
        TripsForRouteServiceImpl(clientOptions)
    }

    private val tripsForLocation: TripsForLocationService by lazy {
        TripsForLocationServiceImpl(clientOptions)
    }

    private val tripDetails: TripDetailService by lazy { TripDetailServiceImpl(clientOptions) }

    private val tripForVehicle: TripForVehicleService by lazy {
        TripForVehicleServiceImpl(clientOptions)
    }

    private val stopsForRoute: StopsForRouteService by lazy {
        StopsForRouteServiceImpl(clientOptions)
    }

    private val stop: StopService by lazy { StopServiceImpl(clientOptions) }

    override fun arrivalAndDepartureForStop(): ArrivalAndDepartureForStopService =
        arrivalAndDepartureForStop

    override fun vehiclesForAgency(): VehiclesForAgencyService = vehiclesForAgency

    override fun arrivalsAndDeparturesForStop(): ArrivalsAndDeparturesForStopService =
        arrivalsAndDeparturesForStop

    override fun trip(): TripService = trip

    override fun tripsForRoute(): TripsForRouteService = tripsForRoute

    override fun tripsForLocation(): TripsForLocationService = tripsForLocation

    override fun tripDetails(): TripDetailService = tripDetails

    override fun tripForVehicle(): TripForVehicleService = tripForVehicle

    override fun stopsForRoute(): StopsForRouteService = stopsForRoute

    override fun stop(): StopService = stop
}
