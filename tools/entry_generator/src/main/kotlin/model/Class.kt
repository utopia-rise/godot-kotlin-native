package model

import com.beust.klaxon.Json


class Class(
        @Json(name = "name")
        val name: String,
        @Json(name = "extends")
        val parent: String = "Object",
        @Json(name = "tool")
        val isToolClass: Boolean = false,
        @Json(name = "methods")
        val methods: List<Method> = listOf(),
        @Json(name = "properties")
        val properties: List<Property> = listOf(),
        @Json(name = "signals")
        val signals: List<Signal> = listOf()
) {
    fun generate(bindings: MutableList<String>, bridges: MutableList<String>): String {
        val bindID = bindings.size
        val bridgeID = bridges.size

        bindings.add("""
private fun udcBinding${bindID}Constructor(): $name = $name()
private val udcBinding$bindID = ::udcBinding${bindID}Constructor
    """.trimIndent())

        bridges.add("""
private fun udcBridge$bridgeID(): CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>> {
    return staticCFunction { mem -> constructFromRawMem(mem, udcBinding$bindID) }
}
    """.trimIndent())
        bridges.add("""
private fun udcBridge${bridgeID + 1}(): CPointer<CFunction<(COpaquePointer?) -> Unit>> {
    return staticCFunction { mem -> deconstructFromRawMem<$name>(mem) }
}
    """.trimIndent())

        return "    registerClass(\"$name\", \"$parent\", udcBridge$bridgeID(), udcBridge${bridgeID + 1}())"
    }


    fun generateMethods(bridges: MutableList<String>): String {
        return buildString {
            val generated = mutableListOf<String>()

            for (m in methods) {
                if (generated.indexOf(m.name) != -1)
                    continue


                val bridgeID = bridges.size
                val bridge = StringBuilder().append("""
private fun udcBridge$bridgeID(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<$name>("${m.name}", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {

            """.trimIndent())


                val paramsCount = mutableListOf<Int>()
                for (method in methods.filter { method -> m.name == method.name }) {
                    if (paramsCount.find { i -> i == method.arguments.size } != null)
                        error("Method ${m.name} in $name has multiple declarations with ${method.arguments.size} parameters.")
                    paramsCount.add(method.arguments.size)

                    bridge.append(method.generate())
                }
                paramsCount.clear()


                bridge.append("""
            else -> noMethodToInvoke("${m.name}", "$name", numArgs)
        }
        return@run null }}
    }
}
            """.trimIndent())
                bridges.add(bridge.toString())
                appendln("    registerMethod(\"$name\", \"${m.name}\", udcBridge$bridgeID())")

                generated.add(m.name)
            }

            generated.clear()
        }
    }


    fun generateProperties(bridges: MutableList<String>): String {
        return buildString {
            for (p in properties)
                appendln(p.generate(name, bridges))
        }
    }


    fun generateSignals(): String {
        return buildString {
            for (s in signals)
                appendln(s.generate(name))
        }
    }
}