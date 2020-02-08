@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import godot.gdnative.*
import kotlinx.cinterop.*
import godot.Object

actual class RID : CoreType {
    internal var nativeValue = cValue<godot_rid> {}


    actual constructor() {
        nativeValue = nativeValue.copy { godot_rid_new(this.ptr) }
    }

    actual constructor(other: Object) {
        memScoped {
            nativeValue = nativeValue.copy { godot_rid_new_with_resource(this.ptr, other.getRawMemory(memScope)) }
        }
    }


    internal constructor(native: CValue<godot_rid>) : this() {
        memScoped {
            this@RID.setRawMemory(native.ptr)
        }
    }
    internal constructor(mem: COpaquePointer) : this() {
        this.setRawMemory(mem)
    }


    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return nativeValue.getPointer(memScope)
    }
    override fun setRawMemory(mem: COpaquePointer) {
        nativeValue = mem.reinterpret<godot_rid>().pointed.readValue()
    }


    actual fun getID(): Int = godot_rid_get_id(nativeValue)


    override fun equals(other: Any?): Boolean =
        if(other is RID) godot_rid_operator_equal(nativeValue, other.nativeValue)
        else false

    operator fun compareTo(other: RID) =
            when {
                this == other -> 0
                godot_rid_operator_less(nativeValue, other.nativeValue) -> -1
                else -> 1
            }

    override fun hashCode(): Int {
        return nativeValue.hashCode()
    }

}
