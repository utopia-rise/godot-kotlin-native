package godot.entrygenerator.extension

fun String.isString() = this == "kotlin.String"

fun String.isGodotPrimitive() =
    when (this) {
        "kotlin.Int",
        "kotlin.Long",
        "kotlin.Float",
        "kotlin.Double",
        "kotlin.Boolean",
        "kotlin.Byte",
        "kotlin.Short",
        "kotlin.String" -> true
        else -> false
    }

fun String.getAsVariantTypeOrdinal() =
    when (this) {
        "kotlin.Boolean" -> "godot.core.VariantType.BOOL.value"
        "kotlin.Int",
        "kotlin.Long",
        "kotlin.Byte",
        "kotlin.Short",
        "kotlin.Enum" -> "godot.core.VariantType.INT.value"
        "kotlin.Float",
        "kotlin.Double" -> "godot.core.VariantType.REAL.value"
        "kotlin.String" -> "godot.core.VariantType.STRING.value"
        "godot.core.Vector2" -> "godot.core.VariantType.VECTOR2.value"
        "godot.core.Rect2" -> "godot.core.VariantType.RECT2.value"
        "godot.core.Vector3" -> "godot.core.VariantType.VECTOR3.value"
        "godot.core.Transform2D" -> "godot.core.VariantType.TRANSFORM2D.value"
        "godot.core.Plane" -> "godot.core.VariantType.PLANE.value"
        "godot.core.Quat" -> "godot.core.VariantType.QUAT.value"
        "godot.core.AABB" -> "godot.core.VariantType.AABB.value"
        "godot.core.Basis" -> "godot.core.VariantType.BASIS.value"
        "godot.core.Transform" -> "godot.core.VariantType.TRANSFORM.value"
        "godot.core.Color" -> "godot.core.VariantType.COLOR.value"
        "godot.core.NodePath" -> "godot.core.VariantType.NODE_PATH.value"
        "godot.core.RID" -> "godot.core.VariantType.RID.value"
        "godot.core.OBJECT" -> "godot.core.VariantType.OBJECT.value"
        "godot.core.Dictionary" -> "godot.core.VariantType.DICTIONARY.value"
        //Array -> handled in else branch
        "godot.core.PoolByteArray" -> "godot.core.VariantType.POOL_BYTE_ARRAY.value"
        "godot.core.PoolIntArray" -> "godot.core.VariantType.POOL_INT_ARRAY.value"
        "godot.core.PoolRealArray" -> "godot.core.VariantType.POOL_REAL_ARRAY.value"
        "godot.core.PoolStringArray" -> "godot.core.VariantType.POOL_STRING_ARRAY.value"
        "godot.core.PoolColorArray" -> "godot.core.VariantType.POOL_COLOR_ARRAY.value"
        "godot.core.PoolVector2Array" -> "godot.core.VariantType.POOL_VECTOR2_ARRAY.value"
        "godot.core.PoolVector3Array" -> "godot.core.VariantType.POOL_VECTOR3_ARRAY.value"
        else -> if (this.isCompatibleListType()) {
            "godot.core.VariantType.ARRAY.value"
        } else {
            null
        }
    }

fun String.isCompatibleListType(): Boolean {
    return this.getCompatibleListType().isNotEmpty()
}

fun String.getCompatibleListType(): String {
    return when(this) {
        "godot.core.BoolVariantArray" -> "1"
        "godot.core.EnumArray",
        "godot.core.IntVariantArray" -> "2"
        "godot.core.RealVariantArray" -> "3"
        "godot.core.StringVariantArray" -> "4"
        "godot.core.Vector2Array" -> "5"
        "godot.core.Rect2Array" -> "6"
        "godot.core.Vector3Array" -> "7"
        "godot.core.Transform2DArray" -> "8"
        "godot.core.PlaneArray" -> "9"
        "godot.core.QuatArray" -> "10"
        "godot.core.AABBArray" -> "11"
        "godot.core.BasisArray" -> "12"
        "godot.core.TransformArray" -> "13"
        "godot.core.ColorArray" -> "14"
        "godot.core.NodePathArray" -> "15"
        "godot.core.RIDArray" -> "16"
        "godot.core.ObjectArray",
        "godot.core.CoreArray" -> "17"
        else -> ""
    }
}
