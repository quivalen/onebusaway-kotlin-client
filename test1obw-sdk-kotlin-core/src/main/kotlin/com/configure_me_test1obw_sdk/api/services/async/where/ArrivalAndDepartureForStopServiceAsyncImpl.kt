// File generated from our OpenAPI spec by Stainless.

package com.configure_me_test1obw_sdk.api.services.async.where

import com.configure_me_test1obw_sdk.api.core.ClientOptions
import com.configure_me_test1obw_sdk.api.core.RequestOptions
import com.configure_me_test1obw_sdk.api.core.http.HttpMethod
import com.configure_me_test1obw_sdk.api.core.http.HttpRequest
import com.configure_me_test1obw_sdk.api.core.http.HttpResponse.Handler
import com.configure_me_test1obw_sdk.api.errors.Test1obwSdkError
import com.configure_me_test1obw_sdk.api.models.WhereArrivalAndDepartureForStopRetrieveParams
import com.configure_me_test1obw_sdk.api.models.WhereArrivalAndDepartureForStopRetrieveResponse
import com.configure_me_test1obw_sdk.api.services.errorHandler
import com.configure_me_test1obw_sdk.api.services.jsonHandler
import com.configure_me_test1obw_sdk.api.services.withErrorHandler

class ArrivalAndDepartureForStopServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : ArrivalAndDepartureForStopServiceAsync {

    private val errorHandler: Handler<Test1obwSdkError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<WhereArrivalAndDepartureForStopRetrieveResponse> =
        jsonHandler<WhereArrivalAndDepartureForStopRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** arrival-and-departure-for-stop */
    override suspend fun retrieve(
        params: WhereArrivalAndDepartureForStopRetrieveParams,
        requestOptions: RequestOptions
    ): WhereArrivalAndDepartureForStopRetrieveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "where", "arrival-and-departure-for-stop", "{stopID}.json")
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
