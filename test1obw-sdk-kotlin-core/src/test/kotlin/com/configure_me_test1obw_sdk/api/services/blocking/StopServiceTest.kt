// File generated from our OpenAPI spec by Stainless.

package com.configure_me_test1obw_sdk.api.services.blocking

import com.configure_me_test1obw_sdk.api.TestServerExtension
import com.configure_me_test1obw_sdk.api.client.okhttp.Test1obwSdkOkHttpClient
import com.configure_me_test1obw_sdk.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class StopServiceTest {

    @Test
    fun callReportProblem() {
        val client = Test1obwSdkOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val stopService = client.stops()
        val responseWrapper =
            stopService.reportProblem(
                StopReportProblemParams.builder()
                    .stopId("stopID")
                    .code(StopReportProblemParams.Code.STOP_NAME_WRONG)
                    .userComment("userComment")
                    .userLat(42.23)
                    .userLocationAccuracy(42.23)
                    .userLon(42.23)
                    .build()
            )
        println(responseWrapper)
        responseWrapper.validate()
    }

    @Test
    fun callSearch() {
        val client = Test1obwSdkOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val stopService = client.stops()
        val stopSearchResponse =
            stopService.search(StopSearchParams.builder().input("input").maxCount(123L).build())
        println(stopSearchResponse)
    }
}
