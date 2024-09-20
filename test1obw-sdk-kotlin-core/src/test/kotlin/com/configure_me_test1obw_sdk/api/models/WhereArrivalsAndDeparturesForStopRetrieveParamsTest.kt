// File generated from our OpenAPI spec by Stainless.

package com.configure_me_test1obw_sdk.api.models

import com.configure_me_test1obw_sdk.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WhereArrivalsAndDeparturesForStopRetrieveParamsTest {

    @Test
    fun createWhereArrivalsAndDeparturesForStopRetrieveParams() {
        WhereArrivalsAndDeparturesForStopRetrieveParams.builder()
            .stopId("stopID")
            .minutesAfter(123L)
            .minutesBefore(123L)
            .time(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            WhereArrivalsAndDeparturesForStopRetrieveParams.builder()
                .stopId("stopID")
                .minutesAfter(123L)
                .minutesBefore(123L)
                .time(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("minutesAfter", listOf("123"))
        expected.put("minutesBefore", listOf("123"))
        expected.put("time", listOf("2019-12-27T18:11:19.117Z"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            WhereArrivalsAndDeparturesForStopRetrieveParams.builder().stopId("stopID").build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params =
            WhereArrivalsAndDeparturesForStopRetrieveParams.builder().stopId("stopID").build()
        assertThat(params).isNotNull
        // path param "stopId"
        assertThat(params.getPathParam(0)).isEqualTo("stopID")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
