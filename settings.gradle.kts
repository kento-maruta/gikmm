pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
    plugins {
        id("com.android.application")  version "7.3.1"
        id("com.android.library")  version "7.3.1"
        kotlin("android") version "1.7.20"
        kotlin("multiplatform") version "1.7.20"
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "gigkmm"
include(":app")
include(":shared")