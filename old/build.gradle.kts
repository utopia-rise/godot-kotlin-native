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

            //Here we exclude jetbrains coroutines and atomicfu because they do not provide the ones for android platform
            //so we exclude them so that those dependencies are downloaded from our bintray, where we provide android dependencies
            mavenCentral {
                content {
                    excludeModule("org.jetbrains.kotlinx", "kotlinx-coroutines-core-native")
                    excludeModule("org.jetbrains.kotlinx", "atomicfu-native")
                }
            }
            jcenter {
                content {
                    excludeModule("org.jetbrains.kotlinx", "kotlinx-coroutines-core-native")
                    excludeModule("org.jetbrains.kotlinx", "atomicfu-native")
                }
            }
        }

        apply(plugin = "idea")
    }
}