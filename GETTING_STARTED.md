# Getting started

To start using Godot and Kotlin together you need [**Gradle**](https://gradle.org/) as build tool. Current stable supported version of Gradle is **4.7**.

We recommend you [**Intellij IDEA**](https://www.jetbrains.com/idea/) (Ultimate or Community) as IDE. This is the only supported IDE now.

## First steps
Create new empty _**Gradle**_ project in IDEA, or type in command line
```shell
mkdir projectname
cd projectname
gradle init
gradle wrapper --gradle-version=4.7
```

\
First of all you need to enable GRADLE_METADATA feature in **settings.gradle** file and determine plugin repositories:
```groovy
pluginManagement {
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == 'kotlin-multiplatform') {
                useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:${requested.version}")
            }
            if (requested.id.id == 'kotlin-godot') {
                useModule("org.godotengine.kotlin:godot-gradle-plugin:${requested.version}")
            }
        }
    }
    repositories {
        mavenLocal()
        jcenter()
        maven { url 'https://dl.bintray.com/kotlin/kotlin-dev' }
        maven { url 'https://dl.bintray.com/mrakakuy/kotlin-godot' }
    }
}
enableFeaturePreview('GRADLE_METADATA')

rootProject.name = 'projectname'
```

So now we can connect plugins to our project.

\
In **build.gradle**:
```groovy
plugins {
    id 'kotlin-multiplatform' version '1.3.20-dev-1427'
    id 'kotlin-godot' version '1.0.0'
}

repositories {
    mavenLocal()
    jcenter()
    maven { url 'https://dl.bintray.com/kotlin/kotlin-dev' }
    maven { url 'https://dl.bintray.com/mrakakuy/kotlin-godot' }
}
```
\
Next step is to specify Kotlin-artifacts we want. Add in **build.gradle**:
```groovy
kotlin {
    targets {
        fromPreset(presets.godotMingwX64, 'windows') {
            compilations.all {
                buildTypes = [DEBUG]
            }
        }
    }
    sourceSets {
        configureGodot(windowsMain) {
            sourceSet {
                kotlin.srcDirs 'src/main/kotlin'
            }
        }
    }
}
```

We created Windows-build for our library with *debug* configuration, and set source dir as `src/main/kotlin`


## Kotlin code
Now we can start with code. Create directory `src/main/kotlin` and create new package in it, e.g. `com.company.game.logic`. **Package is necessary!!!** You won't be able to use your classes from *root* package.

Next step is to create Kotlin-file inside this package, e.g. `MyNode.kt`:
```kotlin
package com.company.game.logic

import godot.Node

class MyNode: Node {
    constructor() : super()
}
```

Godot program in Kotlin-style is just a set of classes. There is no explicit entry point here, you have only classes. Each class represent one Godot script which you can attach to any Node.

Let's reimplement Node's method `_ready`:
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

So what's next? We have access to Godot API here. Next step is to integrate our class into Godot. For this purpose there is an **registration** mechanism.

## Registration

To have access to Kotlin classes from Godot you have to **register** it. Kotlin wrapper has special utility to register classes. Only thing you have to do is to describe your classes structure in XML or JSON file.

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

In this file you specify class name - this name will be seen in Godot, class path - full class name **with package**, parent class and methods.

Also you specify global **package**: subdirectory in Godot project directory where generated scripts will be stored.

More information about registering: [Registering classes](REGISTRATION.md)

We should also modify **build.gradle** file:
```groovy
kotlin {
    targets {
        fromPreset(presets.godotMingwX64, 'windows') {
            compilations.all {
                buildTypes = [DEBUG]
            }
        }
    }
    sourceSets {
        configureGodot(windowsMain) {
            sourceSet {
                kotlin.srcDirs 'src/main/kotlin'
            }

            libraryPath 'libraryname.gdnlib'
            generateGDNS '../project'
            
            configs 'src/main/kotlin/com/company/game/login/classes.json'
        }
    }
}
```
Added options in ***configureGodot*** closure is

* **libraryPath**: full path to GDNativeLibrary file in Godot project path. Look at Godot WIKI how to create it.
* **generateGDNS**: path to Godot project directory (relative or absolute). 
* **configs**: list of pathes to configs file.

## Compiling

Now we can build our project. Use gradle `build` task to build project. At first gradle will generate *.kt* file with entry point and all classes registrations from configs. This file will be also built.

If everything is okay you will get shared library (*.dll* on Windows). Copy it from gradle `build` directory into your Godot project directory and link to *GDNativeLibrary* instance. If you mentioned `generateGDNS` option in build file - at that path there will be .gdns files (scripts) which you connect to any node.


## What's next?

Now you have everything to write Godot game logic on Kotlin.

See also [**API differences from GDScript**](API_DIFFERENCES.md)