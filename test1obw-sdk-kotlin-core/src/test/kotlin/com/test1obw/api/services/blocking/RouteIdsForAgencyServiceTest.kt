// File generated from our OpenAPI spec by Stainless.

package com.test1obw.api.services.blocking

import com.test1obw.api.TestServerExtension
import com.test1obw.api.client.okhttp.Test1obwSdkOkHttpClient
import com.test1obw.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class RouteIdsForAgencyServiceTest {

    @Test
    fun callList() {
        val client =
            Test1obwSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val routeIdsForAgencyService = client.routeIdsForAgency()
        val routeIdsForAgencyListResponse =
            routeIdsForAgencyService.list(
                RouteIdsForAgencyListParams.builder().agencyId("agencyID").build()
            )
        println(routeIdsForAgencyListResponse)
    }
}