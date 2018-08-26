package model


fun String.castToVariant(value: String): String {
    return "Variant from $value"
}


fun String.isPrimitive(): Boolean {
    val primitives = listOf("Int", "Short", "Long", "Double", "Float", "Boolean")
    return primitives.find { s -> s == this } != null
}

fun String.isCoreType(): Boolean {
    val coreTypes = listOf(
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
            "Vector3")
    return coreTypes.find { s -> s == this } != null
}

fun String.castFromVariant(value: String): String {
    if (this == "Variant")
        return "Variant($value)"
    if (this.isCoreType() || this.isPrimitive())
        return "Variant($value).to$this()"
    return "$this from Variant($value)"
}


fun String.getVariantType(): String {
    return when (this) {
        else -> "Variant.Type.OBJECT" // TODO: types
    }
}