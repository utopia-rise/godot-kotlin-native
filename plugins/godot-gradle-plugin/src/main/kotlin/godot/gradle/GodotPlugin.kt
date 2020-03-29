package godot.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.creating
import org.gradle.kotlin.dsl.getByType
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinMultiplatformPlugin

class GodotPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.pluginManager.withPlugin("org.jetbrains.kotlin.multiplatform") {
            val mpp = project.extensions.getByType<KotlinMultiplatformExtension>()
            val godot = project.extensions.create<GodotExtension>("godot", project.objects)
            setupExtensionDefaults(project, godot)
            setupKotlinPlugin(project, mpp)
        }
    }

    private fun setupExtensionDefaults(project: Project, extension: GodotExtension) {
        with(extension) {
            platforms(*Platform.values())
            debug.set(false)
            cleanupGeneratedFiles.set(true)
            gdnsDir.set(project.file("src/gdns/kotlin"))
        }
    }

    fun setupKotlinPlugin(project: Project, mpp: KotlinMultiplatformExtension) {
        project.afterEvaluate {
            with(mpp) {
            }
        }
    }

    companion object {
        const val DEFAULT_SRC_DIR = "src/godotMain/kotlin"
    }
}