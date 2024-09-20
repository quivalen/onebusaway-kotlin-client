// File generated from our OpenAPI spec by Stainless.

package com.configure_me_test1obw_sdk.api.models

import com.configure_me_test1obw_sdk.api.core.NoAutoDetect
import com.configure_me_test1obw_sdk.api.core.toUnmodifiable
import com.configure_me_test1obw_sdk.api.models.*
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

class WhereArrivalsAndDeparturesForStopRetrieveParams
constructor(
    private val stopId: String,
    private val minutesAfter: Long?,
    private val minutesBefore: Long?,
    private val time: OffsetDateTime?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun stopId(): String = stopId

    fun minutesAfter(): Long? = minutesAfter

    fun minutesBefore(): Long? = minutesBefore

    fun time(): OffsetDateTime? = time

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.minutesAfter?.let { params.put("minutesAfter", listOf(it.toString())) }
        this.minutesBefore?.let { params.put("minutesBefore", listOf(it.toString())) }
        this.time?.let {
            params.put("time", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> stopId
            else -> ""
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WhereArrivalsAndDeparturesForStopRetrieveParams &&
            this.stopId == other.stopId &&
            this.minutesAfter == other.minutesAfter &&
            this.minutesBefore == other.minutesBefore &&
            this.time == other.time &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            stopId,
            minutesAfter,
            minutesBefore,
            time,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "WhereArrivalsAndDeparturesForStopRetrieveParams{stopId=$stopId, minutesAfter=$minutesAfter, minutesBefore=$minutesBefore, time=$time, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var stopId: String? = null
        private var minutesAfter: Long? = null
        private var minutesBefore: Long? = null
        private var time: OffsetDateTime? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        internal fun from(
            whereArrivalsAndDeparturesForStopRetrieveParams:
                WhereArrivalsAndDeparturesForStopRetrieveParams
        ) = apply {
            this.stopId = whereArrivalsAndDeparturesForStopRetrieveParams.stopId
            this.minutesAfter = whereArrivalsAndDeparturesForStopRetrieveParams.minutesAfter
            this.minutesBefore = whereArrivalsAndDeparturesForStopRetrieveParams.minutesBefore
            this.time = whereArrivalsAndDeparturesForStopRetrieveParams.time
            additionalQueryParams(
                whereArrivalsAndDeparturesForStopRetrieveParams.additionalQueryParams
            )
            additionalHeaders(whereArrivalsAndDeparturesForStopRetrieveParams.additionalHeaders)
        }

        fun stopId(stopId: String) = apply { this.stopId = stopId }

        /** Include vehicles arriving or departing in the next n minutes. */
        fun minutesAfter(minutesAfter: Long) = apply { this.minutesAfter = minutesAfter }

        /** Include vehicles having arrived or departed in the previous n minutes. */
        fun minutesBefore(minutesBefore: Long) = apply { this.minutesBefore = minutesBefore }

        /** The specific time for querying the system status. */
        fun time(time: OffsetDateTime) = apply { this.time = time }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun build(): WhereArrivalsAndDeparturesForStopRetrieveParams =
            WhereArrivalsAndDeparturesForStopRetrieveParams(
                checkNotNull(stopId) { "`stopId` is required but was not set" },
                minutesAfter,
                minutesBefore,
                time,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }
}
