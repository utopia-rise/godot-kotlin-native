package godot.gradle

import godot.gradle.GodotExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.create

class GodotPlugin : Plugin<Project> {
  override fun apply(project: Project) {
    project.extensions.create<GodotExtension>("godot", project.objects)
  }
}