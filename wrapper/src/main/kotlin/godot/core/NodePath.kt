package kotlin.godot.core

import godot.*
import kotlinx.cinterop.*

class NodePath : CoreType {
    internal var nativeValue = cValue<godot_node_path> { godot_node_path_new(this.ptr, GodotString("").nativeValue) }

    constructor()

    constructor(native: CValue<godot_node_path>) {
        nativeValue = nativeValue.copy { godot_node_path_new_copy(this.ptr, native) }
    }

    constructor(other: GodotString){
        nativeValue = nativeValue.copy { godot_node_path_new(this.ptr, other.nativeValue) }
    }

    constructor(other: String){
        nativeValue = nativeValue.copy { godot_node_path_new(this.ptr, GodotString(other).nativeValue) }
    }

    constructor(other: NodePath){
        nativeValue = nativeValue.copy { godot_node_path_new(this.ptr, other.toGodotString().nativeValue) }
    }

    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return nativeValue.getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        nativeValue = mem.reinterpret<godot_node_path>().pointed.readValue()
    }

    fun toGodotString() : GodotString {
        val newString = GodotString()
        newString.nativeValue = godot_node_path_as_string(nativeValue)
        return newString
    }

    override fun toString() : String {
        return this.toGodotString().toString()
    }

    fun getNameAsGodotString(idx: Int): GodotString{
        val newString = GodotString()
        newString.nativeValue = godot_node_path_get_name(nativeValue, idx)
        return newString
    }

    fun getNameAsString(idx: Int): String{
        return this.getNameAsGodotString(idx).toString()
    }

    fun getNameCount(): Int = godot_node_path_get_name_count(nativeValue)

    fun getSubnameAsGodotString(idx: Int): GodotString{
        val newString = GodotString()
        newString.nativeValue = godot_node_path_get_subname(nativeValue, idx)
        return newString
    }

    fun getSubnameAsString(idx: Int): String{
        return this.getSubnameAsGodotString(idx).toString()
    }

    fun getSubnameCount(): Int = godot_node_path_get_subname_count(nativeValue)

    fun isAbsolute() : Boolean = godot_node_path_is_absolute(nativeValue)

    fun isEmpty(): Boolean = godot_node_path_is_empty(nativeValue)

    override fun equals(other: Any?): Boolean =
        if(other is NodePath) godot_node_path_operator_equal(nativeValue, other.nativeValue)
        else false



}