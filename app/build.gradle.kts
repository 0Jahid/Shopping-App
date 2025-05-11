plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
<<<<<<< HEAD
    alias(libs.plugins.kotlin.compose)
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android") version "2.51" apply true
    kotlin("plugin.serialization") version "1.9.22"
    alias(libs.plugins.google.gms.google.services) // Updated to match Kotlin version


    // Add the Google services Gradle plugin

}

android {
    namespace = "com.jahid.shoppingapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.jahid.shoppingapp"
        minSdk = 26
        targetSdk = 35
=======
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")
    kotlin("plugin.serialization") version "2.0.0"
    alias(libs.plugins.google.gms.google.services)
}

android {
    namespace = "com.example.shopping"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.shopping"
        minSdk = 29
        targetSdk = 34
>>>>>>> gradle-issues
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
<<<<<<< HEAD
=======
        vectorDrawables {
            useSupportLibrary = true
        }
>>>>>>> gradle-issues
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
<<<<<<< HEAD

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }

    buildFeatures {
        compose = true
    }

    // Add this for better Hilt integration with Compose
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.14" // Latest stable as of March 2025
=======
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
>>>>>>> gradle-issues
    }
}

dependencies {
<<<<<<< HEAD
=======

>>>>>>> gradle-issues
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
<<<<<<< HEAD
    implementation(libs.firebase.auth)
    implementation(libs.androidx.credentials)
    implementation(libs.androidx.credentials.play.services.auth)
    implementation(libs.googleid)
    implementation(libs.firebase.storage)
=======
    implementation(libs.firebase.firestore)
    implementation(libs.firebase.auth.ktx)
    implementation(libs.firebase.storage)
    implementation(libs.firebase.messaging)
>>>>>>> gradle-issues
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

<<<<<<< HEAD
    implementation("androidx.room:room-runtime:2.6.1") // Add runtime
    kapt("androidx.room:room-compiler:2.6.1") // Update compiler


// Import the Firebase BoM
    implementation(platform("com.google.firebase:firebase-bom:33.11.0"))

    // When using the BoM, you don't specify versions in Firebase library dependencies

    // Add the dependency for the Firebase SDK for Google Analytics
    implementation("com.google.firebase:firebase-analytics")


    // See https://firebase.google.com/docs/android/setup#available-libraries
    // For example, add the dependencies for Firebase Authentication and Cloud Firestore
    implementation("com.google.firebase:firebase-auth")
    implementation("com.google.firebase:firebase-firestore")


    // Hilt Dependencies
    implementation("com.google.dagger:hilt-android:2.51")
    kapt("com.google.dagger:hilt-android-compiler:2.51")

    // Hilt Navigation for Compose
    implementation("androidx.hilt:hilt-navigation-compose:1.2.0")
//    kapt("androidx.hilt:hilt-compiler:1.2.0")

    // Recommended: Add Hilt testing dependencies if you'll be testing Hilt components
    testImplementation("com.google.dagger:hilt-android-testing:2.51")
    kaptTest("com.google.dagger:hilt-android-compiler:2.51")

    //coil
    implementation("io.coil-kt.coil3:coil-compose:3.1.0")

    //nevigation
    val nav_version = "2.8.9"

    // Jetpack Compose integration
    implementation("androidx.navigation:navigation-compose:$nav_version")

    // JSON serialization library, works with the Kotlin serialization plugin
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.7.3")

    val paging_version = "3.3.6"

    implementation("androidx.paging:paging-runtime:$paging_version")

    // alternatively - without Android dependencies for tests
    testImplementation("androidx.paging:paging-common:$paging_version")

    //custom nev bar
    implementation ("com.canopas.compose-animated-navigationbar:bottombar:1.0.1")

    implementation ("com.razorpay:razorpay-java:1.4.7")



}

kapt {
    correctErrorTypes = true
=======

   // implementation("androidx.compose.material:material-icons-extended-android")

// this ia for hillt dependency injection
    implementation("com.google.dagger:hilt-android:2.50")
    kapt("com.google.dagger:hilt-android-compiler:2.50")
    implementation("androidx.hilt:hilt-navigation-compose:1.2.0")
    kapt("androidx.hilt:hilt-compiler:1.2.0")



    // this is for coil
    implementation("io.coil-kt:coil-compose:2.6.0")


    // Navigation
    implementation("androidx.navigation:navigation-compose:2.8.0-beta06")

    // Serialization
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.3")



    //this is for pager
    implementation ("com.google.accompanist:accompanist-pager:0.28.0")
    implementation ("com.google.accompanist:accompanist-pager-indicators:0.28.0")

// this is for payment getway
    implementation ("com.razorpay:checkout:1.6.40")


    //custem bottom nev bar
    implementation ("com.canopas.compose-animated-navigationbar:bottombar:1.0.1")




>>>>>>> gradle-issues
}