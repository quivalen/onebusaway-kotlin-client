package com.configure_me_test1obw_sdk.api.errors

import com.google.common.collect.ListMultimap

class NotFoundException(
    headers: ListMultimap<String, String>,
    body: String,
    error: Test1obwSdkError,
) : Test1obwSdkServiceException(404, headers, body, error)
