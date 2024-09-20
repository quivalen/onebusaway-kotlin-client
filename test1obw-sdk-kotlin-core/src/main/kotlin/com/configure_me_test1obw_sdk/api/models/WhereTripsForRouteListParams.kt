// File generated from our OpenAPI spec by Stainless.

package com.configure_me_test1obw_sdk.api.models

import com.configure_me_test1obw_sdk.api.core.NoAutoDetect
import com.configure_me_test1obw_sdk.api.core.toUnmodifiable
import com.configure_me_test1obw_sdk.api.models.*
import java.util.Objects

class WhereTripsForRouteListParams
constructor(
    private val routeId: String,
    private val includeSchedule: Boolean?,
    private val includeStatus: Boolean?,
    private val time: Long?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun routeId(): String = routeId

    fun includeSchedule(): Boolean? = includeSchedule

    fun includeStatus(): Boolean? = includeStatus

    fun time(): Long? = time

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.includeSchedule?.let { params.put("includeSchedule", listOf(it.toString())) }
        this.includeStatus?.let { params.put("includeStatus", listOf(it.toString())) }
        this.time?.let { params.put("time", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> routeId
            else -> ""
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WhereTripsForRouteListParams &&
            this.routeId == other.routeId &&
            this.includeSchedule == other.includeSchedule &&
            this.includeStatus == other.includeStatus &&
            this.time == other.time &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            routeId,
            includeSchedule,
            includeStatus,
            time,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "WhereTripsForRouteListParams{routeId=$routeId, includeSchedule=$includeSchedule, includeStatus=$includeStatus, time=$time, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var routeId: String? = null
        private var includeSchedule: Boolean? = null
        private var includeStatus: Boolean? = null
        private var time: Long? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        internal fun from(whereTripsForRouteListParams: WhereTripsForRouteListParams) = apply {
            this.routeId = whereTripsForRouteListParams.routeId
            this.includeSchedule = whereTripsForRouteListParams.includeSchedule
            this.includeStatus = whereTripsForRouteListParams.includeStatus
            this.time = whereTripsForRouteListParams.time
            additionalQueryParams(whereTripsForRouteListParams.additionalQueryParams)
            additionalHeaders(whereTripsForRouteListParams.additionalHeaders)
        }

        fun routeId(routeId: String) = apply { this.routeId = routeId }

        /** Determine whether full schedule elements are included. Defaults to false. */
        fun includeSchedule(includeSchedule: Boolean) = apply {
            this.includeSchedule = includeSchedule
        }

        /**
         * Determine whether full tripStatus elements with real-time information are included.
         * Defaults to false.
         */
        fun includeStatus(includeStatus: Boolean) = apply { this.includeStatus = includeStatus }

        /** Query the system at a specific time. Useful for testing. */
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

        fun build(): WhereTripsForRouteListParams =
            WhereTripsForRouteListParams(
                checkNotNull(routeId) { "`routeId` is required but was not set" },
                includeSchedule,
                includeStatus,
                time,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }
}
