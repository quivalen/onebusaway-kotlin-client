package com.configure_me_test1obw_sdk.api.errors

import com.google.common.collect.ListMultimap

abstract class Test1obwSdkServiceException(
    private val statusCode: Int,
    private val headers: ListMultimap<String, String>,
    private val body: String,
    private val error: Test1obwSdkError,
    message: String = "$statusCode: $error",
    cause: Throwable? = null
) : Test1obwSdkException(message, cause) {

    fun statusCode(): Int = statusCode

    fun headers(): ListMultimap<String, String> = headers

    fun body(): String = body

    fun error(): Test1obwSdkError = error
}
