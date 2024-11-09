package com.test1obw.api.errors

import com.test1obw.api.core.http.Headers

class UnprocessableEntityException(
    headers: Headers,
    body: String,
    error: Test1obwSdkError,
) : Test1obwSdkServiceException(422, headers, body, error)
