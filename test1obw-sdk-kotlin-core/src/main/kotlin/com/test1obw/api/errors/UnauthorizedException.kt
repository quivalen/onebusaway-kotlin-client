package com.test1obw.api.errors

import com.google.common.collect.ListMultimap

class UnauthorizedException(
    headers: ListMultimap<String, String>,
    body: String,
    error: Test1obwSdkError,
) : Test1obwSdkServiceException(401, headers, body, error)
