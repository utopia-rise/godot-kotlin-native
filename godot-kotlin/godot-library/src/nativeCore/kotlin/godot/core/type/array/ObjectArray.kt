package godot.core

import godot.Object
import godot.gdnative.godot_array
import godot.internal.type.nullSafe
import kotlinx.cinterop.*

@ExperimentalUnsignedTypes
class ObjectArray<T : Object> : GodotArray<T> {

    //CONSTRUCTOR
    constructor() {
        _handle = cValue{}
        callNative {
            nullSafe(Godot.gdnative.godot_array_new)(it)
        }
    }


    internal constructor(native: CValue<godot_array>) {
        memScoped {
            this@ObjectArray.setRawMemory(native.ptr)
        }
    }

    internal constructor(mem: COpaquePointer) {
        this.setRawMemory(mem)
    }

    //API

    override fun append(value: T) {
        callNative {
            nullSafe(Godot.gdnative.godot_array_append)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun bsearch(value: T, before: Boolean): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_bsearch)(it, value.toVariant()._handle.ptr, before)
        }
    }

    override fun bsearchCustom(value: T, obj: Object, func: String, before: Boolean): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_bsearch_custom)(
                it,
                value.toVariant()._handle.ptr,
                obj.ptr,
                func.toGDString().value.ptr,
                before
            )
        }
    }

    override fun count(value: T): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_count)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun duplicate(deep: Boolean): ObjectArray<T> {
        return ObjectArray(
            callNative {
                nullSafe(Godot.gdnative11.godot_array_duplicate)(it, deep)
            }
        )
    }

    override fun erase(value: T) {
        callNative {
            nullSafe(Godot.gdnative.godot_array_erase)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun find(what: T, from: Int): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_find)(it, what.toVariant()._handle.ptr, from)
        }
    }

    override fun findLast(value: T): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_find_last)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun front(): T {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative.godot_array_front)(it)
            }
        ).asObject() as T
    }

    override fun has(value: T): Boolean {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_has)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun insert(position: Int, value: T) {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_insert)(it, position, value.toVariant()._handle.ptr)
        }
    }

    override fun max(): T {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative11.godot_array_max)(it)
            }
        ).asObject() as T
    }

    override fun min(): T {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative11.godot_array_min)(it)
            }
        ).asObject() as T
    }

    override fun popBack(): T {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative.godot_array_pop_back)(it)
            }
        ).asObject() as T
    }


    override fun popFront(): T {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative.godot_array_pop_front)(it)
            }
        ).asObject() as T
    }

    override fun pushBack(value: T) {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_push_back)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun pushFront(value: T) {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_push_front)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun rfind(what: T, from: Int): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_rfind)(it, what.toVariant()._handle.ptr, from)
        }
    }

    override fun slice(begin: Int, end: Int, step: Int, deep: Boolean): ObjectArray<T> {
        return ObjectArray(
            callNative {
                nullSafe(Godot.gdnative12.godot_array_slice)(it, begin, end, step, deep)
            }
        )
    }

    //UTILITIES

    override operator fun set(idx: Int, data: T) {
        callNative {
            nullSafe(Godot.gdnative.godot_array_set)(it, idx, Variant(data)._handle.ptr)
        }
    }

    override operator fun get(idx: Int): T {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative.godot_array_get)(it, idx)
            }
        ).asObject() as T
    }

    override fun plus(other: T) {
        this.append(other)
    }

    override fun iterator(): Iterator<T> {
        return IndexedIterator(size(), this::get)
    }
}

/**
 * Build an AABBArray based on the vararg arguments.
 * Warning: Might be slow with a lot of arguments because GDNative can only append items one by one
 */
@ExperimentalUnsignedTypes
fun <T : Object> ObjectArrayOf(vararg elements: T) = ObjectArray<T>().also {
    for (arg in elements) {
        it.append(arg)
    }
}

/**
 * Convert an iterable into an ObjectArray
 * Warning: Might be slow if the iterable contains a lot of items because GDNative can only append items one by one
 */
@ExperimentalUnsignedTypes
fun <T : Object> Iterable<T>.toVariantArray() = ObjectArray<T>().also {
    for (arg in this) {
        it.append(arg)
    }
}

/**
 * Build a ObjectArray based on an Iterable
 * Warning: Might be slow if the iterable contains a lot of items because GDNative can only append items one by one
 */
@ExperimentalUnsignedTypes
fun <T : Object> ObjectArray(iter: Iterable<T>) = iter.toVariantArray()

/**
 * Create a shallow copy of the Array
 */
fun <T : Object> ObjectArray(other: ObjectArray<T>) = other.duplicate(false)
