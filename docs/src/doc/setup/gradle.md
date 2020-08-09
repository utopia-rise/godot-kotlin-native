This binding uses [Gradle](https://gradle.org) as its build tool and you will need version 6.0 or higher installed. The next requirement is to have a Godot project (obviously!), if you don't have it yet please create one.

Open a terminal and `cd` to root directory of your Godot project.

## Wrapper
On this step, we will be setting up a Gradle [wrapper](https://docs.gradle.org/current/userguide/gradle_wrapper.html). The wrapper will ensure that anyone who wants to build your project from source will use the same gradle version.

```shell
touch build.gradle.kts gradle.properties settings.gradle.kts
```

The above command will create three files, which will be empty for now.

```shell
gradle wrapper --gradle-version=6.5.1
```

That is it, you have the wrapper installed! The command will produce several files, but the important ones are `gradlew` and `gradlew.bat`. Moving forward we will be using `gradlew` to run gradle (`gradlew.bat` on Windows). The first time `gradlew` is used it will download the gradle version you have specified before.

## Configuring gradle
Once you have the wrapper installed, we need to set up the Gradle plugin provided by this binding. Without the plugin, you will have to manually generate the entry point, `.gdnlib` and `.gdns` files.

**build.gradle.kts**

!!! important ""
    Replace `<kotlin-version>` and `godot-kotlin-version>` with the appropriate kotlin and godot-kotlin versions, respectively.
```kotlin
plugins {
    kotlin("multiplatform") version "<kotlin-version>"
    id("com.utopia-rise.godot-kotlin") version "<godot-kotlin-version>"
}

repositories {
    jcenter()
    mavenCentral()
    // if you want to use bleeding edge builds
    maven("https://dl.bintray.com/utopia-rise/godot-kotlin-dev")
}

godot {
    // Build a debug binary
    debug.set(true)
    // Configure to build for all supported platforms.
    defaultPlatforms()
}
```

**gradle.properties**

!!! important ""
    We need to give the gradle enough memory as the default settings is not enough for the Kotlin Native compiler.
    
```properties
org.gradle.jvmargs=-Xmx3G
```

    
**settings.gradle.kts**

!!! danger ""
    This section is optional and is only required if you are using a bleeding edge build.
    
```kotlin
pluginManagement {
    repositories {
        jcenter()
        gradlePluginPortal()
        maven("https://dl.bintray.com/utopia-rise/godot-kotlin-dev")
    }
    resolutionStrategy.eachPlugin {
        when (requested.id.id) {
            "com.utopia-rise.godot-kotlin" -> useModule("com.utopia-rise:godot-gradle-plugin:${requested.version}")
        }
    }
}
```
    
## Importing project into IntelliJ IDEA
Before proceeding to the next section, follow [this guide](ide.md) on how to import your project into IntelliJ IDEA.

## Creating your first class

Let's create a file `src/godotMain/kotlin/Simple.kt` with the following contents.

```kotlin
import godot.*
import godot.annotation.*
import godot.core.*

@RegisterClass
class Simple: Spatial() {

    @RegisterFunction
    override fun _ready() {
        GD.print("Hello Godot from Kotlin!")
    }
}
```

`@RegisterClass` will register the annotated class to Godot. More details can be found in the [classes](../user-guide/classes.md) section of the user guide
    
Now we can trigger a build.

```shell
./gradlew build
``` 

!!! note ""
    The plugin automatically generates the appropriate `gdns` files which can be found at `src/gdns`. It is up to you whether you want to include those files in source control or not.

Once the build completes, a file `src/gdns/Simple.gdns` is generated. You can use `Simple.gdns` in Godot when assigning a script to a node.

![Attach Node Script](../assets/img/attach.png)

## Configuring target platforms

By default, the plugin configures the build to build all supported platforms. This can be changed via the `platforms` property of `godot`.

```kotlin
import godot.gradle.GodotPlatform

godot {
  platforms(GodotPlatform.WINDOWS_X64)
}
```

## All Godot plugin configurations

| Property              | Type                | Description                                                                                                                                                                                                                                                                                                          |
|-----------------------|---------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| debug                 | Boolean             | Sets if a debug or a release build should be built. **Note:** as of kotlin version `1.3.72` release builds are broken on the kotlin side!                                                                                                                                                                            |
| gdnsDir               | File                | Changes the default (`src/gdns/`) output dir for generated gdns files                                                                                                                                                                                                                                                |
| gdnlibFile            | File                | You can set the name `gdnlib` file yourself if you want to create it yourself or don't want the generated one to be named `lowercasedProjectName.gdnlib`                                                                                                                                                             |
| singleton             | Boolean             | Sets the `singleton` property inside the generated `gdnlib` file                                                                                                                                                                                                                                                     |
| loadOnce              | Boolean             | Sets the `load_once` property inside the generated `gdnlib` file                                                                                                                                                                                                                                                     |
| reloadable            | Boolean             | Sets the `reloadable` property inside the generated `gdnlib` file                                                                                                                                                                                                                                                    |
| platforms             | List<GodotPlatform> | Sets the targets platforms                                                                                                                                                                                                                                                                                           |