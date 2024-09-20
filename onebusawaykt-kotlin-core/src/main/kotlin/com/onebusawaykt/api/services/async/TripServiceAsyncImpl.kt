// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.services.async

import com.onebusawaykt.api.core.ClientOptions
import com.onebusawaykt.api.core.RequestOptions
import com.onebusawaykt.api.core.http.HttpMethod
import com.onebusawaykt.api.core.http.HttpRequest
import com.onebusawaykt.api.core.http.HttpResponse.Handler
import com.onebusawaykt.api.errors.OnebusawayktError
import com.onebusawaykt.api.models.TripRetrieveParams
import com.onebusawaykt.api.models.TripRetrieveResponse
import com.onebusawaykt.api.services.async.trips.DetailServiceAsync
import com.onebusawaykt.api.services.async.trips.DetailServiceAsyncImpl
import com.onebusawaykt.api.services.async.trips.ReportProblemServiceAsync
import com.onebusawaykt.api.services.async.trips.ReportProblemServiceAsyncImpl
import com.onebusawaykt.api.services.errorHandler
import com.onebusawaykt.api.services.jsonHandler
import com.onebusawaykt.api.services.withErrorHandler

class TripServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : TripServiceAsync {

    private val errorHandler: Handler<OnebusawayktError> = errorHandler(clientOptions.jsonMapper)

    private val details: DetailServiceAsync by lazy { DetailServiceAsyncImpl(clientOptions) }

    private val reportProblem: ReportProblemServiceAsync by lazy {
        ReportProblemServiceAsyncImpl(clientOptions)
    }

    override fun details(): DetailServiceAsync = details

    override fun reportProblem(): ReportProblemServiceAsync = reportProblem

    private val retrieveHandler: Handler<TripRetrieveResponse> =
        jsonHandler<TripRetrieveResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get details of a specific trip */
    override suspend fun retrieve(
        params: TripRetrieveParams,
        requestOptions: RequestOptions
    ): TripRetrieveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "where", "trip", "{tripID}.json")
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
