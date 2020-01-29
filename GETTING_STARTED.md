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
└── project/
    └── project.godot
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
buildscript {
    repositories {
        mavenLocal()
        jcenter()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.61")
        classpath("org.godotengine.kotlin:godot-gradle-plugin:1.0.1")
    }
}

plugins {
    id("org.jetbrains.kotlin.multiplatform")
}

apply(plugin = "godot-gradle-plugin")

repositories {
    mavenLocal()
    jcenter()
}
```


\
Next step is to specify the sourceSets of the targets we want to support. Add in `build.gradle.kts`:
```kotlin
kotlin {
    sourceSets {
        sourceSets.create("macosMain")
        sourceSets.create("linuxMain")
        sourceSets.create("windowsMain")
        configure(listOf(sourceSets["macosMain"], sourceSets["linuxMain"], sourceSets["windowsMain"])) {
            this.kotlin.srcDir("src/main/kotlin")
        }


        configure<godot.gradle.plugin.ConfigureGodotConvention> {
            this.configureGodot(listOf(sourceSets["macosMain"], sourceSets["linuxMain"], sourceSets["windowsMain"])) {
                sourceSet {
                    kotlin.srcDirs("src/main/kotlin")
                }

                // <-- libraryPath goes here (see below)
                // <-- generateGDNS goes here (see below)
                // <-- configs go here (see below)
            }
        }
    }
    
    //<-- targets go here (see below)
}
```

\
Next we need to specify the path for the `.gdnlib` file godot uses to load our dynamic library.  
The `.gdnlib` file goes in the root of the `project` subfolder.  
You can copy and modify one from the samples or see [here](https://docs.godotengine.org/en/3.1/tutorials/plugins/gdnative/gdnative-c-example.html#creating-the-gdnativelibrary-gdnlib-file) on how to generate one yourself.
```kotlin
libraryPath("${project.rootDir.absolutePath}/project/projectname.gdnlib")
```

\
Now we need to specify the output folder for the generated `.gdns` files:
```kotlin
generateGDNS("${project.rootDir.absolutePath}/../project")
```

\
In order to generate the `.gdns` files we need to provide a configs closure (see [REGISTRATION](REGISTRATION.md) on how to populate the closure. For now it's empty):
```kotlin
configs(
        
)
```

\
As the last step, we need to specify for which target to build for:
```kotlin
val targets = listOf(
        targetFromPreset(presets["godotMingwX64"], "windows"),
        targetFromPreset(presets["godotLinuxX64"], "linux"),
        targetFromPreset(presets["godotMacosX64"], "macos")
)

targets.forEach { target ->
    target.compilations.getByName("main") {
        if (this is org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeCompilation) {
            println("Configuring target ${target.name}")
            this.target.binaries {
                sharedLib(listOf(org.jetbrains.kotlin.gradle.plugin.mpp.NativeBuildType.DEBUG))
            }
            target.compilations.all {
                dependencies {
                    implementation("org.godotengine.kotlin:godot-library:1.0.0")
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
buildscript {
    repositories {
        mavenLocal()
        jcenter()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.61")
        classpath("org.godotengine.kotlin:godot-gradle-plugin:1.0.1")
    }
}

plugins {
    id("org.jetbrains.kotlin.multiplatform")
}

apply(plugin = "godot-gradle-plugin")

repositories {
    mavenLocal()
    jcenter()
}

kotlin {
    sourceSets {
        sourceSets.create("macosMain")
        sourceSets.create("linuxMain")
        sourceSets.create("windowsMain")
        configure(listOf(sourceSets["macosMain"], sourceSets["linuxMain"], sourceSets["windowsMain"])) {
            this.kotlin.srcDir("src/main/kotlin")
        }


        configure<godot.gradle.plugin.ConfigureGodotConvention> {
            this.configureGodot(listOf(sourceSets["macosMain"], sourceSets["linuxMain"], sourceSets["windowsMain"])) {
                sourceSet {
                    kotlin.srcDirs("src/main/kotlin")
                }

                libraryPath("${project.rootDir.absolutePath}/project/projectname.gdnlib")
                generateGDNS("${project.rootDir.absolutePath}/../project")
                
                configs(
                        
                )
            }
        }
    }
    
    val targets = listOf(
            targetFromPreset(presets["godotMingwX64"], "windows"),
            targetFromPreset(presets["godotLinuxX64"], "linux"),
            targetFromPreset(presets["godotMacosX64"], "macos")
    )
    
    targets.forEach { target ->
        target.compilations.getByName("main") {
            if (this is org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeCompilation) {
                println("Configuring target ${target.name}")
                this.target.binaries {
                    sharedLib(listOf(org.jetbrains.kotlin.gradle.plugin.mpp.NativeBuildType.DEBUG))
                }
                target.compilations.all {
                    dependencies {
                        implementation("org.godotengine.kotlin:godot-library:1.0.0")
                    }
                }
            } else {
                System.err.println("Not a native target! TargetName: ${target.name}")
            }
        }
    }
}
```

We created a windows, linux and macOs build for our library with *debug* configuration, and set source dir as `src/main/kotlin`


## Kotlin code
Now we can start with kotlin code. Create the directories `src/main/kotlin` and create a new package in it, e.g. `com.company.game.logic`. **Package is necessary!!!** You won't be able to use your classes from `root` package.

Next step is to create Kotlin-file inside this package, e.g. `MyNode.kt`:
```kotlin
package com.company.game.logic

import godot.Node

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

class MyNode: Node {
    constructor() : super()

    override fun _ready() {
        GD.print("Hello Godot!")
    }
}
```

So what's next? We have access to the full Godot API here. Next step is to tell Godot about our class. For this purpose there is a **registration** mechanism.

## Registration

To have access to Kotlin classes from Godot you have to **register** them. Kotlin wrapper has special utility to register classes. Only thing you have to do is to describe your classes structure in XML or JSON file.

Example `classes.json`
```json
{
  "package": "Scripts",

  "registerClasses": [
    {
      "name": "MyClass",
      "class": "com.company.game.logic.MyClass",
      "extends": "Node",
      "methods": [
        {
          "name": "_ready",
          "arguments": []
        }
      ]
    }
  ]
}
```

In this file you specify:
- package -> your classes will be generated in this subdirectory of `project`
- The class name -> this name will be seen in Godot
- The class path -> the full class name **with package** with which godot can call our class
- Parent class
- Properties
- Methods
- Signals

More information about registering: [Registering classes](REGISTRATION.md)

Now we need to add the config file we've just created to the `configs` closure:
```kotlin
configs(
        "src/main/kotlin/com/company/game/logic/classes.json"
)
```


## Compiling

Now we can build our project. Use gradle `build` task to build the project. At first gradle will generate a `Entry.kt` file with entry point and all classes registrations from configs. This file will be used by Godot to call our classes.

If everything is okay you will get a shared library (`.dll` on windows, `.so` on linux and macOS). Copy it from gradle `build/bin` directory into your Godot project subdirectory and link it to *GDNativeLibrary* instance. If you mentioned `generateGDNS` option in build file - at that path there will be .gdns files (scripts) which you connect to any node.


## What's next?

Now you have everything to write Godot game logic on Kotlin.

See also [**API differences from GDScript**](API_DIFFERENCES.md)