// File generated from our OpenAPI spec by Stainless.

package com.test1obw.api.services.blocking

import com.test1obw.api.core.ClientOptions
import com.test1obw.api.core.RequestOptions
import com.test1obw.api.core.http.HttpMethod
import com.test1obw.api.core.http.HttpRequest
import com.test1obw.api.core.http.HttpResponse.Handler
import com.test1obw.api.errors.Test1obwSdkError
import com.test1obw.api.models.ArrivalAndDepartureListParams
import com.test1obw.api.models.ArrivalAndDepartureListResponse
import com.test1obw.api.models.ArrivalAndDepartureRetrieveParams
import com.test1obw.api.models.ArrivalAndDepartureRetrieveResponse
import com.test1obw.api.services.errorHandler
import com.test1obw.api.services.jsonHandler
import com.test1obw.api.services.withErrorHandler

class ArrivalAndDepartureServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : ArrivalAndDepartureService {

    private val errorHandler: Handler<Test1obwSdkError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<ArrivalAndDepartureRetrieveResponse> =
        jsonHandler<ArrivalAndDepartureRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** arrival-and-departure-for-stop */
    override fun retrieve(
        params: ArrivalAndDepartureRetrieveParams,
        requestOptions: RequestOptions
    ): ArrivalAndDepartureRetrieveResponse {
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

    private val listHandler: Handler<ArrivalAndDepartureListResponse> =
        jsonHandler<ArrivalAndDepartureListResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** arrivals-and-departures-for-stop */
    override fun list(
        params: ArrivalAndDepartureListParams,
        requestOptions: RequestOptions
    ): ArrivalAndDepartureListResponse {
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
