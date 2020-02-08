import com.beust.klaxon.Json
import com.squareup.kotlinpoet.*


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
        if (type.indexOf(",") != -1) {
            type = "Material"
        }
    }

    fun generate(target: GeneratorTarget, clazz: Class, tree: Graph<Class>, icalls: MutableSet<ICall>): PropertySpec? {
        if (!target.implementation) return null
        if (!hasValidGetter && !hasValidSetter) return null

        if (hasValidGetter && !validGetter.returnType.isEnum() && type != validGetter.returnType) {
            type = validGetter.returnType
        }

        // Sorry for this, CPUParticles has "scale" property overrides ancestor's "scale", but mismatches type
        if (clazz.name == "CPUParticles" && name == "scale") name = "_scale"

        val modifiers = mutableListOf<KModifier>()
        if (!clazz.isSingleton) {
            modifiers.add(if (tree.doAncestorsHaveProperty(clazz, this)) KModifier.OVERRIDE else KModifier.OPEN)
        }

        val propertyType = ClassName(type.getPackage(), type)
        val propertySpecBuilder = PropertySpec
                .builder(
                        name,
                        propertyType,
                        modifiers
                )

        if (hasValidSetter) {
            propertySpecBuilder.mutable()
            val icall = if (index != -1) {
                ICall("Unit", listOf(Argument("idx", "Long"), Argument("value", type)))
            } else {
                ICall("Unit", listOf(Argument("value", type)))
            }
            icalls.add(icall)
            propertySpecBuilder.setter(
                    FunSpec.setterBuilder()
                            .addParameter("value", propertyType)
                            .addStatement(
                                    "%M(${validSetter.name}MethodBind, this.rawMemory${if (index != -1) ", $index, value)" else ", value)"}",
                                    MemberName("godot.icalls", icall.name))
                            .build()
            )
        }

        if (hasValidGetter) {
            val icall = if (index != -1) {
                ICall(type, listOf(Argument("idx", "Long")))
            } else {
                ICall(type, listOf())
            }
            icalls.add(icall)
            propertySpecBuilder.getter(
                    FunSpec.getterBuilder()
                            //Hard to maintain but do not see how to do better (Pierre-Thomas Meisels)
                            .addStatement(
                                    "return %M(${validGetter.name}MethodBind, this.rawMemory${if (index != -1) ", $index)" else ")"}",
                                    MemberName("godot.icalls", icall.name))
                            .build()
            )
        } else {
            propertySpecBuilder.getter(FunSpec.getterBuilder()
                    .addStatement(
                            "%L %T(%S)",
                            "throw",
                            UninitializedPropertyAccessException::class,
                            "Cannot access property $name: has no getter"
                    )
                    .build()
            )
        }

        return propertySpecBuilder.build()
    }

    infix fun applyGetterOrSetter(method: Method) {
        if (name == "") return

        when (method.name) {
            getter -> {
                if (method.returnType == "Unit" || method.arguments.size > 1 || method.isVirtual) return

                if (index == -1 && method.arguments.size == 1) return

                if (method.arguments.size == 1 && method.arguments[0].type != "Long") return

                validGetter = method
                hasValidGetter = true
                method.isGetterOrSetter = true
            }
            setter -> {
                if (method.returnType != "Unit" || method.arguments.size > 2 || method.isVirtual) return

                if (index == -1 && method.arguments.size == 2) return

                if (method.arguments.size == 2 && method.arguments[0].type != "Long") return

                validSetter = method
                hasValidSetter = true
                method.isGetterOrSetter = true
            }
        }
    }
}
