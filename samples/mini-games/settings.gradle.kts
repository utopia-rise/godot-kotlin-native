// TODO: remove this once we have publishing setup for all artifacts
includeBuild("../../") {
    dependencySubstitution {
        substitute(module("com.utopia-rise:godot-gradle-plugin")).with(project(":godot-gradle-plugin"))
    }
}

// TODO: remove this once we have publishing setup for all artifacts
pluginManagement {
    resolutionStrategy.eachPlugin {
        when (requested.id.id) {
            "com.utopia-rise.godot-kotlin" -> useModule("com.utopia-rise:godot-gradle-plugin:0.1.0")
        }
    }
}