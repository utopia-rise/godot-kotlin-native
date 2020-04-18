package godot.codegen

import com.beust.klaxon.Klaxon
import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import java.io.File


object Generator {

    fun generate(source: File, outputDir: File) {
        val classes: List<Class> = Klaxon().parseArray(source.readText())!!

        val tree = classes.buildTree()
        val icalls = mutableSetOf<ICall>()

        classes.forEach { clazz ->
            clazz.generate(outputDir, tree, icalls)
        }

        val iCallFileSpec = FileSpec
            .builder("godot.icalls", "__icalls")
            .addFunction(generateICallsVarargsFunction())
            .addImport("kotlinx.cinterop", "set", "get")

        icalls.forEach { iCallFileSpec.addFunction(it.generateICall(tree)) }

        outputDir.parentFile.mkdirs()

        iCallFileSpec
            .build()
            .writeTo(outputDir)

        generateEngineTypesRegistration(classes).writeTo(outputDir)
    }

    private fun generateICallsVarargsFunction(): FunSpec {
        return FunSpec
            .builder("_icall_varargs")
            .addModifiers(KModifier.INTERNAL)
            .returns(ClassName("godot.core", "Variant"))
            .addParameter(
                "mb",
                ClassName("kotlinx.cinterop", "CPointer")
                    .parameterizedBy(ClassName("godot.gdnative", "godot_method_bind"))
            )
            .addParameter(
                "inst",
                ClassName("kotlinx.cinterop", "COpaquePointer")
            )
            .addParameter(
                "arguments",
                ClassName("kotlin", "Array").parameterizedBy(STAR)
            )
            .addStatement(
                """%M {
                            |    val args = %M<%T<%M>>(arguments.size)
                            |    for ((i,arg) in arguments.withIndex()) args[i] = %T.wrap(arg).handle.ptr
                            |    val result = %T.gdnative.godot_method_bind_call!!.%M(mb, inst, args, arguments.size, null)
                            |    for (i in arguments.indices) %T.gdnative.godot_variant_destroy!!.%M(args[i])
                            |    return %T(result)
                            |}
                            |""".trimMargin(),
                MemberName("kotlinx.cinterop", "memScoped"),
                MemberName("kotlinx.cinterop", "allocArray"),
                ClassName("kotlinx.cinterop", "CPointerVar"),
                MemberName("godot.gdnative", "godot_variant"),
                ClassName("godot.core", "Variant"),
                ClassName("godot.core", "Godot"),
                MemberName("kotlinx.cinterop", "invoke"),
                ClassName("godot.core", "Godot"),
                MemberName("kotlinx.cinterop", "invoke"),
                ClassName("godot.core", "Variant")
            )
            .build()
    }

    private fun generateEngineTypesRegistration(classes: List<Class>): FileSpec {
        val funBuilder = FunSpec.builder("registerEngineTypes")
            .addModifiers(KModifier.INTERNAL)
            .receiver(ClassName("godot.core", "TypeManager"))

        classes.filter { !it.isSingleton && it.name != "Object"}.forEach {
            funBuilder.addStatement(
                "registerEngineType(%S, ::%T)",
                it.name,
                ClassName(it.name.getPackage(), it.name)
            )
        }
        return FileSpec.builder("godot", "registerEngineTypes")
            .addFunction(
                funBuilder.build()
            )
            .build()
    }
}
