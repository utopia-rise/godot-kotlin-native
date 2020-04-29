package godot.gradle

import org.gradle.api.model.ObjectFactory
import org.gradle.kotlin.dsl.listProperty
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
    val platforms = objects.listProperty<Platform>()

    internal val entrySourceDir = objects.directoryProperty()

    private var configureTargets: KotlinNativeTarget.() -> Unit = {}

    fun platforms(vararg platforms: Platform) {
        this.platforms.set(platforms.toList())
    }

    fun configureTargets(block: KotlinNativeTarget.() -> Unit) {
        this.configureTargets = block
    }

    internal fun configureTarget(target: KotlinNativeTarget) {
        configureTargets(target)
    }
}
