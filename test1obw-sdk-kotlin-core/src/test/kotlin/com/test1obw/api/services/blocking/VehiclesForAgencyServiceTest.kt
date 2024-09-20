// File generated from our OpenAPI spec by Stainless.

package com.test1obw.api.services.blocking

import com.test1obw.api.TestServerExtension
import com.test1obw.api.client.okhttp.Test1obwSdkOkHttpClient
import com.test1obw.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class VehiclesForAgencyServiceTest {

    @Test
    fun callList() {
        val client =
            Test1obwSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val vehiclesForAgencyService = client.vehiclesForAgency()
        val vehiclesForAgencyListResponse =
            vehiclesForAgencyService.list(
                VehiclesForAgencyListParams.builder().agencyId("agencyID").time("time").build()
            )
        println(vehiclesForAgencyListResponse)
    }
}
