// File generated from our OpenAPI spec by Stainless.

package com.test1obw.api.models

import com.test1obw.api.core.http.QueryParams
import com.test1obw.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SearchForRouteListParamsTest {

    @Test
    fun createSearchForRouteListParams() {
        SearchForRouteListParams.builder().input("input").maxCount(0L).build()
    }

    @Test
    fun getQueryParams() {
        val params = SearchForRouteListParams.builder().input("input").maxCount(0L).build()
        val expected = QueryParams.builder()
        expected.put("input", "input")
        expected.put("maxCount", "0")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = SearchForRouteListParams.builder().input("input").build()
        val expected = QueryParams.builder()
        expected.put("input", "input")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
