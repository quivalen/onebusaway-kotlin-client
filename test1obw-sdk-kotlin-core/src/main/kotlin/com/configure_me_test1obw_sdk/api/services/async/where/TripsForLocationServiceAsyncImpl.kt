// File generated from our OpenAPI spec by Stainless.

package com.configure_me_test1obw_sdk.api.services.async.where

import com.configure_me_test1obw_sdk.api.core.ClientOptions
import com.configure_me_test1obw_sdk.api.core.RequestOptions
import com.configure_me_test1obw_sdk.api.core.http.HttpMethod
import com.configure_me_test1obw_sdk.api.core.http.HttpRequest
import com.configure_me_test1obw_sdk.api.core.http.HttpResponse.Handler
import com.configure_me_test1obw_sdk.api.errors.Test1obwSdkError
import com.configure_me_test1obw_sdk.api.models.WhereTripsForLocationListParams
import com.configure_me_test1obw_sdk.api.models.WhereTripsForLocationListResponse
import com.configure_me_test1obw_sdk.api.services.errorHandler
import com.configure_me_test1obw_sdk.api.services.jsonHandler
import com.configure_me_test1obw_sdk.api.services.withErrorHandler

class TripsForLocationServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : TripsForLocationServiceAsync {

    private val errorHandler: Handler<Test1obwSdkError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<WhereTripsForLocationListResponse> =
        jsonHandler<WhereTripsForLocationListResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve trips for a given location */
    override suspend fun list(
        params: WhereTripsForLocationListParams,
        requestOptions: RequestOptions
    ): WhereTripsForLocationListResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "where", "trips-for-location.json")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
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
