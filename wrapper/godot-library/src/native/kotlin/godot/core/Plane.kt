@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import godot.gdnative.godot_plane
import kotlinx.cinterop.*
import kotlin.math.abs


actual class Plane: CoreType {
    actual enum class ClockDirection {
        CLOCKWISE,
        COUNTERCLOCKWISE
    }

    actual var normal: Vector3
    actual var d: Double = 0.0


    actual constructor(normal: Vector3, d: Number) {
        this.normal = normal
        this.d = d.toDouble()
    }

    actual constructor(point: Vector3, normal: Vector3) {
        this.normal = normal
        this.d = normal.dot(point)
    }

    actual constructor(point1: Vector3, point2: Vector3, point3: Vector3, dir: ClockDirection) {
        normal = if (dir == ClockDirection.CLOCKWISE)
            (point1 - point3).cross(point1 - point2)
        else
            (point1 - point2).cross(point1 - point3)

        normal.normalize()
        d = normal.dot(point1)
    }

    actual constructor(p1: Number, p2: Number, p3: Number, p4: Number) :
            this(Vector3(p1, p2, p3), p4)

    actual constructor() :
            this(Vector3(0,0,0), 0)



    internal constructor(native: CValue<godot_plane>) {
        normal = Vector3()
        memScoped {
            this@Plane.setRawMemory(native.ptr)
        }
    }
    internal constructor(mem: COpaquePointer) {
        normal = Vector3()
        this.setRawMemory(mem)
    }


    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return cValuesOf(normal[0].toFloat(), normal[1].toFloat(), normal[2].toFloat(), d.toFloat()).getPointer(memScope)
    }
    override fun setRawMemory(mem: COpaquePointer) {
        val arr = mem.reinterpret<FloatVar>()
        normal[0] = arr[0].toDouble()
        normal[1] = arr[1].toDouble()
        normal[2] = arr[2].toDouble()
        d = arr[3].toDouble()
    }


    override fun toString(): String = ""

    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Plane -> normal == other.normal && d == other.d
            else -> false
        }
    }

    override fun hashCode(): Int {
        var result = normal.hashCode()
        result = 31 * result + d.hashCode()
        return result
    }
}
