// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.services.blocking

import com.onebusawaykt.api.TestServerExtension
import com.onebusawaykt.api.client.okhttp.OnebusawayktOkHttpClient
import com.onebusawaykt.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CurrentTimeServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            OnebusawayktOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val currentTimeService = client.currentTime()
        val currentTimeRetrieveResponse =
            currentTimeService.retrieve(CurrentTimeRetrieveParams.builder().build())
        println(currentTimeRetrieveResponse)
        currentTimeRetrieveResponse.validate()
    }
}
