package kotlin.godot.core

import kotlinx.cinterop.*
import godot.*

class GodotArray {
    var godotArray = cValue<godot_array> {
        godot_array_new(this.ptr)
    }

    constructor()

    constructor(other: GodotArray) {
        godotArray = godotArray.copy {
            val aThis = this
            other.godotArray.useContents {
                godot_array_new_copy(aThis.ptr, this.ptr)
            }
        }
    }

    //TODO: constructors from Pool*type*Array

    fun clear() {
        godotArray = godotArray.copy { godot_array_clear(this.ptr) }
    }

    fun empty() : Boolean = godotArray.useContents { godot_array_empty(this.ptr) }

    override fun hashCode() : Int = godotArray.useContents { godot_array_hash(this.ptr) }

    fun invert() = godotArray.useContents { godot_array_invert(this.ptr) }

    fun remove(idx: Int) {
        godotArray = godotArray.copy { godot_array_remove(this.ptr, idx) }
    }

    fun size() = godotArray.useContents { godot_array_size(this.ptr) }

    fun resize(size: Int){
        godotArray = godotArray.copy { godot_array_resize(this.ptr, size) }
    }

    fun sort(){
        godotArray = godotArray.copy{ godot_array_sort(this.ptr) }
    }

    /* I don't know will this work or not*/
    fun get(idx: Int): Variant {
        val newVariant = Variant()
        newVariant.godotVariant = godotArray.useContents { godot_array_operator_index(this.ptr, idx)!!.pointed.readValue() }
        return newVariant
    }

    fun append(v : Variant) {
        godotArray = godotArray.copy{
            val aThis = this
            v.godotVariant.useContents {
                godot_array_append(aThis.ptr, this.ptr)
            }
        }
    }

    fun count(v: Variant) =  Utils.useContents(godotArray, v.godotVariant) { a, b ->
        godot_array_count(a.ptr, b.ptr)
    }

    fun erase(v : Variant) {
        godotArray = godotArray.copy{
            val aThis = this
            v.godotVariant.useContents {
                godot_array_erase(aThis.ptr, this.ptr)
            }
        }
    }

    fun front(): Variant {
        val newVariant = Variant()
        newVariant.godotVariant = godotArray.useContents { godot_array_front(this.ptr) }
        return newVariant
    }

    fun back(): Variant {
        val newVariant = Variant()
        newVariant.godotVariant = godotArray.useContents { godot_array_back(this.ptr) }
        return newVariant
    }

    fun find(v: Variant, from: Int): Int =  Utils.useContents(godotArray, v.godotVariant) { a, b ->
        godot_array_find(a.ptr, b.ptr, from)
    }

    fun findLast(v: Variant) =  Utils.useContents(godotArray, v.godotVariant) { a, b ->
        godot_array_find_last(a.ptr, b.ptr)
    }

    fun has(v: Variant) =  Utils.useContents(godotArray, v.godotVariant) { a, b ->
        godot_array_has(a.ptr, b.ptr)
    }

    fun insert(pos: Int, v : Variant) {
        godotArray = godotArray.copy{
            val aThis = this
            v.godotVariant.useContents {
                godot_array_insert(aThis.ptr, pos, this.ptr)
            }
        }
    }

    fun popBack(): Variant {
        val newVariant = Variant()
        newVariant.godotVariant = godotArray.useContents { godot_array_pop_back(this.ptr) }
        return newVariant
    }

    fun pushBack(v : Variant) {
        godotArray = godotArray.copy{
            val aThis = this
            v.godotVariant.useContents {
                godot_array_push_back(aThis.ptr, this.ptr)
            }
        }
    }

    fun popFront(): Variant {
        val newVariant = Variant()
        newVariant.godotVariant = godotArray.useContents { godot_array_pop_front(this.ptr) }
        return newVariant
    }

    fun pushFront(v : Variant) {
        godotArray = godotArray.copy{
            val aThis = this
            v.godotVariant.useContents {
                godot_array_push_front(aThis.ptr, this.ptr)
            }
        }
    }

    fun rfind(v: Variant, from: Int): Int =  Utils.useContents(godotArray, v.godotVariant) { a, b ->
        godot_array_rfind(a.ptr, b.ptr, from)
    }

    fun sortCustom() = { } //TODO: Need Object

}