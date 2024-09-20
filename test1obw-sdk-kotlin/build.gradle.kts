plugins {
    id("test1obw-sdk.kotlin")
    id("test1obw-sdk.publish")
}

dependencies {
    api(project(":test1obw-sdk-kotlin-client-okhttp"))
}
