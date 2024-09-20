package com.onebusawaykt.api.errors

import com.google.common.collect.ListMultimap

class UnprocessableEntityException(
    headers: ListMultimap<String, String>,
    body: String,
    error: OnebusawayktError,
) : OnebusawayktServiceException(422, headers, body, error)
