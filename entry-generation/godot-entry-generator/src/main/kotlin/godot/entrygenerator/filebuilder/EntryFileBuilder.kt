package godot.entrygenerator.filebuilder

import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import godot.entrygenerator.generator.ClassRegistrationGenerator
import godot.entrygenerator.model.ClassWithMembers
import java.io.File

class EntryFileBuilder {
    private val entryFileSpec = FileSpec
        .builder("godot", "Entry")
        .addFunction(generateGDNativeInitFunction())
        .addFunction(generateGDNativeTerminateFunction())

    private val nativeScriptInitFunctionSpec = FunSpec
        .builder("NativeScriptInit")
        .addAnnotation(
            AnnotationSpec
                .builder(ClassName("kotlin.native", "CName"))
                .addMember("%S", "godot_nativescript_init")
                .build()
        )
        .addParameter("handle", ClassName("kotlinx.cinterop", "COpaquePointer"))
        .addStatement("%T.nativescriptInit(handle)", ClassName("godot.core", "Godot"))


    fun registerClassesWithMembers(classesWithMembers: Set<ClassWithMembers>): EntryFileBuilder {
        val classRegistryControlFlow = nativeScriptInitFunctionSpec
            .beginControlFlow(
                "with(%T(handle))·{",
                ClassName("godot.core", "ClassRegistry")
            ) //START: with ClassRegistry

        ClassRegistrationGenerator.registerClasses(classesWithMembers, classRegistryControlFlow)

        classRegistryControlFlow.endControlFlow() //END: with ClassRegistry

        return this
    }

    fun build(outputPath: String) {
        entryFileSpec.addFunction(nativeScriptInitFunctionSpec.build())
        entryFileSpec.addFunction(generateGDNativeScriptTerminateFunction())
        entryFileSpec.build().writeTo(File(outputPath))
    }

    private fun registration(registrationAction: FunSpec.Builder.() -> Unit): EntryFileBuilder {
        registrationAction(nativeScriptInitFunctionSpec)
        return this
    }

    private fun generateGDNativeInitFunction(): FunSpec {
        return FunSpec
            .builder("GDNativeInit")
            .addAnnotation(
                AnnotationSpec
                    .builder(ClassName("kotlin.native", "CName"))
                    .addMember("%S", "godot_gdnative_init")
                    .build()
            )
            .addParameter("options", ClassName("godot.gdnative", "godot_gdnative_init_options"))
            .addStatement("%T.init(options)", ClassName("godot.core", "Godot"))
            .build()
    }

    private fun generateGDNativeTerminateFunction(): FunSpec {
        return FunSpec
            .builder("GDNativeTerminate")
            .addAnnotation(
                AnnotationSpec
                    .builder(ClassName("kotlin.native", "CName"))
                    .addMember("%S", "godot_gdnative_terminate")
                    .build()
            )
            .addParameter("options", ClassName("godot.gdnative", "godot_gdnative_terminate_options"))
            .addStatement("%T.terminate(options)", ClassName("godot.core", "Godot"))
            .build()
    }

    private fun generateGDNativeScriptTerminateFunction(): FunSpec {
        return FunSpec
            .builder("NativeScriptTerminate")
            .addAnnotation(
                AnnotationSpec
                    .builder(ClassName("kotlin.native", "CName"))
                    .addMember("%S", "godot_nativescript_terminate")
                    .build()
            )
            .addParameter("handle", ClassName("kotlinx.cinterop", "COpaquePointer"))
            .addStatement("%T.nativescriptTerminate(handle)", ClassName("godot.core", "Godot"))
            .build()
    }
}
