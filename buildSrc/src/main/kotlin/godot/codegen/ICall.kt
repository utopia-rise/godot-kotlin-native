package godot.codegen

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy

class ICall(
    var returnType: String,
    private val arguments: List<Argument>
) {
    private val returnTypeClass = createReturnTypeClass()
    val name: String = createICallName()

    init {
        if (returnType.isEnum()) returnType = "Long"
    }

    private fun createICallName(): String {
        return buildString {
            append("_icall_${if (returnType.isEnum()) "Long" else returnType}")

            for (arg in arguments) {
                append('_')

                if (arg.nullable) {
                    append('n')
                }

                append(arg.type.convertTypeForICalls())
            }
        }
    }

    private fun createReturnTypeClass() = if (returnType == "VariantArray") {
        ClassName(
            returnType.getPackage(),
            returnType
        )
    } else {
        ClassName(
            if (returnType.isEnum()) "kotlin" else returnType.getPackage(),
            if (returnType.isEnum()) "Long" else returnType
        )
    }

    infix fun generateICall(tree: Graph<Class>): FunSpec {
        val spec = FunSpec
            .builder(name)
            .addModifiers(KModifier.INTERNAL)
            .addParameter(
                ParameterSpec(
                    "mb",
                    ClassName("kotlinx.cinterop", "CPointer")
                        .parameterizedBy(ClassName("godot.gdnative", "godot_method_bind"))
                )
            )
            .addParameter("inst", ClassName("kotlinx.cinterop", "COpaquePointer"))

        addArgumentsToICall(spec)


        val shouldReturn = returnType != "Unit"

        addReturnTypeForICall(shouldReturn, spec)
        generateICallMethodBlock(shouldReturn, spec, tree)

        return spec.build()
    }

    private fun generateICallMethodBlock(shouldReturn: Boolean, spec: FunSpec.Builder, tree: Graph<Class>) {
        val codeBlockBuilder = CodeBlock.builder()

        val isPrimitive = returnType.isPrimitive()

        if (shouldReturn) {
            if (isPrimitive) {
                spec.addStatement("var ret: %T = ${returnType.defaultValue()}", returnTypeClass)
                codeBlockBuilder.add("%M {\n", MemberName("kotlinx.cinterop", "memScoped"))
            } else {
                codeBlockBuilder.add("val ret = %M {\n", MemberName("kotlinx.cinterop", "memScoped"))
            }
        } else {
            codeBlockBuilder.add("%M {\n", MemberName("kotlinx.cinterop", "memScoped"))
        }

        if (shouldReturn) {
            if (isPrimitive) {
                codeBlockBuilder.add(
                    "    val retVar = %M<%T>()\n",
                    MemberName("kotlinx.cinterop", "alloc"),
                    ClassName(
                        if (returnType == "RealT") "godot.internal.type" else "kotlinx.cinterop",
                        "${returnType}Var"
                    )
                )
            } else {
                codeBlockBuilder.add(
                    "    val retVar = %M<%T>().ptr\n",
                    MemberName("kotlinx.cinterop", "alloc"),
                    if (returnType.isCoreType()) {
                        ClassName("godot.gdnative", "godot_${returnType.convertToSnakeCase()}")
                    }
                    else ClassName("kotlinx.cinterop", "COpaquePointerVar")
                )
            }
        }

        codeBlockBuilder.add(
                "    val args = %M<%T>(${arguments.size + 1})\n",
                MemberName("kotlinx.cinterop", "allocArray"),
                ClassName("kotlinx.cinterop", "COpaquePointerVar")
            )
        arguments.withIndex().forEach {
            val i = it.index
            val value = it.value
            val nullInstruction = if (value.nullable) "?" else ""
            when {
                value.type == "String" -> {
                    codeBlockBuilder.add(
                        "    args[$i] = arg$i$nullInstruction.%M()$nullInstruction.value$nullInstruction.ptr\n",
                        MemberName("godot.core", "toGDString")
                    )
                }
                value.type == "VariantArray" || value.type == "Variant" -> {
                    codeBlockBuilder.add(
                        "    args[$i] = arg$i$nullInstruction._handle$nullInstruction.ptr\n"
                    )
                }
                value.type.isCoreType() -> {
                    codeBlockBuilder.add(
                        "    args[$i] = arg$i$nullInstruction.getRawMemory(this)\n"
                    )
                }
                value.type.isPrimitive() -> {
                    codeBlockBuilder.add(
                        "    args[$i] = arg$i.%M(this)\n",
                        MemberName("godot.internal.type", "getRawMemory")
                    )
                }
                else -> {
                    codeBlockBuilder.add(
                        "    args[$i] = arg$i$nullInstruction.ptr\n"
                    )
                }
            }
        }
        codeBlockBuilder.add("    args[${arguments.size}] = null\n")

        if (shouldReturn) {
            if (isPrimitive) {
                codeBlockBuilder.add(
                    "    %T.gdnative.godot_method_bind_ptrcall!!.%M(mb, inst, args, retVar.%M)\n",
                    ClassName("godot.core", "Godot"),
                    MemberName("kotlinx.cinterop", "invoke"),
                    MemberName("kotlinx.cinterop", "ptr")
                )
                destroyStringArgs(codeBlockBuilder)
                codeBlockBuilder.add(
                    "    ret = retVar.%M\n",
                    MemberName("kotlinx.cinterop", "value")
                )
            } else {
                codeBlockBuilder.add(
                    "    %T.gdnative.godot_method_bind_ptrcall!!.%M(mb, inst, args, retVar)\n",
                    ClassName("godot.core", "Godot"),
                    MemberName("kotlinx.cinterop", "invoke")
                )
                destroyStringArgs(codeBlockBuilder)
                val returnTypeClassSimpleName = returnTypeClass.simpleName

                when {
                    tree.isObjectOrItsChild(returnTypeClassSimpleName) -> {
                        val typeManagerClass = ClassName("godot.core", "TypeManager")
                        if (returnTypeClassSimpleName != "Object") {
                            codeBlockBuilder.add(
                                "    %M(retVar) as %T\n",
                                MemberName(typeManagerClass, "wrap"),
                                returnTypeClass
                            )
                        } else {
                            codeBlockBuilder.add(
                                "    %M(retVar)\n",
                                MemberName(typeManagerClass, "wrap")
                            )
                        }
                    }

                    returnTypeClassSimpleName == "String" -> {
                        codeBlockBuilder.add(
                            "    %M(retVar).toKString()\n",
                            MemberName("godot.core", "String")
                        )
                    }

                    else -> {
                        codeBlockBuilder.add(
                            "    %T(retVar)\n",
                            returnTypeClass
                        )
                    }
                }
            }
        } else {
            codeBlockBuilder.add(
                "    %T.gdnative.godot_method_bind_ptrcall!!.%M(mb, inst, args, null)\n",
                ClassName("godot.core", "Godot"),
                MemberName("kotlinx.cinterop", "invoke")
            )
            destroyStringArgs(codeBlockBuilder)
        }

        codeBlockBuilder.add("}\n")

        if (shouldReturn) {
            codeBlockBuilder.add("return ret")
        }

        spec.addCode(codeBlockBuilder.build())
    }

    private fun addReturnTypeForICall(shouldReturn: Boolean, spec: FunSpec.Builder) {
        if (shouldReturn) {
            spec.returns(returnTypeClass)
        }
    }

    private fun addArgumentsToICall(spec: FunSpec.Builder) {
        arguments.withIndex().forEach {
            val argument = it.value
            val argumentTypeAsString = argument.type.convertTypeForICalls()
            var argumentType: TypeName = ClassName(argumentTypeAsString.getPackage(), argumentTypeAsString)

            if (argument.nullable) {
                argumentType = argumentType.copy(nullable = true)
            }

            spec.addParameter("arg${it.index}", argumentType)
        }
    }

    private fun destroyStringArgs(codeBlockBuilder: CodeBlock.Builder) = arguments.withIndex().forEach {
        if (it.value.type == "String") {
            codeBlockBuilder.add(
                "    %M(args[${it.index}]!!).destroy(this)\n",
                MemberName("godot.core", "String")
            )
        }
    }

    override fun equals(other: Any?): Boolean {
        if (other !is ICall) return false

        return this.name == other.name
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }
}
