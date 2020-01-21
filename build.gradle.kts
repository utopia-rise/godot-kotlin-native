buildscript {
    repositories {
        repositories {
            mavenLocal()
            mavenCentral()
            jcenter()
        }
        dependencies {
            classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.61")
            classpath("com.jfrog.bintray.gradle:gradle-bintray-plugin:1.8.4")
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
