package godot.core

import godot.Object
import godot.gdnative.godot_rid
import godot.internal.type.NativeCoreType
import godot.internal.type.nullSafe
import godot.internal.utils.GodotScope
import godot.internal.utils.godotScoped
import kotlinx.cinterop.*

class RID : NativeCoreType<godot_rid>, Comparable<RID> {
    override var _handle =
        cValue<godot_rid> {}

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


    internal constructor(native: CValue<godot_rid>) {
        setRawMemory(native)
    }


    //INTEROP
    override fun getRawMemory(): CValue<godot_rid> {
        return _handle
    }

    override fun setRawMemory(value: CValue<godot_rid>) {
        _handle = value
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
    override fun toVariant() = Variant(this)

    override fun compareTo(other: RID): Int {
        return when {
            this == other                                                                          -> 0
            callNative { nullSafe(Godot.gdnative.godot_rid_operator_less)(it, other.ptr) } -> -1
            else                                                                                   -> 1
        }
    }

    override fun equals(other: Any?): Boolean {
        return when (other) {
            is RID -> callNative { nullSafe(Godot.gdnative.godot_rid_operator_equal)(it, other.ptr) }
            else                                 -> false
        }
    }

    override fun hashCode(): Int {
        return _handle.hashCode()
    }

    override fun toString(): String {
        return "RID($id)"
    }

    internal inline fun <T> callNative(block: GodotScope.(CPointer<godot_rid>) -> T): T {
        return godot.internal.type.callNative(this, block)
    }
}
