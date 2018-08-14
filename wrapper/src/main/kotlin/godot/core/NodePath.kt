package kotlin.godot.core

import godot.*
import godot.core.toGDString
import godot.core.toKString
import kotlinx.cinterop.*

class NodePath : CoreType {
    internal var nativeValue = cValue<godot_node_path> {}

    constructor() {
        nativeValue = nativeValue.copy { godot_node_path_new(this.ptr, String().toGDString()) }
    }

    internal constructor(native: CValue<godot_node_path>) {
        nativeValue = nativeValue.copy { godot_node_path_new_copy(this.ptr, native) }
    }

    internal constructor(mem: COpaquePointer) {
        this.setRawMemory(mem)
    }

    constructor(other: String){
        nativeValue = nativeValue.copy { godot_node_path_new(this.ptr, other.toGDString()) }
    }

    constructor(other: NodePath){
        nativeValue = nativeValue.copy { godot_node_path_new(this.ptr, other.toString().toGDString()) }
    }

    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return nativeValue.getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        nativeValue = mem.reinterpret<godot_node_path>().pointed.readValue()
    }

    override fun toString(): String = godot_node_path_as_string(nativeValue).toKString()

    fun getName(idx: Int): String = godot_node_path_get_name(nativeValue, idx).toKString()

    fun getNameCount(): Int = godot_node_path_get_name_count(nativeValue)

    fun getSubname(idx: Int): String = godot_node_path_get_subname(nativeValue, idx).toKString()

    fun getSubnameCount(): Int = godot_node_path_get_subname_count(nativeValue)

    fun isAbsolute() : Boolean = godot_node_path_is_absolute(nativeValue)

    fun isEmpty(): Boolean = godot_node_path_is_empty(nativeValue)

    override fun equals(other: Any?): Boolean =
        if(other is NodePath) godot_node_path_operator_equal(nativeValue, other.nativeValue)
        else false



}