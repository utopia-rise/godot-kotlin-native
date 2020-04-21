package godot.core

import godot.gdnative.godot_array
import kotlinx.cinterop.CValue

class VariantArray<T>(val value: CValue<godot_array>) : AbstractMutableList<T>() {
    constructor(): this(new())

    override fun add(index: Int, element: T) {
        TODO("Not yet implemented")
    }

    override fun removeAt(index: Int): T {
        TODO("Not yet implemented")
    }

    override fun set(index: Int, element: T): T {
        TODO("Not yet implemented")
    }

    override val size: Int
        get() = TODO("Not yet implemented")

    override fun get(index: Int): T {
        TODO("Not yet implemented")
    }

    companion object {
        internal fun new(): CValue<godot_array> {
            TODO()
        }
    }
}

fun <T> variantArrayOf(vararg elements: T): VariantArray<T> {
    return VariantArray<T>().also {
        it.addAll(elements)
    }
}
