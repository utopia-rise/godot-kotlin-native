package godot.gradle

import org.gradle.api.model.ObjectFactory
import org.gradle.kotlin.dsl.property
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

open class GodotExtension(objects: ObjectFactory) {
    val debug = objects.property<Boolean>()
    val cleanupGeneratedFiles = objects.property<Boolean>()
    val gdnsDir = objects.fileProperty()
    val gdnlibFile = objects.fileProperty()
    val singleton = objects.property<Boolean>()
    val loadOnce = objects.property<Boolean>()
    val reloadable = objects.property<Boolean>()
    internal lateinit var configure: (List<GodotPlatform>) -> Unit

    internal val entrySourceDir = objects.directoryProperty()

    private var configureTargets: KotlinNativeTarget.() -> Unit = {}

    fun platforms(vararg platforms: GodotPlatform) {
        configure(platforms.toList())
    }

    fun defaultPlatforms() {
        // we don't have godot-library in the mobile targets yet, limit these to desktop for now
        //has to be change in `build.gradle.kts` of `godot-library` as well
        platforms(
            GodotPlatform.LINUX_X64,
            GodotPlatform.WINDOWS_X64,
            GodotPlatform.OSX_X64
        )
    }

    fun configureTargets(block: KotlinNativeTarget.() -> Unit) {
        this.configureTargets = block
    }

    internal fun configureTarget(target: KotlinNativeTarget) {
        configureTargets(target)
    }
}
