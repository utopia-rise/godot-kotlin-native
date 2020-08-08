package godot.core

import godot.gdnative.godot_node_path
import godot.internal.type.NativeCoreType
import godot.internal.type.nullSafe
import godot.internal.utils.GodotScope
import kotlinx.cinterop.*

class NodePath : NativeCoreType<godot_node_path> {
    override var _handle = cValue<godot_node_path> {}

    //PROPERTIES
    val path: String
        get() {
            return callNative {
                nullSafe(Godot.gdnative.godot_node_path_as_string)(it).string
            }
        }

    //CONSTRUCTOR
    constructor() {
        callNative {
            nullSafe(Godot.gdnative.godot_node_path_new)(it, "".ptr)
        }
    }

    constructor(from: String) {
        callNative {
            nullSafe(Godot.gdnative.godot_node_path_new)(it, from.ptr)
        }
    }

    constructor(from: NodePath) {
        callNative {
            val str = nullSafe(Godot.gdnative.godot_node_path_as_string)(from.ptr)
            nullSafe(Godot.gdnative.godot_node_path_new)(it, str.ptr)
        }
    }

    internal constructor(native: CValue<godot_node_path>) {
        setRawMemory(native)
    }


    //INTEROP
    override fun getRawMemory(): CValue<godot_node_path> {
        return _handle
    }

    override fun setRawMemory(value: CValue<godot_node_path>) {
        callNative {
            nullSafe(Godot.gdnative.godot_node_path_new_copy)(it, value.ptr)
        }
    }


    //API
    /**
     * Get the node name indicated by idx (0 to get_name_count)
     */
    fun getName(idx: Int): String {
        return callNative {
            nullSafe(Godot.gdnative.godot_node_path_get_name)(it, idx).string
        }

    }

    /**
     * Get the number of node names which make up the path.
     */
    fun getNameCount(): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_node_path_get_name_count)(it)
        }
    }

    /**
     * Get the path’s property name, or an empty string if the path doesn’t have a property.
     */
    fun getProperty(): String {
        return NodePath().also {
            _handle = callNative {
                nullSafe(Godot.gdnative11.godot_node_path_get_as_property_path)(it)
            }
        }.toString()
    }

    /**
     * Get the resource name indicated by idx (0 to get_subname_count)
     */
    fun getSubname(idx: Int): String {
        return callNative {
            nullSafe(Godot.gdnative.godot_node_path_get_subname)(it, idx).string

        }
    }

    /**
     * Get the number of resource names in the path.
     */
    fun getSubnameCount(): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_node_path_get_subname_count)(it)
        }
    }

    /**
     * Return true if the node path is absolute (not relative).
     */
    fun isAbsolute(): Boolean {
        return callNative {
            nullSafe(Godot.gdnative.godot_node_path_is_absolute)(it)
        }
    }

    /**
     * Return true if the node path is empty.
     */
    fun isEmpty(): Boolean {
        return callNative {
            nullSafe(Godot.gdnative.godot_node_path_is_empty)(it)
        }
    }

    /**
     *
     */
    fun getConcatenatedSubnames(): String {
        return callNative {
            nullSafe(Godot.gdnative.godot_node_path_get_concatenated_subnames)(it).string
        }
    }


    //UTILITIES
    override fun toVariant() = Variant(this)

    override fun equals(other: Any?): Boolean {
        return if (other is NodePath) {
            callNative {
                nullSafe(Godot.gdnative.godot_node_path_operator_equal)(it, other.ptr)
            }
        } else {
            false
        }
    }

    override fun hashCode(): Int {
        return _handle.hashCode()
    }

    override fun toString(): String {
        return "NodePath($path)"
    }

    internal inline fun <T> callNative(block: GodotScope.(CPointer<godot_node_path>) -> T): T {
        return godot.internal.type.callNative(this, block)
    }
}
