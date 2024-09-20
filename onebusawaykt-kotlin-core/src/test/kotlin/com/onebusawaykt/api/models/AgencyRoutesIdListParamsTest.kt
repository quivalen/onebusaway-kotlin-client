// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.models

import com.onebusawaykt.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AgencyRoutesIdListParamsTest {

    @Test
    fun createAgencyRoutesIdListParams() {
        AgencyRoutesIdListParams.builder().agencyId("agencyID").build()
    }

    @Test
    fun getPathParam() {
        val params = AgencyRoutesIdListParams.builder().agencyId("agencyID").build()
        assertThat(params).isNotNull
        // path param "agencyId"
        assertThat(params.getPathParam(0)).isEqualTo("agencyID")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
