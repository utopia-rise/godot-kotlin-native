package godot.core

import godot.Object
import godot.gdnative.godot_array
import godot.internal.type.nullSafe
import kotlinx.cinterop.*

class StringVariantArray : GodotArray<String> {

    //CONSTRUCTOR
    constructor() {
        _handle = cValue{}
        callNative {
            nullSafe(Godot.gdnative.godot_array_new)(it)
        }
    }

    constructor(other: StringVariantArray) {
        _handle = cValue{}
        callNative {
            nullSafe(Godot.gdnative.godot_array_new_copy)(it, other._handle.ptr)
        }
    }

    constructor(other: PoolStringArray) {
        _handle = cValue{}
        callNative {
            nullSafe(Godot.gdnative.godot_array_new_pool_string_array)(it, other._handle.ptr)
        }
    }


    internal constructor(native: CValue<godot_array>) {
        memScoped {
            this@StringVariantArray.setRawMemory(native.ptr)
        }
    }

    internal constructor(mem: COpaquePointer) {
        this.setRawMemory(mem)
    }

    //API

    override fun append(value: String) {
        callNative {
            nullSafe(Godot.gdnative.godot_array_append)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun bsearch(value: String, before: Boolean): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_bsearch)(it, value.toVariant()._handle.ptr, before)
        }
    }

    override fun bsearchCustom(value: String, obj: Object, func: String, before: Boolean): Int {
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

    override fun count(value: String): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_count)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun duplicate(deep: Boolean): StringVariantArray {
        return StringVariantArray(
            callNative {
                nullSafe(Godot.gdnative11.godot_array_duplicate)(it, deep)
            }
        )
    }

    override fun erase(value: String) {
        callNative {
            nullSafe(Godot.gdnative.godot_array_erase)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun find(what: String, from: Int): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_find)(it, what.toVariant()._handle.ptr, from)
        }
    }

    override fun findLast(value: String): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_find_last)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun front(): String {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative.godot_array_front)(it)
            }
        ).asString()
    }

    override fun has(value: String): Boolean {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_has)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun insert(position: Int, value: String) {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_insert)(it, position, value.toVariant()._handle.ptr)
        }
    }

    override fun max(): String {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative11.godot_array_max)(it)
            }
        ).asString()
    }

    override fun min(): String {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative11.godot_array_min)(it)
            }
        ).asString()
    }

    override fun popBack(): String {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative.godot_array_pop_back)(it)
            }
        ).asString()
    }


    override fun popFront(): String {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative.godot_array_pop_front)(it)
            }
        ).asString()
    }

    override fun pushBack(value: String) {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_push_back)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun pushFront(value: String) {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_push_front)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun rfind(what: String, from: Int): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_rfind)(it, what.toVariant()._handle.ptr, from)
        }
    }

    override fun slice(begin: Int, end: Int, step: Int, deep: Boolean): StringVariantArray {
        return StringVariantArray(
            callNative {
                nullSafe(Godot.gdnative12.godot_array_slice)(
                    it,
                    begin,
                    end,
                    step,
                    deep
                )
            }
        )
    }

    //UTILITIES

    override operator fun set(idx: Int, data: String) {
        callNative {
            nullSafe(Godot.gdnative.godot_array_set)(it, idx, Variant(data)._handle.ptr)
        }
    }

    override operator fun get(idx: Int): String {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative.godot_array_get)(it, idx)
            }
        ).asString()
    }

    override fun plus(other: String) {
        this.append(other)
    }

    override fun iterator(): Iterator<String> {
        return IndexedIterator(size(), this::get)
    }
}

fun stringVariantArrayOf(vararg elements: String): StringVariantArray {
    return StringVariantArray().also {
        for (arg in elements) {
            it.append(arg)
        }
    }
}
