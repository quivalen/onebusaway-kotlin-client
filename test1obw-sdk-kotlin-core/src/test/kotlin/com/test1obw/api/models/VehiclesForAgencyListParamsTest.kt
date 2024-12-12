// File generated from our OpenAPI spec by Stainless.

package com.test1obw.api.models

import com.test1obw.api.core.http.QueryParams
import com.test1obw.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class VehiclesForAgencyListParamsTest {

    @Test
    fun createVehiclesForAgencyListParams() {
        VehiclesForAgencyListParams.builder().agencyId("agencyID").time("time").build()
    }

    @Test
    fun getQueryParams() {
        val params = VehiclesForAgencyListParams.builder().agencyId("agencyID").time("time").build()
        val expected = QueryParams.builder()
        expected.put("time", "time")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = VehiclesForAgencyListParams.builder().agencyId("agencyID").build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params = VehiclesForAgencyListParams.builder().agencyId("agencyID").build()
        assertThat(params).isNotNull
        // path param "agencyId"
        assertThat(params.getPathParam(0)).isEqualTo("agencyID")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
