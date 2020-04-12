package godot.core

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

class MutableEnumProperty<T: Object, R: Enum<R>>(
    property: KMutableProperty1<T, R>,
    private val converter: (String) -> R
) : MutablePropertyHandler<T, R>(property) {
    override fun get(instance: T): Variant {
        return Variant(
            property.get(instance).toString()
        )
    }

    override fun set(instance: T, value: Variant) {
        property.set(instance, converter(value.asString()))
    }
}
