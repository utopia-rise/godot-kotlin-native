package godot.core

import kotlin.reflect.KClass

@ExperimentalUnsignedTypes
@PublishedApi
internal data class VariantMapper<T>  constructor(
    val toGodot: (T) -> Variant,
    val toKotlin: (Variant) -> T,
    val type: VariantType?
)

@ExperimentalUnsignedTypes
@PublishedApi
internal val variantMappers = mapOf<KClass<*>, VariantMapper<*>>(
    Any::class to VariantMapper(Variant.Companion::wrap, Variant::unwrap, null),
    Boolean::class to VariantMapper(Boolean::toVariant, Variant::asBoolean, VariantType.BOOL),
    Int::class to VariantMapper(Int::toVariant, Variant::asInt, VariantType.INT),
    Long::class to VariantMapper(Long::toVariant, Variant::asLong, VariantType.INT),
    Float::class to VariantMapper(Float::toVariant, Variant::asFloat, VariantType.REAL),
    Double::class to VariantMapper(Double::toVariant, Variant::asDouble, VariantType.REAL),
    String::class to VariantMapper(String::toVariant, Variant::asString, VariantType.STRING),
    AABB::class to VariantMapper(AABB::toVariant, Variant::asAABB, VariantType.AABB),
    Basis::class to VariantMapper(Basis::toVariant, Variant::asBasis, VariantType.BASIS),
    Color::class to VariantMapper(Color::toVariant, Variant::asColor, VariantType.COLOR),
    Dictionary::class to VariantMapper(Dictionary<*, *>::toVariant, Variant::asDictionary, VariantType.DICTIONARY),
    GodotArray::class to VariantMapper(GodotArray<*>::toVariant, Variant::asArray, VariantType.ARRAY),
    Plane::class to VariantMapper(Plane::toVariant, Variant::asPlane, VariantType.PLANE),
    NodePath::class to VariantMapper(NodePath::toVariant, Variant::asNodePath, VariantType.NODE_PATH),
    Quat::class to VariantMapper(Quat::toVariant, Variant::asQuat, VariantType.QUAT),
    Rect2::class to VariantMapper(Rect2::toVariant, Variant::asRect2, VariantType.RECT2),
    RID::class to VariantMapper(RID::toVariant, Variant::asRID, VariantType.RID),
    Transform::class to VariantMapper(Transform::toVariant, Variant::asTransform, VariantType.TRANSFORM),
    Transform2D::class to VariantMapper(Transform2D::toVariant, Variant::asTransform2D, VariantType.TRANSFORM2D),
    Vector2::class to VariantMapper(Vector2::toVariant, Variant::asVector2, VariantType.VECTOR2),
    Vector3::class to VariantMapper(Vector3::toVariant, Variant::asVector3, VariantType.VECTOR3),
    PoolByteArray::class to VariantMapper(PoolByteArray::toVariant, Variant::asPoolByteArray, VariantType.POOL_BYTE_ARRAY),
    PoolColorArray::class to VariantMapper(PoolColorArray::toVariant, Variant::asPoolColorArray, VariantType.POOL_COLOR_ARRAY),
    PoolIntArray::class to VariantMapper(PoolIntArray::toVariant, Variant::asPoolIntArray, VariantType.POOL_INT_ARRAY),
    PoolRealArray::class to VariantMapper(PoolRealArray::toVariant, Variant::asPoolRealArray, VariantType.POOL_REAL_ARRAY),
    PoolStringArray::class to VariantMapper(PoolStringArray::toVariant, Variant::asPoolStringArray, VariantType.POOL_STRING_ARRAY),
    PoolVector2Array::class to VariantMapper(PoolVector2Array::toVariant, Variant::asPoolVector2Array, VariantType.POOL_VECTOR2_ARRAY),
    PoolVector3Array::class to VariantMapper(PoolVector3Array::toVariant, Variant::asPoolVector3Array, VariantType.POOL_VECTOR3_ARRAY)

)
