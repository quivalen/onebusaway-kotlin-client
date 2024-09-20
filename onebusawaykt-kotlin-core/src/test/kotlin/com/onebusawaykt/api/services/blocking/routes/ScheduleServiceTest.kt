// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.services.blocking.routes

import com.onebusawaykt.api.TestServerExtension
import com.onebusawaykt.api.client.okhttp.OnebusawayktOkHttpClient
import com.onebusawaykt.api.models.*
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ScheduleServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            OnebusawayktOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val scheduleService = client.routes().schedule()
        val routeScheduleRetrieveResponse =
            scheduleService.retrieve(
                RouteScheduleRetrieveParams.builder()
                    .routeId("routeID")
                    .date(LocalDate.parse("2019-12-27"))
                    .build()
            )
        println(routeScheduleRetrieveResponse)
        routeScheduleRetrieveResponse.validate()
    }
}
