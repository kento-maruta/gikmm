pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
    plugins {
        id("com.android.application")  version "7.3.1" apply false
        id("com.android.library")  version "7.3.1" apply false
        kotlin("android") version "1.7.10" apply false
        kotlin("multiplatform") version "1.7.10" apply false
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