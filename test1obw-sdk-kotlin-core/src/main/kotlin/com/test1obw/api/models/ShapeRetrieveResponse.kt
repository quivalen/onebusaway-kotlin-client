// File generated from our OpenAPI spec by Stainless.

package com.test1obw.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.test1obw.api.core.ExcludeMissing
import com.test1obw.api.core.JsonField
import com.test1obw.api.core.JsonMissing
import com.test1obw.api.core.JsonValue
import com.test1obw.api.core.NoAutoDetect
import com.test1obw.api.core.toUnmodifiable
import java.util.Objects

@JsonDeserialize(builder = ShapeRetrieveResponse.Builder::class)
@NoAutoDetect
class ShapeRetrieveResponse
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

    fun toResponseWrapper(): ResponseWrapper =
        ResponseWrapper.builder()
            .code(code)
            .currentTime(currentTime)
            .text(text)
            .version(version)
            .build()

    @JsonProperty("code") @ExcludeMissing fun _code() = code

    @JsonProperty("currentTime") @ExcludeMissing fun _currentTime() = currentTime

    @JsonProperty("text") @ExcludeMissing fun _text() = text

    @JsonProperty("version") @ExcludeMissing fun _version() = version

    @JsonProperty("data") @ExcludeMissing fun _data() = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ShapeRetrieveResponse = apply {
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

        return other is ShapeRetrieveResponse &&
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
        "ShapeRetrieveResponse{code=$code, currentTime=$currentTime, text=$text, version=$version, data=$data, additionalProperties=$additionalProperties}"

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

        internal fun from(shapeRetrieveResponse: ShapeRetrieveResponse) = apply {
            this.code = shapeRetrieveResponse.code
            this.currentTime = shapeRetrieveResponse.currentTime
            this.text = shapeRetrieveResponse.text
            this.version = shapeRetrieveResponse.version
            this.data = shapeRetrieveResponse.data
            additionalProperties(shapeRetrieveResponse.additionalProperties)
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

        fun build(): ShapeRetrieveResponse =
            ShapeRetrieveResponse(
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
            private val length: JsonField<Long>,
            private val levels: JsonField<String>,
            private val points: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun length(): Long = length.getRequired("length")

            fun levels(): String? = levels.getNullable("levels")

            /** Encoded polyline format representing the shape of the path */
            fun points(): String = points.getRequired("points")

            @JsonProperty("length") @ExcludeMissing fun _length() = length

            @JsonProperty("levels") @ExcludeMissing fun _levels() = levels

            /** Encoded polyline format representing the shape of the path */
            @JsonProperty("points") @ExcludeMissing fun _points() = points

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Entry = apply {
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

                return other is Entry &&
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
                "Entry{length=$length, levels=$levels, points=$points, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var length: JsonField<Long> = JsonMissing.of()
                private var levels: JsonField<String> = JsonMissing.of()
                private var points: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(entry: Entry) = apply {
                    this.length = entry.length
                    this.levels = entry.levels
                    this.points = entry.points
                    additionalProperties(entry.additionalProperties)
                }

                fun length(length: Long) = length(JsonField.of(length))

                @JsonProperty("length")
                @ExcludeMissing
                fun length(length: JsonField<Long>) = apply { this.length = length }

                fun levels(levels: String) = levels(JsonField.of(levels))

                @JsonProperty("levels")
                @ExcludeMissing
                fun levels(levels: JsonField<String>) = apply { this.levels = levels }

                /** Encoded polyline format representing the shape of the path */
                fun points(points: String) = points(JsonField.of(points))

                /** Encoded polyline format representing the shape of the path */
                @JsonProperty("points")
                @ExcludeMissing
                fun points(points: JsonField<String>) = apply { this.points = points }

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
                        length,
                        levels,
                        points,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }
    }
}