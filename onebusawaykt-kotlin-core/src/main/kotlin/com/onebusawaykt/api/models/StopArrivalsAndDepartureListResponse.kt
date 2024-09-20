// File generated from our OpenAPI spec by Stainless.

package com.onebusawaykt.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.onebusawaykt.api.core.Enum
import com.onebusawaykt.api.core.ExcludeMissing
import com.onebusawaykt.api.core.JsonField
import com.onebusawaykt.api.core.JsonMissing
import com.onebusawaykt.api.core.JsonValue
import com.onebusawaykt.api.core.NoAutoDetect
import com.onebusawaykt.api.core.toUnmodifiable
import com.onebusawaykt.api.errors.OnebusawayktInvalidDataException
import java.util.Objects

@JsonDeserialize(builder = StopArrivalsAndDepartureListResponse.Builder::class)
@NoAutoDetect
class StopArrivalsAndDepartureListResponse
private constructor(
    private val code: JsonField<Long>,
    private val currentTime: JsonField<Long>,
    private val text: JsonField<String>,
    private val version: JsonField<Long>,
    private val data: JsonField<Data>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun code(): Long = code.getRequired("code")

    fun currentTime(): Long = currentTime.getRequired("currentTime")

    fun text(): String = text.getRequired("text")

    fun version(): Long = version.getRequired("version")

    fun data(): Data = data.getRequired("data")

    @JsonProperty("code") @ExcludeMissing fun _code() = code

    @JsonProperty("currentTime") @ExcludeMissing fun _currentTime() = currentTime

    @JsonProperty("text") @ExcludeMissing fun _text() = text

    @JsonProperty("version") @ExcludeMissing fun _version() = version

    @JsonProperty("data") @ExcludeMissing fun _data() = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): StopArrivalsAndDepartureListResponse = apply {
        if (!validated) {
            code()
            currentTime()
            text()
            version()
            data().validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StopArrivalsAndDepartureListResponse &&
            this.code == other.code &&
            this.currentTime == other.currentTime &&
            this.text == other.text &&
            this.version == other.version &&
            this.data == other.data &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    code,
                    currentTime,
                    text,
                    version,
                    data,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "StopArrivalsAndDepartureListResponse{code=$code, currentTime=$currentTime, text=$text, version=$version, data=$data, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var code: JsonField<Long> = JsonMissing.of()
        private var currentTime: JsonField<Long> = JsonMissing.of()
        private var text: JsonField<String> = JsonMissing.of()
        private var version: JsonField<Long> = JsonMissing.of()
        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            stopArrivalsAndDepartureListResponse: StopArrivalsAndDepartureListResponse
        ) = apply {
            this.code = stopArrivalsAndDepartureListResponse.code
            this.currentTime = stopArrivalsAndDepartureListResponse.currentTime
            this.text = stopArrivalsAndDepartureListResponse.text
            this.version = stopArrivalsAndDepartureListResponse.version
            this.data = stopArrivalsAndDepartureListResponse.data
            additionalProperties(stopArrivalsAndDepartureListResponse.additionalProperties)
        }

        fun code(code: Long) = code(JsonField.of(code))

        @JsonProperty("code")
        @ExcludeMissing
        fun code(code: JsonField<Long>) = apply { this.code = code }

        fun currentTime(currentTime: Long) = currentTime(JsonField.of(currentTime))

        @JsonProperty("currentTime")
        @ExcludeMissing
        fun currentTime(currentTime: JsonField<Long>) = apply { this.currentTime = currentTime }

        fun text(text: String) = text(JsonField.of(text))

        @JsonProperty("text")
        @ExcludeMissing
        fun text(text: JsonField<String>) = apply { this.text = text }

        fun version(version: Long) = version(JsonField.of(version))

        @JsonProperty("version")
        @ExcludeMissing
        fun version(version: JsonField<Long>) = apply { this.version = version }

        fun data(data: Data) = data(JsonField.of(data))

        @JsonProperty("data")
        @ExcludeMissing
        fun data(data: JsonField<Data>) = apply { this.data = data }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): StopArrivalsAndDepartureListResponse =
            StopArrivalsAndDepartureListResponse(
                code,
                currentTime,
                text,
                version,
                data,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Data.Builder::class)
    @NoAutoDetect
    class Data
    private constructor(
        private val entry: JsonField<Entry>,
        private val references: JsonField<References>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun entry(): Entry = entry.getRequired("entry")

        fun references(): References = references.getRequired("references")

        @JsonProperty("entry") @ExcludeMissing fun _entry() = entry

        @JsonProperty("references") @ExcludeMissing fun _references() = references

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Data = apply {
            if (!validated) {
                entry().validate()
                references().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                this.entry == other.entry &&
                this.references == other.references &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        entry,
                        references,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Data{entry=$entry, references=$references, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var entry: JsonField<Entry> = JsonMissing.of()
            private var references: JsonField<References> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                this.entry = data.entry
                this.references = data.references
                additionalProperties(data.additionalProperties)
            }

            fun entry(entry: Entry) = entry(JsonField.of(entry))

            @JsonProperty("entry")
            @ExcludeMissing
            fun entry(entry: JsonField<Entry>) = apply { this.entry = entry }

            fun references(references: References) = references(JsonField.of(references))

            @JsonProperty("references")
            @ExcludeMissing
            fun references(references: JsonField<References>) = apply {
                this.references = references
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Data =
                Data(
                    entry,
                    references,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = Entry.Builder::class)
        @NoAutoDetect
        class Entry
        private constructor(
            private val arrivalsAndDepartures: JsonField<List<ArrivalsAndDeparture>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun arrivalsAndDepartures(): List<ArrivalsAndDeparture> =
                arrivalsAndDepartures.getRequired("arrivalsAndDepartures")

            @JsonProperty("arrivalsAndDepartures")
            @ExcludeMissing
            fun _arrivalsAndDepartures() = arrivalsAndDepartures

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Entry = apply {
                if (!validated) {
                    arrivalsAndDepartures().forEach { it.validate() }
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Entry &&
                    this.arrivalsAndDepartures == other.arrivalsAndDepartures &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(arrivalsAndDepartures, additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "Entry{arrivalsAndDepartures=$arrivalsAndDepartures, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var arrivalsAndDepartures: JsonField<List<ArrivalsAndDeparture>> =
                    JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(entry: Entry) = apply {
                    this.arrivalsAndDepartures = entry.arrivalsAndDepartures
                    additionalProperties(entry.additionalProperties)
                }

                fun arrivalsAndDepartures(arrivalsAndDepartures: List<ArrivalsAndDeparture>) =
                    arrivalsAndDepartures(JsonField.of(arrivalsAndDepartures))

                @JsonProperty("arrivalsAndDepartures")
                @ExcludeMissing
                fun arrivalsAndDepartures(
                    arrivalsAndDepartures: JsonField<List<ArrivalsAndDeparture>>
                ) = apply { this.arrivalsAndDepartures = arrivalsAndDepartures }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Entry =
                    Entry(
                        arrivalsAndDepartures.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable()
                    )
            }

            @JsonDeserialize(builder = ArrivalsAndDeparture.Builder::class)
            @NoAutoDetect
            class ArrivalsAndDeparture
            private constructor(
                private val actualTrack: JsonField<String>,
                private val arrivalEnabled: JsonField<Boolean>,
                private val blockTripSequence: JsonField<Long>,
                private val departureEnabled: JsonField<Boolean>,
                private val distanceFromStop: JsonField<Double>,
                private val frequency: JsonField<String>,
                private val historicalOccupancy: JsonField<String>,
                private val lastUpdateTime: JsonField<Long>,
                private val numberOfStopsAway: JsonField<Long>,
                private val occupancyStatus: JsonField<String>,
                private val predicted: JsonField<Boolean>,
                private val predictedArrivalInterval: JsonField<String>,
                private val predictedArrivalTime: JsonField<Long>,
                private val predictedDepartureInterval: JsonField<String>,
                private val predictedDepartureTime: JsonField<Long>,
                private val predictedOccupancy: JsonField<String>,
                private val routeId: JsonField<String>,
                private val routeLongName: JsonField<String>,
                private val routeShortName: JsonField<String>,
                private val scheduledArrivalInterval: JsonField<String>,
                private val scheduledArrivalTime: JsonField<Long>,
                private val scheduledDepartureInterval: JsonField<String>,
                private val scheduledDepartureTime: JsonField<Long>,
                private val scheduledTrack: JsonField<String>,
                private val serviceDate: JsonField<Long>,
                private val situationIds: JsonField<List<String>>,
                private val status: JsonField<String>,
                private val stopId: JsonField<String>,
                private val stopSequence: JsonField<Long>,
                private val totalStopsInTrip: JsonField<Long>,
                private val tripHeadsign: JsonField<String>,
                private val tripId: JsonField<String>,
                private val tripStatus: JsonField<TripStatus>,
                private val vehicleId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** The actual track information of the arriving transit vehicle. */
                fun actualTrack(): String? = actualTrack.getNullable("actualTrack")

                /** Indicates if riders can arrive on this transit vehicle. */
                fun arrivalEnabled(): Boolean = arrivalEnabled.getRequired("arrivalEnabled")

                /** Index of this arrival’s trip into the sequence of trips for the active block. */
                fun blockTripSequence(): Long = blockTripSequence.getRequired("blockTripSequence")

                /** Indicates if riders can depart from this transit vehicle. */
                fun departureEnabled(): Boolean = departureEnabled.getRequired("departureEnabled")

                /** Distance of the arriving transit vehicle from the stop, in meters. */
                fun distanceFromStop(): Double? = distanceFromStop.getNullable("distanceFromStop")

                /** Information about frequency-based scheduling, if applicable to the trip. */
                fun frequency(): String? = frequency.getNullable("frequency")

                /** Historical occupancy information of the transit vehicle. */
                fun historicalOccupancy(): String? =
                    historicalOccupancy.getNullable("historicalOccupancy")

                /** Timestamp of the last update time for this arrival. */
                fun lastUpdateTime(): Long? = lastUpdateTime.getNullable("lastUpdateTime")

                /**
                 * Number of stops between the arriving transit vehicle and the current stop
                 * (excluding the current stop).
                 */
                fun numberOfStopsAway(): Long = numberOfStopsAway.getRequired("numberOfStopsAway")

                /** Current occupancy status of the transit vehicle. */
                fun occupancyStatus(): String? = occupancyStatus.getNullable("occupancyStatus")

                /** Indicates if real-time arrival info is available for this trip. */
                fun predicted(): Boolean? = predicted.getNullable("predicted")

                /** Interval for predicted arrival time, if available. */
                fun predictedArrivalInterval(): String? =
                    predictedArrivalInterval.getNullable("predictedArrivalInterval")

                /**
                 * Predicted arrival time, in milliseconds since Unix epoch (zero if no real-time
                 * available).
                 */
                fun predictedArrivalTime(): Long =
                    predictedArrivalTime.getRequired("predictedArrivalTime")

                /** Interval for predicted departure time, if available. */
                fun predictedDepartureInterval(): String? =
                    predictedDepartureInterval.getNullable("predictedDepartureInterval")

                /**
                 * Predicted departure time, in milliseconds since Unix epoch (zero if no real-time
                 * available).
                 */
                fun predictedDepartureTime(): Long =
                    predictedDepartureTime.getRequired("predictedDepartureTime")

                /** Predicted occupancy status of the transit vehicle. */
                fun predictedOccupancy(): String? =
                    predictedOccupancy.getNullable("predictedOccupancy")

                /** The ID of the route for the arriving vehicle. */
                fun routeId(): String = routeId.getRequired("routeId")

                /**
                 * Optional route long name that potentially overrides the route long name in the
                 * referenced route element.
                 */
                fun routeLongName(): String? = routeLongName.getNullable("routeLongName")

                /**
                 * Optional route short name that potentially overrides the route short name in the
                 * referenced route element.
                 */
                fun routeShortName(): String? = routeShortName.getNullable("routeShortName")

                /** Interval for scheduled arrival time. */
                fun scheduledArrivalInterval(): String? =
                    scheduledArrivalInterval.getNullable("scheduledArrivalInterval")

                /** Scheduled arrival time, in milliseconds since Unix epoch. */
                fun scheduledArrivalTime(): Long =
                    scheduledArrivalTime.getRequired("scheduledArrivalTime")

                /** Interval for scheduled departure time. */
                fun scheduledDepartureInterval(): String? =
                    scheduledDepartureInterval.getNullable("scheduledDepartureInterval")

                /** Scheduled departure time, in milliseconds since Unix epoch. */
                fun scheduledDepartureTime(): Long =
                    scheduledDepartureTime.getRequired("scheduledDepartureTime")

                /** Scheduled track information of the arriving transit vehicle. */
                fun scheduledTrack(): String? = scheduledTrack.getNullable("scheduledTrack")

                /**
                 * Time, in milliseconds since the Unix epoch, of midnight for the start of the
                 * service date for the trip.
                 */
                fun serviceDate(): Long = serviceDate.getRequired("serviceDate")

                /** References to situation elements (if any) applicable to this arrival. */
                fun situationIds(): List<String>? = situationIds.getNullable("situationIds")

                /** Current status of the arrival. */
                fun status(): String? = status.getNullable("status")

                /** The ID of the stop the vehicle is arriving at. */
                fun stopId(): String = stopId.getRequired("stopId")

                /**
                 * Index of the stop into the sequence of stops that make up the trip for this
                 * arrival.
                 */
                fun stopSequence(): Long = stopSequence.getRequired("stopSequence")

                /** Total number of stops visited on the trip for this arrival. */
                fun totalStopsInTrip(): Long = totalStopsInTrip.getRequired("totalStopsInTrip")

                /**
                 * Optional trip headsign that potentially overrides the trip headsign in the
                 * referenced trip element.
                 */
                fun tripHeadsign(): String = tripHeadsign.getRequired("tripHeadsign")

                /** The ID of the trip for the arriving vehicle. */
                fun tripId(): String = tripId.getRequired("tripId")

                /** Trip-specific status for the arriving transit vehicle. */
                fun tripStatus(): TripStatus? = tripStatus.getNullable("tripStatus")

                /** ID of the transit vehicle serving this trip. */
                fun vehicleId(): String = vehicleId.getRequired("vehicleId")

                /** The actual track information of the arriving transit vehicle. */
                @JsonProperty("actualTrack") @ExcludeMissing fun _actualTrack() = actualTrack

                /** Indicates if riders can arrive on this transit vehicle. */
                @JsonProperty("arrivalEnabled")
                @ExcludeMissing
                fun _arrivalEnabled() = arrivalEnabled

                /** Index of this arrival’s trip into the sequence of trips for the active block. */
                @JsonProperty("blockTripSequence")
                @ExcludeMissing
                fun _blockTripSequence() = blockTripSequence

                /** Indicates if riders can depart from this transit vehicle. */
                @JsonProperty("departureEnabled")
                @ExcludeMissing
                fun _departureEnabled() = departureEnabled

                /** Distance of the arriving transit vehicle from the stop, in meters. */
                @JsonProperty("distanceFromStop")
                @ExcludeMissing
                fun _distanceFromStop() = distanceFromStop

                /** Information about frequency-based scheduling, if applicable to the trip. */
                @JsonProperty("frequency") @ExcludeMissing fun _frequency() = frequency

                /** Historical occupancy information of the transit vehicle. */
                @JsonProperty("historicalOccupancy")
                @ExcludeMissing
                fun _historicalOccupancy() = historicalOccupancy

                /** Timestamp of the last update time for this arrival. */
                @JsonProperty("lastUpdateTime")
                @ExcludeMissing
                fun _lastUpdateTime() = lastUpdateTime

                /**
                 * Number of stops between the arriving transit vehicle and the current stop
                 * (excluding the current stop).
                 */
                @JsonProperty("numberOfStopsAway")
                @ExcludeMissing
                fun _numberOfStopsAway() = numberOfStopsAway

                /** Current occupancy status of the transit vehicle. */
                @JsonProperty("occupancyStatus")
                @ExcludeMissing
                fun _occupancyStatus() = occupancyStatus

                /** Indicates if real-time arrival info is available for this trip. */
                @JsonProperty("predicted") @ExcludeMissing fun _predicted() = predicted

                /** Interval for predicted arrival time, if available. */
                @JsonProperty("predictedArrivalInterval")
                @ExcludeMissing
                fun _predictedArrivalInterval() = predictedArrivalInterval

                /**
                 * Predicted arrival time, in milliseconds since Unix epoch (zero if no real-time
                 * available).
                 */
                @JsonProperty("predictedArrivalTime")
                @ExcludeMissing
                fun _predictedArrivalTime() = predictedArrivalTime

                /** Interval for predicted departure time, if available. */
                @JsonProperty("predictedDepartureInterval")
                @ExcludeMissing
                fun _predictedDepartureInterval() = predictedDepartureInterval

                /**
                 * Predicted departure time, in milliseconds since Unix epoch (zero if no real-time
                 * available).
                 */
                @JsonProperty("predictedDepartureTime")
                @ExcludeMissing
                fun _predictedDepartureTime() = predictedDepartureTime

                /** Predicted occupancy status of the transit vehicle. */
                @JsonProperty("predictedOccupancy")
                @ExcludeMissing
                fun _predictedOccupancy() = predictedOccupancy

                /** The ID of the route for the arriving vehicle. */
                @JsonProperty("routeId") @ExcludeMissing fun _routeId() = routeId

                /**
                 * Optional route long name that potentially overrides the route long name in the
                 * referenced route element.
                 */
                @JsonProperty("routeLongName") @ExcludeMissing fun _routeLongName() = routeLongName

                /**
                 * Optional route short name that potentially overrides the route short name in the
                 * referenced route element.
                 */
                @JsonProperty("routeShortName")
                @ExcludeMissing
                fun _routeShortName() = routeShortName

                /** Interval for scheduled arrival time. */
                @JsonProperty("scheduledArrivalInterval")
                @ExcludeMissing
                fun _scheduledArrivalInterval() = scheduledArrivalInterval

                /** Scheduled arrival time, in milliseconds since Unix epoch. */
                @JsonProperty("scheduledArrivalTime")
                @ExcludeMissing
                fun _scheduledArrivalTime() = scheduledArrivalTime

                /** Interval for scheduled departure time. */
                @JsonProperty("scheduledDepartureInterval")
                @ExcludeMissing
                fun _scheduledDepartureInterval() = scheduledDepartureInterval

                /** Scheduled departure time, in milliseconds since Unix epoch. */
                @JsonProperty("scheduledDepartureTime")
                @ExcludeMissing
                fun _scheduledDepartureTime() = scheduledDepartureTime

                /** Scheduled track information of the arriving transit vehicle. */
                @JsonProperty("scheduledTrack")
                @ExcludeMissing
                fun _scheduledTrack() = scheduledTrack

                /**
                 * Time, in milliseconds since the Unix epoch, of midnight for the start of the
                 * service date for the trip.
                 */
                @JsonProperty("serviceDate") @ExcludeMissing fun _serviceDate() = serviceDate

                /** References to situation elements (if any) applicable to this arrival. */
                @JsonProperty("situationIds") @ExcludeMissing fun _situationIds() = situationIds

                /** Current status of the arrival. */
                @JsonProperty("status") @ExcludeMissing fun _status() = status

                /** The ID of the stop the vehicle is arriving at. */
                @JsonProperty("stopId") @ExcludeMissing fun _stopId() = stopId

                /**
                 * Index of the stop into the sequence of stops that make up the trip for this
                 * arrival.
                 */
                @JsonProperty("stopSequence") @ExcludeMissing fun _stopSequence() = stopSequence

                /** Total number of stops visited on the trip for this arrival. */
                @JsonProperty("totalStopsInTrip")
                @ExcludeMissing
                fun _totalStopsInTrip() = totalStopsInTrip

                /**
                 * Optional trip headsign that potentially overrides the trip headsign in the
                 * referenced trip element.
                 */
                @JsonProperty("tripHeadsign") @ExcludeMissing fun _tripHeadsign() = tripHeadsign

                /** The ID of the trip for the arriving vehicle. */
                @JsonProperty("tripId") @ExcludeMissing fun _tripId() = tripId

                /** Trip-specific status for the arriving transit vehicle. */
                @JsonProperty("tripStatus") @ExcludeMissing fun _tripStatus() = tripStatus

                /** ID of the transit vehicle serving this trip. */
                @JsonProperty("vehicleId") @ExcludeMissing fun _vehicleId() = vehicleId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): ArrivalsAndDeparture = apply {
                    if (!validated) {
                        actualTrack()
                        arrivalEnabled()
                        blockTripSequence()
                        departureEnabled()
                        distanceFromStop()
                        frequency()
                        historicalOccupancy()
                        lastUpdateTime()
                        numberOfStopsAway()
                        occupancyStatus()
                        predicted()
                        predictedArrivalInterval()
                        predictedArrivalTime()
                        predictedDepartureInterval()
                        predictedDepartureTime()
                        predictedOccupancy()
                        routeId()
                        routeLongName()
                        routeShortName()
                        scheduledArrivalInterval()
                        scheduledArrivalTime()
                        scheduledDepartureInterval()
                        scheduledDepartureTime()
                        scheduledTrack()
                        serviceDate()
                        situationIds()
                        status()
                        stopId()
                        stopSequence()
                        totalStopsInTrip()
                        tripHeadsign()
                        tripId()
                        tripStatus()?.validate()
                        vehicleId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ArrivalsAndDeparture &&
                        this.actualTrack == other.actualTrack &&
                        this.arrivalEnabled == other.arrivalEnabled &&
                        this.blockTripSequence == other.blockTripSequence &&
                        this.departureEnabled == other.departureEnabled &&
                        this.distanceFromStop == other.distanceFromStop &&
                        this.frequency == other.frequency &&
                        this.historicalOccupancy == other.historicalOccupancy &&
                        this.lastUpdateTime == other.lastUpdateTime &&
                        this.numberOfStopsAway == other.numberOfStopsAway &&
                        this.occupancyStatus == other.occupancyStatus &&
                        this.predicted == other.predicted &&
                        this.predictedArrivalInterval == other.predictedArrivalInterval &&
                        this.predictedArrivalTime == other.predictedArrivalTime &&
                        this.predictedDepartureInterval == other.predictedDepartureInterval &&
                        this.predictedDepartureTime == other.predictedDepartureTime &&
                        this.predictedOccupancy == other.predictedOccupancy &&
                        this.routeId == other.routeId &&
                        this.routeLongName == other.routeLongName &&
                        this.routeShortName == other.routeShortName &&
                        this.scheduledArrivalInterval == other.scheduledArrivalInterval &&
                        this.scheduledArrivalTime == other.scheduledArrivalTime &&
                        this.scheduledDepartureInterval == other.scheduledDepartureInterval &&
                        this.scheduledDepartureTime == other.scheduledDepartureTime &&
                        this.scheduledTrack == other.scheduledTrack &&
                        this.serviceDate == other.serviceDate &&
                        this.situationIds == other.situationIds &&
                        this.status == other.status &&
                        this.stopId == other.stopId &&
                        this.stopSequence == other.stopSequence &&
                        this.totalStopsInTrip == other.totalStopsInTrip &&
                        this.tripHeadsign == other.tripHeadsign &&
                        this.tripId == other.tripId &&
                        this.tripStatus == other.tripStatus &&
                        this.vehicleId == other.vehicleId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                actualTrack,
                                arrivalEnabled,
                                blockTripSequence,
                                departureEnabled,
                                distanceFromStop,
                                frequency,
                                historicalOccupancy,
                                lastUpdateTime,
                                numberOfStopsAway,
                                occupancyStatus,
                                predicted,
                                predictedArrivalInterval,
                                predictedArrivalTime,
                                predictedDepartureInterval,
                                predictedDepartureTime,
                                predictedOccupancy,
                                routeId,
                                routeLongName,
                                routeShortName,
                                scheduledArrivalInterval,
                                scheduledArrivalTime,
                                scheduledDepartureInterval,
                                scheduledDepartureTime,
                                scheduledTrack,
                                serviceDate,
                                situationIds,
                                status,
                                stopId,
                                stopSequence,
                                totalStopsInTrip,
                                tripHeadsign,
                                tripId,
                                tripStatus,
                                vehicleId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "ArrivalsAndDeparture{actualTrack=$actualTrack, arrivalEnabled=$arrivalEnabled, blockTripSequence=$blockTripSequence, departureEnabled=$departureEnabled, distanceFromStop=$distanceFromStop, frequency=$frequency, historicalOccupancy=$historicalOccupancy, lastUpdateTime=$lastUpdateTime, numberOfStopsAway=$numberOfStopsAway, occupancyStatus=$occupancyStatus, predicted=$predicted, predictedArrivalInterval=$predictedArrivalInterval, predictedArrivalTime=$predictedArrivalTime, predictedDepartureInterval=$predictedDepartureInterval, predictedDepartureTime=$predictedDepartureTime, predictedOccupancy=$predictedOccupancy, routeId=$routeId, routeLongName=$routeLongName, routeShortName=$routeShortName, scheduledArrivalInterval=$scheduledArrivalInterval, scheduledArrivalTime=$scheduledArrivalTime, scheduledDepartureInterval=$scheduledDepartureInterval, scheduledDepartureTime=$scheduledDepartureTime, scheduledTrack=$scheduledTrack, serviceDate=$serviceDate, situationIds=$situationIds, status=$status, stopId=$stopId, stopSequence=$stopSequence, totalStopsInTrip=$totalStopsInTrip, tripHeadsign=$tripHeadsign, tripId=$tripId, tripStatus=$tripStatus, vehicleId=$vehicleId, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var actualTrack: JsonField<String> = JsonMissing.of()
                    private var arrivalEnabled: JsonField<Boolean> = JsonMissing.of()
                    private var blockTripSequence: JsonField<Long> = JsonMissing.of()
                    private var departureEnabled: JsonField<Boolean> = JsonMissing.of()
                    private var distanceFromStop: JsonField<Double> = JsonMissing.of()
                    private var frequency: JsonField<String> = JsonMissing.of()
                    private var historicalOccupancy: JsonField<String> = JsonMissing.of()
                    private var lastUpdateTime: JsonField<Long> = JsonMissing.of()
                    private var numberOfStopsAway: JsonField<Long> = JsonMissing.of()
                    private var occupancyStatus: JsonField<String> = JsonMissing.of()
                    private var predicted: JsonField<Boolean> = JsonMissing.of()
                    private var predictedArrivalInterval: JsonField<String> = JsonMissing.of()
                    private var predictedArrivalTime: JsonField<Long> = JsonMissing.of()
                    private var predictedDepartureInterval: JsonField<String> = JsonMissing.of()
                    private var predictedDepartureTime: JsonField<Long> = JsonMissing.of()
                    private var predictedOccupancy: JsonField<String> = JsonMissing.of()
                    private var routeId: JsonField<String> = JsonMissing.of()
                    private var routeLongName: JsonField<String> = JsonMissing.of()
                    private var routeShortName: JsonField<String> = JsonMissing.of()
                    private var scheduledArrivalInterval: JsonField<String> = JsonMissing.of()
                    private var scheduledArrivalTime: JsonField<Long> = JsonMissing.of()
                    private var scheduledDepartureInterval: JsonField<String> = JsonMissing.of()
                    private var scheduledDepartureTime: JsonField<Long> = JsonMissing.of()
                    private var scheduledTrack: JsonField<String> = JsonMissing.of()
                    private var serviceDate: JsonField<Long> = JsonMissing.of()
                    private var situationIds: JsonField<List<String>> = JsonMissing.of()
                    private var status: JsonField<String> = JsonMissing.of()
                    private var stopId: JsonField<String> = JsonMissing.of()
                    private var stopSequence: JsonField<Long> = JsonMissing.of()
                    private var totalStopsInTrip: JsonField<Long> = JsonMissing.of()
                    private var tripHeadsign: JsonField<String> = JsonMissing.of()
                    private var tripId: JsonField<String> = JsonMissing.of()
                    private var tripStatus: JsonField<TripStatus> = JsonMissing.of()
                    private var vehicleId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(arrivalsAndDeparture: ArrivalsAndDeparture) = apply {
                        this.actualTrack = arrivalsAndDeparture.actualTrack
                        this.arrivalEnabled = arrivalsAndDeparture.arrivalEnabled
                        this.blockTripSequence = arrivalsAndDeparture.blockTripSequence
                        this.departureEnabled = arrivalsAndDeparture.departureEnabled
                        this.distanceFromStop = arrivalsAndDeparture.distanceFromStop
                        this.frequency = arrivalsAndDeparture.frequency
                        this.historicalOccupancy = arrivalsAndDeparture.historicalOccupancy
                        this.lastUpdateTime = arrivalsAndDeparture.lastUpdateTime
                        this.numberOfStopsAway = arrivalsAndDeparture.numberOfStopsAway
                        this.occupancyStatus = arrivalsAndDeparture.occupancyStatus
                        this.predicted = arrivalsAndDeparture.predicted
                        this.predictedArrivalInterval =
                            arrivalsAndDeparture.predictedArrivalInterval
                        this.predictedArrivalTime = arrivalsAndDeparture.predictedArrivalTime
                        this.predictedDepartureInterval =
                            arrivalsAndDeparture.predictedDepartureInterval
                        this.predictedDepartureTime = arrivalsAndDeparture.predictedDepartureTime
                        this.predictedOccupancy = arrivalsAndDeparture.predictedOccupancy
                        this.routeId = arrivalsAndDeparture.routeId
                        this.routeLongName = arrivalsAndDeparture.routeLongName
                        this.routeShortName = arrivalsAndDeparture.routeShortName
                        this.scheduledArrivalInterval =
                            arrivalsAndDeparture.scheduledArrivalInterval
                        this.scheduledArrivalTime = arrivalsAndDeparture.scheduledArrivalTime
                        this.scheduledDepartureInterval =
                            arrivalsAndDeparture.scheduledDepartureInterval
                        this.scheduledDepartureTime = arrivalsAndDeparture.scheduledDepartureTime
                        this.scheduledTrack = arrivalsAndDeparture.scheduledTrack
                        this.serviceDate = arrivalsAndDeparture.serviceDate
                        this.situationIds = arrivalsAndDeparture.situationIds
                        this.status = arrivalsAndDeparture.status
                        this.stopId = arrivalsAndDeparture.stopId
                        this.stopSequence = arrivalsAndDeparture.stopSequence
                        this.totalStopsInTrip = arrivalsAndDeparture.totalStopsInTrip
                        this.tripHeadsign = arrivalsAndDeparture.tripHeadsign
                        this.tripId = arrivalsAndDeparture.tripId
                        this.tripStatus = arrivalsAndDeparture.tripStatus
                        this.vehicleId = arrivalsAndDeparture.vehicleId
                        additionalProperties(arrivalsAndDeparture.additionalProperties)
                    }

                    /** The actual track information of the arriving transit vehicle. */
                    fun actualTrack(actualTrack: String) = actualTrack(JsonField.of(actualTrack))

                    /** The actual track information of the arriving transit vehicle. */
                    @JsonProperty("actualTrack")
                    @ExcludeMissing
                    fun actualTrack(actualTrack: JsonField<String>) = apply {
                        this.actualTrack = actualTrack
                    }

                    /** Indicates if riders can arrive on this transit vehicle. */
                    fun arrivalEnabled(arrivalEnabled: Boolean) =
                        arrivalEnabled(JsonField.of(arrivalEnabled))

                    /** Indicates if riders can arrive on this transit vehicle. */
                    @JsonProperty("arrivalEnabled")
                    @ExcludeMissing
                    fun arrivalEnabled(arrivalEnabled: JsonField<Boolean>) = apply {
                        this.arrivalEnabled = arrivalEnabled
                    }

                    /**
                     * Index of this arrival’s trip into the sequence of trips for the active block.
                     */
                    fun blockTripSequence(blockTripSequence: Long) =
                        blockTripSequence(JsonField.of(blockTripSequence))

                    /**
                     * Index of this arrival’s trip into the sequence of trips for the active block.
                     */
                    @JsonProperty("blockTripSequence")
                    @ExcludeMissing
                    fun blockTripSequence(blockTripSequence: JsonField<Long>) = apply {
                        this.blockTripSequence = blockTripSequence
                    }

                    /** Indicates if riders can depart from this transit vehicle. */
                    fun departureEnabled(departureEnabled: Boolean) =
                        departureEnabled(JsonField.of(departureEnabled))

                    /** Indicates if riders can depart from this transit vehicle. */
                    @JsonProperty("departureEnabled")
                    @ExcludeMissing
                    fun departureEnabled(departureEnabled: JsonField<Boolean>) = apply {
                        this.departureEnabled = departureEnabled
                    }

                    /** Distance of the arriving transit vehicle from the stop, in meters. */
                    fun distanceFromStop(distanceFromStop: Double) =
                        distanceFromStop(JsonField.of(distanceFromStop))

                    /** Distance of the arriving transit vehicle from the stop, in meters. */
                    @JsonProperty("distanceFromStop")
                    @ExcludeMissing
                    fun distanceFromStop(distanceFromStop: JsonField<Double>) = apply {
                        this.distanceFromStop = distanceFromStop
                    }

                    /** Information about frequency-based scheduling, if applicable to the trip. */
                    fun frequency(frequency: String) = frequency(JsonField.of(frequency))

                    /** Information about frequency-based scheduling, if applicable to the trip. */
                    @JsonProperty("frequency")
                    @ExcludeMissing
                    fun frequency(frequency: JsonField<String>) = apply {
                        this.frequency = frequency
                    }

                    /** Historical occupancy information of the transit vehicle. */
                    fun historicalOccupancy(historicalOccupancy: String) =
                        historicalOccupancy(JsonField.of(historicalOccupancy))

                    /** Historical occupancy information of the transit vehicle. */
                    @JsonProperty("historicalOccupancy")
                    @ExcludeMissing
                    fun historicalOccupancy(historicalOccupancy: JsonField<String>) = apply {
                        this.historicalOccupancy = historicalOccupancy
                    }

                    /** Timestamp of the last update time for this arrival. */
                    fun lastUpdateTime(lastUpdateTime: Long) =
                        lastUpdateTime(JsonField.of(lastUpdateTime))

                    /** Timestamp of the last update time for this arrival. */
                    @JsonProperty("lastUpdateTime")
                    @ExcludeMissing
                    fun lastUpdateTime(lastUpdateTime: JsonField<Long>) = apply {
                        this.lastUpdateTime = lastUpdateTime
                    }

                    /**
                     * Number of stops between the arriving transit vehicle and the current stop
                     * (excluding the current stop).
                     */
                    fun numberOfStopsAway(numberOfStopsAway: Long) =
                        numberOfStopsAway(JsonField.of(numberOfStopsAway))

                    /**
                     * Number of stops between the arriving transit vehicle and the current stop
                     * (excluding the current stop).
                     */
                    @JsonProperty("numberOfStopsAway")
                    @ExcludeMissing
                    fun numberOfStopsAway(numberOfStopsAway: JsonField<Long>) = apply {
                        this.numberOfStopsAway = numberOfStopsAway
                    }

                    /** Current occupancy status of the transit vehicle. */
                    fun occupancyStatus(occupancyStatus: String) =
                        occupancyStatus(JsonField.of(occupancyStatus))

                    /** Current occupancy status of the transit vehicle. */
                    @JsonProperty("occupancyStatus")
                    @ExcludeMissing
                    fun occupancyStatus(occupancyStatus: JsonField<String>) = apply {
                        this.occupancyStatus = occupancyStatus
                    }

                    /** Indicates if real-time arrival info is available for this trip. */
                    fun predicted(predicted: Boolean) = predicted(JsonField.of(predicted))

                    /** Indicates if real-time arrival info is available for this trip. */
                    @JsonProperty("predicted")
                    @ExcludeMissing
                    fun predicted(predicted: JsonField<Boolean>) = apply {
                        this.predicted = predicted
                    }

                    /** Interval for predicted arrival time, if available. */
                    fun predictedArrivalInterval(predictedArrivalInterval: String) =
                        predictedArrivalInterval(JsonField.of(predictedArrivalInterval))

                    /** Interval for predicted arrival time, if available. */
                    @JsonProperty("predictedArrivalInterval")
                    @ExcludeMissing
                    fun predictedArrivalInterval(predictedArrivalInterval: JsonField<String>) =
                        apply {
                            this.predictedArrivalInterval = predictedArrivalInterval
                        }

                    /**
                     * Predicted arrival time, in milliseconds since Unix epoch (zero if no
                     * real-time available).
                     */
                    fun predictedArrivalTime(predictedArrivalTime: Long) =
                        predictedArrivalTime(JsonField.of(predictedArrivalTime))

                    /**
                     * Predicted arrival time, in milliseconds since Unix epoch (zero if no
                     * real-time available).
                     */
                    @JsonProperty("predictedArrivalTime")
                    @ExcludeMissing
                    fun predictedArrivalTime(predictedArrivalTime: JsonField<Long>) = apply {
                        this.predictedArrivalTime = predictedArrivalTime
                    }

                    /** Interval for predicted departure time, if available. */
                    fun predictedDepartureInterval(predictedDepartureInterval: String) =
                        predictedDepartureInterval(JsonField.of(predictedDepartureInterval))

                    /** Interval for predicted departure time, if available. */
                    @JsonProperty("predictedDepartureInterval")
                    @ExcludeMissing
                    fun predictedDepartureInterval(predictedDepartureInterval: JsonField<String>) =
                        apply {
                            this.predictedDepartureInterval = predictedDepartureInterval
                        }

                    /**
                     * Predicted departure time, in milliseconds since Unix epoch (zero if no
                     * real-time available).
                     */
                    fun predictedDepartureTime(predictedDepartureTime: Long) =
                        predictedDepartureTime(JsonField.of(predictedDepartureTime))

                    /**
                     * Predicted departure time, in milliseconds since Unix epoch (zero if no
                     * real-time available).
                     */
                    @JsonProperty("predictedDepartureTime")
                    @ExcludeMissing
                    fun predictedDepartureTime(predictedDepartureTime: JsonField<Long>) = apply {
                        this.predictedDepartureTime = predictedDepartureTime
                    }

                    /** Predicted occupancy status of the transit vehicle. */
                    fun predictedOccupancy(predictedOccupancy: String) =
                        predictedOccupancy(JsonField.of(predictedOccupancy))

                    /** Predicted occupancy status of the transit vehicle. */
                    @JsonProperty("predictedOccupancy")
                    @ExcludeMissing
                    fun predictedOccupancy(predictedOccupancy: JsonField<String>) = apply {
                        this.predictedOccupancy = predictedOccupancy
                    }

                    /** The ID of the route for the arriving vehicle. */
                    fun routeId(routeId: String) = routeId(JsonField.of(routeId))

                    /** The ID of the route for the arriving vehicle. */
                    @JsonProperty("routeId")
                    @ExcludeMissing
                    fun routeId(routeId: JsonField<String>) = apply { this.routeId = routeId }

                    /**
                     * Optional route long name that potentially overrides the route long name in
                     * the referenced route element.
                     */
                    fun routeLongName(routeLongName: String) =
                        routeLongName(JsonField.of(routeLongName))

                    /**
                     * Optional route long name that potentially overrides the route long name in
                     * the referenced route element.
                     */
                    @JsonProperty("routeLongName")
                    @ExcludeMissing
                    fun routeLongName(routeLongName: JsonField<String>) = apply {
                        this.routeLongName = routeLongName
                    }

                    /**
                     * Optional route short name that potentially overrides the route short name in
                     * the referenced route element.
                     */
                    fun routeShortName(routeShortName: String) =
                        routeShortName(JsonField.of(routeShortName))

                    /**
                     * Optional route short name that potentially overrides the route short name in
                     * the referenced route element.
                     */
                    @JsonProperty("routeShortName")
                    @ExcludeMissing
                    fun routeShortName(routeShortName: JsonField<String>) = apply {
                        this.routeShortName = routeShortName
                    }

                    /** Interval for scheduled arrival time. */
                    fun scheduledArrivalInterval(scheduledArrivalInterval: String) =
                        scheduledArrivalInterval(JsonField.of(scheduledArrivalInterval))

                    /** Interval for scheduled arrival time. */
                    @JsonProperty("scheduledArrivalInterval")
                    @ExcludeMissing
                    fun scheduledArrivalInterval(scheduledArrivalInterval: JsonField<String>) =
                        apply {
                            this.scheduledArrivalInterval = scheduledArrivalInterval
                        }

                    /** Scheduled arrival time, in milliseconds since Unix epoch. */
                    fun scheduledArrivalTime(scheduledArrivalTime: Long) =
                        scheduledArrivalTime(JsonField.of(scheduledArrivalTime))

                    /** Scheduled arrival time, in milliseconds since Unix epoch. */
                    @JsonProperty("scheduledArrivalTime")
                    @ExcludeMissing
                    fun scheduledArrivalTime(scheduledArrivalTime: JsonField<Long>) = apply {
                        this.scheduledArrivalTime = scheduledArrivalTime
                    }

                    /** Interval for scheduled departure time. */
                    fun scheduledDepartureInterval(scheduledDepartureInterval: String) =
                        scheduledDepartureInterval(JsonField.of(scheduledDepartureInterval))

                    /** Interval for scheduled departure time. */
                    @JsonProperty("scheduledDepartureInterval")
                    @ExcludeMissing
                    fun scheduledDepartureInterval(scheduledDepartureInterval: JsonField<String>) =
                        apply {
                            this.scheduledDepartureInterval = scheduledDepartureInterval
                        }

                    /** Scheduled departure time, in milliseconds since Unix epoch. */
                    fun scheduledDepartureTime(scheduledDepartureTime: Long) =
                        scheduledDepartureTime(JsonField.of(scheduledDepartureTime))

                    /** Scheduled departure time, in milliseconds since Unix epoch. */
                    @JsonProperty("scheduledDepartureTime")
                    @ExcludeMissing
                    fun scheduledDepartureTime(scheduledDepartureTime: JsonField<Long>) = apply {
                        this.scheduledDepartureTime = scheduledDepartureTime
                    }

                    /** Scheduled track information of the arriving transit vehicle. */
                    fun scheduledTrack(scheduledTrack: String) =
                        scheduledTrack(JsonField.of(scheduledTrack))

                    /** Scheduled track information of the arriving transit vehicle. */
                    @JsonProperty("scheduledTrack")
                    @ExcludeMissing
                    fun scheduledTrack(scheduledTrack: JsonField<String>) = apply {
                        this.scheduledTrack = scheduledTrack
                    }

                    /**
                     * Time, in milliseconds since the Unix epoch, of midnight for the start of the
                     * service date for the trip.
                     */
                    fun serviceDate(serviceDate: Long) = serviceDate(JsonField.of(serviceDate))

                    /**
                     * Time, in milliseconds since the Unix epoch, of midnight for the start of the
                     * service date for the trip.
                     */
                    @JsonProperty("serviceDate")
                    @ExcludeMissing
                    fun serviceDate(serviceDate: JsonField<Long>) = apply {
                        this.serviceDate = serviceDate
                    }

                    /** References to situation elements (if any) applicable to this arrival. */
                    fun situationIds(situationIds: List<String>) =
                        situationIds(JsonField.of(situationIds))

                    /** References to situation elements (if any) applicable to this arrival. */
                    @JsonProperty("situationIds")
                    @ExcludeMissing
                    fun situationIds(situationIds: JsonField<List<String>>) = apply {
                        this.situationIds = situationIds
                    }

                    /** Current status of the arrival. */
                    fun status(status: String) = status(JsonField.of(status))

                    /** Current status of the arrival. */
                    @JsonProperty("status")
                    @ExcludeMissing
                    fun status(status: JsonField<String>) = apply { this.status = status }

                    /** The ID of the stop the vehicle is arriving at. */
                    fun stopId(stopId: String) = stopId(JsonField.of(stopId))

                    /** The ID of the stop the vehicle is arriving at. */
                    @JsonProperty("stopId")
                    @ExcludeMissing
                    fun stopId(stopId: JsonField<String>) = apply { this.stopId = stopId }

                    /**
                     * Index of the stop into the sequence of stops that make up the trip for this
                     * arrival.
                     */
                    fun stopSequence(stopSequence: Long) = stopSequence(JsonField.of(stopSequence))

                    /**
                     * Index of the stop into the sequence of stops that make up the trip for this
                     * arrival.
                     */
                    @JsonProperty("stopSequence")
                    @ExcludeMissing
                    fun stopSequence(stopSequence: JsonField<Long>) = apply {
                        this.stopSequence = stopSequence
                    }

                    /** Total number of stops visited on the trip for this arrival. */
                    fun totalStopsInTrip(totalStopsInTrip: Long) =
                        totalStopsInTrip(JsonField.of(totalStopsInTrip))

                    /** Total number of stops visited on the trip for this arrival. */
                    @JsonProperty("totalStopsInTrip")
                    @ExcludeMissing
                    fun totalStopsInTrip(totalStopsInTrip: JsonField<Long>) = apply {
                        this.totalStopsInTrip = totalStopsInTrip
                    }

                    /**
                     * Optional trip headsign that potentially overrides the trip headsign in the
                     * referenced trip element.
                     */
                    fun tripHeadsign(tripHeadsign: String) =
                        tripHeadsign(JsonField.of(tripHeadsign))

                    /**
                     * Optional trip headsign that potentially overrides the trip headsign in the
                     * referenced trip element.
                     */
                    @JsonProperty("tripHeadsign")
                    @ExcludeMissing
                    fun tripHeadsign(tripHeadsign: JsonField<String>) = apply {
                        this.tripHeadsign = tripHeadsign
                    }

                    /** The ID of the trip for the arriving vehicle. */
                    fun tripId(tripId: String) = tripId(JsonField.of(tripId))

                    /** The ID of the trip for the arriving vehicle. */
                    @JsonProperty("tripId")
                    @ExcludeMissing
                    fun tripId(tripId: JsonField<String>) = apply { this.tripId = tripId }

                    /** Trip-specific status for the arriving transit vehicle. */
                    fun tripStatus(tripStatus: TripStatus) = tripStatus(JsonField.of(tripStatus))

                    /** Trip-specific status for the arriving transit vehicle. */
                    @JsonProperty("tripStatus")
                    @ExcludeMissing
                    fun tripStatus(tripStatus: JsonField<TripStatus>) = apply {
                        this.tripStatus = tripStatus
                    }

                    /** ID of the transit vehicle serving this trip. */
                    fun vehicleId(vehicleId: String) = vehicleId(JsonField.of(vehicleId))

                    /** ID of the transit vehicle serving this trip. */
                    @JsonProperty("vehicleId")
                    @ExcludeMissing
                    fun vehicleId(vehicleId: JsonField<String>) = apply {
                        this.vehicleId = vehicleId
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): ArrivalsAndDeparture =
                        ArrivalsAndDeparture(
                            actualTrack,
                            arrivalEnabled,
                            blockTripSequence,
                            departureEnabled,
                            distanceFromStop,
                            frequency,
                            historicalOccupancy,
                            lastUpdateTime,
                            numberOfStopsAway,
                            occupancyStatus,
                            predicted,
                            predictedArrivalInterval,
                            predictedArrivalTime,
                            predictedDepartureInterval,
                            predictedDepartureTime,
                            predictedOccupancy,
                            routeId,
                            routeLongName,
                            routeShortName,
                            scheduledArrivalInterval,
                            scheduledArrivalTime,
                            scheduledDepartureInterval,
                            scheduledDepartureTime,
                            scheduledTrack,
                            serviceDate,
                            situationIds.map { it.toUnmodifiable() },
                            status,
                            stopId,
                            stopSequence,
                            totalStopsInTrip,
                            tripHeadsign,
                            tripId,
                            tripStatus,
                            vehicleId,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                /** Trip-specific status for the arriving transit vehicle. */
                @JsonDeserialize(builder = TripStatus.Builder::class)
                @NoAutoDetect
                class TripStatus
                private constructor(
                    private val activeTripId: JsonField<String>,
                    private val blockTripSequence: JsonField<Long>,
                    private val closestStop: JsonField<String>,
                    private val closestStopTimeOffset: JsonField<Long>,
                    private val distanceAlongTrip: JsonField<Double>,
                    private val frequency: JsonField<String>,
                    private val lastKnownDistanceAlongTrip: JsonField<Double>,
                    private val lastKnownLocation: JsonField<LastKnownLocation>,
                    private val lastKnownOrientation: JsonField<Double>,
                    private val lastLocationUpdateTime: JsonField<Long>,
                    private val lastUpdateTime: JsonField<Long>,
                    private val nextStop: JsonField<String>,
                    private val nextStopTimeOffset: JsonField<Long>,
                    private val occupancyCapacity: JsonField<Long>,
                    private val occupancyCount: JsonField<Long>,
                    private val occupancyStatus: JsonField<String>,
                    private val orientation: JsonField<Double>,
                    private val phase: JsonField<String>,
                    private val position: JsonField<Position>,
                    private val predicted: JsonField<Boolean>,
                    private val scheduleDeviation: JsonField<Long>,
                    private val scheduledDistanceAlongTrip: JsonField<Double>,
                    private val serviceDate: JsonField<Long>,
                    private val situationIds: JsonField<List<String>>,
                    private val status: JsonField<String>,
                    private val totalDistanceAlongTrip: JsonField<Double>,
                    private val vehicleId: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** Trip ID of the trip the vehicle is actively serving. */
                    fun activeTripId(): String = activeTripId.getRequired("activeTripId")

                    /** Index of the active trip into the sequence of trips for the active block. */
                    fun blockTripSequence(): Long =
                        blockTripSequence.getRequired("blockTripSequence")

                    /** ID of the closest stop to the current location of the transit vehicle. */
                    fun closestStop(): String = closestStop.getRequired("closestStop")

                    /**
                     * Time offset from the closest stop to the current position of the transit
                     * vehicle (in seconds).
                     */
                    fun closestStopTimeOffset(): Long? =
                        closestStopTimeOffset.getNullable("closestStopTimeOffset")

                    /**
                     * Distance, in meters, the transit vehicle has progressed along the active
                     * trip.
                     */
                    fun distanceAlongTrip(): Double =
                        distanceAlongTrip.getRequired("distanceAlongTrip")

                    /** Information about frequency-based scheduling, if applicable to the trip. */
                    fun frequency(): String? = frequency.getNullable("frequency")

                    /**
                     * Last known distance along the trip received in real-time from the transit
                     * vehicle.
                     */
                    fun lastKnownDistanceAlongTrip(): Double =
                        lastKnownDistanceAlongTrip.getRequired("lastKnownDistanceAlongTrip")

                    /** Last known location of the transit vehicle. */
                    fun lastKnownLocation(): LastKnownLocation? =
                        lastKnownLocation.getNullable("lastKnownLocation")

                    /**
                     * Last known orientation value received in real-time from the transit vehicle.
                     */
                    fun lastKnownOrientation(): Double? =
                        lastKnownOrientation.getNullable("lastKnownOrientation")

                    /**
                     * Timestamp of the last known real-time location update from the transit
                     * vehicle.
                     */
                    fun lastLocationUpdateTime(): Long =
                        lastLocationUpdateTime.getRequired("lastLocationUpdateTime")

                    /** Timestamp of the last known real-time update from the transit vehicle. */
                    fun lastUpdateTime(): Long = lastUpdateTime.getRequired("lastUpdateTime")

                    /** ID of the next stop the transit vehicle is scheduled to arrive at. */
                    fun nextStop(): String? = nextStop.getNullable("nextStop")

                    /**
                     * Time offset from the next stop to the current position of the transit vehicle
                     * (in seconds).
                     */
                    fun nextStopTimeOffset(): Long? =
                        nextStopTimeOffset.getNullable("nextStopTimeOffset")

                    /** Capacity of the transit vehicle in terms of occupancy. */
                    fun occupancyCapacity(): Long =
                        occupancyCapacity.getRequired("occupancyCapacity")

                    /** Current count of occupants in the transit vehicle. */
                    fun occupancyCount(): Long = occupancyCount.getRequired("occupancyCount")

                    /** Current occupancy status of the transit vehicle. */
                    fun occupancyStatus(): String = occupancyStatus.getRequired("occupancyStatus")

                    /** Orientation of the transit vehicle, represented as an angle in degrees. */
                    fun orientation(): Double? = orientation.getNullable("orientation")

                    /** Current journey phase of the trip. */
                    fun phase(): String = phase.getRequired("phase")

                    /** Current position of the transit vehicle. */
                    fun position(): Position? = position.getNullable("position")

                    /** Indicates if real-time arrival info is available for this trip. */
                    fun predicted(): Boolean = predicted.getRequired("predicted")

                    /**
                     * Deviation from the schedule in seconds (positive for late, negative for
                     * early).
                     */
                    fun scheduleDeviation(): Long =
                        scheduleDeviation.getRequired("scheduleDeviation")

                    /**
                     * Distance, in meters, the transit vehicle is scheduled to have progressed
                     * along the active trip.
                     */
                    fun scheduledDistanceAlongTrip(): Double? =
                        scheduledDistanceAlongTrip.getNullable("scheduledDistanceAlongTrip")

                    /**
                     * Time, in milliseconds since the Unix epoch, of midnight for the start of the
                     * service date for the trip.
                     */
                    fun serviceDate(): Long = serviceDate.getRequired("serviceDate")

                    /** References to situation elements (if any) applicable to this trip. */
                    fun situationIds(): List<String>? = situationIds.getNullable("situationIds")

                    /** Current status modifiers for the trip. */
                    fun status(): String = status.getRequired("status")

                    /** Total length of the trip, in meters. */
                    fun totalDistanceAlongTrip(): Double =
                        totalDistanceAlongTrip.getRequired("totalDistanceAlongTrip")

                    /** ID of the transit vehicle currently serving the trip. */
                    fun vehicleId(): String? = vehicleId.getNullable("vehicleId")

                    /** Trip ID of the trip the vehicle is actively serving. */
                    @JsonProperty("activeTripId") @ExcludeMissing fun _activeTripId() = activeTripId

                    /** Index of the active trip into the sequence of trips for the active block. */
                    @JsonProperty("blockTripSequence")
                    @ExcludeMissing
                    fun _blockTripSequence() = blockTripSequence

                    /** ID of the closest stop to the current location of the transit vehicle. */
                    @JsonProperty("closestStop") @ExcludeMissing fun _closestStop() = closestStop

                    /**
                     * Time offset from the closest stop to the current position of the transit
                     * vehicle (in seconds).
                     */
                    @JsonProperty("closestStopTimeOffset")
                    @ExcludeMissing
                    fun _closestStopTimeOffset() = closestStopTimeOffset

                    /**
                     * Distance, in meters, the transit vehicle has progressed along the active
                     * trip.
                     */
                    @JsonProperty("distanceAlongTrip")
                    @ExcludeMissing
                    fun _distanceAlongTrip() = distanceAlongTrip

                    /** Information about frequency-based scheduling, if applicable to the trip. */
                    @JsonProperty("frequency") @ExcludeMissing fun _frequency() = frequency

                    /**
                     * Last known distance along the trip received in real-time from the transit
                     * vehicle.
                     */
                    @JsonProperty("lastKnownDistanceAlongTrip")
                    @ExcludeMissing
                    fun _lastKnownDistanceAlongTrip() = lastKnownDistanceAlongTrip

                    /** Last known location of the transit vehicle. */
                    @JsonProperty("lastKnownLocation")
                    @ExcludeMissing
                    fun _lastKnownLocation() = lastKnownLocation

                    /**
                     * Last known orientation value received in real-time from the transit vehicle.
                     */
                    @JsonProperty("lastKnownOrientation")
                    @ExcludeMissing
                    fun _lastKnownOrientation() = lastKnownOrientation

                    /**
                     * Timestamp of the last known real-time location update from the transit
                     * vehicle.
                     */
                    @JsonProperty("lastLocationUpdateTime")
                    @ExcludeMissing
                    fun _lastLocationUpdateTime() = lastLocationUpdateTime

                    /** Timestamp of the last known real-time update from the transit vehicle. */
                    @JsonProperty("lastUpdateTime")
                    @ExcludeMissing
                    fun _lastUpdateTime() = lastUpdateTime

                    /** ID of the next stop the transit vehicle is scheduled to arrive at. */
                    @JsonProperty("nextStop") @ExcludeMissing fun _nextStop() = nextStop

                    /**
                     * Time offset from the next stop to the current position of the transit vehicle
                     * (in seconds).
                     */
                    @JsonProperty("nextStopTimeOffset")
                    @ExcludeMissing
                    fun _nextStopTimeOffset() = nextStopTimeOffset

                    /** Capacity of the transit vehicle in terms of occupancy. */
                    @JsonProperty("occupancyCapacity")
                    @ExcludeMissing
                    fun _occupancyCapacity() = occupancyCapacity

                    /** Current count of occupants in the transit vehicle. */
                    @JsonProperty("occupancyCount")
                    @ExcludeMissing
                    fun _occupancyCount() = occupancyCount

                    /** Current occupancy status of the transit vehicle. */
                    @JsonProperty("occupancyStatus")
                    @ExcludeMissing
                    fun _occupancyStatus() = occupancyStatus

                    /** Orientation of the transit vehicle, represented as an angle in degrees. */
                    @JsonProperty("orientation") @ExcludeMissing fun _orientation() = orientation

                    /** Current journey phase of the trip. */
                    @JsonProperty("phase") @ExcludeMissing fun _phase() = phase

                    /** Current position of the transit vehicle. */
                    @JsonProperty("position") @ExcludeMissing fun _position() = position

                    /** Indicates if real-time arrival info is available for this trip. */
                    @JsonProperty("predicted") @ExcludeMissing fun _predicted() = predicted

                    /**
                     * Deviation from the schedule in seconds (positive for late, negative for
                     * early).
                     */
                    @JsonProperty("scheduleDeviation")
                    @ExcludeMissing
                    fun _scheduleDeviation() = scheduleDeviation

                    /**
                     * Distance, in meters, the transit vehicle is scheduled to have progressed
                     * along the active trip.
                     */
                    @JsonProperty("scheduledDistanceAlongTrip")
                    @ExcludeMissing
                    fun _scheduledDistanceAlongTrip() = scheduledDistanceAlongTrip

                    /**
                     * Time, in milliseconds since the Unix epoch, of midnight for the start of the
                     * service date for the trip.
                     */
                    @JsonProperty("serviceDate") @ExcludeMissing fun _serviceDate() = serviceDate

                    /** References to situation elements (if any) applicable to this trip. */
                    @JsonProperty("situationIds") @ExcludeMissing fun _situationIds() = situationIds

                    /** Current status modifiers for the trip. */
                    @JsonProperty("status") @ExcludeMissing fun _status() = status

                    /** Total length of the trip, in meters. */
                    @JsonProperty("totalDistanceAlongTrip")
                    @ExcludeMissing
                    fun _totalDistanceAlongTrip() = totalDistanceAlongTrip

                    /** ID of the transit vehicle currently serving the trip. */
                    @JsonProperty("vehicleId") @ExcludeMissing fun _vehicleId() = vehicleId

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): TripStatus = apply {
                        if (!validated) {
                            activeTripId()
                            blockTripSequence()
                            closestStop()
                            closestStopTimeOffset()
                            distanceAlongTrip()
                            frequency()
                            lastKnownDistanceAlongTrip()
                            lastKnownLocation()?.validate()
                            lastKnownOrientation()
                            lastLocationUpdateTime()
                            lastUpdateTime()
                            nextStop()
                            nextStopTimeOffset()
                            occupancyCapacity()
                            occupancyCount()
                            occupancyStatus()
                            orientation()
                            phase()
                            position()?.validate()
                            predicted()
                            scheduleDeviation()
                            scheduledDistanceAlongTrip()
                            serviceDate()
                            situationIds()
                            status()
                            totalDistanceAlongTrip()
                            vehicleId()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is TripStatus &&
                            this.activeTripId == other.activeTripId &&
                            this.blockTripSequence == other.blockTripSequence &&
                            this.closestStop == other.closestStop &&
                            this.closestStopTimeOffset == other.closestStopTimeOffset &&
                            this.distanceAlongTrip == other.distanceAlongTrip &&
                            this.frequency == other.frequency &&
                            this.lastKnownDistanceAlongTrip == other.lastKnownDistanceAlongTrip &&
                            this.lastKnownLocation == other.lastKnownLocation &&
                            this.lastKnownOrientation == other.lastKnownOrientation &&
                            this.lastLocationUpdateTime == other.lastLocationUpdateTime &&
                            this.lastUpdateTime == other.lastUpdateTime &&
                            this.nextStop == other.nextStop &&
                            this.nextStopTimeOffset == other.nextStopTimeOffset &&
                            this.occupancyCapacity == other.occupancyCapacity &&
                            this.occupancyCount == other.occupancyCount &&
                            this.occupancyStatus == other.occupancyStatus &&
                            this.orientation == other.orientation &&
                            this.phase == other.phase &&
                            this.position == other.position &&
                            this.predicted == other.predicted &&
                            this.scheduleDeviation == other.scheduleDeviation &&
                            this.scheduledDistanceAlongTrip == other.scheduledDistanceAlongTrip &&
                            this.serviceDate == other.serviceDate &&
                            this.situationIds == other.situationIds &&
                            this.status == other.status &&
                            this.totalDistanceAlongTrip == other.totalDistanceAlongTrip &&
                            this.vehicleId == other.vehicleId &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    activeTripId,
                                    blockTripSequence,
                                    closestStop,
                                    closestStopTimeOffset,
                                    distanceAlongTrip,
                                    frequency,
                                    lastKnownDistanceAlongTrip,
                                    lastKnownLocation,
                                    lastKnownOrientation,
                                    lastLocationUpdateTime,
                                    lastUpdateTime,
                                    nextStop,
                                    nextStopTimeOffset,
                                    occupancyCapacity,
                                    occupancyCount,
                                    occupancyStatus,
                                    orientation,
                                    phase,
                                    position,
                                    predicted,
                                    scheduleDeviation,
                                    scheduledDistanceAlongTrip,
                                    serviceDate,
                                    situationIds,
                                    status,
                                    totalDistanceAlongTrip,
                                    vehicleId,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "TripStatus{activeTripId=$activeTripId, blockTripSequence=$blockTripSequence, closestStop=$closestStop, closestStopTimeOffset=$closestStopTimeOffset, distanceAlongTrip=$distanceAlongTrip, frequency=$frequency, lastKnownDistanceAlongTrip=$lastKnownDistanceAlongTrip, lastKnownLocation=$lastKnownLocation, lastKnownOrientation=$lastKnownOrientation, lastLocationUpdateTime=$lastLocationUpdateTime, lastUpdateTime=$lastUpdateTime, nextStop=$nextStop, nextStopTimeOffset=$nextStopTimeOffset, occupancyCapacity=$occupancyCapacity, occupancyCount=$occupancyCount, occupancyStatus=$occupancyStatus, orientation=$orientation, phase=$phase, position=$position, predicted=$predicted, scheduleDeviation=$scheduleDeviation, scheduledDistanceAlongTrip=$scheduledDistanceAlongTrip, serviceDate=$serviceDate, situationIds=$situationIds, status=$status, totalDistanceAlongTrip=$totalDistanceAlongTrip, vehicleId=$vehicleId, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var activeTripId: JsonField<String> = JsonMissing.of()
                        private var blockTripSequence: JsonField<Long> = JsonMissing.of()
                        private var closestStop: JsonField<String> = JsonMissing.of()
                        private var closestStopTimeOffset: JsonField<Long> = JsonMissing.of()
                        private var distanceAlongTrip: JsonField<Double> = JsonMissing.of()
                        private var frequency: JsonField<String> = JsonMissing.of()
                        private var lastKnownDistanceAlongTrip: JsonField<Double> = JsonMissing.of()
                        private var lastKnownLocation: JsonField<LastKnownLocation> =
                            JsonMissing.of()
                        private var lastKnownOrientation: JsonField<Double> = JsonMissing.of()
                        private var lastLocationUpdateTime: JsonField<Long> = JsonMissing.of()
                        private var lastUpdateTime: JsonField<Long> = JsonMissing.of()
                        private var nextStop: JsonField<String> = JsonMissing.of()
                        private var nextStopTimeOffset: JsonField<Long> = JsonMissing.of()
                        private var occupancyCapacity: JsonField<Long> = JsonMissing.of()
                        private var occupancyCount: JsonField<Long> = JsonMissing.of()
                        private var occupancyStatus: JsonField<String> = JsonMissing.of()
                        private var orientation: JsonField<Double> = JsonMissing.of()
                        private var phase: JsonField<String> = JsonMissing.of()
                        private var position: JsonField<Position> = JsonMissing.of()
                        private var predicted: JsonField<Boolean> = JsonMissing.of()
                        private var scheduleDeviation: JsonField<Long> = JsonMissing.of()
                        private var scheduledDistanceAlongTrip: JsonField<Double> = JsonMissing.of()
                        private var serviceDate: JsonField<Long> = JsonMissing.of()
                        private var situationIds: JsonField<List<String>> = JsonMissing.of()
                        private var status: JsonField<String> = JsonMissing.of()
                        private var totalDistanceAlongTrip: JsonField<Double> = JsonMissing.of()
                        private var vehicleId: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(tripStatus: TripStatus) = apply {
                            this.activeTripId = tripStatus.activeTripId
                            this.blockTripSequence = tripStatus.blockTripSequence
                            this.closestStop = tripStatus.closestStop
                            this.closestStopTimeOffset = tripStatus.closestStopTimeOffset
                            this.distanceAlongTrip = tripStatus.distanceAlongTrip
                            this.frequency = tripStatus.frequency
                            this.lastKnownDistanceAlongTrip = tripStatus.lastKnownDistanceAlongTrip
                            this.lastKnownLocation = tripStatus.lastKnownLocation
                            this.lastKnownOrientation = tripStatus.lastKnownOrientation
                            this.lastLocationUpdateTime = tripStatus.lastLocationUpdateTime
                            this.lastUpdateTime = tripStatus.lastUpdateTime
                            this.nextStop = tripStatus.nextStop
                            this.nextStopTimeOffset = tripStatus.nextStopTimeOffset
                            this.occupancyCapacity = tripStatus.occupancyCapacity
                            this.occupancyCount = tripStatus.occupancyCount
                            this.occupancyStatus = tripStatus.occupancyStatus
                            this.orientation = tripStatus.orientation
                            this.phase = tripStatus.phase
                            this.position = tripStatus.position
                            this.predicted = tripStatus.predicted
                            this.scheduleDeviation = tripStatus.scheduleDeviation
                            this.scheduledDistanceAlongTrip = tripStatus.scheduledDistanceAlongTrip
                            this.serviceDate = tripStatus.serviceDate
                            this.situationIds = tripStatus.situationIds
                            this.status = tripStatus.status
                            this.totalDistanceAlongTrip = tripStatus.totalDistanceAlongTrip
                            this.vehicleId = tripStatus.vehicleId
                            additionalProperties(tripStatus.additionalProperties)
                        }

                        /** Trip ID of the trip the vehicle is actively serving. */
                        fun activeTripId(activeTripId: String) =
                            activeTripId(JsonField.of(activeTripId))

                        /** Trip ID of the trip the vehicle is actively serving. */
                        @JsonProperty("activeTripId")
                        @ExcludeMissing
                        fun activeTripId(activeTripId: JsonField<String>) = apply {
                            this.activeTripId = activeTripId
                        }

                        /**
                         * Index of the active trip into the sequence of trips for the active block.
                         */
                        fun blockTripSequence(blockTripSequence: Long) =
                            blockTripSequence(JsonField.of(blockTripSequence))

                        /**
                         * Index of the active trip into the sequence of trips for the active block.
                         */
                        @JsonProperty("blockTripSequence")
                        @ExcludeMissing
                        fun blockTripSequence(blockTripSequence: JsonField<Long>) = apply {
                            this.blockTripSequence = blockTripSequence
                        }

                        /**
                         * ID of the closest stop to the current location of the transit vehicle.
                         */
                        fun closestStop(closestStop: String) =
                            closestStop(JsonField.of(closestStop))

                        /**
                         * ID of the closest stop to the current location of the transit vehicle.
                         */
                        @JsonProperty("closestStop")
                        @ExcludeMissing
                        fun closestStop(closestStop: JsonField<String>) = apply {
                            this.closestStop = closestStop
                        }

                        /**
                         * Time offset from the closest stop to the current position of the transit
                         * vehicle (in seconds).
                         */
                        fun closestStopTimeOffset(closestStopTimeOffset: Long) =
                            closestStopTimeOffset(JsonField.of(closestStopTimeOffset))

                        /**
                         * Time offset from the closest stop to the current position of the transit
                         * vehicle (in seconds).
                         */
                        @JsonProperty("closestStopTimeOffset")
                        @ExcludeMissing
                        fun closestStopTimeOffset(closestStopTimeOffset: JsonField<Long>) = apply {
                            this.closestStopTimeOffset = closestStopTimeOffset
                        }

                        /**
                         * Distance, in meters, the transit vehicle has progressed along the active
                         * trip.
                         */
                        fun distanceAlongTrip(distanceAlongTrip: Double) =
                            distanceAlongTrip(JsonField.of(distanceAlongTrip))

                        /**
                         * Distance, in meters, the transit vehicle has progressed along the active
                         * trip.
                         */
                        @JsonProperty("distanceAlongTrip")
                        @ExcludeMissing
                        fun distanceAlongTrip(distanceAlongTrip: JsonField<Double>) = apply {
                            this.distanceAlongTrip = distanceAlongTrip
                        }

                        /**
                         * Information about frequency-based scheduling, if applicable to the trip.
                         */
                        fun frequency(frequency: String) = frequency(JsonField.of(frequency))

                        /**
                         * Information about frequency-based scheduling, if applicable to the trip.
                         */
                        @JsonProperty("frequency")
                        @ExcludeMissing
                        fun frequency(frequency: JsonField<String>) = apply {
                            this.frequency = frequency
                        }

                        /**
                         * Last known distance along the trip received in real-time from the transit
                         * vehicle.
                         */
                        fun lastKnownDistanceAlongTrip(lastKnownDistanceAlongTrip: Double) =
                            lastKnownDistanceAlongTrip(JsonField.of(lastKnownDistanceAlongTrip))

                        /**
                         * Last known distance along the trip received in real-time from the transit
                         * vehicle.
                         */
                        @JsonProperty("lastKnownDistanceAlongTrip")
                        @ExcludeMissing
                        fun lastKnownDistanceAlongTrip(
                            lastKnownDistanceAlongTrip: JsonField<Double>
                        ) = apply { this.lastKnownDistanceAlongTrip = lastKnownDistanceAlongTrip }

                        /** Last known location of the transit vehicle. */
                        fun lastKnownLocation(lastKnownLocation: LastKnownLocation) =
                            lastKnownLocation(JsonField.of(lastKnownLocation))

                        /** Last known location of the transit vehicle. */
                        @JsonProperty("lastKnownLocation")
                        @ExcludeMissing
                        fun lastKnownLocation(lastKnownLocation: JsonField<LastKnownLocation>) =
                            apply {
                                this.lastKnownLocation = lastKnownLocation
                            }

                        /**
                         * Last known orientation value received in real-time from the transit
                         * vehicle.
                         */
                        fun lastKnownOrientation(lastKnownOrientation: Double) =
                            lastKnownOrientation(JsonField.of(lastKnownOrientation))

                        /**
                         * Last known orientation value received in real-time from the transit
                         * vehicle.
                         */
                        @JsonProperty("lastKnownOrientation")
                        @ExcludeMissing
                        fun lastKnownOrientation(lastKnownOrientation: JsonField<Double>) = apply {
                            this.lastKnownOrientation = lastKnownOrientation
                        }

                        /**
                         * Timestamp of the last known real-time location update from the transit
                         * vehicle.
                         */
                        fun lastLocationUpdateTime(lastLocationUpdateTime: Long) =
                            lastLocationUpdateTime(JsonField.of(lastLocationUpdateTime))

                        /**
                         * Timestamp of the last known real-time location update from the transit
                         * vehicle.
                         */
                        @JsonProperty("lastLocationUpdateTime")
                        @ExcludeMissing
                        fun lastLocationUpdateTime(lastLocationUpdateTime: JsonField<Long>) =
                            apply {
                                this.lastLocationUpdateTime = lastLocationUpdateTime
                            }

                        /**
                         * Timestamp of the last known real-time update from the transit vehicle.
                         */
                        fun lastUpdateTime(lastUpdateTime: Long) =
                            lastUpdateTime(JsonField.of(lastUpdateTime))

                        /**
                         * Timestamp of the last known real-time update from the transit vehicle.
                         */
                        @JsonProperty("lastUpdateTime")
                        @ExcludeMissing
                        fun lastUpdateTime(lastUpdateTime: JsonField<Long>) = apply {
                            this.lastUpdateTime = lastUpdateTime
                        }

                        /** ID of the next stop the transit vehicle is scheduled to arrive at. */
                        fun nextStop(nextStop: String) = nextStop(JsonField.of(nextStop))

                        /** ID of the next stop the transit vehicle is scheduled to arrive at. */
                        @JsonProperty("nextStop")
                        @ExcludeMissing
                        fun nextStop(nextStop: JsonField<String>) = apply {
                            this.nextStop = nextStop
                        }

                        /**
                         * Time offset from the next stop to the current position of the transit
                         * vehicle (in seconds).
                         */
                        fun nextStopTimeOffset(nextStopTimeOffset: Long) =
                            nextStopTimeOffset(JsonField.of(nextStopTimeOffset))

                        /**
                         * Time offset from the next stop to the current position of the transit
                         * vehicle (in seconds).
                         */
                        @JsonProperty("nextStopTimeOffset")
                        @ExcludeMissing
                        fun nextStopTimeOffset(nextStopTimeOffset: JsonField<Long>) = apply {
                            this.nextStopTimeOffset = nextStopTimeOffset
                        }

                        /** Capacity of the transit vehicle in terms of occupancy. */
                        fun occupancyCapacity(occupancyCapacity: Long) =
                            occupancyCapacity(JsonField.of(occupancyCapacity))

                        /** Capacity of the transit vehicle in terms of occupancy. */
                        @JsonProperty("occupancyCapacity")
                        @ExcludeMissing
                        fun occupancyCapacity(occupancyCapacity: JsonField<Long>) = apply {
                            this.occupancyCapacity = occupancyCapacity
                        }

                        /** Current count of occupants in the transit vehicle. */
                        fun occupancyCount(occupancyCount: Long) =
                            occupancyCount(JsonField.of(occupancyCount))

                        /** Current count of occupants in the transit vehicle. */
                        @JsonProperty("occupancyCount")
                        @ExcludeMissing
                        fun occupancyCount(occupancyCount: JsonField<Long>) = apply {
                            this.occupancyCount = occupancyCount
                        }

                        /** Current occupancy status of the transit vehicle. */
                        fun occupancyStatus(occupancyStatus: String) =
                            occupancyStatus(JsonField.of(occupancyStatus))

                        /** Current occupancy status of the transit vehicle. */
                        @JsonProperty("occupancyStatus")
                        @ExcludeMissing
                        fun occupancyStatus(occupancyStatus: JsonField<String>) = apply {
                            this.occupancyStatus = occupancyStatus
                        }

                        /**
                         * Orientation of the transit vehicle, represented as an angle in degrees.
                         */
                        fun orientation(orientation: Double) =
                            orientation(JsonField.of(orientation))

                        /**
                         * Orientation of the transit vehicle, represented as an angle in degrees.
                         */
                        @JsonProperty("orientation")
                        @ExcludeMissing
                        fun orientation(orientation: JsonField<Double>) = apply {
                            this.orientation = orientation
                        }

                        /** Current journey phase of the trip. */
                        fun phase(phase: String) = phase(JsonField.of(phase))

                        /** Current journey phase of the trip. */
                        @JsonProperty("phase")
                        @ExcludeMissing
                        fun phase(phase: JsonField<String>) = apply { this.phase = phase }

                        /** Current position of the transit vehicle. */
                        fun position(position: Position) = position(JsonField.of(position))

                        /** Current position of the transit vehicle. */
                        @JsonProperty("position")
                        @ExcludeMissing
                        fun position(position: JsonField<Position>) = apply {
                            this.position = position
                        }

                        /** Indicates if real-time arrival info is available for this trip. */
                        fun predicted(predicted: Boolean) = predicted(JsonField.of(predicted))

                        /** Indicates if real-time arrival info is available for this trip. */
                        @JsonProperty("predicted")
                        @ExcludeMissing
                        fun predicted(predicted: JsonField<Boolean>) = apply {
                            this.predicted = predicted
                        }

                        /**
                         * Deviation from the schedule in seconds (positive for late, negative for
                         * early).
                         */
                        fun scheduleDeviation(scheduleDeviation: Long) =
                            scheduleDeviation(JsonField.of(scheduleDeviation))

                        /**
                         * Deviation from the schedule in seconds (positive for late, negative for
                         * early).
                         */
                        @JsonProperty("scheduleDeviation")
                        @ExcludeMissing
                        fun scheduleDeviation(scheduleDeviation: JsonField<Long>) = apply {
                            this.scheduleDeviation = scheduleDeviation
                        }

                        /**
                         * Distance, in meters, the transit vehicle is scheduled to have progressed
                         * along the active trip.
                         */
                        fun scheduledDistanceAlongTrip(scheduledDistanceAlongTrip: Double) =
                            scheduledDistanceAlongTrip(JsonField.of(scheduledDistanceAlongTrip))

                        /**
                         * Distance, in meters, the transit vehicle is scheduled to have progressed
                         * along the active trip.
                         */
                        @JsonProperty("scheduledDistanceAlongTrip")
                        @ExcludeMissing
                        fun scheduledDistanceAlongTrip(
                            scheduledDistanceAlongTrip: JsonField<Double>
                        ) = apply { this.scheduledDistanceAlongTrip = scheduledDistanceAlongTrip }

                        /**
                         * Time, in milliseconds since the Unix epoch, of midnight for the start of
                         * the service date for the trip.
                         */
                        fun serviceDate(serviceDate: Long) = serviceDate(JsonField.of(serviceDate))

                        /**
                         * Time, in milliseconds since the Unix epoch, of midnight for the start of
                         * the service date for the trip.
                         */
                        @JsonProperty("serviceDate")
                        @ExcludeMissing
                        fun serviceDate(serviceDate: JsonField<Long>) = apply {
                            this.serviceDate = serviceDate
                        }

                        /** References to situation elements (if any) applicable to this trip. */
                        fun situationIds(situationIds: List<String>) =
                            situationIds(JsonField.of(situationIds))

                        /** References to situation elements (if any) applicable to this trip. */
                        @JsonProperty("situationIds")
                        @ExcludeMissing
                        fun situationIds(situationIds: JsonField<List<String>>) = apply {
                            this.situationIds = situationIds
                        }

                        /** Current status modifiers for the trip. */
                        fun status(status: String) = status(JsonField.of(status))

                        /** Current status modifiers for the trip. */
                        @JsonProperty("status")
                        @ExcludeMissing
                        fun status(status: JsonField<String>) = apply { this.status = status }

                        /** Total length of the trip, in meters. */
                        fun totalDistanceAlongTrip(totalDistanceAlongTrip: Double) =
                            totalDistanceAlongTrip(JsonField.of(totalDistanceAlongTrip))

                        /** Total length of the trip, in meters. */
                        @JsonProperty("totalDistanceAlongTrip")
                        @ExcludeMissing
                        fun totalDistanceAlongTrip(totalDistanceAlongTrip: JsonField<Double>) =
                            apply {
                                this.totalDistanceAlongTrip = totalDistanceAlongTrip
                            }

                        /** ID of the transit vehicle currently serving the trip. */
                        fun vehicleId(vehicleId: String) = vehicleId(JsonField.of(vehicleId))

                        /** ID of the transit vehicle currently serving the trip. */
                        @JsonProperty("vehicleId")
                        @ExcludeMissing
                        fun vehicleId(vehicleId: JsonField<String>) = apply {
                            this.vehicleId = vehicleId
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): TripStatus =
                            TripStatus(
                                activeTripId,
                                blockTripSequence,
                                closestStop,
                                closestStopTimeOffset,
                                distanceAlongTrip,
                                frequency,
                                lastKnownDistanceAlongTrip,
                                lastKnownLocation,
                                lastKnownOrientation,
                                lastLocationUpdateTime,
                                lastUpdateTime,
                                nextStop,
                                nextStopTimeOffset,
                                occupancyCapacity,
                                occupancyCount,
                                occupancyStatus,
                                orientation,
                                phase,
                                position,
                                predicted,
                                scheduleDeviation,
                                scheduledDistanceAlongTrip,
                                serviceDate,
                                situationIds.map { it.toUnmodifiable() },
                                status,
                                totalDistanceAlongTrip,
                                vehicleId,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    /** Last known location of the transit vehicle. */
                    @JsonDeserialize(builder = LastKnownLocation.Builder::class)
                    @NoAutoDetect
                    class LastKnownLocation
                    private constructor(
                        private val lat: JsonField<Double>,
                        private val lon: JsonField<Double>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        /** Latitude of the last known location of the transit vehicle. */
                        fun lat(): Double? = lat.getNullable("lat")

                        /** Longitude of the last known location of the transit vehicle. */
                        fun lon(): Double? = lon.getNullable("lon")

                        /** Latitude of the last known location of the transit vehicle. */
                        @JsonProperty("lat") @ExcludeMissing fun _lat() = lat

                        /** Longitude of the last known location of the transit vehicle. */
                        @JsonProperty("lon") @ExcludeMissing fun _lon() = lon

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): LastKnownLocation = apply {
                            if (!validated) {
                                lat()
                                lon()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is LastKnownLocation &&
                                this.lat == other.lat &&
                                this.lon == other.lon &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        lat,
                                        lon,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "LastKnownLocation{lat=$lat, lon=$lon, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var lat: JsonField<Double> = JsonMissing.of()
                            private var lon: JsonField<Double> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(lastKnownLocation: LastKnownLocation) = apply {
                                this.lat = lastKnownLocation.lat
                                this.lon = lastKnownLocation.lon
                                additionalProperties(lastKnownLocation.additionalProperties)
                            }

                            /** Latitude of the last known location of the transit vehicle. */
                            fun lat(lat: Double) = lat(JsonField.of(lat))

                            /** Latitude of the last known location of the transit vehicle. */
                            @JsonProperty("lat")
                            @ExcludeMissing
                            fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

                            /** Longitude of the last known location of the transit vehicle. */
                            fun lon(lon: Double) = lon(JsonField.of(lon))

                            /** Longitude of the last known location of the transit vehicle. */
                            @JsonProperty("lon")
                            @ExcludeMissing
                            fun lon(lon: JsonField<Double>) = apply { this.lon = lon }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): LastKnownLocation =
                                LastKnownLocation(
                                    lat,
                                    lon,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }
                    }

                    /** Current position of the transit vehicle. */
                    @JsonDeserialize(builder = Position.Builder::class)
                    @NoAutoDetect
                    class Position
                    private constructor(
                        private val lat: JsonField<Double>,
                        private val lon: JsonField<Double>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        /** Latitude of the current position of the transit vehicle. */
                        fun lat(): Double? = lat.getNullable("lat")

                        /** Longitude of the current position of the transit vehicle. */
                        fun lon(): Double? = lon.getNullable("lon")

                        /** Latitude of the current position of the transit vehicle. */
                        @JsonProperty("lat") @ExcludeMissing fun _lat() = lat

                        /** Longitude of the current position of the transit vehicle. */
                        @JsonProperty("lon") @ExcludeMissing fun _lon() = lon

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): Position = apply {
                            if (!validated) {
                                lat()
                                lon()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Position &&
                                this.lat == other.lat &&
                                this.lon == other.lon &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        lat,
                                        lon,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Position{lat=$lat, lon=$lon, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var lat: JsonField<Double> = JsonMissing.of()
                            private var lon: JsonField<Double> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(position: Position) = apply {
                                this.lat = position.lat
                                this.lon = position.lon
                                additionalProperties(position.additionalProperties)
                            }

                            /** Latitude of the current position of the transit vehicle. */
                            fun lat(lat: Double) = lat(JsonField.of(lat))

                            /** Latitude of the current position of the transit vehicle. */
                            @JsonProperty("lat")
                            @ExcludeMissing
                            fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

                            /** Longitude of the current position of the transit vehicle. */
                            fun lon(lon: Double) = lon(JsonField.of(lon))

                            /** Longitude of the current position of the transit vehicle. */
                            @JsonProperty("lon")
                            @ExcludeMissing
                            fun lon(lon: JsonField<Double>) = apply { this.lon = lon }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): Position =
                                Position(
                                    lat,
                                    lon,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }
                    }
                }
            }
        }

        @JsonDeserialize(builder = References.Builder::class)
        @NoAutoDetect
        class References
        private constructor(
            private val agencies: JsonField<List<Agency>>,
            private val routes: JsonField<List<Route>>,
            private val situations: JsonField<List<Situation>>,
            private val stopTimes: JsonField<List<StopTime>>,
            private val stops: JsonField<List<Stop>>,
            private val trips: JsonField<List<Trip>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun agencies(): List<Agency> = agencies.getRequired("agencies")

            fun routes(): List<Route> = routes.getRequired("routes")

            fun situations(): List<Situation> = situations.getRequired("situations")

            fun stopTimes(): List<StopTime> = stopTimes.getRequired("stopTimes")

            fun stops(): List<Stop> = stops.getRequired("stops")

            fun trips(): List<Trip> = trips.getRequired("trips")

            @JsonProperty("agencies") @ExcludeMissing fun _agencies() = agencies

            @JsonProperty("routes") @ExcludeMissing fun _routes() = routes

            @JsonProperty("situations") @ExcludeMissing fun _situations() = situations

            @JsonProperty("stopTimes") @ExcludeMissing fun _stopTimes() = stopTimes

            @JsonProperty("stops") @ExcludeMissing fun _stops() = stops

            @JsonProperty("trips") @ExcludeMissing fun _trips() = trips

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): References = apply {
                if (!validated) {
                    agencies().forEach { it.validate() }
                    routes().forEach { it.validate() }
                    situations().forEach { it.validate() }
                    stopTimes().forEach { it.validate() }
                    stops().forEach { it.validate() }
                    trips().forEach { it.validate() }
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is References &&
                    this.agencies == other.agencies &&
                    this.routes == other.routes &&
                    this.situations == other.situations &&
                    this.stopTimes == other.stopTimes &&
                    this.stops == other.stops &&
                    this.trips == other.trips &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            agencies,
                            routes,
                            situations,
                            stopTimes,
                            stops,
                            trips,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "References{agencies=$agencies, routes=$routes, situations=$situations, stopTimes=$stopTimes, stops=$stops, trips=$trips, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var agencies: JsonField<List<Agency>> = JsonMissing.of()
                private var routes: JsonField<List<Route>> = JsonMissing.of()
                private var situations: JsonField<List<Situation>> = JsonMissing.of()
                private var stopTimes: JsonField<List<StopTime>> = JsonMissing.of()
                private var stops: JsonField<List<Stop>> = JsonMissing.of()
                private var trips: JsonField<List<Trip>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(references: References) = apply {
                    this.agencies = references.agencies
                    this.routes = references.routes
                    this.situations = references.situations
                    this.stopTimes = references.stopTimes
                    this.stops = references.stops
                    this.trips = references.trips
                    additionalProperties(references.additionalProperties)
                }

                fun agencies(agencies: List<Agency>) = agencies(JsonField.of(agencies))

                @JsonProperty("agencies")
                @ExcludeMissing
                fun agencies(agencies: JsonField<List<Agency>>) = apply { this.agencies = agencies }

                fun routes(routes: List<Route>) = routes(JsonField.of(routes))

                @JsonProperty("routes")
                @ExcludeMissing
                fun routes(routes: JsonField<List<Route>>) = apply { this.routes = routes }

                fun situations(situations: List<Situation>) = situations(JsonField.of(situations))

                @JsonProperty("situations")
                @ExcludeMissing
                fun situations(situations: JsonField<List<Situation>>) = apply {
                    this.situations = situations
                }

                fun stopTimes(stopTimes: List<StopTime>) = stopTimes(JsonField.of(stopTimes))

                @JsonProperty("stopTimes")
                @ExcludeMissing
                fun stopTimes(stopTimes: JsonField<List<StopTime>>) = apply {
                    this.stopTimes = stopTimes
                }

                fun stops(stops: List<Stop>) = stops(JsonField.of(stops))

                @JsonProperty("stops")
                @ExcludeMissing
                fun stops(stops: JsonField<List<Stop>>) = apply { this.stops = stops }

                fun trips(trips: List<Trip>) = trips(JsonField.of(trips))

                @JsonProperty("trips")
                @ExcludeMissing
                fun trips(trips: JsonField<List<Trip>>) = apply { this.trips = trips }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): References =
                    References(
                        agencies.map { it.toUnmodifiable() },
                        routes.map { it.toUnmodifiable() },
                        situations.map { it.toUnmodifiable() },
                        stopTimes.map { it.toUnmodifiable() },
                        stops.map { it.toUnmodifiable() },
                        trips.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(builder = Agency.Builder::class)
            @NoAutoDetect
            class Agency
            private constructor(
                private val disclaimer: JsonField<String>,
                private val email: JsonField<String>,
                private val fareUrl: JsonField<String>,
                private val id: JsonField<String>,
                private val lang: JsonField<String>,
                private val name: JsonField<String>,
                private val phone: JsonField<String>,
                private val privateService: JsonField<Boolean>,
                private val timezone: JsonField<String>,
                private val url: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun disclaimer(): String? = disclaimer.getNullable("disclaimer")

                fun email(): String? = email.getNullable("email")

                fun fareUrl(): String? = fareUrl.getNullable("fareUrl")

                fun id(): String = id.getRequired("id")

                fun lang(): String? = lang.getNullable("lang")

                fun name(): String = name.getRequired("name")

                fun phone(): String? = phone.getNullable("phone")

                fun privateService(): Boolean? = privateService.getNullable("privateService")

                fun timezone(): String = timezone.getRequired("timezone")

                fun url(): String = url.getRequired("url")

                @JsonProperty("disclaimer") @ExcludeMissing fun _disclaimer() = disclaimer

                @JsonProperty("email") @ExcludeMissing fun _email() = email

                @JsonProperty("fareUrl") @ExcludeMissing fun _fareUrl() = fareUrl

                @JsonProperty("id") @ExcludeMissing fun _id() = id

                @JsonProperty("lang") @ExcludeMissing fun _lang() = lang

                @JsonProperty("name") @ExcludeMissing fun _name() = name

                @JsonProperty("phone") @ExcludeMissing fun _phone() = phone

                @JsonProperty("privateService")
                @ExcludeMissing
                fun _privateService() = privateService

                @JsonProperty("timezone") @ExcludeMissing fun _timezone() = timezone

                @JsonProperty("url") @ExcludeMissing fun _url() = url

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Agency = apply {
                    if (!validated) {
                        disclaimer()
                        email()
                        fareUrl()
                        id()
                        lang()
                        name()
                        phone()
                        privateService()
                        timezone()
                        url()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Agency &&
                        this.disclaimer == other.disclaimer &&
                        this.email == other.email &&
                        this.fareUrl == other.fareUrl &&
                        this.id == other.id &&
                        this.lang == other.lang &&
                        this.name == other.name &&
                        this.phone == other.phone &&
                        this.privateService == other.privateService &&
                        this.timezone == other.timezone &&
                        this.url == other.url &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                disclaimer,
                                email,
                                fareUrl,
                                id,
                                lang,
                                name,
                                phone,
                                privateService,
                                timezone,
                                url,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Agency{disclaimer=$disclaimer, email=$email, fareUrl=$fareUrl, id=$id, lang=$lang, name=$name, phone=$phone, privateService=$privateService, timezone=$timezone, url=$url, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var disclaimer: JsonField<String> = JsonMissing.of()
                    private var email: JsonField<String> = JsonMissing.of()
                    private var fareUrl: JsonField<String> = JsonMissing.of()
                    private var id: JsonField<String> = JsonMissing.of()
                    private var lang: JsonField<String> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var phone: JsonField<String> = JsonMissing.of()
                    private var privateService: JsonField<Boolean> = JsonMissing.of()
                    private var timezone: JsonField<String> = JsonMissing.of()
                    private var url: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(agency: Agency) = apply {
                        this.disclaimer = agency.disclaimer
                        this.email = agency.email
                        this.fareUrl = agency.fareUrl
                        this.id = agency.id
                        this.lang = agency.lang
                        this.name = agency.name
                        this.phone = agency.phone
                        this.privateService = agency.privateService
                        this.timezone = agency.timezone
                        this.url = agency.url
                        additionalProperties(agency.additionalProperties)
                    }

                    fun disclaimer(disclaimer: String) = disclaimer(JsonField.of(disclaimer))

                    @JsonProperty("disclaimer")
                    @ExcludeMissing
                    fun disclaimer(disclaimer: JsonField<String>) = apply {
                        this.disclaimer = disclaimer
                    }

                    fun email(email: String) = email(JsonField.of(email))

                    @JsonProperty("email")
                    @ExcludeMissing
                    fun email(email: JsonField<String>) = apply { this.email = email }

                    fun fareUrl(fareUrl: String) = fareUrl(JsonField.of(fareUrl))

                    @JsonProperty("fareUrl")
                    @ExcludeMissing
                    fun fareUrl(fareUrl: JsonField<String>) = apply { this.fareUrl = fareUrl }

                    fun id(id: String) = id(JsonField.of(id))

                    @JsonProperty("id")
                    @ExcludeMissing
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun lang(lang: String) = lang(JsonField.of(lang))

                    @JsonProperty("lang")
                    @ExcludeMissing
                    fun lang(lang: JsonField<String>) = apply { this.lang = lang }

                    fun name(name: String) = name(JsonField.of(name))

                    @JsonProperty("name")
                    @ExcludeMissing
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun phone(phone: String) = phone(JsonField.of(phone))

                    @JsonProperty("phone")
                    @ExcludeMissing
                    fun phone(phone: JsonField<String>) = apply { this.phone = phone }

                    fun privateService(privateService: Boolean) =
                        privateService(JsonField.of(privateService))

                    @JsonProperty("privateService")
                    @ExcludeMissing
                    fun privateService(privateService: JsonField<Boolean>) = apply {
                        this.privateService = privateService
                    }

                    fun timezone(timezone: String) = timezone(JsonField.of(timezone))

                    @JsonProperty("timezone")
                    @ExcludeMissing
                    fun timezone(timezone: JsonField<String>) = apply { this.timezone = timezone }

                    fun url(url: String) = url(JsonField.of(url))

                    @JsonProperty("url")
                    @ExcludeMissing
                    fun url(url: JsonField<String>) = apply { this.url = url }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Agency =
                        Agency(
                            disclaimer,
                            email,
                            fareUrl,
                            id,
                            lang,
                            name,
                            phone,
                            privateService,
                            timezone,
                            url,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }

            @JsonDeserialize(builder = Route.Builder::class)
            @NoAutoDetect
            class Route
            private constructor(
                private val agencyId: JsonField<String>,
                private val color: JsonField<String>,
                private val description: JsonField<String>,
                private val id: JsonField<String>,
                private val longName: JsonField<String>,
                private val nullSafeShortName: JsonField<String>,
                private val shortName: JsonField<String>,
                private val textColor: JsonField<String>,
                private val type: JsonField<Long>,
                private val url: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun agencyId(): String = agencyId.getRequired("agencyId")

                fun color(): String? = color.getNullable("color")

                fun description(): String? = description.getNullable("description")

                fun id(): String = id.getRequired("id")

                fun longName(): String? = longName.getNullable("longName")

                fun nullSafeShortName(): String? =
                    nullSafeShortName.getNullable("nullSafeShortName")

                fun shortName(): String? = shortName.getNullable("shortName")

                fun textColor(): String? = textColor.getNullable("textColor")

                fun type(): Long = type.getRequired("type")

                fun url(): String? = url.getNullable("url")

                @JsonProperty("agencyId") @ExcludeMissing fun _agencyId() = agencyId

                @JsonProperty("color") @ExcludeMissing fun _color() = color

                @JsonProperty("description") @ExcludeMissing fun _description() = description

                @JsonProperty("id") @ExcludeMissing fun _id() = id

                @JsonProperty("longName") @ExcludeMissing fun _longName() = longName

                @JsonProperty("nullSafeShortName")
                @ExcludeMissing
                fun _nullSafeShortName() = nullSafeShortName

                @JsonProperty("shortName") @ExcludeMissing fun _shortName() = shortName

                @JsonProperty("textColor") @ExcludeMissing fun _textColor() = textColor

                @JsonProperty("type") @ExcludeMissing fun _type() = type

                @JsonProperty("url") @ExcludeMissing fun _url() = url

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Route = apply {
                    if (!validated) {
                        agencyId()
                        color()
                        description()
                        id()
                        longName()
                        nullSafeShortName()
                        shortName()
                        textColor()
                        type()
                        url()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Route &&
                        this.agencyId == other.agencyId &&
                        this.color == other.color &&
                        this.description == other.description &&
                        this.id == other.id &&
                        this.longName == other.longName &&
                        this.nullSafeShortName == other.nullSafeShortName &&
                        this.shortName == other.shortName &&
                        this.textColor == other.textColor &&
                        this.type == other.type &&
                        this.url == other.url &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                agencyId,
                                color,
                                description,
                                id,
                                longName,
                                nullSafeShortName,
                                shortName,
                                textColor,
                                type,
                                url,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Route{agencyId=$agencyId, color=$color, description=$description, id=$id, longName=$longName, nullSafeShortName=$nullSafeShortName, shortName=$shortName, textColor=$textColor, type=$type, url=$url, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var agencyId: JsonField<String> = JsonMissing.of()
                    private var color: JsonField<String> = JsonMissing.of()
                    private var description: JsonField<String> = JsonMissing.of()
                    private var id: JsonField<String> = JsonMissing.of()
                    private var longName: JsonField<String> = JsonMissing.of()
                    private var nullSafeShortName: JsonField<String> = JsonMissing.of()
                    private var shortName: JsonField<String> = JsonMissing.of()
                    private var textColor: JsonField<String> = JsonMissing.of()
                    private var type: JsonField<Long> = JsonMissing.of()
                    private var url: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(route: Route) = apply {
                        this.agencyId = route.agencyId
                        this.color = route.color
                        this.description = route.description
                        this.id = route.id
                        this.longName = route.longName
                        this.nullSafeShortName = route.nullSafeShortName
                        this.shortName = route.shortName
                        this.textColor = route.textColor
                        this.type = route.type
                        this.url = route.url
                        additionalProperties(route.additionalProperties)
                    }

                    fun agencyId(agencyId: String) = agencyId(JsonField.of(agencyId))

                    @JsonProperty("agencyId")
                    @ExcludeMissing
                    fun agencyId(agencyId: JsonField<String>) = apply { this.agencyId = agencyId }

                    fun color(color: String) = color(JsonField.of(color))

                    @JsonProperty("color")
                    @ExcludeMissing
                    fun color(color: JsonField<String>) = apply { this.color = color }

                    fun description(description: String) = description(JsonField.of(description))

                    @JsonProperty("description")
                    @ExcludeMissing
                    fun description(description: JsonField<String>) = apply {
                        this.description = description
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    @JsonProperty("id")
                    @ExcludeMissing
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun longName(longName: String) = longName(JsonField.of(longName))

                    @JsonProperty("longName")
                    @ExcludeMissing
                    fun longName(longName: JsonField<String>) = apply { this.longName = longName }

                    fun nullSafeShortName(nullSafeShortName: String) =
                        nullSafeShortName(JsonField.of(nullSafeShortName))

                    @JsonProperty("nullSafeShortName")
                    @ExcludeMissing
                    fun nullSafeShortName(nullSafeShortName: JsonField<String>) = apply {
                        this.nullSafeShortName = nullSafeShortName
                    }

                    fun shortName(shortName: String) = shortName(JsonField.of(shortName))

                    @JsonProperty("shortName")
                    @ExcludeMissing
                    fun shortName(shortName: JsonField<String>) = apply {
                        this.shortName = shortName
                    }

                    fun textColor(textColor: String) = textColor(JsonField.of(textColor))

                    @JsonProperty("textColor")
                    @ExcludeMissing
                    fun textColor(textColor: JsonField<String>) = apply {
                        this.textColor = textColor
                    }

                    fun type(type: Long) = type(JsonField.of(type))

                    @JsonProperty("type")
                    @ExcludeMissing
                    fun type(type: JsonField<Long>) = apply { this.type = type }

                    fun url(url: String) = url(JsonField.of(url))

                    @JsonProperty("url")
                    @ExcludeMissing
                    fun url(url: JsonField<String>) = apply { this.url = url }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Route =
                        Route(
                            agencyId,
                            color,
                            description,
                            id,
                            longName,
                            nullSafeShortName,
                            shortName,
                            textColor,
                            type,
                            url,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }

            @JsonDeserialize(builder = Situation.Builder::class)
            @NoAutoDetect
            class Situation
            private constructor(
                private val id: JsonField<String>,
                private val creationTime: JsonField<Long>,
                private val reason: JsonField<Reason>,
                private val summary: JsonField<Summary>,
                private val description: JsonField<Description>,
                private val url: JsonField<Url>,
                private val activeWindows: JsonField<List<ActiveWindow>>,
                private val allAffects: JsonField<List<AllAffect>>,
                private val consequences: JsonField<List<Consequence>>,
                private val publicationWindows: JsonField<List<PublicationWindow>>,
                private val severity: JsonField<String>,
                private val consequenceMessage: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** Unique identifier for the situation. */
                fun id(): String = id.getRequired("id")

                /** Unix timestamp of when this situation was created. */
                fun creationTime(): Long = creationTime.getRequired("creationTime")

                /** Reason for the service alert, taken from TPEG codes. */
                fun reason(): Reason? = reason.getNullable("reason")

                fun summary(): Summary? = summary.getNullable("summary")

                fun description(): Description? = description.getNullable("description")

                fun url(): Url? = url.getNullable("url")

                fun activeWindows(): List<ActiveWindow>? =
                    activeWindows.getNullable("activeWindows")

                fun allAffects(): List<AllAffect>? = allAffects.getNullable("allAffects")

                fun consequences(): List<Consequence>? = consequences.getNullable("consequences")

                fun publicationWindows(): List<PublicationWindow>? =
                    publicationWindows.getNullable("publicationWindows")

                /** Severity of the situation. */
                fun severity(): String? = severity.getNullable("severity")

                /** Message regarding the consequence of the situation. */
                fun consequenceMessage(): String? =
                    consequenceMessage.getNullable("consequenceMessage")

                /** Unique identifier for the situation. */
                @JsonProperty("id") @ExcludeMissing fun _id() = id

                /** Unix timestamp of when this situation was created. */
                @JsonProperty("creationTime") @ExcludeMissing fun _creationTime() = creationTime

                /** Reason for the service alert, taken from TPEG codes. */
                @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

                @JsonProperty("summary") @ExcludeMissing fun _summary() = summary

                @JsonProperty("description") @ExcludeMissing fun _description() = description

                @JsonProperty("url") @ExcludeMissing fun _url() = url

                @JsonProperty("activeWindows") @ExcludeMissing fun _activeWindows() = activeWindows

                @JsonProperty("allAffects") @ExcludeMissing fun _allAffects() = allAffects

                @JsonProperty("consequences") @ExcludeMissing fun _consequences() = consequences

                @JsonProperty("publicationWindows")
                @ExcludeMissing
                fun _publicationWindows() = publicationWindows

                /** Severity of the situation. */
                @JsonProperty("severity") @ExcludeMissing fun _severity() = severity

                /** Message regarding the consequence of the situation. */
                @JsonProperty("consequenceMessage")
                @ExcludeMissing
                fun _consequenceMessage() = consequenceMessage

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Situation = apply {
                    if (!validated) {
                        id()
                        creationTime()
                        reason()
                        summary()?.validate()
                        description()?.validate()
                        url()?.validate()
                        activeWindows()?.forEach { it.validate() }
                        allAffects()?.forEach { it.validate() }
                        consequences()?.forEach { it.validate() }
                        publicationWindows()?.forEach { it.validate() }
                        severity()
                        consequenceMessage()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Situation &&
                        this.id == other.id &&
                        this.creationTime == other.creationTime &&
                        this.reason == other.reason &&
                        this.summary == other.summary &&
                        this.description == other.description &&
                        this.url == other.url &&
                        this.activeWindows == other.activeWindows &&
                        this.allAffects == other.allAffects &&
                        this.consequences == other.consequences &&
                        this.publicationWindows == other.publicationWindows &&
                        this.severity == other.severity &&
                        this.consequenceMessage == other.consequenceMessage &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                id,
                                creationTime,
                                reason,
                                summary,
                                description,
                                url,
                                activeWindows,
                                allAffects,
                                consequences,
                                publicationWindows,
                                severity,
                                consequenceMessage,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Situation{id=$id, creationTime=$creationTime, reason=$reason, summary=$summary, description=$description, url=$url, activeWindows=$activeWindows, allAffects=$allAffects, consequences=$consequences, publicationWindows=$publicationWindows, severity=$severity, consequenceMessage=$consequenceMessage, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var id: JsonField<String> = JsonMissing.of()
                    private var creationTime: JsonField<Long> = JsonMissing.of()
                    private var reason: JsonField<Reason> = JsonMissing.of()
                    private var summary: JsonField<Summary> = JsonMissing.of()
                    private var description: JsonField<Description> = JsonMissing.of()
                    private var url: JsonField<Url> = JsonMissing.of()
                    private var activeWindows: JsonField<List<ActiveWindow>> = JsonMissing.of()
                    private var allAffects: JsonField<List<AllAffect>> = JsonMissing.of()
                    private var consequences: JsonField<List<Consequence>> = JsonMissing.of()
                    private var publicationWindows: JsonField<List<PublicationWindow>> =
                        JsonMissing.of()
                    private var severity: JsonField<String> = JsonMissing.of()
                    private var consequenceMessage: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(situation: Situation) = apply {
                        this.id = situation.id
                        this.creationTime = situation.creationTime
                        this.reason = situation.reason
                        this.summary = situation.summary
                        this.description = situation.description
                        this.url = situation.url
                        this.activeWindows = situation.activeWindows
                        this.allAffects = situation.allAffects
                        this.consequences = situation.consequences
                        this.publicationWindows = situation.publicationWindows
                        this.severity = situation.severity
                        this.consequenceMessage = situation.consequenceMessage
                        additionalProperties(situation.additionalProperties)
                    }

                    /** Unique identifier for the situation. */
                    fun id(id: String) = id(JsonField.of(id))

                    /** Unique identifier for the situation. */
                    @JsonProperty("id")
                    @ExcludeMissing
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /** Unix timestamp of when this situation was created. */
                    fun creationTime(creationTime: Long) = creationTime(JsonField.of(creationTime))

                    /** Unix timestamp of when this situation was created. */
                    @JsonProperty("creationTime")
                    @ExcludeMissing
                    fun creationTime(creationTime: JsonField<Long>) = apply {
                        this.creationTime = creationTime
                    }

                    /** Reason for the service alert, taken from TPEG codes. */
                    fun reason(reason: Reason) = reason(JsonField.of(reason))

                    /** Reason for the service alert, taken from TPEG codes. */
                    @JsonProperty("reason")
                    @ExcludeMissing
                    fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

                    fun summary(summary: Summary) = summary(JsonField.of(summary))

                    @JsonProperty("summary")
                    @ExcludeMissing
                    fun summary(summary: JsonField<Summary>) = apply { this.summary = summary }

                    fun description(description: Description) =
                        description(JsonField.of(description))

                    @JsonProperty("description")
                    @ExcludeMissing
                    fun description(description: JsonField<Description>) = apply {
                        this.description = description
                    }

                    fun url(url: Url) = url(JsonField.of(url))

                    @JsonProperty("url")
                    @ExcludeMissing
                    fun url(url: JsonField<Url>) = apply { this.url = url }

                    fun activeWindows(activeWindows: List<ActiveWindow>) =
                        activeWindows(JsonField.of(activeWindows))

                    @JsonProperty("activeWindows")
                    @ExcludeMissing
                    fun activeWindows(activeWindows: JsonField<List<ActiveWindow>>) = apply {
                        this.activeWindows = activeWindows
                    }

                    fun allAffects(allAffects: List<AllAffect>) =
                        allAffects(JsonField.of(allAffects))

                    @JsonProperty("allAffects")
                    @ExcludeMissing
                    fun allAffects(allAffects: JsonField<List<AllAffect>>) = apply {
                        this.allAffects = allAffects
                    }

                    fun consequences(consequences: List<Consequence>) =
                        consequences(JsonField.of(consequences))

                    @JsonProperty("consequences")
                    @ExcludeMissing
                    fun consequences(consequences: JsonField<List<Consequence>>) = apply {
                        this.consequences = consequences
                    }

                    fun publicationWindows(publicationWindows: List<PublicationWindow>) =
                        publicationWindows(JsonField.of(publicationWindows))

                    @JsonProperty("publicationWindows")
                    @ExcludeMissing
                    fun publicationWindows(publicationWindows: JsonField<List<PublicationWindow>>) =
                        apply {
                            this.publicationWindows = publicationWindows
                        }

                    /** Severity of the situation. */
                    fun severity(severity: String) = severity(JsonField.of(severity))

                    /** Severity of the situation. */
                    @JsonProperty("severity")
                    @ExcludeMissing
                    fun severity(severity: JsonField<String>) = apply { this.severity = severity }

                    /** Message regarding the consequence of the situation. */
                    fun consequenceMessage(consequenceMessage: String) =
                        consequenceMessage(JsonField.of(consequenceMessage))

                    /** Message regarding the consequence of the situation. */
                    @JsonProperty("consequenceMessage")
                    @ExcludeMissing
                    fun consequenceMessage(consequenceMessage: JsonField<String>) = apply {
                        this.consequenceMessage = consequenceMessage
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Situation =
                        Situation(
                            id,
                            creationTime,
                            reason,
                            summary,
                            description,
                            url,
                            activeWindows.map { it.toUnmodifiable() },
                            allAffects.map { it.toUnmodifiable() },
                            consequences.map { it.toUnmodifiable() },
                            publicationWindows.map { it.toUnmodifiable() },
                            severity,
                            consequenceMessage,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                @JsonDeserialize(builder = ActiveWindow.Builder::class)
                @NoAutoDetect
                class ActiveWindow
                private constructor(
                    private val from: JsonField<Long>,
                    private val to: JsonField<Long>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** Start time of the active window as a Unix timestamp. */
                    fun from(): Long? = from.getNullable("from")

                    /** End time of the active window as a Unix timestamp. */
                    fun to(): Long? = to.getNullable("to")

                    /** Start time of the active window as a Unix timestamp. */
                    @JsonProperty("from") @ExcludeMissing fun _from() = from

                    /** End time of the active window as a Unix timestamp. */
                    @JsonProperty("to") @ExcludeMissing fun _to() = to

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): ActiveWindow = apply {
                        if (!validated) {
                            from()
                            to()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ActiveWindow &&
                            this.from == other.from &&
                            this.to == other.to &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    from,
                                    to,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "ActiveWindow{from=$from, to=$to, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var from: JsonField<Long> = JsonMissing.of()
                        private var to: JsonField<Long> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(activeWindow: ActiveWindow) = apply {
                            this.from = activeWindow.from
                            this.to = activeWindow.to
                            additionalProperties(activeWindow.additionalProperties)
                        }

                        /** Start time of the active window as a Unix timestamp. */
                        fun from(from: Long) = from(JsonField.of(from))

                        /** Start time of the active window as a Unix timestamp. */
                        @JsonProperty("from")
                        @ExcludeMissing
                        fun from(from: JsonField<Long>) = apply { this.from = from }

                        /** End time of the active window as a Unix timestamp. */
                        fun to(to: Long) = to(JsonField.of(to))

                        /** End time of the active window as a Unix timestamp. */
                        @JsonProperty("to")
                        @ExcludeMissing
                        fun to(to: JsonField<Long>) = apply { this.to = to }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): ActiveWindow =
                            ActiveWindow(
                                from,
                                to,
                                additionalProperties.toUnmodifiable(),
                            )
                    }
                }

                @JsonDeserialize(builder = AllAffect.Builder::class)
                @NoAutoDetect
                class AllAffect
                private constructor(
                    private val agencyId: JsonField<String>,
                    private val applicationId: JsonField<String>,
                    private val directionId: JsonField<String>,
                    private val routeId: JsonField<String>,
                    private val stopId: JsonField<String>,
                    private val tripId: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** Identifier for the agency. */
                    fun agencyId(): String? = agencyId.getNullable("agencyId")

                    /** Identifier for the application. */
                    fun applicationId(): String? = applicationId.getNullable("applicationId")

                    /** Identifier for the direction. */
                    fun directionId(): String? = directionId.getNullable("directionId")

                    /** Identifier for the route. */
                    fun routeId(): String? = routeId.getNullable("routeId")

                    /** Identifier for the stop. */
                    fun stopId(): String? = stopId.getNullable("stopId")

                    /** Identifier for the trip. */
                    fun tripId(): String? = tripId.getNullable("tripId")

                    /** Identifier for the agency. */
                    @JsonProperty("agencyId") @ExcludeMissing fun _agencyId() = agencyId

                    /** Identifier for the application. */
                    @JsonProperty("applicationId")
                    @ExcludeMissing
                    fun _applicationId() = applicationId

                    /** Identifier for the direction. */
                    @JsonProperty("directionId") @ExcludeMissing fun _directionId() = directionId

                    /** Identifier for the route. */
                    @JsonProperty("routeId") @ExcludeMissing fun _routeId() = routeId

                    /** Identifier for the stop. */
                    @JsonProperty("stopId") @ExcludeMissing fun _stopId() = stopId

                    /** Identifier for the trip. */
                    @JsonProperty("tripId") @ExcludeMissing fun _tripId() = tripId

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): AllAffect = apply {
                        if (!validated) {
                            agencyId()
                            applicationId()
                            directionId()
                            routeId()
                            stopId()
                            tripId()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is AllAffect &&
                            this.agencyId == other.agencyId &&
                            this.applicationId == other.applicationId &&
                            this.directionId == other.directionId &&
                            this.routeId == other.routeId &&
                            this.stopId == other.stopId &&
                            this.tripId == other.tripId &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    agencyId,
                                    applicationId,
                                    directionId,
                                    routeId,
                                    stopId,
                                    tripId,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "AllAffect{agencyId=$agencyId, applicationId=$applicationId, directionId=$directionId, routeId=$routeId, stopId=$stopId, tripId=$tripId, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var agencyId: JsonField<String> = JsonMissing.of()
                        private var applicationId: JsonField<String> = JsonMissing.of()
                        private var directionId: JsonField<String> = JsonMissing.of()
                        private var routeId: JsonField<String> = JsonMissing.of()
                        private var stopId: JsonField<String> = JsonMissing.of()
                        private var tripId: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(allAffect: AllAffect) = apply {
                            this.agencyId = allAffect.agencyId
                            this.applicationId = allAffect.applicationId
                            this.directionId = allAffect.directionId
                            this.routeId = allAffect.routeId
                            this.stopId = allAffect.stopId
                            this.tripId = allAffect.tripId
                            additionalProperties(allAffect.additionalProperties)
                        }

                        /** Identifier for the agency. */
                        fun agencyId(agencyId: String) = agencyId(JsonField.of(agencyId))

                        /** Identifier for the agency. */
                        @JsonProperty("agencyId")
                        @ExcludeMissing
                        fun agencyId(agencyId: JsonField<String>) = apply {
                            this.agencyId = agencyId
                        }

                        /** Identifier for the application. */
                        fun applicationId(applicationId: String) =
                            applicationId(JsonField.of(applicationId))

                        /** Identifier for the application. */
                        @JsonProperty("applicationId")
                        @ExcludeMissing
                        fun applicationId(applicationId: JsonField<String>) = apply {
                            this.applicationId = applicationId
                        }

                        /** Identifier for the direction. */
                        fun directionId(directionId: String) =
                            directionId(JsonField.of(directionId))

                        /** Identifier for the direction. */
                        @JsonProperty("directionId")
                        @ExcludeMissing
                        fun directionId(directionId: JsonField<String>) = apply {
                            this.directionId = directionId
                        }

                        /** Identifier for the route. */
                        fun routeId(routeId: String) = routeId(JsonField.of(routeId))

                        /** Identifier for the route. */
                        @JsonProperty("routeId")
                        @ExcludeMissing
                        fun routeId(routeId: JsonField<String>) = apply { this.routeId = routeId }

                        /** Identifier for the stop. */
                        fun stopId(stopId: String) = stopId(JsonField.of(stopId))

                        /** Identifier for the stop. */
                        @JsonProperty("stopId")
                        @ExcludeMissing
                        fun stopId(stopId: JsonField<String>) = apply { this.stopId = stopId }

                        /** Identifier for the trip. */
                        fun tripId(tripId: String) = tripId(JsonField.of(tripId))

                        /** Identifier for the trip. */
                        @JsonProperty("tripId")
                        @ExcludeMissing
                        fun tripId(tripId: JsonField<String>) = apply { this.tripId = tripId }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): AllAffect =
                            AllAffect(
                                agencyId,
                                applicationId,
                                directionId,
                                routeId,
                                stopId,
                                tripId,
                                additionalProperties.toUnmodifiable(),
                            )
                    }
                }

                @JsonDeserialize(builder = Consequence.Builder::class)
                @NoAutoDetect
                class Consequence
                private constructor(
                    private val condition: JsonField<String>,
                    private val conditionDetails: JsonField<ConditionDetails>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** Condition of the consequence. */
                    fun condition(): String? = condition.getNullable("condition")

                    fun conditionDetails(): ConditionDetails? =
                        conditionDetails.getNullable("conditionDetails")

                    /** Condition of the consequence. */
                    @JsonProperty("condition") @ExcludeMissing fun _condition() = condition

                    @JsonProperty("conditionDetails")
                    @ExcludeMissing
                    fun _conditionDetails() = conditionDetails

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Consequence = apply {
                        if (!validated) {
                            condition()
                            conditionDetails()?.validate()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Consequence &&
                            this.condition == other.condition &&
                            this.conditionDetails == other.conditionDetails &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    condition,
                                    conditionDetails,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Consequence{condition=$condition, conditionDetails=$conditionDetails, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var condition: JsonField<String> = JsonMissing.of()
                        private var conditionDetails: JsonField<ConditionDetails> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(consequence: Consequence) = apply {
                            this.condition = consequence.condition
                            this.conditionDetails = consequence.conditionDetails
                            additionalProperties(consequence.additionalProperties)
                        }

                        /** Condition of the consequence. */
                        fun condition(condition: String) = condition(JsonField.of(condition))

                        /** Condition of the consequence. */
                        @JsonProperty("condition")
                        @ExcludeMissing
                        fun condition(condition: JsonField<String>) = apply {
                            this.condition = condition
                        }

                        fun conditionDetails(conditionDetails: ConditionDetails) =
                            conditionDetails(JsonField.of(conditionDetails))

                        @JsonProperty("conditionDetails")
                        @ExcludeMissing
                        fun conditionDetails(conditionDetails: JsonField<ConditionDetails>) =
                            apply {
                                this.conditionDetails = conditionDetails
                            }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Consequence =
                            Consequence(
                                condition,
                                conditionDetails,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    @JsonDeserialize(builder = ConditionDetails.Builder::class)
                    @NoAutoDetect
                    class ConditionDetails
                    private constructor(
                        private val diversionPath: JsonField<DiversionPath>,
                        private val diversionStopIds: JsonField<List<String>>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        fun diversionPath(): DiversionPath? =
                            diversionPath.getNullable("diversionPath")

                        fun diversionStopIds(): List<String>? =
                            diversionStopIds.getNullable("diversionStopIds")

                        @JsonProperty("diversionPath")
                        @ExcludeMissing
                        fun _diversionPath() = diversionPath

                        @JsonProperty("diversionStopIds")
                        @ExcludeMissing
                        fun _diversionStopIds() = diversionStopIds

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): ConditionDetails = apply {
                            if (!validated) {
                                diversionPath()?.validate()
                                diversionStopIds()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is ConditionDetails &&
                                this.diversionPath == other.diversionPath &&
                                this.diversionStopIds == other.diversionStopIds &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        diversionPath,
                                        diversionStopIds,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "ConditionDetails{diversionPath=$diversionPath, diversionStopIds=$diversionStopIds, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var diversionPath: JsonField<DiversionPath> = JsonMissing.of()
                            private var diversionStopIds: JsonField<List<String>> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(conditionDetails: ConditionDetails) = apply {
                                this.diversionPath = conditionDetails.diversionPath
                                this.diversionStopIds = conditionDetails.diversionStopIds
                                additionalProperties(conditionDetails.additionalProperties)
                            }

                            fun diversionPath(diversionPath: DiversionPath) =
                                diversionPath(JsonField.of(diversionPath))

                            @JsonProperty("diversionPath")
                            @ExcludeMissing
                            fun diversionPath(diversionPath: JsonField<DiversionPath>) = apply {
                                this.diversionPath = diversionPath
                            }

                            fun diversionStopIds(diversionStopIds: List<String>) =
                                diversionStopIds(JsonField.of(diversionStopIds))

                            @JsonProperty("diversionStopIds")
                            @ExcludeMissing
                            fun diversionStopIds(diversionStopIds: JsonField<List<String>>) =
                                apply {
                                    this.diversionStopIds = diversionStopIds
                                }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): ConditionDetails =
                                ConditionDetails(
                                    diversionPath,
                                    diversionStopIds.map { it.toUnmodifiable() },
                                    additionalProperties.toUnmodifiable(),
                                )
                        }

                        @JsonDeserialize(builder = DiversionPath.Builder::class)
                        @NoAutoDetect
                        class DiversionPath
                        private constructor(
                            private val length: JsonField<Long>,
                            private val levels: JsonField<String>,
                            private val points: JsonField<String>,
                            private val additionalProperties: Map<String, JsonValue>,
                        ) {

                            private var validated: Boolean = false

                            private var hashCode: Int = 0

                            /** Length of the diversion path. */
                            fun length(): Long? = length.getNullable("length")

                            /** Levels of the diversion path. */
                            fun levels(): String? = levels.getNullable("levels")

                            /** Points of the diversion path. */
                            fun points(): String? = points.getNullable("points")

                            /** Length of the diversion path. */
                            @JsonProperty("length") @ExcludeMissing fun _length() = length

                            /** Levels of the diversion path. */
                            @JsonProperty("levels") @ExcludeMissing fun _levels() = levels

                            /** Points of the diversion path. */
                            @JsonProperty("points") @ExcludeMissing fun _points() = points

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

                            fun validate(): DiversionPath = apply {
                                if (!validated) {
                                    length()
                                    levels()
                                    points()
                                    validated = true
                                }
                            }

                            fun toBuilder() = Builder().from(this)

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is DiversionPath &&
                                    this.length == other.length &&
                                    this.levels == other.levels &&
                                    this.points == other.points &&
                                    this.additionalProperties == other.additionalProperties
                            }

                            override fun hashCode(): Int {
                                if (hashCode == 0) {
                                    hashCode =
                                        Objects.hash(
                                            length,
                                            levels,
                                            points,
                                            additionalProperties,
                                        )
                                }
                                return hashCode
                            }

                            override fun toString() =
                                "DiversionPath{length=$length, levels=$levels, points=$points, additionalProperties=$additionalProperties}"

                            companion object {

                                fun builder() = Builder()
                            }

                            class Builder {

                                private var length: JsonField<Long> = JsonMissing.of()
                                private var levels: JsonField<String> = JsonMissing.of()
                                private var points: JsonField<String> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                internal fun from(diversionPath: DiversionPath) = apply {
                                    this.length = diversionPath.length
                                    this.levels = diversionPath.levels
                                    this.points = diversionPath.points
                                    additionalProperties(diversionPath.additionalProperties)
                                }

                                /** Length of the diversion path. */
                                fun length(length: Long) = length(JsonField.of(length))

                                /** Length of the diversion path. */
                                @JsonProperty("length")
                                @ExcludeMissing
                                fun length(length: JsonField<Long>) = apply { this.length = length }

                                /** Levels of the diversion path. */
                                fun levels(levels: String) = levels(JsonField.of(levels))

                                /** Levels of the diversion path. */
                                @JsonProperty("levels")
                                @ExcludeMissing
                                fun levels(levels: JsonField<String>) = apply {
                                    this.levels = levels
                                }

                                /** Points of the diversion path. */
                                fun points(points: String) = points(JsonField.of(points))

                                /** Points of the diversion path. */
                                @JsonProperty("points")
                                @ExcludeMissing
                                fun points(points: JsonField<String>) = apply {
                                    this.points = points
                                }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                                @JsonAnySetter
                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    this.additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun build(): DiversionPath =
                                    DiversionPath(
                                        length,
                                        levels,
                                        points,
                                        additionalProperties.toUnmodifiable(),
                                    )
                            }
                        }
                    }
                }

                @JsonDeserialize(builder = Description.Builder::class)
                @NoAutoDetect
                class Description
                private constructor(
                    private val lang: JsonField<String>,
                    private val value: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** Language of the description. */
                    fun lang(): String? = lang.getNullable("lang")

                    /** Longer description of the situation. */
                    fun value(): String? = value.getNullable("value")

                    /** Language of the description. */
                    @JsonProperty("lang") @ExcludeMissing fun _lang() = lang

                    /** Longer description of the situation. */
                    @JsonProperty("value") @ExcludeMissing fun _value() = value

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Description = apply {
                        if (!validated) {
                            lang()
                            value()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Description &&
                            this.lang == other.lang &&
                            this.value == other.value &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    lang,
                                    value,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Description{lang=$lang, value=$value, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var lang: JsonField<String> = JsonMissing.of()
                        private var value: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(description: Description) = apply {
                            this.lang = description.lang
                            this.value = description.value
                            additionalProperties(description.additionalProperties)
                        }

                        /** Language of the description. */
                        fun lang(lang: String) = lang(JsonField.of(lang))

                        /** Language of the description. */
                        @JsonProperty("lang")
                        @ExcludeMissing
                        fun lang(lang: JsonField<String>) = apply { this.lang = lang }

                        /** Longer description of the situation. */
                        fun value(value: String) = value(JsonField.of(value))

                        /** Longer description of the situation. */
                        @JsonProperty("value")
                        @ExcludeMissing
                        fun value(value: JsonField<String>) = apply { this.value = value }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Description =
                            Description(
                                lang,
                                value,
                                additionalProperties.toUnmodifiable(),
                            )
                    }
                }

                @JsonDeserialize(builder = PublicationWindow.Builder::class)
                @NoAutoDetect
                class PublicationWindow
                private constructor(
                    private val from: JsonField<Long>,
                    private val to: JsonField<Long>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** Start time of the time window as a Unix timestamp. */
                    fun from(): Long = from.getRequired("from")

                    /** End time of the time window as a Unix timestamp. */
                    fun to(): Long = to.getRequired("to")

                    /** Start time of the time window as a Unix timestamp. */
                    @JsonProperty("from") @ExcludeMissing fun _from() = from

                    /** End time of the time window as a Unix timestamp. */
                    @JsonProperty("to") @ExcludeMissing fun _to() = to

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): PublicationWindow = apply {
                        if (!validated) {
                            from()
                            to()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is PublicationWindow &&
                            this.from == other.from &&
                            this.to == other.to &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    from,
                                    to,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "PublicationWindow{from=$from, to=$to, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var from: JsonField<Long> = JsonMissing.of()
                        private var to: JsonField<Long> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(publicationWindow: PublicationWindow) = apply {
                            this.from = publicationWindow.from
                            this.to = publicationWindow.to
                            additionalProperties(publicationWindow.additionalProperties)
                        }

                        /** Start time of the time window as a Unix timestamp. */
                        fun from(from: Long) = from(JsonField.of(from))

                        /** Start time of the time window as a Unix timestamp. */
                        @JsonProperty("from")
                        @ExcludeMissing
                        fun from(from: JsonField<Long>) = apply { this.from = from }

                        /** End time of the time window as a Unix timestamp. */
                        fun to(to: Long) = to(JsonField.of(to))

                        /** End time of the time window as a Unix timestamp. */
                        @JsonProperty("to")
                        @ExcludeMissing
                        fun to(to: JsonField<Long>) = apply { this.to = to }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): PublicationWindow =
                            PublicationWindow(
                                from,
                                to,
                                additionalProperties.toUnmodifiable(),
                            )
                    }
                }

                class Reason
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Reason && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val EQUIPMENT_REASON = Reason(JsonField.of("equipmentReason"))

                        val ENVIRONMENT_REASON = Reason(JsonField.of("environmentReason"))

                        val PERSONNEL_REASON = Reason(JsonField.of("personnelReason"))

                        val MISCELLANEOUS_REASON = Reason(JsonField.of("miscellaneousReason"))

                        val SECURITY_ALERT = Reason(JsonField.of("securityAlert"))

                        fun of(value: String) = Reason(JsonField.of(value))
                    }

                    enum class Known {
                        EQUIPMENT_REASON,
                        ENVIRONMENT_REASON,
                        PERSONNEL_REASON,
                        MISCELLANEOUS_REASON,
                        SECURITY_ALERT,
                    }

                    enum class Value {
                        EQUIPMENT_REASON,
                        ENVIRONMENT_REASON,
                        PERSONNEL_REASON,
                        MISCELLANEOUS_REASON,
                        SECURITY_ALERT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            EQUIPMENT_REASON -> Value.EQUIPMENT_REASON
                            ENVIRONMENT_REASON -> Value.ENVIRONMENT_REASON
                            PERSONNEL_REASON -> Value.PERSONNEL_REASON
                            MISCELLANEOUS_REASON -> Value.MISCELLANEOUS_REASON
                            SECURITY_ALERT -> Value.SECURITY_ALERT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            EQUIPMENT_REASON -> Known.EQUIPMENT_REASON
                            ENVIRONMENT_REASON -> Known.ENVIRONMENT_REASON
                            PERSONNEL_REASON -> Known.PERSONNEL_REASON
                            MISCELLANEOUS_REASON -> Known.MISCELLANEOUS_REASON
                            SECURITY_ALERT -> Known.SECURITY_ALERT
                            else -> throw OnebusawayktInvalidDataException("Unknown Reason: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                @JsonDeserialize(builder = Summary.Builder::class)
                @NoAutoDetect
                class Summary
                private constructor(
                    private val lang: JsonField<String>,
                    private val value: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** Language of the summary. */
                    fun lang(): String? = lang.getNullable("lang")

                    /** Short summary of the situation. */
                    fun value(): String? = value.getNullable("value")

                    /** Language of the summary. */
                    @JsonProperty("lang") @ExcludeMissing fun _lang() = lang

                    /** Short summary of the situation. */
                    @JsonProperty("value") @ExcludeMissing fun _value() = value

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Summary = apply {
                        if (!validated) {
                            lang()
                            value()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Summary &&
                            this.lang == other.lang &&
                            this.value == other.value &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    lang,
                                    value,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Summary{lang=$lang, value=$value, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var lang: JsonField<String> = JsonMissing.of()
                        private var value: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(summary: Summary) = apply {
                            this.lang = summary.lang
                            this.value = summary.value
                            additionalProperties(summary.additionalProperties)
                        }

                        /** Language of the summary. */
                        fun lang(lang: String) = lang(JsonField.of(lang))

                        /** Language of the summary. */
                        @JsonProperty("lang")
                        @ExcludeMissing
                        fun lang(lang: JsonField<String>) = apply { this.lang = lang }

                        /** Short summary of the situation. */
                        fun value(value: String) = value(JsonField.of(value))

                        /** Short summary of the situation. */
                        @JsonProperty("value")
                        @ExcludeMissing
                        fun value(value: JsonField<String>) = apply { this.value = value }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Summary =
                            Summary(
                                lang,
                                value,
                                additionalProperties.toUnmodifiable(),
                            )
                    }
                }

                @JsonDeserialize(builder = Url.Builder::class)
                @NoAutoDetect
                class Url
                private constructor(
                    private val lang: JsonField<String>,
                    private val value: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** Language of the URL. */
                    fun lang(): String? = lang.getNullable("lang")

                    /** URL for more information about the situation. */
                    fun value(): String? = value.getNullable("value")

                    /** Language of the URL. */
                    @JsonProperty("lang") @ExcludeMissing fun _lang() = lang

                    /** URL for more information about the situation. */
                    @JsonProperty("value") @ExcludeMissing fun _value() = value

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Url = apply {
                        if (!validated) {
                            lang()
                            value()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Url &&
                            this.lang == other.lang &&
                            this.value == other.value &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    lang,
                                    value,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Url{lang=$lang, value=$value, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var lang: JsonField<String> = JsonMissing.of()
                        private var value: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(url: Url) = apply {
                            this.lang = url.lang
                            this.value = url.value
                            additionalProperties(url.additionalProperties)
                        }

                        /** Language of the URL. */
                        fun lang(lang: String) = lang(JsonField.of(lang))

                        /** Language of the URL. */
                        @JsonProperty("lang")
                        @ExcludeMissing
                        fun lang(lang: JsonField<String>) = apply { this.lang = lang }

                        /** URL for more information about the situation. */
                        fun value(value: String) = value(JsonField.of(value))

                        /** URL for more information about the situation. */
                        @JsonProperty("value")
                        @ExcludeMissing
                        fun value(value: JsonField<String>) = apply { this.value = value }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Url =
                            Url(
                                lang,
                                value,
                                additionalProperties.toUnmodifiable(),
                            )
                    }
                }
            }

            @JsonDeserialize(builder = Stop.Builder::class)
            @NoAutoDetect
            class Stop
            private constructor(
                private val code: JsonField<String>,
                private val direction: JsonField<String>,
                private val id: JsonField<String>,
                private val lat: JsonField<Double>,
                private val locationType: JsonField<Long>,
                private val lon: JsonField<Double>,
                private val name: JsonField<String>,
                private val parent: JsonField<String>,
                private val routeIds: JsonField<List<String>>,
                private val staticRouteIds: JsonField<List<String>>,
                private val wheelchairBoarding: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun code(): String = code.getRequired("code")

                fun direction(): String? = direction.getNullable("direction")

                fun id(): String = id.getRequired("id")

                fun lat(): Double = lat.getRequired("lat")

                fun locationType(): Long? = locationType.getNullable("locationType")

                fun lon(): Double = lon.getRequired("lon")

                fun name(): String = name.getRequired("name")

                fun parent(): String? = parent.getNullable("parent")

                fun routeIds(): List<String>? = routeIds.getNullable("routeIds")

                fun staticRouteIds(): List<String>? = staticRouteIds.getNullable("staticRouteIds")

                fun wheelchairBoarding(): String? =
                    wheelchairBoarding.getNullable("wheelchairBoarding")

                @JsonProperty("code") @ExcludeMissing fun _code() = code

                @JsonProperty("direction") @ExcludeMissing fun _direction() = direction

                @JsonProperty("id") @ExcludeMissing fun _id() = id

                @JsonProperty("lat") @ExcludeMissing fun _lat() = lat

                @JsonProperty("locationType") @ExcludeMissing fun _locationType() = locationType

                @JsonProperty("lon") @ExcludeMissing fun _lon() = lon

                @JsonProperty("name") @ExcludeMissing fun _name() = name

                @JsonProperty("parent") @ExcludeMissing fun _parent() = parent

                @JsonProperty("routeIds") @ExcludeMissing fun _routeIds() = routeIds

                @JsonProperty("staticRouteIds")
                @ExcludeMissing
                fun _staticRouteIds() = staticRouteIds

                @JsonProperty("wheelchairBoarding")
                @ExcludeMissing
                fun _wheelchairBoarding() = wheelchairBoarding

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Stop = apply {
                    if (!validated) {
                        code()
                        direction()
                        id()
                        lat()
                        locationType()
                        lon()
                        name()
                        parent()
                        routeIds()
                        staticRouteIds()
                        wheelchairBoarding()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Stop &&
                        this.code == other.code &&
                        this.direction == other.direction &&
                        this.id == other.id &&
                        this.lat == other.lat &&
                        this.locationType == other.locationType &&
                        this.lon == other.lon &&
                        this.name == other.name &&
                        this.parent == other.parent &&
                        this.routeIds == other.routeIds &&
                        this.staticRouteIds == other.staticRouteIds &&
                        this.wheelchairBoarding == other.wheelchairBoarding &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                code,
                                direction,
                                id,
                                lat,
                                locationType,
                                lon,
                                name,
                                parent,
                                routeIds,
                                staticRouteIds,
                                wheelchairBoarding,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Stop{code=$code, direction=$direction, id=$id, lat=$lat, locationType=$locationType, lon=$lon, name=$name, parent=$parent, routeIds=$routeIds, staticRouteIds=$staticRouteIds, wheelchairBoarding=$wheelchairBoarding, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var code: JsonField<String> = JsonMissing.of()
                    private var direction: JsonField<String> = JsonMissing.of()
                    private var id: JsonField<String> = JsonMissing.of()
                    private var lat: JsonField<Double> = JsonMissing.of()
                    private var locationType: JsonField<Long> = JsonMissing.of()
                    private var lon: JsonField<Double> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var parent: JsonField<String> = JsonMissing.of()
                    private var routeIds: JsonField<List<String>> = JsonMissing.of()
                    private var staticRouteIds: JsonField<List<String>> = JsonMissing.of()
                    private var wheelchairBoarding: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(stop: Stop) = apply {
                        this.code = stop.code
                        this.direction = stop.direction
                        this.id = stop.id
                        this.lat = stop.lat
                        this.locationType = stop.locationType
                        this.lon = stop.lon
                        this.name = stop.name
                        this.parent = stop.parent
                        this.routeIds = stop.routeIds
                        this.staticRouteIds = stop.staticRouteIds
                        this.wheelchairBoarding = stop.wheelchairBoarding
                        additionalProperties(stop.additionalProperties)
                    }

                    fun code(code: String) = code(JsonField.of(code))

                    @JsonProperty("code")
                    @ExcludeMissing
                    fun code(code: JsonField<String>) = apply { this.code = code }

                    fun direction(direction: String) = direction(JsonField.of(direction))

                    @JsonProperty("direction")
                    @ExcludeMissing
                    fun direction(direction: JsonField<String>) = apply {
                        this.direction = direction
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    @JsonProperty("id")
                    @ExcludeMissing
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun lat(lat: Double) = lat(JsonField.of(lat))

                    @JsonProperty("lat")
                    @ExcludeMissing
                    fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

                    fun locationType(locationType: Long) = locationType(JsonField.of(locationType))

                    @JsonProperty("locationType")
                    @ExcludeMissing
                    fun locationType(locationType: JsonField<Long>) = apply {
                        this.locationType = locationType
                    }

                    fun lon(lon: Double) = lon(JsonField.of(lon))

                    @JsonProperty("lon")
                    @ExcludeMissing
                    fun lon(lon: JsonField<Double>) = apply { this.lon = lon }

                    fun name(name: String) = name(JsonField.of(name))

                    @JsonProperty("name")
                    @ExcludeMissing
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun parent(parent: String) = parent(JsonField.of(parent))

                    @JsonProperty("parent")
                    @ExcludeMissing
                    fun parent(parent: JsonField<String>) = apply { this.parent = parent }

                    fun routeIds(routeIds: List<String>) = routeIds(JsonField.of(routeIds))

                    @JsonProperty("routeIds")
                    @ExcludeMissing
                    fun routeIds(routeIds: JsonField<List<String>>) = apply {
                        this.routeIds = routeIds
                    }

                    fun staticRouteIds(staticRouteIds: List<String>) =
                        staticRouteIds(JsonField.of(staticRouteIds))

                    @JsonProperty("staticRouteIds")
                    @ExcludeMissing
                    fun staticRouteIds(staticRouteIds: JsonField<List<String>>) = apply {
                        this.staticRouteIds = staticRouteIds
                    }

                    fun wheelchairBoarding(wheelchairBoarding: String) =
                        wheelchairBoarding(JsonField.of(wheelchairBoarding))

                    @JsonProperty("wheelchairBoarding")
                    @ExcludeMissing
                    fun wheelchairBoarding(wheelchairBoarding: JsonField<String>) = apply {
                        this.wheelchairBoarding = wheelchairBoarding
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Stop =
                        Stop(
                            code,
                            direction,
                            id,
                            lat,
                            locationType,
                            lon,
                            name,
                            parent,
                            routeIds.map { it.toUnmodifiable() },
                            staticRouteIds.map { it.toUnmodifiable() },
                            wheelchairBoarding,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }

            @JsonDeserialize(builder = StopTime.Builder::class)
            @NoAutoDetect
            class StopTime
            private constructor(
                private val arrivalTime: JsonField<Long>,
                private val departureTime: JsonField<Long>,
                private val distanceAlongTrip: JsonField<Double>,
                private val historicalOccupancy: JsonField<String>,
                private val stopHeadsign: JsonField<String>,
                private val stopId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun arrivalTime(): Long? = arrivalTime.getNullable("arrivalTime")

                fun departureTime(): Long? = departureTime.getNullable("departureTime")

                fun distanceAlongTrip(): Double? =
                    distanceAlongTrip.getNullable("distanceAlongTrip")

                fun historicalOccupancy(): String? =
                    historicalOccupancy.getNullable("historicalOccupancy")

                fun stopHeadsign(): String? = stopHeadsign.getNullable("stopHeadsign")

                fun stopId(): String? = stopId.getNullable("stopId")

                @JsonProperty("arrivalTime") @ExcludeMissing fun _arrivalTime() = arrivalTime

                @JsonProperty("departureTime") @ExcludeMissing fun _departureTime() = departureTime

                @JsonProperty("distanceAlongTrip")
                @ExcludeMissing
                fun _distanceAlongTrip() = distanceAlongTrip

                @JsonProperty("historicalOccupancy")
                @ExcludeMissing
                fun _historicalOccupancy() = historicalOccupancy

                @JsonProperty("stopHeadsign") @ExcludeMissing fun _stopHeadsign() = stopHeadsign

                @JsonProperty("stopId") @ExcludeMissing fun _stopId() = stopId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): StopTime = apply {
                    if (!validated) {
                        arrivalTime()
                        departureTime()
                        distanceAlongTrip()
                        historicalOccupancy()
                        stopHeadsign()
                        stopId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is StopTime &&
                        this.arrivalTime == other.arrivalTime &&
                        this.departureTime == other.departureTime &&
                        this.distanceAlongTrip == other.distanceAlongTrip &&
                        this.historicalOccupancy == other.historicalOccupancy &&
                        this.stopHeadsign == other.stopHeadsign &&
                        this.stopId == other.stopId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                arrivalTime,
                                departureTime,
                                distanceAlongTrip,
                                historicalOccupancy,
                                stopHeadsign,
                                stopId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "StopTime{arrivalTime=$arrivalTime, departureTime=$departureTime, distanceAlongTrip=$distanceAlongTrip, historicalOccupancy=$historicalOccupancy, stopHeadsign=$stopHeadsign, stopId=$stopId, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var arrivalTime: JsonField<Long> = JsonMissing.of()
                    private var departureTime: JsonField<Long> = JsonMissing.of()
                    private var distanceAlongTrip: JsonField<Double> = JsonMissing.of()
                    private var historicalOccupancy: JsonField<String> = JsonMissing.of()
                    private var stopHeadsign: JsonField<String> = JsonMissing.of()
                    private var stopId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(stopTime: StopTime) = apply {
                        this.arrivalTime = stopTime.arrivalTime
                        this.departureTime = stopTime.departureTime
                        this.distanceAlongTrip = stopTime.distanceAlongTrip
                        this.historicalOccupancy = stopTime.historicalOccupancy
                        this.stopHeadsign = stopTime.stopHeadsign
                        this.stopId = stopTime.stopId
                        additionalProperties(stopTime.additionalProperties)
                    }

                    fun arrivalTime(arrivalTime: Long) = arrivalTime(JsonField.of(arrivalTime))

                    @JsonProperty("arrivalTime")
                    @ExcludeMissing
                    fun arrivalTime(arrivalTime: JsonField<Long>) = apply {
                        this.arrivalTime = arrivalTime
                    }

                    fun departureTime(departureTime: Long) =
                        departureTime(JsonField.of(departureTime))

                    @JsonProperty("departureTime")
                    @ExcludeMissing
                    fun departureTime(departureTime: JsonField<Long>) = apply {
                        this.departureTime = departureTime
                    }

                    fun distanceAlongTrip(distanceAlongTrip: Double) =
                        distanceAlongTrip(JsonField.of(distanceAlongTrip))

                    @JsonProperty("distanceAlongTrip")
                    @ExcludeMissing
                    fun distanceAlongTrip(distanceAlongTrip: JsonField<Double>) = apply {
                        this.distanceAlongTrip = distanceAlongTrip
                    }

                    fun historicalOccupancy(historicalOccupancy: String) =
                        historicalOccupancy(JsonField.of(historicalOccupancy))

                    @JsonProperty("historicalOccupancy")
                    @ExcludeMissing
                    fun historicalOccupancy(historicalOccupancy: JsonField<String>) = apply {
                        this.historicalOccupancy = historicalOccupancy
                    }

                    fun stopHeadsign(stopHeadsign: String) =
                        stopHeadsign(JsonField.of(stopHeadsign))

                    @JsonProperty("stopHeadsign")
                    @ExcludeMissing
                    fun stopHeadsign(stopHeadsign: JsonField<String>) = apply {
                        this.stopHeadsign = stopHeadsign
                    }

                    fun stopId(stopId: String) = stopId(JsonField.of(stopId))

                    @JsonProperty("stopId")
                    @ExcludeMissing
                    fun stopId(stopId: JsonField<String>) = apply { this.stopId = stopId }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): StopTime =
                        StopTime(
                            arrivalTime,
                            departureTime,
                            distanceAlongTrip,
                            historicalOccupancy,
                            stopHeadsign,
                            stopId,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }

            @JsonDeserialize(builder = Trip.Builder::class)
            @NoAutoDetect
            class Trip
            private constructor(
                private val blockId: JsonField<String>,
                private val directionId: JsonField<String>,
                private val id: JsonField<String>,
                private val peakOffpeak: JsonField<Long>,
                private val routeId: JsonField<String>,
                private val routeShortName: JsonField<String>,
                private val serviceId: JsonField<String>,
                private val shapeId: JsonField<String>,
                private val timeZone: JsonField<String>,
                private val tripHeadsign: JsonField<String>,
                private val tripShortName: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun blockId(): String? = blockId.getNullable("blockId")

                fun directionId(): String? = directionId.getNullable("directionId")

                fun id(): String = id.getRequired("id")

                fun peakOffpeak(): Long? = peakOffpeak.getNullable("peakOffpeak")

                fun routeId(): String = routeId.getRequired("routeId")

                fun routeShortName(): String? = routeShortName.getNullable("routeShortName")

                fun serviceId(): String = serviceId.getRequired("serviceId")

                fun shapeId(): String? = shapeId.getNullable("shapeId")

                fun timeZone(): String? = timeZone.getNullable("timeZone")

                fun tripHeadsign(): String? = tripHeadsign.getNullable("tripHeadsign")

                fun tripShortName(): String? = tripShortName.getNullable("tripShortName")

                @JsonProperty("blockId") @ExcludeMissing fun _blockId() = blockId

                @JsonProperty("directionId") @ExcludeMissing fun _directionId() = directionId

                @JsonProperty("id") @ExcludeMissing fun _id() = id

                @JsonProperty("peakOffpeak") @ExcludeMissing fun _peakOffpeak() = peakOffpeak

                @JsonProperty("routeId") @ExcludeMissing fun _routeId() = routeId

                @JsonProperty("routeShortName")
                @ExcludeMissing
                fun _routeShortName() = routeShortName

                @JsonProperty("serviceId") @ExcludeMissing fun _serviceId() = serviceId

                @JsonProperty("shapeId") @ExcludeMissing fun _shapeId() = shapeId

                @JsonProperty("timeZone") @ExcludeMissing fun _timeZone() = timeZone

                @JsonProperty("tripHeadsign") @ExcludeMissing fun _tripHeadsign() = tripHeadsign

                @JsonProperty("tripShortName") @ExcludeMissing fun _tripShortName() = tripShortName

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Trip = apply {
                    if (!validated) {
                        blockId()
                        directionId()
                        id()
                        peakOffpeak()
                        routeId()
                        routeShortName()
                        serviceId()
                        shapeId()
                        timeZone()
                        tripHeadsign()
                        tripShortName()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Trip &&
                        this.blockId == other.blockId &&
                        this.directionId == other.directionId &&
                        this.id == other.id &&
                        this.peakOffpeak == other.peakOffpeak &&
                        this.routeId == other.routeId &&
                        this.routeShortName == other.routeShortName &&
                        this.serviceId == other.serviceId &&
                        this.shapeId == other.shapeId &&
                        this.timeZone == other.timeZone &&
                        this.tripHeadsign == other.tripHeadsign &&
                        this.tripShortName == other.tripShortName &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                blockId,
                                directionId,
                                id,
                                peakOffpeak,
                                routeId,
                                routeShortName,
                                serviceId,
                                shapeId,
                                timeZone,
                                tripHeadsign,
                                tripShortName,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Trip{blockId=$blockId, directionId=$directionId, id=$id, peakOffpeak=$peakOffpeak, routeId=$routeId, routeShortName=$routeShortName, serviceId=$serviceId, shapeId=$shapeId, timeZone=$timeZone, tripHeadsign=$tripHeadsign, tripShortName=$tripShortName, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var blockId: JsonField<String> = JsonMissing.of()
                    private var directionId: JsonField<String> = JsonMissing.of()
                    private var id: JsonField<String> = JsonMissing.of()
                    private var peakOffpeak: JsonField<Long> = JsonMissing.of()
                    private var routeId: JsonField<String> = JsonMissing.of()
                    private var routeShortName: JsonField<String> = JsonMissing.of()
                    private var serviceId: JsonField<String> = JsonMissing.of()
                    private var shapeId: JsonField<String> = JsonMissing.of()
                    private var timeZone: JsonField<String> = JsonMissing.of()
                    private var tripHeadsign: JsonField<String> = JsonMissing.of()
                    private var tripShortName: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(trip: Trip) = apply {
                        this.blockId = trip.blockId
                        this.directionId = trip.directionId
                        this.id = trip.id
                        this.peakOffpeak = trip.peakOffpeak
                        this.routeId = trip.routeId
                        this.routeShortName = trip.routeShortName
                        this.serviceId = trip.serviceId
                        this.shapeId = trip.shapeId
                        this.timeZone = trip.timeZone
                        this.tripHeadsign = trip.tripHeadsign
                        this.tripShortName = trip.tripShortName
                        additionalProperties(trip.additionalProperties)
                    }

                    fun blockId(blockId: String) = blockId(JsonField.of(blockId))

                    @JsonProperty("blockId")
                    @ExcludeMissing
                    fun blockId(blockId: JsonField<String>) = apply { this.blockId = blockId }

                    fun directionId(directionId: String) = directionId(JsonField.of(directionId))

                    @JsonProperty("directionId")
                    @ExcludeMissing
                    fun directionId(directionId: JsonField<String>) = apply {
                        this.directionId = directionId
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    @JsonProperty("id")
                    @ExcludeMissing
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun peakOffpeak(peakOffpeak: Long) = peakOffpeak(JsonField.of(peakOffpeak))

                    @JsonProperty("peakOffpeak")
                    @ExcludeMissing
                    fun peakOffpeak(peakOffpeak: JsonField<Long>) = apply {
                        this.peakOffpeak = peakOffpeak
                    }

                    fun routeId(routeId: String) = routeId(JsonField.of(routeId))

                    @JsonProperty("routeId")
                    @ExcludeMissing
                    fun routeId(routeId: JsonField<String>) = apply { this.routeId = routeId }

                    fun routeShortName(routeShortName: String) =
                        routeShortName(JsonField.of(routeShortName))

                    @JsonProperty("routeShortName")
                    @ExcludeMissing
                    fun routeShortName(routeShortName: JsonField<String>) = apply {
                        this.routeShortName = routeShortName
                    }

                    fun serviceId(serviceId: String) = serviceId(JsonField.of(serviceId))

                    @JsonProperty("serviceId")
                    @ExcludeMissing
                    fun serviceId(serviceId: JsonField<String>) = apply {
                        this.serviceId = serviceId
                    }

                    fun shapeId(shapeId: String) = shapeId(JsonField.of(shapeId))

                    @JsonProperty("shapeId")
                    @ExcludeMissing
                    fun shapeId(shapeId: JsonField<String>) = apply { this.shapeId = shapeId }

                    fun timeZone(timeZone: String) = timeZone(JsonField.of(timeZone))

                    @JsonProperty("timeZone")
                    @ExcludeMissing
                    fun timeZone(timeZone: JsonField<String>) = apply { this.timeZone = timeZone }

                    fun tripHeadsign(tripHeadsign: String) =
                        tripHeadsign(JsonField.of(tripHeadsign))

                    @JsonProperty("tripHeadsign")
                    @ExcludeMissing
                    fun tripHeadsign(tripHeadsign: JsonField<String>) = apply {
                        this.tripHeadsign = tripHeadsign
                    }

                    fun tripShortName(tripShortName: String) =
                        tripShortName(JsonField.of(tripShortName))

                    @JsonProperty("tripShortName")
                    @ExcludeMissing
                    fun tripShortName(tripShortName: JsonField<String>) = apply {
                        this.tripShortName = tripShortName
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Trip =
                        Trip(
                            blockId,
                            directionId,
                            id,
                            peakOffpeak,
                            routeId,
                            routeShortName,
                            serviceId,
                            shapeId,
                            timeZone,
                            tripHeadsign,
                            tripShortName,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }
        }
    }
}
