// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.google.common.collect.ImmutableListMultimap
import com.google.common.collect.ListMultimap
import com.onebusawaykt.api.client.OnebusawayktClient
import com.onebusawaykt.api.client.okhttp.OnebusawayktOkHttpClient
import com.onebusawaykt.api.core.JsonString
import com.onebusawaykt.api.core.jsonMapper
import com.onebusawaykt.api.errors.BadRequestException
import com.onebusawaykt.api.errors.InternalServerException
import com.onebusawaykt.api.errors.NotFoundException
import com.onebusawaykt.api.errors.OnebusawayktError
import com.onebusawaykt.api.errors.OnebusawayktException
import com.onebusawaykt.api.errors.PermissionDeniedException
import com.onebusawaykt.api.errors.RateLimitException
import com.onebusawaykt.api.errors.UnauthorizedException
import com.onebusawaykt.api.errors.UnexpectedStatusCodeException
import com.onebusawaykt.api.errors.UnprocessableEntityException
import com.onebusawaykt.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.assertj.core.api.InstanceOfAssertFactories
import org.assertj.guava.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@WireMockTest
class ErrorHandlingTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper()

    private val ONEBUSAWAYKT_ERROR: OnebusawayktError =
        OnebusawayktError.builder().putAdditionalProperty("key", JsonString.of("value")).build()

    private lateinit var client: OnebusawayktClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client = OnebusawayktOkHttpClient.builder().baseUrl(wmRuntimeInfo.getHttpBaseUrl()).build()
    }

    @Test
    fun configsRetrieve200() {
        val params = ConfigRetrieveParams.builder().build()

        val expected =
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

        stubFor(get(anyUrl()).willReturn(ok().withBody(toJson(expected))))

        assertThat(client.config().retrieve(params)).isEqualTo(expected)
    }

    @Test
    fun configsRetrieve400() {
        val params = ConfigRetrieveParams.builder().build()

        stubFor(
            get(anyUrl())
                .willReturn(
                    status(400).withHeader("Foo", "Bar").withBody(toJson(ONEBUSAWAYKT_ERROR))
                )
        )

        assertThatThrownBy({ client.config().retrieve(params) })
            .satisfies({ e ->
                assertBadRequest(e, ImmutableListMultimap.of("Foo", "Bar"), ONEBUSAWAYKT_ERROR)
            })
    }

    @Test
    fun configsRetrieve401() {
        val params = ConfigRetrieveParams.builder().build()

        stubFor(
            get(anyUrl())
                .willReturn(
                    status(401).withHeader("Foo", "Bar").withBody(toJson(ONEBUSAWAYKT_ERROR))
                )
        )

        assertThatThrownBy({ client.config().retrieve(params) })
            .satisfies({ e ->
                assertUnauthorized(e, ImmutableListMultimap.of("Foo", "Bar"), ONEBUSAWAYKT_ERROR)
            })
    }

    @Test
    fun configsRetrieve403() {
        val params = ConfigRetrieveParams.builder().build()

        stubFor(
            get(anyUrl())
                .willReturn(
                    status(403).withHeader("Foo", "Bar").withBody(toJson(ONEBUSAWAYKT_ERROR))
                )
        )

        assertThatThrownBy({ client.config().retrieve(params) })
            .satisfies({ e ->
                assertPermissionDenied(
                    e,
                    ImmutableListMultimap.of("Foo", "Bar"),
                    ONEBUSAWAYKT_ERROR
                )
            })
    }

    @Test
    fun configsRetrieve404() {
        val params = ConfigRetrieveParams.builder().build()

        stubFor(
            get(anyUrl())
                .willReturn(
                    status(404).withHeader("Foo", "Bar").withBody(toJson(ONEBUSAWAYKT_ERROR))
                )
        )

        assertThatThrownBy({ client.config().retrieve(params) })
            .satisfies({ e ->
                assertNotFound(e, ImmutableListMultimap.of("Foo", "Bar"), ONEBUSAWAYKT_ERROR)
            })
    }

    @Test
    fun configsRetrieve422() {
        val params = ConfigRetrieveParams.builder().build()

        stubFor(
            get(anyUrl())
                .willReturn(
                    status(422).withHeader("Foo", "Bar").withBody(toJson(ONEBUSAWAYKT_ERROR))
                )
        )

        assertThatThrownBy({ client.config().retrieve(params) })
            .satisfies({ e ->
                assertUnprocessableEntity(
                    e,
                    ImmutableListMultimap.of("Foo", "Bar"),
                    ONEBUSAWAYKT_ERROR
                )
            })
    }

    @Test
    fun configsRetrieve429() {
        val params = ConfigRetrieveParams.builder().build()

        stubFor(
            get(anyUrl())
                .willReturn(
                    status(429).withHeader("Foo", "Bar").withBody(toJson(ONEBUSAWAYKT_ERROR))
                )
        )

        assertThatThrownBy({ client.config().retrieve(params) })
            .satisfies({ e ->
                assertRateLimit(e, ImmutableListMultimap.of("Foo", "Bar"), ONEBUSAWAYKT_ERROR)
            })
    }

    @Test
    fun configsRetrieve500() {
        val params = ConfigRetrieveParams.builder().build()

        stubFor(
            get(anyUrl())
                .willReturn(
                    status(500).withHeader("Foo", "Bar").withBody(toJson(ONEBUSAWAYKT_ERROR))
                )
        )

        assertThatThrownBy({ client.config().retrieve(params) })
            .satisfies({ e ->
                assertInternalServer(e, ImmutableListMultimap.of("Foo", "Bar"), ONEBUSAWAYKT_ERROR)
            })
    }

    @Test
    fun unexpectedStatusCode() {
        val params = ConfigRetrieveParams.builder().build()

        stubFor(
            get(anyUrl())
                .willReturn(
                    status(999).withHeader("Foo", "Bar").withBody(toJson(ONEBUSAWAYKT_ERROR))
                )
        )

        assertThatThrownBy({ client.config().retrieve(params) })
            .satisfies({ e ->
                assertUnexpectedStatusCodeException(
                    e,
                    999,
                    ImmutableListMultimap.of("Foo", "Bar"),
                    toJson(ONEBUSAWAYKT_ERROR)
                )
            })
    }

    @Test
    fun invalidBody() {
        val params = ConfigRetrieveParams.builder().build()

        stubFor(get(anyUrl()).willReturn(status(200).withBody("Not JSON")))

        assertThatThrownBy({ client.config().retrieve(params) })
            .satisfies({ e ->
                assertThat(e)
                    .isInstanceOf(OnebusawayktException::class.java)
                    .hasMessage("Error reading response")
            })
    }

    @Test
    fun invalidErrorBody() {
        val params = ConfigRetrieveParams.builder().build()

        stubFor(get(anyUrl()).willReturn(status(400).withBody("Not JSON")))

        assertThatThrownBy({ client.config().retrieve(params) })
            .satisfies({ e ->
                assertBadRequest(e, ImmutableListMultimap.of(), OnebusawayktError.builder().build())
            })
    }

    private fun <T> toJson(body: T): ByteArray {
        return JSON_MAPPER.writeValueAsBytes(body)
    }

    private fun assertUnexpectedStatusCodeException(
        throwable: Throwable,
        statusCode: Int,
        headers: ListMultimap<String, String>,
        responseBody: ByteArray
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnexpectedStatusCodeException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(statusCode)
                assertThat(e.body()).isEqualTo(String(responseBody))
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertBadRequest(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: OnebusawayktError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(BadRequestException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(400)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertUnauthorized(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: OnebusawayktError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(UnauthorizedException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(401)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertPermissionDenied(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: OnebusawayktError
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(PermissionDeniedException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(403)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertNotFound(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: OnebusawayktError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(NotFoundException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(404)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertUnprocessableEntity(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: OnebusawayktError
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnprocessableEntityException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(422)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertRateLimit(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: OnebusawayktError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(RateLimitException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(429)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertInternalServer(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: OnebusawayktError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(InternalServerException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(500)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }
}
