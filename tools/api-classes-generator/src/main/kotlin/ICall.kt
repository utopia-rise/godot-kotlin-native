import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy

class ICall(
        var returnType: String,
        private val arguments: List<Argument>
) {
    private val returnTypeClass = createReturnTypeClass()
    val name: String = createICallName()
    val iCallSpec by lazy {
        generateICall()
    }

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

    private fun createReturnTypeClass() = ClassName(
            if (returnType.isEnum()) "kotlin" else returnType.getPackage(),
            if (returnType.isEnum()) "Long" else returnType
    )

    private fun generateICall(): FunSpec {
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
        val isPrimitive = returnType.isPrimitive()

        addReturnTypeForICall(shouldReturn, spec, isPrimitive)
        generateICallMethodBlock(shouldReturn, isPrimitive, spec)

        return spec.build()
    }

    private fun generateICallMethodBlock(shouldReturn: Boolean, isPrimitive: Boolean, spec: FunSpec.Builder) {
        val codeBlockBuilder = CodeBlock
                .builder()
                .add("%M {\n", MemberName("kotlinx.cinterop", "memScoped"))

        if (shouldReturn) {
            if (isPrimitive) {
                codeBlockBuilder.add(
                        "    val retVar = %M<%T>()\n",
                        MemberName("kotlinx.cinterop", "alloc"),
                        ClassName("kotlinx.cinterop", "${returnType}Var")
                )
            } else {
                codeBlockBuilder.add(
                        "    val retVar = %M<%T>(8)\n",
                        MemberName("kotlinx.cinterop", "allocArray"),
                        ClassName("kotlinx.cinterop", "ByteVar")
                )
            }
        }

        codeBlockBuilder
                .add(
                        "    val args = %M<%T>(${arguments.size + 1})\n",
                        MemberName("kotlinx.cinterop", "allocArray"),
                        ClassName("kotlinx.cinterop", "COpaquePointerVar")
                )
                .add(
                        buildString {
                            arguments.withIndex().forEach {
                                val i = it.index
                                appendln("    args[$i] = arg$i${if (it.value.nullable) "?.getRawMemory(memScope)" else ".getRawMemory(memScope)"}\n")
                            }
                        }
                )
                .add("    args[${arguments.size}] = null\n")

        if (shouldReturn) {
            if (isPrimitive) {
                codeBlockBuilder.add(
                        "    %M(mb, inst, args, retVar.%M)\n",
                        MemberName("godot.gdnative", "godot_method_bind_ptrcall"),
                        MemberName("kotlinx.cinterop", "ptr")
                )
                codeBlockBuilder.add(
                        "    ret = retVar.%M\n",
                        MemberName("kotlinx.cinterop", "value")
                )
            } else {
                codeBlockBuilder.add(
                        "    %M(mb, inst, args, retVar)\n",
                        MemberName("godot.gdnative", "godot_method_bind_ptrcall")
                )
                codeBlockBuilder.add(
                        "    ret = %T(retVar)\n",
                        returnTypeClass
                )
            }
        } else {
            codeBlockBuilder.add(
                    "    %M(mb, inst, args, null)\n",
                    MemberName("godot.gdnative", "godot_method_bind_ptrcall")
            )
        }

        codeBlockBuilder.add("}\n")

        if (shouldReturn) {
            codeBlockBuilder.add("return ret")
        }

        spec.addCode(codeBlockBuilder.build())
    }

    private fun addReturnTypeForICall(shouldReturn: Boolean, spec: FunSpec.Builder, isPrimitive: Boolean) {
        if (shouldReturn) {
            spec.returns(returnTypeClass)
            if (isPrimitive) {
                spec.addStatement("var ret: %N = ${returnType.defaultValue()}", returnTypeClass.simpleName)
            } else {
                spec.addStatement("lateinit var ret: %N", returnTypeClass.simpleName)
            }
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

    override fun equals(other: Any?): Boolean {
        if (other !is ICall) return false

        return this.name == other.name
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }
}