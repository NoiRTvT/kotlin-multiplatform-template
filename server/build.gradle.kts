plugins {
    application
    kotlin("multiplatform")
    kotlin("plugin.serialization")
}

val ktor_version: String by project
val kotlin_version: String by project
val logback_version: String by project

application {
    mainClass.set("io.ktor.server.netty.EngineMain")
    version = "0.0.1"
}

kotlin {
    jvm()
    sourceSets {
        val jvmMain by getting {
            dependencies {
                implementation(project(":shared"))
                implementation("io.ktor:ktor-server-core:$ktor_version")
                implementation("io.ktor:ktor-server-host-common:$ktor_version")
                implementation("io.ktor:ktor-serialization:$ktor_version")
                implementation("io.ktor:ktor-server-netty:$ktor_version")
                implementation("ch.qos.logback:logback-classic:$logback_version")
            }
        }
        val jvmTest by getting {
            dependencies {
                implementation("io.ktor:ktor-server-tests:$ktor_version")
                implementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlin_version")
            }
        }
    }
}
