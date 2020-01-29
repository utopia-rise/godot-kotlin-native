package org.godotengine.kotlin.entrygenerator.generator

import com.squareup.kotlinpoet.*
import de.jensklingenberg.mpapt.model.Element
import de.jensklingenberg.mpapt.model.ElementUtils
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy

fun Element.ClassElement.generateConstructorBindings(entryFileSpecBuilder: FileSpec.Builder, index: Int): Array<FunSpec> {
    val returnType = ClassName(ElementUtils().getPackageOf(this), this.classDescriptor.name.asString())
    val constructorBindingFuncSpec = FunSpec
            .builder("constructorFunction${index}Constructor")
            .addModifiers(KModifier.PRIVATE)
            .returns(returnType)
            .addStatement("${ElementUtils().getPackageOf(this)}.${this.classDescriptor.name.asString()}()")
            .build()

    val constructorBindingFunctionReferenceProperty = PropertySpec
            .builder("constructorFunctionReferenceProperty${index}", returnType, KModifier.PRIVATE)
            .initializer("::${constructorBindingFuncSpec.name}")
            .build()

    val constructorBridgeFuncSpec = FunSpec
            .builder("constructorBridge${index}")
            .addModifiers(KModifier.PRIVATE)
            .returns(getBridgeReturnType(isConstructor = true))
            .addStatement("return staticCFunction { mem -> constructFromRawMem(mem, ${constructorBindingFunctionReferenceProperty.name}) }")
            .build()

    val destructorBridgeFuncSpec = FunSpec
            .builder("destructorBridge${index}")
            .addModifiers(KModifier.PRIVATE)
            .returns(getBridgeReturnType(isConstructor = false))
            .addStatement("return staticCFunction { mem -> deconstructFromRawMem<${returnType.canonicalName}>(mem) }")
            .build()

    entryFileSpecBuilder
            .addFunction(constructorBindingFuncSpec)
            .addProperty(constructorBindingFunctionReferenceProperty)
            .addFunction(constructorBridgeFuncSpec)
            .addFunction(destructorBridgeFuncSpec)

    return arrayOf(constructorBridgeFuncSpec, destructorBridgeFuncSpec)
}

private fun getBridgeReturnType(isConstructor: Boolean): ParameterizedTypeName {
    return ClassName("kotlinx.cinterop", "CPointer")
            .parameterizedBy(
                    ClassName("kotlinx.cinterop", "CFunction")
                            .parameterizedBy(
                                    LambdaTypeName.get(
                                            parameters = *arrayOf(ClassName("kotlinx.cinterop", "COpaquePointer?")),
                                            returnType = if (isConstructor) ClassName("kotlinx.cinterop", "COpaquePointer?") else Unit::class.asTypeName()
                                    )
                            )
            )
}