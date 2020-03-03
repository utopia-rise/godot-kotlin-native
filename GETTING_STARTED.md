# Getting started

We recommend you [**Intellij IDEA**](https://www.jetbrains.com/idea/) (Ultimate or Community) as IDE.

* [First Steps](#first-steps)
    * [Folder Structure](#folder-structure)
    * [Creating the projects](#creating-the-projects)
    * [Setting up the build script](#setting-up-the-build-script)
        * [TL;DR](#final-buildscript)
* [Kotlin code](#kotlin-code)
* [Registration](#registration)
* [Compiling](#compiling)
* [What's next?](#whats-next)


## First steps

### Folder Structure
We recommend you the following folder structure:
```
<projectname>/
├── kotlin/
│   ├── src/
│   ├── .gitignore
│   ├── build.gradle.kts
│   └── README.md
├── project.godot
```

### Creating the projects
**Godot:**  
Create the Godot project as usual inside the `project` subfolder.  
**Kotlin:**  
Create new empty _**Gradle**_ project in IDEA inside the `kotlin` subfolder. 

### Setting up the build script
TL;DR: At the end of this section is the full `build.gradle.kts`

In this example we use `.gradle.kts` build scripts but same applies to normal `groovy` build scripts.

\
First of all you need to enable GRADLE_METADATA feature in `settings.gradle.kts` file:
```kotlin
enableFeaturePreview("GRADLE_METADATA")
```
\
Inside your `build.gradle.kts` file, you need to define the `godot-gradle-plugin` repository and the `kotlin-gradle-plugin` repository:
```kotlin
val platform: String by project
val armArch: String by project
val iosSigningIdentity: String by project
val buildType: String? by project

buildscript {
    repositories {
        mavenLocal()
        maven("https://dl.bintray.com/utopia-rise/kotlin-godot")
        jcenter()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.61")
        classpath("org.godotengine.kotlin:godot-gradle-plugin:0.1.0-3.2")
    }
}

plugins {
    id("org.jetbrains.kotlin.multiplatform") version ("1.3.61")
}

apply(plugin = "godot-gradle-plugin")

repositories {
    mavenLocal()
    maven("https://dl.bintray.com/utopia-rise/kotlin-godot")
    maven(url = "https://dl.bintray.com/utopia-rise/kotlinx")

    //Here we exclude jetbrains coroutines and atomicfu because they do not provide the ones for android platform
    //so we exclude them so that those dependencies are downloaded from our bintray, where we provide android dependencies
    jcenter {
        content {
            excludeModule("org.jetbrains.kotlinx", "kotlinx-coroutines-core-native")
            excludeModule("org.jetbrains.kotlinx", "atomicfu-native")
        }
    }
    mavenCentral {
        content {
            excludeModule("org.jetbrains.kotlinx", "kotlinx-coroutines-core-native")
            excludeModule("org.jetbrains.kotlinx", "atomicfu-native")
        }
    }
}
```

Then you need to configure the godot gradle plugin:
```kotlin
configure<org.godotengine.kotlin.gradleplugin.KotlinGodotPluginExtension> {
    this.releaseType = org.jetbrains.kotlin.gradle.plugin.mpp.NativeBuildType.DEBUG
    this.godotProjectPath = "${project.rootDir.absolutePath}/.."
    this.libraryPath = "samples.gdnlib"
}
```

There we need to specify the path for the `.gdnlib` file godot uses to load our dynamic library.  
The `.gdnlib` file goes in the root of the `project` folder.  
You can copy and modify one from the samples or see [here](https://docs.godotengine.org/en/3.1/tutorials/plugins/gdnative/gdnative-c-example.html#creating-the-gdnativelibrary-gdnlib-file) on how to generate one yourself.
```kotlin
this.libraryPath = "samples.gdnlib"
```

Also we need to specify the output folder for the generated `.gdns` files:
```kotlin
this.godotProjectPath = "${project.rootDir.absolutePath}/.."
```

\
Next step is to specify the sourceSets of the targets we want to support. Add in `build.gradle.kts`:
```kotlin
kotlin {
    sourceSets {
        sourceSets.create("macosMain")
        sourceSets.create("linuxMain")
        sourceSets.create("windowsMain")
        sourceSets.create("androidArm64Main")
        sourceSets.create("androidX64Main")
        sourceSets.create("iosArm64Main")
        sourceSets.create("iosX64Main")
        configure(listOf(
                sourceSets["macosMain"],
                sourceSets["linuxMain"],
                sourceSets["windowsMain"],
                sourceSets["androidArm64Main"],
                sourceSets["androidX64Main"],
                sourceSets["iosArm64Main"],
                sourceSets["iosX64Main"]
        )) {
            this.kotlin.srcDir("src/main/kotlin")
        }
    }
    
    //<-- targets go here (see below)
}
```

\
Then, we need to specify for which target to build for:
```kotlin
if (project.hasProperty("platform")) {
    when (platform) {
        "windows" -> listOf(targetFromPreset(presets["godotMingwX64"], "windows"))
        "linux" -> listOf(targetFromPreset(presets["godotLinuxX64"], "linux"))
        "macos" -> listOf(targetFromPreset(presets["godotMacosX64"], "macos"))
        "android" -> if (project.hasProperty("armArch")) {
            when(armArch) {
                "X64" -> listOf(targetFromPreset(presets["godotAndroidNativeX64"], "androidX64"))
                "arm64" -> listOf(targetFromPreset(presets["godotAndroidNativeArm64"], "androidArm64"))
                else -> listOf(targetFromPreset(presets["godotAndroidNativeArm64"], "androidArm64"))
            }
        } else listOf(targetFromPreset(presets["godotAndroidNativeArm64"], "androidArm64"))
        "ios" -> if (project.hasProperty("armArch")) {
            when (armArch) {
                "arm64" -> listOf(targetFromPreset(presets["godotIosArm64"], "iosArm64"))
                "X64" -> listOf(targetFromPreset(presets["godotIosX64"], "iosX64"))
                else -> listOf(targetFromPreset(presets["godotIosArm64"], "iosArm64"))
            }
        } else listOf(targetFromPreset(presets["godotIosArm64"], "iosArm64"))
        else -> listOf(targetFromPreset(presets["godotLinuxX64"], "linux"))
    }
} else {
    listOf(
            targetFromPreset(presets["godotLinuxX64"], "linux"),
            targetFromPreset(presets["godotMacosX64"], "macos"),
            targetFromPreset(presets["godotMingwX64"], "windows"),
            targetFromPreset(presets["godotAndroidNativeArm64"], "androidArm64"),
            targetFromPreset(presets["godotAndroidNativeX64"], "androidX64"),
            targetFromPreset(presets["godotIosArm64"], "iosArm64"),
            targetFromPreset(presets["godotIosX64"], "iosX64")
    )
}
```
\
As a last step, we need to configure our projects targets with the dependencies and other configuration they need.  
We NEED to do this in a separate `configureTargetAction` function, that we add to the godot-kotlin plugin configuration
```kotlin
configure<org.godotengine.kotlin.gradleplugin.KotlinGodotPluginExtension> {
    this.releaseType = if (buildType?.toLowerCase() == "release") {
        org.jetbrains.kotlin.gradle.plugin.mpp.NativeBuildType.RELEASE
    } else {
        org.jetbrains.kotlin.gradle.plugin.mpp.NativeBuildType.DEBUG
    }
    this.godotProjectPath = "${project.rootDir.absolutePath}/.."
    this.libraryPath = "samples.gdnlib"
    this.configureTargetAction = ::configureTargetAction // <-- note this line here!
}

fun configureTargetAction(kotlinTarget: @ParameterName(name = "target") KotlinTarget) {
    kotlinTarget.compilations.getByName("main") {
        if (this is org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeCompilation) {
            println("Configuring target ${target.name}")
            target.compilations.all {
                dependencies {
                    implementation("org.godotengine.kotlin:godot-library:0.1.0-3.2")  // or implementation("org.godotengine.kotlin:godot-library-extension:0.1.0-3.2") if you want coroutines like yield
                    implementation("org.godotengine.kotlin:annotations:0.1.0-3.2")
                }
            }
            if (project.hasProperty("iosSigningIdentity") && this.target.name == "iosArm64") {
                tasks.build {
                    doLast {
                        exec {
                            commandLine = listOf("codesign", "-f", "-s", iosSigningIdentity, "build/bin/iosArm64/debugShared/libkotlin.dylib")
                        }
                        exec {
                            commandLine = listOf("install_name_tool", "-id", "@executable_path/dylibs/ios/libkotlin.dylib", "build/bin/iosArm64/debugShared/libkotlin.dylib")
                        }
                    }
                }
            } else if (project.hasProperty("iosSigningIdentity") && this.target.name == "iosX64") {
                tasks.build {
                    doLast {
                        exec {
                            commandLine = listOf("codesign", "-f", "-s", iosSigningIdentity, "build/bin/iosX64/debugShared/libkotlin.dylib")
                        }
                        exec {
                            commandLine = listOf("install_name_tool", "-id", "@executable_path/dylibs/ios/libkotlin.dylib", "build/bin/iosX64/debugShared/libkotlin.dylib")
                        }
                    }
                }
            }
        } else {
            System.err.println("Not a native target! TargetName: ${target.name}")
        }
    }
}
```

\
#### Final buildscript
If you followed along your `build.gradle.kts` file should look like this:
```kotlin
val platform: String by project
val armArch: String by project
val iosSigningIdentity: String by project
val buildType: String? by project

buildscript {
    repositories {
        mavenLocal()
        maven("https://dl.bintray.com/utopia-rise/kotlin-godot")
        jcenter()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.61")
        classpath("org.godotengine.kotlin:godot-gradle-plugin:0.1.0-3.2")
    }
}

plugins {
    id("org.jetbrains.kotlin.multiplatform") version ("1.3.61")
}

apply(plugin = "godot-gradle-plugin")

repositories {
    mavenLocal()
    maven("https://dl.bintray.com/utopia-rise/kotlin-godot")
    maven(url = "https://dl.bintray.com/utopia-rise/kotlinx")
    
    //Here we exclude jetbrains coroutines and atomicfu because they do not provide the ones for android platform
    //so we exclude them so that those dependencies are downloaded from our bintray, where we provide android dependencies
    jcenter {
        content {
            excludeModule("org.jetbrains.kotlinx", "kotlinx-coroutines-core-native")
            excludeModule("org.jetbrains.kotlinx", "atomicfu-native")
        }
    }
    mavenCentral {
        content {
            excludeModule("org.jetbrains.kotlinx", "kotlinx-coroutines-core-native")
            excludeModule("org.jetbrains.kotlinx", "atomicfu-native")
        }
    }
}

configure<org.godotengine.kotlin.gradleplugin.KotlinGodotPluginExtension> {
    this.releaseType = if (buildType?.toLowerCase() == "release") {
        org.jetbrains.kotlin.gradle.plugin.mpp.NativeBuildType.RELEASE
    } else {
        org.jetbrains.kotlin.gradle.plugin.mpp.NativeBuildType.DEBUG
    }
    this.godotProjectPath = "${project.rootDir.absolutePath}/.."
    this.libraryPath = "samples.gdnlib"
    this.configureTargetAction = ::configureTargetAction
}

kotlin {
    sourceSets {
        sourceSets.create("macosMain")
        sourceSets.create("linuxMain")
        sourceSets.create("windowsMain")
        sourceSets.create("androidArm64Main")
        sourceSets.create("androidX64Main")
        sourceSets.create("iosArm64Main")
        sourceSets.create("iosX64Main")
        configure(listOf(
                sourceSets["macosMain"],
                sourceSets["linuxMain"],
                sourceSets["windowsMain"],
                sourceSets["androidArm64Main"],
                sourceSets["androidX64Main"],
                sourceSets["iosArm64Main"],
                sourceSets["iosX64Main"]
        )) {
            this.kotlin.srcDir("src/main/kotlin")
        }
    }

    if (project.hasProperty("platform")) {
        when (platform) {
            "windows" -> listOf(targetFromPreset(presets["godotMingwX64"], "windows"))
            "linux" -> listOf(targetFromPreset(presets["godotLinuxX64"], "linux"))
            "macos" -> listOf(targetFromPreset(presets["godotMacosX64"], "macos"))
            "android" -> if (project.hasProperty("armArch")) {
                when(armArch) {
                    "X64" -> listOf(targetFromPreset(presets["godotAndroidNativeX64"], "androidX64"))
                    "arm64" -> listOf(targetFromPreset(presets["godotAndroidNativeArm64"], "androidArm64"))
                    else -> listOf(targetFromPreset(presets["godotAndroidNativeArm64"], "androidArm64"))
                }
            } else listOf(targetFromPreset(presets["godotAndroidNativeArm64"], "androidArm64"))
            "ios" -> if (project.hasProperty("armArch")) {
                when (armArch) {
                    "arm64" -> listOf(targetFromPreset(presets["godotIosArm64"], "iosArm64"))
                    "X64" -> listOf(targetFromPreset(presets["godotIosX64"], "iosX64"))
                    else -> listOf(targetFromPreset(presets["godotIosArm64"], "iosArm64"))
                }
            } else listOf(targetFromPreset(presets["godotIosArm64"], "iosArm64"))
            else -> listOf(targetFromPreset(presets["godotLinuxX64"], "linux"))
        }
    } else {
        listOf(
                targetFromPreset(presets["godotLinuxX64"], "linux"),
                targetFromPreset(presets["godotMacosX64"], "macos"),
                targetFromPreset(presets["godotMingwX64"], "windows"),
                targetFromPreset(presets["godotAndroidNativeArm64"], "androidArm64"),
                targetFromPreset(presets["godotAndroidNativeX64"], "androidX64"),
                targetFromPreset(presets["godotIosArm64"], "iosArm64"),
                targetFromPreset(presets["godotIosX64"], "iosX64")
        )
    }
}

fun configureTargetAction(kotlinTarget: @ParameterName(name = "target") org.jetbrains.kotlin.gradle.plugin.KotlinTarget) {
    kotlinTarget.compilations.getByName("main") {
        if (this is org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeCompilation) {
            println("Configuring target ${target.name}")
            target.compilations.all {
                dependencies {
                    implementation("org.godotengine.kotlin:godot-library:0.1.0-3.2") // or implementation("org.godotengine.kotlin:godot-library-extension:1.0.0") if you want coroutines like yield
                    implementation("org.godotengine.kotlin:annotations:0.1.0-3.2")
                }
            }
            if (project.hasProperty("iosSigningIdentity") && this.target.name == "iosArm64") {
                tasks.build {
                    doLast {
                        exec {
                            commandLine = listOf("codesign", "-f", "-s", iosSigningIdentity, "build/bin/iosArm64/debugShared/libkotlin.dylib")
                        }
                        exec {
                            commandLine = listOf("install_name_tool", "-id", "@executable_path/dylibs/ios/libkotlin.dylib", "build/bin/iosArm64/debugShared/libkotlin.dylib")
                        }
                    }
                }
            } else if (project.hasProperty("iosSigningIdentity") && this.target.name == "iosX64") {
                tasks.build {
                    doLast {
                        exec {
                            commandLine = listOf("codesign", "-f", "-s", iosSigningIdentity, "build/bin/iosX64/debugShared/libkotlin.dylib")
                        }
                        exec {
                            commandLine = listOf("install_name_tool", "-id", "@executable_path/dylibs/ios/libkotlin.dylib", "build/bin/iosX64/debugShared/libkotlin.dylib")
                        }
                    }
                }
            }
        } else {
            System.err.println("Not a native target! TargetName: ${target.name}")
        }
    }
}
```

We created a windows, linux, macos, android and ios build for our library with *debug* configuration, and set source dir as `src/main/kotlin`


## Kotlin code
Now we can start with kotlin code. Create the directories `src/main/kotlin` and create a new package in it, e.g. `com.company.game.logic`. **Package is necessary!!!** You won't be able to use your classes from `root` package.

Next step is to create Kotlin-file inside this package, e.g. `MyNode.kt`:
```kotlin
package com.company.game.logic

import godot.Node

@RegisterClass // <- see Registration readme
class MyNode: Node {
    constructor() : super()
}
```

When you write your game logic in kotlin, don't think of it as an application. There is no entry point. Your game consists of a set of classes which are attached to a node in godot. It's exactly the same as with `GDScript`.

Let's override Node's method `_ready`:
```kotlin
package com.company.game.logic

import godot.Node
import godot.core.GD

@RegisterClass // <- see Registration readme
class MyNode: Node {
    constructor() : super()

    @RegisterFunction // <- see Registration readme
    override fun _ready() {
        GD.print("Hello Godot!")
    }
}
```

So what's next? We have access to the full Godot API here. Next step is to tell Godot about our class. For this purpose there is a **registration** mechanism leveraging the power of annotations.

## Registration

To have access to Kotlin classes from Godot you have to **register** them. Kotlin wrapper has special utility to register classes. Only thing you have to do is to annotate you classes, functions, properties and signals you want godot to know about.

More information about registering: [Registering classes](REGISTRATION.md)


## Compiling

Now we can build our project. Use gradle `build` task to build the project. At first gradle will generate a `Entry.kt` file with entry point and all classes, functions, properties and signals annotated. This file will be used by Godot to call our classes.

If everything is okay you will get a shared library (`.dll` on windows, `.so` on linux and android, and `.dylib` on macOS). Copy it from gradle `build/bin` directory into your Godot project subdirectory and link it to *GDNativeLibrary* instance. If you mentioned `generateGDNS` option in build file - at that path there will be .gdns files (scripts) which you connect to any node.

You can also specify the platform on which you want to build using `platform` parameter. Here is an example for windows:
```shell script
./gradlew build -Pplatform=windows
```

### Android specificities

Android supported architectures are `arm64` and `X64`, for now no 32 bits target are supported.  
To build project on android you have to add `armArch` parameter to build task. Here is an example for arm64:
```shell script
./gradlew build -Pplatform=android -ParmArch=arm64
```

### iOS specificities

Same as android, the supported architectures are `arm64` and `X64`.  
In order to build for iOS, you have to specify `ios` as `platform` parameter and the desired `armArch` (like on android).
Apple required you to sign your code with a signing identity. Gradle build script will do it for you if you add the
`iosSigningIdentity` parameter.  
Here is an example:  
```shell script
./gradlew build -Pplatform=ios -ParmArch=arm64 -PiosSigningIdentity="youridentity"
```
`youridentity` should looks like this : `Apple Development: mail@provider.com (XXXXXXXXXX)`.

## What's next?

Now you have everything to write Godot game logic on Kotlin.

See also [**API differences from GDScript**](API_DIFFERENCES.md)