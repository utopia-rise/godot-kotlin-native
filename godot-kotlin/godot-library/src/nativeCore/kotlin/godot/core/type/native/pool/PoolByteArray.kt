package godot.core

import godot.gdnative.godot_pool_byte_array
import godot.internal.type.NativeCoreType
import godot.internal.type.nullSafe
import godot.internal.utils.GodotScope
import kotlinx.cinterop.*

class PoolByteArray : NativeCoreType<godot_pool_byte_array>, Iterable<UByte> {
    override var _handle = cValue<godot_pool_byte_array> {}

    //PROPERTIES
    val size: Int
        get() = callNative {
            nullSafe(Godot.gdnative.godot_pool_byte_array_size)(it)
        }


    //CONSTRUCTOR
    constructor() {
        callNative {
            nullSafe(Godot.gdnative.godot_pool_byte_array_new)(it)
        }
    }

    constructor(other: PoolByteArray) {
        callNative {
            nullSafe(Godot.gdnative.godot_pool_byte_array_new_copy)(it, other.ptr)
        }
    }

    internal constructor(native: CValue<godot_pool_byte_array>) {
        setRawMemory(native)
    }


    //INTEROP
    override fun getRawMemory(): CValue<godot_pool_byte_array> {
        return _handle
    }

    override fun setRawMemory(value: CValue<godot_pool_byte_array>) {
        _handle = value
    }


    //POOL ARRAY API SHARED
    /**
     * Appends an element at the end of the array (alias of push_back).
     */
    fun append(byte: UByte) {
        callNative {
            nullSafe(Godot.gdnative.godot_pool_byte_array_append)(it, byte)
        }
    }


    /**
     * Appends a PoolByteArray at the end of this array.
     */
    fun appendArray(array: PoolByteArray) {
        callNative {
            nullSafe(Godot.gdnative.godot_pool_byte_array_append_array)(it, array.ptr)
        }
    }

    /**
     * Returns true if the array is empty.
     */
    fun empty() {
        callNative {
            nullSafe(Godot.gdnative12.godot_pool_byte_array_empty)(it)
        }
    }

    /**
     *  Retrieve the element at the given index.
     */
    operator fun get(idx: Int): UByte {
        return callNative {
            nullSafe(Godot.gdnative.godot_pool_byte_array_get)(it, idx)
        }
    }

    /**
     * Inserts a new element at a given position in the array.
     * The position must be valid, or at the end of the array (idx == size()).
     */
    fun insert(idx: Int, data: UByte) {
        callNative {
            nullSafe(Godot.gdnative.godot_pool_byte_array_insert)(it, idx, data)
        }
    }

    /**
     * Reverses the order of the elements in the array.
     */
    fun invert() {
        callNative {
            nullSafe(Godot.gdnative.godot_pool_byte_array_invert)(it)
        }
    }

    /**
     * Appends a value to the array.
     */
    fun pushBack(data: UByte) {
        callNative {
            nullSafe(Godot.gdnative.godot_pool_byte_array_push_back)(it, data)
        }
    }

    /**
     * Removes an element from the array by index.
     */
    fun remove(idx: Int) {
        callNative {
            nullSafe(Godot.gdnative.godot_pool_byte_array_remove)(it, idx)
        }
    }

    /**
     * Sets the size of the array. If the array is grown, reserves elements at the end of the array.
     * If the array is shrunk, truncates the array to the new size.
     */
    fun resize(size: Int) {
        callNative {
            nullSafe(Godot.gdnative.godot_pool_byte_array_resize)(it, size)
        }
    }

    /**
     * Changes the Byte at the given index.
     */
    operator fun set(idx: Int, data: UByte) {
        callNative {
            nullSafe(Godot.gdnative.godot_pool_byte_array_set)(it, idx, data)
        }
    }


    //POOL ARRAY UNIQUE API
    /**
     * Not available in the Gdnative API and no workaround for now
     */
    private fun compress(compressionMode: Int = 0): PoolByteArray {
        throw NotImplementedError("Not available in the Gdnative API and no workaround for now")
    }

    /**
     * Not available in the Gdnative API and no workaround for now
     */
    private fun decompress(bufferSize: Int, compressionMode: Int = 0): PoolByteArray {
        throw NotImplementedError("Not available in the Gdnative API and no workaround for now")
    }

    /**
     * Not available in the Gdnative API and no workaround for now
     */
    private fun getStringFromAscii(): String {
        throw NotImplementedError("Not available in the Gdnative API and no workaround for now")
    }

    /**
     * Not available in the Gdnative API and no workaround for now
     */
    private fun getStringFromUtf8(): String {
        throw NotImplementedError("Not available in the Gdnative API and no workaround for now")
    }

    //UTILITIES
    override fun toVariant() = Variant(this)

    operator fun plus(other: UByte) {
        this.append(other)
    }

    operator fun plus(other: PoolByteArray) {
        this.appendArray(other)
    }

    override fun toString(): String {
        return "PoolByteArray(${size})"
    }

    override fun iterator(): Iterator<UByte> {
        return IndexedIterator(this::size, this::get, this::remove)
    }

    /**
     * WARNING: no equals function is available in the Gdnative API for this Coretype.
     * This methods implementation works but is not the fastest one.
     */
    override fun equals(other: Any?): Boolean {
        return if (other is PoolByteArray) {
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

    internal inline fun <T> callNative(block: GodotScope.(CPointer<godot_pool_byte_array>) -> T): T {
        return godot.internal.type.callNative(this, block)
    }
}
