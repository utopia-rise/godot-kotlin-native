@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import godot.gdnative.*
import kotlinx.cinterop.*

actual class PoolVector3Array : CoreType {
    internal var nativeValue = cValue<godot_pool_vector3_array> {}


    actual constructor() {
        nativeValue = nativeValue.copy { godot_pool_vector3_array_new(this.ptr) }
    }

    actual constructor(other: PoolVector3Array) {
        nativeValue = nativeValue.copy { godot_pool_vector3_array_new_copy(this.ptr, other.nativeValue) }
    }

    actual constructor(other: GDArray) {
        nativeValue = nativeValue.copy { godot_pool_vector3_array_new_with_array(this.ptr, other.nativeValue) }
    }


    internal constructor(native: CValue<godot_pool_vector3_array>) {
        nativeValue = nativeValue.copy { godot_pool_vector3_array_new_copy(this.ptr, native) }
    }
    internal constructor(mem: COpaquePointer) {
        this.setRawMemory(mem)
    }


    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return nativeValue.getPointer(memScope)
    }
    override fun setRawMemory(mem: COpaquePointer) {
        nativeValue = mem.reinterpret<godot_pool_vector3_array>().pointed.readValue()
    }



    actual fun append(data: Vector3) {
        memScoped {
            nativeValue = nativeValue.copy { godot_pool_vector3_array_append(this.ptr, data.getRawMemory(memScope).reinterpret()) }
        }
    }

    actual fun appendArray(data: PoolVector3Array) {
        nativeValue = nativeValue.copy { godot_pool_vector3_array_append_array(this.ptr, data.nativeValue) }
    }

    actual fun insert(idx: Int, data: Vector3) {
        memScoped {
            nativeValue = nativeValue.copy { godot_pool_vector3_array_insert(this.ptr, idx, data.getRawMemory(memScope).reinterpret()) }
        }
    }

    actual fun invert() {
        nativeValue = nativeValue.copy { godot_pool_vector3_array_invert(this.ptr) }
    }

    actual fun pushBack(data: Vector3) {
        memScoped {
            nativeValue = nativeValue.copy { godot_pool_vector3_array_push_back(this.ptr, data.getRawMemory(memScope).reinterpret()) }
        }
    }

    actual fun remove(idx: Int) {
        nativeValue = nativeValue.copy { godot_pool_vector3_array_remove(this.ptr, idx) }
    }

    actual fun resize(size: Int) {
        nativeValue = nativeValue.copy { godot_pool_vector3_array_resize(this.ptr, size) }
    }

    actual fun set(idx: Int, data: Vector3) {
        memScoped {
            nativeValue = nativeValue.copy { godot_pool_vector3_array_set(this.ptr, idx, data.getRawMemory(memScope).reinterpret()) }
        }
    }

    actual operator fun get(idx: Int): Vector3 = Vector3(godot_pool_vector3_array_get(nativeValue, idx))

    actual fun size(): Int = godot_pool_vector3_array_size(nativeValue)
}
