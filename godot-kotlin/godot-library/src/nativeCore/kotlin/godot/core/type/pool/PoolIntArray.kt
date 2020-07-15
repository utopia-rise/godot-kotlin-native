@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package godot.core

import godot.internal.type.NativeCoreType
import godot.gdnative.godot_aabb
import godot.gdnative.godot_pool_int_array
import kotlinx.cinterop.*
import godot.internal.type.callNative

class PoolIntArray : NativeCoreType<godot_pool_int_array>, Iterable<Int> {
    //PROPERTIES
    val size: Int
        get() = this.size()


    //CONSTRUCTOR
    constructor() {
        callNative {
            checkNotNull(Godot.gdnative.godot_pool_int_array_new)(it)
        }
    }

    internal constructor(native: CValue<godot_pool_int_array>) {
        memScoped {
            this@PoolIntArray.setRawMemory(native.ptr)
        }
    }

    internal constructor(native: CValue<godot_aabb>) {
        memScoped {
            this@PoolIntArray.setRawMemory(native.ptr)
        }
    }

    internal constructor(mem: COpaquePointer) {
        this.setRawMemory(mem)
    }

    //INTEROP
    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return _handle.getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        _handle = mem.reinterpret<godot_pool_int_array>().pointed.readValue()
    }


    //POOL ARRAY API SHARED
    /**
     * Appends an element at the end of the array (alias of push_back).
     */
    fun append(i: Int) {
        callNative {
            checkNotNull(Godot.gdnative.godot_pool_int_array_append)(it, i)
        }
    }


    /**
     * Appends a PoolIntArray at the end of this array.
     */
    fun appendArray(array: PoolIntArray) {
        callNative {
            checkNotNull(Godot.gdnative.godot_pool_int_array_append_array)(it, array._handle.ptr)
        }
    }

    /**
     * Returns true if the array is empty.
     */
    fun empty() {
        callNative {
            checkNotNull(Godot.gdnative12.godot_pool_int_array_empty)(it)
        }
    }

    /**
     *  Retrieve the element at the given index.
     */
    operator fun get(idx: Int): Int {
        return callNative {
            checkNotNull(Godot.gdnative.godot_pool_int_array_get)(it, idx)
        }
    }

    /**
     * Inserts a new element at a given position in the array.
     * The position must be valid, or at the end of the array (idx == size()).
     */
    fun insert(idx: Int, data: Int) {
        callNative {
            checkNotNull(Godot.gdnative.godot_pool_int_array_insert)(it, idx, data)
        }
    }

    /**
     * Reverses the order of the elements in the array.
     */
    fun invert() {
        callNative {
            checkNotNull(Godot.gdnative.godot_pool_int_array_invert)(it)
        }
    }

    /**
     * Appends a value to the array.
     */
    fun pushBack(data: Int) {
        callNative {
            checkNotNull(Godot.gdnative.godot_pool_int_array_push_back)(it, data)
        }
    }

    /**
     * Removes an element from the array by index.
     */
    fun remove(idx: Int) {
        callNative {
            checkNotNull(Godot.gdnative.godot_pool_int_array_remove)(it, idx)
        }
    }

    /**
     * Sets the size of the array. If the array is grown, reserves elements at the end of the array.
     * If the array is shrunk, truncates the array to the new size.
     */
    fun resize(size: Int) {
        callNative {
            checkNotNull(Godot.gdnative.godot_pool_int_array_resize)(it, size)
        }
    }

    /**
     * Changes the integer at the given index.
     */
    operator fun set(idx: Int, data: Int) {
        callNative {
            checkNotNull(Godot.gdnative.godot_pool_int_array_set)(it, idx, data)
        }
    }

    /**
     * Returns the size of the array.
     */
    fun size(): Int {
        return callNative {
            checkNotNull(Godot.gdnative.godot_pool_int_array_size)(it)
        }
    }

    //UTILITIES
    override fun toVariant() = Variant(this)

    operator fun plus(other: Int) {
        this.append(other)
    }

    operator fun plus(other: PoolIntArray) {
        this.appendArray(other)
    }

    override fun toString(): String {
        return "PoolIntArray(${size()})"
    }

    override fun iterator(): Iterator<Int> {
        return IndexedIterator(size(), this::get)
    }

    /**
     * WARNING: no equals function is available in the Gdnative API for this Coretype.
     * This methods implementation works but is not the fastest one.
     */
    override fun equals(other: Any?): Boolean {
        return if (other is PoolIntArray) {
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

    internal inline fun <T> callNative(block: MemScope.(CPointer<godot_pool_int_array>) -> T): T {
        return callNative(this, block)
    }
}
