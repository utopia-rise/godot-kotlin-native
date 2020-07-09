package godot.core

import godot.gdnative.godot_array
import kotlinx.cinterop.*

class IntVariantArray : GodotArray<Int> {

    //CONSTRUCTOR
    constructor() {
        callNative {
            checkNotNull(Godot.gdnative.godot_array_new)(it)
        }
    }

    constructor(other: IntVariantArray) {
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
            this@IntVariantArray.setRawMemory(native.ptr)
        }
    }

    internal constructor(mem: COpaquePointer) {
        this.setRawMemory(mem)
    }

    //API

    override fun append(value: Int) {
        return callNative {
            checkNotNull(Godot.gdnative.godot_array_append)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun bsearch(value: Int, before: Boolean): Int {
        return callNative {
            checkNotNull(Godot.gdnative.godot_array_bsearch)(it, value.toVariant()._handle.ptr, before)
        }
    }

    override fun bsearchCustom(value: Int, obj: Object, func: String, before: Boolean): Int {
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

    override fun count(value: Int): Int {
        return callNative {
            checkNotNull(Godot.gdnative.godot_array_count)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun duplicate(deep: Boolean): IntVariantArray {
        return IntVariantArray(
            callNative {
                checkNotNull(Godot.gdnative11.godot_array_duplicate)(it, deep)
            }
        )
    }

    override fun erase(value: Int) {
        callNative {
            checkNotNull(Godot.gdnative.godot_array_erase)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun find(what: Int, from: Int): Int {
        return callNative {
            checkNotNull(Godot.gdnative.godot_array_find)(it, what.toVariant()._handle.ptr, from)
        }
    }

    override fun findLast(value: Int): Int {
        return callNative {
            checkNotNull(Godot.gdnative.godot_array_find_last)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun front(): Int {
        return Variant(
            callNative {
                checkNotNull(Godot.gdnative.godot_array_front)(it)
            }
        ).asInt()
    }

    override fun has(value: Int): Boolean {
        return callNative {
            checkNotNull(Godot.gdnative.godot_array_has)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun insert(position: Int, value: Int) {
        return callNative {
            checkNotNull(Godot.gdnative.godot_array_insert)(it, position, value.toVariant()._handle.ptr)
        }
    }

    override fun max(): Int {
        return Variant(
            callNative {
                checkNotNull(Godot.gdnative11.godot_array_max)(it)
            }
        ).asInt()
    }

    override fun min(): Int {
        return Variant(
            callNative {
                checkNotNull(Godot.gdnative11.godot_array_min)(it)
            }
        ).asInt()
    }

    override fun popBack(): Int {
        return Variant(
            callNative {
                checkNotNull(Godot.gdnative.godot_array_pop_back)(it)
            }
        ).asInt()
    }

    override fun popFront(): Int {
        return Variant(
            callNative {
                checkNotNull(Godot.gdnative.godot_array_pop_front)(it)
            }
        ).asInt()
    }

    override fun pushBack(value: Int) {
        return callNative {
            checkNotNull(Godot.gdnative.godot_array_push_back)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun pushFront(value: Int) {
        return callNative {
            checkNotNull(Godot.gdnative.godot_array_push_front)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun rfind(what: Int, from: Int): Int {
        return callNative {
            checkNotNull(Godot.gdnative.godot_array_rfind)(it, what.toVariant()._handle.ptr, from)
        }
    }

    override fun slice(begin: Int, end: Int, step: Int, deep: Boolean): IntVariantArray {
        return IntVariantArray(
            callNative {
                checkNotNull(Godot.gdnative12.godot_array_slice)(it, begin, end, step, deep)
            }
        )
    }

    //UTILITIES

    override operator fun set(idx: Int, data: Int) {
        callNative {
            checkNotNull(Godot.gdnative.godot_array_set)(it, idx, Variant(data)._handle.ptr)
        }
    }

    override operator fun get(idx: Int): Int {
        return Variant(
            callNative {
                checkNotNull(Godot.gdnative.godot_array_get)(it, idx)
            }
        ).asInt()
    }

    override fun plus(other: Int) {
        this.append(other)
    }

    override fun iterator(): Iterator<Int> {
        return IndexedIterator(size(), this::get)
    }
}

fun intVariantArrayOf(vararg elements: Int): IntVariantArray {
    return IntVariantArray().also {
        for (arg in elements) {
            it.append(arg)
        }
    }
}
