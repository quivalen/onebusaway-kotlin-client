package com.test1obw.api.errors

import com.test1obw.api.core.http.Headers

class PermissionDeniedException(
    headers: Headers,
    body: String,
    error: Test1obwSdkError,
) : Test1obwSdkServiceException(403, headers, body, error)
