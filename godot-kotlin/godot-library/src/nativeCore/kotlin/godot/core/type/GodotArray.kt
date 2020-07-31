package godot.core

import godot.Object
import godot.gdnative.godot_array_layout
import godot.internal.type.*
import kotlinx.cinterop.*

abstract class GodotArray<T> internal constructor() : NativeCoreType<godot_array_layout>, Iterable<T> {
    override var _handle = cValue<godot_array_layout>{}

    //PROPERTIES
    val size: Int
        get() = this.size()

    //INTEROP
    override fun _getRawMemory(memScope: MemScope): COpaquePointer {
        return _handle.getPointer(memScope)
    }

    override fun _setRawMemory(mem: COpaquePointer) {
        _handle = mem.reinterpret<godot_array_layout>().pointed.readValue()
    }


    //COMMON API
    /**
     * Clears the array. This is equivalent to using resize with a size of 0.
     */
    fun clear() {
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

    /**
     * Removes an element from the array by index.
     */
    fun remove(position: Int) {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_remove)(it, position)
        }
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
     * Returns the number of elements in the array.
     */
    fun size(): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_size)(it)
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
            nullSafe(Godot.gdnative.godot_array_sort_custom)(it, obj.ptr, func.toGDString().value.ptr)
        }
    }

    //API

    /**
     * Appends an element at the end of the array (alias of push_back).
     */
    abstract fun append(value: T)

    /**
     * Finds the index of an existing value (or the insertion index that maintains sorting order, if the value is not yet present in the array) using binary search.
     * Optionally, a before specifier can be passed.
     * If false, the returned index comes after all existing entries of the value in the array.
     * Note: Calling bsearch on an unsorted array results in unexpected behavior.
     */
    abstract fun bsearch(value: T, before: Boolean = true): Int

    /**
     * Finds the index of an existing value (or the insertion index that maintains sorting order, if the value is not yet present in the array) using binary search and a custom comparison method.
     * Optionally, a before specifier can be passed.
     * If false, the returned index comes after all existing entries of the value in the array.
     * The custom method receives two arguments (an element from the array and the value searched for) and must return true if the first argument is less than the second, and return false otherwise.
     * Note: Calling bsearch on an unsorted array results in unexpected behavior.
     */
    abstract fun bsearchCustom(value: T, obj: Object, func: String, before: Boolean = true): Int

    /**
     * Returns the number of times an element is in the array.
     */
    abstract fun count(value: T): Int


    /**
     * Returns a copy of the array.
     * If deep is true, a deep copy is performed:
     * all nested arrays and dictionaries are duplicated and will not be shared with the original array.
     * If false, a shallow copy is made and references to the original nested arrays and dictionaries are kept, so that modifying a sub-array or dictionary in the copy will also impact those referenced in the source array.
     */
    abstract fun duplicate(deep: Boolean = false): GodotArray<T>

    /**
     * Removes the first occurrence of a value from the array.
     */
    abstract fun erase(value: T)

    /**
     * Searches the array for a value and returns its index or -1 if not found.
     * Optionally, the initial search index can be passed.
     */
    abstract fun find(what: T, from: Int = 0): Int

    /**
     * Searches the array in reverse order for a value and returns its index or -1 if not found.
     */
    abstract fun findLast(value: T): Int

    /**
     * Returns the first element of the array, or null if the array is empty.
     */
    abstract fun front(): T

    /**
     * Returns true if the array contains the given value.
     */
    abstract fun has(value: T): Boolean

    /**
     * Inserts a new element at a given position in the array.
     * The position must be valid, or at the end of the array (pos == size()).
     */
    abstract fun insert(position: Int, value: T)

    /**
     * Returns the maximum value contained in the array if all elements are of comparable types.
     * If the elements can't be compared, null is returned.
     */
    abstract fun max(): T

    /**
     * Returns the minimum value contained in the array if all elements are of comparable types.
     * If the elements can't be compared, null is returned.
     */
    abstract fun min(): T

    /**
     * Removes and returns the last element of the array.
     * Returns null if the array is empty.
     */
    abstract fun popBack(): T

    /**
     * Removes and returns the first element of the array.
     * Returns null if the array is empty.
     */
    abstract fun popFront(): T

    /**
     * Appends an element at the end of the array.
     */
    abstract fun pushBack(value: T)

    /**
     * Adds an element at the beginning of the array
     */
    abstract fun pushFront(value: T)

    /**
     * Searches the array in reverse order.
     * Optionally, a start search index can be passed.
     * If negative, the start index is considered relative to the end of the array.
     */
    abstract fun rfind(what: T, from: Int = -1): Int

    /**
     * Searches the array in reverse order.
     * Optionally, a start search index can be passed.
     * If negative, the start index is considered relative to the end of the array.
     */
    abstract fun slice(begin: Int, end: Int, step: Int = 1, deep: Boolean = false): GodotArray<T>


    //UTILITIES
    override fun _toVariant() = Variant(this)

    /**
     * Changes the element at the given index.
     */
    abstract operator fun set(idx: Int, data: T)

    /**
     *  Retrieve the element at the given index.
     */
    abstract operator fun get(idx: Int): T

    abstract operator fun plus(other: T)

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
        return "Array(${size()})"
    }

    internal inline fun <C> callNative(block: MemScope.(CPointer<godot_array_layout>) -> C): C {
        return callNative(this, block)
    }

}
