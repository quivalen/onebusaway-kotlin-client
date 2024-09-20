// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.services.blocking.agencies

import com.onebusawaykt.api.core.ClientOptions
import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.core.http.HttpMethod
import com.onebusawaykt.api.core.http.HttpRequest
import com.onebusawaykt.api.core.http.HttpResponse.Handler
import com.onebusawaykt.api.errors.OnebusawayktError
import com.onebusawaykt.api.models.AgencyStopIdRetrieveParams
import com.onebusawaykt.api.models.AgencyStopIdRetrieveResponse
import com.onebusawaykt.api.services.errorHandler
import com.onebusawaykt.api.services.jsonHandler
import com.onebusawaykt.api.services.withErrorHandler

class StopIdServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : StopIdService {

    private val errorHandler: Handler<OnebusawayktError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<AgencyStopIdRetrieveResponse> =
        jsonHandler<AgencyStopIdRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get stop IDs for a specific agency */
    override fun retrieve(
        params: AgencyStopIdRetrieveParams,
        requestOptions: RequestOptions
    ): AgencyStopIdRetrieveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "where", "stop-ids-for-agency", "{agencyID}.json")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
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
