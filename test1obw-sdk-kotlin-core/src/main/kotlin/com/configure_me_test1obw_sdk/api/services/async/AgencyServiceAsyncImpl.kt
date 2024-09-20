// File generated from our OpenAPI spec by Stainless.

package com.configure_me_test1obw_sdk.api.services.async

import com.configure_me_test1obw_sdk.api.core.ClientOptions
import com.configure_me_test1obw_sdk.api.core.RequestOptions
import com.configure_me_test1obw_sdk.api.core.http.HttpMethod
import com.configure_me_test1obw_sdk.api.core.http.HttpRequest
import com.configure_me_test1obw_sdk.api.core.http.HttpResponse.Handler
import com.configure_me_test1obw_sdk.api.errors.Test1obwSdkError
import com.configure_me_test1obw_sdk.api.models.AgencyRetrieveParams
import com.configure_me_test1obw_sdk.api.models.AgencyRetrieveResponse
import com.configure_me_test1obw_sdk.api.services.async.agencies.RouteIdServiceAsync
import com.configure_me_test1obw_sdk.api.services.async.agencies.RouteIdServiceAsyncImpl
import com.configure_me_test1obw_sdk.api.services.async.agencies.RouteServiceAsync
import com.configure_me_test1obw_sdk.api.services.async.agencies.RouteServiceAsyncImpl
import com.configure_me_test1obw_sdk.api.services.async.agencies.StopServiceAsync
import com.configure_me_test1obw_sdk.api.services.async.agencies.StopServiceAsyncImpl
import com.configure_me_test1obw_sdk.api.services.errorHandler
import com.configure_me_test1obw_sdk.api.services.jsonHandler
import com.configure_me_test1obw_sdk.api.services.withErrorHandler

class AgencyServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : AgencyServiceAsync {

    private val errorHandler: Handler<Test1obwSdkError> = errorHandler(clientOptions.jsonMapper)

    private val routeIds: RouteIdServiceAsync by lazy { RouteIdServiceAsyncImpl(clientOptions) }

    private val routes: RouteServiceAsync by lazy { RouteServiceAsyncImpl(clientOptions) }

    private val stops: StopServiceAsync by lazy { StopServiceAsyncImpl(clientOptions) }

    override fun routeIds(): RouteIdServiceAsync = routeIds

    override fun routes(): RouteServiceAsync = routes

    override fun stops(): StopServiceAsync = stops

    private val retrieveHandler: Handler<AgencyRetrieveResponse> =
        jsonHandler<AgencyRetrieveResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve information for a specific transit agency identified by its unique ID. */
    override suspend fun retrieve(
        params: AgencyRetrieveParams,
        requestOptions: RequestOptions
    ): AgencyRetrieveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "where", "agency", "{agencyID}.json")
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
