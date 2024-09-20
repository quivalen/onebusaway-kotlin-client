// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.services.blocking.trips

import com.onebusawaykt.api.TestServerExtension
import com.onebusawaykt.api.client.okhttp.OnebusawayktOkHttpClient
import com.onebusawaykt.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DetailServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            OnebusawayktOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val detailService = client.trips().details()
        val tripDetailRetrieveResponse =
            detailService.retrieve(
                TripDetailRetrieveParams.builder()
                    .tripId("tripID")
                    .includeSchedule(true)
                    .includeStatus(true)
                    .includeTrip(true)
                    .serviceDate(123L)
                    .time(123L)
                    .build()
            )
        println(tripDetailRetrieveResponse)
        tripDetailRetrieveResponse.validate()
    }
}
