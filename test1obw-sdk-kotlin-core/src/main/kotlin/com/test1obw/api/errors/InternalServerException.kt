package com.test1obw.api.errors

import com.test1obw.api.core.http.Headers

class InternalServerException(
    statusCode: Int,
    headers: Headers,
    body: String,
    error: Test1obwSdkError,
) : Test1obwSdkServiceException(statusCode, headers, body, error)
