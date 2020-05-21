import org.ajoberstar.reckon.gradle.ReckonExtension
import org.ajoberstar.reckon.gradle.ReckonPlugin
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class BuildVersion : Plugin<Project> {
    override fun apply(target: Project) {
        target.plugins.apply(ReckonPlugin::class.java)
        target.extensions.configure<ReckonExtension> {
            scopeFromProp()
            stageFromProp("alpha", "rc", "final")
        }
    }
}
