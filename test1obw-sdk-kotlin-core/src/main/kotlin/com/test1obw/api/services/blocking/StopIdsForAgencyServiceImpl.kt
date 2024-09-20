// File generated from our OpenAPI spec by Stainless.

package com.test1obw.api.services.blocking

import com.test1obw.api.core.ClientOptions
import com.test1obw.api.core.RequestOptions
import com.test1obw.api.core.http.HttpMethod
import com.test1obw.api.core.http.HttpRequest
import com.test1obw.api.core.http.HttpResponse.Handler
import com.test1obw.api.errors.Test1obwSdkError
import com.test1obw.api.models.StopIdsForAgencyListParams
import com.test1obw.api.models.StopIdsForAgencyListResponse
import com.test1obw.api.services.errorHandler
import com.test1obw.api.services.jsonHandler
import com.test1obw.api.services.withErrorHandler

class StopIdsForAgencyServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : StopIdsForAgencyService {

    private val errorHandler: Handler<Test1obwSdkError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<StopIdsForAgencyListResponse> =
        jsonHandler<StopIdsForAgencyListResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get stop IDs for a specific agency */
    override fun list(
        params: StopIdsForAgencyListParams,
        requestOptions: RequestOptions
    ): StopIdsForAgencyListResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "where", "stop-ids-for-agency", "{agencyID}.json")
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
