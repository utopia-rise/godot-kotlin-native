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
        "kotlin.Boolean" -> "godot.core.VariantType.BOOL.ordinal"
        "kotlin.Int",
        "kotlin.Long",
        "kotlin.Byte",
        "kotlin.Short",
        "kotlin.Enum" -> "godot.core.VariantType.INT.ordinal"
        "kotlin.Float",
        "kotlin.Double" -> "godot.core.VariantType.REAL.ordinal"
        "kotlin.String" -> "godot.core.VariantType.STRING.ordinal"
        "godot.core.Vector2" -> "godot.core.VariantType.VECTOR2.ordinal"
        "godot.core.Rect2" -> "godot.core.VariantType.RECT2.ordinal"
        "godot.core.Vector3" -> "godot.core.VariantType.VECTOR3.ordinal"
        "godot.core.Transform2D" -> "godot.core.VariantType.TRANSFORM2D.ordinal"
        "godot.core.Plane" -> "godot.core.VariantType.PLANE.ordinal"
        "godot.core.Quat" -> "godot.core.VariantType.QUAT.ordinal"
        "godot.core.AABB" -> "godot.core.VariantType.AABB.ordinal"
        "godot.core.Basis" -> "godot.core.VariantType.BASIS.ordinal"
        "godot.core.Transform" -> "godot.core.VariantType.TRANSFORM.ordinal"
        "godot.core.Color" -> "godot.core.VariantType.COLOR.ordinal"
        "godot.core.NodePath" -> "godot.core.VariantType.NODE_PATH.ordinal"
        "godot.core.RID" -> "godot.core.VariantType.RID.ordinal"
        "godot.core.OBJECT" -> "godot.core.VariantType.OBJECT.ordinal"
        "godot.core.Dictionary" -> "godot.core.VariantType.DICTIONARY.ordinal"
        //Array -> handled in else branch
        "godot.core.PoolByteArray" -> "godot.core.VariantType.POOL_BYTE_ARRAY.ordinal"
        "godot.core.PoolIntArray" -> "godot.core.VariantType.POOL_INT_ARRAY.ordinal"
        "godot.core.PoolRealArray" -> "godot.core.VariantType.POOL_REAL_ARRAY.ordinal"
        "godot.core.PoolStringArray" -> "godot.core.VariantType.POOL_STRING_ARRAY.ordinal"
        "godot.core.PoolColorArray" -> "godot.core.VariantType.POOL_COLOR_ARRAY.ordinal"
        "godot.core.PoolVector2Array" -> "godot.core.VariantType.POOL_VECTOR2_ARRAY.ordinal"
        "godot.core.PoolVector3Array" -> "godot.core.VariantType.POOL_VECTOR3_ARRAY.ordinal"
        else -> if (this.isCompatibleListType()) {
            "godot.core.VariantType.ARRAY.ordinal"
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
