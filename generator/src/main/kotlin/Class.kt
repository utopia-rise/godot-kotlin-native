import com.beust.klaxon.Json
import java.io.File


class Class(
        @Json(name = "name")
        var name: String,
        @Json(name = "base_class")
        var baseClass: String,
        @Json(name = "singleton")
        val isSingleton: Boolean,
        @Json(name = "instanciable")
        val isInstanciable: Boolean,
        @Json(name = "constants")
        val constants: Map<String, Int>,
        @Json(name = "properties")
        val properties: List<Property>,
        @Json(name = "methods")
        val methods: List<Method>,
        @Json(name = "enums")
        val enums: List<Enum>
) {
    val oldName: String = name

    init {
        name = name.escapeUnderscore()
        baseClass = baseClass.escapeUnderscore()
    }


    fun generate(path: String, tree: Graph<Class>, icalls: MutableSet<ICall>) {
        for (p in properties)
            for (m in methods)
                p.applyGetterOrSetter(m)


        val out = File("$path/$name.kt")
        out.parentFile.mkdirs()
        out.createNewFile()

        out.writeText(buildString {
            appendln("@file:Suppress(\"unused\", \"ClassName\", \"EnumEntryName\", \"FunctionName\", \"SpellCheckingInspection\", \"PARAMETER_NAME_CHANGED_ON_OVERRIDE\", \"UnusedImport\", \"PackageDirectoryMismatch\")")
            appendln("package kotlin.godot")
            appendln()
            appendln("import godot.*")
            appendln("import kotlin.godot.core.*")
            appendln("import kotlin.godot.icalls.*")
            appendln("import kotlinx.cinterop.*")
            appendln("import kotlin.godot.registration.getMB")
            appendln("import kotlin.godot.registration.getSingleton")
            appendln("import kotlin.godot.registration.fromVariant")
            appendln()
            appendln()
            appendln("// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG")
            appendln()
            appendln()


            append("open class $name : ").append(if (baseClass == "") "GodotObject" else baseClass).appendln(" {")

            append("    ")
            if (isInstanciable)
                appendln("constructor() : super(\"$name\")")
            else
                appendln("private constructor() : super(\"\")")
            appendln("    constructor(variant: Variant) : super(variant)")
            appendln("    internal constructor(mem: COpaquePointer) : super(mem)")
            appendln("    internal constructor(name: String) : super(name)")
            appendln()
            appendln()


            appendln("    // Enums ")
            appendln()
            for (enum in enums)
                enum.generate(this)
            appendln()
            appendln()


            if (isSingleton)
                append("    @ThreadLocal") // TODO: remove later, fixed in konan master
            appendln("    companion object {")

            append(generateCasts(tree))

            appendln("        // Constants")
            for (constant in constants)
                appendln("        const val ${constant.key}: Int = ${constant.value}")
            appendln()
            appendln()


            if (isSingleton) {
                appendln("        private val rawMemory: COpaquePointer by lazy { getSingleton(\"$name\", \"$oldName\") }")
                appendln("        private fun rawMem(): COpaquePointer = rawMemory")
            } else
                appendln("    }")
            appendln()
            appendln()


            val prefix = if (isSingleton) "    " else ""


            appendln("$prefix    // Properties")
            for (prop in properties)
                append(prop.generate(prefix, this@Class, tree, icalls))
            appendln()
            appendln()


            appendln("$prefix    // Methods")
            for (method in methods)
                append(method.generate(prefix, this@Class, tree, icalls))


            if (isSingleton)
                appendln("    }")
            appendln("}")
        })
    }


    private fun generateCasts(tree: Graph<Class>): String {
        return buildString {
            var node = tree.nodes.find { it.value.name == name }!!.parent

            while (node != null) {
                appendln("        infix fun from(other: ${node.value.name}): $name = $name(\"\").apply { setRawMemory(other.rawMem()) }")
                node = node.parent
            }
            appendln("        infix fun from(other: Variant): $name = fromVariant($name(\"\"), other)")
            appendln()
            appendln()
        }
    }
}