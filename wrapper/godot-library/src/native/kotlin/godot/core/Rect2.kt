@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import godot.gdnative.godot_rect2
import kotlinx.cinterop.*


actual class Rect2: CoreType {
    actual var position = Vector2()
    actual var size = Vector2()


    actual constructor()

    actual constructor(x: Number, y: Number, width: Number, height: Number) {
        position = Vector2(x, y)
        size = Vector2(width, height)
    }

    actual constructor(position: Vector2, size: Vector2) {
        this.position = position
        this.size = size
    }


    internal constructor(native: CValue<godot_rect2>) {
        memScoped {
            this@Rect2.setRawMemory(native.ptr)
        }
    }
    internal constructor(mem: COpaquePointer) {
        this.setRawMemory(mem)
    }


    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return cValuesOf(position[0].toFloat(), position[1].toFloat(), size[0].toFloat(), size[1].toFloat()).getPointer(memScope)
    }
    override fun setRawMemory(mem: COpaquePointer) {
        val arr = mem.reinterpret<FloatVar>()
        position[0] = arr[0].toDouble()
        position[1] = arr[1].toDouble()
        size[0] = arr[2].toDouble()
        size[1] = arr[3].toDouble()
    }



    override fun equals(other: Any?): Boolean =
            when (other) {
                is Rect2 -> position==other.position && size==other.size
                else     -> false
            }
    override fun toString(): String = "$position, $size"

    override fun hashCode(): Int {
        var result = position.hashCode()
        result = 31 * result + size.hashCode()
        return result
    }
}
