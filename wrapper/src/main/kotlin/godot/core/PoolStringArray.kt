package godot.core

import godot.gdnative.*
import kotlinx.cinterop.*


class PoolStringArray : CoreType {
    override fun isNull(): Boolean = false // TODO: make me beautiful


    internal var nativeValue = cValue<godot_pool_string_array> {}

    constructor() {
        nativeValue = nativeValue.copy { godot_pool_string_array_new(this.ptr) }
    }

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

    fun append(data: String) {
        nativeValue = nativeValue.copy { godot_pool_string_array_append(this.ptr, data.toGDString()) }
    }

    fun appendArray(data: GodotArray) {
        nativeValue = nativeValue.copy { godot_pool_string_array_new_with_array(this.ptr, data.nativeValue) }
    }

    fun insert(idx: Int, data: String) {
        nativeValue = nativeValue.copy { godot_pool_string_array_insert(this.ptr, idx, data.toGDString()) }
    }

    fun invert() {
        nativeValue = nativeValue.copy { godot_pool_string_array_invert(this.ptr) }
    }

    fun pushBack(data: String) {
        nativeValue = nativeValue.copy { godot_pool_string_array_push_back(this.ptr, data.toGDString()) }
    }

    fun remove(idx: Int) {
        nativeValue = nativeValue.copy { godot_pool_string_array_remove(this.ptr, idx) }
    }

    fun resize(size: Int) {
        nativeValue = nativeValue.copy { godot_pool_string_array_resize(this.ptr, size) }
    }

    fun set(idx: Int, data: String) {
        nativeValue = nativeValue.copy { godot_pool_string_array_set(this.ptr, idx, data.toGDString()) }
    }

    operator fun get(idx: Int): String = godot_pool_string_array_get(nativeValue, idx).toKString()

    fun size(): Int = godot_pool_string_array_size(nativeValue)
}