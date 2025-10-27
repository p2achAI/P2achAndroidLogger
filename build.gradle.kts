plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("maven-publish")
}

android {
    namespace = "com.p2ach.logger"
    compileSdk = 34
    defaultConfig {
        minSdk = 21
        consumerProguardFiles("consumer-rules.pro")
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions { jvmTarget = "17" }
}

dependencies {
    // 외부 프로젝트에도 전이되게 하려면 api
    api("com.orhanobut:logger:2.2.0")
}

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("release") {
                groupId = "com.github.p2achAI"      // JitPack 규칙
                artifactId = "P2achAndroidLogger"   // 원하는 아티팩트명
                version = "unspecified"             // JitPack이 태그로 대체
                from(components["release"])
            }
        }
    }
}