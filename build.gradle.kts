buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.7.3")
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.8.5")
    }
}

plugins {
    id("com.android.application") version "8.7.3" apply false
}