// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AgencyRoutesIdListResponseTest {

    @Test
    fun createAgencyRoutesIdListResponse() {
        val agencyRoutesIdListResponse =
            AgencyRoutesIdListResponse.builder()
                .code(123L)
                .currentTime(123L)
                .data(
                    AgencyRoutesIdListResponse.Data.builder()
                        .limitExceeded(true)
                        .list(listOf("string"))
                        .references(
                            AgencyRoutesIdListResponse.Data.References.builder()
                                .agencies(
                                    listOf(
                                        AgencyRoutesIdListResponse.Data.References.Agency.builder()
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
                                        AgencyRoutesIdListResponse.Data.References.Route.builder()
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
                                        AgencyRoutesIdListResponse.Data.References.Situation
                                            .builder()
                                            .id("id")
                                            .creationTime(123L)
                                            .activeWindows(
                                                listOf(
                                                    AgencyRoutesIdListResponse.Data.References
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
                                                    AgencyRoutesIdListResponse.Data.References
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
                                                    AgencyRoutesIdListResponse.Data.References
                                                        .Situation
                                                        .Consequence
                                                        .builder()
                                                        .condition("condition")
                                                        .conditionDetails(
                                                            AgencyRoutesIdListResponse.Data
                                                                .References
                                                                .Situation
                                                                .Consequence
                                                                .ConditionDetails
                                                                .builder()
                                                                .diversionPath(
                                                                    AgencyRoutesIdListResponse.Data
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
                                                AgencyRoutesIdListResponse.Data.References.Situation
                                                    .Description
                                                    .builder()
                                                    .lang("lang")
                                                    .value("value")
                                                    .build()
                                            )
                                            .publicationWindows(
                                                listOf(
                                                    AgencyRoutesIdListResponse.Data.References
                                                        .Situation
                                                        .PublicationWindow
                                                        .builder()
                                                        .from(123L)
                                                        .to(123L)
                                                        .build()
                                                )
                                            )
                                            .reason(
                                                AgencyRoutesIdListResponse.Data.References.Situation
                                                    .Reason
                                                    .EQUIPMENT_REASON
                                            )
                                            .severity("severity")
                                            .summary(
                                                AgencyRoutesIdListResponse.Data.References.Situation
                                                    .Summary
                                                    .builder()
                                                    .lang("lang")
                                                    .value("value")
                                                    .build()
                                            )
                                            .url(
                                                AgencyRoutesIdListResponse.Data.References.Situation
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
                                        AgencyRoutesIdListResponse.Data.References.Stop.builder()
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
                                        AgencyRoutesIdListResponse.Data.References.StopTime
                                            .builder()
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
                                        AgencyRoutesIdListResponse.Data.References.Trip.builder()
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
        assertThat(agencyRoutesIdListResponse).isNotNull
        assertThat(agencyRoutesIdListResponse.code()).isEqualTo(123L)
        assertThat(agencyRoutesIdListResponse.currentTime()).isEqualTo(123L)
        assertThat(agencyRoutesIdListResponse.data())
            .isEqualTo(
                AgencyRoutesIdListResponse.Data.builder()
                    .limitExceeded(true)
                    .list(listOf("string"))
                    .references(
                        AgencyRoutesIdListResponse.Data.References.builder()
                            .agencies(
                                listOf(
                                    AgencyRoutesIdListResponse.Data.References.Agency.builder()
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
                                    AgencyRoutesIdListResponse.Data.References.Route.builder()
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
                                    AgencyRoutesIdListResponse.Data.References.Situation.builder()
                                        .id("id")
                                        .creationTime(123L)
                                        .activeWindows(
                                            listOf(
                                                AgencyRoutesIdListResponse.Data.References.Situation
                                                    .ActiveWindow
                                                    .builder()
                                                    .from(123L)
                                                    .to(123L)
                                                    .build()
                                            )
                                        )
                                        .allAffects(
                                            listOf(
                                                AgencyRoutesIdListResponse.Data.References.Situation
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
                                                AgencyRoutesIdListResponse.Data.References.Situation
                                                    .Consequence
                                                    .builder()
                                                    .condition("condition")
                                                    .conditionDetails(
                                                        AgencyRoutesIdListResponse.Data.References
                                                            .Situation
                                                            .Consequence
                                                            .ConditionDetails
                                                            .builder()
                                                            .diversionPath(
                                                                AgencyRoutesIdListResponse.Data
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
                                            AgencyRoutesIdListResponse.Data.References.Situation
                                                .Description
                                                .builder()
                                                .lang("lang")
                                                .value("value")
                                                .build()
                                        )
                                        .publicationWindows(
                                            listOf(
                                                AgencyRoutesIdListResponse.Data.References.Situation
                                                    .PublicationWindow
                                                    .builder()
                                                    .from(123L)
                                                    .to(123L)
                                                    .build()
                                            )
                                        )
                                        .reason(
                                            AgencyRoutesIdListResponse.Data.References.Situation
                                                .Reason
                                                .EQUIPMENT_REASON
                                        )
                                        .severity("severity")
                                        .summary(
                                            AgencyRoutesIdListResponse.Data.References.Situation
                                                .Summary
                                                .builder()
                                                .lang("lang")
                                                .value("value")
                                                .build()
                                        )
                                        .url(
                                            AgencyRoutesIdListResponse.Data.References.Situation.Url
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
                                    AgencyRoutesIdListResponse.Data.References.Stop.builder()
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
                                    AgencyRoutesIdListResponse.Data.References.StopTime.builder()
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
                                    AgencyRoutesIdListResponse.Data.References.Trip.builder()
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
        assertThat(agencyRoutesIdListResponse.text()).isEqualTo("text")
        assertThat(agencyRoutesIdListResponse.version()).isEqualTo(123L)
    }
}