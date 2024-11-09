// File generated from our OpenAPI spec by Stainless.

package com.test1obw.api.models

import com.test1obw.api.core.http.QueryParams
import com.test1obw.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TripsForLocationListParamsTest {

    @Test
    fun createTripsForLocationListParams() {
        TripsForLocationListParams.builder()
            .lat(42.23)
            .latSpan(42.23)
            .lon(42.23)
            .lonSpan(42.23)
            .includeSchedule(true)
            .includeTrip(true)
            .time(123L)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            TripsForLocationListParams.builder()
                .lat(42.23)
                .latSpan(42.23)
                .lon(42.23)
                .lonSpan(42.23)
                .includeSchedule(true)
                .includeTrip(true)
                .time(123L)
                .build()
        val expected = QueryParams.builder()
        expected.put("lat", "42.23")
        expected.put("latSpan", "42.23")
        expected.put("lon", "42.23")
        expected.put("lonSpan", "42.23")
        expected.put("includeSchedule", "true")
        expected.put("includeTrip", "true")
        expected.put("time", "123")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            TripsForLocationListParams.builder()
                .lat(42.23)
                .latSpan(42.23)
                .lon(42.23)
                .lonSpan(42.23)
                .build()
        val expected = QueryParams.builder()
        expected.put("lat", "42.23")
        expected.put("latSpan", "42.23")
        expected.put("lon", "42.23")
        expected.put("lonSpan", "42.23")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
