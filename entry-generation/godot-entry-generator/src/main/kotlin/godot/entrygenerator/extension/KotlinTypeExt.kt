package godot.entrygenerator.extension

import org.jetbrains.kotlin.types.KotlinType
import org.jetbrains.kotlin.types.typeUtil.supertypes


fun KotlinType.isCoreType(): Boolean {
    return coreTypes.contains(this.toString())
}

fun KotlinType.isResource(): Boolean {
    return this.toString() == "GodotResource"
        || this
        .supertypes()
        .any { it.toString() == "GodotResource" }
}

private val coreTypes = listOf(
    "GDArray",
    "Basis",
    "Color",
    "Dictionary",
    "GodotError",
    "NodePath",
    "Plane",
    "PoolByteArray",
    "PoolIntArray",
    "PoolRealArray",
    "PoolStringArray",
    "PoolVector2Array",
    "PoolVector3Array",
    "PoolColorArray",
    "PoolIntArray",
    "PoolRealArray",
    "Quat",
    "Rect2",
    "AABB",
    "RID",
    "String",
    "Transform",
    "Transform2D",
    "Variant",
    "Vector2",
    "Vector3"
)
