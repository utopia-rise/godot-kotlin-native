package godot.core

import godot.Object
import godot.gdnative.godot_array
import godot.internal.type.*
import godot.internal.utils.GodotScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.CValue
import kotlinx.cinterop.cValue
import kotlinx.cinterop.invoke

class GodotArray<T> : NativeCoreType<godot_array>, MutableCollection<T> {

    //########################INTERNAL#############################
    override var _handle = cValue<godot_array> {}
    private val mapper: VariantMapper<T>
    private val nullable: Boolean

    private fun typedWrap(value: T): Variant {
        if (value == null) {
            return Variant()
        }
        return mapper.toGodot(value)
    }

    private fun Variant.typedUnwrap(): T {
        val type = this.type
        if (type != mapper.type) {
            throw TypeCastException(
                """Expected a Variant of type ${mapper.type} but received $type instead.
                Value received: ${this.unwrap().toString()}"""
            )
        }
        if (type == VariantType.NIL) {
            if (!nullable) {
                throw TypeCastException("Expected a non nullable $type but received a null.")
            } else {
                return null as T
            }
        }
        return mapper.toKotlin(this)
    }

    @PublishedApi
    internal constructor(p_mapper: VariantMapper<T>, p_nullable: Boolean) {
        mapper = p_mapper
        nullable = p_nullable
        callNative {
            nullSafe(Godot.gdnative.godot_array_new)(it)
        }
    }

    @PublishedApi
    internal constructor(p_mapper: VariantMapper<T>, p_nullable: Boolean, native: CValue<godot_array>) {
        mapper = p_mapper
        nullable = p_nullable
        setRawMemory(native)
    }

    //########################PUBLIC###############################
    //PROPERTIES
    /**
     * Returns the number of elements in the array.
     */
    override val size: Int
        get() = callNative {
            nullSafe(Godot.gdnative.godot_array_size)(it)
        }

    /**
     * Create a shallow copy of the Array
     */
    constructor(other: GodotArray<T>) {
        mapper = other.mapper
        nullable = other.nullable
        _handle = other._duplicate(false)
    }


    //INTEROP
    override fun getRawMemory(): CValue<godot_array> {
        return _handle
    }

    override fun setRawMemory(value: CValue<godot_array>) {
        callNative {
            nullSafe(Godot.gdnative.godot_array_new_copy)(it, value.ptr)
        }
    }


    //COMMON API
    override fun add(element: T): Boolean {
        append(element)
        return true
    }

    override fun addAll(elements: Collection<T>): Boolean {
        elements.forEach {
            append(it)
        }
        return true
    }

    /**
     * Clears the array. This is equivalent to using resize with a size of 0.
     */
    override fun clear() {
        callNative {
            nullSafe(Godot.gdnative.godot_array_clear)(it)
        }
    }

    /**
     * Returns true if the array is empty.
     */
    fun empty(): Boolean {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_empty)(it)
        }
    }

    /**
     * Returns a hashed integer value representing the array contents.
     */
    fun hash(): KotlinInt {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_hash)(it)
        }.toKotlinInt()
    }

    /**
     * Reverses the order of the elements in the array.
     */
    fun invert() {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_invert)(it)
        }
    }

    override fun remove(element: T): Boolean {
        if (has(element)){
            erase(element)
            return true
        }

        return false
    }

    /**
     * Removes an element from the array by index.
     */
    fun remove(position: Int) {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_remove)(it, position)
        }
    }

    override fun removeAll(elements: Collection<T>): Boolean {
        var ret = false
        elements.forEach {
            ret = remove(it) || ret
        }
        return ret
    }

    /**
     * Resizes the array to contain a different number of elements.
     * If the array size is smaller, elements are cleared, if bigger, new elements are null.
     */
    fun resize(size: Int) {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_resize)(it, size)
        }
    }

    override fun retainAll(elements: Collection<T>): Boolean {
        var ret = false
        val iter = this.iterator()
        while (iter.hasNext()) {
            val value = iter.next()
            if (value !in elements) {
                iter.remove()
                ret = true
            }
        }
        return ret
    }

    /**
     * Shuffles the array such that the items will have a random order.
     * This method uses the global random number generator common to methods such as @randi.
     * Call @randomize to ensure that a new seed will be used each time if you want non-reproducible shuffling.
     */
    fun shuffle() {
        return callNative {
            nullSafe(Godot.gdnative11.godot_array_shuffle)(it)
        }
    }


    /**
     * Sorts the array.
     */
    fun sort() {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_sort)(it)
        }
    }

    /**
     * Sorts the array using a custom method. The arguments are an object that holds the method and the name of such method.
     * The custom method receives two arguments (a pair of elements from the array) and must return either true or false.
     */
    fun sortCustom(obj: Object, func: String) {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_sort_custom)(it, obj.ptr, func.ptr)
        }
    }

    //API

    /**
     * Appends an element at the end of the array (alias of push_back).
     */
    fun append(value: T) {
        callNative {
            nullSafe(Godot.gdnative.godot_array_append)(it, typedWrap(value).ptr)
        }
    }

    /**
     * Finds the index of an existing value (or the insertion index that maintains sorting order, if the value is not yet present in the array) using binary search.
     * Optionally, a before specifier can be passed.
     * If false, the returned index comes after all existing entries of the value in the array.
     * Note: Calling bsearch on an unsorted array results in unexpected behavior.
     */
    fun bsearch(value: T, before: Boolean = true): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_bsearch)(it, typedWrap(value).ptr, before)
        }
    }

    /**
     * Finds the index of an existing value (or the insertion index that maintains sorting order, if the value is not yet present in the array) using binary search and a custom comparison method.
     * Optionally, a before specifier can be passed.
     * If false, the returned index comes after all existing entries of the value in the array.
     * The custom method receives two arguments (an element from the array and the value searched for) and must return true if the first argument is less than the second, and return false otherwise.
     * Note: Calling bsearch on an unsorted array results in unexpected behavior.
     */
    fun bsearchCustom(value: T, obj: Object, func: String, before: Boolean = true): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_bsearch_custom)(
                it,
                typedWrap(value).ptr,
                obj.ptr,
                func.ptr,
                before
            )
        }
    }

    /**
     * Returns the number of times an element is in the array.
     */
    fun count(value: T): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_count)(it, typedWrap(value).ptr)
        }
    }


    /**
     * Returns a copy of the array.
     * If deep is true, a deep copy is performed:
     * all nested arrays and dictionaries are duplicated and will not be shared with the original array.
     * If false, a shallow copy is made and references to the original nested arrays and dictionaries are kept, so that modifying a sub-array or dictionary in the copy will also impact those referenced in the source array.
     */
    fun duplicate(deep: Boolean = false): GodotArray<T> {
        return GodotArray(mapper, nullable).also {
            _handle = _duplicate(deep)
        }

    }

    private inline fun _duplicate(deep: Boolean): CValue<godot_array> {
        return callNative {
            nullSafe(Godot.gdnative11.godot_array_duplicate)(it, deep)
        }
    }

    /**
     * Removes the first occurrence of a value from the array.
     */
    fun erase(value: T) {
        callNative {
            nullSafe(Godot.gdnative.godot_array_erase)(it, typedWrap(value).ptr)
        }
    }

    /**
     * Searches the array for a value and returns its index or -1 if not found.
     * Optionally, the initial search index can be passed.
     */
    fun find(what: T, from: Int = 0): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_find)(it, typedWrap(what).ptr, from)
        }
    }

    /**
     * Searches the array in reverse order for a value and returns its index or -1 if not found.
     */
    fun findLast(value: T): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_find_last)(it, typedWrap(value).ptr)
        }
    }

    /**
     * Returns the first element of the array, or null if the array is empty.
     */
    fun front(): T {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative.godot_array_front)(it)
            }
        ).typedUnwrap()
    }

    /**
     * Returns true if the array contains the given value.
     */
    fun has(value: T): Boolean {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_has)(it, typedWrap(value).ptr)
        }
    }

    /**
     * Inserts a new element at a given position in the array.
     * The position must be valid, or at the end of the array (pos == size()).
     */
    fun insert(position: Int, value: T) {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_insert)(it, position, typedWrap(value).ptr)
        }
    }

    /**
     * Returns the maximum value contained in the array if all elements are of comparable types.
     * If the elements can't be compared, null is returned.
     */
    fun max(): T {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative11.godot_array_max)(it)
            }
        ).typedUnwrap()
    }

    /**
     * Returns the minimum value contained in the array if all elements are of comparable types.
     * If the elements can't be compared, null is returned.
     */
    fun min(): T {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative11.godot_array_min)(it)
            }
        ).typedUnwrap()
    }

    /**
     * Removes and returns the last element of the array.
     * Returns null if the array is empty.
     */
    fun popBack(): T {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative.godot_array_pop_back)(it)
            }
        ).typedUnwrap()
    }

    /**
     * Removes and returns the first element of the array.
     * Returns null if the array is empty.
     */
    fun popFront(): T {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative.godot_array_pop_front)(it)
            }
        ).typedUnwrap()
    }

    /**
     * Appends an element at the end of the array.
     */
    fun pushBack(value: T) {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_push_back)(it, typedWrap(value).ptr)
        }
    }

    /**
     * Adds an element at the beginning of the array
     */
    fun pushFront(value: T) {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_push_front)(it, typedWrap(value).ptr)
        }
    }

    /**
     * Searches the array in reverse order.
     * Optionally, a start search index can be passed.
     * If negative, the start index is considered relative to the end of the array.
     */
    fun rfind(what: T, from: Int = -1): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_rfind)(it, typedWrap(what).ptr, from)
        }
    }

    /**
     * Searches the array in reverse order.
     * Optionally, a start search index can be passed.
     * If negative, the start index is considered relative to the end of the array.
     */
    fun slice(begin: Int, end: Int, step: Int = 1, deep: Boolean = false): GodotArray<T> {
        return GodotArray(mapper, nullable).also {
            _handle = callNative {
                nullSafe(Godot.gdnative12.godot_array_slice)(it, begin, end, step, deep)
            }
        }
    }


    //UTILITIES
    override fun toVariant() = Variant(this)

    operator fun set(idx: Int, data: T) {
        callNative {
            nullSafe(Godot.gdnative.godot_array_set)(it, idx, typedWrap(data).ptr)
        }
    }


    operator fun get(idx: Int): T {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative.godot_array_get)(it, idx)
            }
        ).typedUnwrap()
    }

    operator fun plus(other: T) {
        this.append(other)
    }

    override operator fun contains(element: T) = has(element)

    override fun containsAll(elements: Collection<T>): Boolean {
        elements.forEach {
            if (!has(it)) return false
        }
        return true
    }

    override fun isEmpty() = this.empty()

    override fun iterator(): MutableIterator<T> {
        return IndexedIterator(this::size, this::get, this::remove)
    }

    /**
     * WARNING: no equals function is available in the Gdnative API for this Coretype.
     * This methods implementation works but is not the fastest one.
     */
    override fun equals(other: Any?): Boolean {
        return if (other is GodotArray<*>) {
            val list1 = this.toList()
            val list2 = other.toList()
            list1 == list2
        } else {
            false
        }
    }

    override fun hashCode(): Int {
        return _handle.hashCode()
    }

    override fun toString(): String {
        return "Array(${size})"
    }

    internal inline fun <C> callNative(block: GodotScope.(CPointer<godot_array>) -> C): C {
        return callNative(this, block)
    }
}


//CONSTRUCTOR
/**
 * Build a empty GodotArray.
 * T may be Any or a Godot type, nullable or not.
 * An error will be thrown otherwise.
 */
inline fun <reified T> GodotArray(): GodotArray<T> {
    val type = (variantMappers[T::class]
        ?: throw TypeCastException("GodotArray generic type can either be Any or a Godot type. Nullable are accepted"))
        as VariantMapper<T>
    val isNullable = isNullable<T>()
    return GodotArray(type, isNullable)
}

/**
 * Build a empty GodotArray.
 * T may be Any or a Godot type, nullable or not.
 * An error will be thrown otherwise.
 */
internal fun GodotArray(native: CValue<godot_array>): GodotArray<Any?> {
    val type = (variantMappers[Any::class]
        ?: throw TypeCastException("GodotArray generic type can either be Any or a Godot type. Nullable are accepted"))
        as VariantMapper<Any?>
    return GodotArray(type, true, native)
}


//HELPER
/**
 * Build a GodotArray based on the vararg arguments.
 * Warning: Might be slow with a lot of arguments because GDNative can only append items one by one
 */
inline fun <reified T> GodotArrayOf(vararg elements: T) = GodotArray<T>().also { arr ->
    elements.forEach {
        arr.append(it)
    }
}

/**
 * Convert an iterable into a GodotArray
 * Warning: Might be slow if the iterable contains a lot of items because GDNative can only append items one by one
 */
inline fun <reified T> Iterable<T>.toGodotArray() = GodotArray<T>().also { arr ->
    forEach {
        arr.append(it)
    }
}

/**
 * Build a GodotArray based on an Iterable
 * Warning: Might be slow if the iterable contains a lot of items because GDNative can only append items one by one
 */
inline fun <reified T> GodotArray(iter: Iterable<T>) = iter.toGodotArray()
