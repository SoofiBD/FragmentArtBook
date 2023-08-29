// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {  // Bu satır ve altındaki depo tanımlamalarını ekleyin
        google()
        mavenCentral()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:7.0.4")  // Güncel versiyonu kullanın
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.10")  // Güncel versiyonu kullanın
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.7.1")  // Güncel versiyonu kullanın
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
