// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TripReportProblemRetrieveResponseTest {

    @Test
    fun createTripReportProblemRetrieveResponse() {
        val tripReportProblemRetrieveResponse =
            TripReportProblemRetrieveResponse.builder()
                .code(123L)
                .currentTime(123L)
                .text("text")
                .version(123L)
                .build()
        assertThat(tripReportProblemRetrieveResponse).isNotNull
        assertThat(tripReportProblemRetrieveResponse.code()).isEqualTo(123L)
        assertThat(tripReportProblemRetrieveResponse.currentTime()).isEqualTo(123L)
        assertThat(tripReportProblemRetrieveResponse.text()).isEqualTo("text")
        assertThat(tripReportProblemRetrieveResponse.version()).isEqualTo(123L)
    }
}
