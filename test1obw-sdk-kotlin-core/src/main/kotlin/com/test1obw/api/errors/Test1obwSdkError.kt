// File generated from our OpenAPI spec by Stainless.

package com.test1obw.api.errors

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.test1obw.api.core.JsonValue
import com.test1obw.api.core.NoAutoDetect
import com.test1obw.api.core.toUnmodifiable
import java.util.Objects

@JsonDeserialize(builder = Test1obwSdkError.Builder::class)
@NoAutoDetect
class Test1obwSdkError
constructor(
    private val additionalProperties: Map<String, JsonValue>,
) {

    @JsonAnyGetter fun additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun toBuilder() = Builder()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Test1obwSdkError && this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(additionalProperties)
    }

    override fun toString() = "Test1obwSdkError{additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        fun from(error: Test1obwSdkError) = apply {
            additionalProperties(error.additionalProperties)
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

        fun build(): Test1obwSdkError = Test1obwSdkError(additionalProperties.toUnmodifiable())
    }
}
