package org.godotengine.kotlin.entrygenerator.generator

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import de.jensklingenberg.mpapt.model.Element
import org.godotengine.kotlin.entrygenerator.model.castFromVariant
import org.jetbrains.kotlin.name.Name
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe

fun Element.PropertyElement.generatePropertyBinding(entryFileSpec: FileSpec.Builder, index: Int): Array<FunSpec> {
    propertySanityChecks()

    //order is important!
    val functionSpecs = arrayOf(
            generatePropertyGetterFunctionBinding(index),
            generatePropertySetterFunctionBinding(index),
            generateDefaultValueGetter(index)
    )

    functionSpecs.forEach {
        entryFileSpec.addFunction(it)
    }

    return functionSpecs
}

private fun Element.PropertyElement.generatePropertyGetterFunctionBinding(index: Int): FunSpec {
    return FunSpec
            .builder("propertyGetterFunctionBinding$index")
            .returns(getBridgeReturnType())
            .beginControlFlow("return·%M·{·objectPointer,·returnValuePointer·->", MemberName("kotlinx.cinterop", "staticCFunction")) //START: staticCFunction
            .beginControlFlow("%M<${getFullClassName(this)}>(%S,·%S,·objectPointer,·returnValuePointer)·{·objectValue·->", MemberName("godot.registration", "get"), this.propertyDescriptor.name, getFullClassName(this)) //START: get
            .addStatement("return·%T(objectValue.${this.propertyDescriptor.name})", ClassName("godot.core", "Variant"))
            .endControlFlow() //END: get
            .endControlFlow() //END: staticCFunction
            .build()
}

private fun Element.PropertyElement.generatePropertySetterFunctionBinding(index: Int): FunSpec {
    return FunSpec
            .builder("propertySetterFunctionBinding$index")
            .returns(getBridgeReturnType())
            .beginControlFlow("return·%M·{·objectPointer,·valuePointer·->", MemberName("kotlinx.cinterop", "staticCFunction")) //START: staticCFunction
            .beginControlFlow("%M<${getFullClassName(this)}>(%S,·%S,·objectPointer,·valuePointer)·{·objectValue,·value·->", MemberName("godot.registration", "set"), this.propertyDescriptor.name, getFullClassName(this)) //START: set
            .addStatement("objectValue.${this.propertyDescriptor.name} = ${this.propertyDescriptor.type.toString().castFromVariant("value")}")
            .endControlFlow() //END: set
            .endControlFlow() //END: staticCFunction
            .build()
}

private fun Element.PropertyElement.generateDefaultValueGetter(index: Int): FunSpec {
    val defaultArgument: String = this
            .annotation!!
            .allValueArguments
            .getValue(Name.identifier("defaultValue"))
            .value as String

    return FunSpec
            .builder("defaultValueGetter$index")
            .returns(ClassName("godot.core", "Variant"))
            .addStatement("return·%T($defaultArgument)", ClassName("godot.core", "Variant"))
            .build()
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
                                                    cOpaquePointerClassName
                                            ),
                                            returnType = Unit::class.asTypeName()
                                    )
                            )
            )
}

private fun getFullClassName(propertyElement: Element.PropertyElement): String {
    return propertyElement.propertyDescriptor.containingDeclaration.fqNameSafe.asString()
}

private fun Element.PropertyElement.propertySanityChecks() {

}