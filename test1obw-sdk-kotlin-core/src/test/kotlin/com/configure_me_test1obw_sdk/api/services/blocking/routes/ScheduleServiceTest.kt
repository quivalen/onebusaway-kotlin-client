// File generated from our OpenAPI spec by Stainless.

package com.configure_me_test1obw_sdk.api.services.blocking.routes

import com.configure_me_test1obw_sdk.api.TestServerExtension
import com.configure_me_test1obw_sdk.api.client.okhttp.Test1obwSdkOkHttpClient
import com.configure_me_test1obw_sdk.api.models.*
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ScheduleServiceTest {

    @Test
    fun callRetrieve() {
        val client = Test1obwSdkOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val scheduleService = client.routes().schedule()
        val routeScheduleRetrieveResponse =
            scheduleService.retrieve(
                RouteScheduleRetrieveParams.builder()
                    .routeId("routeID")
                    .date(LocalDate.parse("2019-12-27"))
                    .build()
            )
        println(routeScheduleRetrieveResponse)
    }
}
