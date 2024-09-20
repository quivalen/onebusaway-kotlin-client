// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.services.blocking.agencies

import com.onebusawaykt.api.core.ClientOptions
import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.core.http.HttpMethod
import com.onebusawaykt.api.core.http.HttpRequest
import com.onebusawaykt.api.core.http.HttpResponse.Handler
import com.onebusawaykt.api.errors.OnebusawayktError
import com.onebusawaykt.api.models.AgencyRouteListParams
import com.onebusawaykt.api.models.AgencyRouteListResponse
import com.onebusawaykt.api.services.errorHandler
import com.onebusawaykt.api.services.jsonHandler
import com.onebusawaykt.api.services.withErrorHandler

class RouteServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : RouteService {

    private val errorHandler: Handler<OnebusawayktError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<AgencyRouteListResponse> =
        jsonHandler<AgencyRouteListResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve the list of all routes for a particular agency by id */
    override fun list(
        params: AgencyRouteListParams,
        requestOptions: RequestOptions
    ): AgencyRouteListResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "where", "routes-for-agency", "{agencyID}.json")
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
