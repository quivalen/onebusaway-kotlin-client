// File generated from our OpenAPI spec by Stainless.

package com.configure_me_test1obw_sdk.api.models

import com.configure_me_test1obw_sdk.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AgencyRetrieveParamsTest {

    @Test
    fun createAgencyRetrieveParams() {
        AgencyRetrieveParams.builder().agencyId("agencyID").build()
    }

    @Test
    fun getPathParam() {
        val params = AgencyRetrieveParams.builder().agencyId("agencyID").build()
        assertThat(params).isNotNull
        // path param "agencyId"
        assertThat(params.getPathParam(0)).isEqualTo("agencyID")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
