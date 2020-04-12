package godot.entrygenerator.mapper

import com.squareup.kotlinpoet.ClassName
import org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor

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

    fun mapAnnotationDescriptorToPropertyHintString(annotationDescriptor: AnnotationDescriptor?): String {
        TODO()
        return when (annotationDescriptor?.fqName?.asString()) {
            "godot.annotation.IntRange" -> getRangeTypeHint(annotationDescriptor)
            "godot.annotation.FloatRange" -> ""
            "godot.annotation.DoubleRange" -> ""
            "godot.annotation.ExpRange" -> ""
            "godot.annotation.EnumTypeHint" -> ""
            "godot.annotation.ExpEasing" -> ""
            "godot.annotation.Lenght" -> ""
            "godot.annotation.Flags" -> ""
            "godot.annotation.Layers2DRender" -> ""
            "godot.annotation.Layers2DPhysics" -> ""
            "godot.annotation.Layers3DRender" -> ""
            "godot.annotation.Layers3DPhysics" -> ""
            "godot.annotation.File" -> ""
            "godot.annotation.Dir" -> ""
            "godot.annotation.ResourceType" -> ""
            "godot.annotation.MultilineText" -> ""
            "godot.annotation.PlaceHolderText" -> ""
            "godot.annotation.ColorNoAlpha" -> ""
            "godot.annotation.ImageCompressLossy" -> ""
            "godot.annotation.ImageCompressLossLess" -> ""
            "godot.annotation.ObjectId" -> ""
            "godot.annotation.TypeString" -> ""
            "godot.annotation.NodePathToEditedNode" -> ""
            "godot.annotation.MethodOfVariantType" -> ""
            "godot.annotation.MethodOfBaseType" -> ""
            "godot.annotation.MethodOfInstance" -> ""
            "godot.annotation.MethodOfScript" -> ""
            "godot.annotation.PropertyOfVariantType" -> ""
            "godot.annotation.PropertyOfBaseType" -> ""
            "godot.annotation.PropertyOfInstance" -> ""
            "godot.annotation.PropertyOfScript" -> ""
            "godot.annotation.ObjectTooBig" -> ""
            "godot.annotation.NodePathValidTypes" -> ""
            "godot.annotation.SaveFile" -> ""
            "godot.annotation.IntIsObjectId" -> ""
            "godot.annotation.Max" -> ""
            null -> ""
            else -> throw IllegalStateException("Unknown annotation ${annotationDescriptor.fqName}")
        }
    }

    private fun getRangeTypeHint(annotationDescriptor: AnnotationDescriptor): String {
        TODO()
    }
}
