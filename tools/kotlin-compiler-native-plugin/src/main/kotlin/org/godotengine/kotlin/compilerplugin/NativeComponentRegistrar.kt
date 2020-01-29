package org.godotengine.kotlin.compilerplugin

import com.google.auto.service.AutoService
import com.intellij.mock.MockProject
import de.jensklingenberg.mpapt.common.MpAptProject
import org.godotengine.kotlin.annotationprocessor.RegisterAnnotationProcessor
import org.jetbrains.kotlin.backend.common.extensions.IrGenerationExtension
import org.jetbrains.kotlin.compiler.plugin.ComponentRegistrar
import org.jetbrains.kotlin.config.CompilerConfiguration
import org.jetbrains.kotlin.extensions.StorageComponentContainerContributor


@AutoService(ComponentRegistrar::class)
class NativeComponentRegistrar : ComponentRegistrar {
    override fun registerProjectComponents(project: MockProject, configuration: CompilerConfiguration) {
        val generator = RegisterAnnotationProcessor()
        val mpapt = MpAptProject(generator, configuration)

        StorageComponentContainerContributor.registerExtension(project, mpapt)
        IrGenerationExtension.registerExtension(project, mpapt)
    }
}