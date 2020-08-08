package godot.core

import godot.gdnative.godot_pool_string_array
import godot.internal.type.NativeCoreType
import godot.internal.type.nullSafe
import godot.internal.utils.GodotScope
import kotlinx.cinterop.*

class PoolStringArray : NativeCoreType<godot_pool_string_array>, Iterable<String> {
    override var _handle =
        cValue<godot_pool_string_array> {}

    //PROPERTIES
    val size: Int
        get() = callNative {
            nullSafe(Godot.gdnative.godot_pool_string_array_size)(it)
        }

    //CONSTRUCTOR
    constructor() {
        callNative {
            nullSafe(Godot.gdnative.godot_pool_string_array_new)(it)
        }
    }

    constructor(other: PoolStringArray) {
        callNative {
            nullSafe(Godot.gdnative.godot_pool_string_array_new_copy)(it, other.ptr)
        }
    }

    internal constructor(native: CValue<godot_pool_string_array>) {
        setRawMemory(native)
    }


    //INTEROP
    override fun getRawMemory(): CValue<godot_pool_string_array> {
        return _handle
    }

    override fun setRawMemory(value: CValue<godot_pool_string_array>) {
        _handle = value
    }


    //POOL ARRAY API SHARED
    /**
     * Appends an element at the end of the array (alias of push_back).
     */
    fun append(s: String) {
        callNative {
            nullSafe(Godot.gdnative.godot_pool_string_array_append)(it, s.ptr)
        }
    }


    /**
     * Appends a PoolStringlArray at the end of this array.
     */
    fun appendArray(array: PoolStringArray) {
        callNative {
            nullSafe(Godot.gdnative.godot_pool_string_array_append_array)(it, array.ptr)
        }
    }

    /**
     * Returns true if the array is empty.
     */
    fun empty() {
        callNative {
            nullSafe(Godot.gdnative12.godot_pool_string_array_empty)(it)
        }
    }

    /**
     *  Retrieve the element at the given index.
     */
    operator fun get(idx: Int): String {
        return callNative {
            nullSafe(Godot.gdnative.godot_pool_string_array_get)(it, idx).string
        }
    }

    /**
     * Inserts a new element at a given position in the array.
     * The position must be valid, or at the end of the array (idx == size()).
     */
    fun insert(idx: Int, data: String) {
        callNative {
            nullSafe(Godot.gdnative.godot_pool_string_array_insert)(it, idx, data.ptr)
        }
    }

    /**
     * Reverses the order of the elements in the array.
     */
    fun invert() {
        callNative {
            nullSafe(Godot.gdnative.godot_pool_string_array_invert)(it)
        }
    }

    /**
     * Appends a value to the array.
     */
    fun pushBack(data: String) {
        callNative {
            nullSafe(Godot.gdnative.godot_pool_string_array_push_back)(it, data.ptr)
        }
    }

    /**
     * Removes an element from the array by index.
     */
    fun remove(idx: Int) {
        callNative {
            nullSafe(Godot.gdnative.godot_pool_string_array_remove)(it, idx)
        }
    }

    /**
     * Sets the size of the array. If the array is grown, reserves elements at the end of the array.
     * If the array is shrunk, truncates the array to the new size.
     */
    fun resize(size: Int) {
        callNative {
            nullSafe(Godot.gdnative.godot_pool_string_array_resize)(it, size)
        }
    }

    /**
     * Changes the s at the given index.
     */
    operator fun set(idx: Int, data: String) {
        callNative {
            nullSafe(Godot.gdnative.godot_pool_string_array_set)(it, idx, data.ptr)
        }
    }


    //UTILITIES
    override fun toVariant() = Variant(this)

    operator fun plus(other: String) {
        this.append(other)
    }

    operator fun plus(other: PoolStringArray) {
        this.appendArray(other)
    }

    override fun toString(): String {
        return "PoolStringArray(${size})"
    }

    override fun iterator(): Iterator<String> {
        return IndexedIterator(this::size, this::get, this::remove)
    }

    /**
     * WARNING: no equals function is available in the Gdnative API for this Coretype.
     * This methods implementation works but is not the fastest one.
     */
    override fun equals(other: Any?): Boolean {
        return if (other is PoolStringArray) {
            val list1 = this.toList()
            val list2 = other.toList()
            list1 == list2
        } else {
            false
        }
    }

    override fun hashCode(): Int {
        return hashCode()
    }

    internal inline fun <T> callNative(block: GodotScope.(CPointer<godot_pool_string_array>) -> T): T {
        return godot.internal.type.callNative(this, block)
    }
}
