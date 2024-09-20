// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.services.blocking

import com.onebusawaykt.api.TestServerExtension
import com.onebusawaykt.api.client.okhttp.OnebusawayktOkHttpClient
import com.onebusawaykt.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class TripsForLocationServiceTest {

    @Test
    fun callList() {
        val client =
            OnebusawayktOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val tripsForLocationService = client.tripsForLocation()
        val tripsForLocationListResponse =
            tripsForLocationService.list(
                TripsForLocationListParams.builder()
                    .lat(42.23)
                    .latSpan(42.23)
                    .lon(42.23)
                    .lonSpan(42.23)
                    .includeSchedule(true)
                    .includeTrip(true)
                    .time(123L)
                    .build()
            )
        println(tripsForLocationListResponse)
        tripsForLocationListResponse.validate()
    }
}
