@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package godot.core

import godot.gdnative.godot_node_path
import godot.gdnative.godot_node_path_layout
import godot.gdnative.godot_node_path_operator_equal
import godot.internal.type.*
import kotlinx.cinterop.*


class NodePath : NativeCoreType<godot_node_path_layout> {
    //PROPERTIES
    val path: String
        get() {
            return callNative {
                notNull(Godot.gdnative.godot_node_path_as_string)(it)
            }.toKString()
        }

    //CONSTRUCTOR
    constructor() {
        _handle = cValue{}
        callNative {
            notNull(Godot.gdnative.godot_node_path_new)(it, "".toGDString().ptr)
        }
    }

    constructor(from: String) {
        _handle = cValue{}
        callNative {
            notNull(Godot.gdnative.godot_node_path_new)(it, from.toGDString().ptr)
        }
    }

    constructor(from: NodePath) {
        _handle = cValue{}
        callNative {
            val str =  notNull(Godot.gdnative.godot_node_path_as_string)(from._handle.ptr)
            notNull(Godot.gdnative.godot_node_path_new)(it, str.ptr)
        }
    }


    internal constructor(native: CValue<godot_node_path_layout>) {
        callNative {
            notNull(Godot.gdnative.godot_node_path_new_copy)(it, native.ptr)
        }
    }

    internal constructor(mem: COpaquePointer) {
        this.setRawMemory(mem)
    }

    //INTEROP
    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return _handle.getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        _handle = mem.reinterpret<godot_node_path_layout>().pointed.readValue()
    }


    //API
    /**
     * Get the node name indicated by idx (0 to get_name_count)
     */
    fun getName(idx: Int): String {
        return callNative {
            notNull(Godot.gdnative.godot_node_path_get_name)(it, idx)
        }.toKString()

    }

    /**
     * Get the number of node names which make up the path.
     */
    fun getNameCount(): Int {
        return callNative {
            notNull(Godot.gdnative.godot_node_path_get_name_count)(it)
        }
    }

    /**
     * Get the path’s property name, or an empty string if the path doesn’t have a property.
     */
    fun getProperty(): String {
        return NodePath(
            callNative {
                notNull(Godot.gdnative11.godot_node_path_get_as_property_path)(it)
            }).toString()
    }

    /**
     * Get the resource name indicated by idx (0 to get_subname_count)
     */
    fun getSubname(idx: Int): String {
        return callNative {
            notNull(Godot.gdnative.godot_node_path_get_subname)(it, idx).toKString()
        }
    }

    /**
     * Get the number of resource names in the path.
     */
    fun getSubnameCount(): Int {
        return callNative {
            notNull(Godot.gdnative.godot_node_path_get_subname_count)(it)
        }
    }

    /**
     * Return true if the node path is absolute (not relative).
     */
    fun isAbsolute(): Boolean {
        return callNative {
            notNull(Godot.gdnative.godot_node_path_is_absolute)(it)
        }
    }

    /**
     * Return true if the node path is empty.
     */
    fun isEmpty(): Boolean {
        return callNative {
            notNull(Godot.gdnative.godot_node_path_is_empty)(it)
        }
    }

    /**
     *
     */
    fun getConcatenatedSubnames(): String {
        return callNative {
            notNull(Godot.gdnative.godot_node_path_get_concatenated_subnames)(it).toKString()
        }
    }


    //UTILITIES
    override fun toVariant() = Variant(this)

    override fun equals(other: Any?): Boolean {
        return if (other is NodePath) {
            callNative{
                notNull(Godot.gdnative.godot_node_path_operator_equal)(it, other._handle.ptr)
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

    internal inline fun <T> callNative(block: MemScope.(CPointer<godot_node_path_layout>) -> T): T {
        return callNative(this, block)
    }
}
