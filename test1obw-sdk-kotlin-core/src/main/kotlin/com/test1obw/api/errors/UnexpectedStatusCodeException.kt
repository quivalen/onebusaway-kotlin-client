package com.test1obw.api.errors

import com.google.common.collect.ListMultimap

class UnexpectedStatusCodeException(
    statusCode: Int,
    headers: ListMultimap<String, String>,
    body: String,
    error: Test1obwSdkError,
) : Test1obwSdkServiceException(statusCode, headers, body, error)
