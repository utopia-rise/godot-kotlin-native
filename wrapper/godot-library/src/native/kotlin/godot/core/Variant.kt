@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import godot.gdnative.*
import kotlinx.cinterop.*
import godot.Object


actual class Variant: CoreType { // FIXME: redundant .copy
    actual enum class Type(val id: Long) {
        NIL(0),

        BOOL(1),
        INT(2),
        REAL(3),
        STRING(4),

        VECTOR2(5), // 5
        RECT2(6),
        VECTOR3(7),
        TRANSFORM2D(8),
        PLANE(9),
        QUAT(10), // 10
        RECT3(11),
        BASIS(12),
        TRANSFORM(13),

        COLOR(14),
        NODE_PATH(15), // 15
        _RID(16),
        OBJECT(17),
        DICTIONARY(18),
        ARRAY(19),

        POOL_BYTE_ARRAY(20), // 20
        POOL_INT_ARRAY(21),
        POOL_REAL_ARRAY(22),
        POOL_STRING_ARRAY(23),
        POOL_VECTOR2_ARRAY(24),
        POOL_VECTOR3_ARRAY(25), // 25
        POOL_COLOR_ARRAY(26),

        VARIANT_MAX(27);

        actual companion object {
            actual fun fromInt(value: Long) = values().single { it.id == value }
        }
    }

    actual enum class Operator(val id: Long) {
        OP_EQUAL(0),
        OP_NOT_EQUAL(1),
        OP_LESS(2),
        OP_LESS_EQUAL(3),
        OP_GREATER(4),
        OP_GREATER_EQUAL(5),

        OP_ADD(6),
        OP_SUBSTRACT(7),
        OP_MULTIPLY(8),
        OP_DIVIDE(9),
        OP_NEGATE(10),
        OP_POSITIVE(11),
        OP_MODULE(12),
        OP_STRING_CONCAT(13),

        OP_SHIFT_LEFT(14),
        OP_SHIFT_RIGHT(15),
        OP_BIT_AND(16),
        OP_BIT_OR(17),
        OP_BIT_XOR(18),
        OP_BIT_NEGATE(19),

        OP_AND(20),
        OP_OR(21),
        OP_XOR(22),
        OP_NOT(23),

        OP_IN(24),
        OP_MAX(25);

        actual companion object {
            actual fun fromInt(value: Long) = values().single { it.id == value }
        }

    }



    internal var nativeValue = cValue<godot_variant> {}


    actual constructor() {
        nativeValue = nativeValue.copy { godot_variant_new_nil(this.ptr) }
    }

    constructor(native: CValue<godot_variant>) {
        nativeValue = native
    }

    constructor(mem: COpaquePointer) {
        this.setRawMemory(mem)
    }

    actual constructor(other: Variant) {
        nativeValue = nativeValue.copy { godot_variant_new_copy(this.ptr, other.nativeValue) }
    }

    actual constructor(other: Boolean) {
        nativeValue = nativeValue.copy { godot_variant_new_bool(this.ptr, other) }
    }

    actual constructor(other: Byte) {
        nativeValue = nativeValue.copy { godot_variant_new_int(this.ptr, other.toLong()) }
    }

    actual constructor(other: Long) {
        nativeValue = nativeValue.copy { godot_variant_new_int(this.ptr, other) }
    }

    actual constructor(other: Int) {
        nativeValue = nativeValue.copy { godot_variant_new_int(this.ptr, other.toLong()) }
    }

    actual constructor(other: Short) {
        nativeValue = nativeValue.copy { godot_variant_new_int(this.ptr, other.toLong()) }
    }

    actual constructor(other: Double) {
        nativeValue = nativeValue.copy { godot_variant_new_real(this.ptr, other) }
    }

    actual constructor(other: Float) {
        nativeValue = nativeValue.copy { godot_variant_new_real(this.ptr, other.toDouble()) }
    }

    actual constructor(other: String) {
        nativeValue = nativeValue.copy { godot_variant_new_string(this.ptr, other.toGDString()) }
    }

    actual constructor(other: GDArray) {
        nativeValue = nativeValue.copy { godot_variant_new_array(this.ptr, other.nativeValue) }
    }

    actual constructor(other: PoolByteArray) {
        nativeValue = nativeValue.copy { godot_variant_new_pool_byte_array(this.ptr, other.nativeValue) }
    }

    actual constructor(other: PoolIntArray) {
        nativeValue = nativeValue.copy { godot_variant_new_pool_int_array(this.ptr, other.nativeValue) }
    }

    actual constructor(other: PoolColorArray) {
        nativeValue = nativeValue.copy { godot_variant_new_pool_color_array(this.ptr, other.nativeValue) }
    }

    actual constructor(other: PoolRealArray) {
        nativeValue = nativeValue.copy { godot_variant_new_pool_real_array(this.ptr, other.nativeValue) }
    }

    actual constructor(other: PoolStringArray) {
        nativeValue = nativeValue.copy { godot_variant_new_pool_string_array(this.ptr, other.nativeValue) }
    }

    actual constructor(other: PoolVector2Array) {
        nativeValue = nativeValue.copy { godot_variant_new_pool_vector2_array(this.ptr, other.nativeValue) }
    }

    actual constructor(other: PoolVector3Array) {
        nativeValue = nativeValue.copy { godot_variant_new_pool_vector3_array(this.ptr, other.nativeValue) }
    }

    actual constructor(other: RID) {
        nativeValue = nativeValue.copy { godot_variant_new_rid(this.ptr, other.nativeValue) }
    }

    actual constructor(other: Dictionary) {
        nativeValue = nativeValue.copy { godot_variant_new_dictionary(this.ptr, other.nativeValue) }
    }

    actual constructor(other: NodePath) {
        nativeValue = nativeValue.copy { godot_variant_new_node_path(this.ptr, other.nativeValue) }
    }

    actual constructor(other: Basis) {
        memScoped {
            nativeValue = nativeValue.copy { godot_variant_new_rid(this.ptr, other.getRawMemory(memScope).reinterpret()) }
        }
    }

    actual constructor(other: Color) {
        memScoped {
            nativeValue = nativeValue.copy { godot_variant_new_color(this.ptr, other.getRawMemory(memScope).reinterpret()) }
        }
    }

    actual constructor(other: Vector2) {
        memScoped {
            nativeValue = nativeValue.copy { godot_variant_new_vector2(this.ptr, other.getRawMemory(memScope).reinterpret()) }
        }
    }

    actual constructor(other: Vector3) {
        memScoped {
            nativeValue = nativeValue.copy { godot_variant_new_vector3(this.ptr, other.getRawMemory(memScope).reinterpret()) }
        }
    }

    actual constructor(other: Quat) {
        memScoped {
            nativeValue = nativeValue.copy { godot_variant_new_quat(this.ptr, other.getRawMemory(memScope).reinterpret()) }
        }
    }

    actual constructor(other: AABB) {
        memScoped {
            nativeValue = nativeValue.copy { godot_variant_new_aabb(this.ptr, other.getRawMemory(memScope).reinterpret()) }
        }
    }

    actual constructor(other: Transform) {
        memScoped {
            nativeValue = nativeValue.copy { godot_variant_new_transform(this.ptr, other.getRawMemory(memScope).reinterpret()) }
        }
    }

    actual constructor(other: Transform2D) {
        memScoped {
            nativeValue = nativeValue.copy { godot_variant_new_transform2d(this.ptr, other.getRawMemory(memScope).reinterpret()) }
        }
    }

    actual constructor(other: Rect2) {
        memScoped {
            nativeValue = nativeValue.copy { godot_variant_new_rect2(this.ptr, other.getRawMemory(memScope).reinterpret()) }
        }
    }

    actual constructor(other: Plane) {
        memScoped {
            nativeValue = nativeValue.copy { godot_variant_new_plane(this.ptr, other.getRawMemory(memScope).reinterpret()) }
        }
    }

    actual constructor(other: Object?) {
        memScoped {
            nativeValue = if (other != null) {
                nativeValue.copy { godot_variant_new_object(this.ptr, other.getRawMemory(memScope)) }
            } else {
                nativeValue.copy { godot_variant_new_nil(this.ptr) }
            }
        }
    }


    actual companion object {
        infix fun from(value: Any?): Variant = when (value) {
                null -> Variant()
                is Variant -> Variant(value)
                is Boolean -> Variant(value)
                is Byte -> Variant(value)
                is Long -> Variant(value)
                is Int -> Variant(value)
                is Short -> Variant(value)
                is Float -> Variant(value)
                is Double -> Variant(value)
                is String -> Variant(value)
                is GDArray -> Variant(value)
                is PoolByteArray -> Variant(value)
                is PoolIntArray -> Variant(value)
                is PoolColorArray -> Variant(value)
                is PoolRealArray -> Variant(value)
                is PoolStringArray -> Variant(value)
                is PoolVector2Array -> Variant(value)
                is PoolVector3Array -> Variant(value)
                is RID -> Variant(value)
                is Dictionary -> Variant(value)
                is NodePath -> Variant(value)
                is Basis -> Variant(value)
                is Color -> Variant(value)
                is Vector2 -> Variant(value)
                is Vector3 -> Variant(value)
                is Quat -> Variant(value)
                is AABB -> Variant(value)
                is Transform -> Variant(value)
                is Transform2D -> Variant(value)
                is Rect2 -> Variant(value)
                is Plane -> Variant(value)
                is Object -> Variant(value)
                else -> throw TypeCastException("Cannot create Variant from $value")
            }
    }


    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return nativeValue.getPointer(memScope)
    }
    override fun setRawMemory(mem: COpaquePointer) {
        nativeValue = mem.reinterpret<godot_variant>().pointed.readValue()
    }


    actual fun dispose() {
        godot_variant_destroy(nativeValue)
        nativeValue = cValue {}
    }


    actual fun booleanize(): Boolean = godot_variant_booleanize(nativeValue)

    actual fun toBoolean(): Boolean = godot_variant_as_bool(nativeValue)

    actual fun toInt(): Int = this.toLong().toInt()

    actual fun toObject(): Object = Object("").apply { setRawMemory(godot_variant_as_object(nativeValue) ?: throw NullPointerException("godot_variant_as_object return null for ${this@Variant}")) }

    actual fun toLong(): Long = godot_variant_as_int(nativeValue)

    actual fun toFloat(): Float = this.toDouble().toFloat()

    actual fun toDouble(): Double = godot_variant_as_real(nativeValue)

    actual fun toDictionary(): Dictionary = Dictionary(godot_variant_as_dictionary(nativeValue))

    actual fun toGDArray(): GDArray = GDArray(godot_variant_as_array(nativeValue))

    actual fun toNodePath(): NodePath = NodePath(godot_variant_as_node_path(nativeValue))

    actual fun toPoolByteArray(): PoolByteArray = PoolByteArray(godot_variant_as_pool_byte_array(nativeValue))

    actual fun toPoolIntArray(): PoolIntArray = PoolIntArray(godot_variant_as_pool_int_array(nativeValue))

    actual fun toPoolColorArray(): PoolColorArray = PoolColorArray(godot_variant_as_pool_color_array(nativeValue))

    actual fun toPoolRealArray(): PoolRealArray = PoolRealArray(godot_variant_as_pool_real_array(nativeValue))

    actual fun toPoolStringArray(): PoolStringArray = PoolStringArray(godot_variant_as_pool_string_array(nativeValue))

    actual fun toPoolVector2Array(): PoolVector2Array = PoolVector2Array(godot_variant_as_pool_vector2_array(nativeValue))

    actual fun toPoolVector3Array(): PoolVector3Array = PoolVector3Array(godot_variant_as_pool_vector3_array(nativeValue))

    actual fun toBasis(): Basis = Basis(godot_variant_as_basis(nativeValue))

    actual fun toRID(): RID = RID(godot_variant_as_rid(nativeValue))

    actual fun toQuat(): Quat = Quat(godot_variant_as_quat(nativeValue))

    actual fun toVector2(): Vector2 = Vector2(godot_variant_as_vector2(nativeValue))

    actual fun toVector3(): Vector3 = Vector3(godot_variant_as_vector3(nativeValue))

    actual fun toAABB(): AABB = AABB(godot_variant_as_aabb(nativeValue))

    actual fun toPlane(): Plane = Plane(godot_variant_as_plane(nativeValue))

    actual fun toRect2(): Rect2 = Rect2(godot_variant_as_rect2(nativeValue))

    actual fun toTransform(): Transform = Transform(godot_variant_as_transform(nativeValue))

    actual fun toTransform2D(): Transform2D = Transform2D(godot_variant_as_transform2d(nativeValue))

    actual fun getType(): Type = Type.fromInt(godot_variant_get_type(nativeValue).value.toLong())

    actual fun call(str: String, args: Array<Variant>): Variant {
        memScoped {
            val arr = allocArray<CPointerVar<godot_variant>>(args.size)

            for ((idx,arg) in args.withIndex()){
                arr[idx] = arg.nativeValue.useContents { this.ptr }
            }

            val error = alloc<godot_variant_call_error>()

            val result = Variant(godot_variant_call(nativeValue, str.toGDString(), arr, args.size, error.ptr))
            if (error.error != godot_variant_call_error_error.GODOT_CALL_ERROR_CALL_OK)
                throw IllegalStateException("Variant-call \"$str\" returned with error ${error.error}: argument ${error.argument}, expected ${error.expected}")

            return result
        }
    }

    actual fun hasMethod(method: String): Boolean = godot_variant_has_method(nativeValue, method.toGDString())

    actual fun hashCompare(other: Variant): Boolean = godot_variant_hash_compare(nativeValue, other.nativeValue)


    override fun equals(other: Any?): Boolean =
        if(other is Variant) godot_variant_operator_equal(nativeValue, other.nativeValue)
        else false

    override fun toString(): String = godot_variant_as_string(nativeValue).toKString()

    operator fun compareTo(other: Variant) =
            when {
                this == other -> 0
                godot_variant_operator_less(nativeValue, other.nativeValue) -> -1
                else -> 1
            }

    override fun hashCode(): Int {
        return nativeValue.hashCode()
    }
}
