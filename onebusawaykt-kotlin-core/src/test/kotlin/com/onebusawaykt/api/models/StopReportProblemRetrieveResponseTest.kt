// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class StopReportProblemRetrieveResponseTest {

    @Test
    fun createStopReportProblemRetrieveResponse() {
        val stopReportProblemRetrieveResponse =
            StopReportProblemRetrieveResponse.builder()
                .code(123L)
                .currentTime(123L)
                .text("text")
                .version(123L)
                .build()
        assertThat(stopReportProblemRetrieveResponse).isNotNull
        assertThat(stopReportProblemRetrieveResponse.code()).isEqualTo(123L)
        assertThat(stopReportProblemRetrieveResponse.currentTime()).isEqualTo(123L)
        assertThat(stopReportProblemRetrieveResponse.text()).isEqualTo("text")
        assertThat(stopReportProblemRetrieveResponse.version()).isEqualTo(123L)
    }
}
