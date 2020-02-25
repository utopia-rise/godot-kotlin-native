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