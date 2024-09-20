// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.onebusawaykt.api.services.async

import com.onebusawaykt.api.services.async.vehicles.TripServiceAsync

interface VehicleServiceAsync {

    fun trip(): TripServiceAsync
}
