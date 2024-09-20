// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.services.blocking.stops

import com.onebusawaykt.api.TestServerExtension
import com.onebusawaykt.api.client.okhttp.OnebusawayktOkHttpClient
import com.onebusawaykt.api.models.*
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ArrivalsAndDepartureServiceTest {

    @Test
    fun callList() {
        val client =
            OnebusawayktOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val arrivalsAndDepartureService = client.stops().arrivalsAndDepartures()
        val stopArrivalsAndDepartureListResponse =
            arrivalsAndDepartureService.list(
                StopArrivalsAndDepartureListParams.builder()
                    .stopId("stopID")
                    .minutesAfter(123L)
                    .minutesBefore(123L)
                    .time(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        println(stopArrivalsAndDepartureListResponse)
        stopArrivalsAndDepartureListResponse.validate()
    }
}
