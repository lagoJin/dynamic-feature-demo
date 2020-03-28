package dependencies

object Dep {
    object GradlePlugin {
        const val android = "com.android.tools.build:gradle:3.6.1"
        val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Kotlin.version}"
        val kotlinSerialization = "org.jetbrains.kotlin:kotlin-serialization:${Kotlin.version}"
        const val playServices = "com.google.gms:google-services:4.3.3"
    }

    object Kotlin {
        val version = "1.3.70"
        val stdlibCommon = "org.jetbrains.kotlin:kotlin-stdlib-common:$version"
        val stdlibJvm = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$version"
    }

    object Play {
        val core = "com.google.android.play:core:1.6.4"
    }

    object Dagger {
        val version = "2.26"
        val core = "com.google.dagger:dagger:$version"
        val compiler = "com.google.dagger:dagger-compiler:$version"
        val androidSupport = "com.google.dagger:dagger-android-support:$version"
        val android = "com.google.dagger:dagger-android:$version"
        val androidProcessor = "com.google.dagger:dagger-android-processor:$version"
        val assistedInjectAnnotations =
            "com.squareup.inject:assisted-inject-annotations-dagger2:0.5.2"
        val assistedInjectProcessor = "com.squareup.inject:assisted-inject-processor-dagger2:0.5.2"
    }

    object Retrofit {
        val version = "2.8.1"
        val retrofit = "com.squareup.retrofit2:retrofit:$version"
        val gsonConverter = "com.squareup.retrofit2:converter-gson:$version"

    }

    object OkHttp {
        val version = "4.0.1"
        val client = "com.squareup.okhttp3:okhttp:$version"
        val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:$version"
    }

    object AndroidX {
        val appCompat = "androidx.appcompat:appcompat:1.1.0"
        val recyclerView = "androidx.recyclerview:recyclerview:1.1.0"
        val constraint = "androidx.constraintlayout:constraintlayout:2.0.0-beta4"
        val design = "com.google.android.material:material:1.2.0-alpha05"

        val lifecycleLiveData = "androidx.lifecycle:lifecycle-livedata:2.2.0"
        val liveDataCoreKtx = "androidx.lifecycle:lifecycle-livedata-core-ktx:2.2.0"
        val liveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:2.2.0"

        object Navigation {
            val version = "2.2.1"
            val runtimeKtx = "androidx.navigation:navigation-runtime-ktx:$version"
            val fragmentKtx = "androidx.navigation:navigation-fragment-ktx:$version"
            val uiKtx = "androidx.navigation:navigation-ui-ktx:$version"
            val dynamicFeaturesFragment =
                "androidx.navigation:navigation-dynamic-features-fragment:2.3.0-SNAPSHOT"
            val dynamicFeaturesRuntime =
                "androidx.navigation:navigation-dynamic-features-runtime:2.3.0-SNAPSHOT"
        }

    }

    object Test {
        val junit = "junit:junit:4.12"
        val testRunner = "androidx.test:runner:1.3.0-alpha02"
        val testRules = "androidx.test:rules:1.3.0-alpha02"
        val testCoreKtx = "androidx.test:core-ktx:1.2.1-alpha02"
        val androidJunit4Ktx = "androidx.test.ext:junit-ktx:1.1.2-alpha02"
        val orchestrator = "androidx.test:orchestrator:1.3.0-alpha02"
        val archCore = "androidx.arch.core:core-testing:2.1.0"
        val espressoCore = "androidx.test.espresso:espresso-core:3.3.0-alpha02"

        val slf4j = "org.slf4j:slf4j-simple:1.7.25"
    }
}
