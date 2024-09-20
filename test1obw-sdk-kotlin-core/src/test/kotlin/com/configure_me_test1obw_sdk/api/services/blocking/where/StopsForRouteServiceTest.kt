// File generated from our OpenAPI spec by Stainless.

package com.configure_me_test1obw_sdk.api.services.blocking.where

import com.configure_me_test1obw_sdk.api.TestServerExtension
import com.configure_me_test1obw_sdk.api.client.okhttp.Test1obwSdkOkHttpClient
import com.configure_me_test1obw_sdk.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class StopsForRouteServiceTest {

    @Test
    fun callList() {
        val client = Test1obwSdkOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val stopsForRouteService = client.where().stopsForRoute()
        val whereStopsForRouteListResponse =
            stopsForRouteService.list(
                WhereStopsForRouteListParams.builder()
                    .routeId("routeID")
                    .includePolylines(true)
                    .time("time")
                    .build()
            )
        println(whereStopsForRouteListResponse)
    }
}
