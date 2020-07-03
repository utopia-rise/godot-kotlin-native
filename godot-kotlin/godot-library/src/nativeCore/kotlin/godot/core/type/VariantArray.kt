package godot.core

import godot.core.Variant
import godot.gdnative.godot_array
import kotlinx.cinterop.*

class VariantArray<T> : NativeCoreType<godot_array>, AbstractMutableList<T>() {

    constructor()

    override fun add(index: Int, element: T) {
        callNative {
            checkNotNull(Godot.gdnative.godot_array_insert)(it, index, element.toVariant()._handle.ptr )
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
                    element.asVariant()._handle.ptr
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

    override fun T.toVariant() = Variant(this)

}

fun <T> variantArrayOf(vararg elements: T): VariantArray<T> {
    return VariantArray<T>().also {
        it.addAll(elements)
    }
}
