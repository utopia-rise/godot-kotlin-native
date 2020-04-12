package godot.entrygenerator.generator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.MemberName.Companion.member
import godot.entrygenerator.extension.getAnnotationValue
import godot.entrygenerator.extension.getPropertyHintAnnotation
import godot.entrygenerator.mapper.PropertyHintTypeMapper
import godot.entrygenerator.mapper.RpcModeAnnotationMapper.mapRpcModeAnnotationToClassName
import godot.entrygenerator.mapper.TypeToVariantAsClassNameMapper
import godot.entrygenerator.model.REGISTER_PROPERTY_ANNOTATION
import godot.entrygenerator.model.REGISTER_PROPERTY_ANNOTATION_RPC_MODE_ARGUMENT
import godot.entrygenerator.model.REGISTER_PROPERTY_ANNOTATION_VISIBLE_IN_EDITOR_ARGUMENT
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.js.resolve.diagnostics.findPsi
import org.jetbrains.kotlin.name.ClassId
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.name.Name
import org.jetbrains.kotlin.psi.*
import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.resolve.bindingContextUtil.getReferenceTargets
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe
import org.jetbrains.kotlin.resolve.source.KotlinSourceElement
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

            val stringTemplate = if (propertyDescriptor.type.isEnum()) {
                if (propertyDescriptor.isLateInit) {
                    "enumProperty(%S,·%L,·%T,·%L,·%L,·%T,·%T,·$hintStringStringTemplate)"
                } else {
                    "enumProperty(%S,·%L,·%T,·%T(%L),·%L,·%T,·%T,·$hintStringStringTemplate)"
                }
            } else {
                if (propertyDescriptor.isLateInit) {
                    "property(%S,·%L,·%T,·%L,·%L,·%T,·%T,·$hintStringStringTemplate)"
                } else {
                    "property(%S,·%L,·%T,·%T(%L),·%L,·%T,·%T,·$hintStringStringTemplate)"
                }
            }

            if (propertyDescriptor.isLateInit) {
                registerClassControlFlow
                    .addStatement(
                        stringTemplate, //template
                        propertyDescriptor.name, //propertyName
                        className.member(propertyDescriptor.name.asString()).reference(), //propertyReference
                        TypeToVariantAsClassNameMapper.mapTypeToVariantAsClassName(propertyDescriptor.type.toString()), //property variant type
                        "null", //default value null
                        shouldBeVisibleInEditor(propertyDescriptor), //isVisibleInEditor
                        mapRpcModeAnnotationToClassName(getRpcModeEnum(propertyDescriptor)), //rpcMode
                        PropertyHintTypeMapper.mapAnnotationDescriptorToPropertyTypeClassName(propertyHintAnnotation), //hint type enum
                        *valuesForHintStringTemplate //hint string
                    )
            } else {
                registerClassControlFlow
                    .addStatement(
                        stringTemplate, //template
                        propertyDescriptor.name, //propertyName
                        className.member(propertyDescriptor.name.asString()).reference(), //propertyReference
                        TypeToVariantAsClassNameMapper.mapTypeToVariantAsClassName(propertyDescriptor.type.toString()), //property variant type
                        ClassName("godot.core", "Variant"), //default value variant wrapper
                        getDefaultValue(propertyDescriptor, bindingContext), //default value inside variant wrapper
                        shouldBeVisibleInEditor(propertyDescriptor), //isVisibleInEditor
                        mapRpcModeAnnotationToClassName(getRpcModeEnum(propertyDescriptor)), //rpcMode
                        PropertyHintTypeMapper.mapAnnotationDescriptorToPropertyTypeClassName(propertyHintAnnotation), //hint type enum
                        *valuesForHintStringTemplate //hint string
                    )
            }
        }
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

    private fun getDefaultValue(
        propertyDescriptor: PropertyDescriptor,
        bindingContext: BindingContext
    ): String {
        if (!propertyDescriptor.isVar) {
            throw IllegalStateException("The property ${propertyDescriptor.fqNameSafe} you annotated with @RegisterProperty is a val. You can only register properties which are mutable as Godot needs to be able to write into it")
        }

        val defaultArgumentPsi = ((propertyDescriptor
            .source as KotlinSourceElement)
            .psi as KtProperty)
            .delegateExpressionOrInitializer!! // should not be null

        if (isContainingReference(defaultArgumentPsi, bindingContext)) {
            throw IllegalStateException("You initialized the property ${propertyDescriptor.fqNameSafe} (which you annotated with @RegisterProperty) with a reference: ${defaultArgumentPsi.text}. This is not supported! initialize your property with a compile time constant")
        }

        return defaultArgumentPsi.text
    }

    private fun isContainingReference(
        expression: KtExpression,
        bindingContext: BindingContext
    ): Boolean {
        return when (expression) {
            is KtConstantExpression -> false
            is KtStringTemplateExpression -> expression.hasInterpolation()
            is KtDotQualifiedExpression -> {
                val receiver = expression.receiverExpression
                val receiverRef = receiver.getReferenceTargets(bindingContext).firstOrNull()

                if (receiverRef != null) {
                    val psi = receiverRef.findPsi()
                    !(psi is KtClass && psi.isEnum())
                } else {
                    true
                }
            }
            else -> true
        }
    }
}
