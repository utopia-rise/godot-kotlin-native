package org.godotengine.kotlin.entrygenerator.generator

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import org.godotengine.kotlin.entrygenerator.utils.castFromRawMemory
import org.godotengine.kotlin.entrygenerator.utils.hasVarargParameter
import org.godotengine.kotlin.entrygenerator.utils.isPrimitive
import org.jetbrains.kotlin.descriptors.CallableMemberDescriptor
import org.jetbrains.kotlin.resolve.calls.components.isVararg
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe

/**
 * generates function bindings for registered functions
 * @return FunSpec of registered functionBinding for registration {@link org.godotengine.kotlin.entrygenerator.generator.GDNGDNativeFunctionBindingGenerator#registerElement()}
 */
fun CallableMemberDescriptor.generateFunctionBinding(entryFileSpecBuilder: FileSpec.Builder, index: Int, functionName: String = "functionBridge", fullClassName: String = getFullClassName(this)): FunSpec {
    val bridgeFunction = FunSpec
            .builder("$functionName$index")
            .returns(getBridgeReturnType())
            .addModifiers(KModifier.PRIVATE)
            .addCode(getBridgeFunctionBody(fullClassName))
            .build()

    entryFileSpecBuilder.addFunction(bridgeFunction)

    return bridgeFunction
}

/**
 * helper method which generated the function body for a bridge function depending on the arguments the function has
 */
private fun CallableMemberDescriptor.getBridgeFunctionBody(fullClassName: String): CodeBlock {
    val bridgeFunctionBodyBuilder = CodeBlock.builder()
            .beginControlFlow("return·%M·{·returnValuePointer,·rawObjectPointer,·numberOfArguments,·argumentsPointer·->", MemberName("kotlinx.cinterop", "staticCFunction")) //START: staticCFunction
            .beginControlFlow("%M<$fullClassName>(%S,·returnValuePointer,·rawObjectPointer,·numberOfArguments,·argumentsPointer)·{·obj,·numArgs,·${if (this.valueParameters.size > 0) "args" else "_"}·->", MemberName("godot.registration", "invoke"), this.name) //START: invoke
            .beginControlFlow("run") //START: run

    if (!this.hasVarargParameter()) {
        bridgeFunctionBodyBuilder
                .beginControlFlow("when·(numArgs)") //START: when
                .beginControlFlow("${this.valueParameters.size}·->") //START: when cases
    }

    if (this.valueParameters.size > 0) {
        bridgeFunctionBodyBuilder.addStatement("args!!") //needed as we need non null later. also it should crash when null as this should never be null
    }

    val arguments = StringBuilder()
    this.valueParameters.forEachIndexed { parameterIndex, valueParameterDescriptor ->
        if (!valueParameterDescriptor.isVararg) {
            bridgeFunctionBodyBuilder.addStatement("val·arg$parameterIndex·=·${valueParameterDescriptor.type.castFromRawMemory("args[$parameterIndex]!!")}")

            if (parameterIndex != 0) {
                arguments.append(",·")
            }
            arguments.append("arg$parameterIndex")
        } else {
            varargSanityCheck(parameterIndex)
            var statementString = "val·arg$parameterIndex·=·Array(numArgs·-·${parameterIndex})·{·i·->·${this.valueParameters[parameterIndex].varargElementType?.castFromRawMemory("args[i·+·${parameterIndex}]!!")}·}"
            if (this.valueParameters[parameterIndex].varargElementType?.toString()?.isPrimitive() == true) { //is a primitive data type. Thus it has to be converted to a primitive array
               statementString = "$statementString.to${this.valueParameters[parameterIndex].varargElementType}Array()"
            }
            bridgeFunctionBodyBuilder.addStatement(statementString)

            if (parameterIndex != 0) {
                arguments.append(",·")
            }
            arguments.append("*arg$parameterIndex")
        }
    }

    if (this.returnType.toString() != Unit::class.java.simpleName) {
        bridgeFunctionBodyBuilder.addStatement("return@run·%T·from·obj.${this.name}($arguments)", ClassName("godot.core", "Variant"))
    } else {
        bridgeFunctionBodyBuilder
                .addStatement("obj.${this.name}($arguments)")
                .addStatement("return@run·null")
    }

    if (!this.hasVarargParameter()) {
        bridgeFunctionBodyBuilder
                .nextControlFlow("else·->")
                .addStatement("%M(%S,·%S,·numArgs)", MemberName("godot.registration", "noMethodToInvoke"), this.name, fullClassName)
                .addStatement("return@run·null")
                .endControlFlow() //END: when cases
                .endControlFlow() //END: when
    }

    return bridgeFunctionBodyBuilder
            .endControlFlow() //END: run
            .endControlFlow() //END: invoke
            .endControlFlow() //END: staticCFunction
            .build()
}

private fun CallableMemberDescriptor.varargSanityCheck(index: Int) {
    if (index != this.valueParameters.size - 1) {
        throw IllegalArgumentException(
                """Illegal position of vararg parameter in exported function!
                            |If you wan't to export a function with vararg parameter, it has to be at the last position and your function can only contain 1 vararg parameter!
                            |Example: fun foo(target: KinematicBody, vararg enemies: Enemy)
                        """.trimMargin()
        )
    }
}

/**
 * helper function that assembles the return type for a bidge function. Ex:<br>
 * <code> CPointer<CFunction<(COpaquePointer?,COpaquePointer?,Int,COpaquePointer?) -> Unit>> </code>
 */
private fun getBridgeReturnType(): ParameterizedTypeName {
    val cOpaquePointerClassName = ClassName("kotlinx.cinterop", "COpaquePointer").copy(nullable = true)

    return ClassName("kotlinx.cinterop", "CPointer")
            .parameterizedBy(
                    ClassName("kotlinx.cinterop", "CFunction")
                            .parameterizedBy(
                                    LambdaTypeName.get(
                                            parameters = *arrayOf(
                                                    cOpaquePointerClassName,
                                                    cOpaquePointerClassName,
                                                    Int::class.asClassName(),
                                                    cOpaquePointerClassName
                                            ),
                                            returnType = Unit::class.asTypeName()
                                    )
                            )
            )
}

private fun getFullClassName(descriptor: CallableMemberDescriptor): String {
    return descriptor.containingDeclaration.fqNameSafe.asString()
}