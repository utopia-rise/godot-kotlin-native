package godot.entrygenerator.generator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.MemberName.Companion.member
import com.squareup.kotlinpoet.asTypeName
import godot.entrygenerator.extension.getAnnotationValue
import godot.entrygenerator.extension.getFirstRegistrableTypeAsFqNameStringOrNull
import godot.entrygenerator.extension.isCompatibleList
import godot.entrygenerator.generator.provider.DefaultValueHandlerProvider
import godot.entrygenerator.mapper.RpcModeAnnotationMapper.mapRpcModeAnnotationToClassName
import godot.entrygenerator.mapper.TypeToVariantAsClassNameMapper
import godot.entrygenerator.model.REGISTER_PROPERTY_ANNOTATION
import godot.entrygenerator.model.REGISTER_PROPERTY_ANNOTATION_RPC_MODE_ARGUMENT
import godot.entrygenerator.model.REGISTER_PROPERTY_ANNOTATION_VISIBLE_IN_EDITOR_ARGUMENT
import org.jetbrains.kotlin.builtins.KotlinBuiltIns
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.js.descriptorUtils.getJetTypeFqName
import org.jetbrains.kotlin.name.ClassId
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.name.Name
import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe
import org.jetbrains.kotlin.types.KotlinType
import org.jetbrains.kotlin.types.typeUtil.isEnum
import org.jetbrains.kotlin.types.typeUtil.supertypes

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
            } else if (propertyDescriptor.type.isCompatibleList() && propertyDescriptor.type.arguments.firstOrNull()?.type?.isEnum() == true) {
                registerEnumList(className, propertyDescriptor, bindingContext, registerClassControlFlow)
            } else if (
                KotlinBuiltIns.isSetOrNullableSet(propertyDescriptor.type)
                && propertyDescriptor.type.arguments.firstOrNull()?.type?.isEnum() == true
            ) {
                registerEnumFlag(className, propertyDescriptor, bindingContext, registerClassControlFlow)
            } else {
                registerProperty(className, propertyDescriptor, bindingContext, registerClassControlFlow)
            }
        }
    }

    private fun registerEnumFlag(
        className: ClassName,
        propertyDescriptor: PropertyDescriptor,
        bindingContext: BindingContext,
        registerClassControlFlow: FunSpec.Builder
    ) {
        val defaultValueProvider =
            DefaultValueHandlerProvider.provideDefaultValueHandler(propertyDescriptor, bindingContext)
        val (defaultValueStringTemplate, defaultValueStringTemplateValues) = defaultValueProvider.getDefaultValue()

        registerClassControlFlow.addStatement(
            "enumFlagProperty(%S,·%L,·${defaultValueStringTemplate.replace(" ", "·")},·%L,·%T)",
            propertyDescriptor.name,
            className.member(propertyDescriptor.name.asString()).reference(),
            *defaultValueStringTemplateValues,
            shouldBeVisibleInEditor(propertyDescriptor),
            mapRpcModeAnnotationToClassName(getRpcModeEnum(propertyDescriptor))
        )
    }

    private fun registerEnumList(
        className: ClassName,
        propertyDescriptor: PropertyDescriptor,
        bindingContext: BindingContext,
        registerClassControlFlow: FunSpec.Builder
    ) {
        val defaultValueProvider =
            DefaultValueHandlerProvider.provideDefaultValueHandler(propertyDescriptor, bindingContext)
        val (defaultValueStringTemplate, defaultValueStringTemplateValues) = defaultValueProvider.getDefaultValue()

        registerClassControlFlow.addStatement(
            "enumListProperty(%S,·%L,·${defaultValueStringTemplate.replace(" ", "·")},·%L,·%T)",
            propertyDescriptor.name,
            className.member(propertyDescriptor.name.asString()).reference(),
            *defaultValueStringTemplateValues,
            shouldBeVisibleInEditor(propertyDescriptor),
            mapRpcModeAnnotationToClassName(getRpcModeEnum(propertyDescriptor))
        )
    }

    private fun registerEnum(
        className: ClassName,
        propertyDescriptor: PropertyDescriptor,
        bindingContext: BindingContext,
        registerClassControlFlow: FunSpec.Builder
    ) {
        val defaultValueProvider =
            DefaultValueHandlerProvider.provideDefaultValueHandler(propertyDescriptor, bindingContext)
        val (defaultValueStringTemplate, defaultValueStringTemplateValues) = defaultValueProvider.getDefaultValue()

        registerClassControlFlow
            .addStatement(
                "enumProperty(%S,·%L,·${defaultValueStringTemplate.replace(" ", "·")},·%L,·%T)",
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
        val (defaultValueStringTemplate, defaultValueStringTemplateValues) = defaultValueProvider.getDefaultValue()
        val (variantToTypeTemplate, variantToTypeTemplateValue) = getVariantToTypeConverter(propertyDescriptor)
        val (typeToVariantTemplate, typeToVariantTemplateValue) = getTypeToVariantConverter(propertyDescriptor)
        val hintString = defaultValueProvider.getHintString()

        registerClassControlFlow
            .addStatement(
                "property(%S,·%L,·$typeToVariantTemplate,·$variantToTypeTemplate,·%T,·${defaultValueStringTemplate.replace(" ", "·")},·%L,·%T,·%T,·%S)",
                propertyDescriptor.name,
                className.member(propertyDescriptor.name.asString()).reference(),
                typeToVariantTemplateValue,
                variantToTypeTemplateValue,
                TypeToVariantAsClassNameMapper.mapTypeToVariantAsClassName(
                    propertyDescriptor.type.toString(),
                    propertyDescriptor.type,
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
                Pair(ClassId(FqName("godot.MultiplayerAPI"), Name.identifier("RPCMode")), Name.identifier("DISABLED"))
            )
    }

    private fun getVariantToTypeConverter(propertyDescriptor: PropertyDescriptor): Pair<String, ClassName> {
        val firstRegistrableType = propertyDescriptor.type.getFirstRegistrableTypeAsFqNameStringOrNull()
            ?: throw IllegalArgumentException("Registered property \"${propertyDescriptor.fqNameSafe}\" is of unregistrable type: ${propertyDescriptor.type}. You can only register properties which are either primitive or derive from a Godot type")

        if (firstRegistrableType == "godot.core.ObjectArray") {
            throw IllegalArgumentException("Registered property \"${propertyDescriptor.fqNameSafe}\" is of type ObjectArray. ObjectArray cannot be registered directly. Use VariantArray instead and use the asObjectArray() function for conversion.")
        }

        val typeAsString = firstRegistrableType
            .replaceBeforeLast(".", "")
            .replace(".", "")

        val packageAsString = firstRegistrableType
            .replaceAfterLast(".", "")

        val argumentTemplateString = if (typeAsString == "GodotArray") {
            "getVariantToTypeConversionFunction<%T<*>>()"
        } else {
            "getVariantToTypeConversionFunction<%T>()"
        }

        return argumentTemplateString to ClassName(packageAsString, typeAsString)
    }

    private fun getTypeToVariantConverter(propertyDescriptor: PropertyDescriptor): Pair<String, ClassName> {
        val className = when {
            isOfType(propertyDescriptor.type, "godot.internal.type.CoreType") -> ClassName("godot.internal.type", "CoreType")
            isOfType(propertyDescriptor.type, "godot.Object") -> ClassName("godot", "Object")
            isOfType(propertyDescriptor.type, "godot.core.Variant") -> ClassName("godot.core", "Variant")
            KotlinBuiltIns.isInt(propertyDescriptor.type) -> Int::class.asTypeName()
            KotlinBuiltIns.isLongOrNullableLong(propertyDescriptor.type) -> Long::class.asTypeName()
            KotlinBuiltIns.isDoubleOrNullableDouble(propertyDescriptor.type) -> Double::class.asTypeName()
            KotlinBuiltIns.isFloatOrNullableFloat(propertyDescriptor.type) -> Float::class.asTypeName()
            KotlinBuiltIns.isBooleanOrNullableBoolean(propertyDescriptor.type) -> Boolean::class.asTypeName()
            KotlinBuiltIns.isStringOrNullableString(propertyDescriptor.type) -> String::class.asTypeName()
            else -> throw IllegalArgumentException("Registered property \"${propertyDescriptor.fqNameSafe}\" is of unregistrable type: ${propertyDescriptor.type}. You can only register properties which are either primitive or derive from a Godot type")
        }

        return "getTypeToVariantConversionFunction<%T>()" to className
    }

    private fun isOfType(type: KotlinType, typeFqName: String): Boolean {
       return if (type.getJetTypeFqName(false) == typeFqName) {
            true
        } else {
            type
                .supertypes()
                .any { it.getJetTypeFqName(false) == typeFqName }
        }
    }
}
