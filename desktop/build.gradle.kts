import org.jetbrains.compose.desktop.application.dsl.TargetFormat.*

plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
}

kotlin {
    jvm()
    sourceSets {
        val jvmMain by getting {
            dependencies {
                implementation(project(":shared"))
                implementation(compose.desktop.currentOs)
            }
        }
    }
}

compose.desktop {
    application {
        mainClass = "MainKt"
        nativeDistributions {
            targetFormats(Dmg, Msi, Deb)
            packageName = "untitled"
            packageVersion = "1.0.0"
        }
    }
}