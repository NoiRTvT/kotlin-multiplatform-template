pluginManagement {
    plugins {
        kotlin("multiplatform").version("1.6.10").apply(false)
        id("org.jetbrains.compose").version("1.0.1-rc2").apply(false)
        kotlin("plugin.serialization").version("1.6.10").apply(false)
    }
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

rootProject.name = "kotlin-multiplatform-template"

include(":server")
include(":webclient")
include(":desktop")
include(":android")
include(":shared")
