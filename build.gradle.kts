buildscript {
    repositories {
        repositories {
            mavenLocal()
            mavenCentral()
            jcenter()
        }
        dependencies {
            classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Dependencies.kotlinVersion}")
            classpath("com.jfrog.bintray.gradle:gradle-bintray-plugin:${Dependencies.bintrayPluginVersion}")
        }
    }

    allprojects {
        repositories {
            mavenLocal()
            mavenCentral()
            jcenter()
        }

        apply(plugin = "idea")
    }
}