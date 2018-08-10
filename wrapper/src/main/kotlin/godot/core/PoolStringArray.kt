package kotlin.godot.core

import godot.*
import kotlinx.cinterop.*

class PoolStringArray : CoreType {
    internal var nativeValue = cValue<godot_pool_string_array> { godot_pool_string_array_new(this.ptr) }

    constructor()

    internal constructor(native: CValue<godot_pool_string_array>) {
        nativeValue = nativeValue.copy { godot_pool_string_array_new_copy(this.ptr, native) }
    }

    internal constructor(mem: COpaquePointer) {
        this.setRawMemory(mem)
    }

    constructor(other: PoolStringArray) {
        nativeValue = nativeValue.copy { godot_pool_string_array_new_copy(this.ptr, other.nativeValue) }
    }

    constructor(other: GodotArray) {
        nativeValue = nativeValue.copy { godot_pool_string_array_new_with_array(this.ptr, other.nativeValue) }
    }

    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return nativeValue.getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        nativeValue = mem.reinterpret<godot_pool_string_array>().pointed.readValue()
    }

    fun append(data: GodotString) {
        nativeValue = nativeValue.copy { godot_pool_string_array_append(this.ptr, data.nativeValue) }
    }

    fun append(data: String) {
        nativeValue = nativeValue.copy { godot_pool_string_array_append(this.ptr, GodotString(data).nativeValue) }
    }

    fun appendArray(data: GodotArray) {
        nativeValue = nativeValue.copy { godot_pool_string_array_new_with_array(this.ptr, data.nativeValue) }
    }

    fun insert(idx: Int, data: GodotString) {
        nativeValue = nativeValue.copy { godot_pool_string_array_insert(this.ptr, idx, data.nativeValue) }
    }

    fun insert(idx: Int, data: String) {
        nativeValue = nativeValue.copy { godot_pool_string_array_insert(this.ptr, idx, GodotString(data).nativeValue) }
    }

    fun invert() {
        nativeValue = nativeValue.copy { godot_pool_string_array_invert(this.ptr) }
    }

    fun pushBack(data: GodotString) {
        nativeValue = nativeValue.copy { godot_pool_string_array_push_back(this.ptr, data.nativeValue) }
    }

    fun pushBack(data: String) {
        nativeValue = nativeValue.copy { godot_pool_string_array_push_back(this.ptr, GodotString(data).nativeValue) }
    }

    fun remove(idx: Int) {
        nativeValue = nativeValue.copy { godot_pool_string_array_remove(this.ptr, idx) }
    }

    fun resize(size: Int) {
        nativeValue = nativeValue.copy { godot_pool_string_array_resize(this.ptr, size) }
    }

    fun set(idx: Int, data: GodotString) {
        nativeValue = nativeValue.copy { godot_pool_string_array_set(this.ptr, idx, data.nativeValue) }
    }

    fun set(idx: Int, data: String) {
        nativeValue = nativeValue.copy { godot_pool_string_array_set(this.ptr, idx, GodotString(data).nativeValue) }
    }

    operator fun get(idx: Int): GodotString = GodotString(godot_pool_string_array_get(nativeValue, idx))

    fun size(): Int = godot_pool_string_array_size(nativeValue)
}