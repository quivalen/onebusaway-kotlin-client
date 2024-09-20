// File generated from our OpenAPI spec by Stainless.

package com.configure_me_test1obw_sdk.api.services.blocking

import com.configure_me_test1obw_sdk.api.TestServerExtension
import com.configure_me_test1obw_sdk.api.client.okhttp.Test1obwSdkOkHttpClient
import com.configure_me_test1obw_sdk.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class RoutesForLocationServiceTest {

    @Test
    fun callList() {
        val client = Test1obwSdkOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val routesForLocationService = client.routesForLocation()
        val routesForLocationListResponse =
            routesForLocationService.list(
                RoutesForLocationListParams.builder()
                    .lat(42.23)
                    .lon(42.23)
                    .latSpan(42.23)
                    .lonSpan(42.23)
                    .query("query")
                    .radius(42.23)
                    .build()
            )
        println(routesForLocationListResponse)
    }
}
