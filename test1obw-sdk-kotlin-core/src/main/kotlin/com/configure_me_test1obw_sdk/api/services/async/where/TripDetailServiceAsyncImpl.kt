// File generated from our OpenAPI spec by Stainless.

package com.configure_me_test1obw_sdk.api.services.async.where

import com.configure_me_test1obw_sdk.api.core.ClientOptions
import com.configure_me_test1obw_sdk.api.core.RequestOptions
import com.configure_me_test1obw_sdk.api.core.http.HttpMethod
import com.configure_me_test1obw_sdk.api.core.http.HttpRequest
import com.configure_me_test1obw_sdk.api.core.http.HttpResponse.Handler
import com.configure_me_test1obw_sdk.api.errors.Test1obwSdkError
import com.configure_me_test1obw_sdk.api.models.WhereTripDetailRetrieveParams
import com.configure_me_test1obw_sdk.api.models.WhereTripDetailRetrieveResponse
import com.configure_me_test1obw_sdk.api.services.errorHandler
import com.configure_me_test1obw_sdk.api.services.jsonHandler
import com.configure_me_test1obw_sdk.api.services.withErrorHandler

class TripDetailServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : TripDetailServiceAsync {

    private val errorHandler: Handler<Test1obwSdkError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<WhereTripDetailRetrieveResponse> =
        jsonHandler<WhereTripDetailRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve Trip Details */
    override suspend fun retrieve(
        params: WhereTripDetailRetrieveParams,
        requestOptions: RequestOptions
    ): WhereTripDetailRetrieveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "where", "trip-details", "{tripID}.json")
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
