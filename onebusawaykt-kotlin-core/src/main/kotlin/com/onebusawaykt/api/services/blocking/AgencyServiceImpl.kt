// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.services.blocking

import com.onebusawaykt.api.core.ClientOptions
import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.core.http.HttpMethod
import com.onebusawaykt.api.core.http.HttpRequest
import com.onebusawaykt.api.core.http.HttpResponse.Handler
import com.onebusawaykt.api.errors.OnebusawayktError
import com.onebusawaykt.api.models.AgencyRetrieveParams
import com.onebusawaykt.api.models.AgencyRetrieveResponse
import com.onebusawaykt.api.services.blocking.agencies.CoverageService
import com.onebusawaykt.api.services.blocking.agencies.CoverageServiceImpl
import com.onebusawaykt.api.services.blocking.agencies.RouteService
import com.onebusawaykt.api.services.blocking.agencies.RouteServiceImpl
import com.onebusawaykt.api.services.blocking.agencies.RoutesIdService
import com.onebusawaykt.api.services.blocking.agencies.RoutesIdServiceImpl
import com.onebusawaykt.api.services.blocking.agencies.StopIdService
import com.onebusawaykt.api.services.blocking.agencies.StopIdServiceImpl
import com.onebusawaykt.api.services.blocking.agencies.VehicleService
import com.onebusawaykt.api.services.blocking.agencies.VehicleServiceImpl
import com.onebusawaykt.api.services.errorHandler
import com.onebusawaykt.api.services.jsonHandler
import com.onebusawaykt.api.services.withErrorHandler

class AgencyServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : AgencyService {

    private val errorHandler: Handler<OnebusawayktError> = errorHandler(clientOptions.jsonMapper)

    private val coverage: CoverageService by lazy { CoverageServiceImpl(clientOptions) }

    private val routesIds: RoutesIdService by lazy { RoutesIdServiceImpl(clientOptions) }

    private val routes: RouteService by lazy { RouteServiceImpl(clientOptions) }

    private val vehicles: VehicleService by lazy { VehicleServiceImpl(clientOptions) }

    private val stopIds: StopIdService by lazy { StopIdServiceImpl(clientOptions) }

    override fun coverage(): CoverageService = coverage

    override fun routesIds(): RoutesIdService = routesIds

    override fun routes(): RouteService = routes

    override fun vehicles(): VehicleService = vehicles

    override fun stopIds(): StopIdService = stopIds

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
