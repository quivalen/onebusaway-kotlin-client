// File generated from our OpenAPI spec by Stainless.

package com.configure_me_test1obw_sdk.api.services.blocking

import com.configure_me_test1obw_sdk.api.core.ClientOptions
import com.configure_me_test1obw_sdk.api.core.RequestOptions
import com.configure_me_test1obw_sdk.api.core.http.HttpMethod
import com.configure_me_test1obw_sdk.api.core.http.HttpRequest
import com.configure_me_test1obw_sdk.api.core.http.HttpResponse.Handler
import com.configure_me_test1obw_sdk.api.errors.Test1obwSdkError
import com.configure_me_test1obw_sdk.api.models.AgencyRetrieveParams
import com.configure_me_test1obw_sdk.api.models.AgencyRetrieveResponse
import com.configure_me_test1obw_sdk.api.services.blocking.agencies.RouteIdService
import com.configure_me_test1obw_sdk.api.services.blocking.agencies.RouteIdServiceImpl
import com.configure_me_test1obw_sdk.api.services.blocking.agencies.RouteService
import com.configure_me_test1obw_sdk.api.services.blocking.agencies.RouteServiceImpl
import com.configure_me_test1obw_sdk.api.services.blocking.agencies.StopService
import com.configure_me_test1obw_sdk.api.services.blocking.agencies.StopServiceImpl
import com.configure_me_test1obw_sdk.api.services.errorHandler
import com.configure_me_test1obw_sdk.api.services.jsonHandler
import com.configure_me_test1obw_sdk.api.services.withErrorHandler

class AgencyServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : AgencyService {

    private val errorHandler: Handler<Test1obwSdkError> = errorHandler(clientOptions.jsonMapper)

    private val routeIds: RouteIdService by lazy { RouteIdServiceImpl(clientOptions) }

    private val routes: RouteService by lazy { RouteServiceImpl(clientOptions) }

    private val stops: StopService by lazy { StopServiceImpl(clientOptions) }

    override fun routeIds(): RouteIdService = routeIds

    override fun routes(): RouteService = routes

    override fun stops(): StopService = stops

    private val retrieveHandler: Handler<AgencyRetrieveResponse> =
        jsonHandler<AgencyRetrieveResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve information for a specific transit agency identified by its unique ID. */
    override fun retrieve(
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
