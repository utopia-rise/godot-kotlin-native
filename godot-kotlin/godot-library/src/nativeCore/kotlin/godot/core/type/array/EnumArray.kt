package godot.core

import godot.Object
import godot.gdnative.godot_array
import godot.internal.type.nullSafe
import kotlinx.cinterop.*

class EnumArray<E : Enum<E>>(val mapper: (Int) -> E) : GodotArray<E>() {
    //CONSTRUCTOR
    init {
        _handle = cValue{}
        callNative {
            nullSafe(Godot.gdnative.godot_array_new)(it)
        }
    }

    internal constructor(native: CValue<godot_array>, mapper: (Int) -> E) : this(mapper) {
        memScoped {
            this@EnumArray.setRawMemory(native.ptr)
        }
    }

    internal constructor(mem: COpaquePointer, mapper: (Int) -> E) : this(mapper) {
        this.setRawMemory(mem)
    }

    //API

    override fun append(value: E) {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_append)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun bsearch(value: E, before: Boolean): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_bsearch)(it, value.toVariant()._handle.ptr, before)
        }
    }

    override fun bsearchCustom(value: E, obj: Object, func: String, before: Boolean): Int {
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

    override fun count(value: E): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_count)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun duplicate(deep: Boolean): EnumArray<E> {
        return EnumArray(
            callNative {
                nullSafe(Godot.gdnative11.godot_array_duplicate)(it, deep)
            },
            mapper
        )
    }

    override fun erase(value: E) {
        callNative {
            nullSafe(Godot.gdnative.godot_array_erase)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun find(what: E, from: Int): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_find)(it, what.toVariant()._handle.ptr, from)
        }
    }

    override fun findLast(value: E): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_find_last)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun front(): E {
        return enum(Variant(
            callNative {
                nullSafe(Godot.gdnative.godot_array_front)(it)
            }
        ))
    }

    override fun has(value: E): Boolean {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_has)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun insert(position: Int, value: E) {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_insert)(it, position, value.toVariant()._handle.ptr)
        }
    }

    override fun max(): E {
        return enum(Variant(
            callNative {
                nullSafe(Godot.gdnative11.godot_array_max)(it)
            }
        ))
    }

    override fun min(): E {
        return enum(Variant(
            callNative {
                nullSafe(Godot.gdnative11.godot_array_min)(it)
            }
        ))
    }

    override fun popBack(): E {
        return enum(Variant(
            callNative {
                nullSafe(Godot.gdnative.godot_array_pop_back)(it)
            }
        ))
    }

    override fun popFront(): E {
        return enum(Variant(
            callNative {
                nullSafe(Godot.gdnative.godot_array_pop_front)(it)
            }
        ))
    }

    override fun pushBack(value: E) {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_push_back)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun pushFront(value: E) {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_push_front)(it, value.toVariant()._handle.ptr)
        }
    }

    override fun rfind(what: E, from: Int): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_rfind)(it, what.toVariant()._handle.ptr, from)
        }
    }

    override fun slice(begin: Int, end: Int, step: Int, deep: Boolean): EnumArray<E> {
        return EnumArray(
            callNative {
                nullSafe(Godot.gdnative12.godot_array_slice)(
                    it,
                    begin,
                    end,
                    step,
                    deep
                )
            },
            mapper
        )
    }

    //UTILITIES
    private fun enum(variant: Variant): E {
        return mapper(variant.asInt())
    }

    override operator fun set(idx: Int, data: E) {
        callNative {
            nullSafe(Godot.gdnative.godot_array_set)(it, idx, Variant(data)._handle.ptr)
        }
    }

    override operator fun get(idx: Int): E {
        return enum(Variant(
            callNative {
                nullSafe(Godot.gdnative.godot_array_get)(it, idx)
            }
        ))
    }

    override fun plus(other: E) {
        this.append(other)
    }

    override fun iterator(): Iterator<E> {
        return IndexedIterator(size(), this::get)
    }
}


/**
 * Build an EnumArray based on the vararg arguments.
 * Warning: Might be slow with a lot of arguments because GDNative can only append items one by one
 */
fun <E : Enum<E>> enumVariantArrayOf(mapper: (Int) -> E, vararg elements: E): EnumArray<E> {
    return EnumArray(mapper).also {
        for (arg in elements) {
            it.append(arg)
        }
    }
}

/**
 * Convert an iterable into an EnumArray
 * Warning: Might be slow if the iterable contains a lot of items because GDNative can only append items one by one
 */
@ExperimentalUnsignedTypes
fun <E : Enum<E>> Iterable<E>.toVariantArray(mapper: (Int) -> E) = EnumArray<E>(mapper).also {
    for (arg in this) {
        it.append(arg)
    }
}

/**
 * Build a EnumArray based on an Iterable
 * Warning: Might be slow if the iterable contains a lot of items because GDNative can only append items one by one
 */
@ExperimentalUnsignedTypes
fun <E : Enum<E>> EnumArray(iter: Iterable<E>, mapper: (Int) -> E) = iter.toVariantArray(mapper)

/**
 * Create a shallow copy of the EnumVariabtArray
 */
fun <E : Enum<E>> EnumArray(other: EnumArray<E>) = other.duplicate(false)
