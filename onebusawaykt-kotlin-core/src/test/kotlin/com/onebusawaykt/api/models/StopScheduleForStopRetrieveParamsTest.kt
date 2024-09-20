// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.models

import com.onebusawaykt.api.models.*
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class StopScheduleForStopRetrieveParamsTest {

    @Test
    fun createStopScheduleForStopRetrieveParams() {
        StopScheduleForStopRetrieveParams.builder()
            .stopId("stopID")
            .date(LocalDate.parse("2019-12-27"))
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            StopScheduleForStopRetrieveParams.builder()
                .stopId("stopID")
                .date(LocalDate.parse("2019-12-27"))
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("date", listOf("2019-12-27"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = StopScheduleForStopRetrieveParams.builder().stopId("stopID").build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params = StopScheduleForStopRetrieveParams.builder().stopId("stopID").build()
        assertThat(params).isNotNull
        // path param "stopId"
        assertThat(params.getPathParam(0)).isEqualTo("stopID")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
