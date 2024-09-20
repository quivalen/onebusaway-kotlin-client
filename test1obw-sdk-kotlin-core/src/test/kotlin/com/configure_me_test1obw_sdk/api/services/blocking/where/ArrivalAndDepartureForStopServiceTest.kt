// File generated from our OpenAPI spec by Stainless.

package com.configure_me_test1obw_sdk.api.services.blocking.where

import com.configure_me_test1obw_sdk.api.TestServerExtension
import com.configure_me_test1obw_sdk.api.client.okhttp.Test1obwSdkOkHttpClient
import com.configure_me_test1obw_sdk.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ArrivalAndDepartureForStopServiceTest {

    @Test
    fun callRetrieve() {
        val client = Test1obwSdkOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val arrivalAndDepartureForStopService = client.where().arrivalAndDepartureForStop()
        val whereArrivalAndDepartureForStopRetrieveResponse =
            arrivalAndDepartureForStopService.retrieve(
                WhereArrivalAndDepartureForStopRetrieveParams.builder()
                    .stopId("stopID")
                    .serviceDate(123L)
                    .tripId("tripId")
                    .stopSequence(123L)
                    .time(123L)
                    .vehicleId("vehicleId")
                    .build()
            )
        println(whereArrivalAndDepartureForStopRetrieveResponse)
    }
}
