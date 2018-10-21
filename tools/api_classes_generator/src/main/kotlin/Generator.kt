import com.beust.klaxon.Klaxon
import java.io.File


fun main(args: Array<String>) {
    val GODOT_API_PATH = "godot_api.json"
    val GENERATED_PATH = "../../wrapper/godot-library/src/main/kotlin/godot/generated/"

    val text = File(GODOT_API_PATH).readText()

    val classes = Klaxon().parseArray<Class>(text)!!
    val tree = classes.buildTree()
    val icalls = mutableSetOf<ICall>()

    for (cl in classes)
        //if (cl.name == "Object" || cl.name == "Node" || cl.name == "Reference" || cl.name == "Resource" || cl.name == "ResourceLoader" || cl.name == "SceneTree" || cl.name == "MainLoop" || cl.name == "Script" || cl.name == "Viewport") // FIXME: remove line
        cl.generate(GENERATED_PATH, tree, icalls)


    val icallsFile = File("$GENERATED_PATH/__icalls.kt")
    icallsFile.parentFile.mkdirs()
    icallsFile.createNewFile()

    icallsFile.writeText(buildString {
        appendln("@file:Suppress(\"unused\", \"ClassName\", \"EnumEntryName\", \"FunctionName\", \"SpellCheckingInspection\", \"PackageDirectoryMismatch\", \"RedundantExplicitType\")")
        appendln("package godot.icalls")
        appendln()
        appendln("import godot.gdnative.*")
        appendln("import godot.core.*")
        appendln("import godot.*")
        appendln("import kotlinx.cinterop.*")
        appendln()
        appendln()


        appendln("""
internal fun _icall_varargs(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arguments: Array<*>): Variant {
    memScoped {
        val args = allocArray<CPointerVar<godot_variant>>(arguments.size)
        for ((i,arg) in arguments.withIndex())
            args[i] = Variant.from(arg).nativeValue.ptr
        val result = godot_method_bind_call(mb, inst, args, arguments.size, null)
        for (i in arguments.indices)
            godot_variant_destroy(args[i])
        return Variant(result)
    }
}

        """.trimIndent())

        for (icall in icalls)
            append(icall.generate())
    })

/*
    // Prints all virtual methods with non-Unit result type
    for (cl in classes)
        if (cl.isInstanciable)
            for (m in cl.methods)
                if (m.isVirtual && m.returnType != "Unit") {
                    var flag = true

                    for (p in cl.properties)
                        if (p.getter == m.name || p.setter == m.name) {
                            flag = false
                            return
                        }

                    if (flag)
                        println("${cl.name}: ${m.name} of type ${m.returnType}")
                }
*/
/*
    // Invalid getters ans setters
    for (cl in classes)
        for (m in cl.methods)
            props@ for (p in cl.properties) {
                if ((m.name == p.getter && (m.returnType == "Unit" || m.arguments.size > 1 || (m.arguments.size == 1 && m.arguments[0].type != "Int"))) ||
                        (m.name == p.setter && (m.returnType != "Unit" || m.arguments.size > 2 || (m.arguments.size == 2 && m.arguments[0].type != "Int")))) {
                    println("${cl.name}: ${m.name} of type ${m.returnType}")
                    break@props
                }
            }
*/
}