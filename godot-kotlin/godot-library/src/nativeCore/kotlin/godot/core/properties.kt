package godot.core

import godot.core.type.Variant
import kotlin.reflect.KMutableProperty1

open class MutablePropertyHandler<T: Object, R>(protected val property: KMutableProperty1<T, R>) {
    open fun get(instance: T): Variant {
        return Variant.wrap(
            property.get(instance)
        )
    }

    open fun set(instance: T, value: Variant) {
        property.set(instance, value.unwrap())
    }
}

class MutableEnumPropertyHandler<T: Object, R: Enum<R>>(
    property: KMutableProperty1<T, R>,
    private val converter: (Int) -> R
) : MutablePropertyHandler<T, R>(property) {
    override fun get(instance: T): Variant {
        return Variant(
            property.get(instance).ordinal
        )
    }

    override fun set(instance: T, value: Variant) {
        property.set(instance, converter(value.asInt()))
    }
}

class MutableEnumFlagPropertyHandler<T: Object, R: Enum<R>>(
    property: KMutableProperty1<T, Set<R>>,
    private val converter: (Int) -> R
) : MutablePropertyHandler<T, Set<R>>(property) {
    override fun get(instance: T): Variant {
        val variantArray = variantArrayOf<Int>()
        property.get(instance).forEach { enum -> variantArray.add(enum.ordinal) }
        return Variant.wrap(
            variantArray
        )
    }

    override fun set(instance: T, value: Variant) {
        val transformedValue = value.asVariantArray<Int>().map(converter)
            .toSet()
        property.set(instance, transformedValue)
    }
}
