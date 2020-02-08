@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import godot.gdnative.godot_transform2d
import kotlinx.cinterop.*
import kotlin.math.acos
import kotlin.math.atan2
import kotlin.math.cos
import kotlin.math.sin


actual class Transform2D: CoreType {
    // Warning #1: basis of Transform2D is stored differently from Basis. In terms of elements array, the basis matrix looks like "on paper":
    // M = (elements[0][0] elements[1][0])
    //     (elements[0][1] elements[1][1])
    // This is such that the columns, which can be interpreted as basis vectors of the coordinate system "painted" on the object, can be accessed as elements[i].
    // Note that this is the opposite of the indices in mathematical texts, meaning: $M_{12}$ in a math book corresponds to elements[1][0] here.
    // This requires additional care when working with explicit indices.
    // See https://en.wikipedia.org/wiki/Row-_and_column-major_order for further reading.

    // Warning #2: 2D be aware that unlike 3D code, 2D code uses a left-handed coordinate system: Y-axis points down,
    // and angle is measure from +X to +Y in a clockwise-fashion.

    actual var elements: Array<Vector2> =
            arrayOf(Vector2(), Vector2(), Vector2())


    actual constructor(xx: Number, xy: Number, yx: Number, yy: Number, ox: Number, oy: Number) {
        elements[0][0] = xx.toDouble()
        elements[0][1] = xy.toDouble()
        elements[1][0] = yx.toDouble()
        elements[1][1] = yy.toDouble()
        elements[2][0] = ox.toDouble()
        elements[2][1] = oy.toDouble()
    }

    actual constructor(rot: Number, pos: Vector2) {
        val cr = cos(rot.toDouble())
        val sr = sin(rot.toDouble())
        elements[0][0] = cr
        elements[0][1] = sr
        elements[1][0] = -sr
        elements[1][1] = cr
        elements[2] = pos
    }

    actual constructor() {
        elements[0][0] = 1.0
        elements[1][1] = 1.0
    }


    internal constructor(native: CValue<godot_transform2d>) {
        memScoped {
            this@Transform2D.setRawMemory(native.ptr)
        }
    }
    internal constructor(mem: COpaquePointer) {
        this.setRawMemory(mem)
    }


    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return cValuesOf(elements[0][0].toFloat(), elements[0][1].toFloat(), elements[1][0].toFloat(), 
                         elements[1][1].toFloat(), elements[2][0].toFloat(), elements[2][1].toFloat()).getPointer(memScope)
    }
    override fun setRawMemory(mem: COpaquePointer) {
        val arr = mem.reinterpret<FloatVar>()
        elements[0][0] = arr[0].toDouble()
        elements[0][1] = arr[1].toDouble()
        elements[1][0] = arr[2].toDouble()
        elements[1][1] = arr[3].toDouble()
        elements[2][0] = arr[4].toDouble()
        elements[2][1] = arr[5].toDouble()
    }


    override fun equals(other: Any?): Boolean =
        when(other) {
            is Transform2D -> elements[0] == other[0] && elements[1] == other[1] && elements[2] == other[2]
            else -> false
        }

    override fun toString() = "${elements[0]}, ${elements[1]}, ${elements[2]}"

    override fun hashCode(): Int = this.toString().hashCode()
}
