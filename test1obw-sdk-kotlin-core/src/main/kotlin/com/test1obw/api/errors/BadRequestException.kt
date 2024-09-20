package com.test1obw.api.errors

import com.google.common.collect.ListMultimap

class BadRequestException(
    headers: ListMultimap<String, String>,
    body: String,
    error: Test1obwSdkError,
) : Test1obwSdkServiceException(400, headers, body, error)
