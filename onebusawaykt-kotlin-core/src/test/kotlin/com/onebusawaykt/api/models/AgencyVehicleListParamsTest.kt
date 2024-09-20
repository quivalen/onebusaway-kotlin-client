// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.models

import com.onebusawaykt.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AgencyVehicleListParamsTest {

    @Test
    fun createAgencyVehicleListParams() {
        AgencyVehicleListParams.builder().agencyId("agencyID").time("time").build()
    }

    @Test
    fun getQueryParams() {
        val params = AgencyVehicleListParams.builder().agencyId("agencyID").time("time").build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("time", listOf("time"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = AgencyVehicleListParams.builder().agencyId("agencyID").build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params = AgencyVehicleListParams.builder().agencyId("agencyID").build()
        assertThat(params).isNotNull
        // path param "agencyId"
        assertThat(params.getPathParam(0)).isEqualTo("agencyID")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
