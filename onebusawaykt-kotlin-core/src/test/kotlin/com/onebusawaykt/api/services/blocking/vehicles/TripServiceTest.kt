// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.services.blocking.vehicles

import com.onebusawaykt.api.TestServerExtension
import com.onebusawaykt.api.client.okhttp.OnebusawayktOkHttpClient
import com.onebusawaykt.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class TripServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            OnebusawayktOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val tripService = client.vehicles().trip()
        val vehicleTripRetrieveResponse =
            tripService.retrieve(
                VehicleTripRetrieveParams.builder()
                    .vehicleId("vehicleID")
                    .includeSchedule(true)
                    .includeStatus(true)
                    .includeTrip(true)
                    .time(123L)
                    .build()
            )
        println(vehicleTripRetrieveResponse)
        vehicleTripRetrieveResponse.validate()
    }
}
