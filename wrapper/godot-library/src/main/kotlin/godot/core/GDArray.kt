@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import kotlinx.cinterop.*
import godot.gdnative.*
import godot.Object


class GDArray: CoreType { // FIXME: .copy
    internal var nativeValue = cValue<godot_array> {}


    internal constructor(native: CValue<godot_array>) {
        nativeValue = native
    }

    internal constructor(mem: COpaquePointer) {
        this.setRawMemory(mem)
    }


    constructor(size: Int = 0, init: (Int) -> Variant = { Variant() }) {
        nativeValue = nativeValue.copy { godot_array_new(this.ptr) }

        for (i in 0 until size)
            append(init(i))
    }

    constructor(other: GDArray) {
        nativeValue = nativeValue.copy { godot_array_new_copy(this.ptr, other.nativeValue) }
    }

    constructor(other: Array<*>) : this() {
        for (arg in other)
            append(Variant from arg)
    }

    constructor(other: PoolByteArray) {
        nativeValue = nativeValue.copy { godot_array_new_pool_byte_array(this.ptr, other.nativeValue) }
    }

    constructor(other: PoolIntArray) {
        nativeValue = nativeValue.copy { godot_array_new_pool_int_array(this.ptr, other.nativeValue) }
    }

    constructor(other: PoolRealArray) {
        nativeValue = nativeValue.copy { godot_array_new_pool_real_array(this.ptr, other.nativeValue) }
    }

    constructor(other: PoolColorArray) {
        nativeValue = nativeValue.copy { godot_array_new_pool_color_array(this.ptr, other.nativeValue) }
    }

    constructor(other: PoolVector2Array) {
        nativeValue = nativeValue.copy { godot_array_new_pool_vector2_array(this.ptr, other.nativeValue) }
    }

    constructor(other: PoolVector3Array) {
        nativeValue = nativeValue.copy { godot_array_new_pool_vector3_array(this.ptr, other.nativeValue) }
    }

    constructor(other: PoolStringArray) {
        nativeValue = nativeValue.copy { godot_array_new_pool_string_array(this.ptr, other.nativeValue) }
    }



    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return nativeValue.getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        nativeValue = mem.reinterpret<godot_array>().pointed.readValue()
    }



    fun toKotlinArray(): Array<Variant> {
        return Array(this.size()) { i -> this[i]!! }
    }



    operator fun iterator(): Iterator<Variant> = object: Iterator<Variant> {
        var idx: Int = 0
        val size = this@GDArray.size()

        override fun next(): Variant = this@GDArray[idx++]!!
        override fun hasNext(): Boolean = idx < size
    }

    fun withIndex(): Iterator<Pair<Int,Variant>> = object: Iterator<Pair<Int,Variant>> {
        var idx: Int = 0
        val size = this@GDArray.size()

        override fun next(): Pair<Int,Variant> = idx to this@GDArray[idx++]!!
        override fun hasNext(): Boolean = idx < size
    }

    val indices: Iterator<Int>
        get() = object: Iterator<Int> {
            var idx: Int = 0
            var size: Int = this@GDArray.size()

            override fun next(): Int = idx++
            override fun hasNext(): Boolean = idx < size
        }



    fun clear() {
        nativeValue = nativeValue.copy { godot_array_clear(this.ptr) }
    }

    fun isEmpty(): Boolean = godot_array_empty(nativeValue)

    override fun hashCode() : Int = godot_array_hash(nativeValue)

    fun invert() = godot_array_invert(nativeValue)

    fun remove(idx: Int) {
        nativeValue = nativeValue.copy { godot_array_remove(this.ptr, idx) }
    }

    fun size() = godot_array_size(nativeValue)

    fun resize(size: Int){
        nativeValue = nativeValue.copy { godot_array_resize(this.ptr, size) }
    }

    fun sort() {
        nativeValue = nativeValue.copy { godot_array_sort(this.ptr) }
    }

    operator fun get(idx: Int): Variant? = godot_array_operator_index(nativeValue, idx)?.pointed?.readValue()?.let { Variant(it) }

    fun append(v: Variant) {
        nativeValue = nativeValue.copy { godot_array_append(this.ptr, v.nativeValue) }
    }

    fun count(v: Variant): Int = godot_array_count(nativeValue, v.nativeValue)

    fun erase(v: Variant) {
        nativeValue = nativeValue.copy { godot_array_erase(this.ptr, v.nativeValue) }
    }

    fun front(): Variant = Variant(godot_array_front(nativeValue))

    fun back(): Variant = Variant(godot_array_back(nativeValue))

    fun find(v: Variant, from: Int): Int = godot_array_find(nativeValue, v.nativeValue, from)

    fun findLast(v: Variant) = godot_array_find_last(nativeValue, v.nativeValue)

    fun has(v: Variant) = godot_array_has(nativeValue, v.nativeValue)

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

    fun sortCustom(obj: Object, func: String) = memScoped {
        godot_array_sort_custom(nativeValue, obj.getRawMemory(memScope), func.toGDString())
    }

    fun bsearch(value: Variant, before: Boolean): Int = godot_array_bsearch(nativeValue, value.nativeValue, before)

    fun bsearchCustom(value: Variant, obj: Object, func: String, before: Boolean): Int = memScoped {
        godot_array_bsearch_custom(nativeValue, value.nativeValue, obj.getRawMemory(memScope), func.toGDString(), before)
    }

    fun duplicate(deep: Boolean) = GDArray(godot_array_duplicate(nativeValue, deep))

    fun max() = Variant(godot_array_max(nativeValue))

    fun min() = Variant(godot_array_min(nativeValue))

    fun shuffle() {
        godot_array_shuffle(nativeValue)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true

        if (other !is GDArray) return false

        return this.hashCode() == other.hashCode()
    }
}

fun Array<*>.toGDArray(): GDArray = GDArray(this)

fun godotArrayOf(vararg params: Any?): GDArray = GDArray(params)