@file:Suppress("EXPERIMENTAL_API_USAGE")

package godot.core

import godot.Object
import kotlin.reflect.KClass

private fun asBooleanTypeConverter(variantToConvert: Variant) = variantToConvert.asBoolean()
private fun asIntTypeConverter(variantToConvert: Variant) = variantToConvert.asInt()
private fun asLongTypeConverter(variantToConvert: Variant) = variantToConvert.asLong()
private fun asFloatTypeConverter(variantToConvert: Variant) = variantToConvert.asFloat()
private fun asDoubleTypeConverter(variantToConvert: Variant) = variantToConvert.asDouble()
private fun asStringTypeConverter(variantToConvert: Variant) = variantToConvert.asString()
private fun asVector2TypeConverter(variantToConvert: Variant) = variantToConvert.asVector2()
private fun asRect2TypeConverter(variantToConvert: Variant) = variantToConvert.asRect2()
private fun asVector3TypeConverter(variantToConvert: Variant) = variantToConvert.asVector3()
private fun asTransform2DTypeConverter(variantToConvert: Variant) = variantToConvert.asTransform2D()
private fun asPlaneTypeConverter(variantToConvert: Variant) = variantToConvert.asPlane()
private fun asQuatTypeConverter(variantToConvert: Variant) = variantToConvert.asQuat()
private fun asAABBTypeConverter(variantToConvert: Variant) = variantToConvert.asAABB()
private fun asBasisTypeConverter(variantToConvert: Variant) = variantToConvert.asBasis()
private fun asTransformTypeConverter(variantToConvert: Variant) = variantToConvert.asTransform()
private fun asColorTypeConverter(variantToConvert: Variant) = variantToConvert.asColor()
private fun asNodePathTypeConverter(variantToConvert: Variant) = variantToConvert.asNodePath()
private fun asRIDTypeConverter(variantToConvert: Variant) = variantToConvert.asRID()
private fun asObjectTypeConverter(variantToConvert: Variant) = variantToConvert.asObject()
private fun asDictionaryTypeConverter(variantToConvert: Variant) = variantToConvert.asDictionary()
private fun asVariantArrayTypeConverter(variantToConvert: Variant) = variantToConvert.asVariantArray()
private fun asBoolVariantArrayTypeConverter(variantToConvert: Variant) = variantToConvert.asBoolVariantArray()
private fun asIntVariantArrayTypeConverter(variantToConvert: Variant) = variantToConvert.asIntVariantArray()
private fun asRealVariantArrayTypeConverter(variantToConvert: Variant) = variantToConvert.asRealVariantArray()
private fun asStringVariantArrayTypeConverter(variantToConvert: Variant) = variantToConvert.asStringVariantArray()
private fun asAABBArrayTypeConverter(variantToConvert: Variant) = variantToConvert.asAABBArray()
private fun asBasisArrayTypeConverter(variantToConvert: Variant) = variantToConvert.asBasisArray()
private fun asColorArrayTypeConverter(variantToConvert: Variant) = variantToConvert.asColorArray()
private fun asNodePathArrayTypeConverter(variantToConvert: Variant) = variantToConvert.asNodePathArray()
private fun asPlaneArrayTypeConverter(variantToConvert: Variant) = variantToConvert.asPlaneArray()
private fun asQuatArrayTypeConverter(variantToConvert: Variant) = variantToConvert.asQuatArray()
private fun asRect2ArrayTypeConverter(variantToConvert: Variant) = variantToConvert.asRect2Array()
private fun asRIDArrayTypeConverter(variantToConvert: Variant) = variantToConvert.asRIDArray()
private fun asTransform2DArrayTypeConverter(variantToConvert: Variant) = variantToConvert.asTransform2DArray()
private fun asTransformArrayTypeConverter(variantToConvert: Variant) = variantToConvert.asTransformArray()
private fun asVector2ArrayTypeConverter(variantToConvert: Variant) = variantToConvert.asVector2Array()
private fun asVector3ArrayTypeConverter(variantToConvert: Variant) = variantToConvert.asVector3Array()
private fun asPoolByteArrayTypeConverter(variantToConvert: Variant) = variantToConvert.asPoolByteArray()
private fun asPoolIntArrayTypeConverter(variantToConvert: Variant) = variantToConvert.asPoolIntArray()
private fun asPoolRealArrayTypeConverter(variantToConvert: Variant) = variantToConvert.asPoolRealArray()
private fun asPoolStringArrayTypeConverter(variantToConvert: Variant) = variantToConvert.asPoolStringArray()
private fun asPoolVector2ArrayTypeConverter(variantToConvert: Variant) = variantToConvert.asPoolVector2Array()
private fun asPoolVector3ArrayTypeConverter(variantToConvert: Variant) = variantToConvert.asPoolVector3Array()
private fun asPoolColorArrayTypeConverter(variantToConvert: Variant) = variantToConvert.asPoolColorArray()

@PublishedApi
internal val typeConversionFunctions: Map<KClass<out Any>, (Variant) -> Any?> = mapOf(
    Boolean::class to ::asBooleanTypeConverter,
    Int::class to ::asIntTypeConverter,
    Long::class to ::asLongTypeConverter,
    Float::class to ::asFloatTypeConverter,
    Double::class to ::asDoubleTypeConverter,
    String::class to ::asStringTypeConverter,
    Vector2::class to ::asVector2TypeConverter,
    Rect2::class to ::asRect2TypeConverter,
    Vector3::class to ::asVector3TypeConverter,
    Transform2D::class to ::asTransform2DTypeConverter,
    Plane::class to ::asPlaneTypeConverter,
    Quat::class to ::asQuatTypeConverter,
    AABB::class to ::asAABBTypeConverter,
    Basis::class to ::asBasisTypeConverter,
    Transform::class to ::asTransformTypeConverter,
    Color::class to ::asColorTypeConverter,
    NodePath::class to ::asNodePathTypeConverter,
    RID::class to ::asRIDTypeConverter,
    Object::class to ::asObjectTypeConverter,
    Dictionary::class to ::asDictionaryTypeConverter,
    VariantArray::class to ::asVariantArrayTypeConverter,
    BoolVariantArray::class to ::asBoolVariantArrayTypeConverter,
    IntVariantArray::class to ::asIntVariantArrayTypeConverter,
    RealVariantArray::class to ::asRealVariantArrayTypeConverter,
    StringVariantArray::class to ::asStringVariantArrayTypeConverter,
    AABBArray::class to ::asAABBArrayTypeConverter,
    BasisArray::class to ::asBasisArrayTypeConverter,
    ColorArray::class to ::asColorArrayTypeConverter,
    NodePathArray::class to ::asNodePathArrayTypeConverter,
    PlaneArray::class to ::asPlaneArrayTypeConverter,
    QuatArray::class to ::asQuatArrayTypeConverter,
    Rect2Array::class to ::asRect2ArrayTypeConverter,
    RIDArray::class to ::asRIDArrayTypeConverter,
    Transform2DArray::class to ::asTransform2DArrayTypeConverter,
    TransformArray::class to ::asTransformArrayTypeConverter,
    Vector2Array::class to ::asVector2ArrayTypeConverter,
    Vector3Array::class to ::asVector3ArrayTypeConverter,
    PoolByteArray::class to ::asPoolByteArrayTypeConverter,
    PoolIntArray::class to ::asPoolIntArrayTypeConverter,
    PoolRealArray::class to ::asPoolRealArrayTypeConverter,
    PoolStringArray::class to ::asPoolStringArrayTypeConverter,
    PoolVector2Array::class to ::asPoolVector2ArrayTypeConverter,
    PoolVector3Array::class to ::asPoolVector3ArrayTypeConverter,
    PoolColorArray::class to ::asPoolColorArrayTypeConverter
)
