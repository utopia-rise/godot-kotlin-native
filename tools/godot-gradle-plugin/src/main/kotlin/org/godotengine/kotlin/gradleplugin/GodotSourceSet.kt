package org.godotengine.kotlin.gradleplugin

import groovy.lang.Closure
import org.gradle.api.Action
import org.gradle.api.Project
import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet


class GodotSourceSet(
        private val project: Project,
        private val set: KotlinSourceSet,
        private val info: GodotSourceSetInformation
) {
    fun sourceSet(action: Closure<KotlinSourceSet>) = project.configure(listOf(set), action)
    fun sourceSet(action: Action<KotlinSourceSet>) = project.configure(listOf(set), action)
    fun sourceSet(action: KotlinSourceSet.() -> Unit) = project.configure(listOf(set), action)


    fun configs(vararg configs: String) = info.appendConfigs(configs.asIterable())
    fun libraryPath(path: String) { info.libraryPath = path }

    fun generateGDNS(path: String) = info.generateGDNS(path)

    fun skipEntryGeneration(skip: Boolean) { info.skipEntryGeneration = skip }
}