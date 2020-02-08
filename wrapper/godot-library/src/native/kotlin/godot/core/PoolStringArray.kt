@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import godot.gdnative.*
import kotlinx.cinterop.*


actual class PoolStringArray : CoreType {
    internal var nativeValue = cValue<godot_pool_string_array> {}


    actual constructor() {
        nativeValue = nativeValue.copy { godot_pool_string_array_new(this.ptr) }
    }

    actual constructor(other: PoolStringArray) {
        nativeValue = nativeValue.copy { godot_pool_string_array_new_copy(this.ptr, other.nativeValue) }
    }

    actual constructor(other: GDArray) {
        nativeValue = nativeValue.copy { godot_pool_string_array_new_with_array(this.ptr, other.nativeValue) }
    }


    internal constructor(native: CValue<godot_pool_string_array>) {
        nativeValue = nativeValue.copy { godot_pool_string_array_new_copy(this.ptr, native) }
    }
    internal constructor(mem: COpaquePointer) {
        this.setRawMemory(mem)
    }


    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return nativeValue.getPointer(memScope)
    }
    override fun setRawMemory(mem: COpaquePointer) {
        nativeValue = mem.reinterpret<godot_pool_string_array>().pointed.readValue()
    }



    actual fun append(data: String) {
        nativeValue = nativeValue.copy { godot_pool_string_array_append(this.ptr, data.toGDString()) }
    }

    actual fun appendArray(data: GDArray) {
        nativeValue = nativeValue.copy { godot_pool_string_array_new_with_array(this.ptr, data.nativeValue) }
    }

    actual fun insert(idx: Int, data: String) {
        nativeValue = nativeValue.copy { godot_pool_string_array_insert(this.ptr, idx, data.toGDString()) }
    }

    actual fun invert() {
        nativeValue = nativeValue.copy { godot_pool_string_array_invert(this.ptr) }
    }

    actual fun pushBack(data: String) {
        nativeValue = nativeValue.copy { godot_pool_string_array_push_back(this.ptr, data.toGDString()) }
    }

    actual fun remove(idx: Int) {
        nativeValue = nativeValue.copy { godot_pool_string_array_remove(this.ptr, idx) }
    }

    actual fun resize(size: Int) {
        nativeValue = nativeValue.copy { godot_pool_string_array_resize(this.ptr, size) }
    }

    actual fun set(idx: Int, data: String) {
        nativeValue = nativeValue.copy { godot_pool_string_array_set(this.ptr, idx, data.toGDString()) }
    }

    actual operator fun get(idx: Int): String = godot_pool_string_array_get(nativeValue, idx).toKString()

    actual fun size(): Int = godot_pool_string_array_size(nativeValue)
}
