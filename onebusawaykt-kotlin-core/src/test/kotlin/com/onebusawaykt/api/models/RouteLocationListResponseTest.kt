// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RouteLocationListResponseTest {

    @Test
    fun createRouteLocationListResponse() {
        val routeLocationListResponse =
            RouteLocationListResponse.builder()
                .code(123L)
                .currentTime(123L)
                .data(
                    RouteLocationListResponse.Data.builder()
                        .limitExceeded(true)
                        .list(
                            listOf(
                                RouteLocationListResponse.Data.List.builder()
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
                        .outOfRange(true)
                        .references(
                            RouteLocationListResponse.Data.References.builder()
                                .agencies(
                                    listOf(
                                        RouteLocationListResponse.Data.References.Agency.builder()
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
                                        RouteLocationListResponse.Data.References.Route.builder()
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
                                        RouteLocationListResponse.Data.References.Situation
                                            .builder()
                                            .id("id")
                                            .creationTime(123L)
                                            .activeWindows(
                                                listOf(
                                                    RouteLocationListResponse.Data.References
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
                                                    RouteLocationListResponse.Data.References
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
                                                    RouteLocationListResponse.Data.References
                                                        .Situation
                                                        .Consequence
                                                        .builder()
                                                        .condition("condition")
                                                        .conditionDetails(
                                                            RouteLocationListResponse.Data
                                                                .References
                                                                .Situation
                                                                .Consequence
                                                                .ConditionDetails
                                                                .builder()
                                                                .diversionPath(
                                                                    RouteLocationListResponse.Data
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
                                                RouteLocationListResponse.Data.References.Situation
                                                    .Description
                                                    .builder()
                                                    .lang("lang")
                                                    .value("value")
                                                    .build()
                                            )
                                            .publicationWindows(
                                                listOf(
                                                    RouteLocationListResponse.Data.References
                                                        .Situation
                                                        .PublicationWindow
                                                        .builder()
                                                        .from(123L)
                                                        .to(123L)
                                                        .build()
                                                )
                                            )
                                            .reason(
                                                RouteLocationListResponse.Data.References.Situation
                                                    .Reason
                                                    .EQUIPMENT_REASON
                                            )
                                            .severity("severity")
                                            .summary(
                                                RouteLocationListResponse.Data.References.Situation
                                                    .Summary
                                                    .builder()
                                                    .lang("lang")
                                                    .value("value")
                                                    .build()
                                            )
                                            .url(
                                                RouteLocationListResponse.Data.References.Situation
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
                                        RouteLocationListResponse.Data.References.Stop.builder()
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
                                        RouteLocationListResponse.Data.References.StopTime.builder()
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
                                        RouteLocationListResponse.Data.References.Trip.builder()
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
        assertThat(routeLocationListResponse).isNotNull
        assertThat(routeLocationListResponse.code()).isEqualTo(123L)
        assertThat(routeLocationListResponse.currentTime()).isEqualTo(123L)
        assertThat(routeLocationListResponse.data())
            .isEqualTo(
                RouteLocationListResponse.Data.builder()
                    .limitExceeded(true)
                    .list(
                        listOf(
                            RouteLocationListResponse.Data.List.builder()
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
                    .outOfRange(true)
                    .references(
                        RouteLocationListResponse.Data.References.builder()
                            .agencies(
                                listOf(
                                    RouteLocationListResponse.Data.References.Agency.builder()
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
                                    RouteLocationListResponse.Data.References.Route.builder()
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
                                    RouteLocationListResponse.Data.References.Situation.builder()
                                        .id("id")
                                        .creationTime(123L)
                                        .activeWindows(
                                            listOf(
                                                RouteLocationListResponse.Data.References.Situation
                                                    .ActiveWindow
                                                    .builder()
                                                    .from(123L)
                                                    .to(123L)
                                                    .build()
                                            )
                                        )
                                        .allAffects(
                                            listOf(
                                                RouteLocationListResponse.Data.References.Situation
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
                                                RouteLocationListResponse.Data.References.Situation
                                                    .Consequence
                                                    .builder()
                                                    .condition("condition")
                                                    .conditionDetails(
                                                        RouteLocationListResponse.Data.References
                                                            .Situation
                                                            .Consequence
                                                            .ConditionDetails
                                                            .builder()
                                                            .diversionPath(
                                                                RouteLocationListResponse.Data
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
                                            RouteLocationListResponse.Data.References.Situation
                                                .Description
                                                .builder()
                                                .lang("lang")
                                                .value("value")
                                                .build()
                                        )
                                        .publicationWindows(
                                            listOf(
                                                RouteLocationListResponse.Data.References.Situation
                                                    .PublicationWindow
                                                    .builder()
                                                    .from(123L)
                                                    .to(123L)
                                                    .build()
                                            )
                                        )
                                        .reason(
                                            RouteLocationListResponse.Data.References.Situation
                                                .Reason
                                                .EQUIPMENT_REASON
                                        )
                                        .severity("severity")
                                        .summary(
                                            RouteLocationListResponse.Data.References.Situation
                                                .Summary
                                                .builder()
                                                .lang("lang")
                                                .value("value")
                                                .build()
                                        )
                                        .url(
                                            RouteLocationListResponse.Data.References.Situation.Url
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
                                    RouteLocationListResponse.Data.References.Stop.builder()
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
                                    RouteLocationListResponse.Data.References.StopTime.builder()
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
                                    RouteLocationListResponse.Data.References.Trip.builder()
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
        assertThat(routeLocationListResponse.text()).isEqualTo("text")
        assertThat(routeLocationListResponse.version()).isEqualTo(123L)
    }
}