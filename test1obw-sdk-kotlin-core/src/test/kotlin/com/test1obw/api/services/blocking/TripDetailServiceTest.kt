// File generated from our OpenAPI spec by Stainless.

package com.test1obw.api.services.blocking

import com.test1obw.api.TestServerExtension
import com.test1obw.api.client.okhttp.Test1obwSdkOkHttpClient
import com.test1obw.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class TripDetailServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            Test1obwSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tripDetailService = client.tripDetails()
        val tripDetailRetrieveResponse =
            tripDetailService.retrieve(
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
    }
}
