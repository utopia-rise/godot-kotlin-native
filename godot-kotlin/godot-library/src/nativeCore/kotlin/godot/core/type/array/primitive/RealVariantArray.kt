package godot.core

import godot.Object
import godot.gdnative.godot_array
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CValue
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

class RealVariantArray : GodotArray<Float> {

    //CONSTRUCTOR
    constructor() {
        callNative {
            checkNotNull(Godot.gdnative.godot_array_new)(it)
        }
    }

    constructor(other: RealVariantArray) {
        callNative {
            checkNotNull(Godot.gdnative.godot_array_new_copy)(it, other._handle.ptr)
        }
    }

    constructor(other: PoolRealArray) {
        callNative {
            checkNotNull(Godot.gdnative.godot_array_new_pool_real_array)(it, other._handle.ptr)
        }
    }


    internal constructor(native: CValue<godot_array>) {
        memScoped {
            this@RealVariantArray.setRawMemory(native.ptr)
        }
    }

    internal constructor(mem: COpaquePointer) {
        this.setRawMemory(mem)
    }

    //API

    override fun append(value: Float) {
        callNative {
            checkNotNull(Godot.gdnative.godot_array_append)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun bsearch(value: Float, before: Boolean): Int {
        return callNative {
            checkNotNull(Godot.gdnative.godot_array_bsearch)(it, value.toVariant()._handle.ptr, before)
        }
    }

    override fun bsearchCustom(value: Float, obj: Object, func: String, before: Boolean): Int {
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

    override fun count(value: Float): Int {
        return callNative {
            checkNotNull(Godot.gdnative.godot_array_count)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun duplicate(deep: Boolean): RealVariantArray {
        return RealVariantArray(
            callNative {
                checkNotNull(Godot.gdnative11.godot_array_duplicate)(it, deep)
            }
        )
    }

    override fun erase(value: Float) {
        callNative {
            checkNotNull(Godot.gdnative.godot_array_erase)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun find(what: Float, from: Int): Int {
        return callNative {
            checkNotNull(Godot.gdnative.godot_array_find)(it, what.toVariant()._handle.ptr, from)
        }
    }

    override fun findLast(value: Float): Int {
        return callNative {
            checkNotNull(Godot.gdnative.godot_array_find_last)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun front(): Float {
        return Variant(
            callNative {
                checkNotNull(Godot.gdnative.godot_array_front)(it)
            }
        ).asFloat()
    }

    override fun has(value: Float): Boolean {
        return callNative {
            checkNotNull(Godot.gdnative.godot_array_has)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun insert(position: Int, value: Float) {
        return callNative {
            checkNotNull(Godot.gdnative.godot_array_insert)(it, position, value.toVariant()._handle.ptr)
        }
    }

    override fun max(): Float {
        return Variant(
            callNative {
                checkNotNull(Godot.gdnative11.godot_array_max)(it)
            }
        ).asFloat()
    }

    override fun min(): Float {
        return Variant(
            callNative {
                checkNotNull(Godot.gdnative11.godot_array_min)(it)
            }
        ).asFloat()
    }

    override fun popBack(): Float {
        return Variant(
            callNative {
                checkNotNull(Godot.gdnative.godot_array_pop_back)(it)
            }
        ).asFloat()
    }


    override fun popFront(): Float {
        return Variant(
            callNative {
                checkNotNull(Godot.gdnative.godot_array_pop_front)(it)
            }
        ).asFloat()
    }

    override fun pushBack(value: Float) {
        return callNative {
            checkNotNull(Godot.gdnative.godot_array_push_back)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun pushFront(value: Float) {
        return callNative {
            checkNotNull(Godot.gdnative.godot_array_push_front)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun rfind(what: Float, from: Int): Int {
        return callNative {
            checkNotNull(Godot.gdnative.godot_array_rfind)(it, what.toVariant()._handle.ptr, from)
        }
    }

    override fun slice(begin: Int, end: Int, step: Int, deep: Boolean): RealVariantArray {
        return RealVariantArray(
            callNative {
                checkNotNull(Godot.gdnative12.godot_array_slice)(
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

    override operator fun set(idx: Int, data: Float) {
        callNative {
            checkNotNull(Godot.gdnative.godot_array_set)(it, idx, Variant(data)._handle.ptr)
        }
    }

    override operator fun get(idx: Int): Float {
        return Variant(
            callNative {
                checkNotNull(Godot.gdnative.godot_array_get)(it, idx)
            }
        ).asFloat()
    }

    override fun plus(other: Float) {
        this.append(other)
    }

    override fun iterator(): Iterator<Float> {
        return IndexedIterator(size(), this::get)
    }
}

fun FloatVariantArrayOf(vararg elements: Float): RealVariantArray {
    return RealVariantArray().also {
        for (arg in elements) {
            it.append(arg)
        }
    }
}
