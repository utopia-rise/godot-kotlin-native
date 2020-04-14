package godot.entrygenerator.generator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.MemberName.Companion.member
import godot.entrygenerator.extension.getAnnotationValue
import godot.entrygenerator.generator.provider.DefaultValueHandlerProvider
import godot.entrygenerator.mapper.RpcModeAnnotationMapper.mapRpcModeAnnotationToClassName
import godot.entrygenerator.mapper.TypeToVariantAsClassNameMapper
import godot.entrygenerator.model.REGISTER_PROPERTY_ANNOTATION
import godot.entrygenerator.model.REGISTER_PROPERTY_ANNOTATION_RPC_MODE_ARGUMENT
import godot.entrygenerator.model.REGISTER_PROPERTY_ANNOTATION_VISIBLE_IN_EDITOR_ARGUMENT
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.name.ClassId
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.name.Name
import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.types.typeUtil.isEnum

object PropertyRegistrationGenerator {

    fun registerProperties(
        properties: List<PropertyDescriptor>,
        registerClassControlFlow: FunSpec.Builder,
        className: ClassName,
        bindingContext: BindingContext
    ) {
        properties.forEach { propertyDescriptor ->
            if (propertyDescriptor.type.isEnum()) {
                registerEnum(className, propertyDescriptor, bindingContext, registerClassControlFlow)
            } else {
                registerProperty(className, propertyDescriptor, bindingContext, registerClassControlFlow)
            }
        }
    }

    private fun registerEnum(
        className: ClassName,
        propertyDescriptor: PropertyDescriptor,
        bindingContext: BindingContext,
        registerClassControlFlow: FunSpec.Builder
    ) {
        val defaultValueProvider =
            DefaultValueHandlerProvider.provideDefaultValueHandler(propertyDescriptor, bindingContext)
        val defaultValueStringTemplate = defaultValueProvider.getDefaultValueStringTemplate()
        val defaultValueStringTemplateValues = defaultValueProvider.getDefaultValueStringTemplateValues()

        registerClassControlFlow
            .addStatement(
                "enumProperty(%S,·%L,·$defaultValueStringTemplate,·%L,·%T)",
                propertyDescriptor.name,
                className.member(propertyDescriptor.name.asString()).reference(),
                *defaultValueStringTemplateValues,
                shouldBeVisibleInEditor(propertyDescriptor),
                mapRpcModeAnnotationToClassName(getRpcModeEnum(propertyDescriptor))
            )
    }

    private fun registerProperty(
        className: ClassName,
        propertyDescriptor: PropertyDescriptor,
        bindingContext: BindingContext,
        registerClassControlFlow: FunSpec.Builder
    ) {
        val defaultValueProvider = DefaultValueHandlerProvider.provideDefaultValueHandler(
            propertyDescriptor,
            bindingContext
        )
        val defaultValueStringTemplate = defaultValueProvider.getDefaultValueStringTemplate()
        val defaultValueStringTemplateValues = defaultValueProvider.getDefaultValueStringTemplateValues()
        val hintString = defaultValueProvider.getHintString()

        registerClassControlFlow
            .addStatement(
                "property(%S,·%L,·%T,·$defaultValueStringTemplate,·%L,·%T,·%T,·%S)",
                propertyDescriptor.name,
                className.member(propertyDescriptor.name.asString()).reference(),
                TypeToVariantAsClassNameMapper.mapTypeToVariantAsClassName(
                    propertyDescriptor.type.toString(),
                    propertyDescriptor.type.isEnum()
                ), //property variant type
                *defaultValueStringTemplateValues,
                shouldBeVisibleInEditor(propertyDescriptor),
                mapRpcModeAnnotationToClassName(getRpcModeEnum(propertyDescriptor)),
                defaultValueProvider.getPropertyTypeHint(),
                hintString
            )
    }

    private fun shouldBeVisibleInEditor(propertyDescriptor: PropertyDescriptor): Boolean {
        return propertyDescriptor
            .annotations
            .getAnnotationValue(
                REGISTER_PROPERTY_ANNOTATION,
                REGISTER_PROPERTY_ANNOTATION_VISIBLE_IN_EDITOR_ARGUMENT,
                true
            )
    }

    private fun getRpcModeEnum(propertyDescriptor: PropertyDescriptor): String {
        val compilerRpcModeEnumRepresentation = getCompilerRpcModeEnumRepresentation(propertyDescriptor)
        val packagePath = compilerRpcModeEnumRepresentation.first.asString().replace("/", ".")
        val name = compilerRpcModeEnumRepresentation.second
        return "$packagePath.$name"
    }

    private fun getCompilerRpcModeEnumRepresentation(propertyDescriptor: PropertyDescriptor): Pair<ClassId, Name> {
        return propertyDescriptor
            .annotations
            .getAnnotationValue(
                REGISTER_PROPERTY_ANNOTATION,
                REGISTER_PROPERTY_ANNOTATION_RPC_MODE_ARGUMENT,
                Pair(ClassId(FqName("godot.registration"), Name.identifier("RPCMode")), Name.identifier("DISABLED"))
            )
    }
}
