package godot.tools.entry_generator.model

import com.beust.klaxon.Json


class Class(
        @Json(name = "name")
        val name: String,
        @Json(name = "extends")
        val parent: String = "Object",
        @Json(name = "class")
        val classPath: String = name,
        @Json(name = "tool")
        val isToolClass: Boolean = false,
        @Json(name = "methods")
        var methods: List<Method> = listOf(),
        @Json(name = "properties")
        val properties: List<Property> = listOf(),
        @Json(name = "signals")
        val signals: List<Signal> = listOf()
) {
    var packageName = ""

    init {
        if (methods.find { m -> m.name == "__yieldSignalListener" } != null)
            error("Method __yieldSignalListener in class $name: reserved method name, choose another")

        methods += Method("__yieldSignalListener", "Unit", true, listOf("Variant"))
    }


    fun generate(bindings: MutableList<String>, bridges: MutableList<String>): String {
        val bindID = bindings.size
        val bridgeID = bridges.size

        bindings.add("""
private fun udcBinding${bindID}Constructor(): $classPath = $classPath()
private val udcBinding$bindID = ::udcBinding${bindID}Constructor
    """.trimIndent())

        bridges.add("""
private fun udcBridge$bridgeID(): CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>> {
    return staticCFunction { mem -> constructFromRawMem(mem, udcBinding$bindID) }
}
    """.trimIndent())
        bridges.add("""
private fun udcBridge${bridgeID + 1}(): CPointer<CFunction<(COpaquePointer?) -> Unit>> {
    return staticCFunction { mem -> deconstructFromRawMem<$classPath>(mem) }
}
    """.trimIndent())

        return "    registerClass(\"$classPath\", \"$parent\", udcBridge$bridgeID(), udcBridge${bridgeID + 1}())"
    }


    fun generateMethods(bridges: MutableList<String>): String {
        return buildString {
            val generated = mutableSetOf<String>()

            for (m in methods) {
                if (generated.contains(m.name))
                    continue


                val bridgeID = bridges.size
                val bridge = StringBuilder().appendln("""
private fun udcBridge$bridgeID(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<$classPath>("${m.name}", r, o, n, a) { obj, numArgs, args -> run {
        """.trimIndent())


                if (m.isVararg) {
                    if (methods.count { method -> m.name == method.name } > 1)
                        error("Method ${m.name} in $classPath has multiple declarations, denied using with varargs")

                    bridge.append(m.generate())
                } else {
                    bridge.appendln("        when (numArgs) {")

                    val paramsCount = mutableListOf<Int>()
                    for (method in methods.filter { method -> m.name == method.name }) {
                        if (paramsCount.indexOf(method.arguments.size) != -1)
                            error("Method ${m.name} in $classPath has multiple declarations with ${method.arguments.size} parameters.")

                        paramsCount.add(method.arguments.size)
                        bridge.append(method.generate())
                    }
                    paramsCount.clear()

                    bridge.appendln("            else -> noMethodToInvoke(\"${m.name}\", \"$classPath\", numArgs)")
                    bridge.appendln("        }")
                    bridge.appendln("        return@run null")
                }


                bridge.appendln("""
    }}}
}
                """.trimIndent())

                bridges.add(bridge.toString())
                appendln("    registerMethod(\"$classPath\", \"${m.name}\", udcBridge$bridgeID())")

                generated.add(m.name)
            }

            generated.clear()
        }
    }


    fun generateProperties(bridges: MutableList<String>): String {
        return buildString {
            for (p in properties)
                appendln(p.generate(classPath, bridges))
        }
    }


    fun generateSignals(): String {
        return buildString {
            for (s in signals)
                appendln(s.generate(classPath))
        }
    }
}