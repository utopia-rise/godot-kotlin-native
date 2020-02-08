import com.beust.klaxon.Klaxon
import com.squareup.kotlinpoet.*
import java.io.File
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy

const val GODOT_API_PATH = "../../wrapper/lib/godot_headers/api.json"
const val WRAPPER_LIBRARY_SOURCE_PATH = "../../wrapper/godot-library/src"
const val GENERATED_PATH_SUFFIX = "kotlin/godot/generated/"

fun main() {
    val classes: List<Class> = Klaxon().parseArray(File(GODOT_API_PATH).readText())!!

    val tree = classes.buildTree()

    GeneratorTarget.values().forEach { target ->
        generateSourceForTarget(target, classes, tree)
    }
}

private fun generateSourceForTarget(target: GeneratorTarget, classes: List<Class>, tree: Graph<Class>) {
    val generatedPath = "$WRAPPER_LIBRARY_SOURCE_PATH/${target.sourceSetName}/$GENERATED_PATH_SUFFIX"

    val icalls = mutableSetOf<ICall>()

    classes.forEach { clazz ->
        clazz.generate(target, generatedPath, tree, icalls)
    }

    when (target) {
        GeneratorTarget.Native -> {
            val iCallFileSpec = FileSpec
                    .builder("godot.icalls", "__icalls")
                    .addFunction(generateICallsVarargsFunction())
                    .addImport("kotlinx.cinterop", "set", "get")
                    .addImport("godot.core", "getRawMemory")
                    .addImport("godot.core", "String")

            icalls.forEach { iCallFileSpec.addFunction(it.iCallSpec) }

            val icallsFile = File(generatedPath)
            icallsFile.parentFile.mkdirs()

            iCallFileSpec
                    .build()
                    .writeTo(icallsFile)
        }
        else -> Unit
    }
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
                            |    for ((i,arg) in arguments.withIndex()) args[i] = %N.from(arg).nativeValue.ptr
                            |    val result = %M(mb, inst, args, arguments.size, null)
                            |    for (i in arguments.indices) %M(args[i])
                            |    return %N(result)
                            |}
                            |""".trimMargin(),
                    MemberName("kotlinx.cinterop", "memScoped"),
                    MemberName("kotlinx.cinterop", "allocArray"),
                    ClassName("kotlinx.cinterop", "CPointerVar"),
                    MemberName("godot.gdnative", "godot_variant"),
                    MemberName("godot.core", "Variant"),
                    MemberName("godot.gdnative", "godot_method_bind_call"),
                    MemberName("godot.gdnative", "godot_variant_destroy"),
                    MemberName("godot.core", "Variant")
            )
            .build()
}
