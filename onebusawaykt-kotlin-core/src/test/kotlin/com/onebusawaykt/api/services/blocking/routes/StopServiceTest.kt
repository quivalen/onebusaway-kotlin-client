// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.services.blocking.routes

import com.onebusawaykt.api.TestServerExtension
import com.onebusawaykt.api.client.okhttp.OnebusawayktOkHttpClient
import com.onebusawaykt.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class StopServiceTest {

    @Test
    fun callList() {
        val client =
            OnebusawayktOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val stopService = client.routes().stops()
        val routeStopListResponse =
            stopService.list(
                RouteStopListParams.builder()
                    .routeId("routeID")
                    .includePolylines(true)
                    .time("time")
                    .build()
            )
        println(routeStopListResponse)
        routeStopListResponse.validate()
    }
}
