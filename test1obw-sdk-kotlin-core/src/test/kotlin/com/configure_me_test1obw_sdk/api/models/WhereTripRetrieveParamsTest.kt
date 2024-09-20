// File generated from our OpenAPI spec by Stainless.

package com.configure_me_test1obw_sdk.api.models

import com.configure_me_test1obw_sdk.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WhereTripRetrieveParamsTest {

    @Test
    fun createWhereTripRetrieveParams() {
        WhereTripRetrieveParams.builder().tripId("tripID").build()
    }

    @Test
    fun getPathParam() {
        val params = WhereTripRetrieveParams.builder().tripId("tripID").build()
        assertThat(params).isNotNull
        // path param "tripId"
        assertThat(params.getPathParam(0)).isEqualTo("tripID")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
