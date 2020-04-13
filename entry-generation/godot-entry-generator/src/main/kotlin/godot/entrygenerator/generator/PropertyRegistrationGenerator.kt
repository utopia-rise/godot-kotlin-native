package godot.entrygenerator.generator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.MemberName.Companion.member
import godot.entrygenerator.extension.getAnnotationValue
import godot.entrygenerator.extension.getPropertyHintAnnotation
import godot.entrygenerator.generator.provider.PropertyDefaultValueProvider
import godot.entrygenerator.mapper.PropertyHintTypeMapper
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
            val propertyHintAnnotation = propertyDescriptor.getPropertyHintAnnotation()
            val (hintStringStringTemplate, valuesForHintStringTemplate) = PropertyHintTypeMapper.mapAnnotationDescriptorToPropertyHintString(
                propertyDescriptor,
                propertyHintAnnotation
            )

            registerClassControlFlow
                .addStatement(
                    getStringTemplate(propertyDescriptor, hintStringStringTemplate),
                    *getTemplateValues(className, propertyDescriptor, bindingContext, valuesForHintStringTemplate)
                )
        }
    }

    private fun getStringTemplate(
        propertyDescriptor: PropertyDescriptor,
        hintStringStringTemplate: String
    ): String {
        return if (propertyDescriptor.type.isEnum()) {
            if (propertyDescriptor.isLateInit) {
                "enumProperty(%S,·%L,·%L,·%L,·%T)"
            } else {
                "enumProperty(%S,·%L,·%T(%L),·%L,·%T)"
            }
        } else {
            if (propertyDescriptor.isLateInit) {
                "property(%S,·%L,·%T,·%L,·%L,·%T,·%T,·$hintStringStringTemplate)"
            } else {
                "property(%S,·%L,·%T,·%T(%L),·%L,·%T,·%T,·$hintStringStringTemplate)"
            }
        }
    }

    private fun getTemplateValues(
        className: ClassName,
        propertyDescriptor: PropertyDescriptor,
        bindingContext: BindingContext,
        valuesForHintStringTemplate: Array<Any>
    ): Array<Any> {
        return ArrayList<Any>().apply {
            add(propertyDescriptor.name) //propertyName
            add(className.member(propertyDescriptor.name.asString()).reference()) //propertyReference
            if (!propertyDescriptor.type.isEnum()) {
                add(
                    TypeToVariantAsClassNameMapper.mapTypeToVariantAsClassName(
                        propertyDescriptor.type.toString(),
                        propertyDescriptor.type.isEnum()
                    ) //property variant type
                )
            }
            if (propertyDescriptor.isLateInit) {
                add("null") //default value null
            } else {
                add(ClassName("godot.core", "Variant")) //default value variant wrapper
                add(
                    PropertyDefaultValueProvider.provideDefaultValue(
                        propertyDescriptor,
                        bindingContext
                    ) //default value inside variant wrapper
                )
            }
            add(shouldBeVisibleInEditor(propertyDescriptor)) //isVisibleInEditor
            add(mapRpcModeAnnotationToClassName(getRpcModeEnum(propertyDescriptor))) //rpcMode
            if (!propertyDescriptor.type.isEnum()) {
                add(PropertyHintTypeMapper.mapAnnotationDescriptorToPropertyTypeClassName(propertyDescriptor.getPropertyHintAnnotation())) //hint type enum
                addAll(valuesForHintStringTemplate) //hint string
            }
        }.toTypedArray()
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
