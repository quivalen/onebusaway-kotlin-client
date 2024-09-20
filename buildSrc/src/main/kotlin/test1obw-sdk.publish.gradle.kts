import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.register
import org.gradle.kotlin.dsl.get

plugins {
    `maven-publish`
    `signing`
}

configure<PublishingExtension> {
    publications {
        register<MavenPublication>("maven") {
            from(components["java"])

            pom {
                name.set("OneBusAway")
                description.set("The OneBusAway REST API. For use with servers like\nhttps://api.pugetsound.onebusaway.org")
                url.set("https://docs.test1obw-sdk.com")

                licenses {
                    license {
                        name.set("Apache-2.0")
                    }
                }

                developers {
                    developer {
                        name.set("Test1obw SDK")
                        email.set("dev-feedback@test1obw-sdk.com")
                    }
                }

                scm {
                    connection.set("scm:git:git://github.com/stainless-sdks/test1obw-sdk-kotlin.git")
                    developerConnection.set("scm:git:git://github.com/stainless-sdks/test1obw-sdk-kotlin.git")
                    url.set("https://github.com/stainless-sdks/test1obw-sdk-kotlin")
                }

                versionMapping {
                    allVariants {
                        fromResolutionResult()
                    }
                }
            }
        }
    }
}

signing {
    val signingKeyId = System.getenv("GPG_SIGNING_KEY_ID")?.ifBlank { null }
    val signingKey = System.getenv("GPG_SIGNING_KEY")?.ifBlank { null }
    val signingPassword = System.getenv("GPG_SIGNING_PASSWORD")?.ifBlank { null }
    if (signingKey != null && signingPassword != null) {
        useInMemoryPgpKeys(
            signingKeyId,
            signingKey,
            signingPassword,
        )
        sign(publishing.publications["maven"])
    }
}

tasks.named("publish") {
    dependsOn(":closeAndReleaseSonatypeStagingRepository")
}
