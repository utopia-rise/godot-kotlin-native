package org.godotengine.kotlin.entrygenerator.generator

import com.squareup.kotlinpoet.*
import de.jensklingenberg.mpapt.model.Element
import de.jensklingenberg.mpapt.model.ElementUtils
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe

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
            .addStatement("return %M { mem -> %M(mem, ${constructorBindingFunctionReferenceProperty.name}) }", MemberName("kotlinx.cinterop", "staticCFunction"), MemberName("godot.registration", "constructFromRawMem"))
            .build()

    val destructorBridgeFuncSpec = FunSpec
            .builder("destructorBridge${index}")
            .addModifiers(KModifier.PRIVATE)
            .returns(getBridgeReturnType(isConstructor = false))
            .addStatement("return %M { mem -> %M<${returnType.canonicalName}>(mem) }", MemberName("kotlinx.cinterop", "staticCFunction"), MemberName("godot.registration", "deconstructFromRawMem"))
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
                                            parameters = *arrayOf(ClassName("kotlinx.cinterop", "COpaquePointer").copy(nullable = true)),
                                            returnType = if (isConstructor) ClassName("kotlinx.cinterop", "COpaquePointer").copy(nullable = true) else Unit::class.asTypeName()
                                    )
                            )
            )
}