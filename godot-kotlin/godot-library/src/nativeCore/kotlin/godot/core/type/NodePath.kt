@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package godot.core

import godot.gdnative.*
import kotlinx.cinterop.*
import platform.posix.off_t


class NodePath : CoreType {
    //PROPERTIES
    private lateinit var _handle: CValue<godot_node_path>

    val path: String
        get() {
            return callNative {
                checkNotNull(Godot.gdnative.godot_node_path_as_string)(it)
            }.toKString()
        }

    //CONSTRUCTOR
    constructor() {
        callNative {
            checkNotNull(Godot.gdnative.godot_node_path_new)(it, "".toGDString().ptr)
        }
    }

    constructor(from: String) {
        callNative {
            checkNotNull(Godot.gdnative.godot_node_path_new)(it, String().toGDString().ptr)
        }
    }

    constructor(from: NodePath) {
        callNative {
            checkNotNull(Godot.gdnative.godot_node_path_new)(it, String().toGDString().ptr)
        }
    }


    internal constructor(native: CValue<godot_node_path>) {
        callNative {
            checkNotNull(Godot.gdnative.godot_node_path_new_copy)(it, native.ptr)
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
        _handle = mem.reinterpret<godot_node_path>().pointed.readValue()
    }


    //API
    fun getName(idx: Int): String {
        return callNative {
            checkNotNull(Godot.gdnative.godot_node_path_get_name)(it, idx)
        }.toKString()
    }

    fun getNameCount(): Int {
        return callNative {
            checkNotNull(Godot.gdnative.godot_node_path_get_name_count)(it)
        }
    }

    fun getProperty(): String {
        return NodePath(
            callNative {
                checkNotNull(Godot.gdnative11.godot_node_path_get_as_property_path)(it)
            }).toString()
    }

    fun getSubname(idx: Int): String {
        return callNative {
            checkNotNull(Godot.gdnative.godot_node_path_get_subname)(it, idx).toKString()
        }
    }

    fun getSubnameCount(): Int {
        return callNative {
            checkNotNull(Godot.gdnative.godot_node_path_get_subname_count)(it)
        }
    }

    fun isAbsolute(): Boolean {
        return callNative {
            checkNotNull(Godot.gdnative.godot_node_path_is_absolute)(it)
        }
    }

    fun isEmpty(): Boolean {
        return callNative {
            checkNotNull(Godot.gdnative.godot_node_path_is_empty)(it)
        }
    }

    fun getConcatenatedSubnames() {
        return callNative {
            checkNotNull(Godot.gdnative.godot_node_path_get_concatenated_subnames)(it).toKString()
        }
    }


    //UTILITIES
    override fun equals(other: Any?): Boolean {
        return if (other is NodePath) {
            godot_node_path_operator_equal(_handle, other._handle)
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

    internal inline fun <T> callNative(block: MemScope.(CPointer<godot_node_path>) -> T): T {
        return memScoped {
            val ptr = _handle.ptr
            val ret: T = block(ptr)
            _handle = ptr.pointed.readValue()
            ret
        }
    }
}
