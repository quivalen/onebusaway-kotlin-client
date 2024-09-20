package com.onebusawaykt.api.errors

import com.google.common.collect.ListMultimap

class UnauthorizedException(
    headers: ListMultimap<String, String>,
    body: String,
    error: OnebusawayktError,
) : OnebusawayktServiceException(401, headers, body, error)
