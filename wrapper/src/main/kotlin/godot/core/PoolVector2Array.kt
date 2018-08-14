package kotlin.godot.core

import godot.*
import kotlinx.cinterop.*

class PoolVector2Array : CoreType {
    internal var nativeValue = cValue<godot_pool_vector2_array> {}

    constructor() {
        nativeValue = nativeValue.copy { godot_pool_vector2_array_new(this.ptr) }
    }

    internal constructor(native: CValue<godot_pool_vector2_array>) {
        nativeValue = nativeValue.copy { godot_pool_vector2_array_new_copy(this.ptr, native) }
    }

    internal constructor(mem: COpaquePointer) {
        this.setRawMemory(mem)
    }

    constructor(other: PoolVector2Array) {
        nativeValue = nativeValue.copy { godot_pool_vector2_array_new_copy(this.ptr, other.nativeValue) }
    }

    constructor(other: GodotArray) {
        nativeValue = nativeValue.copy { godot_pool_vector2_array_new_with_array(this.ptr, other.nativeValue) }
    }

    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return nativeValue.getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        nativeValue = mem.reinterpret<godot_pool_vector2_array>().pointed.readValue()
    }

    fun append(data: Vector2) {
        memScoped {
            nativeValue = nativeValue.copy { godot_pool_vector2_array_append(this.ptr, data.getRawMemory(memScope).reinterpret()) }
        }
    }

    fun appendArray(data: PoolVector2Array) {
        nativeValue = nativeValue.copy { godot_pool_vector2_array_append_array(this.ptr, data.nativeValue) }
    }

    fun insert(idx: Int, data: Vector2) {
        memScoped {
            nativeValue = nativeValue.copy { godot_pool_vector2_array_insert(this.ptr, idx, data.getRawMemory(memScope).reinterpret()) }
        }
    }

    fun invert() {
        nativeValue = nativeValue.copy { godot_pool_vector2_array_invert(this.ptr) }
    }

    fun pushBack(data: Vector2) {
        memScoped {
            nativeValue = nativeValue.copy { godot_pool_vector2_array_push_back(this.ptr, data.getRawMemory(memScope).reinterpret()) }
        }
    }

    fun remove(idx: Int) {
        nativeValue = nativeValue.copy { godot_pool_vector2_array_remove(this.ptr, idx) }
    }

    fun resize(size: Int) {
        nativeValue = nativeValue.copy { godot_pool_vector2_array_resize(this.ptr, size) }
    }

    fun set(idx: Int, data: Vector2) {
        memScoped {
            nativeValue = nativeValue.copy { godot_pool_vector2_array_set(this.ptr, idx, data.getRawMemory(memScope).reinterpret()) }
        }
    }

    operator fun get(idx: Int): Vector2 = Vector2(godot_pool_vector2_array_get(nativeValue, idx))

    fun size(): Int = godot_pool_vector2_array_size(nativeValue)
}