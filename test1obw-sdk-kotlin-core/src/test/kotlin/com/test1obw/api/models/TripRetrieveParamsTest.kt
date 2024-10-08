// File generated from our OpenAPI spec by Stainless.

package com.test1obw.api.models

import com.test1obw.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TripRetrieveParamsTest {

    @Test
    fun createTripRetrieveParams() {
        TripRetrieveParams.builder().tripId("tripID").build()
    }

    @Test
    fun getPathParam() {
        val params = TripRetrieveParams.builder().tripId("tripID").build()
        assertThat(params).isNotNull
        // path param "tripId"
        assertThat(params.getPathParam(0)).isEqualTo("tripID")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
