// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.onebusawaykt.api.client

import com.onebusawaykt.api.models.*
import com.onebusawaykt.api.services.blocking.*

interface OnebusawayktClient {

    fun async(): OnebusawayktClientAsync

    fun agencies(): AgencyService

    fun routes(): RouteService

    fun config(): ConfigService

    fun currentTime(): CurrentTimeService

    fun stops(): StopService

    fun trips(): TripService

    fun tripsForLocation(): TripsForLocationService

    fun vehicles(): VehicleService

    fun blocks(): BlockService

    fun shapes(): ShapeService
}
