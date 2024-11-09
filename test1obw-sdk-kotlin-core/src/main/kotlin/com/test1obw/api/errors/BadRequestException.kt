package com.test1obw.api.errors

import com.test1obw.api.core.http.Headers

class BadRequestException(
    headers: Headers,
    body: String,
    error: Test1obwSdkError,
) : Test1obwSdkServiceException(400, headers, body, error)
