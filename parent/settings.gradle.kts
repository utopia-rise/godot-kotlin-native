includeBuild("../") {
    dependencySubstitution {
        substitute(module("com.utopia-rise:godot-build-props")).with(project(":godot-build-props"))
        substitute(module("com.utopia-rise:godot-annotation-processor")).with(project(":godot-annotation-processor"))
        substitute(module("com.utopia-rise:godot-compiler-plugin")).with(project(":godot-compiler-plugin"))
        substitute(module("com.utopia-rise:godot-compiler-plugin-common")).with(project(":godot-compiler-plugin-common"))
        substitute(module("com.utopia-rise:godot-entry-generator")).with(project(":godot-entry-generator"))
        substitute(module("com.utopia-rise:godot-gradle-plugin")).with(project(":godot-gradle-plugin"))
        substitute(module("com.utopia-rise:godot-library")).with(project(":godot-library"))
        // gradle doesn't support targeting a specific configuration (i.e shadow) when substituting a dependency in a composite build.
        // composite-build-support depends on project(":godot-compiler-native-plugin", configuration = "shadow")
        substitute(module("com.utopia-rise:godot-compiler-native-plugin")).with(project(":composite-build-support"))
    }
}

pluginManagement {
    resolutionStrategy.eachPlugin {
        when (requested.id.id) {
            "com.utopia-rise.godot-kotlin" -> useModule("com.utopia-rise:godot-gradle-plugin:${requested.version}")
        }
    }
}

includeBuild("../samples/3d-platformer")
includeBuild("../samples/mini-games")
