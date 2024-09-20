package com.test1obw.api.errors

import com.google.common.collect.ListMultimap

class PermissionDeniedException(
    headers: ListMultimap<String, String>,
    body: String,
    error: Test1obwSdkError,
) : Test1obwSdkServiceException(403, headers, body, error)
