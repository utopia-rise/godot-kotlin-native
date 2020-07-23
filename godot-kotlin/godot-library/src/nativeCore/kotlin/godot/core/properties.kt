package godot.core

import godot.Object
import godot.internal.type.NaturalT
import godot.internal.type.toNaturalT
import kotlin.reflect.KMutableProperty1

open class MutablePropertyHandler<T : Object, R>(protected val property: KMutableProperty1<T, R>) {
    open fun get(instance: T): Variant {
        return Variant.wrap(
            property.get(instance)
        )
    }

    open fun set(instance: T, value: Variant) {
        property.set(instance, value.unwrap())
    }
}

class MutableEnumPropertyHandler<T : Object, R : Enum<R>>(
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

class MutableEnumFlagPropertyHandler<T : Object, R : Enum<R>>(
    property: KMutableProperty1<T, Set<R>>,
    private val converter: (NaturalT) -> R?
) : MutablePropertyHandler<T, Set<R>>(property) {
    override fun get(instance: T): Variant {
        var intFlag = 0
        property.get(instance).forEach { enum ->
            intFlag += 1 shl enum.ordinal
        }

        return Variant.wrap(
            intFlag
        )
    }

    override fun set(instance: T, value: Variant) {
        val intFlag = value.asInt()

        val enums = mutableSetOf<R>()
        var bit = 1

        for (i in 0 until Int.SIZE_BITS) {
            if ((intFlag and bit) > 0) {
                val element = converter(i.toNaturalT())
                if (element != null) {
                    enums.add(element)
                }
            }
            bit = bit shl 1
            if (bit > intFlag) break
        }

        property.set(instance, enums)
    }
}
