package godot.core

import godot.gdnative.*
import kotlinx.cinterop.*
import godot.Object


class Variant: CoreType { // FIXME: redundant .copy
    enum class Type(val id: Int) {
        NIL(0),

        BOOL(1),
        INT(2),
        REAL(3),
        STRING(4),

        VECTOR2(5),        // 5
        RECT2(6),
        VECTOR3(7),
        TRANSFORM2D(8),
        PLANE(9),
        QUAT(10),            // 10
        RECT3(11),
        BASIS(12),
        TRANSFORM(13),

        COLOR(14),
        NODE_PATH(15),              // 15
        _RID(16),
        OBJECT(17),
        DICTIONARY(18),
        ARRAY(19),

        POOL_BYTE_ARRAY(20),        // 20
        POOL_INT_ARRAY(21),
        POOL_REAL_ARRAY(22),
        POOL_STRING_ARRAY(23),
        POOL_VECTOR2_ARRAY(24),
        POOL_VECTOR3_ARRAY(25),     // 25
        POOL_COLOR_ARRAY(26),

        VARIANT_MAX(27);

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }

    enum class Operator(val id: Int) {
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

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }

    }



    internal var nativeValue = cValue<godot_variant> {}

    constructor():
            this(null)

    constructor(value: Any?) {
        if (value is CValue<*>) {
            nativeValue = value as? CValue<godot_variant> ?: cValue {}
            return
        }
        if (value is CPointer<*>) {
            this.setRawMemory(value)
            return
        }

        nativeValue = nativeValue.copy {
            when (value) {
                null -> godot_variant_new_nil(this@copy.ptr)
                is Variant -> godot_variant_new_copy(this@copy.ptr, value.nativeValue)
                is Boolean -> godot_variant_new_bool(this@copy.ptr, value)
                is Byte -> godot_variant_new_int(this@copy.ptr, value.toLong())
                is Long -> godot_variant_new_int(this@copy.ptr, value)
                is Int -> godot_variant_new_int(this@copy.ptr, value.toLong())
                is Short -> godot_variant_new_int(this@copy.ptr, value.toLong())
                is Float -> godot_variant_new_real(this@copy.ptr, value.toDouble())
                is Double -> godot_variant_new_real(this@copy.ptr, value)
                is String -> godot_variant_new_string(this@copy.ptr, value.toGDString())
                is GodotArray -> godot_variant_new_array(this@copy.ptr, value.nativeValue)
                is PoolByteArray -> godot_variant_new_pool_byte_array(this@copy.ptr, value.nativeValue)
                is PoolIntArray -> godot_variant_new_pool_int_array(this@copy.ptr, value.nativeValue)
                is PoolColorArray -> godot_variant_new_pool_color_array(this@copy.ptr, value.nativeValue)
                is PoolRealArray -> godot_variant_new_pool_real_array(this@copy.ptr, value.nativeValue)
                is PoolStringArray -> godot_variant_new_pool_string_array(this@copy.ptr, value.nativeValue)
                is PoolVector2Array -> godot_variant_new_pool_vector2_array(this@copy.ptr, value.nativeValue)
                is PoolVector3Array -> godot_variant_new_pool_vector3_array(this@copy.ptr, value.nativeValue)
                is RID -> godot_variant_new_rid(this@copy.ptr, value.nativeValue)
                is Dictionary -> godot_variant_new_dictionary(this@copy.ptr, value.nativeValue)
                is NodePath -> godot_variant_new_node_path(this@copy.ptr, value.nativeValue)
                is Basis -> memScoped { godot_variant_new_basis(this@copy.ptr, value.getRawMemory(memScope).reinterpret()) }
                is Color -> memScoped { godot_variant_new_pool_color_array(this@copy.ptr, value.getRawMemory(memScope).reinterpret()) }
                is Vector2 -> memScoped { godot_variant_new_vector2(this@copy.ptr, value.getRawMemory(memScope).reinterpret()) }
                is Vector3 -> memScoped { godot_variant_new_vector3(this@copy.ptr, value.getRawMemory(memScope).reinterpret()) }
                is Quat -> memScoped { godot_variant_new_quat(this@copy.ptr, value.getRawMemory(memScope).reinterpret()) }
                is AABB -> memScoped { godot_variant_new_aabb(this@copy.ptr, value.getRawMemory(memScope).reinterpret()) }
                is Transform -> memScoped { godot_variant_new_transform(this@copy.ptr, value.getRawMemory(memScope).reinterpret()) }
                is Transform2D -> memScoped { godot_variant_new_transform2d(this@copy.ptr, value.getRawMemory(memScope).reinterpret()) }
                is Rect2 -> memScoped { godot_variant_new_rect2(this@copy.ptr, value.getRawMemory(memScope).reinterpret()) }
                is Plane -> memScoped { godot_variant_new_plane(this@copy.ptr, value.getRawMemory(memScope).reinterpret()) }
                is Object -> memScoped { godot_variant_new_object(this@copy.ptr, value.getRawMemory(memScope)) }
                else -> throw TypeCastException("Cannot create Variant from $value")
            }
        }
    }


    companion object {
        infix fun from(value: Any?): Variant = Variant(value)
    }


    fun dispose() {
        godot_variant_destroy(nativeValue)
        nativeValue = cValue {}
    }


    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return nativeValue.getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        nativeValue = mem.reinterpret<godot_variant>().pointed.readValue()
    }

    fun booleanize(): Boolean = godot_variant_booleanize(nativeValue)

    fun toBoolean(): Boolean = godot_variant_as_bool(nativeValue)

    fun toInt(): Int = this.toLong().toInt()

    fun toObject(): Object = Object("").apply { setRawMemory(godot_variant_as_object(nativeValue) ?: throw NullPointerException("godot_variant_as_object return null for ${this@Variant}")) }

    fun toLong(): Long = godot_variant_as_int(nativeValue)

    override fun toString(): String = godot_variant_as_string(nativeValue).toKString()

    fun toDouble(): Double = godot_variant_as_real(nativeValue)

    fun toFloat(): Float = this.toDouble().toFloat()

    fun toDictionary(): Dictionary = Dictionary(godot_variant_as_dictionary(nativeValue))

    fun toGodotArray(): GodotArray = GodotArray(godot_variant_as_array(nativeValue))

    fun toNodePath(): NodePath = NodePath(godot_variant_as_node_path(nativeValue))

    fun toPoolByteArray(): PoolByteArray = PoolByteArray(godot_variant_as_pool_byte_array(nativeValue))

    fun toPoolIntArray(): PoolIntArray = PoolIntArray(godot_variant_as_pool_int_array(nativeValue))

    fun toPoolColorArray(): PoolColorArray = PoolColorArray(godot_variant_as_pool_color_array(nativeValue))

    fun toPoolRealArray(): PoolRealArray = PoolRealArray(godot_variant_as_pool_real_array(nativeValue))

    fun toPoolStringArray(): PoolStringArray = PoolStringArray(godot_variant_as_pool_string_array(nativeValue))

    fun toPoolVector2Array(): PoolVector2Array = PoolVector2Array(godot_variant_as_pool_vector2_array(nativeValue))

    fun toPoolVector3Array(): PoolVector3Array = PoolVector3Array(godot_variant_as_pool_vector3_array(nativeValue))

    fun toBasis(): Basis = Basis(godot_variant_as_basis(nativeValue))

    fun toRID(): RID = RID(godot_variant_as_rid(nativeValue))

    fun toQuat(): Quat = Quat(godot_variant_as_quat(nativeValue))

    fun toVector2(): Vector2 = Vector2(godot_variant_as_vector2(nativeValue))

    fun toVector3(): Vector3 = Vector3(godot_variant_as_vector3(nativeValue))

    fun toAABB(): AABB = AABB(godot_variant_as_aabb(nativeValue))

    fun toPlane(): Plane = Plane(godot_variant_as_plane(nativeValue))

    fun toRect2(): Rect2 = Rect2(godot_variant_as_rect2(nativeValue))

    fun toTransform(): Transform = Transform(godot_variant_as_transform(nativeValue))

    fun toTransform2D(): Transform2D = Transform2D(godot_variant_as_transform2d(nativeValue))

    fun getType(): Variant.Type = Type.fromInt(godot_variant_get_type(nativeValue).value)

    fun call(str: String, args: Array<Variant>): Variant {
        memScoped {
            val arr = allocArray<CPointerVar<godot_variant>>(args.size)
            for((idx,arg) in args.withIndex()){
                arr[idx] = arg.nativeValue.useContents { this.ptr }
            }
            val error = alloc<godot_variant_call_error>()
            val result = Variant(godot_variant_call(nativeValue, str.toGDString(), arr, args.size, error.ptr))
            // TODO: if error is not success printError it
            return result
        }
    }

    fun hasMethod(method: String): Boolean = godot_variant_has_method(nativeValue, method.toGDString())

    override fun equals(other: Any?): Boolean =
        if(other is Variant) godot_variant_operator_equal(nativeValue, other.nativeValue)
        else false

    fun hashCompare(other: Variant): Boolean = godot_variant_hash_compare(nativeValue, other.nativeValue)

    operator fun compareTo(other: Variant) =
            when {
                this == other -> 0
                godot_variant_operator_less(nativeValue, other.nativeValue) -> -1
                else -> 1
            }

    override fun hashCode(): Int {
        return nativeValue.hashCode()
    }

    override fun isNull(): Boolean = false // TODO: make me beautiful
}
