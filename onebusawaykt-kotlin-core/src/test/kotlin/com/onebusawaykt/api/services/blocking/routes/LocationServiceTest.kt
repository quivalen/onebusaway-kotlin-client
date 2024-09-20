// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.services.blocking.routes

import com.onebusawaykt.api.TestServerExtension
import com.onebusawaykt.api.client.okhttp.OnebusawayktOkHttpClient
import com.onebusawaykt.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class LocationServiceTest {

    @Test
    fun callList() {
        val client =
            OnebusawayktOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val locationService = client.routes().location()
        val routeLocationListResponse =
            locationService.list(
                RouteLocationListParams.builder()
                    .lat(42.23)
                    .lon(42.23)
                    .latSpan(42.23)
                    .lonSpan(42.23)
                    .query("query")
                    .radius(42.23)
                    .build()
            )
        println(routeLocationListResponse)
        routeLocationListResponse.validate()
    }
}
