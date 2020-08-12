rootProject.name = "platformer3d"

val devMode = extra.has("godot.kotlin.dev")
pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenLocal()
    }
}

if (!devMode) {
    pluginManagement {
        resolutionStrategy.eachPlugin {
            when (requested.id.id) {
                "com.utopia-rise.godot-kotlin" -> useModule("com.utopia-rise:godot-gradle-plugin:${requested.version}")
            }
        }
    }
} else {
    println("Dev mode enabled, using static versioning")
    pluginManagement {
        resolutionStrategy.eachPlugin {
            when (requested.id.id) {
                "com.utopia-rise.godot-kotlin" -> useModule("com.utopia-rise:godot-gradle-plugin:0.0.1")
            }
        }
    }
}
