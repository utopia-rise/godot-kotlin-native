@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import godot.gdnative.*
import kotlinx.cinterop.*

class PoolColorArray : CoreType {
    internal var nativeValue = cValue<godot_pool_color_array> {}

    constructor() {
        nativeValue = nativeValue.copy { godot_pool_color_array_new(this.ptr) }
    }

    constructor(other: PoolColorArray) {
        nativeValue = nativeValue.copy { godot_pool_color_array_new_copy(this.ptr, other.nativeValue) }
    }

    constructor(other: GDArray) {
        nativeValue = nativeValue.copy { godot_pool_color_array_new_with_array(this.ptr, other.nativeValue) }
    }


    internal constructor(native: CValue<godot_pool_color_array>) {
        nativeValue = nativeValue.copy { godot_pool_color_array_new_copy(this.ptr, native) }
    }
    internal constructor(mem: COpaquePointer) {
        this.setRawMemory(mem)
    }


    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return nativeValue.getPointer(memScope)
    }
    override fun setRawMemory(mem: COpaquePointer) {
        nativeValue = mem.reinterpret<godot_pool_color_array>().pointed.readValue()
    }


    fun append(data: Color) {
        memScoped {
            nativeValue = nativeValue.copy { godot_pool_color_array_append(this.ptr, data.getRawMemory(memScope).reinterpret()) }
        }
    }

    fun appendArray(data: PoolColorArray) {
        nativeValue = nativeValue.copy { godot_pool_color_array_append_array(this.ptr, data.nativeValue) }
    }

    fun insert(idx: Int, data: Color) {
        memScoped {
            nativeValue = nativeValue.copy { godot_pool_color_array_insert(this.ptr, idx, data.getRawMemory(memScope).reinterpret()) }
        }
    }

    fun invert() {
        nativeValue = nativeValue.copy { godot_pool_color_array_invert(this.ptr) }
    }

    fun pushBack(data: Color) {
        memScoped {
            nativeValue = nativeValue.copy { godot_pool_color_array_push_back(this.ptr, data.getRawMemory(memScope).reinterpret()) }
        }
    }

    fun remove(idx: Int) {
        nativeValue = nativeValue.copy { godot_pool_color_array_remove(this.ptr, idx) }
    }

    fun resize(size: Int) {
        nativeValue = nativeValue.copy { godot_pool_color_array_resize(this.ptr, size) }
    }

    fun set(idx: Int, data: Color) {
        memScoped {
            nativeValue = nativeValue.copy { godot_pool_color_array_set(this.ptr, idx, data.getRawMemory(memScope).reinterpret()) }
        }
    }

    operator fun get(idx: Int): Color = Color(godot_pool_color_array_get(nativeValue, idx))

    fun size(): Int = godot_pool_color_array_size(nativeValue)
}