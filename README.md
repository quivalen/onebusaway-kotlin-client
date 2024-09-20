# Onebusawaykt Kotlin API Library

The Onebusawaykt Kotlin SDK provides convenient access to the Onebusawaykt REST API from applications written in Kotlin. It includes helper classes with helpful types and documentation for every request and response property.

The Onebusawaykt Kotlin SDK is similar to the Onebusawaykt Java SDK but with minor differences that make it more ergonomic for use in Kotlin, such as nullable values instead of `Optional`, `Sequence` instead of `Stream`, and suspend functions instead of `CompletableFuture`.

It is generated with [Stainless](https://www.stainlessapi.com/).

## Documentation

The REST API documentation can be found on [docs.onebusawaykt.com](https://docs.onebusawaykt.com).

---

## Getting started

### Install dependencies

#### Gradle

<!-- x-release-please-start-version -->

```kotlin
implementation("com.onebusawaykt.api:onebusawaykt-kotlin:0.0.1-alpha.1")
```

#### Maven

```xml
<dependency>
    <groupId>com.onebusawaykt.api</groupId>
    <artifactId>onebusawaykt-kotlin</artifactId>
    <version>0.0.1-alpha.1</version>
</dependency>
```

<!-- x-release-please-end -->

### Configure the client

Use `OnebusawayktOkHttpClient.builder()` to configure the client.

```kotlin
val client = OnebusawayktOkHttpClient.fromEnv()
```

Read the documentation for more configuration options.

---

### Example: creating a resource

To create a new config, first use the `ConfigRetrieveParams` builder to specify attributes,
then pass that to the `retrieve` method of the `config` service.

```kotlin
import com.onebusawaykt.api.models.ConfigRetrieveParams
import com.onebusawaykt.api.models.ConfigRetrieveResponse

val params = ConfigRetrieveParams.builder().build()
val config = client.config().retrieve(params)
```

---

## Requests

### Parameters and bodies

To make a request to the Onebusawaykt API, you generally build an instance of the appropriate `Params` class.

In [Example: creating a resource](#example-creating-a-resource) above, we used the `ConfigRetrieveParams.builder()` to pass to
the `retrieve` method of the `config` service.

Sometimes, the API may support other properties that are not yet supported in the Kotlin SDK types. In that case,
you can attach them using the `putAdditionalProperty` method.

```kotlin
import com.onebusawaykt.api.models.core.JsonValue
val params = ConfigRetrieveParams.builder()
    // ... normal properties
    .putAdditionalProperty("secret_param", JsonValue.from("4242"))
    .build()
```

## Responses

### Response validation

When receiving a response, the Onebusawaykt Kotlin SDK will deserialize it into instances of the typed model classes. In rare cases, the API may return a response property that doesn't match the expected Kotlin type. If you directly access the mistaken property, the SDK will throw an unchecked `OnebusawayktInvalidDataException` at runtime. If you would prefer to check in advance that that response is completely well-typed, call `.validate()` on the returned model.

```kotlin
val config = client.config().retrieve().validate()
```

### Response properties as JSON

In rare cases, you may want to access the underlying JSON value for a response property rather than using the typed version provided by
this SDK. Each model property has a corresponding JSON version, with an underscore before the method name, which returns a `JsonField` value.

```kotlin
val field = responseObj._field

if (field.isMissing()) {
  // Value was not specified in the JSON response
} else if (field.isNull()) {
  // Value was provided as a literal null
} else {
  // See if value was provided as a string
  val jsonString: String? = field.asString();

  // If the value given by the API did not match the shape that the SDK expects
  // you can deserialise into a custom type
  val myObj = responseObj._field.asUnknown()?.convert(MyClass.class)
}
```

### Additional model properties

Sometimes, the server response may include additional properties that are not yet available in this library's types. You can access them using the model's `_additionalProperties` method:

```kotlin
val secret = agencyRetrieveResponse._additionalProperties().get("secret_field")
```

---

---

## Error handling

This library throws exceptions in a single hierarchy for easy handling:

- **`OnebusawayktException`** - Base exception for all exceptions

  - **`OnebusawayktServiceException`** - HTTP errors with a well-formed response body we were able to parse. The exception message and the `.debuggingRequestId()` will be set by the server.

    | 400    | BadRequestException           |
    | ------ | ----------------------------- |
    | 401    | AuthenticationException       |
    | 403    | PermissionDeniedException     |
    | 404    | NotFoundException             |
    | 422    | UnprocessableEntityException  |
    | 429    | RateLimitException            |
    | 5xx    | InternalServerException       |
    | others | UnexpectedStatusCodeException |

  - **`OnebusawayktIoException`** - I/O networking errors
  - **`OnebusawayktInvalidDataException`** - any other exceptions on the client side, e.g.:
    - We failed to serialize the request body
    - We failed to parse the response body (has access to response code and body)

## Network options

### Retries

Requests that experience certain errors are automatically retried 2 times by default, with a short exponential backoff. Connection errors (for example, due to a network connectivity problem), 408 Request Timeout, 409 Conflict, 429 Rate Limit, and >=500 Internal errors will all be retried by default.
You can provide a `maxRetries` on the client builder to configure this:

```kotlin
val client = OnebusawayktOkHttpClient.builder()
    .fromEnv()
    .maxRetries(4)
    .build()
```

### Timeouts

Requests time out after 1 minute by default. You can configure this on the client builder:

```kotlin
val client = OnebusawayktOkHttpClient.builder()
    .fromEnv()
    .timeout(Duration.ofSeconds(30))
    .build()
```

### Proxies

Requests can be routed through a proxy. You can configure this on the client builder:

```kotlin
val client = OnebusawayktOkHttpClient.builder()
    .fromEnv()
    .proxy(new Proxy(
        Type.HTTP,
        new InetSocketAddress("proxy.com", 8080)
    ))
    .build()
```

## Semantic versioning

This package generally follows [SemVer](https://semver.org/spec/v2.0.0.html) conventions, though certain backwards-incompatible changes may be released as minor versions:

1. Changes to library internals which are technically public but not intended or documented for external use. _(Please open a GitHub issue to let us know if you are relying on such internals)_.
2. Changes that we do not expect to impact the vast majority of users in practice.

We take backwards-compatibility seriously and work hard to ensure you can rely on a smooth upgrade experience.

We are keen for your feedback; please open an [issue](https://www.github.com/quivalen/onebusaway-kotlin-client/issues) with questions, bugs, or suggestions.

## Requirements

This library requires Java 8 or later.
