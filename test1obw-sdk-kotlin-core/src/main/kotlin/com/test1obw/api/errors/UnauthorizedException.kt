package com.test1obw.api.errors

import com.test1obw.api.core.http.Headers

class UnauthorizedException(
    headers: Headers,
    body: String,
    error: Test1obwSdkError,
) : Test1obwSdkServiceException(401, headers, body, error)
