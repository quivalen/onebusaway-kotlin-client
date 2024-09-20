// File generated from our OpenAPI spec by Stainless.

package com.test1obw.api.services.blocking

import com.test1obw.api.TestServerExtension
import com.test1obw.api.client.okhttp.Test1obwSdkOkHttpClient
import com.test1obw.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class TripsForLocationServiceTest {

    @Test
    fun callList() {
        val client =
            Test1obwSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
    }
}
