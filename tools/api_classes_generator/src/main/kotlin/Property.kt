import com.beust.klaxon.Json


class Property(
        @Json(name = "name")
        var name: String,
        @Json(name = "type")
        var type: String,
        @Json(name = "getter")
        var getter: String,
        @Json(name = "setter")
        var setter: String,
        @Json(name = "index")
        val index: Int
) {
    var hasValidGetter: Boolean = false
    lateinit var validGetter: Method

    var hasValidSetter: Boolean = false
    lateinit var validSetter: Method

    init {
        name = name.convertToCamelCase()
        type = type.convertTypeToKotlin()

        getter = getter.convertToCamelCase()
        setter = setter.convertToCamelCase()

        name = name.replace('/', '_')

        // There are property with multiple types, and it's all Materials, so
        // Godot's developer should make more strict API
        if (type.indexOf(",") != -1)
            type = "Material"
    }


    fun applyGetterOrSetter(method: Method) {
        if (name == "")
            return

        when (method.name) {
            getter -> {
                if (method.returnType == "Unit" || method.arguments.size > 1 || method.isVirtual)
                    return
                if (index == -1 && method.arguments.size == 1)
                    return
                if (method.arguments.size == 1 && method.arguments[0].type != "Long")
                    return

                validGetter = method
                hasValidGetter = true
                method.isGetterOrSetter = true
            }
            setter -> {
                if (method.returnType != "Unit" || method.arguments.size > 2 || method.isVirtual)
                    return
                if (index == -1 && method.arguments.size == 2)
                    return
                if (method.arguments.size == 2 && method.arguments[0].type != "Long")
                    return

                validSetter = method
                hasValidSetter = true
                method.isGetterOrSetter = true
            }
        }
    }


    fun generate(prefix: String, cl: Class, tree: Graph<Class>, icalls: MutableSet<ICall>): String {
        if (!hasValidGetter && !hasValidSetter)
            return ""

        // Sorry for this, CPUParticles has "scale" property overrides ancestor's "scale", but mismatches type
        if (cl.name == "CPUParticles" && name == "scale")
            name = "_scale"


        return buildString {
            append("$prefix    ")
            if (!cl.isSingleton)
                if (tree.doAncestorsHaveProperty(cl, this@Property))
                    append("override ")
                else
                    append("open ")
            appendln("${if (hasValidSetter) "var" else "val"} $name: $type")

            if (hasValidGetter) {
                val icall = if (index != -1)
                    ICall(type, listOf(Argument("idx", "Long")))
                else
                    ICall(type, listOf())

                icalls.add(icall)
                append("$prefix        get() = ${icall.name}(${validGetter.name}MethodBind, this.rawMemory")
                if (index != -1)
                    append(", $index")
                appendln(')')
            }
            else
                appendln("$prefix        get() = throw UninitializedPropertyAccessException(\"Cannot access property $name: has no getter\")")

            if (hasValidSetter) {
                val icall = if (index != -1)
                    ICall("Unit", listOf(Argument("idx", "Long"), Argument("value", type)))
                else
                    ICall("Unit", listOf(Argument("value", type)))

                icalls.add(icall)
                append("$prefix        set(value) = ${icall.name}(${validSetter.name}MethodBind, this.rawMemory")
                if (index != -1)
                    append(", $index")
                appendln(", value)")


                if (type.isCoreTypeAdaptedForKotlin()) {
                    append("$prefix    ")
                    if (!cl.isSingleton)
                        if (tree.doAncestorsHaveProperty(cl, this@Property))
                            append("override ")
                        else
                            append("open ")
                    appendln("fun $name(shedule: ($type) -> Unit): $type = $name.apply {")
                    appendln("$prefix        shedule(this)")
                    appendln("$prefix        $name = this")
                    appendln("$prefix    }")
                }
            }

            appendln()
            appendln()
        }
    }
}