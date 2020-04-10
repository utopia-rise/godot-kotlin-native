package godot.entrygenerator.filebuilder

import com.squareup.kotlinpoet.*
import java.io.File

class EntryFileBuilder {
    private val entryFileSpec = FileSpec
        .builder("godot", "Entry")
        .addImport("kotlinx.cinterop", "get") //needed for getting pointers like this: args[<number>]
        .addImport("kotlinx.cinterop", "ptr") //needed for getting pointers to `this`: options.ptr
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
        .addStatement("%M(handle)", MemberName("godot.gdnative", "godot_wrapper_nativescript_init"))


    fun binding(bindingAction: FileSpec.Builder.() -> Unit): EntryFileBuilder {
        bindingAction(entryFileSpec)
        return this
    }

    fun bindingRegistration(bindingRegistrationAction: FunSpec.Builder.() -> Unit): EntryFileBuilder {
        bindingRegistrationAction(nativeScriptInitFunctionSpec)
        return this
    }

    fun build(outputPath: String) {
        entryFileSpec.build().writeTo(File(outputPath))
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
            .addStatement("%M(options.ptr)", MemberName("godot.gdnative", "godot_wrapper_gdnative_init"))
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
            .addStatement("%M(options.ptr)", MemberName("godot.gdnative", "godot_wrapper_gdnative_terminate"))
            .build()
    }
}