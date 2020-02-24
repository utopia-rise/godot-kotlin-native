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

/**
 * Packages up the kotlin-project-template which must be published
 * to GitHub so it can be downloaded by the Godot Editor Plugin.
 * We want the zip to contain the parent directory 'kotlin/'
 * So first we copy the template into a directory of that name.
  */
tasks.register<Copy>("prepareTemplate") {
    from("tools/kotlin-project-template/")
    into("$buildDir/project_template/kotlin")
    doFirst {
        mkdir("$buildDir/project_template/kotlin")
    }
}

tasks.register<Zip>("packageTemplate") {
    archiveFileName.set("kotlin_template.zip")
    destinationDirectory.set(file("$buildDir/"))

    from("$buildDir/project_template")

    dependsOn("prepareTemplate")

    // Clean up the staging directory
    doLast {
        delete("$buildDir/project_template")
    }
}

