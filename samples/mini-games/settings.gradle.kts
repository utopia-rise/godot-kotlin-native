// without this doing:
//  plugin { id("com.utopia-rise.godot-kotlin") version "0.1.0" }
// won't work  as gradle does not know how to map the plugin id to an actual artifact.
// this is only required when trying out local builds. Comment this out when trying out a plugin published
// in the gradle plugin portal.
// TODO: remove this once we have the artifacts published

pluginManagement {
    repositories {
        mavenLocal()
        jcenter()
        gradlePluginPortal()
    }

    resolutionStrategy.eachPlugin {
        val godotVersion: String? by extra
        when (requested.id.id) {
            "com.utopia-rise.godot-kotlin" -> useModule("com.utopia-rise:godot-gradle-plugin-$godotVersion:${requested.version}")
        }
    }
}
