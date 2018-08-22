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

        if (name.indexOf("/") != -1 || type.indexOf(",") != -1) // TODO: idk what to do
            name = ""
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
                if (method.arguments.size == 1 && method.arguments[0].type != "Int")
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
                if (method.arguments.size == 2 && method.arguments[0].type != "Int")
                    return

                validSetter = method
                hasValidSetter = true
                method.isGetterOrSetter = true
            }
        }
    }


    fun generate(prefix: String, cl: Class, tree: Graph<Class>, icalls: MutableSet<ICall>): String {
        if (name == "")
            return ""
        if (!hasValidGetter && !hasValidSetter)
            return ""

        return buildString {
            if (index == -1) {
                append("$prefix    ")
                if (tree.doAncestorsHaveProperty(cl, this@Property))
                    append("override ")
                else
                    append("open ")
                appendln("${if (hasValidSetter) "var" else "val"} $name: $type")

                if (hasValidGetter) {
                    val icall = ICall(type, listOf())
                    icalls.add(icall)
                    appendln("$prefix        get() = ${icall.name}(${validGetter.name}MethodBind, this.rawMem())")
                }
                else
                    appendln("$prefix        get() = throw UninitializedPropertyAccessException(\"Cannot access property $name: has no getter\")")

                if (hasValidSetter) {
                    val icall = ICall("Unit", listOf(Argument("value", type)))
                    icalls.add(icall)
                    appendln("$prefix        set(value) = ${icall.name}(${validSetter.name}MethodBind, this.rawMem(), value)")
                }

                appendln()
                appendln()
            }
        }
    }
}