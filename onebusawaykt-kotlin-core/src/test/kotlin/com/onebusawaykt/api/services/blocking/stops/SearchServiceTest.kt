// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.services.blocking.stops

import com.onebusawaykt.api.TestServerExtension
import com.onebusawaykt.api.client.okhttp.OnebusawayktOkHttpClient
import com.onebusawaykt.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class SearchServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            OnebusawayktOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val searchService = client.stops().search()
        val stopSearchRetrieveResponse =
            searchService.retrieve(
                StopSearchRetrieveParams.builder().input("input").maxCount(123L).build()
            )
        println(stopSearchRetrieveResponse)
        stopSearchRetrieveResponse.validate()
    }
}
