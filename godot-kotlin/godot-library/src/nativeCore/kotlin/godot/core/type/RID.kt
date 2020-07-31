@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package godot.core

import godot.Object
import godot.gdnative.godot_rid_layout
import godot.internal.type.NativeCoreType
import godot.internal.type.callNative
import godot.internal.type.nullSafe
import kotlinx.cinterop.*

class RID : NativeCoreType<godot_rid_layout>, Comparable<RID> {
    override var _handle = cValue<godot_rid_layout>{}

    //PROPERTIES
    val id: Int
        get() = getID()

    //CONSTRUCTOR
    constructor() {
        callNative {
            nullSafe(Godot.gdnative.godot_rid_new)(it)
        }
    }


    constructor(from: Object) {
        callNative {
            nullSafe(Godot.gdnative.godot_rid_new_with_resource)(it, from.ptr)
        }
    }


    internal constructor(native: CValue<godot_rid_layout>) {
        memScoped {
            this@RID._setRawMemory(native.ptr)
        }
    }

    internal constructor(mem: COpaquePointer) : this() {
        this._setRawMemory(mem)
    }

    //INTEROP
    override fun _getRawMemory(memScope: MemScope): COpaquePointer {
        return _handle.getPointer(memScope)
    }

    override fun _setRawMemory(mem: COpaquePointer) {
        _handle = mem.reinterpret<godot_rid_layout>().pointed.readValue()
    }


    //API
    /**
     * Returns the ID of the referenced resource.
     */
    fun getID(): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_rid_get_id)(it)
        }
    }


    //UTILITIES
    override fun _toVariant() = Variant(this)

    override fun compareTo(other: RID): Int {
        return when {
            this == other -> 0
            callNative { nullSafe(Godot.gdnative.godot_rid_operator_less)(it, other._handle.ptr) } -> -1
            else -> 1
        }
    }

    override fun equals(other: Any?): Boolean {
        return when (other) {
            is RID -> callNative { nullSafe(Godot.gdnative.godot_rid_operator_equal)(it, other._handle.ptr) }
            else -> false
        }
    }

    override fun hashCode(): Int {
        return _handle.hashCode()
    }

    override fun toString(): String {
        return "RID($id)"
    }

    internal inline fun <T> callNative(block: MemScope.(CPointer<godot_rid_layout>) -> T): T {
        return callNative(this, block)
    }
}
