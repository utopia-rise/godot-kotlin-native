package godot.core

import godot.Object
import godot.gdnative.godot_array
import godot.internal.type.nullSafe
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CValue
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

@ExperimentalUnsignedTypes
class VariantArray : GodotArray<Any?> {

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
            this@VariantArray.setRawMemory(native.ptr)
        }
    }

    internal constructor(mem: COpaquePointer) {
        this.setRawMemory(mem)
    }


    //API

    override fun append(value: Any?) {
        callNative {
            nullSafe(Godot.gdnative.godot_array_append)(it, Variant(value)._handle.ptr)
        }
    }


    override fun bsearch(value: Any?, before: Boolean): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_bsearch)(it, Variant(value)._handle.ptr, before)
        }
    }


    override fun bsearchCustom(value: Any?, obj: Object, func: String, before: Boolean): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_bsearch_custom)(
                it,
                Variant(value)._handle.ptr,
                obj.ptr,
                func.toGDString().value.ptr,
                before
            )
        }
    }


    override fun count(value: Any?): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_count)(it, Variant(value)._handle.ptr)
        }
    }


    override fun duplicate(deep: Boolean): VariantArray {
        return VariantArray(
            callNative {
                nullSafe(Godot.gdnative11.godot_array_duplicate)(it, deep)
            }
        )
    }

    override fun erase(value: Any?) {
        callNative {
            nullSafe(Godot.gdnative.godot_array_erase)(it, Variant(value)._handle.ptr)
        }
    }


    override fun find(what: Any?, from: Int): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_find)(it, Variant(what)._handle.ptr, from)
        }
    }


    override fun findLast(value: Any?): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_find_last)(it, Variant(value)._handle.ptr)
        }
    }


    override fun front(): Any? {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative.godot_array_front)(it)
            }
        ).unwrap()
    }

    override fun has(value: Any?): Boolean {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_has)(it, Variant(value)._handle.ptr)
        }
    }


    override fun insert(position: Int, value: Any?) {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_insert)(it, position, Variant(value)._handle.ptr)
        }
    }


    override fun max(): Any? {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative11.godot_array_max)(it)
            }
        ).unwrap()
    }

    override fun min(): Any? {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative11.godot_array_min)(it)
            }
        ).unwrap()
    }

    override fun popBack(): Any? {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative.godot_array_pop_back)(it)
            }
        ).unwrap()
    }

    override fun popFront(): Any? {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative.godot_array_pop_front)(it)
            }
        ).unwrap()
    }

    override fun pushBack(value: Any?) {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_push_back)(it, Variant(value)._handle.ptr)
        }
    }


    override fun pushFront(value: Any?) {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_push_front)(it, Variant(value)._handle.ptr)
        }
    }


    override fun rfind(what: Any?, from: Int): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_array_rfind)(it, Variant(what)._handle.ptr, from)
        }
    }


    override fun slice(begin: Int, end: Int, step: Int, deep: Boolean): VariantArray {
        return VariantArray(
            callNative {
                nullSafe(Godot.gdnative12.godot_array_slice)(it, begin, end, step, deep)
            }
        )
    }


    //UTILITIES
    override fun toVariant() = Variant(this)

    override operator fun set(idx: Int, data: Any?) {
        callNative {
            nullSafe(Godot.gdnative.godot_array_set)(it, idx, Variant(data)._handle.ptr)
        }
    }


    override operator fun get(idx: Int): Any? {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative.godot_array_get)(it, idx)
            }
        ).unwrap()
    }

    fun asIntVariantArray() = IntVariantArray(_handle)
    fun asFloatVariantArray() = RealVariantArray(_handle)
    fun asStringVariantArray() = StringVariantArray(_handle)
    fun asBoolVariantArray() = BoolVariantArray(_handle)
    fun <T : Object> asObjectArray() = ObjectArray<T>(_handle)
    fun <E : Enum<E>> asObjectArray(mapper: (Int) -> E) = EnumArray(_handle, mapper)
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
}

/**
 * Create a shallow copy of the Array
 */
fun VariantArray(other: VariantArray) = other.duplicate(false)
