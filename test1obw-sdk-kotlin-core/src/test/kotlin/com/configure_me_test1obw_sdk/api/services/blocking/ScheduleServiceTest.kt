// File generated from our OpenAPI spec by Stainless.

package com.configure_me_test1obw_sdk.api.services.blocking

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
        val scheduleService = client.schedules()
        val scheduleRetrieveResponse =
            scheduleService.retrieve(
                ScheduleRetrieveParams.builder()
                    .stopId("stopID")
                    .date(LocalDate.parse("2019-12-27"))
                    .build()
            )
        println(scheduleRetrieveResponse)
    }
}
