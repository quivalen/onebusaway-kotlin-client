// File generated from our OpenAPI spec by Stainless.

package com.test1obw.api.services.blocking

import com.test1obw.api.core.ClientOptions
import com.test1obw.api.core.RequestOptions
import com.test1obw.api.core.handlers.errorHandler
import com.test1obw.api.core.handlers.jsonHandler
import com.test1obw.api.core.handlers.withErrorHandler
import com.test1obw.api.core.http.HttpMethod
import com.test1obw.api.core.http.HttpRequest
import com.test1obw.api.core.http.HttpResponse.Handler
import com.test1obw.api.errors.Test1obwSdkError
import com.test1obw.api.models.StopsForLocationListParams
import com.test1obw.api.models.StopsForLocationListResponse

class StopsForLocationServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : StopsForLocationService {

    private val errorHandler: Handler<Test1obwSdkError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<StopsForLocationListResponse> =
        jsonHandler<StopsForLocationListResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** stops-for-location */
    override fun list(
        params: StopsForLocationListParams,
        requestOptions: RequestOptions
    ): StopsForLocationListResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "where", "stops-for-location.json")
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
