// File generated from our OpenAPI spec by Stainless.

package com.configure_me_test1obw_sdk.api.models

import com.configure_me_test1obw_sdk.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RouteSearchParamsTest {

    @Test
    fun createRouteSearchParams() {
        RouteSearchParams.builder().input("input").maxCount(123L).build()
    }

    @Test
    fun getQueryParams() {
        val params = RouteSearchParams.builder().input("input").maxCount(123L).build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("input", listOf("input"))
        expected.put("maxCount", listOf("123"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = RouteSearchParams.builder().input("input").build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("input", listOf("input"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
