package com.test1obw.api.errors

import com.test1obw.api.core.http.Headers

class RateLimitException(
    headers: Headers,
    body: String,
    error: Test1obwSdkError,
) : Test1obwSdkServiceException(429, headers, body, error)
