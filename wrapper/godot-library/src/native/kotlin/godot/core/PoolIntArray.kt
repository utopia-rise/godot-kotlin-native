@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import godot.gdnative.*
import kotlinx.cinterop.*

actual class PoolIntArray : CoreType {
    internal var nativeValue = cValue<godot_pool_int_array> {}


    actual constructor() {
        nativeValue = nativeValue.copy { godot_pool_int_array_new(this.ptr) }
    }

    actual constructor(other: PoolIntArray) {
        nativeValue = nativeValue.copy { godot_pool_int_array_new_copy(this.ptr, other.nativeValue) }
    }

    actual constructor(other: GDArray) {
        nativeValue = nativeValue.copy { godot_pool_int_array_new_with_array(this.ptr, other.nativeValue) }
    }



    internal constructor(native: CValue<godot_pool_int_array>) {
        nativeValue = nativeValue.copy { godot_pool_int_array_new_copy(this.ptr, native) }
    }
    internal constructor(mem: COpaquePointer) {
        this.setRawMemory(mem)
    }


    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return nativeValue.getPointer(memScope)
    }
    override fun setRawMemory(mem: COpaquePointer) {
        nativeValue = mem.reinterpret<godot_pool_int_array>().pointed.readValue()
    }



    actual fun append(data: Int) {
        nativeValue = nativeValue.copy { godot_pool_int_array_append(this.ptr, data) }
    }

    actual fun appendArray(data: PoolIntArray) {
        nativeValue = nativeValue.copy { godot_pool_int_array_append_array(this.ptr, data.nativeValue) }
    }

    actual fun insert(idx: Int, data: Int) {
        nativeValue = nativeValue.copy { godot_pool_int_array_insert(this.ptr, idx, data) }
    }

    actual fun invert() {
        nativeValue = nativeValue.copy { godot_pool_int_array_invert(this.ptr) }
    }

    actual fun pushBack(data: Int) {
        nativeValue = nativeValue.copy { godot_pool_int_array_push_back(this.ptr, data) }
    }

    actual fun remove(idx: Int) {
        nativeValue = nativeValue.copy { godot_pool_int_array_remove(this.ptr, idx) }
    }

    actual fun resize(size: Int) {
        nativeValue = nativeValue.copy { godot_pool_int_array_resize(this.ptr, size) }
    }

    actual fun set(idx: Int, data: Int) {
        nativeValue = nativeValue.copy { godot_pool_int_array_set(this.ptr, idx, data) }
    }

    actual operator fun get(idx: Int): Int = godot_pool_int_array_get(nativeValue, idx)

    actual fun size(): Int = godot_pool_int_array_size(nativeValue)
}
