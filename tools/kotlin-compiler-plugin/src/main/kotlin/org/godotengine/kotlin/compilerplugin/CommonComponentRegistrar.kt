package org.godotengine.kotlin.compilerplugin

import com.google.auto.service.AutoService
import de.jensklingenberg.mpapt.common.MpAptProject
import org.godotengine.kotlin.annotationprocessor.RegisterAnnotationProcessor
import org.jetbrains.kotlin.codegen.extensions.ClassBuilderInterceptorExtension
import org.jetbrains.kotlin.com.intellij.mock.MockProject
import org.jetbrains.kotlin.compiler.plugin.ComponentRegistrar
import org.jetbrains.kotlin.config.CompilerConfiguration
import org.jetbrains.kotlin.extensions.StorageComponentContainerContributor
import org.jetbrains.kotlin.js.translate.extensions.JsSyntheticTranslateExtension

@AutoService(ComponentRegistrar::class)
class CommonComponentRegistrar : ComponentRegistrar {
    override fun registerProjectComponents(
            project: MockProject,
            configuration: CompilerConfiguration
    ) {
        val processor = RegisterAnnotationProcessor()
        val mpapt = MpAptProject(processor, configuration)
        StorageComponentContainerContributor.registerExtension(project, mpapt)
        ClassBuilderInterceptorExtension.registerExtension(project, mpapt)
        JsSyntheticTranslateExtension.registerExtension(project, mpapt)
    }
}