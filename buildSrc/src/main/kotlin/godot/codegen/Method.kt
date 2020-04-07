package godot.codegen

import com.beust.klaxon.Json
import com.squareup.kotlinpoet.*


open class Method(
    @Json(name = "name")
    var name: String,
    @Json(name = "return_type")
    var returnType: String,
    @Json(name = "is_virtual")
    val isVirtual: Boolean,
    @Json(name = "has_varargs")
    val hasVarargs: Boolean,
    @Json(name = "arguments")
    val arguments: List<Argument>
) {

    val oldName: String = name

    init {
        if (!isVirtual) {
            name = name.convertToCamelCase()
        }
        returnType = returnType.convertTypeToKotlin()
    }

    var isGetterOrSetter: Boolean = false

    fun generateForMethodsClass(clazz: Class, tree: Graph<Class>, icalls: MutableSet<ICall>): FunSpec {
        // Uncomment to disable method implementation generation
        //if (isGetterOrSetter) return null

        val generatedSignature = generateSignature(
            clazz,
            tree,
            true,
            withDefaultArgs = false
        )
        val generatedFunBuilder = generatedSignature.first
        val callArgumentsAsString = generatedSignature.second

        val shouldReturn = returnType != "Unit"

        if (returnType.isEnum()) {
            val type = returnType.removeEnumPrefix()
            if (type.contains('.')) {
                clazz.additionalImports.add(returnType.getPackage() to type.split('.')[0])
            }
        }

        if (!isVirtual) {
            val constructedICall = constructICall(callArgumentsAsString, icalls)
            generatedFunBuilder.addStatement(
                "%L%L%M%L%L",
                if (shouldReturn) "return " else "",
                if (returnType.isEnum()) {
                    "${returnType.removeEnumPrefix()}.fromInt( "
                } else if (hasVarargs && returnType != "Variant" && returnType != "Unit") {
                    "$returnType from "
                } else {
                    ""
                },
                MemberName("godot.icalls", constructedICall.first),
                constructedICall.second,
                if (returnType.isEnum()) ")" else ""
            )
        } else {
            if (shouldReturn) {
                generateThrowExceptionStatement(generatedFunBuilder, clazz)
            }
        }
        return generatedFunBuilder.build()
    }

    fun generateForClassImpl(clazz: Class, tree: Graph<Class>): FunSpec {
        val funBuilder = generateSignature(clazz, tree, false, withDefaultArgs = false)
            .first
            .addModifiers(KModifier.OVERRIDE)
        val shouldReturn = returnType != "Unit"
        if (!isVirtual) {
            funBuilder.addStatement(
                "%L%M(pointer%L)",
                if (shouldReturn) "return " else "",
                MemberName("godot", "${clazz.name}Methods.$name"),
                buildString {
                    arguments.withIndex().forEach {
                        append(", ${it.value.name}")
                    }
                }
            )
        } else {
            if (shouldReturn) {
                generateThrowExceptionStatement(funBuilder, clazz)
            }
        }
        return funBuilder.build()
    }

    fun generateForInterface(clazz: Class, tree: Graph<Class>) =
        generateSignature(clazz, tree, false, withDefaultArgs = true).first.addModifiers(KModifier.ABSTRACT).build()

    private fun generateSignature(clazz: Class, tree: Graph<Class>, withPointer: Boolean, withDefaultArgs: Boolean): Pair<FunSpec.Builder, String> {
        val modifiers = mutableListOf<KModifier>()

//        if (!clazz.isSingleton) {
//            modifiers.add(getModifier(tree, clazz))
//        }

        val generatedFunBuilder = FunSpec
            .builder(name)
            .addModifiers(modifiers)

        if (returnType != "Unit") {
            generatedFunBuilder.returns(ClassName(returnType.getPackage(), returnType.removeEnumPrefix()))
        }


        if (withPointer) {
            generatedFunBuilder.addParameter("pointer", ClassName("kotlinx.cinterop", "COpaquePointer"))
        }

        //TODO: move adding arguments to generatedFunBuilder to separate function
        val callArgumentsAsString = buildCallArgumentsString(
            tree,
            clazz,
            generatedFunBuilder,
            withDefaultArgs
        ) //cannot be inlined as it also adds the arguments to the generatedFunBuilder

        if (hasVarargs) {
            generatedFunBuilder.addParameter(
                "__var_args",
                Any::class.asTypeName().copy(nullable = true),
                KModifier.VARARG
            )
        }

        return generatedFunBuilder to callArgumentsAsString
    }

    private fun buildCallArgumentsString(tree: Graph<Class>, cl: Class, generatedFunBuilder: FunSpec.Builder, withDefaultArgs: Boolean): String {
        return buildString {
            arguments.withIndex().forEach {
                val index = it.index
                val argument = it.value

                if (index != 0 || !hasVarargs) append(", ")

                val sanitisedName = tree.getSanitisedArgumentName(this@Method, index, cl)
                append(sanitisedName)

                if (argument.type.isEnum()) append(".id")

                val parameterBuilder = ParameterSpec.builder(
                    argument.name,
                    ClassName(
                        argument.type.getPackage(),
                        argument.type.removeEnumPrefix()
                    ).copy(nullable = argument.nullable)
                )

                if (withDefaultArgs && argument.applyDefault != null) parameterBuilder.defaultValue(argument.applyDefault)

                generatedFunBuilder.addParameter(parameterBuilder.build())
            }
            if (hasVarargs && !isEmpty()) append(", ")
        }
    }

    private fun getModifier(tree: Graph<Class>, cl: Class) =
        if (tree.doAncestorsHaveMethod(cl, this)) {
            KModifier.OVERRIDE
        } else {
            KModifier.OPEN
        }


    private fun constructICall(methodArguments: String, icalls: MutableSet<ICall>): Pair<String, String> {
        if (hasVarargs) return "_icall_varargs" to "( ${name}MethodBind, pointer, arrayOf($methodArguments*__var_args))"

        val icall = ICall(returnType, arguments)
        icalls.add(icall)
        return icall.name to "( ${name}MethodBind, pointer$methodArguments)"
    }

    private fun generateThrowExceptionStatement(funBuilder: FunSpec.Builder, clazz: Class) {
        funBuilder.addStatement(
            "%L %T(%S)",
            "throw",
            NotImplementedError::class,
            "$oldName is not implemented for ${clazz.name}"
        )
    }
}