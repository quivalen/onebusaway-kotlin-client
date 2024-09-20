// File generated from our OpenAPI spec by Stainless.

package com.configure_me_test1obw_sdk.api.services.blocking.where

import com.configure_me_test1obw_sdk.api.TestServerExtension
import com.configure_me_test1obw_sdk.api.client.okhttp.Test1obwSdkOkHttpClient
import com.configure_me_test1obw_sdk.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class TripDetailServiceTest {

    @Test
    fun callRetrieve() {
        val client = Test1obwSdkOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val tripDetailService = client.where().tripDetails()
        val whereTripDetailRetrieveResponse =
            tripDetailService.retrieve(
                WhereTripDetailRetrieveParams.builder()
                    .tripId("tripID")
                    .includeSchedule(true)
                    .includeStatus(true)
                    .includeTrip(true)
                    .serviceDate(123L)
                    .time(123L)
                    .build()
            )
        println(whereTripDetailRetrieveResponse)
    }
}
