buildscript {
    repositories {
        repositories {
            mavenLocal()
            mavenCentral()
            jcenter()
        }
        dependencies {
            classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.61")
        }
    }

    allprojects {
        apply(plugin = "idea")

        repositories {
            mavenLocal()
            mavenCentral()
            jcenter()
        }
    }
}
