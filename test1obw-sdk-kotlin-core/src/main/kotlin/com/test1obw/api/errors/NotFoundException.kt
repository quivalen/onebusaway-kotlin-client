package com.test1obw.api.errors

import com.test1obw.api.core.http.Headers

class NotFoundException(
    headers: Headers,
    body: String,
    error: Test1obwSdkError,
) : Test1obwSdkServiceException(404, headers, body, error)
