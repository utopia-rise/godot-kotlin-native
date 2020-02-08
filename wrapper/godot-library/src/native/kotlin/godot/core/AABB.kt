@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import godot.gdnative.*
import kotlinx.cinterop.*


actual class AABB: CoreType {
    actual var position: Vector3
    actual var size: Vector3


    actual constructor(p_pos: Vector3, p_size: Vector3) {
        position = p_pos
        size = p_size
    }

    actual constructor() :
            this(Vector3(), Vector3())



    internal constructor(native: CValue<godot_aabb>) {
        position = Vector3()
        size = Vector3()

        memScoped {
            this@AABB.setRawMemory(native.ptr)
        }
    }

    internal constructor(mem: COpaquePointer) {
        position = Vector3()
        size = Vector3()

        this.setRawMemory(mem)
    }



    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return cValuesOf(position[0].toFloat(), position[1].toFloat(), position[2].toFloat(),
                         size[0].toFloat(), size[1].toFloat(), size[2].toFloat()).getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        val arr = mem.reinterpret<FloatVar>()
        position[0] = arr[0].toDouble()
        position[1] = arr[1].toDouble()
        position[2] = arr[2].toDouble()
        size[0] = arr[3].toDouble()
        size[1] = arr[4].toDouble()
        size[2] = arr[5].toDouble()
    }


    override fun equals(other: Any?): Boolean =
            when (other) {
                is AABB -> (position == other.position && size == other.size)
                else -> false
            }

    override fun toString(): String =
            "$position - $size"

    override fun hashCode(): Int {
        var result = position.hashCode()
        result = 31 * result + size.hashCode()
        return result
    }
}
