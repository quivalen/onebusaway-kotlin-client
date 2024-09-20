// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.services.blocking.agencies

import com.onebusawaykt.api.TestServerExtension
import com.onebusawaykt.api.client.okhttp.OnebusawayktOkHttpClient
import com.onebusawaykt.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class VehicleServiceTest {

    @Test
    fun callList() {
        val client =
            OnebusawayktOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val vehicleService = client.agencies().vehicles()
        val agencyVehicleListResponse =
            vehicleService.list(
                AgencyVehicleListParams.builder().agencyId("agencyID").time("time").build()
            )
        println(agencyVehicleListResponse)
        agencyVehicleListResponse.validate()
    }
}
