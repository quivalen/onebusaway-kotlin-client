// File generated from our OpenAPI spec by Stainless.

package com.test1obw.api.services.blocking

import com.test1obw.api.TestServerExtension
import com.test1obw.api.client.okhttp.Test1obwSdkOkHttpClient
import com.test1obw.api.models.*
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ArrivalAndDepartureServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            Test1obwSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val arrivalAndDepartureService = client.arrivalAndDeparture()
        val arrivalAndDepartureRetrieveResponse =
            arrivalAndDepartureService.retrieve(
                ArrivalAndDepartureRetrieveParams.builder()
                    .stopId("stopID")
                    .serviceDate(0L)
                    .tripId("tripId")
                    .stopSequence(0L)
                    .time(0L)
                    .vehicleId("vehicleId")
                    .build()
            )
        println(arrivalAndDepartureRetrieveResponse)
    }

    @Test
    fun callList() {
        val client =
            Test1obwSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val arrivalAndDepartureService = client.arrivalAndDeparture()
        val arrivalAndDepartureListResponse =
            arrivalAndDepartureService.list(
                ArrivalAndDepartureListParams.builder()
                    .stopId("stopID")
                    .minutesAfter(0L)
                    .minutesBefore(0L)
                    .time(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        println(arrivalAndDepartureListResponse)
    }
}
