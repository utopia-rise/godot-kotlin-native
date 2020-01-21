package org.godotengine.kotlin.annotationprocessor

import javax.annotation.processing.*
import javax.lang.model.SourceVersion
import javax.lang.model.element.TypeElement

@SupportedSourceVersion(SourceVersion.RELEASE_8)
@SupportedAnnotationTypes("org.godotengine.kotlin.annotation.Register")
@SupportedOptions(RegisterAnnotationProcessor.KAPT_KOTLIN_GENERATED_OPTION_NAME)
class RegisterAnnotationProcessor : AbstractProcessor() {
    val logger: Messager = processingEnv.messager

    companion object {
        const val KAPT_KOTLIN_GENERATED_OPTION_NAME = "kapt.kotlin.generated"
    }

    override fun process(annotations: MutableSet<out TypeElement>, roundEnvironment: RoundEnvironment): Boolean {
        val kaptGeneratedDirectory = getKaptGeneratedDirectory(processingEnv)

        info("Starting to process \"Register\" annotations")

        //code generation logic

        info("Finished processing \"Register\" annotations")
        return true
    }

    /**
     * Returns the path as a String to which the generated code should be written
     * @param processingEnv the environment from which the code should be generated
     * @return directory path to where the generated code should be written to as a String
     * @throws IllegalStateException when the path cannot be found
     */
    private fun getKaptGeneratedDirectory(processingEnv: ProcessingEnvironment): String {
        return processingEnv.options[KAPT_KOTLIN_GENERATED_OPTION_NAME] ?: run {
            throw IllegalStateException("Can't find the target directory for generated Kotlin files.")
        }
    }
}