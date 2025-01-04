plugins {
    alias(libs.plugins.android.application)

    alias(libs.plugins.ksp)
    alias(libs.plugins.kotlin)
}

android {
    namespace = "com.hokaido.movies_8_myrealization"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.hokaido.movies_8_myrealization"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)

    implementation(libs.room.runtime)
    annotationProcessor(libs.room.compiler)
    ksp(libs.room.compiler)
    implementation(libs.room.rxjava3)

    implementation (libs.core.ktx) // Для совместимости с Kotlin (optional)
    implementation (libs.kotlin.stdlib) // Kotlin стандартная библиотека (optional)

    implementation(libs.rxandroid)
    implementation(libs.rxjava)

    implementation(libs.glide)

    implementation(libs.retrofit)
    implementation(libs.converter.gson)
    implementation(libs.adapter.rxjava3)

    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}