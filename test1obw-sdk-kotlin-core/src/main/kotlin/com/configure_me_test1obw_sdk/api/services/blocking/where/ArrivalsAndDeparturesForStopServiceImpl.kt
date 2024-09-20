// File generated from our OpenAPI spec by Stainless.

package com.configure_me_test1obw_sdk.api.services.blocking.where

import com.configure_me_test1obw_sdk.api.core.ClientOptions
import com.configure_me_test1obw_sdk.api.core.RequestOptions
import com.configure_me_test1obw_sdk.api.core.http.HttpMethod
import com.configure_me_test1obw_sdk.api.core.http.HttpRequest
import com.configure_me_test1obw_sdk.api.core.http.HttpResponse.Handler
import com.configure_me_test1obw_sdk.api.errors.Test1obwSdkError
import com.configure_me_test1obw_sdk.api.models.WhereArrivalsAndDeparturesForStopRetrieveParams
import com.configure_me_test1obw_sdk.api.models.WhereArrivalsAndDeparturesForStopRetrieveResponse
import com.configure_me_test1obw_sdk.api.services.errorHandler
import com.configure_me_test1obw_sdk.api.services.jsonHandler
import com.configure_me_test1obw_sdk.api.services.withErrorHandler

class ArrivalsAndDeparturesForStopServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : ArrivalsAndDeparturesForStopService {

    private val errorHandler: Handler<Test1obwSdkError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<WhereArrivalsAndDeparturesForStopRetrieveResponse> =
        jsonHandler<WhereArrivalsAndDeparturesForStopRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** arrivals-and-departures-for-stop */
    override fun retrieve(
        params: WhereArrivalsAndDeparturesForStopRetrieveParams,
        requestOptions: RequestOptions
    ): WhereArrivalsAndDeparturesForStopRetrieveResponse {
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
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
