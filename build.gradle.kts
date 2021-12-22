buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
        classpath("com.android.tools.build:gradle:7.0.4")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

// TODO: why this need?
subprojects {
    repositories {
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

//tasks.register("clean", Delete::class) {
//    delete(rootProject.buildDir)
//}