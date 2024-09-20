// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.services.blocking.stops

import com.onebusawaykt.api.core.ClientOptions
import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.core.http.HttpMethod
import com.onebusawaykt.api.core.http.HttpRequest
import com.onebusawaykt.api.core.http.HttpResponse.Handler
import com.onebusawaykt.api.errors.OnebusawayktError
import com.onebusawaykt.api.models.StopArrivalsAndDepartureListParams
import com.onebusawaykt.api.models.StopArrivalsAndDepartureListResponse
import com.onebusawaykt.api.services.errorHandler
import com.onebusawaykt.api.services.jsonHandler
import com.onebusawaykt.api.services.withErrorHandler

class ArrivalsAndDepartureServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : ArrivalsAndDepartureService {

    private val errorHandler: Handler<OnebusawayktError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<StopArrivalsAndDepartureListResponse> =
        jsonHandler<StopArrivalsAndDepartureListResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** arrivals-and-departures-for-stop */
    override fun list(
        params: StopArrivalsAndDepartureListParams,
        requestOptions: RequestOptions
    ): StopArrivalsAndDepartureListResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "api",
                    "where",
                    "arrivals-and-departures-for-stop",
                    "{stopID}.json"
                )
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
