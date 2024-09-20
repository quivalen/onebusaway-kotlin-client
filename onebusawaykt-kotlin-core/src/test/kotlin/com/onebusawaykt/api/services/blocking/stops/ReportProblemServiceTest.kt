// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.services.blocking.stops

import com.onebusawaykt.api.TestServerExtension
import com.onebusawaykt.api.client.okhttp.OnebusawayktOkHttpClient
import com.onebusawaykt.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ReportProblemServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            OnebusawayktOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val reportProblemService = client.stops().reportProblem()
        val stopReportProblemRetrieveResponse =
            reportProblemService.retrieve(
                StopReportProblemRetrieveParams.builder()
                    .stopId("stopID")
                    .code(StopReportProblemRetrieveParams.Code.STOP_NAME_WRONG)
                    .userComment("userComment")
                    .userLat(42.23)
                    .userLocationAccuracy(42.23)
                    .userLon(42.23)
                    .build()
            )
        println(stopReportProblemRetrieveResponse)
        stopReportProblemRetrieveResponse.validate()
    }
}
