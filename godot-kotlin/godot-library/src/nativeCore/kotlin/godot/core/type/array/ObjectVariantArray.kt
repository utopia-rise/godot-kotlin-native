package godot.core

import godot.gdnative.godot_array
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CValue
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

class ObjectVariantArray<T : Object> : GodotArray<T> {

    //CONSTRUCTOR
    constructor() {
        callNative {
            checkNotNull(Godot.gdnative.godot_array_new)(it)
        }
    }

    constructor(other: ObjectVariantArray<T>) {
        callNative {
            checkNotNull(Godot.gdnative.godot_array_new_copy)(it, other._handle.ptr)
        }
    }

    constructor(other: PoolByteArray) {
        callNative {
            checkNotNull(Godot.gdnative.godot_array_new_pool_byte_array)(it, other._handle.ptr)
        }
    }

    constructor(other: PoolIntArray) {
        callNative {
            checkNotNull(Godot.gdnative.godot_array_new_pool_int_array)(it, other._handle.ptr)
        }
    }


    internal constructor(native: CValue<godot_array>) {
        memScoped {
            this@ObjectVariantArray.setRawMemory(native.ptr)
        }
    }

    internal constructor(mem: COpaquePointer) {
        this.setRawMemory(mem)
    }

    //API

    override fun append(value: T) {
        callNative {
            checkNotNull(Godot.gdnative.godot_array_append)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun bsearch(value: T, before: Boolean): Int {
        return callNative {
            checkNotNull(Godot.gdnative.godot_array_bsearch)(it, value.toVariant()._handle.ptr, before)
        }
    }

    override fun bsearchCustom(value: T, obj: Object, func: String, before: Boolean): Int {
        return callNative {
            checkNotNull(Godot.gdnative.godot_array_bsearch_custom)(
                it,
                value.toVariant()._handle.ptr,
                obj.ptr,
                func.toGDString().ptr,
                before
            )
        }
    }

    override fun count(value: T): Int {
        return callNative {
            checkNotNull(Godot.gdnative.godot_array_count)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun duplicate(deep: Boolean): ObjectVariantArray<T> {
        return ObjectVariantArray(
            callNative {
                checkNotNull(Godot.gdnative11.godot_array_duplicate)(it, deep)
            }
        )
    }

    override fun erase(value: T) {
        callNative {
            checkNotNull(Godot.gdnative.godot_array_erase)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun find(what: T, from: Int): Int {
        return callNative {
            checkNotNull(Godot.gdnative.godot_array_find)(it, what.toVariant()._handle.ptr, from)
        }
    }

    override fun findLast(value: T): Int {
        return callNative {
            checkNotNull(Godot.gdnative.godot_array_find_last)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun front(): T {
        return Variant(
            callNative {
                checkNotNull(Godot.gdnative.godot_array_front)(it)
            }
        ).asObject() as T
    }

    override fun has(value: T): Boolean {
        return callNative {
            checkNotNull(Godot.gdnative.godot_array_has)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun insert(position: Int, value: T) {
        return callNative {
            checkNotNull(Godot.gdnative.godot_array_insert)(it, position, value.toVariant()._handle.ptr)
        }
    }

    override fun max(): T {
        return Variant(
            callNative {
                checkNotNull(Godot.gdnative11.godot_array_max)(it)
            }
        ).asObject() as T
    }

    override fun min(): T {
        return Variant(
            callNative {
                checkNotNull(Godot.gdnative11.godot_array_min)(it)
            }
        ).asObject() as T
    }

    override fun popBack(): T {
        return Variant(
            callNative {
                checkNotNull(Godot.gdnative.godot_array_pop_back)(it)
            }
        ).asObject() as T
    }


    override fun popFront(): T {
        return Variant(
            callNative {
                checkNotNull(Godot.gdnative.godot_array_pop_front)(it)
            }
        ).asObject() as T
    }

    override fun pushBack(value: T) {
        return callNative {
            checkNotNull(Godot.gdnative.godot_array_push_back)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun pushFront(value: T) {
        return callNative {
            checkNotNull(Godot.gdnative.godot_array_push_front)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun rfind(what: T, from: Int): Int {
        return callNative {
            checkNotNull(Godot.gdnative.godot_array_rfind)(it, what.toVariant()._handle.ptr, from)
        }
    }

    override fun slice(begin: Int, end: Int, step: Int, deep: Boolean): ObjectVariantArray<T> {
        return ObjectVariantArray(
            callNative {
                checkNotNull(Godot.gdnative12.godot_array_slice)(it, begin, end, step, deep)
            }
        )
    }

    //UTILITIES

    override operator fun set(idx: Int, data: T) {
        callNative {
            checkNotNull(Godot.gdnative.godot_array_set)(it, idx, Variant(data)._handle.ptr)
        }
    }

    override operator fun get(idx: Int): T {
        return Variant(
            callNative {
                checkNotNull(Godot.gdnative.godot_array_get)(it, idx)
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

fun <T : Object> ObjectVariantArrayOf(vararg elements: T): ObjectVariantArray<T> {
    return ObjectVariantArray<T>().also {
        for (arg in elements) {
            it.append(arg)
        }
    }
}
