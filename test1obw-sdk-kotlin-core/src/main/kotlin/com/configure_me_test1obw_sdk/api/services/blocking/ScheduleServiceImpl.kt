// File generated from our OpenAPI spec by Stainless.

package com.configure_me_test1obw_sdk.api.services.blocking

import com.configure_me_test1obw_sdk.api.core.ClientOptions
import com.configure_me_test1obw_sdk.api.core.RequestOptions
import com.configure_me_test1obw_sdk.api.core.http.HttpMethod
import com.configure_me_test1obw_sdk.api.core.http.HttpRequest
import com.configure_me_test1obw_sdk.api.core.http.HttpResponse.Handler
import com.configure_me_test1obw_sdk.api.errors.Test1obwSdkError
import com.configure_me_test1obw_sdk.api.models.ScheduleRetrieveParams
import com.configure_me_test1obw_sdk.api.models.ScheduleRetrieveResponse
import com.configure_me_test1obw_sdk.api.services.errorHandler
import com.configure_me_test1obw_sdk.api.services.jsonHandler
import com.configure_me_test1obw_sdk.api.services.withErrorHandler

class ScheduleServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : ScheduleService {

    private val errorHandler: Handler<Test1obwSdkError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<ScheduleRetrieveResponse> =
        jsonHandler<ScheduleRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get schedule for a specific stop */
    override fun retrieve(
        params: ScheduleRetrieveParams,
        requestOptions: RequestOptions
    ): ScheduleRetrieveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "where", "schedule-for-stop", "{stopID}.json")
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
