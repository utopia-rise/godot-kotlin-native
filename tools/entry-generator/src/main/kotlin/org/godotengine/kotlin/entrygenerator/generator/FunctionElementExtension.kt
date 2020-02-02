package org.godotengine.kotlin.entrygenerator.generator

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import de.jensklingenberg.mpapt.model.Element
import org.godotengine.kotlin.entrygenerator.model.castFromRawMemory
import org.godotengine.kotlin.entrygenerator.utils.hasVarargParameter
import org.jetbrains.kotlin.resolve.calls.components.isVararg
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe
import java.lang.StringBuilder

fun Element.FunctionElement.generateFunctionBinding(entryFileSpecBuilder: FileSpec.Builder, index: Int): FunSpec {
    val bridgeFunctionBuilder = FunSpec
            .builder("functionBridge$index")
            .returns(getReturnType())
            .addModifiers(KModifier.PRIVATE)
            .addCode("return staticCFunction { returnValuePointer, rawObjectPointer, numberOfArguments, argumentsPointer ->")
            .addCode("invoke<${getFullClassName(this)}>(%S, returnValuePointer, rawObjectPointer, numberOfArguments, argumentsPointer) { obj, numArgs, args ->", this.func.name)
            .addCode("run {")


    if (!this.func.hasVarargParameter()) {
        bridgeFunctionBuilder.addCode("when (numArgs) {")
        bridgeFunctionBuilder.addCode("${this.func.valueParameters.size} -> {")
    }

    val arguments = StringBuilder()
    this.func.valueParameters.forEachIndexed { parameterIndex, valueParameterDescriptor ->
        if (!valueParameterDescriptor.isVararg) {
            bridgeFunctionBuilder.addCode("val arg$parameterIndex = ${valueParameterDescriptor.type.toString().castFromRawMemory("args[$parameterIndex]!!")}")

            if (parameterIndex != 0) {
                arguments.append(", ")
            }
            arguments.append("arg$parameterIndex")
        } else {
            varargSanityCheck(parameterIndex)
            bridgeFunctionBuilder.addCode("val arg$parameterIndex = Array(numArgs - ${parameterIndex}) { i -> ${this.func.valueParameters[parameterIndex].varargElementType?.toString()?.castFromRawMemory("args[i + ${parameterIndex}]!!")} }")

            if (parameterIndex != 0) {
                arguments.append(", ")
            }
            arguments.append("*arg$parameterIndex")
        }
    }

    if (this.func.returnType.toString() != Unit::class.java.simpleName) {
        bridgeFunctionBuilder.addCode("return@run Variant from ")
    }
    bridgeFunctionBuilder.addCode("obj.${this.func.name}($arguments)")

    if (!this.func.hasVarargParameter()) {
        bridgeFunctionBuilder.addCode("}")
        bridgeFunctionBuilder.addCode("else -> noMethodToInvoke(%S, %S, numArgs)", this.func.name, getFullClassName(this))
        bridgeFunctionBuilder.addCode("}")
    }
    if (!this.func.hasVarargParameter()) {
        bridgeFunctionBuilder.addCode("return@run null")
    }
    bridgeFunctionBuilder.addCode("}")
    bridgeFunctionBuilder.addCode("}")
    bridgeFunctionBuilder.addCode("}")


    val bridgeFunction = bridgeFunctionBuilder.build()
    entryFileSpecBuilder.addFunction(bridgeFunction)

    return bridgeFunction
}

private fun Element.FunctionElement.varargSanityCheck(index: Int) {
    if (index != this.func.valueParameters.size - 1) {
        throw IllegalArgumentException(
                """Illegal position of vararg parameter in exported function!
                            |If you wan't to export a function with vararg parameter, it has to be at the last position and your function can only contain 1 vararg parameter!
                            |Example: fun foo(target: KinematicBody, vararg enemies: Enemy)
                        """.trimMargin()
        )
    }
    if (this.func.valueParameters.size != 1) {
        //TODO: warning about runtime errors
    }
}

private fun getReturnType(): ParameterizedTypeName {
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

private fun getFullClassName(element: Element.FunctionElement): String {
    return element.descriptor.fqNameSafe.asString()
}