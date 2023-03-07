// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id ("com.android.application") version "7.4.0" apply false
    id ("com.android.library") version "7.4.0" apply false
    id ("org.jetbrains.kotlin.android") version "1.7.21" apply false
}

subprojects {
    extra["minSDK"] = 26
    extra["targetSDK"] = 33
    extra["versionCode"] = 1
    extra["namespace"] = "com.jojalvo.mymeals"
    extra["versionName"] = "0.1-debug"
    extra["buildToolVersion"] = "33.0.0"
    extra["jvmTarget"] = "11"
}