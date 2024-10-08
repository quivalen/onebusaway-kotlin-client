// File generated from our OpenAPI spec by Stainless.

package com.test1obw.api.models

import com.test1obw.api.core.NoAutoDetect
import com.test1obw.api.core.toUnmodifiable
import com.test1obw.api.models.*
import java.util.Objects

class TripsForLocationListParams
constructor(
    private val lat: Double,
    private val latSpan: Double,
    private val lon: Double,
    private val lonSpan: Double,
    private val includeSchedule: Boolean?,
    private val includeTrip: Boolean?,
    private val time: Long?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun lat(): Double = lat

    fun latSpan(): Double = latSpan

    fun lon(): Double = lon

    fun lonSpan(): Double = lonSpan

    fun includeSchedule(): Boolean? = includeSchedule

    fun includeTrip(): Boolean? = includeTrip

    fun time(): Long? = time

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.lat.let { params.put("lat", listOf(it.toString())) }
        this.latSpan.let { params.put("latSpan", listOf(it.toString())) }
        this.lon.let { params.put("lon", listOf(it.toString())) }
        this.lonSpan.let { params.put("lonSpan", listOf(it.toString())) }
        this.includeSchedule?.let { params.put("includeSchedule", listOf(it.toString())) }
        this.includeTrip?.let { params.put("includeTrip", listOf(it.toString())) }
        this.time?.let { params.put("time", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TripsForLocationListParams &&
            this.lat == other.lat &&
            this.latSpan == other.latSpan &&
            this.lon == other.lon &&
            this.lonSpan == other.lonSpan &&
            this.includeSchedule == other.includeSchedule &&
            this.includeTrip == other.includeTrip &&
            this.time == other.time &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            lat,
            latSpan,
            lon,
            lonSpan,
            includeSchedule,
            includeTrip,
            time,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "TripsForLocationListParams{lat=$lat, latSpan=$latSpan, lon=$lon, lonSpan=$lonSpan, includeSchedule=$includeSchedule, includeTrip=$includeTrip, time=$time, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var lat: Double? = null
        private var latSpan: Double? = null
        private var lon: Double? = null
        private var lonSpan: Double? = null
        private var includeSchedule: Boolean? = null
        private var includeTrip: Boolean? = null
        private var time: Long? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        internal fun from(tripsForLocationListParams: TripsForLocationListParams) = apply {
            this.lat = tripsForLocationListParams.lat
            this.latSpan = tripsForLocationListParams.latSpan
            this.lon = tripsForLocationListParams.lon
            this.lonSpan = tripsForLocationListParams.lonSpan
            this.includeSchedule = tripsForLocationListParams.includeSchedule
            this.includeTrip = tripsForLocationListParams.includeTrip
            this.time = tripsForLocationListParams.time
            additionalQueryParams(tripsForLocationListParams.additionalQueryParams)
            additionalHeaders(tripsForLocationListParams.additionalHeaders)
        }

        /** The latitude coordinate of the search center */
        fun lat(lat: Double) = apply { this.lat = lat }

        /** Latitude span of the search bounding box */
        fun latSpan(latSpan: Double) = apply { this.latSpan = latSpan }

        /** The longitude coordinate of the search center */
        fun lon(lon: Double) = apply { this.lon = lon }

        /** Longitude span of the search bounding box */
        fun lonSpan(lonSpan: Double) = apply { this.lonSpan = lonSpan }

        /**
         * Whether to include full schedule elements in the tripDetails section. Defaults to false.
         */
        fun includeSchedule(includeSchedule: Boolean) = apply {
            this.includeSchedule = includeSchedule
        }

        /** Whether to include full trip elements in the references section. Defaults to false. */
        fun includeTrip(includeTrip: Boolean) = apply { this.includeTrip = includeTrip }

        /** Specific time for the query. Defaults to the current time. */
        fun time(time: Long) = apply { this.time = time }

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

        fun build(): TripsForLocationListParams =
            TripsForLocationListParams(
                checkNotNull(lat) { "`lat` is required but was not set" },
                checkNotNull(latSpan) { "`latSpan` is required but was not set" },
                checkNotNull(lon) { "`lon` is required but was not set" },
                checkNotNull(lonSpan) { "`lonSpan` is required but was not set" },
                includeSchedule,
                includeTrip,
                time,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }
}
