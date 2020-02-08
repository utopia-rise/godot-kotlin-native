@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import kotlinx.cinterop.*
import godot.gdnative.*
import godot.Object


actual class GDArray: CoreType { // FIXME: .copy
    internal var nativeValue = cValue<godot_array> {}


    internal constructor(native: CValue<godot_array>) {
        nativeValue = native
    }

    internal constructor(mem: COpaquePointer) {
        this.setRawMemory(mem)
    }


    actual constructor(size: Int, init: (Int) -> Variant) {
        nativeValue = nativeValue.copy { godot_array_new(this.ptr) }

        for (i in 0 until size)
            append(init(i))
    }

    actual constructor(other: GDArray) {
        nativeValue = nativeValue.copy { godot_array_new_copy(this.ptr, other.nativeValue) }
    }

    actual constructor(other: Array<*>) : this() {
        for (arg in other)
            append(Variant from arg)
    }

    actual constructor(other: PoolByteArray) {
        nativeValue = nativeValue.copy { godot_array_new_pool_byte_array(this.ptr, other.nativeValue) }
    }

    actual constructor(other: PoolIntArray) {
        nativeValue = nativeValue.copy { godot_array_new_pool_int_array(this.ptr, other.nativeValue) }
    }

    actual constructor(other: PoolRealArray) {
        nativeValue = nativeValue.copy { godot_array_new_pool_real_array(this.ptr, other.nativeValue) }
    }

    actual constructor(other: PoolColorArray) {
        nativeValue = nativeValue.copy { godot_array_new_pool_color_array(this.ptr, other.nativeValue) }
    }

    actual constructor(other: PoolVector2Array) {
        nativeValue = nativeValue.copy { godot_array_new_pool_vector2_array(this.ptr, other.nativeValue) }
    }

    actual constructor(other: PoolVector3Array) {
        nativeValue = nativeValue.copy { godot_array_new_pool_vector3_array(this.ptr, other.nativeValue) }
    }

    actual constructor(other: PoolStringArray) {
        nativeValue = nativeValue.copy { godot_array_new_pool_string_array(this.ptr, other.nativeValue) }
    }



    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return nativeValue.getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        nativeValue = mem.reinterpret<godot_array>().pointed.readValue()
    }



    actual fun toKotlinArray(): Array<Variant> {
        return Array(this.size()) { i -> this[i]!! }
    }



    actual operator fun iterator(): Iterator<Variant> = object: Iterator<Variant> {
        var idx: Int = 0
        val size = this@GDArray.size()

        override fun next(): Variant = this@GDArray[idx++]!!
        override fun hasNext(): Boolean = idx < size
    }

    actual fun withIndex(): Iterator<Pair<Int,Variant>> = object: Iterator<Pair<Int,Variant>> {
        var idx: Int = 0
        val size = this@GDArray.size()

        override fun next(): Pair<Int,Variant> = idx to this@GDArray[idx++]!!
        override fun hasNext(): Boolean = idx < size
    }

    actual val indices: Iterator<Int>
        get() = object: Iterator<Int> {
            var idx: Int = 0
            var size: Int = this@GDArray.size()

            override fun next(): Int = idx++
            override fun hasNext(): Boolean = idx < size
        }



    actual fun clear() {
        nativeValue = nativeValue.copy { godot_array_clear(this.ptr) }
    }

    actual fun isEmpty(): Boolean = godot_array_empty(nativeValue)

    actual fun invert() = godot_array_invert(nativeValue)

    actual fun remove(idx: Int) {
        nativeValue = nativeValue.copy { godot_array_remove(this.ptr, idx) }
    }

    actual fun size() = godot_array_size(nativeValue)

    actual fun resize(size: Int){
        nativeValue = nativeValue.copy { godot_array_resize(this.ptr, size) }
    }

    actual fun sort() {
        nativeValue = nativeValue.copy { godot_array_sort(this.ptr) }
    }

    actual operator fun get(idx: Int): Variant? = godot_array_operator_index(nativeValue, idx)?.pointed?.readValue()?.let { Variant(it) }

    actual fun append(v: Variant) {
        nativeValue = nativeValue.copy { godot_array_append(this.ptr, v.nativeValue) }
    }

    actual fun count(v: Variant): Int = godot_array_count(nativeValue, v.nativeValue)

    actual fun erase(v: Variant) {
        nativeValue = nativeValue.copy { godot_array_erase(this.ptr, v.nativeValue) }
    }

    actual fun front(): Variant = Variant(godot_array_front(nativeValue))

    actual fun back(): Variant = Variant(godot_array_back(nativeValue))

    actual fun find(v: Variant, from: Int): Int = godot_array_find(nativeValue, v.nativeValue, from)

    actual fun findLast(v: Variant) = godot_array_find_last(nativeValue, v.nativeValue)

    actual fun has(v: Variant) = godot_array_has(nativeValue, v.nativeValue)

    actual fun insert(pos: Int, v : Variant) {
        nativeValue = nativeValue.copy { godot_array_insert(this.ptr, pos, v.nativeValue) }
    }

    actual fun popBack(): Variant = Variant(godot_array_pop_back(nativeValue))

    actual fun pushBack(v : Variant) {
        nativeValue = nativeValue.copy { godot_array_push_back(this.ptr, v.nativeValue) }
    }

    actual fun popFront(): Variant = Variant(godot_array_pop_front(nativeValue))

    actual fun pushFront(v : Variant) {
        nativeValue = nativeValue.copy { godot_array_push_front(this.ptr, v.nativeValue) }
    }

    actual fun rfind(v: Variant, from: Int): Int = godot_array_rfind(nativeValue, v.nativeValue, from)

    actual fun sortCustom(obj: Object, func: String) = memScoped {
        godot_array_sort_custom(nativeValue, obj.getRawMemory(memScope), func.toGDString())
    }

    actual fun bsearch(value: Variant, before: Boolean): Int = godot_array_bsearch(nativeValue, value.nativeValue, before)

    actual fun bsearchCustom(value: Variant, obj: Object, func: String, before: Boolean): Int = memScoped {
        godot_array_bsearch_custom(nativeValue, value.nativeValue, obj.getRawMemory(memScope), func.toGDString(), before)
    }

    actual fun duplicate(deep: Boolean): GDArray = GDArray(godot_array_duplicate(nativeValue, deep))

    actual fun max() = Variant(godot_array_max(nativeValue))

    actual fun min() = Variant(godot_array_min(nativeValue))

    actual fun shuffle() {
        godot_array_shuffle(nativeValue)
    }


    override fun hashCode() : Int = godot_array_hash(nativeValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true

        if (other !is GDArray) return false

        return this.hashCode() == other.hashCode()
    }
}
