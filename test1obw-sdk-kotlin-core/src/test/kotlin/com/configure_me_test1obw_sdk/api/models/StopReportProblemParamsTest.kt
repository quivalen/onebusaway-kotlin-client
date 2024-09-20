// File generated from our OpenAPI spec by Stainless.

package com.configure_me_test1obw_sdk.api.models

import com.configure_me_test1obw_sdk.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class StopReportProblemParamsTest {

    @Test
    fun createStopReportProblemParams() {
        StopReportProblemParams.builder()
            .stopId("stopID")
            .code(StopReportProblemParams.Code.STOP_NAME_WRONG)
            .userComment("userComment")
            .userLat(42.23)
            .userLocationAccuracy(42.23)
            .userLon(42.23)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            StopReportProblemParams.builder()
                .stopId("stopID")
                .code(StopReportProblemParams.Code.STOP_NAME_WRONG)
                .userComment("userComment")
                .userLat(42.23)
                .userLocationAccuracy(42.23)
                .userLon(42.23)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("code", listOf(StopReportProblemParams.Code.STOP_NAME_WRONG.toString()))
        expected.put("userComment", listOf("userComment"))
        expected.put("userLat", listOf("42.23"))
        expected.put("userLocationAccuracy", listOf("42.23"))
        expected.put("userLon", listOf("42.23"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = StopReportProblemParams.builder().stopId("stopID").build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params = StopReportProblemParams.builder().stopId("stopID").build()
        assertThat(params).isNotNull
        // path param "stopId"
        assertThat(params.getPathParam(0)).isEqualTo("stopID")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
