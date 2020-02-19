@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import kotlinx.cinterop.*
import godot.gdnative.*


class Dictionary: CoreType {
    var nativeValue = cValue<godot_dictionary> {}

    val keys: GDArray
        get() = GDArray(godot_dictionary_keys(nativeValue))

    val values: GDArray
        get() = GDArray(godot_dictionary_values(nativeValue))


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

    fun erase(key: Variant) = godot_dictionary_erase(nativeValue, key.nativeValue)

    fun erase(key: Any) = this.erase(Variant.from(key))

    fun has(key: Variant): Boolean = godot_dictionary_has(nativeValue, key.nativeValue)

    fun has(key: Any): Boolean = this.has(Variant.from(key))

    operator fun get(key: Variant, defaultValue: Variant? = null): Variant? = godot_dictionary_operator_index(nativeValue, key.nativeValue)?.pointed?.readValue()?.let { Variant(it) } ?: defaultValue

    operator fun get(key: Any, defaultValue: Any? = null): Variant? = this[Variant.from(key), if (defaultValue != null) Variant.from(defaultValue) else null]

    operator fun set(key: Variant, value: Variant) = godot_dictionary_set(nativeValue, key.nativeValue, value.nativeValue)

    operator fun set(key: Any, value: Any) = this.set(Variant.from(key), Variant.from(value))

    override fun equals(other: Any?): Boolean {
        if (this === other) return true

        if (other !is Dictionary) return false

        return this.hashCode() == other.hashCode()
    }
}

//Maybe there's something better
inline fun Dictionary.forEach(block: (key: Variant, value: Variant) -> Unit) {
    val keyIt = this.keys.iterator()
    val valIt = this.values.iterator()
    while (keyIt.hasNext() && valIt.hasNext()) {
        block(keyIt.next(), valIt.next())
    }
}