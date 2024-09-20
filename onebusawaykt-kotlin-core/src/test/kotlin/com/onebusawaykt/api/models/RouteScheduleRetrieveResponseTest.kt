// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RouteScheduleRetrieveResponseTest {

    @Test
    fun createRouteScheduleRetrieveResponse() {
        val routeScheduleRetrieveResponse =
            RouteScheduleRetrieveResponse.builder()
                .code(123L)
                .currentTime(123L)
                .data(
                    RouteScheduleRetrieveResponse.Data.builder()
                        .entry(
                            RouteScheduleRetrieveResponse.Data.Entry.builder()
                                .routeId("routeId")
                                .scheduleDate(123L)
                                .serviceIds(listOf("string"))
                                .stops(
                                    listOf(
                                        RouteScheduleRetrieveResponse.Data.Entry.Stop.builder()
                                            .id("id")
                                            .code("code")
                                            .lat(42.23)
                                            .lon(42.23)
                                            .name("name")
                                            .direction("direction")
                                            .locationType(123L)
                                            .parent("parent")
                                            .routeIds(listOf("string"))
                                            .staticRouteIds(listOf("string"))
                                            .wheelchairBoarding("wheelchairBoarding")
                                            .build()
                                    )
                                )
                                .stopTripGroupings(
                                    listOf(
                                        RouteScheduleRetrieveResponse.Data.Entry.StopTripGrouping
                                            .builder()
                                            .directionId("directionId")
                                            .stopIds(listOf("string"))
                                            .tripHeadsigns(listOf("string"))
                                            .tripIds(listOf("string"))
                                            .tripsWithStopTimes(
                                                listOf(
                                                    RouteScheduleRetrieveResponse.Data.Entry
                                                        .StopTripGrouping
                                                        .TripsWithStopTime
                                                        .builder()
                                                        .stopTimes(
                                                            listOf(
                                                                RouteScheduleRetrieveResponse.Data
                                                                    .Entry
                                                                    .StopTripGrouping
                                                                    .TripsWithStopTime
                                                                    .StopTime
                                                                    .builder()
                                                                    .arrivalEnabled(true)
                                                                    .arrivalTime(123L)
                                                                    .departureEnabled(true)
                                                                    .departureTime(123L)
                                                                    .stopId("stopId")
                                                                    .tripId("tripId")
                                                                    .serviceId("serviceId")
                                                                    .stopHeadsign("stopHeadsign")
                                                                    .build()
                                                            )
                                                        )
                                                        .tripId("tripId")
                                                        .build()
                                                )
                                            )
                                            .build()
                                    )
                                )
                                .trips(
                                    listOf(
                                        RouteScheduleRetrieveResponse.Data.Entry.Trip.builder()
                                            .id("id")
                                            .routeId("routeId")
                                            .serviceId("serviceId")
                                            .blockId("blockId")
                                            .directionId("directionId")
                                            .peakOffpeak(123L)
                                            .routeShortName("routeShortName")
                                            .shapeId("shapeId")
                                            .timeZone("timeZone")
                                            .tripHeadsign("tripHeadsign")
                                            .tripShortName("tripShortName")
                                            .build()
                                    )
                                )
                                .build()
                        )
                        .build()
                )
                .text("text")
                .version(123L)
                .build()
        assertThat(routeScheduleRetrieveResponse).isNotNull
        assertThat(routeScheduleRetrieveResponse.code()).isEqualTo(123L)
        assertThat(routeScheduleRetrieveResponse.currentTime()).isEqualTo(123L)
        assertThat(routeScheduleRetrieveResponse.data())
            .isEqualTo(
                RouteScheduleRetrieveResponse.Data.builder()
                    .entry(
                        RouteScheduleRetrieveResponse.Data.Entry.builder()
                            .routeId("routeId")
                            .scheduleDate(123L)
                            .serviceIds(listOf("string"))
                            .stops(
                                listOf(
                                    RouteScheduleRetrieveResponse.Data.Entry.Stop.builder()
                                        .id("id")
                                        .code("code")
                                        .lat(42.23)
                                        .lon(42.23)
                                        .name("name")
                                        .direction("direction")
                                        .locationType(123L)
                                        .parent("parent")
                                        .routeIds(listOf("string"))
                                        .staticRouteIds(listOf("string"))
                                        .wheelchairBoarding("wheelchairBoarding")
                                        .build()
                                )
                            )
                            .stopTripGroupings(
                                listOf(
                                    RouteScheduleRetrieveResponse.Data.Entry.StopTripGrouping
                                        .builder()
                                        .directionId("directionId")
                                        .stopIds(listOf("string"))
                                        .tripHeadsigns(listOf("string"))
                                        .tripIds(listOf("string"))
                                        .tripsWithStopTimes(
                                            listOf(
                                                RouteScheduleRetrieveResponse.Data.Entry
                                                    .StopTripGrouping
                                                    .TripsWithStopTime
                                                    .builder()
                                                    .stopTimes(
                                                        listOf(
                                                            RouteScheduleRetrieveResponse.Data.Entry
                                                                .StopTripGrouping
                                                                .TripsWithStopTime
                                                                .StopTime
                                                                .builder()
                                                                .arrivalEnabled(true)
                                                                .arrivalTime(123L)
                                                                .departureEnabled(true)
                                                                .departureTime(123L)
                                                                .stopId("stopId")
                                                                .tripId("tripId")
                                                                .serviceId("serviceId")
                                                                .stopHeadsign("stopHeadsign")
                                                                .build()
                                                        )
                                                    )
                                                    .tripId("tripId")
                                                    .build()
                                            )
                                        )
                                        .build()
                                )
                            )
                            .trips(
                                listOf(
                                    RouteScheduleRetrieveResponse.Data.Entry.Trip.builder()
                                        .id("id")
                                        .routeId("routeId")
                                        .serviceId("serviceId")
                                        .blockId("blockId")
                                        .directionId("directionId")
                                        .peakOffpeak(123L)
                                        .routeShortName("routeShortName")
                                        .shapeId("shapeId")
                                        .timeZone("timeZone")
                                        .tripHeadsign("tripHeadsign")
                                        .tripShortName("tripShortName")
                                        .build()
                                )
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(routeScheduleRetrieveResponse.text()).isEqualTo("text")
        assertThat(routeScheduleRetrieveResponse.version()).isEqualTo(123L)
    }
}