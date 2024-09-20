// File generated from our OpenAPI spec by Stainless.

package com.configure_me_test1obw_sdk.api.models

import com.configure_me_test1obw_sdk.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WhereTripDetailRetrieveParamsTest {

    @Test
    fun createWhereTripDetailRetrieveParams() {
        WhereTripDetailRetrieveParams.builder()
            .tripId("tripID")
            .includeSchedule(true)
            .includeStatus(true)
            .includeTrip(true)
            .serviceDate(123L)
            .time(123L)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            WhereTripDetailRetrieveParams.builder()
                .tripId("tripID")
                .includeSchedule(true)
                .includeStatus(true)
                .includeTrip(true)
                .serviceDate(123L)
                .time(123L)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("includeSchedule", listOf("true"))
        expected.put("includeStatus", listOf("true"))
        expected.put("includeTrip", listOf("true"))
        expected.put("serviceDate", listOf("123"))
        expected.put("time", listOf("123"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = WhereTripDetailRetrieveParams.builder().tripId("tripID").build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params = WhereTripDetailRetrieveParams.builder().tripId("tripID").build()
        assertThat(params).isNotNull
        // path param "tripId"
        assertThat(params.getPathParam(0)).isEqualTo("tripID")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}