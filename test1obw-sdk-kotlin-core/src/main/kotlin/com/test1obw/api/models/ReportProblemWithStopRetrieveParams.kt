// File generated from our OpenAPI spec by Stainless.

package com.test1obw.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.test1obw.api.core.Enum
import com.test1obw.api.core.JsonField
import com.test1obw.api.core.JsonValue
import com.test1obw.api.core.NoAutoDetect
import com.test1obw.api.core.toUnmodifiable
import com.test1obw.api.errors.Test1obwSdkInvalidDataException
import com.test1obw.api.models.*
import java.util.Objects

class ReportProblemWithStopRetrieveParams
constructor(
    private val stopId: String,
    private val code: Code?,
    private val userComment: String?,
    private val userLat: Double?,
    private val userLocationAccuracy: Double?,
    private val userLon: Double?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun stopId(): String = stopId

    fun code(): Code? = code

    fun userComment(): String? = userComment

    fun userLat(): Double? = userLat

    fun userLocationAccuracy(): Double? = userLocationAccuracy

    fun userLon(): Double? = userLon

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.code?.let { params.put("code", listOf(it.toString())) }
        this.userComment?.let { params.put("userComment", listOf(it.toString())) }
        this.userLat?.let { params.put("userLat", listOf(it.toString())) }
        this.userLocationAccuracy?.let { params.put("userLocationAccuracy", listOf(it.toString())) }
        this.userLon?.let { params.put("userLon", listOf(it.toString())) }
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

        return other is ReportProblemWithStopRetrieveParams &&
            this.stopId == other.stopId &&
            this.code == other.code &&
            this.userComment == other.userComment &&
            this.userLat == other.userLat &&
            this.userLocationAccuracy == other.userLocationAccuracy &&
            this.userLon == other.userLon &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            stopId,
            code,
            userComment,
            userLat,
            userLocationAccuracy,
            userLon,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "ReportProblemWithStopRetrieveParams{stopId=$stopId, code=$code, userComment=$userComment, userLat=$userLat, userLocationAccuracy=$userLocationAccuracy, userLon=$userLon, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var stopId: String? = null
        private var code: Code? = null
        private var userComment: String? = null
        private var userLat: Double? = null
        private var userLocationAccuracy: Double? = null
        private var userLon: Double? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        internal fun from(
            reportProblemWithStopRetrieveParams: ReportProblemWithStopRetrieveParams
        ) = apply {
            this.stopId = reportProblemWithStopRetrieveParams.stopId
            this.code = reportProblemWithStopRetrieveParams.code
            this.userComment = reportProblemWithStopRetrieveParams.userComment
            this.userLat = reportProblemWithStopRetrieveParams.userLat
            this.userLocationAccuracy = reportProblemWithStopRetrieveParams.userLocationAccuracy
            this.userLon = reportProblemWithStopRetrieveParams.userLon
            additionalQueryParams(reportProblemWithStopRetrieveParams.additionalQueryParams)
            additionalHeaders(reportProblemWithStopRetrieveParams.additionalHeaders)
        }

        fun stopId(stopId: String) = apply { this.stopId = stopId }

        /** A string code identifying the nature of the problem */
        fun code(code: Code) = apply { this.code = code }

        /** Additional comment text supplied by the user describing the problem */
        fun userComment(userComment: String) = apply { this.userComment = userComment }

        /** The reporting user’s current latitude */
        fun userLat(userLat: Double) = apply { this.userLat = userLat }

        /** The reporting user’s location accuracy, in meters */
        fun userLocationAccuracy(userLocationAccuracy: Double) = apply {
            this.userLocationAccuracy = userLocationAccuracy
        }

        /** The reporting user’s current longitude */
        fun userLon(userLon: Double) = apply { this.userLon = userLon }

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

        fun build(): ReportProblemWithStopRetrieveParams =
            ReportProblemWithStopRetrieveParams(
                checkNotNull(stopId) { "`stopId` is required but was not set" },
                code,
                userComment,
                userLat,
                userLocationAccuracy,
                userLon,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }

    class Code
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Code && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val STOP_NAME_WRONG = Code(JsonField.of("stop_name_wrong"))

            val STOP_NUMBER_WRONG = Code(JsonField.of("stop_number_wrong"))

            val STOP_LOCATION_WRONG = Code(JsonField.of("stop_location_wrong"))

            val ROUTE_OR_TRIP_MISSING = Code(JsonField.of("route_or_trip_missing"))

            val OTHER = Code(JsonField.of("other"))

            fun of(value: String) = Code(JsonField.of(value))
        }

        enum class Known {
            STOP_NAME_WRONG,
            STOP_NUMBER_WRONG,
            STOP_LOCATION_WRONG,
            ROUTE_OR_TRIP_MISSING,
            OTHER,
        }

        enum class Value {
            STOP_NAME_WRONG,
            STOP_NUMBER_WRONG,
            STOP_LOCATION_WRONG,
            ROUTE_OR_TRIP_MISSING,
            OTHER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                STOP_NAME_WRONG -> Value.STOP_NAME_WRONG
                STOP_NUMBER_WRONG -> Value.STOP_NUMBER_WRONG
                STOP_LOCATION_WRONG -> Value.STOP_LOCATION_WRONG
                ROUTE_OR_TRIP_MISSING -> Value.ROUTE_OR_TRIP_MISSING
                OTHER -> Value.OTHER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                STOP_NAME_WRONG -> Known.STOP_NAME_WRONG
                STOP_NUMBER_WRONG -> Known.STOP_NUMBER_WRONG
                STOP_LOCATION_WRONG -> Known.STOP_LOCATION_WRONG
                ROUTE_OR_TRIP_MISSING -> Known.ROUTE_OR_TRIP_MISSING
                OTHER -> Known.OTHER
                else -> throw Test1obwSdkInvalidDataException("Unknown Code: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
