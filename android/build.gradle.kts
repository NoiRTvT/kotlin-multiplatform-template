plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
    id("com.android.application")
}

kotlin {
    android()
    sourceSets {
        val androidMain by getting {
            dependencies {
                implementation(compose.material)
                implementation(project(":shared"))
                implementation("com.google.android.material:material:1.4.0")
                implementation("androidx.appcompat:appcompat:1.4.0")
                implementation("androidx.constraintlayout:constraintlayout:2.1.2")
                implementation("androidx.activity:activity-compose:1.4.0")
            }
        }
    }
}

android {
    compileSdk = 32
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    defaultConfig {
        applicationId = "com.otakushelter.manga.android"
        minSdk = 26
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}