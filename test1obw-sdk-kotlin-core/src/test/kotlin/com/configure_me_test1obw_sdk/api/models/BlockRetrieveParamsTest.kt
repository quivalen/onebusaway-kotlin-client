// File generated from our OpenAPI spec by Stainless.

package com.configure_me_test1obw_sdk.api.models

import com.configure_me_test1obw_sdk.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BlockRetrieveParamsTest {

    @Test
    fun createBlockRetrieveParams() {
        BlockRetrieveParams.builder().blockId("blockID").build()
    }

    @Test
    fun getPathParam() {
        val params = BlockRetrieveParams.builder().blockId("blockID").build()
        assertThat(params).isNotNull
        // path param "blockId"
        assertThat(params.getPathParam(0)).isEqualTo("blockID")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}