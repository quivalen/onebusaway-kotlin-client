// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class StopLocationListResponseTest {

    @Test
    fun createStopLocationListResponse() {
        val stopLocationListResponse =
            StopLocationListResponse.builder()
                .code(123L)
                .currentTime(123L)
                .data(
                    StopLocationListResponse.Data.builder()
                        .limitExceeded(true)
                        .list(
                            listOf(
                                StopLocationListResponse.Data.List.builder()
                                    .id("id")
                                    .lat(42.23)
                                    .lon(42.23)
                                    .name("name")
                                    .parent("parent")
                                    .routeIds(listOf("string"))
                                    .staticRouteIds(listOf("string"))
                                    .code("code")
                                    .direction("direction")
                                    .locationType(123L)
                                    .wheelchairBoarding("wheelchairBoarding")
                                    .build()
                            )
                        )
                        .references(
                            StopLocationListResponse.Data.References.builder()
                                .agencies(
                                    listOf(
                                        StopLocationListResponse.Data.References.Agency.builder()
                                            .id("id")
                                            .name("name")
                                            .timezone("timezone")
                                            .url("url")
                                            .disclaimer("disclaimer")
                                            .email("email")
                                            .fareUrl("fareUrl")
                                            .lang("lang")
                                            .phone("phone")
                                            .privateService(true)
                                            .build()
                                    )
                                )
                                .routes(
                                    listOf(
                                        StopLocationListResponse.Data.References.Route.builder()
                                            .id("id")
                                            .agencyId("agencyId")
                                            .type(123L)
                                            .color("color")
                                            .description("description")
                                            .longName("longName")
                                            .nullSafeShortName("nullSafeShortName")
                                            .shortName("shortName")
                                            .textColor("textColor")
                                            .url("url")
                                            .build()
                                    )
                                )
                                .situations(
                                    listOf(
                                        StopLocationListResponse.Data.References.Situation.builder()
                                            .id("id")
                                            .creationTime(123L)
                                            .activeWindows(
                                                listOf(
                                                    StopLocationListResponse.Data.References
                                                        .Situation
                                                        .ActiveWindow
                                                        .builder()
                                                        .from(123L)
                                                        .to(123L)
                                                        .build()
                                                )
                                            )
                                            .allAffects(
                                                listOf(
                                                    StopLocationListResponse.Data.References
                                                        .Situation
                                                        .AllAffect
                                                        .builder()
                                                        .agencyId("agencyId")
                                                        .applicationId("applicationId")
                                                        .directionId("directionId")
                                                        .routeId("routeId")
                                                        .stopId("stopId")
                                                        .tripId("tripId")
                                                        .build()
                                                )
                                            )
                                            .consequenceMessage("consequenceMessage")
                                            .consequences(
                                                listOf(
                                                    StopLocationListResponse.Data.References
                                                        .Situation
                                                        .Consequence
                                                        .builder()
                                                        .condition("condition")
                                                        .conditionDetails(
                                                            StopLocationListResponse.Data.References
                                                                .Situation
                                                                .Consequence
                                                                .ConditionDetails
                                                                .builder()
                                                                .diversionPath(
                                                                    StopLocationListResponse.Data
                                                                        .References
                                                                        .Situation
                                                                        .Consequence
                                                                        .ConditionDetails
                                                                        .DiversionPath
                                                                        .builder()
                                                                        .length(123L)
                                                                        .levels("levels")
                                                                        .points("points")
                                                                        .build()
                                                                )
                                                                .diversionStopIds(listOf("string"))
                                                                .build()
                                                        )
                                                        .build()
                                                )
                                            )
                                            .description(
                                                StopLocationListResponse.Data.References.Situation
                                                    .Description
                                                    .builder()
                                                    .lang("lang")
                                                    .value("value")
                                                    .build()
                                            )
                                            .publicationWindows(
                                                listOf(
                                                    StopLocationListResponse.Data.References
                                                        .Situation
                                                        .PublicationWindow
                                                        .builder()
                                                        .from(123L)
                                                        .to(123L)
                                                        .build()
                                                )
                                            )
                                            .reason(
                                                StopLocationListResponse.Data.References.Situation
                                                    .Reason
                                                    .EQUIPMENT_REASON
                                            )
                                            .severity("severity")
                                            .summary(
                                                StopLocationListResponse.Data.References.Situation
                                                    .Summary
                                                    .builder()
                                                    .lang("lang")
                                                    .value("value")
                                                    .build()
                                            )
                                            .url(
                                                StopLocationListResponse.Data.References.Situation
                                                    .Url
                                                    .builder()
                                                    .lang("lang")
                                                    .value("value")
                                                    .build()
                                            )
                                            .build()
                                    )
                                )
                                .stops(
                                    listOf(
                                        StopLocationListResponse.Data.References.Stop.builder()
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
                                .stopTimes(
                                    listOf(
                                        StopLocationListResponse.Data.References.StopTime.builder()
                                            .arrivalTime(123L)
                                            .departureTime(123L)
                                            .distanceAlongTrip(42.23)
                                            .historicalOccupancy("historicalOccupancy")
                                            .stopHeadsign("stopHeadsign")
                                            .stopId("stopId")
                                            .build()
                                    )
                                )
                                .trips(
                                    listOf(
                                        StopLocationListResponse.Data.References.Trip.builder()
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
        assertThat(stopLocationListResponse).isNotNull
        assertThat(stopLocationListResponse.code()).isEqualTo(123L)
        assertThat(stopLocationListResponse.currentTime()).isEqualTo(123L)
        assertThat(stopLocationListResponse.data())
            .isEqualTo(
                StopLocationListResponse.Data.builder()
                    .limitExceeded(true)
                    .list(
                        listOf(
                            StopLocationListResponse.Data.List.builder()
                                .id("id")
                                .lat(42.23)
                                .lon(42.23)
                                .name("name")
                                .parent("parent")
                                .routeIds(listOf("string"))
                                .staticRouteIds(listOf("string"))
                                .code("code")
                                .direction("direction")
                                .locationType(123L)
                                .wheelchairBoarding("wheelchairBoarding")
                                .build()
                        )
                    )
                    .references(
                        StopLocationListResponse.Data.References.builder()
                            .agencies(
                                listOf(
                                    StopLocationListResponse.Data.References.Agency.builder()
                                        .id("id")
                                        .name("name")
                                        .timezone("timezone")
                                        .url("url")
                                        .disclaimer("disclaimer")
                                        .email("email")
                                        .fareUrl("fareUrl")
                                        .lang("lang")
                                        .phone("phone")
                                        .privateService(true)
                                        .build()
                                )
                            )
                            .routes(
                                listOf(
                                    StopLocationListResponse.Data.References.Route.builder()
                                        .id("id")
                                        .agencyId("agencyId")
                                        .type(123L)
                                        .color("color")
                                        .description("description")
                                        .longName("longName")
                                        .nullSafeShortName("nullSafeShortName")
                                        .shortName("shortName")
                                        .textColor("textColor")
                                        .url("url")
                                        .build()
                                )
                            )
                            .situations(
                                listOf(
                                    StopLocationListResponse.Data.References.Situation.builder()
                                        .id("id")
                                        .creationTime(123L)
                                        .activeWindows(
                                            listOf(
                                                StopLocationListResponse.Data.References.Situation
                                                    .ActiveWindow
                                                    .builder()
                                                    .from(123L)
                                                    .to(123L)
                                                    .build()
                                            )
                                        )
                                        .allAffects(
                                            listOf(
                                                StopLocationListResponse.Data.References.Situation
                                                    .AllAffect
                                                    .builder()
                                                    .agencyId("agencyId")
                                                    .applicationId("applicationId")
                                                    .directionId("directionId")
                                                    .routeId("routeId")
                                                    .stopId("stopId")
                                                    .tripId("tripId")
                                                    .build()
                                            )
                                        )
                                        .consequenceMessage("consequenceMessage")
                                        .consequences(
                                            listOf(
                                                StopLocationListResponse.Data.References.Situation
                                                    .Consequence
                                                    .builder()
                                                    .condition("condition")
                                                    .conditionDetails(
                                                        StopLocationListResponse.Data.References
                                                            .Situation
                                                            .Consequence
                                                            .ConditionDetails
                                                            .builder()
                                                            .diversionPath(
                                                                StopLocationListResponse.Data
                                                                    .References
                                                                    .Situation
                                                                    .Consequence
                                                                    .ConditionDetails
                                                                    .DiversionPath
                                                                    .builder()
                                                                    .length(123L)
                                                                    .levels("levels")
                                                                    .points("points")
                                                                    .build()
                                                            )
                                                            .diversionStopIds(listOf("string"))
                                                            .build()
                                                    )
                                                    .build()
                                            )
                                        )
                                        .description(
                                            StopLocationListResponse.Data.References.Situation
                                                .Description
                                                .builder()
                                                .lang("lang")
                                                .value("value")
                                                .build()
                                        )
                                        .publicationWindows(
                                            listOf(
                                                StopLocationListResponse.Data.References.Situation
                                                    .PublicationWindow
                                                    .builder()
                                                    .from(123L)
                                                    .to(123L)
                                                    .build()
                                            )
                                        )
                                        .reason(
                                            StopLocationListResponse.Data.References.Situation
                                                .Reason
                                                .EQUIPMENT_REASON
                                        )
                                        .severity("severity")
                                        .summary(
                                            StopLocationListResponse.Data.References.Situation
                                                .Summary
                                                .builder()
                                                .lang("lang")
                                                .value("value")
                                                .build()
                                        )
                                        .url(
                                            StopLocationListResponse.Data.References.Situation.Url
                                                .builder()
                                                .lang("lang")
                                                .value("value")
                                                .build()
                                        )
                                        .build()
                                )
                            )
                            .stops(
                                listOf(
                                    StopLocationListResponse.Data.References.Stop.builder()
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
                            .stopTimes(
                                listOf(
                                    StopLocationListResponse.Data.References.StopTime.builder()
                                        .arrivalTime(123L)
                                        .departureTime(123L)
                                        .distanceAlongTrip(42.23)
                                        .historicalOccupancy("historicalOccupancy")
                                        .stopHeadsign("stopHeadsign")
                                        .stopId("stopId")
                                        .build()
                                )
                            )
                            .trips(
                                listOf(
                                    StopLocationListResponse.Data.References.Trip.builder()
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
        assertThat(stopLocationListResponse.text()).isEqualTo("text")
        assertThat(stopLocationListResponse.version()).isEqualTo(123L)
    }
}
