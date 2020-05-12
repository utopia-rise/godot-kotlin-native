package godot.core

import godot.core.type.Variant
import godot.gdnative.godot_array
import kotlinx.cinterop.*

class VariantArray<T> internal constructor(internal val handle: CValue<godot_array>) : AbstractMutableList<T>() {
    constructor(): this(new())

    override fun add(index: Int, element: T) {
        memScoped {
            checkNotNull(Godot.gdnative.godot_array_insert)(
                handle.ptr,
                index,
                element.asVariant().handle.ptr
            )
        }
    }

    override fun removeAt(index: Int): T {
        return get(index).also {
            memScoped {
                checkNotNull(Godot.gdnative.godot_array_remove)(
                    handle.ptr,
                    index
                )
            }
        }
    }

    override fun set(index: Int, element: T): T {
        return get(index).also {
            memScoped {
                checkNotNull(Godot.gdnative.godot_array_set)(
                    handle.ptr,
                    index,
                    element.asVariant().handle.ptr
                )
            }
        }
    }

    override val size: Int
        get() = memScoped {
            checkNotNull(Godot.gdnative.godot_array_size)(
                handle.ptr
            )
        }

    override fun get(index: Int): T {
        return memScoped {
            Variant(
                checkNotNull(Godot.gdnative.godot_array_get)(
                    handle.ptr,
                    index
                )
            ).unwrap()
        }
    }

    private fun T.asVariant() = Variant.wrap(this)

    companion object {
        internal fun new(): CValue<godot_array> {
            return memScoped {
                val handle = alloc<godot_array>()
                checkNotNull(Godot.gdnative.godot_array_new)(handle.ptr)
                handle.readValue()
            }
        }
    }
}

fun <T> variantArrayOf(vararg elements: T): VariantArray<T> {
    return VariantArray<T>().also {
        it.addAll(elements)
    }
}
