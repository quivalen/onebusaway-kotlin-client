// File generated from our OpenAPI spec by Stainless.

package com.test1obw.api.models

import com.test1obw.api.core.http.QueryParams
import com.test1obw.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SearchForStopListParamsTest {

    @Test
    fun createSearchForStopListParams() {
        SearchForStopListParams.builder().input("input").maxCount(123L).build()
    }

    @Test
    fun getQueryParams() {
        val params = SearchForStopListParams.builder().input("input").maxCount(123L).build()
        val expected = QueryParams.builder()
        expected.put("input", "input")
        expected.put("maxCount", "123")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = SearchForStopListParams.builder().input("input").build()
        val expected = QueryParams.builder()
        expected.put("input", "input")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
