// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.put
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.onebusawaykt.api.client.OnebusawayktClient
import com.onebusawaykt.api.client.okhttp.OnebusawayktOkHttpClient
import com.onebusawaykt.api.core.jsonMapper
import com.onebusawaykt.api.models.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@WireMockTest
class ServiceParamsTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper()

    private lateinit var client: OnebusawayktClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client = OnebusawayktOkHttpClient.builder().baseUrl(wmRuntimeInfo.getHttpBaseUrl()).build()
    }

    @Test
    fun configsRetrieveWithAdditionalParams() {
        val additionalHeaders = mutableMapOf<String, List<String>>()

        additionalHeaders.put("x-test-header", listOf("abc1234"))

        val additionalQueryParams = mutableMapOf<String, List<String>>()

        additionalQueryParams.put("test_query_param", listOf("def567"))

        val params =
            ConfigRetrieveParams.builder()
                .additionalHeaders(additionalHeaders)
                .additionalQueryParams(additionalQueryParams)
                .build()

        val apiResponse =
            ConfigRetrieveResponse.builder()
                .code(123L)
                .currentTime(123L)
                .data(
                    ConfigRetrieveResponse.Data.builder()
                        .entry(
                            ConfigRetrieveResponse.Data.Entry.builder()
                                .id("id")
                                .gitProperties(
                                    ConfigRetrieveResponse.Data.Entry.GitProperties.builder()
                                        .gitBranch("git.branch")
                                        .gitBuildHost("git.build.host")
                                        .gitBuildTime("git.build.time")
                                        .gitBuildUserEmail("git.build.user.email")
                                        .gitBuildUserName("git.build.user.name")
                                        .gitBuildVersion("git.build.version")
                                        .gitClosestTagCommitCount("git.closest.tag.commit.count")
                                        .gitClosestTagName("git.closest.tag.name")
                                        .gitCommitId("git.commit.id")
                                        .gitCommitIdAbbrev("git.commit.id.abbrev")
                                        .gitCommitIdDescribe("git.commit.id.describe")
                                        .gitCommitIdDescribeShort("git.commit.id.describe-short")
                                        .gitCommitMessageFull("git.commit.message.full")
                                        .gitCommitMessageShort("git.commit.message.short")
                                        .gitCommitTime("git.commit.time")
                                        .gitCommitUserEmail("git.commit.user.email")
                                        .gitCommitUserName("git.commit.user.name")
                                        .gitDirty("git.dirty")
                                        .gitRemoteOriginUrl("git.remote.origin.url")
                                        .gitTags("git.tags")
                                        .build()
                                )
                                .name("name")
                                .serviceDateFrom("serviceDateFrom")
                                .serviceDateTo("serviceDateTo")
                                .build()
                        )
                        .references(
                            ConfigRetrieveResponse.Data.References.builder()
                                .agencies(
                                    listOf(
                                        ConfigRetrieveResponse.Data.References.Agency.builder()
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
                                        ConfigRetrieveResponse.Data.References.Route.builder()
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
                                        ConfigRetrieveResponse.Data.References.Situation.builder()
                                            .id("id")
                                            .creationTime(123L)
                                            .activeWindows(
                                                listOf(
                                                    ConfigRetrieveResponse.Data.References.Situation
                                                        .ActiveWindow
                                                        .builder()
                                                        .from(123L)
                                                        .to(123L)
                                                        .build()
                                                )
                                            )
                                            .allAffects(
                                                listOf(
                                                    ConfigRetrieveResponse.Data.References.Situation
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
                                                    ConfigRetrieveResponse.Data.References.Situation
                                                        .Consequence
                                                        .builder()
                                                        .condition("condition")
                                                        .conditionDetails(
                                                            ConfigRetrieveResponse.Data.References
                                                                .Situation
                                                                .Consequence
                                                                .ConditionDetails
                                                                .builder()
                                                                .diversionPath(
                                                                    ConfigRetrieveResponse.Data
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
                                                ConfigRetrieveResponse.Data.References.Situation
                                                    .Description
                                                    .builder()
                                                    .lang("lang")
                                                    .value("value")
                                                    .build()
                                            )
                                            .publicationWindows(
                                                listOf(
                                                    ConfigRetrieveResponse.Data.References.Situation
                                                        .PublicationWindow
                                                        .builder()
                                                        .from(123L)
                                                        .to(123L)
                                                        .build()
                                                )
                                            )
                                            .reason(
                                                ConfigRetrieveResponse.Data.References.Situation
                                                    .Reason
                                                    .EQUIPMENT_REASON
                                            )
                                            .severity("severity")
                                            .summary(
                                                ConfigRetrieveResponse.Data.References.Situation
                                                    .Summary
                                                    .builder()
                                                    .lang("lang")
                                                    .value("value")
                                                    .build()
                                            )
                                            .url(
                                                ConfigRetrieveResponse.Data.References.Situation.Url
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
                                        ConfigRetrieveResponse.Data.References.Stop.builder()
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
                                        ConfigRetrieveResponse.Data.References.StopTime.builder()
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
                                        ConfigRetrieveResponse.Data.References.Trip.builder()
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

        stubFor(
            get(anyUrl())
                .withHeader("x-test-header", equalTo("abc1234"))
                .withQueryParam("test_query_param", equalTo("def567"))
                .willReturn(ok(JSON_MAPPER.writeValueAsString(apiResponse)))
        )

        client.config().retrieve(params)

        verify(getRequestedFor(anyUrl()))
    }
}
