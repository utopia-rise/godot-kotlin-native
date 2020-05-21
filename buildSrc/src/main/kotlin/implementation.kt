import org.gradle.api.Project
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.extra

fun DependencyHandler.godotProjectImplementation(path: String, godotVersion: String) =
    add("implementation", project(mapOf("path" to "$path-$godotVersion")))

fun DependencyHandler.godotProjectCompileOnly(path: String, godotVersion: String) =
    add("compileOnly", project(mapOf("path" to "$path-$godotVersion")))
