package com.onebusawaykt.api.errors

import com.google.common.collect.ListMultimap

class RateLimitException(
    headers: ListMultimap<String, String>,
    body: String,
    error: OnebusawayktError,
) : OnebusawayktServiceException(429, headers, body, error)
