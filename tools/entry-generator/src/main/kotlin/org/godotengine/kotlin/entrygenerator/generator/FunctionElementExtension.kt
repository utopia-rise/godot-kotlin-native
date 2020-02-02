package org.godotengine.kotlin.entrygenerator.generator

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import org.godotengine.kotlin.entrygenerator.model.castFromRawMemory
import org.godotengine.kotlin.entrygenerator.utils.hasVarargParameter
import org.jetbrains.kotlin.descriptors.CallableMemberDescriptor
import org.jetbrains.kotlin.resolve.calls.components.isVararg
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe

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

private fun CallableMemberDescriptor.getBridgeFunctionBody(fullClassName: String): CodeBlock {
    val bridgeFunctionBodyBuilder = CodeBlock.builder()
            .beginControlFlow("return·%M·{·returnValuePointer,·rawObjectPointer,·numberOfArguments,·argumentsPointer·->", MemberName("kotlinx.cinterop", "staticCFunction")) //START: staticCFunction
            .beginControlFlow("%M<$fullClassName>(%S,·returnValuePointer,·rawObjectPointer,·numberOfArguments,·argumentsPointer)·{·obj,·numArgs,·args·->", MemberName("godot.registration", "invoke"), this.name) //START: invoke
            .beginControlFlow("run") //START: run

    if (!this.hasVarargParameter()) {
        bridgeFunctionBodyBuilder
                .beginControlFlow("when·(numArgs)") //START: when
                .beginControlFlow("${this.valueParameters.size}·->") //START: when cases
    }

    val arguments = StringBuilder()
    this.valueParameters.forEachIndexed { parameterIndex, valueParameterDescriptor ->
        if (!valueParameterDescriptor.isVararg) {
            bridgeFunctionBodyBuilder.addStatement("val·arg$parameterIndex·=·${valueParameterDescriptor.type.toString().castFromRawMemory("args[$parameterIndex]!!")}")

            if (parameterIndex != 0) {
                arguments.append(",·")
            }
            arguments.append("arg$parameterIndex")
        } else {
            varargSanityCheck(parameterIndex)
            bridgeFunctionBodyBuilder.addStatement("val·arg$parameterIndex·=·Array(numArgs·-·${parameterIndex})·{·i·->·${this.valueParameters[parameterIndex].varargElementType?.toString()?.castFromRawMemory("args[i·+·${parameterIndex}]!!")}·}")

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
    if (this.valueParameters.size != 1) {
        //TODO: warning about runtime errors
    }
}

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