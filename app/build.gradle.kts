plugins {
    id ("com.android.application")
    kotlin ("android")
    kotlin ("kapt")
}

android {
    compileSdk = project.ext.get("targetSDK") as Int

    defaultConfig {
        applicationId = project.ext.get("namespace") as String
        minSdk = project.ext.get("minSDK") as Int
        targetSdk = project.ext.get("targetSDK") as Int
        versionCode = project.ext.get("versionCode") as Int
        versionName = project.ext.get("versionName") as String

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        buildToolsVersion = project.ext.get("buildToolVersion") as String
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
        getByName("debug") {
            applicationIdSuffix = ".debug"
            isDebuggable = true
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = project.ext.get("jvmTarget") as String
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.7.0")
    implementation ("androidx.appcompat:appcompat:1.6.0")
    implementation ("com.google.android.material:material:1.7.0")
    testImplementation ("junit:junit:4.13.2")
    androidTestImplementation ("androidx.test.ext:junit:1.1.5")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.1")
}