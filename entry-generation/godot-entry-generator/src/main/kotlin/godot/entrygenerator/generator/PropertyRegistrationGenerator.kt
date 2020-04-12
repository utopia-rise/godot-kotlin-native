package godot.entrygenerator.generator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.MemberName.Companion.member
import godot.entrygenerator.extension.getAnnotationValue
import godot.entrygenerator.extension.getPropertyHintAnnotation
import godot.entrygenerator.mapper.PropertyHintTypeMapper
import godot.entrygenerator.mapper.RpcModeAnnotationMapper.mapRpcModeAnnotationToClassName
import godot.entrygenerator.model.REGISTER_PROPERTY_ANNOTATION
import godot.entrygenerator.model.REGISTER_PROPERTY_ANNOTATION_RPC_MODE_ARGUMENT
import godot.entrygenerator.model.REGISTER_PROPERTY_ANNOTATION_VISIBLE_IN_EDITOR_ARGUMENT
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.name.ClassId
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.name.Name

object PropertyRegistrationGenerator {

    fun registerProperties(
        properties: List<PropertyDescriptor>,
        registerClassControlFlow: FunSpec.Builder,
        className: ClassName
    ) {
        properties.forEach { propertyDescriptor ->
            val propertyHintAnnotation = propertyDescriptor.getPropertyHintAnnotation()

            registerClassControlFlow
                .addStatement(
                    "property(%S,·%L,·%S,·%T,·%T,·%S)",
                    propertyDescriptor.name,
                    className.member(propertyDescriptor.name.asString()).reference(),
                    shouldBeVisibleInEditor(propertyDescriptor),
                    mapRpcModeAnnotationToClassName(getRpcModeEnum(propertyDescriptor)),
                    PropertyHintTypeMapper.mapAnnotationDescriptorToPropertyTypeClassName(propertyHintAnnotation),
                    PropertyHintTypeMapper.mapAnnotationDescriptorToPropertyHintString(
                        propertyDescriptor,
                        propertyHintAnnotation
                    )
                )
        }
    }

    private fun shouldBeVisibleInEditor(propertyDescriptor: PropertyDescriptor): Boolean {
        return propertyDescriptor
            .annotations
            .getAnnotationValue(
                REGISTER_PROPERTY_ANNOTATION,
                REGISTER_PROPERTY_ANNOTATION_VISIBLE_IN_EDITOR_ARGUMENT,
                false
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
