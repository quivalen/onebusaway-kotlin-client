// File generated from our OpenAPI spec by Stainless.

package com.configure_me_test1obw_sdk.api.services.blocking

import com.configure_me_test1obw_sdk.api.TestServerExtension
import com.configure_me_test1obw_sdk.api.client.okhttp.Test1obwSdkOkHttpClient
import com.configure_me_test1obw_sdk.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class RouteServiceTest {

    @Test
    fun callRetrieve() {
        val client = Test1obwSdkOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val routeService = client.routes()
        val routeRetrieveResponse =
            routeService.retrieve(RouteRetrieveParams.builder().routeId("routeID").build())
        println(routeRetrieveResponse)
    }

    @Test
    fun callSearch() {
        val client = Test1obwSdkOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val routeService = client.routes()
        val routeSearchResponse =
            routeService.search(RouteSearchParams.builder().input("input").maxCount(123L).build())
        println(routeSearchResponse)
    }
}
