// File generated from our OpenAPI spec by Stainless.

package com.configure_me_test1obw_sdk.api.services.blocking.where

import com.configure_me_test1obw_sdk.api.TestServerExtension
import com.configure_me_test1obw_sdk.api.client.okhttp.Test1obwSdkOkHttpClient
import com.configure_me_test1obw_sdk.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class TripServiceTest {

    @Test
    fun callRetrieve() {
        val client = Test1obwSdkOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val tripService = client.where().trip()
        val whereTripRetrieveResponse =
            tripService.retrieve(WhereTripRetrieveParams.builder().tripId("tripID").build())
        println(whereTripRetrieveResponse)
    }
}
