@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import godot.gdnative.godot_transform
import kotlinx.cinterop.*


actual class Transform: CoreType {
    actual var basis: Basis
    actual var origin: Vector3


    actual constructor():
            this(Basis())

    actual constructor(basis: Basis, origin: Vector3) {
        this.basis = basis
        this.origin = origin
    }

    actual constructor(xx: Number, xy: Number, xz: Number, yx: Number, yy: Number, yz: Number, zx: Number, zy: Number, zz: Number, tx: Number, ty: Number, tz: Number):
            this(Basis(Vector3(xx,xy,xz), Vector3(yx,yy,yz), Vector3(zx,zy,zz)), Vector3(tx,ty,tz))


    internal constructor(native: CValue<godot_transform>) {
        basis = Basis()
        origin = Vector3()

        memScoped {
            this@Transform.setRawMemory(native.ptr)
        }
    }

    internal constructor(mem: COpaquePointer) {
        basis = Basis()
        origin = Vector3()

        this.setRawMemory(mem)
    }


    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return cValuesOf(basis[0][0].toFloat(), basis[0][1].toFloat(), basis[0][2].toFloat(), basis[1][0].toFloat(),
                basis[1][1].toFloat(), basis[1][2].toFloat(), basis[2][0].toFloat(), basis[2][1].toFloat(),
                basis[2][2].toFloat(), origin[0].toFloat(), origin[1].toFloat(), origin[2].toFloat()).getPointer(memScope)
    }
    override fun setRawMemory(mem: COpaquePointer) {
        val arr = mem.reinterpret<FloatVar>()
        basis[0][0] = arr[0].toDouble()
        basis[0][1] = arr[1].toDouble()
        basis[0][2] = arr[2].toDouble()
        basis[1][0] = arr[3].toDouble()
        basis[1][1] = arr[4].toDouble()
        basis[1][2] = arr[5].toDouble()
        basis[2][0] = arr[6].toDouble()
        basis[2][1] = arr[7].toDouble()
        basis[2][2] = arr[8].toDouble()
        origin[0] = arr[9].toDouble()
        origin[1] = arr[10].toDouble()
        origin[2] = arr[11].toDouble()
    }


    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Transform -> basis == other.basis && origin == other.origin
            else -> false
        }
    }

    override fun toString(): String = "$basis - $origin"

    override fun hashCode(): Int {
        var result = basis.hashCode()
        result = 31 * result + origin.hashCode()
        return result
    }
}
