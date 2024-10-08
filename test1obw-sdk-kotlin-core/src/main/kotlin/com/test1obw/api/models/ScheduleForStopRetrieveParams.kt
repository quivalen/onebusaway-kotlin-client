// File generated from our OpenAPI spec by Stainless.

package com.test1obw.api.models

import com.test1obw.api.core.NoAutoDetect
import com.test1obw.api.core.toUnmodifiable
import com.test1obw.api.models.*
import java.time.LocalDate
import java.util.Objects

class ScheduleForStopRetrieveParams
constructor(
    private val stopId: String,
    private val date: LocalDate?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun stopId(): String = stopId

    fun date(): LocalDate? = date

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.date?.let { params.put("date", listOf(it.toString())) }
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

        return other is ScheduleForStopRetrieveParams &&
            this.stopId == other.stopId &&
            this.date == other.date &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            stopId,
            date,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "ScheduleForStopRetrieveParams{stopId=$stopId, date=$date, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var stopId: String? = null
        private var date: LocalDate? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        internal fun from(scheduleForStopRetrieveParams: ScheduleForStopRetrieveParams) = apply {
            this.stopId = scheduleForStopRetrieveParams.stopId
            this.date = scheduleForStopRetrieveParams.date
            additionalQueryParams(scheduleForStopRetrieveParams.additionalQueryParams)
            additionalHeaders(scheduleForStopRetrieveParams.additionalHeaders)
        }

        fun stopId(stopId: String) = apply { this.stopId = stopId }

        /**
         * The date for which you want to request a schedule in the format YYYY-MM-DD (optional,
         * defaults to the current date)
         */
        fun date(date: LocalDate) = apply { this.date = date }

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

        fun build(): ScheduleForStopRetrieveParams =
            ScheduleForStopRetrieveParams(
                checkNotNull(stopId) { "`stopId` is required but was not set" },
                date,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }
}
