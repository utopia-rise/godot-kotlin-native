package godot.core

import godot.Object
import godot.gdnative.godot_array
import godot.internal.type.notNull
import kotlinx.cinterop.*

class BoolVariantArray : GodotArray<Boolean> {

    //CONSTRUCTOR
    constructor() {
        _handle = cValue{}
        callNative {
            notNull(Godot.gdnative.godot_array_new)(it)
        }
    }

    constructor(other: BoolVariantArray) {
        _handle = cValue{}
        callNative {
            notNull(Godot.gdnative.godot_array_new_copy)(it, other._handle.ptr)
        }
    }


    internal constructor(native: CValue<godot_array>) {
        memScoped {
            this@BoolVariantArray.setRawMemory(native.ptr)
        }
    }

    internal constructor(mem: COpaquePointer) {
        this.setRawMemory(mem)
    }

    //API

    override fun append(value: Boolean) {
        callNative {
            notNull(Godot.gdnative.godot_array_append)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun bsearch(value: Boolean, before: Boolean): Int {
        return callNative {
            notNull(Godot.gdnative.godot_array_bsearch)(it, value.toVariant()._handle.ptr, before)
        }
    }

    override fun bsearchCustom(value: Boolean, obj: Object, func: String, before: Boolean): Int {
        return callNative {
            notNull(Godot.gdnative.godot_array_bsearch_custom)(
                it,
                value.toVariant()._handle.ptr,
                obj.ptr,
                func.toGDString().ptr,
                before
            )
        }
    }

    override fun count(value: Boolean): Int {
        return callNative {
            notNull(Godot.gdnative.godot_array_count)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun duplicate(deep: Boolean): BoolVariantArray {
        return BoolVariantArray(
            callNative {
                notNull(Godot.gdnative11.godot_array_duplicate)(it, deep)
            }
        )
    }

    override fun erase(value: Boolean) {
        callNative {
            notNull(Godot.gdnative.godot_array_erase)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun find(what: Boolean, from: Int): Int {
        return callNative {
            notNull(Godot.gdnative.godot_array_find)(it, what.toVariant()._handle.ptr, from)
        }
    }

    override fun findLast(value: Boolean): Int {
        return callNative {
            notNull(Godot.gdnative.godot_array_find_last)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun front(): Boolean {
        return Variant(
            callNative {
                notNull(Godot.gdnative.godot_array_front)(it)
            }
        ).asBoolean()
    }

    override fun has(value: Boolean): Boolean {
        return callNative {
            notNull(Godot.gdnative.godot_array_has)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun insert(position: Int, value: Boolean) {
        return callNative {
            notNull(Godot.gdnative.godot_array_insert)(it, position, value.toVariant()._handle.ptr)
        }
    }

    override fun max(): Boolean {
        return Variant(
            callNative {
                notNull(Godot.gdnative11.godot_array_max)(it)
            }
        ).asBoolean()
    }

    override fun min(): Boolean {
        return Variant(
            callNative {
                notNull(Godot.gdnative11.godot_array_min)(it)
            }
        ).asBoolean()
    }

    override fun popBack(): Boolean {
        return Variant(
            callNative {
                notNull(Godot.gdnative.godot_array_pop_back)(it)
            }
        ).asBoolean()
    }


    override fun popFront(): Boolean {
        return Variant(
            callNative {
                notNull(Godot.gdnative.godot_array_pop_front)(it)
            }
        ).asBoolean()
    }

    override fun pushBack(value: Boolean) {
        return callNative {
            notNull(Godot.gdnative.godot_array_push_back)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun pushFront(value: Boolean) {
        return callNative {
            notNull(Godot.gdnative.godot_array_push_front)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun rfind(what: Boolean, from: Int): Int {
        return callNative {
            notNull(Godot.gdnative.godot_array_rfind)(it, what.toVariant()._handle.ptr, from)
        }
    }

    override fun slice(begin: Int, end: Int, step: Int, deep: Boolean): BoolVariantArray {
        return BoolVariantArray(
            callNative {
                notNull(Godot.gdnative12.godot_array_slice)(
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

    override operator fun set(idx: Int, data: Boolean) {
        callNative {
            notNull(Godot.gdnative.godot_array_set)(it, idx, Variant(data)._handle.ptr)
        }
    }

    override operator fun get(idx: Int): Boolean {
        return Variant(
            callNative {
                notNull(Godot.gdnative.godot_array_get)(it, idx)
            }
        ).asBoolean()
    }

    override fun plus(other: Boolean) {
        this.append(other)
    }

    override fun iterator(): Iterator<Boolean> {
        return IndexedIterator(size(), this::get)
    }
}

fun BooleanVariantArrayOf(vararg elements: Boolean): BoolVariantArray {
    return BoolVariantArray().also {
        for (arg in elements) {
            it.append(arg)
        }
    }
}
