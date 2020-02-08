package org.godotengine.kotlin.entrygenerator.mapper

import com.squareup.kotlinpoet.ClassName

class TypeHintMapper {
    companion object {
        fun mapTypeHintToClassName(typeHintAsString: String): ClassName {
            return when(typeHintAsString) {
                "None" -> ClassName("godot.registration", "None")
                "Range" -> ClassName("godot.registration", "Range")
                "ExpRange" -> ClassName("godot.registration", "ExpRange")
                "Enum" -> ClassName("godot.registration", "Enum")
                "ExpEasing" -> ClassName("godot.registration", "ExpEasing")
                "Length" -> ClassName("godot.registration", "Length")
                "SpriteFrame" -> ClassName("godot.registration", "SpriteFrame")
                "KeyAccel" -> ClassName("godot.registration", "KeyAccel")
                "Flags" -> ClassName("godot.registration", "Flags")
                "Layers2dRender" -> ClassName("godot.registration", "Layers2dRender")
                "Layers2dPhysics" -> ClassName("godot.registration", "Layers2dPhysics")
                "Layers3dRender" -> ClassName("godot.registration", "Layers3dRender")
                "Layers3dPhysics" -> ClassName("godot.registration", "Layers3dPhysics")
                "File" -> ClassName("godot.registration", "File")
                "Dir" -> ClassName("godot.registration", "Dir")
                "GlobalFile" -> ClassName("godot.registration", "GlobalFile")
                "GlobalDir" -> ClassName("godot.registration", "GlobalDir")
                "ResourceType" -> ClassName("godot.registration", "ResourceType")
                "MultilineText" -> ClassName("godot.registration", "MultilineText")
                "PlaceholderText" -> ClassName("godot.registration", "PlaceholderText")
                "ColorNoAlpha" -> ClassName("godot.registration", "ColorNoAlpha")
                "ImageCompressLossy" -> ClassName("godot.registration", "ImageCompressLossy")
                "ImageCompressLossless" -> ClassName("godot.registration", "ImageCompressLossless")
                "ObjectId" -> ClassName("godot.registration", "ObjectId")
                "TypeString" -> ClassName("godot.registration", "TypeString")
                "NodePathToEditedNode" -> ClassName("godot.registration", "NodePathToEditedNode")
                "MethodOfVariantType" -> ClassName("godot.registration", "MethodOfVariantType")
                "MethodOfBaseType" -> ClassName("godot.registration", "MethodOfBaseType")
                "MethodOfInstance" -> ClassName("godot.registration", "MethodOfInstance")
                "MethodOfScript" -> ClassName("godot.registration", "MethodOfScript")
                "PropertyOfVariantType" -> ClassName("godot.registration", "PropertyOfVariantType")
                "PropertyOfBaseType" -> ClassName("godot.registration", "PropertyOfBaseType")
                "PropertyOfInstance" -> ClassName("godot.registration", "PropertyOfInstance")
                "PropertyOfScript" -> ClassName("godot.registration", "PropertyOfScript")
                "Max" -> ClassName("godot.registration", "Max")
                else -> throw IllegalArgumentException("Unknown typeHint provided: $typeHintAsString")
            }
        }
    }
}