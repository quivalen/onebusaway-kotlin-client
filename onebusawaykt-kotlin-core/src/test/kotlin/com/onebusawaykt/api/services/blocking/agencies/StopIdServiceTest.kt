// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.services.blocking.agencies

import com.onebusawaykt.api.TestServerExtension
import com.onebusawaykt.api.client.okhttp.OnebusawayktOkHttpClient
import com.onebusawaykt.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class StopIdServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            OnebusawayktOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val stopIdService = client.agencies().stopIds()
        val agencyStopIdRetrieveResponse =
            stopIdService.retrieve(
                AgencyStopIdRetrieveParams.builder().agencyId("agencyID").build()
            )
        println(agencyStopIdRetrieveResponse)
        agencyStopIdRetrieveResponse.validate()
    }
}
