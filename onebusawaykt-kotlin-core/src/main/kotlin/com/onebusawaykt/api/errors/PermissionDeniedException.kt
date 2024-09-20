package com.onebusawaykt.api.errors

import com.google.common.collect.ListMultimap

class PermissionDeniedException(
    headers: ListMultimap<String, String>,
    body: String,
    error: OnebusawayktError,
) : OnebusawayktServiceException(403, headers, body, error)
