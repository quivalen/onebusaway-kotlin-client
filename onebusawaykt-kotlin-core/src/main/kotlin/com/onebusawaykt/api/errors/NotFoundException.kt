package com.onebusawaykt.api.errors

import com.google.common.collect.ListMultimap

class NotFoundException(
    headers: ListMultimap<String, String>,
    body: String,
    error: OnebusawayktError,
) : OnebusawayktServiceException(404, headers, body, error)
