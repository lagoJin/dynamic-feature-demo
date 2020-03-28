import dependencies.Dep
import dependencies.Versions
import dependencies.Packages

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
}

android {
    compileSdkVersion(Versions.androidCompileSdkVersion)
    defaultConfig {
        applicationId = Packages.name
        minSdkVersion(Versions.androidMinSdkVersion)
        targetSdkVersion(Versions.androidTargetSdkVersion)
        versionCode = Versions.androidVersionCode
        versionName = Versions.androidVersionName
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        testInstrumentationRunnerArguments = mapOf("clearPackageData" to "true")
    }

    dataBinding {
        isEnabled = true
    }

}

dependencies {
    implementation(Dep.Kotlin.stdlibJvm)
    implementation(Dep.AndroidX.appCompat)
    implementation(Dep.AndroidX.constraint)

    implementation(Dep.Dagger.core)
    implementation(Dep.Dagger.androidSupport)
    implementation(Dep.Dagger.android)
    kapt(Dep.Dagger.compiler)
    kapt(Dep.Dagger.androidProcessor)

    testImplementation(Dep.Test.junit)
    androidTestImplementation(Dep.Test.testRunner)
    androidTestImplementation(Dep.Test.testRules)
    androidTestImplementation(Dep.Test.espressoCore)
    androidTestImplementation(Dep.Test.testCoreKtx)
    androidTestImplementation(Dep.Test.androidJunit4Ktx)
    androidTestUtil(Dep.Test.orchestrator)
}