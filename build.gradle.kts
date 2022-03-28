repositories {
    mavenCentral()
}

plugins {
    kotlin("jvm") version "1.5.21"

    id("org.jlleitschuh.gradle.ktlint") version "10.2.0"
}

dependencies {
    testImplementation("io.kotest:kotest-runner-junit5:4.6.3")
    testImplementation("io.kotest:kotest-assertions-core:4.6.3")
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")
}
