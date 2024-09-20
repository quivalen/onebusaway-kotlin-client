// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.services.blocking.stops

import com.onebusawaykt.api.TestServerExtension
import com.onebusawaykt.api.client.okhttp.OnebusawayktOkHttpClient
import com.onebusawaykt.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ArrivalAndDepartureServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            OnebusawayktOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val arrivalAndDepartureService = client.stops().arrivalAndDeparture()
        val stopArrivalAndDepartureRetrieveResponse =
            arrivalAndDepartureService.retrieve(
                StopArrivalAndDepartureRetrieveParams.builder()
                    .stopId("stopID")
                    .serviceDate(123L)
                    .tripId("tripId")
                    .stopSequence(123L)
                    .time(123L)
                    .vehicleId("vehicleId")
                    .build()
            )
        println(stopArrivalAndDepartureRetrieveResponse)
        stopArrivalAndDepartureRetrieveResponse.validate()
    }
}
