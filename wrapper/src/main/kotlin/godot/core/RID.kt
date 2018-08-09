package kotlin.godot.core

import godot.*
import kotlinx.cinterop.*

class RID() : CoreType {
    internal var nativeValue : CValue<godot_rid> = cValue { godot_rid_new(this.ptr) }

    //TODO: Object constructor

    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return nativeValue.getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        nativeValue = mem.reinterpret<godot_rid>().pointed.readValue()
    }

    internal constructor(native: CValue<godot_rid>) : this() {
        memScoped {
            this@RID.setRawMemory(native.ptr)
        }
    }

    fun getRID() : Int = godot_rid_get_id(nativeValue)

    override fun equals(other: Any?): Boolean =
        if(other is RID) godot_rid_operator_equal(nativeValue, other.nativeValue)
        else false

    operator fun compareTo(other: RID) =
            when {
                this == other -> 0
                godot_rid_operator_less(nativeValue, other.nativeValue) -> -1
                else -> 1
            }

}