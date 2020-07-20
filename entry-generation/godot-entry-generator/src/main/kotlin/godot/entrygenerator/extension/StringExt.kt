package godot.entrygenerator.extension

fun String.isString() = this == "kotlin.String"

fun String.isGodotPrimitive() =
    when (this) {
        "kotlin.Int" -> true
        "kotlin.Long" -> true
        "kotlin.Float" -> true
        "kotlin.Double" -> true
        "kotlin.Boolean" -> true
        "kotlin.Byte" -> true
        "kotlin.Short" -> true
        else -> false
    }

fun String.getAsGodotPrimitive() =
    when (this) {
        "kotlin.Int" -> "int"
        "kotlin.Long" -> "int"
        "kotlin.Float" -> "float"
        "kotlin.Double" -> "float"
        "kotlin.Boolean" -> "bool"
        "kotlin.Byte" -> "int"
        "kotlin.Short" -> "int"
        "kotlin.Enum" -> "int"
        else -> null
    }

fun String.isCompatibleList(): Boolean {
    return when(this) {
        "godot.core.VariantArray" -> true
        "godot.core.ObjectArray" -> true
        "godot.core.EnumArray" -> true
        "godot.core.BoolVariantArray" -> true
        "godot.core.IntVariantArray" -> true
        "godot.core.RealVariantArray" -> true
        "godot.core.StringVariantArray" -> true
        "godot.core.AABBArray" -> true
        "godot.core.BasisArray" -> true
        "godot.core.ColorArray" -> true
        "godot.core.CoreArray" -> true
        "godot.core.NodePathArray" -> true
        "godot.core.PlaneArray" -> true
        "godot.core.QuatArray" -> true
        "godot.core.Rect2Array" -> true
        "godot.core.RIDArray" -> true
        "godot.core.Transform2DArray" -> true
        "godot.core.TransformArray" -> true
        "godot.core.Vector2Array" -> true
        "godot.core.Vector3Array" -> true
        else -> false
    }
}

fun String.getCompatibleListType(): String {
    return when(this) {
//        "godot.core.VariantArray" -> "Variant"
        "godot.core.ObjectArray" -> "Object"
        "godot.core.EnumArray" -> "int"
        "godot.core.BoolVariantArray" -> "bool"
        "godot.core.IntVariantArray" -> "int"
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
