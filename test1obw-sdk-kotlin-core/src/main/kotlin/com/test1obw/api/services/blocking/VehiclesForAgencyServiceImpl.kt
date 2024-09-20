// File generated from our OpenAPI spec by Stainless.

package com.test1obw.api.services.blocking

import com.test1obw.api.core.ClientOptions
import com.test1obw.api.core.RequestOptions
import com.test1obw.api.core.http.HttpMethod
import com.test1obw.api.core.http.HttpRequest
import com.test1obw.api.core.http.HttpResponse.Handler
import com.test1obw.api.errors.Test1obwSdkError
import com.test1obw.api.models.VehiclesForAgencyListParams
import com.test1obw.api.models.VehiclesForAgencyListResponse
import com.test1obw.api.services.errorHandler
import com.test1obw.api.services.jsonHandler
import com.test1obw.api.services.withErrorHandler

class VehiclesForAgencyServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : VehiclesForAgencyService {

    private val errorHandler: Handler<Test1obwSdkError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<VehiclesForAgencyListResponse> =
        jsonHandler<VehiclesForAgencyListResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get vehicles for a specific agency */
    override fun list(
        params: VehiclesForAgencyListParams,
        requestOptions: RequestOptions
    ): VehiclesForAgencyListResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "where", "vehicles-for-agency", "{agencyID}.json")
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
