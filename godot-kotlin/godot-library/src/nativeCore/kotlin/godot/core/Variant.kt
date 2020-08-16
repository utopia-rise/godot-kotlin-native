package godot.core


import godot.Object
import godot.gdnative.godot_variant
import godot.gdnative.godot_variant_type
import godot.internal.type.CoreType
import godot.internal.type.VariantInt
import godot.internal.type.nullSafe
import godot.internal.type.toVariantInt
import godot.internal.utils.GodotScope
import godot.internal.utils.godotScoped
import kotlinx.cinterop.*

@Suppress("NON_PUBLIC_PRIMARY_CONSTRUCTOR_OF_INLINE_CLASS", "IMPLICIT_CAST_TO_ANY")
@ExperimentalUnsignedTypes
inline class Variant internal constructor(@PublishedApi internal val _handle: CValue<godot_variant>) {
    //PROPERTIES
    val type: VariantType
        get() {
            return godotScoped {
                VariantType.from(
                    nullSafe(Godot.gdnative.godot_variant_get_type)(
                        ptr
                    ).value.toVariantInt()
                )
            }
        }


    //INTEROP
    fun getRawMemory(): CValue<godot_variant> {
        return _handle
    }


    companion object {
        @PublishedApi
        internal inline fun <reified T> typeForClass(): VariantType {
            return when (T::class) {
                Int::class              -> VariantType.INT
                Long::class             -> VariantType.INT
                Float::class            -> VariantType.REAL
                Double::class           -> VariantType.REAL
                String::class           -> VariantType.STRING
                Boolean::class          -> VariantType.BOOL
                AABB::class             -> VariantType.AABB
                GodotArray::class       -> VariantType.ARRAY
                Basis::class            -> VariantType.BASIS
                Color::class            -> VariantType.COLOR
                Dictionary::class       -> VariantType.DICTIONARY
                NodePath::class         -> VariantType.NODE_PATH
                Plane::class            -> VariantType.PLANE
                PoolByteArray::class    -> VariantType.POOL_BYTE_ARRAY
                PoolColorArray::class   -> VariantType.POOL_COLOR_ARRAY
                PoolIntArray::class     -> VariantType.POOL_INT_ARRAY
                PoolRealArray::class    -> VariantType.POOL_REAL_ARRAY
                PoolStringArray::class  -> VariantType.POOL_STRING_ARRAY
                PoolVector2Array::class -> VariantType.POOL_VECTOR2_ARRAY
                PoolVector3Array::class -> VariantType.POOL_VECTOR3_ARRAY
                Quat::class             -> VariantType.QUAT
                Rect2::class            -> VariantType.RECT2
                RID::class              -> VariantType.RID
                Transform::class        -> VariantType.TRANSFORM
                Transform2D::class      -> VariantType.TRANSFORM2D
                Vector2::class          -> VariantType.VECTOR2
                Vector3::class          -> VariantType.VECTOR3
                Object::class           -> VariantType.OBJECT
                // assume it's null because incompatible with Godot
                else                    -> VariantType.NIL
            }
        }


        //WRAPPING

        fun wrap(obj: Any?): Variant {
            if (obj == null) {
                return Variant()
            }
            return when (obj) {
                //Primitives
                is Unit        -> Variant()
                is Boolean     -> Variant(obj)
                is Int         -> Variant(obj.toLong())
                is Long        -> Variant(obj)
                is Float       -> Variant(obj.toDouble())
                is Double      -> Variant(obj)
                is String      -> Variant(obj)
                //Godot
                is CoreType<*> -> obj.toVariant()
                is Object      -> Variant(obj)
                is Variant     -> obj
                //Non valid objects
                else           -> throw UnsupportedOperationException("Can't convert type ${obj::class} to Variant")
            }
        }
    }

    //UNWRAPPING
    /**
     * Cast the variant to the right type. Warning: It's unsafe
     */
    fun unwrap(): Any? {
        val ret = when (type) {
            VariantType.NIL                -> null
            VariantType.BOOL               -> asBoolean()
            VariantType.INT                -> asInt()
            VariantType.REAL               -> asFloat()
            VariantType.STRING             -> asString()
            VariantType.VECTOR2            -> asVector2()
            VariantType.RECT2              -> asRect2()
            VariantType.VECTOR3            -> asVector3()
            VariantType.TRANSFORM2D        -> asTransform2D()
            VariantType.PLANE              -> asPlane()
            VariantType.QUAT               -> asQuat()
            VariantType.AABB               -> asAABB()
            VariantType.BASIS              -> asBasis()
            VariantType.TRANSFORM          -> asTransform()
            VariantType.COLOR              -> asColor()
            VariantType.NODE_PATH          -> asNodePath()
            VariantType.RID                -> asRID()
            VariantType.OBJECT             -> asObject()
            VariantType.DICTIONARY         -> asDictionary()
            VariantType.ARRAY              -> asArray()
            VariantType.POOL_BYTE_ARRAY    -> asPoolByteArray()
            VariantType.POOL_INT_ARRAY     -> asPoolIntArray()
            VariantType.POOL_REAL_ARRAY    -> asPoolRealArray()
            VariantType.POOL_STRING_ARRAY  -> asPoolStringArray()
            VariantType.POOL_VECTOR2_ARRAY -> asPoolVector2Array()
            VariantType.POOL_VECTOR3_ARRAY -> asPoolVector3Array()
            VariantType.POOL_COLOR_ARRAY   -> asPoolColorArray()
        }
        return ret
    }

    /**
     * Cast the variant to the right type. Warning: It's unsafe
     */
    inline fun <reified T> unwrap(block: (Any?) -> T): T {
        val value = unwrap()
        return block(value)
    }

    /**
     * Cast the Variant to a Boolean.
     */
    fun asBoolean(): Boolean {
        return godotScoped {
            nullSafe(Godot.gdnative.godot_variant_as_bool)(ptr)
        }
    }

    /**
     * Cast the Variant to a Int.
     */
    fun asInt(): Int {
        return asLong().toInt()
    }

    /**
     * Cast the Variant to a Long.
     */
    fun asLong(): Long {
        return godotScoped {
            nullSafe(Godot.gdnative.godot_variant_as_int)(ptr)
        }
    }

    /**
     * Cast the Variant to a Float.
     */
    fun asFloat(): Float {
        return asDouble().toFloat()
    }

    /**
     * Cast the Variant to a Double.
     */
    fun asDouble(): Double {
        return godotScoped {
            nullSafe(Godot.gdnative.godot_variant_as_real)(ptr)
        }
    }

    /**
     * Cast the Variant to an Enum.
     */
    inline fun <reified E : Enum<E>> asEnum(): E {
        val i = asInt()
        val values = enumValues<E>()
        return values.first {
            it.ordinal == i
        }
    }

    /**
     * Cast the Variant to a String.
     */
    fun asString(): String {
        return godotScoped {
            nullSafe(Godot.gdnative.godot_variant_as_string)(ptr).string
        }
    }

    /**
     * Cast the Variant to a Vector2.
     */
    fun asVector2(): Vector2 {
        val value = godotScoped {
            nullSafe(Godot.gdnative.godot_variant_as_vector2)(ptr)
        }
        return Vector2(value)
    }

    /**
     * Cast the Variant to a Rect2.
     */
    fun asRect2(): Rect2 {
        val value = godotScoped {
            nullSafe(Godot.gdnative.godot_variant_as_rect2)(ptr)
        }
        return Rect2(value)
    }

    /**
     * Cast the Variant to a Vector3.
     */
    fun asVector3(): Vector3 {
        val value = godotScoped {
            nullSafe(Godot.gdnative.godot_variant_as_vector3)(ptr)
        }
        return Vector3(value)
    }

    /**
     * Cast the Variant to a Transform2D.
     */
    fun asTransform2D(): Transform2D {
        val value = godotScoped {
            nullSafe(Godot.gdnative.godot_variant_as_transform2d)(ptr)
        }
        return Transform2D(value)
    }

    /**
     * Cast the Variant to a Plane.
     */
    fun asPlane(): Plane {
        val value = godotScoped {
            nullSafe(Godot.gdnative.godot_variant_as_plane)(ptr)
        }
        return Plane(value)
    }

    /**
     * Cast the Variant to a Quat.
     */
    fun asQuat(): Quat {
        val value = godotScoped {
            nullSafe(Godot.gdnative.godot_variant_as_quat)(ptr)
        }
        return Quat(value)
    }

    /**
     * Cast the Variant to a AABB.
     */
    fun asAABB(): AABB {
        val value = godotScoped {
            nullSafe(Godot.gdnative.godot_variant_as_aabb)(ptr)
        }
        return AABB(value)
    }

    /**
     * Cast the Variant to a Basis.
     */
    fun asBasis(): Basis {
        val value = godotScoped {
            nullSafe(Godot.gdnative.godot_variant_as_basis)(ptr)
        }
        return Basis(value)
    }

    /**
     * Cast the Variant to a Transform.
     */
    fun asTransform(): Transform {
        val value = godotScoped {
            nullSafe(Godot.gdnative.godot_variant_as_transform)(ptr)
        }
        return Transform(value)
    }

    /**
     * Cast the Variant to a Color.
     */
    fun asColor(): Color {
        val value = godotScoped {
            nullSafe(Godot.gdnative.godot_variant_as_color)(ptr)
        }
        return Color(value)
    }

    /**
     * Cast the Variant to a NodePath.
     */
    fun asNodePath(): NodePath {
        val value = godotScoped {
            nullSafe(Godot.gdnative.godot_variant_as_node_path)(ptr)
        }
        return NodePath(value)
    }

    /**
     * Cast the Variant to a RiD.
     */
    fun asRID(): RID {
        val value = godotScoped {
            nullSafe(Godot.gdnative.godot_variant_as_rid)(ptr)
        }
        return RID(value)
    }


    /**
     * Cast the Variant to a Godot Object.
     */
    fun asObject(): Object? {
        return godotScoped {
            val ptr = nullSafe(Godot.gdnative.godot_variant_as_object)(ptr)
            if (ptr == null) {
                null
            } else {
                TypeManager.wrap(ptr)
            }
        }
    }

    /**
     * Cast the Variant to a Dictionary.
     */
    fun asDictionary(): Dictionary<Any, Any> {
        val value = godotScoped {
            nullSafe(Godot.gdnative.godot_variant_as_dictionary)(ptr)
        }
        return Dictionary(value)
    }

    /**
     * Cast the Variant to an Array
     */
    fun asArray(): GodotArray<Any?> {
        val value = godotScoped {
            nullSafe(Godot.gdnative.godot_variant_as_array)(ptr)
        }
        return GodotArray(value)
    }


    /**
     * Cast the Variant to a PoolByteArray.
     */
    fun asPoolByteArray(): PoolByteArray {
        val value = godotScoped {
            nullSafe(Godot.gdnative.godot_variant_as_pool_byte_array)(ptr)
        }
        return PoolByteArray(value)
    }

    /**
     * Cast the Variant to a PoolColorArray.
     */
    fun asPoolColorArray(): PoolColorArray {
        val value = godotScoped {
            nullSafe(Godot.gdnative.godot_variant_as_pool_color_array)(ptr)
        }
        return PoolColorArray(value)
    }

    /**
     * Cast the Variant to a PoolIntArray.
     */
    fun asPoolIntArray(): PoolIntArray {
        val value = godotScoped {
            nullSafe(Godot.gdnative.godot_variant_as_pool_int_array)(ptr)
        }
        return PoolIntArray(value)
    }

    /**
     * Cast the Variant to a PoolRealArray.
     */
    fun asPoolRealArray(): PoolRealArray {
        val value = godotScoped {
            nullSafe(Godot.gdnative.godot_variant_as_pool_real_array)(ptr)
        }
        return PoolRealArray(value)
    }

    /**
     * Cast the Variant to a PoolStringArray.
     */
    fun asPoolStringArray(): PoolStringArray {
        val value = godotScoped {
            nullSafe(Godot.gdnative.godot_variant_as_pool_string_array)(ptr)
        }
        return PoolStringArray(value)
    }

    /**
     * Cast the Variant to a PoolVector2Array.
     */
    fun asPoolVector2Array(): PoolVector2Array {
        val value = godotScoped {
            nullSafe(Godot.gdnative.godot_variant_as_pool_vector2_array)(ptr)
        }
        return PoolVector2Array(value)
    }

    /**
     * Cast the Variant to a PoolVector3Array.
     */
    fun asPoolVector3Array(): PoolVector3Array {
        val value = godotScoped {
            nullSafe(Godot.gdnative.godot_variant_as_pool_vector3_array)(ptr)
        }
        return PoolVector3Array(value)
    }


    //UTILITIES
    fun toVariant() = this
}

//FAKE CONSTRUCTORS. Necessary because inline classes don't support secondary constructors yet.
//NULL
fun Variant() = Variant(
    godotScoped {
        cValue<godot_variant> {
            nullSafe(Godot.gdnative.godot_variant_new_nil)(this.ptr)
        }
    }
)

//PRIMITIVES
fun Variant(from: Boolean) = Variant(
    godotScoped {
        cValue<godot_variant> {
            nullSafe(Godot.gdnative.godot_variant_new_bool)(this.ptr, from)
        }
    }
)

fun Variant(from: Int) = Variant(
    godotScoped {
        cValue<godot_variant> {
            nullSafe(Godot.gdnative.godot_variant_new_int)(this.ptr, from.toLong())
        }
    }
)

fun <T : Enum<T>> Variant(from: Enum<T>) = Variant(
    godotScoped {
        cValue<godot_variant> {
            nullSafe(Godot.gdnative.godot_variant_new_int)(
                this.ptr,
                from.ordinal.toLong()
            )
        }
    }
)

fun Variant(from: Long) = Variant(
    godotScoped {
        cValue<godot_variant> {
            nullSafe(Godot.gdnative.godot_variant_new_int)(this.ptr, from)
        }
    }
)

fun Variant(from: Float) = Variant(
    godotScoped {
        cValue<godot_variant> {
            nullSafe(Godot.gdnative.godot_variant_new_real)(this.ptr, from.toDouble())
        }
    }
)

fun Variant(from: Double) = Variant(
    godotScoped {
        cValue<godot_variant> {
            nullSafe(Godot.gdnative.godot_variant_new_real)(this.ptr, from)
        }
    }
)

fun Variant(from: String) = Variant(
    godotScoped {
        cValue<godot_variant> {
            nullSafe(Godot.gdnative.godot_variant_new_string)(
                this.ptr,
                from.ptr
            )
        }
    }
)


//OBJECT
fun Variant(from: Object) = Variant(
    godotScoped {
        cValue<godot_variant> {
            nullSafe(Godot.gdnative.godot_variant_new_object)(this.ptr, from.ptr)
        }
    }
)

/**
 * Helper for the core Variant constructors
 */
internal fun <T : CPointed> wrapCore(
    block: CPointer<CFunction<(CPointer<godot_variant>?, CPointer<T>?) -> Unit>>?,
    core: CoreType<*>
): Variant {
    return Variant(
        godotScoped {
            val value = core.getRawMemory()
            cValue<godot_variant> {
                nullSafe(block)(this.ptr, value.ptr as CPointer<T>)
            }
        }
    )
}


//CORE
fun Variant(from: AABB) = wrapCore(
    Godot.gdnative.godot_variant_new_aabb,
    from
)

fun Variant(from: Basis) = wrapCore(
    Godot.gdnative.godot_variant_new_basis,
    from
)

fun Variant(from: Color) = wrapCore(
    Godot.gdnative.godot_variant_new_color,
    from
)

fun Variant(from: NodePath) = wrapCore(
    Godot.gdnative.godot_variant_new_node_path,
    from
)

fun Variant(from: Plane) = wrapCore(
    Godot.gdnative.godot_variant_new_plane,
    from
)

fun Variant(from: Quat) = wrapCore(
    Godot.gdnative.godot_variant_new_quat,
    from
)

fun Variant(from: RID) = wrapCore(
    Godot.gdnative.godot_variant_new_rid,
    from
)

fun Variant(from: Vector2) = wrapCore(
    Godot.gdnative.godot_variant_new_vector2,
    from
)

fun Variant(from: Vector3) = wrapCore(
    Godot.gdnative.godot_variant_new_vector3,
    from
)

fun Variant(from: Transform2D) = wrapCore(
    Godot.gdnative.godot_variant_new_transform2d,
    from
)

fun Variant(from: Transform) = wrapCore(
    Godot.gdnative.godot_variant_new_transform,
    from
)

fun Variant(from: Rect2) = wrapCore(
    Godot.gdnative.godot_variant_new_rect2,
    from
)

fun <K : Any, V : Any> Variant(from: Dictionary<K, V>) = wrapCore(
    Godot.gdnative.godot_variant_new_dictionary,
    from
)

fun Variant(from: Variant) = from

//CONTAINER CORE
fun Variant(from: PoolByteArray) =
    wrapCore(
        Godot.gdnative.godot_variant_new_pool_byte_array,
        from
    )

fun Variant(from: PoolColorArray) =
    wrapCore(
        Godot.gdnative.godot_variant_new_pool_color_array,
        from
    )

fun Variant(from: PoolIntArray) =
    wrapCore(
        Godot.gdnative.godot_variant_new_pool_int_array,
        from
    )

fun Variant(from: PoolRealArray) =
    wrapCore(
        Godot.gdnative.godot_variant_new_pool_real_array,
        from
    )

fun Variant(from: PoolStringArray) =
    wrapCore(
        Godot.gdnative.godot_variant_new_pool_string_array,
        from
    )

fun Variant(from: PoolVector2Array) =
    wrapCore(
        Godot.gdnative.godot_variant_new_pool_vector2_array,
        from
    )

fun Variant(from: PoolVector3Array) =
    wrapCore(
        Godot.gdnative.godot_variant_new_pool_vector3_array,
        from
    )

fun <T> Variant(from: GodotArray<T>) =
    wrapCore(
        Godot.gdnative.godot_variant_new_array,
        from
    )

//Use the wrap function to check if the type of the parameter is valid
fun Variant(from: Any?): Variant = Variant.wrap(from)

//EXTENSION METHOD TO CAST PRIMITIVES TO VARIANT
@PublishedApi internal fun Any?.toVariant() = Variant(this)
@PublishedApi internal fun Boolean.toVariant() = Variant(this)
@PublishedApi internal fun Int.toVariant() = Variant(this)
@PublishedApi internal fun Long.toVariant() = Variant(this)
@PublishedApi internal fun Float.toVariant() = Variant(this)
@PublishedApi internal fun Double.toVariant() = Variant(this)
@PublishedApi internal fun String.toVariant() = Variant(this)
@PublishedApi internal fun <T : Enum<T>> Enum<T>.toVariant() = Variant(this)

//TYPE
enum class VariantType(val value: VariantInt) {
    NIL(godot_variant_type.GODOT_VARIANT_TYPE_NIL.value.toVariantInt()),
    BOOL(godot_variant_type.GODOT_VARIANT_TYPE_BOOL.value.toVariantInt()),
    INT(godot_variant_type.GODOT_VARIANT_TYPE_INT.value.toVariantInt()),
    REAL(godot_variant_type.GODOT_VARIANT_TYPE_REAL.value.toVariantInt()),
    STRING(godot_variant_type.GODOT_VARIANT_TYPE_STRING.value.toVariantInt()),
    VECTOR2(godot_variant_type.GODOT_VARIANT_TYPE_VECTOR2.value.toVariantInt()),
    RECT2(godot_variant_type.GODOT_VARIANT_TYPE_RECT2.value.toVariantInt()),
    VECTOR3(godot_variant_type.GODOT_VARIANT_TYPE_VECTOR3.value.toVariantInt()),
    TRANSFORM2D(godot_variant_type.GODOT_VARIANT_TYPE_TRANSFORM2D.value.toVariantInt()),
    PLANE(godot_variant_type.GODOT_VARIANT_TYPE_PLANE.value.toVariantInt()),
    QUAT(godot_variant_type.GODOT_VARIANT_TYPE_QUAT.value.toVariantInt()),
    AABB(godot_variant_type.GODOT_VARIANT_TYPE_AABB.value.toVariantInt()),
    BASIS(godot_variant_type.GODOT_VARIANT_TYPE_BASIS.value.toVariantInt()),
    TRANSFORM(godot_variant_type.GODOT_VARIANT_TYPE_TRANSFORM.value.toVariantInt()),
    COLOR(godot_variant_type.GODOT_VARIANT_TYPE_COLOR.value.toVariantInt()),
    NODE_PATH(godot_variant_type.GODOT_VARIANT_TYPE_NODE_PATH.value.toVariantInt()),
    RID(godot_variant_type.GODOT_VARIANT_TYPE_RID.value.toVariantInt()),
    OBJECT(godot_variant_type.GODOT_VARIANT_TYPE_OBJECT.value.toVariantInt()),
    DICTIONARY(godot_variant_type.GODOT_VARIANT_TYPE_DICTIONARY.value.toVariantInt()),
    ARRAY(godot_variant_type.GODOT_VARIANT_TYPE_ARRAY.value.toVariantInt()),
    POOL_BYTE_ARRAY(godot_variant_type.GODOT_VARIANT_TYPE_POOL_BYTE_ARRAY.value.toVariantInt()),
    POOL_INT_ARRAY(godot_variant_type.GODOT_VARIANT_TYPE_POOL_INT_ARRAY.value.toVariantInt()),
    POOL_REAL_ARRAY(godot_variant_type.GODOT_VARIANT_TYPE_POOL_REAL_ARRAY.value.toVariantInt()),
    POOL_STRING_ARRAY(godot_variant_type.GODOT_VARIANT_TYPE_POOL_STRING_ARRAY.value.toVariantInt()),
    POOL_COLOR_ARRAY(godot_variant_type.GODOT_VARIANT_TYPE_POOL_COLOR_ARRAY.value.toVariantInt()),
    POOL_VECTOR2_ARRAY(godot_variant_type.GODOT_VARIANT_TYPE_POOL_VECTOR2_ARRAY.value.toVariantInt()),
    POOL_VECTOR3_ARRAY(godot_variant_type.GODOT_VARIANT_TYPE_POOL_VECTOR3_ARRAY.value.toVariantInt());

    companion object {
        private val types = mapOf(
            NIL.value to NIL,
            BOOL.value to BOOL,
            INT.value to INT,
            REAL.value to REAL,
            STRING.value to STRING,
            VECTOR2.value to VECTOR2,
            RECT2.value to RECT2,
            VECTOR3.value to VECTOR3,
            TRANSFORM2D.value to TRANSFORM2D,
            PLANE.value to PLANE,
            QUAT.value to QUAT,
            AABB.value to AABB,
            BASIS.value to BASIS,
            TRANSFORM.value to TRANSFORM,
            COLOR.value to COLOR,
            NODE_PATH.value to NODE_PATH,
            RID.value to RID,
            OBJECT.value to OBJECT,
            DICTIONARY.value to DICTIONARY,
            ARRAY.value to ARRAY,
            POOL_BYTE_ARRAY.value to POOL_BYTE_ARRAY,
            POOL_INT_ARRAY.value to POOL_INT_ARRAY,
            POOL_REAL_ARRAY.value to POOL_REAL_ARRAY,
            POOL_STRING_ARRAY.value to POOL_STRING_ARRAY,
            POOL_VECTOR2_ARRAY.value to POOL_VECTOR2_ARRAY,
            POOL_VECTOR3_ARRAY.value to POOL_VECTOR3_ARRAY,
            POOL_COLOR_ARRAY.value to POOL_COLOR_ARRAY
        )

        fun from(value: VariantInt): VariantType {
            return types[value] ?: throw NoSuchElementException("Unknown value: $value")
        }
    }
}

enum class VariantOperator(val id: VariantInt) {
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
        fun from(value: VariantInt) = when (value) {
            0L   -> OP_EQUAL
            1L   -> OP_NOT_EQUAL
            2L   -> OP_LESS
            3L   -> OP_LESS_EQUAL
            4L   -> OP_GREATER
            5L   -> OP_GREATER_EQUAL

            6L   -> OP_ADD
            7L   -> OP_SUBSTRACT
            8L   -> OP_MULTIPLY
            9L   -> OP_DIVIDE
            10L  -> OP_NEGATE
            11L  -> OP_POSITIVE
            12L  -> OP_MODULE
            13L  -> OP_STRING_CONCAT

            14L  -> OP_SHIFT_LEFT
            15L  -> OP_SHIFT_RIGHT
            16L  -> OP_BIT_AND
            17L  -> OP_BIT_OR
            18L  -> OP_BIT_XOR
            19L  -> OP_BIT_NEGATE

            20L  -> OP_AND
            21L  -> OP_OR
            22L  -> OP_XOR
            23L  -> OP_NOT

            24L  -> OP_IN
            25L  -> OP_MAX
            else -> throw AssertionError("Unknown operator: $value")
        }
    }
}
