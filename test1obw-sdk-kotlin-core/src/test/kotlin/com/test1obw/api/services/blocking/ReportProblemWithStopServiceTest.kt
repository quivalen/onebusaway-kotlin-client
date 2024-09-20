// File generated from our OpenAPI spec by Stainless.

package com.test1obw.api.services.blocking

import com.test1obw.api.TestServerExtension
import com.test1obw.api.client.okhttp.Test1obwSdkOkHttpClient
import com.test1obw.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ReportProblemWithStopServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            Test1obwSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val reportProblemWithStopService = client.reportProblemWithStop()
        val responseWrapper =
            reportProblemWithStopService.retrieve(
                ReportProblemWithStopRetrieveParams.builder()
                    .stopId("stopID")
                    .code(ReportProblemWithStopRetrieveParams.Code.STOP_NAME_WRONG)
                    .userComment("userComment")
                    .userLat(42.23)
                    .userLocationAccuracy(42.23)
                    .userLon(42.23)
                    .build()
            )
        println(responseWrapper)
        responseWrapper.validate()
    }
}
