# godot-kotlin samples
The following will show you how to test out a local build of godot-kotlin.

## Publish artifacts locally
For the moment, trying out the samples requires publishing the project locally. In order to do so,
just run the following command:
```shell script
./gradlew publishToMavenLocal -PignoreSamples
```

## Configure samples to use local artifacts
Just copy the snippet below to your `settings.gradle.kts` file.

```kotlin
pluginManagement {
    repositories {
        mavenLocal()
        jcenter()
        gradlePluginPortal()
    }

    resolutionStrategy.eachPlugin {
        when (requested.id.id) {
            "com.utopia-rise.godot-kotlin" -> useModule("com.utopia-rise:godot-gradle-plugin:${requested.version}")
        }
    }
}
```