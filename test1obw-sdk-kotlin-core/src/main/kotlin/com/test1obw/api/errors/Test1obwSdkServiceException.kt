package com.test1obw.api.errors

import com.test1obw.api.core.http.Headers

abstract class Test1obwSdkServiceException(
    private val statusCode: Int,
    private val headers: Headers,
    private val body: String,
    private val error: Test1obwSdkError,
    message: String = "$statusCode: $error",
    cause: Throwable? = null
) : Test1obwSdkException(message, cause) {

    fun statusCode(): Int = statusCode

    fun headers(): Headers = headers

    fun body(): String = body

    fun error(): Test1obwSdkError = error
}
