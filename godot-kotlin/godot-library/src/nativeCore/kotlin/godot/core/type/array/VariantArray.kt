package godot.core

import godot.Object
import godot.gdnative.godot_array
import godot.internal.type.CoreType
import godot.internal.type.KotlinInt
import godot.internal.type.KotlinReal
import godot.internal.type.nullSafe
import kotlinx.cinterop.*

@ExperimentalUnsignedTypes
class VariantArray : GodotArray<Variant> {

    //CONSTRUCTOR
    constructor() {
        callNative {
            nullSafe(Godot.gdnative.godot_array_new)(it)
        }
    }

    constructor(other: PoolByteArray) {
        callNative {
            nullSafe(Godot.gdnative.godot_array_new_pool_byte_array)(it, other._handle.ptr)
        }
    }

    constructor(other: PoolColorArray) {
        callNative {
            nullSafe(Godot.gdnative.godot_array_new_pool_color_array)(it, other._handle.ptr)
        }
    }

    constructor(other: PoolIntArray) {
        callNative {
            nullSafe(Godot.gdnative.godot_array_new_pool_int_array)(it, other._handle.ptr)
        }
    }

    constructor(other: PoolRealArray) {
        callNative {
            nullSafe(Godot.gdnative.godot_array_new_pool_real_array)(it, other._handle.ptr)
        }
    }

    constructor(other: PoolStringArray) {
        callNative {
            nullSafe(Godot.gdnative.godot_array_new_pool_string_array)(it, other._handle.ptr)
        }
    }

    constructor(other: PoolVector2Array) {
        callNative {
            nullSafe(Godot.gdnative.godot_array_new_pool_vector2_array)(it, other._handle.ptr)
        }
    }

    constructor(other: PoolVector3Array) {
        callNative {
            nullSafe(Godot.gdnative.godot_array_new_pool_vector3_array)(it, other._handle.ptr)
        }
    }


    internal constructor(native: CValue<godot_array>) {
        memScoped {
            this@VariantArray._setRawMemory(native.ptr)
        }
    }

    internal constructor(mem: COpaquePointer) {
        this._setRawMemory(mem)
    }


    //API

    override fun append(value: Variant) {
        callNative {
            nullSafe(Godot.gdnative.godot_array_append)(it, value._handle.ptr)
        }
    }

    fun append(value : KotlinInt) = append(Variant(value))
    fun append(value : KotlinReal) = append(Variant(value))
    fun append(value: Boolean) = append(Variant(value))
    fun append(value: String) = append(Variant(value))
    fun append(value: Dictionary) = append(value._toVariant())
    fun <T> append(value: GodotArray<T>) = append(value._toVariant())
    fun append(value: Object) = append(value.toVariant())
    fun append(value: CoreType) = append(value._toVariant())

    override fun bsearch(value: Variant, before: Boolean): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_bsearch)(it, value._handle.ptr, before)
        }
    }

    fun bsearch(value : KotlinInt, before: Boolean = true) = bsearch(Variant(value), before)
    fun bsearch(value : KotlinReal, before: Boolean = true) = bsearch(Variant(value), before)
    fun bsearch(value: String, before: Boolean = true) = bsearch(Variant(value), before)
    fun bsearch(value: Boolean, before: Boolean = true) = bsearch(Variant(value), before)
    fun bsearch(value: Dictionary, before: Boolean = true) = bsearch(Variant(value), before)
    fun <T> bsearch(value: GodotArray<T>, before: Boolean = true) = bsearch(Variant(value), before)
    fun bsearch(value: Object, before: Boolean = true) = bsearch(value.toVariant(), before)
    fun bsearch(value: CoreType, before: Boolean = true) = bsearch(value._toVariant(), before)

    override fun bsearchCustom(value: Variant, obj: Object, func: String, before: Boolean): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_bsearch_custom)(
                it,
                value._handle.ptr,
                obj.ptr,
                func.toGDString().value.ptr,
                before
            )
        }
    }

    fun bsearchCustom(value : KotlinInt, obj: Object, func: String, before: Boolean) =
        bsearchCustom(Variant(value), obj, func, before)

    fun bsearchCustom(value : KotlinReal, obj: Object, func: String, before: Boolean) =
        bsearchCustom(Variant(value), obj, func, before)

    fun bsearchCustom(value: String, obj: Object, func: String, before: Boolean) =
        bsearchCustom(Variant(value), obj, func, before)

    fun bsearchCustom(value: Boolean, obj: Object, func: String, before: Boolean) =
        bsearchCustom(Variant(value), obj, func, before)

    fun bsearchCustom(value: Dictionary, obj: Object, func: String, before: Boolean) =
        bsearchCustom(Variant(value), obj, func, before)

    fun <T> bsearchCustom(value: GodotArray<T>, obj: Object, func: String, before: Boolean) =
        bsearchCustom(Variant(value), obj, func, before)

    fun bsearchCustom(value: Object, obj: Object, func: String, before: Boolean) =
        bsearchCustom(value.toVariant(), obj, func, before)

    fun bsearchCustom(value: CoreType, obj: Object, func: String, before: Boolean) =
        bsearchCustom(value._toVariant(), obj, func, before)

    override fun count(value: Variant): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_count)(it, value._handle.ptr)
        }
    }

    fun count(value : KotlinInt) = count(Variant(value))
    fun count(value : KotlinReal) = count(Variant(value))
    fun count(value: String) = count(Variant(value))
    fun count(value: Boolean) = count(Variant(value))
    fun count(value: Dictionary) = count(Variant(value))
    fun <T> count(value: GodotArray<T>) = count(Variant(value))
    fun count(value: Object) = count(value.toVariant())
    fun count(value: CoreType) = count(value._toVariant())

    override fun duplicate(deep: Boolean): VariantArray {
        return VariantArray(
            callNative {
                nullSafe(Godot.gdnative11.godot_array_duplicate)(it, deep)
            }
        )
    }

    override fun erase(value: Variant) {
        callNative {
            nullSafe(Godot.gdnative.godot_array_erase)(it, value._handle.ptr)
        }
    }

    fun erase(value : KotlinInt) = erase(Variant(value))
    fun erase(value : KotlinReal) = erase(Variant(value))
    fun erase(value: String) = erase(Variant(value))
    fun erase(value: Boolean) = erase(Variant(value))
    fun erase(value: Dictionary) = erase(Variant(value))
    fun <T> erase(value: GodotArray<T>) = erase(Variant(value))
    fun erase(value: Object) = erase(value.toVariant())
    fun erase(value: CoreType) = erase(value._toVariant())

    override fun find(what: Variant, from: Int): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_find)(it, what._handle.ptr, from)
        }
    }

    fun find(value : KotlinInt, from: Int = 0) = find(Variant(value))
    fun find(value : KotlinReal, from: Int = 0) = find(Variant(value))
    fun find(value: String, from: Int = 0) = find(Variant(value))
    fun find(value: Boolean, from: Int = 0) = find(Variant(value))
    fun find(value: Dictionary, from: Int = 0) = find(Variant(value))
    fun <T> find(value: GodotArray<T>, from: Int = 0) = find(Variant(value))
    fun find(value: Object, from: Int = 0) = find(value.toVariant())
    fun find(value: CoreType, from: Int = 0) = find(value._toVariant())

    override fun findLast(value: Variant): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_find_last)(it, value._handle.ptr)
        }
    }

    fun findLast(value : KotlinInt) = findLast(Variant(value))
    fun findLast(value : KotlinReal) = findLast(Variant(value))
    fun findLast(value: String) = findLast(Variant(value))
    fun findLast(value: Boolean) = findLast(Variant(value))
    fun findLast(value: Dictionary) = findLast(Variant(value))
    fun <T> findLast(value: GodotArray<T>) = findLast(Variant(value))
    fun findLast(value: Object) = findLast(value.toVariant())
    fun findLast(value: CoreType) = findLast(value._toVariant())

    override fun front(): Variant {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative.godot_array_front)(it)
            }
        )
    }

    override fun has(value: Variant): Boolean {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_has)(it, value._handle.ptr)
        }
    }

    fun has(value : KotlinInt) = has(Variant(value))
    fun has(value : KotlinReal) = has(Variant(value))
    fun has(value: String) = has(Variant(value))
    fun has(value: Boolean) = has(Variant(value))
    fun has(value: Dictionary) = has(Variant(value))
    fun <T> has(value: GodotArray<T>) = has(Variant(value))
    fun has(value: Object) = has(value.toVariant())
    fun has(value: CoreType) = has(value._toVariant())

    override fun insert(position: Int, value: Variant) {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_insert)(it, position, value._handle.ptr)
        }
    }

    fun insert(index: Int, value : KotlinInt) = insert(index, Variant(value))
    fun insert(index: Int, value : KotlinReal) = insert(index, Variant(value))
    fun insert(index: Int, value: String) = insert(index, Variant(value))
    fun insert(index: Int, value: Boolean) = insert(index, Variant(value))
    fun insert(index: Int, value: Dictionary) = insert(index, Variant(value))
    fun <T> insert(index: Int, value: GodotArray<T>) = insert(index, Variant(value))
    fun insert(index: Int, value: Object) = insert(index, value.toVariant())
    fun insert(index: Int, value: CoreType) = insert(index, value._toVariant())

    override fun max(): Variant {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative11.godot_array_max)(it)
            }
        )
    }

    override fun min(): Variant {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative11.godot_array_min)(it)
            }
        )
    }

    override fun popBack(): Variant {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative.godot_array_pop_back)(it)
            }
        )
    }

    override fun popFront(): Variant {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative.godot_array_pop_front)(it)
            }
        )
    }

    override fun pushBack(value: Variant) {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_push_back)(it, value._handle.ptr)
        }
    }

    fun pushBack(value : KotlinInt) = pushBack(Variant(value))
    fun pushBack(value : KotlinReal) = pushBack(Variant(value))
    fun pushBack(value: String) = pushBack(Variant(value))
    fun pushBack(value: Boolean) = pushBack(Variant(value))
    fun pushBack(value: Dictionary) = pushBack(Variant(value))
    fun <T> pushBack(value: GodotArray<T>) = pushBack(Variant(value))
    fun pushBack(value: Object) = pushBack(value.toVariant())
    fun pushBack(value: CoreType) = pushBack(value._toVariant())

    override fun pushFront(value: Variant) {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_push_front)(it, value._handle.ptr)
        }
    }

    fun pushFront(value : KotlinInt) = pushFront(Variant(value))
    fun pushFront(value : KotlinReal) = pushFront(Variant(value))
    fun pushFront(value: String) = pushFront(Variant(value))
    fun pushFront(value: Boolean) = pushFront(Variant(value))
    fun pushFront(value: Dictionary) = pushFront(Variant(value))
    fun <T> pushFront(value: GodotArray<T>) = pushFront(Variant(value))
    fun pushFront(value: Object) = pushFront(value.toVariant())
    fun pushFront(value: CoreType) = pushFront(value._toVariant())

    override fun rfind(what: Variant, from: Int): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_rfind)(it, what._handle.ptr, from)
        }
    }

    fun rfind(what: Int, from: Int) = rfind(Variant(what), from)
    fun rfind(what: Float, from: Int) = rfind(Variant(what), from)
    fun rfind(what: String, from: Int) = rfind(Variant(what), from)
    fun rfind(what: Boolean, from: Int) = rfind(Variant(what), from)
    fun rfind(what: Dictionary, from: Int) = rfind(Variant(what), from)
    fun <T> rfind(what: GodotArray<T>, from: Int) = rfind(Variant(what), from)
    fun rfind(what: Object, from: Int) = rfind(what.toVariant(), from)
    fun rfind(what: CoreType, from: Int) = rfind(what._toVariant(), from)

    override fun slice(begin: Int, end: Int, step: Int, deep: Boolean): VariantArray {
        return VariantArray(
            callNative {
                nullSafe(Godot.gdnative12.godot_array_slice)(it, begin, end, step, deep)
            }
        )
    }


    //UTILITIES
    override fun _toVariant() = Variant(this)

    override operator fun set(idx: Int, data: Variant) {
        callNative {
            nullSafe(Godot.gdnative.godot_array_set)(it, idx, data._handle.ptr)
        }
    }

    operator fun set(idx: Int, data: Int) = set(idx, Variant(data))
    operator fun set(idx: Int, data: Float) = set(idx, Variant(data))
    operator fun set(idx: Int, data: String) = set(idx, Variant(data))
    operator fun set(idx: Int, data: Boolean) = set(idx, Variant(data))
    operator fun set(idx: Int, data: Dictionary) = set(idx, Variant(data))
    operator fun <T> set(idx: Int, data: GodotArray<T>) = set(idx, Variant(data))
    operator fun set(idx: Int, data: Object) = set(idx, data.toVariant())
    operator fun set(idx: Int, data: CoreType) = set(idx, data._toVariant())


    override operator fun get(idx: Int): Variant {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative.godot_array_get)(it, idx)
            }
        )
    }

    override operator fun plus(other: Variant) {
        this.append(other)
    }

    operator fun plus(data: Int) = plus(Variant(data))
    operator fun plus(data: Float) = plus(Variant(data))
    operator fun plus(data: String) = plus(Variant(data))
    operator fun plus(data: Boolean) = plus(Variant(data))
    operator fun plus(data: Dictionary) = plus(Variant(data))
    operator fun <T> plus(data: GodotArray<T>) = plus(Variant(data))
    operator fun plus(data: Object) = plus(data.toVariant())
    operator fun plus(data: CoreType) = plus(data._toVariant())

    fun asIntVariantArray() = IntVariantArray(_handle)
    fun asFloatVariantArray() = RealVariantArray(_handle)
    fun asStringVariantArray() = StringVariantArray(_handle)
    fun asBoolVariantArray() = BoolVariantArray(_handle)
    fun <T : Object> asObjectArray() = ObjectArray<T>(_handle)
    fun <E: Enum<E>> asObjectArray(mapper: (Int) -> E) = EnumArray(_handle, mapper)
    fun asAABBArray() = AABBArray(_handle)
    fun asBasisArray() = BasisArray(_handle)
    fun asColorArray() = ColorArray(_handle)
    fun asNodePathArray() = NodePathArray(_handle)
    fun asPlaneArray() = PlaneArray(_handle)
    fun asQatArray() = QuatArray(_handle)
    fun asRect2Array() = Rect2Array(_handle)
    fun asRIDArray() = RIDArray(_handle)
    fun asTransformArray() = TransformArray(_handle)
    fun asTransform2DArray() = Transform2DArray(_handle)
    fun asVector2Array() = Vector2Array(_handle)
    fun asVector3Array() = Vector3Array(_handle)

    override fun iterator(): Iterator<Variant> {
        return IndexedIterator(size(), this::get)
    }
}

/**
 * Create a shallow copy of the Array
 */
fun VariantArray(other: VariantArray) = other.duplicate(false)


inline fun <reified P0> variantArrayOf(
    p0: P0
): VariantArray {
    val ret = VariantArray()
    ret.append(Variant.wrap(p0))
    return ret
}

inline fun <reified P0, reified P1> variantArrayOf(
    p0: P0,
    p1: P1
): VariantArray {
    val ret = VariantArray()
    ret.append(Variant.wrap(p0))
    ret.append(Variant.wrap(p1))
    return ret
}

inline fun <reified P0, reified P1, reified P2> variantArrayOf(
    p0: P0,
    p1: P1,
    p2: P2
): VariantArray {
    val ret = VariantArray()
    ret.append(Variant.wrap(p0))
    ret.append(Variant.wrap(p1))
    ret.append(Variant.wrap(p2))
    return ret
}

inline fun <reified P0, reified P1, reified P2, reified P3> variantArrayOf(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3
): VariantArray {
    val ret = VariantArray()
    ret.append(Variant.wrap(p0))
    ret.append(Variant.wrap(p1))
    ret.append(Variant.wrap(p2))
    ret.append(Variant.wrap(p3))
    return ret
}

inline fun <reified P0, reified P1, reified P2, reified P3, reified P4> variantArrayOf(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4
): VariantArray {
    val ret = VariantArray()
    ret.append(Variant.wrap(p0))
    ret.append(Variant.wrap(p1))
    ret.append(Variant.wrap(p2))
    ret.append(Variant.wrap(p3))
    ret.append(Variant.wrap(p4))
    return ret
}

inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5> variantArrayOf(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5
): VariantArray {
    val ret = VariantArray()
    ret.append(Variant.wrap(p0))
    ret.append(Variant.wrap(p1))
    ret.append(Variant.wrap(p2))
    ret.append(Variant.wrap(p3))
    ret.append(Variant.wrap(p4))
    ret.append(Variant.wrap(p5))
    return ret
}

inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified P6> variantArrayOf(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6
): VariantArray {
    val ret = VariantArray()
    ret.append(Variant.wrap(p0))
    ret.append(Variant.wrap(p1))
    ret.append(Variant.wrap(p2))
    ret.append(Variant.wrap(p3))
    ret.append(Variant.wrap(p4))
    ret.append(Variant.wrap(p5))
    ret.append(Variant.wrap(p6))
    return ret
}

inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified P6, reified P7> variantArrayOf(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7
): VariantArray {
    val ret = VariantArray()
    ret.append(Variant.wrap(p0))
    ret.append(Variant.wrap(p1))
    ret.append(Variant.wrap(p2))
    ret.append(Variant.wrap(p3))
    ret.append(Variant.wrap(p4))
    ret.append(Variant.wrap(p5))
    ret.append(Variant.wrap(p6))
    ret.append(Variant.wrap(p7))
    return ret
}

inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified P6, reified P7, reified P8> variantArrayOf(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8
): VariantArray {
    val ret = VariantArray()
    ret.append(Variant.wrap(p0))
    ret.append(Variant.wrap(p1))
    ret.append(Variant.wrap(p2))
    ret.append(Variant.wrap(p3))
    ret.append(Variant.wrap(p4))
    ret.append(Variant.wrap(p5))
    ret.append(Variant.wrap(p6))
    ret.append(Variant.wrap(p7))
    ret.append(Variant.wrap(p8))
    return ret
}

inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified P6, reified P7, reified P8, reified P9> variantArrayOf(
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9
): VariantArray {
    val ret = VariantArray()
    ret.append(Variant.wrap(p0))
    ret.append(Variant.wrap(p1))
    ret.append(Variant.wrap(p2))
    ret.append(Variant.wrap(p3))
    ret.append(Variant.wrap(p4))
    ret.append(Variant.wrap(p5))
    ret.append(Variant.wrap(p6))
    ret.append(Variant.wrap(p7))
    ret.append(Variant.wrap(p8))
    ret.append(Variant.wrap(p9))
    return ret
}
