// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.services.async

import com.onebusawaykt.api.core.ClientOptions
import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.core.http.HttpMethod
import com.onebusawaykt.api.core.http.HttpRequest
import com.onebusawaykt.api.core.http.HttpResponse.Handler
import com.onebusawaykt.api.errors.OnebusawayktError
import com.onebusawaykt.api.models.AgencyRetrieveParams
import com.onebusawaykt.api.models.AgencyRetrieveResponse
import com.onebusawaykt.api.services.async.agencies.CoverageServiceAsync
import com.onebusawaykt.api.services.async.agencies.CoverageServiceAsyncImpl
import com.onebusawaykt.api.services.async.agencies.RouteServiceAsync
import com.onebusawaykt.api.services.async.agencies.RouteServiceAsyncImpl
import com.onebusawaykt.api.services.async.agencies.RoutesIdServiceAsync
import com.onebusawaykt.api.services.async.agencies.RoutesIdServiceAsyncImpl
import com.onebusawaykt.api.services.async.agencies.StopIdServiceAsync
import com.onebusawaykt.api.services.async.agencies.StopIdServiceAsyncImpl
import com.onebusawaykt.api.services.async.agencies.VehicleServiceAsync
import com.onebusawaykt.api.services.async.agencies.VehicleServiceAsyncImpl
import com.onebusawaykt.api.services.errorHandler
import com.onebusawaykt.api.services.jsonHandler
import com.onebusawaykt.api.services.withErrorHandler

class AgencyServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : AgencyServiceAsync {

    private val errorHandler: Handler<OnebusawayktError> = errorHandler(clientOptions.jsonMapper)

    private val coverage: CoverageServiceAsync by lazy { CoverageServiceAsyncImpl(clientOptions) }

    private val routesIds: RoutesIdServiceAsync by lazy { RoutesIdServiceAsyncImpl(clientOptions) }

    private val routes: RouteServiceAsync by lazy { RouteServiceAsyncImpl(clientOptions) }

    private val vehicles: VehicleServiceAsync by lazy { VehicleServiceAsyncImpl(clientOptions) }

    private val stopIds: StopIdServiceAsync by lazy { StopIdServiceAsyncImpl(clientOptions) }

    override fun coverage(): CoverageServiceAsync = coverage

    override fun routesIds(): RoutesIdServiceAsync = routesIds

    override fun routes(): RouteServiceAsync = routes

    override fun vehicles(): VehicleServiceAsync = vehicles

    override fun stopIds(): StopIdServiceAsync = stopIds

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
