package godot.entrygenerator.mapper

import com.squareup.kotlinpoet.ClassName
import godot.entrygenerator.extension.getAnnotationValue
import godot.entrygenerator.model.*
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor
import org.jetbrains.kotlin.name.ClassId
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.name.Name
import org.jetbrains.kotlin.types.typeUtil.isEnum
import org.jetbrains.kotlin.utils.join
import kotlin.reflect.KClass

object PropertyHintTypeMapper {

    fun mapAnnotationDescriptorToPropertyTypeClassName(annotationDescriptor: AnnotationDescriptor?): ClassName {
        return when (annotationDescriptor?.fqName?.asString()) {
            "godot.annotation.IntRange" -> ClassName("godot.registration.PropertyHint", "INT_RANGE")
            "godot.annotation.FloatRange" -> ClassName("godot.registration.PropertyHint", "FLOAT_RANGE")
            "godot.annotation.DoubleRange" -> ClassName("godot.registration.PropertyHint", "DOUBLE_RANGE")
            "godot.annotation.ExpRange" -> ClassName("godot.registration.PropertyHint", "EXP_RANGE")
            "godot.annotation.EnumTypeHint" -> ClassName("godot.registration.PropertyHint", "ENUM_TYPEHINT")
            "godot.annotation.ExpEasing" -> ClassName("godot.registration.PropertyHint", "EXP_EASING")
            "godot.annotation.Lenght" -> ClassName("godot.registration.PropertyHint", "LENGHT")
            "godot.annotation.Flags" -> ClassName("godot.registration.PropertyHint", "FLAGS")
            "godot.annotation.Layers2DRender" -> ClassName("godot.registration.PropertyHint", "LAYERS_2D_RENDER")
            "godot.annotation.Layers2DPhysics" -> ClassName("godot.registration.PropertyHint", "LAYERS_2D_PHYSICS")
            "godot.annotation.Layers3DRender" -> ClassName("godot.registration.PropertyHint", "LAYERS_3D_RENDER")
            "godot.annotation.Layers3DPhysics" -> ClassName("godot.registration.PropertyHint", "LAYERS_3D_PHYSICS")
            "godot.annotation.File" -> ClassName("godot.registration.PropertyHint", "FILE")
            "godot.annotation.Dir" -> ClassName("godot.registration.PropertyHint", "DIR")
            "godot.annotation.ResourceType" -> ClassName("godot.registration.PropertyHint", "RESOURCE_TYPE")
            "godot.annotation.MultilineText" -> ClassName("godot.registration.PropertyHint", "MULTILINE_TEXT")
            "godot.annotation.PlaceHolderText" -> ClassName("godot.registration.PropertyHint", "PLACE_HOLDER_TEXT")
            "godot.annotation.ColorNoAlpha" -> ClassName("godot.registration.PropertyHint", "COLOR_NO_ALPHA")
            "godot.annotation.ImageCompressLossy" -> ClassName(
                "godot.registration.PropertyHint",
                "IMAGE_COMPRESS_LOSSY"
            )
            "godot.annotation.ImageCompressLossLess" -> ClassName(
                "godot.registration.PropertyHint",
                "IMAGE_COMPRESS_LOSSLESS"
            )
            "godot.annotation.ObjectId" -> ClassName("godot.registration.PropertyHint", "OBJECT_ID")
            "godot.annotation.TypeString" -> ClassName("godot.registration.PropertyHint", "TYPE_STRING")
            "godot.annotation.NodePathToEditedNode" -> ClassName(
                "godot.registration.PropertyHint",
                "NODEPATH_TO_EDITED_NODE"
            )
            "godot.annotation.MethodOfVariantType" -> ClassName(
                "godot.registration.PropertyHint",
                "METHOD_OF_VARIANT_TYPE"
            )
            "godot.annotation.MethodOfBaseType" -> ClassName("godot.registration.PropertyHint", "METHOD_OF_BASE_TYPE")
            "godot.annotation.MethodOfInstance" -> ClassName("godot.registration.PropertyHint", "METHOD_OF_INSTANCE")
            "godot.annotation.MethodOfScript" -> ClassName("godot.registration.PropertyHint", "METHOD_OF_SCRIPT")
            "godot.annotation.PropertyOfVariantType" -> ClassName(
                "godot.registration.PropertyHint",
                "PROPERTY_OF_VARIANT_TYPE"
            )
            "godot.annotation.PropertyOfBaseType" -> ClassName(
                "godot.registration.PropertyHint",
                "PROPERTY_OF_BASE_TYPE"
            )
            "godot.annotation.PropertyOfInstance" -> ClassName(
                "godot.registration.PropertyHint",
                "PROPERTY_OF_INSTANCE"
            )
            "godot.annotation.PropertyOfScript" -> ClassName("godot.registration.PropertyHint", "PROPERTY_OF_SCRIPT")
            "godot.annotation.ObjectTooBig" -> ClassName("godot.registration.PropertyHint", "OBJECT_TOO_BIG")
            "godot.annotation.NodePathValidTypes" -> ClassName(
                "godot.registration.PropertyHint",
                "NODEPATH_VALID_TYPES"
            )
            "godot.annotation.SaveFile" -> ClassName("godot.registration.PropertyHint", "SAVE_FILE")
            "godot.annotation.IntIsObjectId" -> ClassName("godot.registration.PropertyHint", "INT_IS_OBJECT_ID")
            "godot.annotation.Max" -> ClassName("godot.registration.PropertyHint", "MAX")
            null -> ClassName("godot.registration.PropertyHint", "NONE")
            else -> throw IllegalStateException("Unknown annotation ${annotationDescriptor.fqName}")
        }
    }

    fun mapAnnotationDescriptorToPropertyHintString(
        propertyDescriptor: PropertyDescriptor,
        annotationDescriptor: AnnotationDescriptor?
    ): Pair<String, Array<Any>> {
        if (!propertyDescriptor.annotations.getAnnotationValue(
                REGISTER_PROPERTY_ANNOTATION,
                REGISTER_PROPERTY_ANNOTATION_VISIBLE_IN_EDITOR_ARGUMENT,
                false
            ) && annotationDescriptor != null
        ) {
            throw IllegalStateException("You added the type hint annotation ${annotationDescriptor.fqName} to the property ${propertyDescriptor.name}. But the @RegisterProperty annotation is either not present or the isVisibleInEditor flag is not set to true")
        }
        return when (annotationDescriptor?.fqName?.asString()) {
            "godot.annotation.IntRange" -> getRangeTypeHint(
                annotationDescriptor,
                arrayOf(Int::class),
                propertyDescriptor
            )
            "godot.annotation.FloatRange" -> getRangeTypeHint(
                annotationDescriptor,
                arrayOf(Float::class),
                propertyDescriptor
            )
            "godot.annotation.DoubleRange" -> getRangeTypeHint(
                annotationDescriptor,
                arrayOf(Double::class),
                propertyDescriptor
            )
            "godot.annotation.ExpRange" -> getRangeTypeHint(
                annotationDescriptor,
                arrayOf(Float::class, Double::class),
                propertyDescriptor
            )
            "godot.annotation.EnumTypeHint" -> getEnumTypeHint(propertyDescriptor, true)
            "godot.annotation.ExpEasing" -> getExpEasingTypeHint(annotationDescriptor, propertyDescriptor)
            "godot.annotation.Lenght" -> getLengthTypeHint(annotationDescriptor, propertyDescriptor)
            "godot.annotation.Flags" -> getFlagsTypeHint(annotationDescriptor, propertyDescriptor)
            "godot.annotation.Layers2DRender" -> TODO()
            "godot.annotation.Layers2DPhysics" -> TODO()
            "godot.annotation.Layers3DRender" -> TODO()
            "godot.annotation.Layers3DPhysics" -> TODO()
            "godot.annotation.File" -> TODO()
            "godot.annotation.Dir" -> TODO()
            "godot.annotation.ResourceType" -> TODO()
            "godot.annotation.MultilineText" -> TODO()
            "godot.annotation.PlaceHolderText" -> TODO()
            "godot.annotation.ColorNoAlpha" -> TODO()
            "godot.annotation.ImageCompressLossy" -> TODO()
            "godot.annotation.ImageCompressLossLess" -> TODO()
            "godot.annotation.ObjectId" -> TODO()
            "godot.annotation.TypeString" -> TODO()
            "godot.annotation.NodePathToEditedNode" -> TODO()
            "godot.annotation.MethodOfVariantType" -> TODO()
            "godot.annotation.MethodOfBaseType" -> TODO()
            "godot.annotation.MethodOfInstance" -> TODO()
            "godot.annotation.MethodOfScript" -> TODO()
            "godot.annotation.PropertyOfVariantType" -> TODO()
            "godot.annotation.PropertyOfBaseType" -> TODO()
            "godot.annotation.PropertyOfInstance" -> TODO()
            "godot.annotation.PropertyOfScript" -> TODO()
            "godot.annotation.ObjectTooBig" -> TODO()
            "godot.annotation.NodePathValidTypes" -> TODO()
            "godot.annotation.SaveFile" -> TODO()
            "godot.annotation.IntIsObjectId" -> TODO()
            "godot.annotation.Max" -> TODO()
            null -> Pair("", arrayOf())
            else -> throw IllegalStateException("Unknown annotation ${annotationDescriptor.fqName}")
        }
    }

    private fun mapCompilerEnumRepresentationToClassName(enumRepresentation: Pair<ClassId, Name>): ClassName {
        return ClassName(
            enumRepresentation.first.asString().replace(".${enumRepresentation.second}", ""),
            enumRepresentation.second.asString()
        )
    }

    private fun getRangeTypeHint(
        annotationDescriptor: AnnotationDescriptor,
        expectedTypes: Array<KClass<*>>,
        propertyDescriptor: PropertyDescriptor
    ): Pair<String, Array<Any>> {
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
        val argumentsForVarargArray = mutableListOf<Any>()

        argumentsForStringTemplate.add(start)
        argumentsForStringTemplate.add(end)
        if (step != -1) {
            argumentsForStringTemplate.add(step)
        }
        if (orAsClassName.toString() != "godot.registration.Range.NONE") {
            argumentsForStringTemplate.add("%T")
            argumentsForVarargArray.add(orAsClassName)
        }

        return Pair(join(argumentsForStringTemplate, ","), argumentsForVarargArray.toTypedArray())
    }

    fun getEnumTypeHint(propertyDescriptor: PropertyDescriptor, asInt: Boolean = false): Pair<String, Array<Any>> {
        if (!propertyDescriptor.type.isEnum()) {
            throw IllegalStateException("You annotated the property ${propertyDescriptor.name} which is of type ${propertyDescriptor.type} with @EnumTypeHint. Only enums can have this annotation!")
        }

        val enumValues = propertyDescriptor
            .type
            .memberScope
            .getVariableNames()
            .map { it.asString() }
            .filter { it != "name" || it != "ordinal" }

        val values = mutableListOf<Any>()

        if (asInt) {
            enumValues.forEachIndexed { index, _ ->
                values.add(index)
            }
        } else {
            enumValues.forEach {
                values.add(it)
            }
        }

        return Pair(join(values, ","), arrayOf())
    }

    private fun getExpEasingTypeHint(
        annotationDescriptor: AnnotationDescriptor,
        propertyDescriptor: PropertyDescriptor
    ): Pair<String, Array<Any>> {
        if (listOf(Float::class, Double::class).map { it.toString() }.contains(propertyDescriptor.type.toString())) {
            throw IllegalStateException("You annotated the property ${propertyDescriptor.name} which is of type ${propertyDescriptor.type} with @ExpEasing. This annotation is only applicable for Floats and Doubles.")
        }

        val attenuation = annotationDescriptor.getAnnotationValue(EXP_EASING_ANNOTATION_ATTENUATION_ARGUMENT, false)
        val inout = annotationDescriptor.getAnnotationValue(EXP_EASING_ANNOTATION_INOUT_ARGUMENT, true)

        val stringTemplate = when {
            attenuation && inout -> "attenuation,inout"
            attenuation -> "attenuation"
            inout -> "inout"
            else -> ""
        }

        return Pair(stringTemplate, arrayOf())
    }

    private fun getLengthTypeHint(
        annotationDescriptor: AnnotationDescriptor,
        propertyDescriptor: PropertyDescriptor
    ): Pair<String, Array<Any>> {
        if (listOf(Float::class, Double::class).map { it.toString() }.contains(propertyDescriptor.type.toString())) {
            throw IllegalStateException("You annotated the property ${propertyDescriptor.name} which is of type ${propertyDescriptor.type} with @Length. This annotation is only applicable for Floats and Doubles.")
        }

        val length = annotationDescriptor.getAnnotationValue(LENGTH_ANNOTATION_LENGTH_ARGUMENT, -1)

        return if (length != -1) {
            Pair("$length", arrayOf())
        } else {
            Pair("", arrayOf())
        }
    }

    private fun getFlagsTypeHint(
        annotationDescriptor: AnnotationDescriptor,
        propertyDescriptor: PropertyDescriptor
    ): Pair<String, Array<Any>> {
        if (listOf(Float::class, Double::class).map { it.toString() }.contains(propertyDescriptor.type.toString())) {
            throw IllegalStateException("You annotated the property ${propertyDescriptor.name} which is of type ${propertyDescriptor.type} with @ExpEasing. This annotation is only applicable for Floats and Doubles.")
        }

        TODO()
    }
}
