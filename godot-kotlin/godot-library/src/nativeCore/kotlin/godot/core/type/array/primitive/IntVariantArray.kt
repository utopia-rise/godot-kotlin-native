package godot.core

import godot.Object
import godot.gdnative.godot_array
import godot.internal.type.KotlinInt
import godot.internal.type.nullSafe
import godot.internal.type.toKotlinInt
import kotlinx.cinterop.*

class IntVariantArray : GodotArray<KotlinInt> {

    //CONSTRUCTOR
    constructor() {
        _handle = cValue {}
        callNative {
            nullSafe(Godot.gdnative.godot_array_new)(it)
        }
    }

    constructor(other: IntVariantArray) {
        _handle = cValue {}
        callNative {
            nullSafe(Godot.gdnative.godot_array_new_copy)(it, other._handle.ptr)
        }
    }

    constructor(other: PoolByteArray) {
        _handle = cValue {}
        callNative {
            nullSafe(Godot.gdnative.godot_array_new_pool_byte_array)(it, other._handle.ptr)
        }
    }

    constructor(other: PoolIntArray) {
        _handle = cValue {}
        callNative {
            nullSafe(Godot.gdnative.godot_array_new_pool_int_array)(it, other._handle.ptr)
        }
    }


    internal constructor(native: CValue<godot_array>) {
        memScoped {
            this@IntVariantArray._setRawMemory(native.ptr)
        }
    }

    internal constructor(mem: COpaquePointer) {
        this._setRawMemory(mem)
    }

    //API

    override fun append(value: KotlinInt) {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_append)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun bsearch(value: KotlinInt, before: Boolean): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_bsearch)(it, value.toVariant()._handle.ptr, before)
        }
    }

    override fun bsearchCustom(value: KotlinInt, obj: Object, func: String, before: Boolean): Int {
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

    override fun count(value: KotlinInt): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_count)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun duplicate(deep: Boolean): IntVariantArray {
        return IntVariantArray(
            callNative {
                nullSafe(Godot.gdnative11.godot_array_duplicate)(it, deep)
            }
        )
    }

    override fun erase(value: KotlinInt) {
        callNative {
            nullSafe(Godot.gdnative.godot_array_erase)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun find(what: KotlinInt, from: Int): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_find)(it, what.toVariant()._handle.ptr, from)
        }
    }

    override fun findLast(value: KotlinInt): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_find_last)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun front(): KotlinInt {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative.godot_array_front)(it)
            }
        ).asLong().toKotlinInt()
    }

    override fun has(value: KotlinInt): Boolean {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_has)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun insert(position: Int, value: KotlinInt) {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_insert)(it, position, value.toVariant()._handle.ptr)
        }
    }

    override fun max(): KotlinInt {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative11.godot_array_max)(it)
            }
        ).asLong().toKotlinInt()
    }

    override fun min(): KotlinInt {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative11.godot_array_min)(it)
            }
        ).asInt().toKotlinInt()
    }

    override fun popBack(): KotlinInt {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative.godot_array_pop_back)(it)
            }
        ).asInt().toKotlinInt()
    }

    override fun popFront(): KotlinInt {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative.godot_array_pop_front)(it)
            }
        ).asInt().toKotlinInt()
    }

    override fun pushBack(value: KotlinInt) {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_push_back)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun pushFront(value: KotlinInt) {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_push_front)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun rfind(what: KotlinInt, from: Int): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_rfind)(it, what.toVariant()._handle.ptr, from)
        }
    }

    override fun slice(begin: Int, end: Int, step: Int, deep: Boolean): IntVariantArray {
        return IntVariantArray(
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

    override operator fun set(idx: Int, data: KotlinInt) {
        callNative {
            nullSafe(Godot.gdnative.godot_array_set)(it, idx, Variant(data)._handle.ptr)
        }
    }

    override operator fun get(idx: Int): KotlinInt {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative.godot_array_get)(it, idx)
            }
        ).asInt().toKotlinInt()
    }

    override fun plus(other: KotlinInt) {
        this.append(other)
    }

    override fun iterator(): Iterator<KotlinInt> {
        return IndexedIterator(size(), this::get)
    }
}

fun intVariantArrayOf(vararg elements: KotlinInt): IntVariantArray {
    return IntVariantArray().also {
        for (arg in elements) {
            it.append(arg)
        }
    }
}
