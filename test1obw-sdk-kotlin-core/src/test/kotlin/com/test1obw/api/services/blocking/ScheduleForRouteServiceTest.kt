// File generated from our OpenAPI spec by Stainless.

package com.test1obw.api.services.blocking

import com.test1obw.api.TestServerExtension
import com.test1obw.api.client.okhttp.Test1obwSdkOkHttpClient
import com.test1obw.api.models.*
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ScheduleForRouteServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            Test1obwSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val scheduleForRouteService = client.scheduleForRoute()
        val scheduleForRouteRetrieveResponse =
            scheduleForRouteService.retrieve(
                ScheduleForRouteRetrieveParams.builder()
                    .routeId("routeID")
                    .date(LocalDate.parse("2019-12-27"))
                    .build()
            )
        println(scheduleForRouteRetrieveResponse)
    }
}
