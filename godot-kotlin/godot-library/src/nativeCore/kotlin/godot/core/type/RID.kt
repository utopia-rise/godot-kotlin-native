@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package godot.core

import godot.gdnative.*
import kotlinx.cinterop.*
import godot.Object

class RID : CoreType, Comparable<RID> {
    //PROPERTIES
    private lateinit var _handle: CValue<godot_rid>

    val id: Int
        get() = getID()

    //CONSTRUCTOR
    constructor() {
        callNative {
            checkNotNull(Godot.gdnative.godot_rid_new)(it)
        }
    }


    constructor(from: Object) {
        callNative {
            checkNotNull(Godot.gdnative.godot_rid_new_with_resource)(it, from.getRawMemory(memScope))
        }
    }


    internal constructor(native: CValue<godot_rid>) {
        memScoped {
            this@RID.setRawMemory(native.ptr)
        }
    }

    internal constructor(mem: COpaquePointer) : this() {
        this.setRawMemory(mem)
    }

    //INTEROP
    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return _handle.getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        _handle = mem.reinterpret<godot_rid>().pointed.readValue()
    }


    //API
    fun getID(): Int {
        return callNative {
            checkNotNull(Godot.gdnative.godot_rid_get_id)(it)
        }
    }


    //UTILITIES
    override fun compareTo(other: RID): Int {
        return when {
            this == other -> 0
            callNative { checkNotNull(Godot.gdnative.godot_rid_operator_less)(it, other._handle.ptr) } -> -1
            else -> 1
        }
    }

    override fun equals(other: Any?): Boolean {
        return when (other) {
            is RID -> callNative { checkNotNull(Godot.gdnative.godot_rid_operator_equal)(it, other._handle.ptr) }
            else -> false
        }
    }

    override fun hashCode(): Int {
        return _handle.hashCode()
    }

    override fun toString(): String {
        return "RID($id)"
    }

    internal inline fun <T> callNative(block: MemScope.(CPointer<godot_rid>) -> T): T {
        return memScoped {
            val ptr = _handle.ptr
            val ret: T = block(ptr)
            _handle = ptr.pointed.readValue()
            ret
        }
    }
}
