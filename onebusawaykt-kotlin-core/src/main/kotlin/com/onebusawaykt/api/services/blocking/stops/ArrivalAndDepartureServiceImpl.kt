// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.services.blocking.stops

import com.onebusawaykt.api.core.ClientOptions
import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.core.http.HttpMethod
import com.onebusawaykt.api.core.http.HttpRequest
import com.onebusawaykt.api.core.http.HttpResponse.Handler
import com.onebusawaykt.api.errors.OnebusawayktError
import com.onebusawaykt.api.models.StopArrivalAndDepartureRetrieveParams
import com.onebusawaykt.api.models.StopArrivalAndDepartureRetrieveResponse
import com.onebusawaykt.api.services.errorHandler
import com.onebusawaykt.api.services.jsonHandler
import com.onebusawaykt.api.services.withErrorHandler

class ArrivalAndDepartureServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : ArrivalAndDepartureService {

    private val errorHandler: Handler<OnebusawayktError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<StopArrivalAndDepartureRetrieveResponse> =
        jsonHandler<StopArrivalAndDepartureRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** arrival-and-departure-for-stop */
    override fun retrieve(
        params: StopArrivalAndDepartureRetrieveParams,
        requestOptions: RequestOptions
    ): StopArrivalAndDepartureRetrieveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "where", "arrival-and-departure-for-stop", "{stopID}.json")
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
