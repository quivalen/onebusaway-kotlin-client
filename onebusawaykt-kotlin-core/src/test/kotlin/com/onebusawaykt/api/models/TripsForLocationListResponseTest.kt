// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TripsForLocationListResponseTest {

    @Test
    fun createTripsForLocationListResponse() {
        val tripsForLocationListResponse =
            TripsForLocationListResponse.builder()
                .code(123L)
                .currentTime(123L)
                .data(
                    TripsForLocationListResponse.Data.builder()
                        .limitExceeded(true)
                        .list(
                            listOf(
                                TripsForLocationListResponse.Data.List.builder()
                                    .schedule(
                                        TripsForLocationListResponse.Data.List.Schedule.builder()
                                            .nextTripId("nextTripId")
                                            .previousTripId("previousTripId")
                                            .stopTimes(
                                                listOf(
                                                    TripsForLocationListResponse.Data.List.Schedule
                                                        .StopTime
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
                                            .timeZone("timeZone")
                                            .frequency("frequency")
                                            .build()
                                    )
                                    .status(
                                        TripsForLocationListResponse.Data.List.Status.builder()
                                            .activeTripId("activeTripId")
                                            .blockTripSequence(123L)
                                            .closestStop("closestStop")
                                            .distanceAlongTrip(42.23)
                                            .lastKnownDistanceAlongTrip(42.23)
                                            .lastLocationUpdateTime(123L)
                                            .lastUpdateTime(123L)
                                            .occupancyCapacity(123L)
                                            .occupancyCount(123L)
                                            .occupancyStatus("occupancyStatus")
                                            .phase("phase")
                                            .predicted(true)
                                            .scheduleDeviation(123L)
                                            .serviceDate(123L)
                                            .status("status")
                                            .totalDistanceAlongTrip(42.23)
                                            .closestStopTimeOffset(123L)
                                            .frequency("frequency")
                                            .lastKnownLocation(
                                                TripsForLocationListResponse.Data.List.Status
                                                    .LastKnownLocation
                                                    .builder()
                                                    .lat(42.23)
                                                    .lon(42.23)
                                                    .build()
                                            )
                                            .lastKnownOrientation(42.23)
                                            .nextStop("nextStop")
                                            .nextStopTimeOffset(123L)
                                            .orientation(42.23)
                                            .position(
                                                TripsForLocationListResponse.Data.List.Status
                                                    .Position
                                                    .builder()
                                                    .lat(42.23)
                                                    .lon(42.23)
                                                    .build()
                                            )
                                            .scheduledDistanceAlongTrip(42.23)
                                            .situationIds(listOf("string"))
                                            .vehicleId("vehicleId")
                                            .build()
                                    )
                                    .tripId("tripId")
                                    .frequency("frequency")
                                    .serviceDate(123L)
                                    .situationIds(listOf("string"))
                                    .build()
                            )
                        )
                        .references(
                            TripsForLocationListResponse.Data.References.builder()
                                .agencies(
                                    listOf(
                                        TripsForLocationListResponse.Data.References.Agency
                                            .builder()
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
                                        TripsForLocationListResponse.Data.References.Route.builder()
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
                                        TripsForLocationListResponse.Data.References.Situation
                                            .builder()
                                            .id("id")
                                            .creationTime(123L)
                                            .activeWindows(
                                                listOf(
                                                    TripsForLocationListResponse.Data.References
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
                                                    TripsForLocationListResponse.Data.References
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
                                                    TripsForLocationListResponse.Data.References
                                                        .Situation
                                                        .Consequence
                                                        .builder()
                                                        .condition("condition")
                                                        .conditionDetails(
                                                            TripsForLocationListResponse.Data
                                                                .References
                                                                .Situation
                                                                .Consequence
                                                                .ConditionDetails
                                                                .builder()
                                                                .diversionPath(
                                                                    TripsForLocationListResponse
                                                                        .Data
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
                                                TripsForLocationListResponse.Data.References
                                                    .Situation
                                                    .Description
                                                    .builder()
                                                    .lang("lang")
                                                    .value("value")
                                                    .build()
                                            )
                                            .publicationWindows(
                                                listOf(
                                                    TripsForLocationListResponse.Data.References
                                                        .Situation
                                                        .PublicationWindow
                                                        .builder()
                                                        .from(123L)
                                                        .to(123L)
                                                        .build()
                                                )
                                            )
                                            .reason(
                                                TripsForLocationListResponse.Data.References
                                                    .Situation
                                                    .Reason
                                                    .EQUIPMENT_REASON
                                            )
                                            .severity("severity")
                                            .summary(
                                                TripsForLocationListResponse.Data.References
                                                    .Situation
                                                    .Summary
                                                    .builder()
                                                    .lang("lang")
                                                    .value("value")
                                                    .build()
                                            )
                                            .url(
                                                TripsForLocationListResponse.Data.References
                                                    .Situation
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
                                        TripsForLocationListResponse.Data.References.Stop.builder()
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
                                        TripsForLocationListResponse.Data.References.StopTime
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
                                        TripsForLocationListResponse.Data.References.Trip.builder()
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
                        .outOfRange(true)
                        .build()
                )
                .text("text")
                .version(123L)
                .build()
        assertThat(tripsForLocationListResponse).isNotNull
        assertThat(tripsForLocationListResponse.code()).isEqualTo(123L)
        assertThat(tripsForLocationListResponse.currentTime()).isEqualTo(123L)
        assertThat(tripsForLocationListResponse.data())
            .isEqualTo(
                TripsForLocationListResponse.Data.builder()
                    .limitExceeded(true)
                    .list(
                        listOf(
                            TripsForLocationListResponse.Data.List.builder()
                                .schedule(
                                    TripsForLocationListResponse.Data.List.Schedule.builder()
                                        .nextTripId("nextTripId")
                                        .previousTripId("previousTripId")
                                        .stopTimes(
                                            listOf(
                                                TripsForLocationListResponse.Data.List.Schedule
                                                    .StopTime
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
                                        .timeZone("timeZone")
                                        .frequency("frequency")
                                        .build()
                                )
                                .status(
                                    TripsForLocationListResponse.Data.List.Status.builder()
                                        .activeTripId("activeTripId")
                                        .blockTripSequence(123L)
                                        .closestStop("closestStop")
                                        .distanceAlongTrip(42.23)
                                        .lastKnownDistanceAlongTrip(42.23)
                                        .lastLocationUpdateTime(123L)
                                        .lastUpdateTime(123L)
                                        .occupancyCapacity(123L)
                                        .occupancyCount(123L)
                                        .occupancyStatus("occupancyStatus")
                                        .phase("phase")
                                        .predicted(true)
                                        .scheduleDeviation(123L)
                                        .serviceDate(123L)
                                        .status("status")
                                        .totalDistanceAlongTrip(42.23)
                                        .closestStopTimeOffset(123L)
                                        .frequency("frequency")
                                        .lastKnownLocation(
                                            TripsForLocationListResponse.Data.List.Status
                                                .LastKnownLocation
                                                .builder()
                                                .lat(42.23)
                                                .lon(42.23)
                                                .build()
                                        )
                                        .lastKnownOrientation(42.23)
                                        .nextStop("nextStop")
                                        .nextStopTimeOffset(123L)
                                        .orientation(42.23)
                                        .position(
                                            TripsForLocationListResponse.Data.List.Status.Position
                                                .builder()
                                                .lat(42.23)
                                                .lon(42.23)
                                                .build()
                                        )
                                        .scheduledDistanceAlongTrip(42.23)
                                        .situationIds(listOf("string"))
                                        .vehicleId("vehicleId")
                                        .build()
                                )
                                .tripId("tripId")
                                .frequency("frequency")
                                .serviceDate(123L)
                                .situationIds(listOf("string"))
                                .build()
                        )
                    )
                    .references(
                        TripsForLocationListResponse.Data.References.builder()
                            .agencies(
                                listOf(
                                    TripsForLocationListResponse.Data.References.Agency.builder()
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
                                    TripsForLocationListResponse.Data.References.Route.builder()
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
                                    TripsForLocationListResponse.Data.References.Situation.builder()
                                        .id("id")
                                        .creationTime(123L)
                                        .activeWindows(
                                            listOf(
                                                TripsForLocationListResponse.Data.References
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
                                                TripsForLocationListResponse.Data.References
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
                                                TripsForLocationListResponse.Data.References
                                                    .Situation
                                                    .Consequence
                                                    .builder()
                                                    .condition("condition")
                                                    .conditionDetails(
                                                        TripsForLocationListResponse.Data.References
                                                            .Situation
                                                            .Consequence
                                                            .ConditionDetails
                                                            .builder()
                                                            .diversionPath(
                                                                TripsForLocationListResponse.Data
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
                                            TripsForLocationListResponse.Data.References.Situation
                                                .Description
                                                .builder()
                                                .lang("lang")
                                                .value("value")
                                                .build()
                                        )
                                        .publicationWindows(
                                            listOf(
                                                TripsForLocationListResponse.Data.References
                                                    .Situation
                                                    .PublicationWindow
                                                    .builder()
                                                    .from(123L)
                                                    .to(123L)
                                                    .build()
                                            )
                                        )
                                        .reason(
                                            TripsForLocationListResponse.Data.References.Situation
                                                .Reason
                                                .EQUIPMENT_REASON
                                        )
                                        .severity("severity")
                                        .summary(
                                            TripsForLocationListResponse.Data.References.Situation
                                                .Summary
                                                .builder()
                                                .lang("lang")
                                                .value("value")
                                                .build()
                                        )
                                        .url(
                                            TripsForLocationListResponse.Data.References.Situation
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
                                    TripsForLocationListResponse.Data.References.Stop.builder()
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
                                    TripsForLocationListResponse.Data.References.StopTime.builder()
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
                                    TripsForLocationListResponse.Data.References.Trip.builder()
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
                    .outOfRange(true)
                    .build()
            )
        assertThat(tripsForLocationListResponse.text()).isEqualTo("text")
        assertThat(tripsForLocationListResponse.version()).isEqualTo(123L)
    }
}
