package godot.core

import godot.gdnative.godot_array
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CValue
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

abstract class CoreVariantArray<T : CoreType> : GodotArray<T> {

    //CONSTRUCTOR
    constructor() {
        callNative {
            checkNotNull(Godot.gdnative.godot_array_new)(it)
        }
    }

    constructor(other: CoreVariantArray<T>) {
        callNative {
            checkNotNull(Godot.gdnative.godot_array_new_copy)(it, other._handle.ptr)
        }
    }

    internal constructor(native: CValue<godot_array>) {
        memScoped {
            this@CoreVariantArray.setRawMemory(native.ptr)
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

    override fun duplicate(deep: Boolean): CoreVariantArray<T> {
        return getCoreArray(
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
        return getCore(
            Variant(
                callNative {
                    checkNotNull(Godot.gdnative.godot_array_front)(it)
                }
            )
        )
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
        return getCore(
            Variant(
                callNative {
                    checkNotNull(Godot.gdnative11.godot_array_max)(it)
                }
            )
        )
    }

    override fun min(): T {
        return getCore(
            Variant(
                callNative {
                    checkNotNull(Godot.gdnative11.godot_array_min)(it)
                }
            )
        )
    }

    override fun popBack(): T {
        return getCore(
            Variant(
                callNative {
                    checkNotNull(Godot.gdnative.godot_array_pop_back)(it)
                }
            )
        )
    }


    override fun popFront(): T {
        return getCore(
            Variant(
                callNative {
                    checkNotNull(Godot.gdnative.godot_array_pop_front)(it)
                }
            )
        )
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

    override fun slice(begin: Int, end: Int, step: Int, deep: Boolean): CoreVariantArray<T> {
        return getCoreArray(
            callNative {
                checkNotNull(Godot.gdnative12.godot_array_slice)(it, begin, end, step, deep)
            }
        )
    }

    //UTILITIES
    protected abstract fun getCore(value: Variant): T
    protected abstract fun getCoreArray(value: CValue<godot_array>): CoreVariantArray<T>

    override operator fun set(idx: Int, data: T) {
        callNative {
            checkNotNull(Godot.gdnative.godot_array_set)(it, idx, data.toVariant()._handle.ptr)
        }
    }

    override operator fun get(idx: Int): T {
        return getCore(
            Variant(
                callNative {
                    checkNotNull(Godot.gdnative.godot_array_get)(it, idx)
                }
            )
        )
    }

    override fun plus(other: T) {
        this.append(other)
    }

    override fun iterator(): Iterator<T> {
        return IndexedIterator(size(), this::get)
    }
}

class AABBArray : CoreVariantArray<AABB> {
    constructor() : super()
    constructor(other: AABBArray) : super(other)
    internal constructor(native: CValue<godot_array>) : super(native)
    internal constructor(mem: COpaquePointer) : super(mem)

    override fun getCore(value: Variant): AABB = value.asAABB()
    override fun getCoreArray(value: CValue<godot_array>) = AABBArray(value)
}

fun AABBArrayOf(vararg elements: AABB) = AABBArray().also {
    for (arg in elements) {
        it.append(arg)
    }
}

class BasisArray : CoreVariantArray<Basis> {
    constructor() : super()
    constructor(other: BasisArray) : super(other)
    internal constructor(native: CValue<godot_array>) : super(native)
    internal constructor(mem: COpaquePointer) : super(mem)

    override fun getCore(value: Variant): Basis = value.asBasis()
    override fun getCoreArray(value: CValue<godot_array>) = BasisArray(value)
}

fun BasisArrayOf(vararg elements: Basis) = BasisArray().also {
    for (arg in elements) {
        it.append(arg)
    }
}

class ColorArray : CoreVariantArray<Color> {
    constructor() : super()
    constructor(other: ColorArray) : super(other)
    constructor(other: PoolColorArray) {
        callNative {
            checkNotNull(Godot.gdnative.godot_array_new_pool_color_array)(it, other._handle.ptr)
        }
    }

    internal constructor(native: CValue<godot_array>) : super(native)
    internal constructor(mem: COpaquePointer) : super(mem)

    override fun getCore(value: Variant): Color = value.asColor()
    override fun getCoreArray(value: CValue<godot_array>) = ColorArray(value)
}

fun ColorArrayOf(vararg elements: Color) = ColorArray().also {
    for (arg in elements) {
        it.append(arg)
    }
}

class NodePathArray : CoreVariantArray<NodePath> {
    constructor() : super()
    constructor(other: NodePathArray) : super(other)
    internal constructor(native: CValue<godot_array>) : super(native)
    internal constructor(mem: COpaquePointer) : super(mem)

    override fun getCore(value: Variant): NodePath = value.asNodePath()
    override fun getCoreArray(value: CValue<godot_array>) = NodePathArray(value)
}

fun NodePathArrayOf(vararg elements: NodePath) = NodePathArray().also {
    for (arg in elements) {
        it.append(arg)
    }
}

class PlaneArray : CoreVariantArray<Plane> {
    constructor() : super()
    constructor(other: PlaneArray) : super(other)
    internal constructor(native: CValue<godot_array>) : super(native)
    internal constructor(mem: COpaquePointer) : super(mem)

    override fun getCore(value: Variant): Plane = value.asPlane()
    override fun getCoreArray(value: CValue<godot_array>) = PlaneArray(value)
}

fun PlaneArrayOf(vararg elements: Plane) = PlaneArray().also {
    for (arg in elements) {
        it.append(arg)
    }
}

class QuatArray : CoreVariantArray<Quat> {
    constructor() : super()
    constructor(other: QuatArray) : super(other)
    internal constructor(native: CValue<godot_array>) : super(native)
    internal constructor(mem: COpaquePointer) : super(mem)

    override fun getCore(value: Variant): Quat = value.asQuat()
    override fun getCoreArray(value: CValue<godot_array>) = QuatArray(value)
}

fun QuatArrayOf(vararg elements: Quat) = QuatArray().also {
    for (arg in elements) {
        it.append(arg)
    }
}

class Rect2Array : CoreVariantArray<Rect2> {
    constructor() : super()
    constructor(other: Rect2Array) : super(other)
    internal constructor(native: CValue<godot_array>) : super(native)
    internal constructor(mem: COpaquePointer) : super(mem)

    override fun getCore(value: Variant): Rect2 = value.asRect2()
    override fun getCoreArray(value: CValue<godot_array>) = Rect2Array(value)
}

fun Rect2ArrayOf(vararg elements: Rect2) = Rect2Array().also {
    for (arg in elements) {
        it.append(arg)
    }
}

class RIDArray : CoreVariantArray<RID> {
    constructor() : super()
    constructor(other: RIDArray) : super(other)
    internal constructor(native: CValue<godot_array>) : super(native)
    internal constructor(mem: COpaquePointer) : super(mem)

    override fun getCore(value: Variant): RID = value.asRID()
    override fun getCoreArray(value: CValue<godot_array>) = RIDArray(value)
}

fun RIDArrayOf(vararg elements: RID) = RIDArray().also {
    for (arg in elements) {
        it.append(arg)
    }
}

class TransformArray : CoreVariantArray<Transform> {
    constructor() : super()
    constructor(other: TransformArray) : super(other)
    internal constructor(native: CValue<godot_array>) : super(native)
    internal constructor(mem: COpaquePointer) : super(mem)

    override fun getCore(value: Variant): Transform = value.asTransform()
    override fun getCoreArray(value: CValue<godot_array>) = TransformArray(value)
}

fun TransformArrayOf(vararg elements: Transform) = TransformArray().also {
    for (arg in elements) {
        it.append(arg)
    }
}

class Transform2DArray : CoreVariantArray<Transform2D> {
    constructor() : super()
    constructor(other: Transform2DArray) : super(other)
    internal constructor(native: CValue<godot_array>) : super(native)
    internal constructor(mem: COpaquePointer) : super(mem)

    override fun getCore(value: Variant): Transform2D = value.asTransform2D()
    override fun getCoreArray(value: CValue<godot_array>) = Transform2DArray(value)
}

fun Transform2DArrayOf(vararg elements: Transform2D) = Transform2DArray().also {
    for (arg in elements) {
        it.append(arg)
    }
}


class Vector2Array : CoreVariantArray<Vector2> {
    constructor() : super()
    constructor(other: Vector2Array) : super(other)
    constructor(other: PoolVector2Array) {
        callNative {
            checkNotNull(Godot.gdnative.godot_array_new_pool_vector2_array)(it, other._handle.ptr)
        }
    }

    internal constructor(native: CValue<godot_array>) : super(native)
    internal constructor(mem: COpaquePointer) : super(mem)

    override fun getCore(value: Variant): Vector2 = value.asVector2()
    override fun getCoreArray(value: CValue<godot_array>) = Vector2Array(value)
}

fun Vector2ArrayOf(vararg elements: Vector2) = Vector2Array().also {
    for (arg in elements) {
        it.append(arg)
    }
}

class Vector3Array : CoreVariantArray<Vector3> {
    constructor() : super()
    constructor(other: Vector3Array) : super(other)
    constructor(other: PoolVector3Array) {
        callNative {
            checkNotNull(Godot.gdnative.godot_array_new_pool_vector3_array)(it, other._handle.ptr)
        }
    }

    internal constructor(native: CValue<godot_array>) : super(native)
    internal constructor(mem: COpaquePointer) : super(mem)

    override fun getCore(value: Variant): Vector3 = value.asVector3()
    override fun getCoreArray(value: CValue<godot_array>) = Vector3Array(value)
}

fun Vector3ArrayOf(vararg elements: Vector3) = Vector3Array().also {
    for (arg in elements) {
        it.append(arg)
    }
}
