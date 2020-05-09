@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package godot.core

import godot.gdnative.*
import kotlinx.cinterop.*

class PoolByteArray(internal var handle: CValue<godot_pool_byte_array>) : CoreType, Iterable<UByte> {
    //CONSTRUCTOR
    constructor() :
        this(cValue {
            checkNotNull(Godot.gdnative.godot_pool_byte_array_new(this.ptr))
        })


    constructor(other: PoolByteArray) {
        callNative {
            checkNotNull(Godot.gdnative.godot_pool_byte_array_new_copy(it, other.handle.ptr))
        }
    }


    internal constructor(mem: COpaquePointer) {
        this.setRawMemory(mem)
    }

    //INTEROP
    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return handle.getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        handle = mem.reinterpret<godot_pool_byte_array>().pointed.readValue()
    }


    //POOL ARRAY API SHARED
    /**
     * Appends an element at the end of the array (alias of push_back).
     */
    fun append(byte: UByte) {
        callNative {
            checkNotNull(Godot.gdnative.godot_pool_byte_array_append(it, byte))
        }
    }


    /**
     * Appends a PoolByteArray at the end of this array.
     */
    fun appendArray(array: PoolByteArray) {
        callNative {
            checkNotNull(Godot.gdnative.godot_pool_byte_array_append_array(it, array.handle.ptr))
        }
    }

    /**
     * Returns true if the array is empty.
     */
    fun empty() {
        callNative {
            checkNotNull(Godot.gdnative12.godot_pool_byte_array_empty(it))
        }
    }

    /**
     *  Retrieve the element at the given index.
     */
    operator fun get(idx: Int): UByte {
        callNative {
            checkNotNull(Godot.gdnative.godot_pool_byte_array_get(it, idx))
        }
    }

    /**
     * Inserts a new element at a given position in the array.
     * The position must be valid, or at the end of the array (idx == size()).
     */
    fun insert(idx: Int, data: UByte) {
        callNative {
            checkNotNull(Godot.gdnative.godot_pool_byte_array_insert(it, idx, data))
        }
    }

    /**
     * Reverses the order of the elements in the array.
     */
    fun invert() {
        callNative {
            checkNotNull(Godot.gdnative.godot_pool_byte_array_invert(it))
        }
    }

    /**
     * Appends a value to the array.
     */
    fun pushBack(data: UByte) {
        callNative {
            checkNotNull(Godot.gdnative.godot_pool_byte_array_push_back(it, data))
        }
    }

    /**
     * Removes an element from the array by index.
     */
    fun remove(idx: Int) {
        callNative {
            checkNotNull(Godot.gdnative.godot_pool_byte_array_remove(it, idx))
        }
    }

    /**
     * Sets the size of the array. If the array is grown, reserves elements at the end of the array.
     * If the array is shrunk, truncates the array to the new size.
     */
    fun resize(size: Int) {
        callNative {
            checkNotNull(Godot.gdnative.godot_pool_byte_array_resize(it, size))
        }
    }

    /**
     * Changes the Byte at the given index.
     */
    operator fun set(idx: Int, data: UByte) {
        callNative {
            checkNotNull(Godot.gdnative.godot_pool_byte_array_set(it, idx, data))
        }
    }

    /**
     * Returns the size of the array.
     */
    fun size(): Int {
        return callNative {
            checkNotNull(Godot.gdnative.godot_pool_byte_array_size(it))
        }
    }

    //UTILITIES
    fun append(byte: Int) {
        append(byte.toUByte())
    }

    operator fun set(idx: Int, byte: Int) {
        this[idx] = byte.toUByte()
    }

    override fun toString(): String {
        return "PoolByteArray(${size()})"
    }

    override fun iterator(): Iterator<UByte> {
        return IndexedIterator(size(), this::get)
    }

    internal inline fun <T> callNative(block: MemScope.(CPointer<godot_pool_byte_array>) -> T): T {
        return memScoped {
            val ptr = handle.ptr
            val ret: T = block(ptr)
            handle = ptr.pointed.readValue()
            ret
        }
    }

}
