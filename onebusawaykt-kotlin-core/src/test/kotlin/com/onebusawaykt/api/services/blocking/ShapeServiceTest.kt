// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.services.blocking

import com.onebusawaykt.api.TestServerExtension
import com.onebusawaykt.api.client.okhttp.OnebusawayktOkHttpClient
import com.onebusawaykt.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ShapeServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            OnebusawayktOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val shapeService = client.shapes()
        val shapeRetrieveResponse =
            shapeService.retrieve(ShapeRetrieveParams.builder().shapeId("shapeID").build())
        println(shapeRetrieveResponse)
        shapeRetrieveResponse.validate()
    }
}
