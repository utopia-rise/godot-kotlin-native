package godot.core

import godot.core.Variant
import godot.gdnative.godot_array
import godot.gdnative.godot_pool_byte_array
import kotlinx.cinterop.*

class VariantArray<T> : NativeCoreType<godot_array>, Iterable<T>  {
    //PROPERTIES
    val size: Int
        get() = this.size()

    //CONSTRUCTOR
    constructor() {
        callNative {
            checkNotNull(Godot.gdnative.godot_array_new)(it)
        }
    }

    constructor(other: VariantArray<T>) {
        callNative {
            checkNotNull(Godot.gdnative.godot_array_new_copy)(it, other._handle.ptr)
        }
    }

    constructor(other: PoolByteArray) {
        callNative {
            checkNotNull(Godot.gdnative.godot_array_new_pool_byte_array)(it, other._handle.ptr)
        }
    }

    constructor(other: PoolColorArray) {
        callNative {
            checkNotNull(Godot.gdnative.godot_array_new_pool_color_array)(it, other._handle.ptr)
        }
    }

    constructor(other: PoolIntArray) {
        callNative {
            checkNotNull(Godot.gdnative.godot_array_new_pool_int_array)(it, other._handle.ptr)
        }
    }

    constructor(other: PoolRealArray) {
        callNative {
            checkNotNull(Godot.gdnative.godot_array_new_pool_real_array)(it, other._handle.ptr)
        }
    }

    constructor(other: PoolStringArray) {
        callNative {
            checkNotNull(Godot.gdnative.godot_array_new_pool_string_array)(it, other._handle.ptr)
        }
    }

    constructor(other: PoolVector2Array) {
        callNative {
            checkNotNull(Godot.gdnative.godot_array_new_pool_vector2_array)(it, other._handle.ptr)
        }
    }

    constructor(other: PoolVector3Array) {
        callNative {
            checkNotNull(Godot.gdnative.godot_array_new_pool_vector3_array)(it, other._handle.ptr)
        }
    }


    internal constructor(native: CValue<godot_array>) {
        memScoped {
            this@VariantArray.setRawMemory(native.ptr)
        }
    }

    internal constructor(mem: COpaquePointer) {
        this.setRawMemory(mem)
    }

    //INTEROP
    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return _handle.getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        _handle = mem.reinterpret<godot_array>().pointed.readValue()
    }



    //API
    fun add(index: Int, element: T) {
        callNative {
            checkNotNull(Godot.gdnative.godot_array_insert)(it, index, element.toVariant()._handle.ptr )
        }
    }


    //UTILITIES
    fun T.toVariant() = Variant(this)

    override fun toVariant(): Variant {
        return Variant(this)
    }

    internal inline fun <T> callNative(block: MemScope.(CPointer<godot_array>) -> T): T {
        return callNative(this, block)
    }

    override fun iterator(): Iterator<T> {
        TODO("Not yet implemented")
    }
}

fun <T> variantArrayOf(vararg elements: T): VariantArray<T> {
    return VariantArray<T>().also {
        it.addAll(elements)
    }
}
