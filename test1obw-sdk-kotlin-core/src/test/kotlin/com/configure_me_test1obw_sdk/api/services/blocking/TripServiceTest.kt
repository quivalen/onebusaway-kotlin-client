// File generated from our OpenAPI spec by Stainless.

package com.configure_me_test1obw_sdk.api.services.blocking

import com.configure_me_test1obw_sdk.api.TestServerExtension
import com.configure_me_test1obw_sdk.api.client.okhttp.Test1obwSdkOkHttpClient
import com.configure_me_test1obw_sdk.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class TripServiceTest {

    @Test
    fun callReportProblem() {
        val client = Test1obwSdkOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val tripService = client.trips()
        val responseWrapper =
            tripService.reportProblem(
                TripReportProblemParams.builder()
                    .tripId("tripID")
                    .code(TripReportProblemParams.Code.VEHICLE_NEVER_CAME)
                    .serviceDate(123L)
                    .stopId("stopID")
                    .userComment("userComment")
                    .userLat(42.23)
                    .userLocationAccuracy(42.23)
                    .userLon(42.23)
                    .userOnVehicle(true)
                    .userVehicleNumber("userVehicleNumber")
                    .vehicleId("vehicleID")
                    .build()
            )
        println(responseWrapper)
        responseWrapper.validate()
    }
}
