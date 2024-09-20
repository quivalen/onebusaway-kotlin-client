// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.onebusawaykt.api.client

import com.onebusawaykt.api.models.*
import com.onebusawaykt.api.services.async.*

interface OnebusawayktClientAsync {

    fun sync(): OnebusawayktClient

    fun agencies(): AgencyServiceAsync

    fun routes(): RouteServiceAsync

    fun config(): ConfigServiceAsync

    fun currentTime(): CurrentTimeServiceAsync

    fun stops(): StopServiceAsync

    fun trips(): TripServiceAsync

    fun tripsForLocation(): TripsForLocationServiceAsync

    fun vehicles(): VehicleServiceAsync

    fun blocks(): BlockServiceAsync

    fun shapes(): ShapeServiceAsync
}
