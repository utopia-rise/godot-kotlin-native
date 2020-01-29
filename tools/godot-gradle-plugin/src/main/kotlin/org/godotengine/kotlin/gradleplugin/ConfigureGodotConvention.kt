package org.godotengine.kotlin.gradleplugin

import groovy.lang.Closure
import org.gradle.api.Action
import org.gradle.api.Project
import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet
import java.io.File


class ConfigureGodotConvention(
        private val project: Project,
        private val sourceSetsInformation: MutableMap<KotlinSourceSet, GodotSourceSetInformation>
) {
    fun configureGodot(sourceSet: KotlinSourceSet, action: Closure<GodotSourceSet>) {
        configureGodot(listOf(sourceSet), action)
    }
    fun configureGodot(sourceSet: KotlinSourceSet, action: Action<GodotSourceSet>) {
        configureGodot(listOf(sourceSet), action)
    }
    fun configureGodot(sourceSet: KotlinSourceSet, action: GodotSourceSet.() -> Unit) {
        configureGodot(listOf(sourceSet), action)
    }


    fun configureGodot(sourceSets: Iterable<KotlinSourceSet>, action: Closure<GodotSourceSet>) {
        prepareGodotConfigure(sourceSets) { project.configure(listOf(this), action) }
    }
    fun configureGodot(sourceSets: Iterable<KotlinSourceSet>, action: Action<GodotSourceSet>) {
        prepareGodotConfigure(sourceSets) { project.configure(listOf(this), action) }
    }
    fun configureGodot(sourceSets: Iterable<KotlinSourceSet>, action: GodotSourceSet.() -> Unit) {
        prepareGodotConfigure(sourceSets) { project.configure(listOf(this), action) }
    }


    private fun prepareGodotConfigure(sourceSets: Iterable<KotlinSourceSet>, callback: GodotSourceSet.() -> Unit) {
        for (set in sourceSets) {
            val info = sourceSetsInformation[set]
                    ?: GodotSourceSetInformation(project.projectDir.absolutePath + File.separator, set)

            val godotSourceSet = GodotSourceSet(project, set, info)
            godotSourceSet.callback()

            sourceSetsInformation[set] = info
        }
    }
}