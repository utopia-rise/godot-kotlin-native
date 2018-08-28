@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import kotlinx.cinterop.*
import godot.gdnative.*


class Dictionary: CoreType {
    var nativeValue = cValue<godot_dictionary> {}


    constructor() {
        nativeValue = nativeValue.copy { godot_dictionary_new(this.ptr) }
    }
    constructor(other: Dictionary) {
        nativeValue = nativeValue.copy { godot_dictionary_new_copy(this.ptr, other.nativeValue) }
    }


    internal constructor(native: CValue<godot_dictionary>) {
        nativeValue = native
    }
    internal constructor(mem: COpaquePointer) {
        this.setRawMemory(mem)
    }


    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return nativeValue.getPointer(memScope)
    }
    override fun setRawMemory(mem: COpaquePointer) {
        nativeValue = mem.reinterpret<godot_dictionary>().pointed.readValue()
    }


    fun clear(){
        nativeValue = nativeValue.copy { godot_dictionary_clear(this.ptr) }
    }

    fun isEmpty(): Boolean = godot_dictionary_empty(nativeValue)

    override fun hashCode(): Int = godot_dictionary_hash(nativeValue)

    fun size(): Int = godot_dictionary_size(nativeValue)

    fun toJson(): String = godot_dictionary_to_json(nativeValue).toKString()

    fun hasAll(keys: GDArray): Boolean = godot_dictionary_has_all(nativeValue, keys.nativeValue)

    fun keys(): GDArray = GDArray(godot_dictionary_keys(nativeValue))

    fun values(): GDArray = GDArray(godot_dictionary_values(nativeValue))

    fun erase(key: Variant) = godot_dictionary_erase(nativeValue, key.nativeValue)

    fun has(key: Variant): Boolean = godot_dictionary_has(nativeValue, key.nativeValue)

    fun get(key: Variant): Variant? = godot_dictionary_operator_index(nativeValue, key.nativeValue)?.pointed?.readValue()?.let { Variant(it) }


    override fun equals(other: Any?): Boolean {
        if (this === other)
            return true
        if (other !is Dictionary)
            return false
        return this.hashCode() == other.hashCode()
    }
}