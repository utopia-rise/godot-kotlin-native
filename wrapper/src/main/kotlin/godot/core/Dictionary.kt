package kotlin.godot.core

import kotlinx.cinterop.*
import godot.*

class Dictionary: CoreType {
    var godotDictionary = cValue<godot_dictionary> {
        godot_dictionary_new(this.ptr)
    }

    constructor()

    constructor(other: Dictionary) {
        godotDictionary = godotDictionary.copy {
            val aThis = this
            other.godotDictionary.useContents {
                godot_dictionary_new_copy(aThis.ptr, this.ptr)
            }
        }
    }

    override fun godotPointer(memScope: MemScope): COpaquePointer {
        godotDictionary.useContents { return this.ptr }
    }

    fun clear(){
        godotDictionary = godotDictionary.copy { godot_dictionary_clear(this.ptr) }
    }

    fun empty(): Boolean = godotDictionary.useContents { godot_dictionary_empty(this.ptr) }

    override fun hashCode(): Int = godotDictionary.useContents { godot_dictionary_hash(this.ptr) }

    fun size(): Int = godotDictionary.useContents { godot_dictionary_size(this.ptr) }

    fun to_json() : GodotString {
        val newString = GodotString()
        newString.godotString = godotDictionary.useContents { godot_dictionary_to_json(this.ptr) }
        return newString
    }

    fun has_all(keys: GodotArray): Boolean = Utils.useContents(godotDictionary, keys.godotArray){ a, b ->
        godot_dictionary_has_all(a.ptr, b.ptr)
    }

    fun keys(): GodotArray {
        val newArray = GodotArray()
        newArray.godotArray = godotDictionary.useContents { godot_dictionary_keys(this.ptr) }
        return newArray
    }

    fun values(): GodotArray {
        val newArray = GodotArray()
        newArray.godotArray = godotDictionary.useContents { godot_dictionary_values(this.ptr) }
        return newArray
    }

    fun erase(key: Variant) = Utils.useContents(godotDictionary, key.godotVariant) { a, b ->
        godot_dictionary_erase(a.ptr, b.ptr)
    }

    fun has(key: Variant): Boolean = Utils.useContents(godotDictionary, key.godotVariant) { a, b ->
        godot_dictionary_has(a.ptr, b.ptr)
    }

    /* I don't know will this work or not*/
    fun get(key: Variant) : Variant {
        val newVariant = Variant()
        newVariant.godotVariant = Utils.useContents(godotDictionary, key.godotVariant) { a, b ->
            godot_dictionary_operator_index(a.ptr, b.ptr)!!.pointed.readValue()
        }
        return newVariant
    }


}