package godot.entrygenerator.extension

import org.jetbrains.kotlin.js.descriptorUtils.getJetTypeFqName
import org.jetbrains.kotlin.types.KotlinType
import org.jetbrains.kotlin.types.typeUtil.supertypes


fun KotlinType.isCoreType(): Boolean {
    return coreTypes.contains(this.toString())
}

fun KotlinType.isResource(): Boolean {
    return this.getJetTypeFqName(false) == "godot.Resource"
        || this
        .supertypes()
        .map { it.getJetTypeFqName(false) }
        .any { it == "godot.Resource" }
}

fun KotlinType.isVariantArray(): Boolean {
    return this.getJetTypeFqName(false) == "godot.core.VariantArray"
        || this
        .supertypes()
        .map { it.getJetTypeFqName(false) }
        .any { it == "godot.core.VariantArray" }
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
