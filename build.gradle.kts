plugins {
    id 'com.android.library'
    id 'org.jetbrains.kotlin.android'
}

android {
    namespace "ai.p2ach.sehoon.logutil"
    compileSdk 34

    defaultConfig {
        minSdk 21
    }
}

dependencies {
    implementation "com.orhanobut:logger:2.2.0"
}