package godot.entrygenerator.extension

import org.jetbrains.kotlin.js.descriptorUtils.getJetTypeFqName
import org.jetbrains.kotlin.types.KotlinType
import org.jetbrains.kotlin.types.typeUtil.supertypes


fun KotlinType.isCoreType(): Boolean {
    return coreTypes.contains(this.toString())
}

fun KotlinType.getAsCoreType(): String {
    return coreTypes.first { it == this.toString() }
}

fun KotlinType.isResource(): Boolean {
    return this.getJetTypeFqName(false) == "godot.Resource"
        || this
        .supertypes()
        .map { it.getJetTypeFqName(false) }
        .any { it == "godot.Resource" }
}

fun KotlinType.isCompatibleList(): Boolean {
    return if (getJetTypeFqName(false) == "godot.core.GodotArray") {
        true
    } else {
        supertypes().forEach { supertype ->
            if (supertype.getJetTypeFqName(false) == "godot.core.GodotArray") {
                return true
            }
        }
        return false
    }
}

fun KotlinType.getCompatibleListType(): String {
    return getJetTypeFqName(false).getCompatibleListType()
}

private val coreTypes = listOf(
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
