package com.onebusawaykt.api.errors

import com.google.common.collect.ListMultimap

abstract class OnebusawayktServiceException(
    private val statusCode: Int,
    private val headers: ListMultimap<String, String>,
    private val body: String,
    private val error: OnebusawayktError,
    message: String = "$statusCode: $error",
    cause: Throwable? = null
) : OnebusawayktException(message, cause) {

    fun statusCode(): Int = statusCode

    fun headers(): ListMultimap<String, String> = headers

    fun body(): String = body

    fun error(): OnebusawayktError = error
}
