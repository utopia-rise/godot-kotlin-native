@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package godot.core

import godot.core.type.Variant
import godot.gdnative.*
import kotlinx.cinterop.*

class RID : NativeCoreType<godot_rid>, Comparable<RID> {
    //PROPERTIES
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
            checkNotNull(Godot.gdnative.godot_rid_new_with_resource)(it, from.ptr)
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
    /**
     * Returns the ID of the referenced resource.
     */
    fun getID(): Int {
        return callNative {
            checkNotNull(Godot.gdnative.godot_rid_get_id)(it)
        }
    }


    //UTILITIES
    override fun toVariant() = Variant(this)

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
        return callNative(this, block)
    }
}
