// File generated from our OpenAPI spec by Stainless.

package com.configure_me_test1obw_sdk.api.models

import com.configure_me_test1obw_sdk.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class StopSearchParamsTest {

    @Test
    fun createStopSearchParams() {
        StopSearchParams.builder().input("input").maxCount(123L).build()
    }

    @Test
    fun getQueryParams() {
        val params = StopSearchParams.builder().input("input").maxCount(123L).build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("input", listOf("input"))
        expected.put("maxCount", listOf("123"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = StopSearchParams.builder().input("input").build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("input", listOf("input"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
