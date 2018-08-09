package kotlin.godot.core

import kotlinx.cinterop.*
import godot.*

class GodotArray: CoreType {
    internal var nativeValue = cValue<godot_array> { godot_array_new(this.ptr) }

    constructor()

    internal constructor(native: CValue<godot_array>){
        nativeValue = nativeValue.copy { godot_array_new_copy(this.ptr, native) }
    }

    internal constructor(mem: COpaquePointer) {
        this.setRawMemory(mem)
    }

    constructor(other: GodotArray) {
        nativeValue = nativeValue.copy { godot_array_new_copy(this.ptr, other.nativeValue) }
    }

    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return nativeValue.getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        nativeValue = mem.reinterpret<godot_array>().pointed.readValue()
    }


    //TODO: constructors from Pool*type*Array

    fun clear() {
        nativeValue = nativeValue.copy { godot_array_clear(this.ptr) }
    }

    fun empty() : Boolean = godot_array_empty(nativeValue)

    override fun hashCode() : Int = godot_array_hash(nativeValue)

    fun invert() = godot_array_invert(nativeValue)

    fun remove(idx: Int) {
        nativeValue = nativeValue.copy { godot_array_remove(this.ptr, idx) }
    }

    fun size() = godot_array_size(nativeValue)

    fun resize(size: Int){
        nativeValue = nativeValue.copy { godot_array_resize(this.ptr, size) }
    }

    fun sort(){
        nativeValue = nativeValue.copy { godot_array_sort(this.ptr) }
    }

    /* I don't know will this work or not*/
    fun get(idx: Int): Variant = Variant(godot_array_operator_index(nativeValue, idx)!!.pointed.readValue())

    fun append(v : Variant) {
        nativeValue = nativeValue.copy { godot_array_append(this.ptr, v.nativeValue) }
    }

    fun count(v: Variant) =  godot_array_count(nativeValue, v.nativeValue)

    fun erase(v : Variant) {
        nativeValue = nativeValue.copy { godot_array_erase(this.ptr, v.nativeValue) }
    }

    fun front(): Variant = Variant(godot_array_front(nativeValue))

    fun back(): Variant = Variant(godot_array_back(nativeValue))

    fun find(v: Variant, from: Int): Int = godot_array_find(nativeValue, v.nativeValue, from)

    fun findLast(v: Variant) = godot_array_find_last(nativeValue, v.nativeValue)

    fun has(v: Variant) =  godot_array_has(nativeValue, v.nativeValue)

    fun insert(pos: Int, v : Variant) {
        nativeValue = nativeValue.copy { godot_array_insert(this.ptr, pos, v.nativeValue) }
    }

    fun popBack(): Variant = Variant(godot_array_pop_back(nativeValue))

    fun pushBack(v : Variant) {
        nativeValue = nativeValue.copy { godot_array_push_back(this.ptr, v.nativeValue) }
    }

    fun popFront(): Variant = Variant(godot_array_pop_front(nativeValue))

    fun pushFront(v : Variant) {
        nativeValue = nativeValue.copy { godot_array_push_front(this.ptr, v.nativeValue) }
    }

    fun rfind(v: Variant, from: Int): Int = godot_array_rfind(nativeValue, v.nativeValue, from)

    fun sortCustom() { } //TODO: Need Object

}