package com.test1obw.api.errors

import com.google.common.collect.ListMultimap

class RateLimitException(
    headers: ListMultimap<String, String>,
    body: String,
    error: Test1obwSdkError,
) : Test1obwSdkServiceException(429, headers, body, error)
