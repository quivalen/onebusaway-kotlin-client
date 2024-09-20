// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.services.blocking.agencies

import com.onebusawaykt.api.TestServerExtension
import com.onebusawaykt.api.client.okhttp.OnebusawayktOkHttpClient
import com.onebusawaykt.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class RouteServiceTest {

    @Test
    fun callList() {
        val client =
            OnebusawayktOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val routeService = client.agencies().routes()
        val agencyRouteListResponse =
            routeService.list(AgencyRouteListParams.builder().agencyId("agencyID").build())
        println(agencyRouteListResponse)
        agencyRouteListResponse.validate()
    }
}
