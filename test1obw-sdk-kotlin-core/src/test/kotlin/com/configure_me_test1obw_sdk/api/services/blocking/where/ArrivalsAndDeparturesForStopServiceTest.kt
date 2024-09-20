// File generated from our OpenAPI spec by Stainless.

package com.configure_me_test1obw_sdk.api.services.blocking.where

import com.configure_me_test1obw_sdk.api.TestServerExtension
import com.configure_me_test1obw_sdk.api.client.okhttp.Test1obwSdkOkHttpClient
import com.configure_me_test1obw_sdk.api.models.*
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ArrivalsAndDeparturesForStopServiceTest {

    @Test
    fun callRetrieve() {
        val client = Test1obwSdkOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val arrivalsAndDeparturesForStopService = client.where().arrivalsAndDeparturesForStop()
        val whereArrivalsAndDeparturesForStopRetrieveResponse =
            arrivalsAndDeparturesForStopService.retrieve(
                WhereArrivalsAndDeparturesForStopRetrieveParams.builder()
                    .stopId("stopID")
                    .minutesAfter(123L)
                    .minutesBefore(123L)
                    .time(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        println(whereArrivalsAndDeparturesForStopRetrieveResponse)
    }
}
