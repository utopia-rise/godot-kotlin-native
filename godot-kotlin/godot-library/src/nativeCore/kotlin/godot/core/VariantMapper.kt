package godot.core

import kotlin.reflect.KClass

internal data class VariantMapper<T>(
    val toGodot: (T) -> Variant,
    val toKotlin: (Variant) -> T
)

internal val variantMappers = mapOf<KClass<*>, VariantMapper<*>>(
    Int::class to VariantMapper(Int::toVariant, Variant::asInt),
    Int::class to VariantMapper(Int::toVariant, Variant::asInt),
    Int::class to VariantMapper(Int::toVariant, Variant::asInt),
    Int::class to VariantMapper(Int::toVariant, Variant::asInt),
    Int::class to VariantMapper(Int::toVariant, Variant::asInt),
    Int::class to VariantMapper(Int::toVariant, Variant::asInt),
    Int::class to VariantMapper(Int::toVariant, Variant::asInt),
    Int::class to VariantMapper(Int::toVariant, Variant::asInt),
    Int::class to VariantMapper(Int::toVariant, Variant::asInt),
    Int::class to VariantMapper(Int::toVariant, Variant::asInt),
    Int::class to VariantMapper(Int::toVariant, Variant::asInt),
    Int::class to VariantMapper(Int::toVariant, Variant::asInt),
    Int::class to VariantMapper(Int::toVariant, Variant::asInt),
    AABB::class to VariantMapper(AABB::toVariant, Variant::asAABB)
)
