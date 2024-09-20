// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.services.async.stops

import com.onebusawaykt.api.core.ClientOptions
import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.core.http.HttpMethod
import com.onebusawaykt.api.core.http.HttpRequest
import com.onebusawaykt.api.core.http.HttpResponse.Handler
import com.onebusawaykt.api.errors.OnebusawayktError
import com.onebusawaykt.api.models.StopSearchRetrieveParams
import com.onebusawaykt.api.models.StopSearchRetrieveResponse
import com.onebusawaykt.api.services.errorHandler
import com.onebusawaykt.api.services.jsonHandler
import com.onebusawaykt.api.services.withErrorHandler

class SearchServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : SearchServiceAsync {

    private val errorHandler: Handler<OnebusawayktError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<StopSearchRetrieveResponse> =
        jsonHandler<StopSearchRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Search for a stop based on its name. */
    override suspend fun retrieve(
        params: StopSearchRetrieveParams,
        requestOptions: RequestOptions
    ): StopSearchRetrieveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "where", "search", "stop.json")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
