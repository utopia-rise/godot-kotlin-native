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
        "kotlin.Short" -> true
        else -> false
    }

fun String.getAsGodotPrimitive() =
    when (this) {
        "kotlin.Int",
        "kotlin.Long",
        "kotlin.Byte",
        "kotlin.Short",
        "kotlin.Enum" -> "int"
        "kotlin.Float",
        "kotlin.Double" -> "float"
        "kotlin.Boolean" -> "bool"
        else -> null
    }

fun String.getCompatibleListType(): String {
    return when(this) {
        "godot.core.ObjectArray" -> "Object"
        "godot.core.EnumArray",
        "godot.core.IntVariantArray" -> "int"
        "godot.core.BoolVariantArray" -> "bool"
        "godot.core.RealVariantArray" -> "float"
        "godot.core.StringVariantArray" -> "string"
        "godot.core.AABBArray" -> "AABB"
        "godot.core.BasisArray" -> "Basis"
        "godot.core.ColorArray" -> "Color"
        "godot.core.CoreArray" -> "Core"
        "godot.core.NodePathArray" -> "NodePath"
        "godot.core.PlaneArray" -> "Plane"
        "godot.core.QuatArray" -> "Quat"
        "godot.core.Rect2Array" -> "Rect2"
        "godot.core.RIDArray" -> "RID"
        "godot.core.Transform2DArray" -> "Transform2D"
        "godot.core.TransformArray" -> "Transform"
        "godot.core.Vector2Array" -> "Vector2"
        "godot.core.Vector3Array" -> "Vector3"
        else -> ""
    }
}
