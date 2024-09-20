// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.services.blocking.trips

import com.onebusawaykt.api.TestServerExtension
import com.onebusawaykt.api.client.okhttp.OnebusawayktOkHttpClient
import com.onebusawaykt.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ReportProblemServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            OnebusawayktOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val reportProblemService = client.trips().reportProblem()
        val tripReportProblemRetrieveResponse =
            reportProblemService.retrieve(
                TripReportProblemRetrieveParams.builder()
                    .tripId("tripID")
                    .code(TripReportProblemRetrieveParams.Code.VEHICLE_NEVER_CAME)
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
        println(tripReportProblemRetrieveResponse)
        tripReportProblemRetrieveResponse.validate()
    }
}
