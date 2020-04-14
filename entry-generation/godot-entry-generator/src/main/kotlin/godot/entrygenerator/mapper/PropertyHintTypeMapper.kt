package godot.entrygenerator.mapper

import com.squareup.kotlinpoet.ClassName
import godot.entrygenerator.extension.getAnnotationValue
import godot.entrygenerator.model.*
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor
import org.jetbrains.kotlin.name.ClassId
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.name.Name
import org.jetbrains.kotlin.resolve.constants.StringValue
import org.jetbrains.kotlin.types.typeUtil.isEnum
import org.jetbrains.kotlin.utils.join
import kotlin.reflect.KClass

//TODO: remove this file. Still here for reference until all RegistrationValueHandler's are implemented
object PropertyHintTypeMapper {

    fun mapAnnotationDescriptorToPropertyTypeClassName(annotationDescriptor: AnnotationDescriptor?): ClassName {
        return when (annotationDescriptor?.fqName?.asString()) {
            "godot.annotation.IntRange", "godot.annotation.FloatRange", "godot.annotation.DoubleRange" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_RANGE")
            "godot.annotation.ExpRange" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_EXP_RANGE")
            "godot.annotation.EnumTypeHint" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_ENUM")
            "godot.annotation.ExpEasing" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_EXP_EASING")
            "godot.annotation.Lenght" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_LENGHT")
            "godot.annotation.Flags" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_FLAGS")
            "godot.annotation.Layers2DRender" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_LAYERS_2D_RENDER")
            "godot.annotation.Layers2DPhysics" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_LAYERS_2D_PHYSICS")
            "godot.annotation.Layers3DRender" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_LAYERS_3D_RENDER")
            "godot.annotation.Layers3DPhysics" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_LAYERS_3D_PHYSICS")
            "godot.annotation.File" ->
                if (annotationDescriptor.getAnnotationValue(FILE_AND_DIR_ANNOTATION_GLOBAL_ARGUMENT, false)) {
                    ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_GLOBAL_FILE")
                } else {
                    ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_FILE")
                }
            "godot.annotation.Dir" ->
                if (annotationDescriptor.getAnnotationValue(FILE_AND_DIR_ANNOTATION_GLOBAL_ARGUMENT, false)) {
                    ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_GLOBAL_DIR")
                } else {
                    ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_DIR")
                }
            "godot.annotation.ResourceType" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_RESOURCE_TYPE")
            "godot.annotation.MultilineText" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_MULTILINE_TEXT")
            "godot.annotation.PlaceHolderText" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_PLACE_HOLDER_TEXT")
            "godot.annotation.ColorNoAlpha" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_COLOR_NO_ALPHA")
            "godot.annotation.ImageCompressLossy" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_IMAGE_COMPRESS_LOSSY")
            "godot.annotation.ImageCompressLossLess" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_IMAGE_COMPRESS_LOSSLESS")
            "godot.annotation.ObjectId" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_OBJECT_ID")
            "godot.annotation.TypeString" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_TYPE_STRING")
            "godot.annotation.NodePathToEditedNode" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_NODEPATH_TO_EDITED_NODE")
            "godot.annotation.MethodOfVariantType" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_METHOD_OF_VARIANT_TYPE")
            "godot.annotation.MethodOfBaseType" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_METHOD_OF_BASE_TYPE")
            "godot.annotation.MethodOfInstance" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_METHOD_OF_INSTANCE")
            "godot.annotation.MethodOfScript" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_METHOD_OF_SCRIPT")
            "godot.annotation.PropertyOfVariantType" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_PROPERTY_OF_VARIANT_TYPE")
            "godot.annotation.PropertyOfBaseType" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_PROPERTY_OF_BASE_TYPE")
            "godot.annotation.PropertyOfInstance" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_PROPERTY_OF_INSTANCE")
            "godot.annotation.PropertyOfScript" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_PROPERTY_OF_SCRIPT")
            "godot.annotation.ObjectTooBig" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_OBJECT_TOO_BIG")
            "godot.annotation.NodePathValidTypes" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_NODEPATH_VALID_TYPES")
            "godot.annotation.SaveFile" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_SAVE_FILE")
            "godot.annotation.IntIsObjectId" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_INT_IS_OBJECT_ID")
            "godot.annotation.Max" -> ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_MAX")
            null -> ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_NONE")
            else -> throw IllegalStateException("Unknown annotation ${annotationDescriptor.fqName}")
        }
    }

    fun mapAnnotationDescriptorToPropertyHintString(
        propertyDescriptor: PropertyDescriptor,
        annotationDescriptor: AnnotationDescriptor?
    ): String {
        if (!propertyDescriptor.annotations.getAnnotationValue(
                REGISTER_PROPERTY_ANNOTATION,
                REGISTER_PROPERTY_ANNOTATION_VISIBLE_IN_EDITOR_ARGUMENT,
                true
            ) && annotationDescriptor != null
        ) {
            throw IllegalStateException("You added the type hint annotation ${annotationDescriptor.fqName} to the property ${propertyDescriptor.name}. But the @RegisterProperty annotation is either not present or the isVisibleInEditor flag is not set to true")
        }
        return when (annotationDescriptor?.fqName?.asString()) {
            "godot.annotation.IntRange" ->
                getRangeTypeHint(annotationDescriptor, arrayOf(Int::class), propertyDescriptor)
            "godot.annotation.FloatRange" ->
                getRangeTypeHint(annotationDescriptor, arrayOf(Float::class), propertyDescriptor)
            "godot.annotation.DoubleRange" ->
                getRangeTypeHint(annotationDescriptor, arrayOf(Double::class), propertyDescriptor)
            "godot.annotation.ExpRange" ->
                getRangeTypeHint(annotationDescriptor, arrayOf(Float::class, Double::class), propertyDescriptor)
            "godot.annotation.EnumTypeHint" -> getEnumTypeHint(propertyDescriptor)
            "godot.annotation.ExpEasing" -> getExpEasingTypeHint(annotationDescriptor, propertyDescriptor)
            "godot.annotation.Lenght" -> throw NotImplementedError("@Lenght annotation is not yet implemented") //getLengthTypeHint(annotationDescriptor, propertyDescriptor)
            "godot.annotation.Flags" -> throw NotImplementedError("@Flags annotation is not yet implemented")//getFlagsTypeHint(propertyDescriptor)
            "godot.annotation.Layers2DRender" -> throw NotImplementedError("@Layers2DRender annotation is not yet implemented")
            "godot.annotation.Layers2DPhysics" -> throw NotImplementedError("@Layers2DPhysics annotation is not yet implemented")
            "godot.annotation.Layers3DRender" -> throw NotImplementedError("@Layers3DRender annotation is not yet implemented")
            "godot.annotation.Layers3DPhysics" -> throw NotImplementedError("@Layers3DPhysics annotation is not yet implemented")
            "godot.annotation.File", "godot.annotation.Dir" ->
                getFileOrDirTypeHint(annotationDescriptor, propertyDescriptor)
            "godot.annotation.ResourceType" -> throw NotImplementedError("@ResourceType annotation is not yet implemented")
            "godot.annotation.MultilineText" -> throw NotImplementedError("@MultilineText annotation is not yet implemented")
            "godot.annotation.PlaceHolderText" -> throw NotImplementedError("@PlaceHolderText annotation is not yet implemented")
            "godot.annotation.ColorNoAlpha" -> getColorNoAlphaHintString(propertyDescriptor)
            "godot.annotation.ImageCompressLossy" -> throw NotImplementedError("@ImageCompressLossy annotation is not yet implemented")
            "godot.annotation.ImageCompressLossLess" -> throw NotImplementedError("@ImageCompressLossLess annotation is not yet implemented")
            "godot.annotation.ObjectId" -> throw NotImplementedError("@ObjectId annotation is not yet implemented")
            "godot.annotation.TypeString" -> throw NotImplementedError("@TypeString annotation is not yet implemented")
            "godot.annotation.NodePathToEditedNode" -> throw NotImplementedError("@NodePathToEditedNode annotation is not yet implemented")
            "godot.annotation.MethodOfVariantType" -> throw NotImplementedError("@MethodOfVariantType annotation is not yet implemented")
            "godot.annotation.MethodOfBaseType" -> throw NotImplementedError("@MethodOfBaseType annotation is not yet implemented")
            "godot.annotation.MethodOfInstance" -> throw NotImplementedError("@MethodOfInstance annotation is not yet implemented")
            "godot.annotation.MethodOfScript" -> throw NotImplementedError("@MethodOfScript annotation is not yet implemented")
            "godot.annotation.PropertyOfVariantType" -> throw NotImplementedError("@PropertyOfVariantType annotation is not yet implemented")
            "godot.annotation.PropertyOfBaseType" -> throw NotImplementedError("@PropertyOfBaseType annotation is not yet implemented")
            "godot.annotation.PropertyOfInstance" -> throw NotImplementedError("@PropertyOfInstance annotation is not yet implemented")
            "godot.annotation.PropertyOfScript" -> throw NotImplementedError("@PropertyOfScript annotation is not yet implemented")
            "godot.annotation.ObjectTooBig" -> throw NotImplementedError("@ObjectTooBig annotation is not yet implemented")
            "godot.annotation.NodePathValidTypes" -> throw NotImplementedError("@NodePathValidTypes annotation is not yet implemented")
            "godot.annotation.SaveFile" -> throw NotImplementedError("@SaveFile annotation is not yet implemented")
            "godot.annotation.IntIsObjectId" -> throw NotImplementedError("@IntIsObjectId annotation is not yet implemented")
            "godot.annotation.Max" -> throw NotImplementedError("@Max annotation is not yet implemented")
            null -> ""
            else -> throw IllegalStateException("Unknown annotation ${annotationDescriptor.fqName}")
        }
    }

    private fun mapCompilerEnumRepresentationToClassName(enumRepresentation: Pair<ClassId, Name>): ClassName {
        return ClassName(
            enumRepresentation.first.asString().replace("/", ".").replace(".${enumRepresentation.second}", ""),
            enumRepresentation.second.asString()
        )
    }

    private fun getRangeTypeHint(
        annotationDescriptor: AnnotationDescriptor,
        expectedTypes: Array<KClass<*>>,
        propertyDescriptor: PropertyDescriptor
    ): String {
        if (expectedTypes.map { it.toString() }.contains(propertyDescriptor.type.toString())) {
            throw IllegalStateException("You annotated the property ${propertyDescriptor.name} which is of type ${propertyDescriptor.type} with a range annotation of type $expectedTypes. Use the correct Annotation for the type")
        }

        val start = annotationDescriptor.getAnnotationValue(RANGE_ANNOTATION_START_ARGUMENT, -1)
        val end = annotationDescriptor.getAnnotationValue(RANGE_ANNOTATION_END_ARGUMENT, -1)
        val step = annotationDescriptor.getAnnotationValue(RANGE_ANNOTATION_STEP_ARGUMENT, -1)
        val or = annotationDescriptor.getAnnotationValue(
            RANGE_ANNOTATION_OR_ARGUMENT,
            Pair(ClassId(FqName("godot.registration"), Name.identifier("Range")), Name.identifier("NONE"))
        )
        val orAsClassName = mapCompilerEnumRepresentationToClassName(or)

        val argumentsForStringTemplate = mutableListOf<Any>()

        argumentsForStringTemplate.add(start)
        argumentsForStringTemplate.add(end)
        if (step != -1) {
            argumentsForStringTemplate.add(step)
        }
        if (orAsClassName.toString() != "godot.registration.Range.NONE") {
            argumentsForStringTemplate.add(orAsClassName.toString().split(".").last().toLowerCase())
        }

        return join(argumentsForStringTemplate, ",")
    }

    private fun getEnumTypeHint(propertyDescriptor: PropertyDescriptor): String {
        if (!propertyDescriptor.type.isEnum()) {
            throw IllegalStateException("You annotated the property ${propertyDescriptor.name} which is of type ${propertyDescriptor.type} with @EnumTypeHint. Only enums can have this annotation!")
        }

        val enumValues = propertyDescriptor
            .type
            .memberScope
            .getVariableNames()
            .map { it.asString() }
            .filter { it != "name" && it != "ordinal" }

        return join(enumValues, ",")
    }

    private fun getExpEasingTypeHint(
        annotationDescriptor: AnnotationDescriptor,
        propertyDescriptor: PropertyDescriptor
    ): String {
        if (listOf(Float::class, Double::class).map { it.toString() }.contains(propertyDescriptor.type.toString())) {
            throw IllegalStateException("You annotated the property ${propertyDescriptor.name} which is of type ${propertyDescriptor.type} with @ExpEasing. This annotation is only applicable for Floats and Doubles.")
        }

        val attenuation = annotationDescriptor.getAnnotationValue(EXP_EASING_ANNOTATION_ATTENUATION_ARGUMENT, false)
        val inout = annotationDescriptor.getAnnotationValue(EXP_EASING_ANNOTATION_INOUT_ARGUMENT, true)

        val stringTemplateValues = when {
            attenuation && inout -> "attenuation,inout"
            attenuation -> "attenuation"
            inout -> "inout"
            else -> ""
        }

        return stringTemplateValues
    }

    private fun getLengthTypeHint(
        annotationDescriptor: AnnotationDescriptor,
        propertyDescriptor: PropertyDescriptor
    ): String {
        if (listOf(Float::class, Double::class).map { it.toString() }.contains(propertyDescriptor.type.toString())) {
            throw IllegalStateException("You annotated the property ${propertyDescriptor.name} which is of type ${propertyDescriptor.type} with @Length. This annotation is only applicable for Floats and Doubles.")
        }

        val length = annotationDescriptor.getAnnotationValue(LENGTH_ANNOTATION_LENGTH_ARGUMENT, -1)

        return if (length != -1) {
            "$length"
        } else {
            ""
        }
    }

    private fun getFlagsTypeHint(
        propertyDescriptor: PropertyDescriptor
    ): String {
        if (
            !(propertyDescriptor.type.toString().startsWith("Map")
                && propertyDescriptor.type.arguments.first().type.isEnum()
                && propertyDescriptor.type.arguments.last().type.toString() == "Boolean")
        ) {
            throw IllegalStateException("You annotated the property ${propertyDescriptor.name} which is of type ${propertyDescriptor.type} with @Flags. This annotation is only applicable for Map<Enum, Boolean>.")
        }

        val enumValues = propertyDescriptor
            .type
            .arguments
            .first()
            .type
            .memberScope
            .getVariableNames()
            .map { it.asString() }
            .filter { it != "name" || it != "ordinal" }

        return join(enumValues, ",")
    }

    private fun getFileOrDirTypeHint(
        annotationDescriptor: AnnotationDescriptor,
        propertyDescriptor: PropertyDescriptor
    ): String {
        if (propertyDescriptor.type.toString() != "String") {
            throw IllegalStateException("You annotated the property ${propertyDescriptor.name} which is of type ${propertyDescriptor.type} with ${annotationDescriptor.fqName}. This annotation is only applicable to String.")
        }

        val extensions = annotationDescriptor
            .getAnnotationValue(FILE_AND_DIR_ANNOTATION_EXTENSIONS_ARGUMENT, ArrayList<StringValue>())
            .map { it.value.replace("\"", "") }

        return join(extensions, ",")
    }

    private fun getColorNoAlphaHintString(
        propertyDescriptor: PropertyDescriptor
    ): String {
        if (propertyDescriptor.type.toString() != "Color") {
            throw IllegalStateException("You annotated the property ${propertyDescriptor.name} which is of type ${propertyDescriptor.type} with @ColorNoAlpha. This annotation is only applicable to Color.")
        }

        return ""
    }
}
