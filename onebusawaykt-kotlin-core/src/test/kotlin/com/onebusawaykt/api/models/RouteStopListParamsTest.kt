// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.models

import com.onebusawaykt.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RouteStopListParamsTest {

    @Test
    fun createRouteStopListParams() {
        RouteStopListParams.builder().routeId("routeID").includePolylines(true).time("time").build()
    }

    @Test
    fun getQueryParams() {
        val params =
            RouteStopListParams.builder()
                .routeId("routeID")
                .includePolylines(true)
                .time("time")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("includePolylines", listOf("true"))
        expected.put("time", listOf("time"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = RouteStopListParams.builder().routeId("routeID").build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params = RouteStopListParams.builder().routeId("routeID").build()
        assertThat(params).isNotNull
        // path param "routeId"
        assertThat(params.getPathParam(0)).isEqualTo("routeID")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}