package godot.entrygenerator.mapper

import com.squareup.kotlinpoet.ClassName
import godot.entrygenerator.extension.isCompatibleList
import org.jetbrains.kotlin.types.KotlinType

object TypeToVariantAsClassNameMapper {

    fun mapTypeToVariantAsClassName(
        typeAsString: String,
        type: KotlinType? = null,
        isEnum: Boolean = false
    ): ClassName {

        if (isEnum) {
            return ClassName("godot.core.VariantType", "STRING")
        }

        return when (typeAsString) {
            "Byte", "Short", "Int", "Long" -> ClassName("godot.core.VariantType", "INT")
            "Float", "Double" -> ClassName("godot.core.VariantType", "REAL")
            "Boolean" -> ClassName("godot.core.VariantType", "BOOL")
            "String" -> ClassName("godot.core.VariantType", "STRING")
            "RID" -> ClassName("godot.core.VariantType", "_RID")
            "Vector2", "Rect2", "Vector3", "Transform2D", "Plane", "Quat", "Rect3", "Basis", "Transform", "Color", "Dictionary" ->
                ClassName("godot.core.VariantType", typeAsString.toUpperCase())
            "NodePath" -> ClassName("godot.core.VariantType", "NODE_PATH")
            "PoolByteArray" -> ClassName("godot.core.VariantType", "POOL_BYTE_ARRAY")
            "PoolIntArray" -> ClassName("godot.core.VariantType", "POOL_INT_ARRAY")
            "PoolReadArray" -> ClassName("godot.core.VariantType", "POOL_REAL_ARRAY")
            "PoolStringArray" -> ClassName("godot.core.VariantType", "POOL_STRING_ARRAY")
            "PoolVector2Array" -> ClassName("godot.core.VariantType", "POOL_VECTOR2_ARRAY")
            "PoolVector3Array" -> ClassName("godot.core.VariantType", "POOL_VECTOR3_ARRAY")
            "PoolColorArray" -> ClassName("godot.core.VariantType", "POOL_COLOR_ARRAY")
            else -> {
                if (type != null && type.isCompatibleList()) {
                    ClassName("godot.core.VariantType", "ARRAY")
                } else {
                    ClassName("godot.core.VariantType", "OBJECT")
                }
            }
        }
    }
}
