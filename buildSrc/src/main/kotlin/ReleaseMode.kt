import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.extra

class ReleaseMode : Plugin<Project> {
    override fun apply(target: Project) {
        val releaseMode = target.version.toString().matches(Regex("^\\d+\\.\\d+\\.\\d+-\\d+\\.\\d+(-rc\\.\\d+)?"))
        target.extra["releaseMode"] = releaseMode
        target.subprojects.forEach {
            it.extra["releaseMode"] = releaseMode
        }
    }
}
