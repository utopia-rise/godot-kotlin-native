package godot.core

import godot.Object
import godot.gdnative.godot_array
import godot.internal.type.KotlinReal
import godot.internal.type.nullSafe
import godot.internal.type.toKotlinReal
import kotlinx.cinterop.*

class RealVariantArray : GodotArray<KotlinReal> {

    //CONSTRUCTOR
    constructor() {
        _handle = cValue {}
        callNative {
            nullSafe(Godot.gdnative.godot_array_new)(it)
        }
    }

    constructor(other: RealVariantArray) {
        _handle = cValue {}
        callNative {
            nullSafe(Godot.gdnative.godot_array_new_copy)(it, other._handle.ptr)
        }
    }

    constructor(other: PoolRealArray) {
        _handle = cValue {}
        callNative {
            nullSafe(Godot.gdnative.godot_array_new_pool_real_array)(it, other._handle.ptr)
        }
    }


    internal constructor(native: CValue<godot_array>) {
        memScoped {
            this@RealVariantArray._setRawMemory(native.ptr)
        }
    }

    internal constructor(mem: COpaquePointer) {
        this._setRawMemory(mem)
    }

    //API

    override fun append(value: KotlinReal) {
        callNative {
            nullSafe(Godot.gdnative.godot_array_append)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun bsearch(value: KotlinReal, before: Boolean): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_bsearch)(it, value.toVariant()._handle.ptr, before)
        }
    }

    override fun bsearchCustom(value: KotlinReal, obj: Object, func: String, before: Boolean): Int {
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

    override fun count(value: KotlinReal): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_count)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun duplicate(deep: Boolean): RealVariantArray {
        return RealVariantArray(
            callNative {
                nullSafe(Godot.gdnative11.godot_array_duplicate)(it, deep)
            }
        )
    }

    override fun erase(value: KotlinReal) {
        callNative {
            nullSafe(Godot.gdnative.godot_array_erase)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun find(what: KotlinReal, from: Int): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_find)(it, what.toVariant()._handle.ptr, from)
        }
    }

    override fun findLast(value: KotlinReal): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_find_last)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun front(): KotlinReal {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative.godot_array_front)(it)
            }
        ).asDouble().toKotlinReal()
    }

    override fun has(value: KotlinReal): Boolean {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_has)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun insert(position: Int, value: KotlinReal) {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_insert)(it, position, value.toVariant()._handle.ptr)
        }
    }

    override fun max(): KotlinReal {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative11.godot_array_max)(it)
            }
        ).asDouble().toKotlinReal()
    }

    override fun min(): KotlinReal {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative11.godot_array_min)(it)
            }
        ).asDouble().toKotlinReal()
    }

    override fun popBack(): KotlinReal {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative.godot_array_pop_back)(it)
            }
        ).asDouble().toKotlinReal()
    }


    override fun popFront(): KotlinReal {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative.godot_array_pop_front)(it)
            }
        ).asDouble().toKotlinReal()
    }

    override fun pushBack(value: KotlinReal) {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_push_back)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun pushFront(value: KotlinReal) {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_push_front)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun rfind(what: KotlinReal, from: Int): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_rfind)(it, what.toVariant()._handle.ptr, from)
        }
    }

    override fun slice(begin: Int, end: Int, step: Int, deep: Boolean): RealVariantArray {
        return RealVariantArray(
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

    override operator fun set(idx: Int, data: KotlinReal) {
        callNative {
            nullSafe(Godot.gdnative.godot_array_set)(it, idx, Variant(data)._handle.ptr)
        }
    }

    override operator fun get(idx: Int): KotlinReal {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative.godot_array_get)(it, idx)
            }
        ).asDouble().toKotlinReal()
    }

    override fun plus(other: KotlinReal) {
        this.append(other)
    }

    override fun iterator(): Iterator<KotlinReal> {
        return IndexedIterator(size(), this::get)
    }
}

fun realVariantArrayOf(vararg elements: KotlinReal): RealVariantArray {
    return RealVariantArray().also {
        for (arg in elements) {
            it.append(arg)
        }
    }
}
