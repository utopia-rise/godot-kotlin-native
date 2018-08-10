package kotlin.godot.core

import godot.*
import kotlinx.cinterop.*

class PoolByteArray : CoreType {
    internal var nativeValue = cValue<godot_pool_byte_array> { godot_pool_byte_array_new(this.ptr) }

    constructor()

    internal constructor(native: CValue<godot_pool_byte_array>) {
        nativeValue = nativeValue.copy { godot_pool_byte_array_new_copy(this.ptr, native) }
    }

    internal constructor(mem: COpaquePointer) {
        this.setRawMemory(mem)
    }

    constructor(other: PoolByteArray) {
        nativeValue = nativeValue.copy { godot_pool_byte_array_new_copy(this.ptr, other.nativeValue) }
    }

    constructor(other: GodotArray) {
        nativeValue = nativeValue.copy { godot_pool_byte_array_new_with_array(this.ptr, other.nativeValue) }
    }

    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return nativeValue.getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        nativeValue = mem.reinterpret<godot_pool_byte_array>().pointed.readValue()
    }

    fun append(data: Byte) {
        nativeValue = nativeValue.copy { godot_pool_byte_array_append(this.ptr, data) }
    }

    fun appendArray(data: PoolByteArray) {
        nativeValue = nativeValue.copy { godot_pool_byte_array_append_array(this.ptr, data.nativeValue) }
    }

    fun insert(idx: Int, data: Byte) {
        nativeValue = nativeValue.copy { godot_pool_byte_array_insert(this.ptr, idx, data) }
    }

    fun invert() {
        nativeValue = nativeValue.copy { godot_pool_byte_array_invert(this.ptr) }
    }

    fun pushBack(data: Byte) {
        nativeValue = nativeValue.copy { godot_pool_byte_array_push_back(this.ptr, data) }
    }

    fun remove(idx: Int) {
        nativeValue = nativeValue.copy { godot_pool_byte_array_remove(this.ptr, idx) }
    }

    fun resize(size: Int) {
        nativeValue = nativeValue.copy { godot_pool_byte_array_resize(this.ptr, size) }
    }

    fun set(idx: Int, data: Byte) {
        nativeValue = nativeValue.copy { godot_pool_byte_array_set(this.ptr, idx, data) }
    }

    operator fun get(idx: Int): Byte = godot_pool_byte_array_get(nativeValue, idx)

    fun size(): Int = godot_pool_byte_array_size(nativeValue)
}