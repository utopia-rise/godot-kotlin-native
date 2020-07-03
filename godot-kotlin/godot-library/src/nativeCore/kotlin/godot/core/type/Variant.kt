package godot.core

import godot.gdnative.godot_pool_byte_array
import godot.gdnative.godot_variant
import godot.gdnative.godot_variant_type
import kotlinx.cinterop.*

inline class Variant(internal val _handle: CValue<godot_variant>) {

    //INTEROP
    fun getRawMemory(memScope: MemScope): COpaquePointer {
        return _handle.getPointer(memScope)
    }

    //TYPE
    enum class Type(val value: Int) {
        NIL(godot_variant_type.GODOT_VARIANT_TYPE_NIL.value.toInt()),
        BOOL(godot_variant_type.GODOT_VARIANT_TYPE_BOOL.value.toInt()),
        INT(godot_variant_type.GODOT_VARIANT_TYPE_INT.value.toInt()),
        REAL(godot_variant_type.GODOT_VARIANT_TYPE_REAL.value.toInt()),
        STRING(godot_variant_type.GODOT_VARIANT_TYPE_STRING.value.toInt()),
        VECTOR2(godot_variant_type.GODOT_VARIANT_TYPE_VECTOR2.value.toInt()),
        RECT2(godot_variant_type.GODOT_VARIANT_TYPE_RECT2.value.toInt()),
        VECTOR3(godot_variant_type.GODOT_VARIANT_TYPE_VECTOR3.value.toInt()),
        TRANSFORM2D(godot_variant_type.GODOT_VARIANT_TYPE_TRANSFORM2D.value.toInt()),
        PLANE(godot_variant_type.GODOT_VARIANT_TYPE_PLANE.value.toInt()),
        QUAT(godot_variant_type.GODOT_VARIANT_TYPE_QUAT.value.toInt()),
        AABB(godot_variant_type.GODOT_VARIANT_TYPE_AABB.value.toInt()),
        BASIS(godot_variant_type.GODOT_VARIANT_TYPE_BASIS.value.toInt()),
        TRANSFORM(godot_variant_type.GODOT_VARIANT_TYPE_TRANSFORM.value.toInt()),
        COLOR(godot_variant_type.GODOT_VARIANT_TYPE_COLOR.value.toInt()),
        NODE_PATH(godot_variant_type.GODOT_VARIANT_TYPE_NODE_PATH.value.toInt()),
        RID(godot_variant_type.GODOT_VARIANT_TYPE_RID.value.toInt()),
        OBJECT(godot_variant_type.GODOT_VARIANT_TYPE_OBJECT.value.toInt()),
        DICTIONARY(godot_variant_type.GODOT_VARIANT_TYPE_DICTIONARY.value.toInt()),
        ARRAY(godot_variant_type.GODOT_VARIANT_TYPE_ARRAY.value.toInt()),
        POOL_BYTE_ARRAY(godot_variant_type.GODOT_VARIANT_TYPE_POOL_BYTE_ARRAY.value.toInt()),
        POOL_INT_ARRAY(godot_variant_type.GODOT_VARIANT_TYPE_POOL_INT_ARRAY.value.toInt()),
        POOL_REAL_ARRAY(godot_variant_type.GODOT_VARIANT_TYPE_POOL_REAL_ARRAY.value.toInt()),
        POOL_STRING_ARRAY(godot_variant_type.GODOT_VARIANT_TYPE_POOL_STRING_ARRAY.value.toInt()),
        POOL_COLOR_ARRAY(godot_variant_type.GODOT_VARIANT_TYPE_POOL_COLOR_ARRAY.value.toInt()),
        POOL_VECTOR2_ARRAY(godot_variant_type.GODOT_VARIANT_TYPE_POOL_VECTOR2_ARRAY.value.toInt()),
        POOL_VECTOR3_ARRAY(godot_variant_type.GODOT_VARIANT_TYPE_POOL_VECTOR3_ARRAY.value.toInt());

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

            fun from(value: Int): Type {
                return types[value] ?: throw AssertionError("Unknown value: $value")
            }
        }
    }

    val type: Type
        get() {
            return memScoped {
                Type.from(checkNotNull(Godot.gdnative.godot_variant_get_type)(_handle.ptr).value.toInt())
            }
        }

    //WRAPPING
    companion object {
        fun wrap(obj: Any?): Variant {
            if (obj == null) {
                return Variant()
            }
            return when (obj) {
                is Unit -> Variant()
                is Int -> Variant(obj)
                is Float -> Variant(obj)
                is String -> Variant(obj)
                is Boolean -> Variant(obj)
                is CoreType -> obj.toVariant()
                is Variant -> obj
                is Object -> Variant(obj)
                else -> throw UnsupportedOperationException("Can't convert type ${obj::class} to Variant")
            }
        }

        /**
         * Helper for the Nil Variant constructor
         */
        internal fun buildAny(block: CPointer<CFunction<(CPointer<godot_variant>?) -> Unit>>?): Variant {
            return Variant(
                memScoped {
                    cValue {
                        checkNotNull(block)(this.ptr)
                    }
                }
            )
        }

        /**
         * Helper for the primitive Variant constructors
         */
        internal fun <T> buildAny(
            block: CPointer<CFunction<(CPointer<godot_variant>?, T) -> Unit>>?,
            value: T
        ): Variant {
            return Variant(
                memScoped {
                    cValue {
                        checkNotNull(block)(this.ptr, value)
                    }
                }
            )
        }

        /**
         * Helper for the core Variant constructors
         */
        internal fun <T: CPointed>  buildAny(
            block: CPointer<CFunction<(CPointer<godot_variant>?, CPointer<T>?) -> Unit>>?,
            core: CoreType
        ): Variant {
            return Variant(
                memScoped {
                    val ptr = core.getRawMemory(this).reinterpret<T>()
                    cValue {
                        checkNotNull(block)(this.ptr,  ptr)
                    }
                }
            )
        }
    }

    //UNWRAPPING
    /**
     * Helper for the Nil Variant constructor
     */
    inline fun <reified T> unwrap(): T {
        return when (T::class) {
            Int::class -> this.asInt()
            Float::class -> Type.FLOAT
            String::class -> Type.STRING
            Boolean::class -> Type.BOOL
            AABB::class -> Type.AABB
            VariantArray::class -> Type.ARRAY
            Basis::class -> Type.BASIS
            Color::class -> Type.COLOR
            Dictionary::class -> Type.DICTIONARY
            NodePath::class -> Type.NODE_PATH
            Plane::class -> Type.PLANE
            PoolByteArray::class -> Type.POOL_BYTE_ARRAY
            PoolColorArray::class -> Type.POOL_COLOR_ARRAY
            PoolIntArray::class -> Type.POOL_INT_ARRAY
            PoolFloatArray::class -> Type.POOL_FLOAT_ARRAY
            PoolStringArray::class -> Type.POOL_STRING_ARRAY
            PoolVector2Array::class -> Type.POOL_VECTOR2_ARRAY
            PoolVector3Array::class -> Type.POOL_VECTOR3_ARRAY
            Quat::class -> Type.QUAT
            Rect2::class -> Type.RECT2
            RID::class -> Type.RID
            Transform::class -> Type.TRANSFORM
            Transform2D::class -> Type.TRANSFORM2D
            Vector2::class -> Type.VECTOR2
            Vector3::class -> Type.VECTOR3
            // assume an object
            else -> Type.OBJECT
        }
    }

    fun asString(): String {
            val gdString = memScoped {
                checkNotNull(Godot.gdnative.godot_variant_as_string)(_handle.ptr)
            }
        return gdString.toKString()
    }

    fun asInt(): Int {
        return asLong().toInt()
    }

    fun asLong(): Long {
        return memScoped {
            checkNotNull(Godot.gdnative.godot_variant_as_int)(_handle.ptr)
        }
    }

    fun asDouble(): Double {
        return memScoped {
            checkNotNull(Godot.gdnative.godot_variant_as_real)(_handle.ptr)
        }
    }

    fun asFloat(): Float {
        return asDouble().toFloat()
    }

    fun asBoolean(): Boolean {
        return memScoped {
            checkNotNull(Godot.gdnative.godot_variant_as_bool)(_handle.ptr)
        }
    }

    fun asAABB(): AABB {
        val value = memScoped {
            checkNotNull(Godot.gdnative.godot_variant_as_aabb)(_handle.ptr)
        }
        return AABB(value)
    }

    fun asBasis(): Basis {
        val value = memScoped {
            checkNotNull(Godot.gdnative.godot_variant_as_basis)(_handle.ptr)
        }
        return Basis(value)
    }

    fun asColor(): Color {
        val value = memScoped {
            checkNotNull(Godot.gdnative.godot_variant_as_color)(_handle.ptr)
        }
        return Color(value)
    }

    fun <T> asVariantArray(): VariantArray<T> {
        val value = memScoped {
            checkNotNull(Godot.gdnative.godot_variant_as_array)(_handle.ptr)
        }
        return VariantArray(value)
    }

    fun asPoolByteArray(): PoolByteArray {
        val value = memScoped {
            checkNotNull(Godot.gdnative.godot_variant_as_pool_byte_array)(_handle.ptr)
        }
        return PoolByteArray(value)
    }

    fun asPoolColorArray(): PoolColorArray {
        val value = memScoped {
            checkNotNull(Godot.gdnative.godot_variant_as_pool_color_array)(_handle.ptr)
        }
        return PoolColorArray(value)
    }

    fun asPoolIntArray(): PoolIntArray {
        val value = memScoped {
            checkNotNull(Godot.gdnative.godot_variant_as_pool_int_array)(_handle.ptr)
        }
        return PoolIntArray(value)
    }

    fun asPoolRealArray(): PoolFloatArray {
        val value = memScoped {
            checkNotNull(Godot.gdnative.godot_variant_as_pool_real_array)(_handle.ptr)
        }
        return PoolRealArray(value)
    }

    fun asPoolStringArray(): PoolStringArray {
        val value = memScoped {
            checkNotNull(Godot.gdnative.godot_variant_as_pool_string_array)(_handle.ptr)
        }
        return PoolStringArray(value)
    }

    fun asPoolVector2Array(): PoolVector2Array {
        val value = memScoped {
            checkNotNull(Godot.gdnative.godot_variant_as_pool_vector2_array)(_handle.ptr)
        }
        return PoolVector2Array(value)
    }

    fun asPoolVector3Array(): PoolVector3Array {
        val value = memScoped {
            checkNotNull(Godot.gdnative.godot_variant_as_pool_vector3_array)(_handle.ptr)
        }
        return PoolVector3Array(value)
    }

    fun asQuat(): Quat {
        val value = memScoped {
                    checkNotNull(Godot.gdnative.godot_variant_as_quat)(_handle.ptr)
        }
        return Quat(value)
    }

    fun asRID(): RID {
        val value = memScoped {
                   checkNotNull(Godot.gdnative.godot_variant_as_rid)(_handle.ptr)
        }
        return RID(value)
    }

    fun asVector2(): Vector2 {
        val value = memScoped {
            checkNotNull(Godot.gdnative.godot_variant_as_vector2)(_handle.ptr)
        }
        return Vector2(value)
    }

    fun asVector3(): Vector3 {
        val value = memScoped {
            checkNotNull(Godot.gdnative.godot_variant_as_vector3)(_handle.ptr)
        }
        return Vector3(value)
    }

    fun asRect2(): Rect2 {
        val value = memScoped {
            checkNotNull(Godot.gdnative.godot_variant_as_rect2)(_handle.ptr)
        }
        return Rect2(value)
    }

    fun asTransform2D(): Transform2D {
        val value = memScoped {
            checkNotNull(Godot.gdnative.godot_variant_as_transform2d)(_handle.ptr)
        }
        return Transform2D(value)
    }

    fun asPlane(): Plane {
        val value = memScoped {
            checkNotNull(Godot.gdnative.godot_variant_as_plane)(_handle.ptr)
        }
        return Plane(value)
    }



    fun asNodePath(): NodePath {
        val value = memScoped {
            checkNotNull(Godot.gdnative.godot_variant_as_node_path)(_handle.ptr)
        }
        return NodePath(value)
    }

    fun asTransform(): Transform {
        val value = memScoped {
            checkNotNull(Godot.gdnative.godot_variant_as_transform)(_handle.ptr)
        }
        return Transform(value)
    }

    fun asObject(): Object? {
        memScoped {
            val ptr = checkNotNull(Godot.gdnative.godot_variant_as_object)(_handle.ptr)
            if (ptr == null) {
                null
            } else {
                TypeManager.wrap(ptr)
            }
        }
    }
}

//FAKE CONSTRUCTORS. Necessary because inline classes don't support secondary constructors yet.
//NULL
fun Variant() = Variant.buildAny(Godot.gdnative.godot_variant_new_nil)

//PRIMITIVES
fun Variant(from: Boolean) = Variant.buildAny(Godot.gdnative.godot_variant_new_bool, from)
fun Variant(from: Int) = Variant.buildAny(Godot.gdnative.godot_variant_new_int, from.toLong())
fun Variant(from: Long) = Variant.buildAny(Godot.gdnative.godot_variant_new_int, from)
fun Variant(from: Float) = Variant.buildAny(Godot.gdnative.godot_variant_new_real, from.toDouble())
fun Variant(from: Double) = Variant.buildAny(Godot.gdnative.godot_variant_new_real, from)
fun Variant(from: String) = from.asGDString { Variant.buildAny(Godot.gdnative.godot_variant_new_string, it.ptr) }

//OBJECT
fun Variant(from: Object) = Variant.buildAny(Godot.gdnative.godot_variant_new_object, from.ptr)

//CORE
fun Variant(from: AABB) = Variant.buildAny(Godot.gdnative.godot_variant_new_aabb, from)
fun Variant(from: Basis) = Variant.buildAny(Godot.gdnative.godot_variant_new_basis, from)
fun Variant(from: Color) = Variant.buildAny(Godot.gdnative.godot_variant_new_color, from)
fun Variant(from: NodePath) = Variant.buildAny(Godot.gdnative.godot_variant_new_node_path, from)
fun Variant(from: Plane) = Variant.buildAny(Godot.gdnative.godot_variant_new_plane, from)
fun Variant(from: Quat) = Variant.buildAny(Godot.gdnative.godot_variant_new_quat, from)
fun Variant(from: RID) = Variant.buildAny(Godot.gdnative.godot_variant_new_rid, from)
fun Variant(from: Vector2) = Variant.buildAny(Godot.gdnative.godot_variant_new_vector2, from)
fun Variant(from: Vector3) = Variant.buildAny(Godot.gdnative.godot_variant_new_vector3, from)

//CONTAINER CORE
fun Variant(from: PoolByteArray) = Variant.buildAny(Godot.gdnative.godot_variant_new_pool_byte_array, from)
fun Variant(from: PoolColorArray) = Variant.buildAny(Godot.gdnative.godot_variant_new_pool_color_array, from)
fun Variant(from: PoolIntArray) = Variant.buildAny(Godot.gdnative.godot_variant_new_pool_int_array, from)
fun Variant(from: PoolRealArray) = Variant.buildAny(Godot.gdnative.godot_variant_new_pool_real_array, from)
fun Variant(from: PoolStringArray) = Variant.buildAny(Godot.gdnative.godot_variant_new_pool_string_array, from)
fun Variant(from: PoolVector2Array) = Variant.buildAny(Godot.gdnative.godot_variant_new_pool_vector2_array, from)
fun Variant(from: PoolVector3Array) = Variant.buildAny(Godot.gdnative.godot_variant_new_pool_vector3_array, from)
fun <T> Variant(from: VariantArray<T>) = Variant.buildAny(Godot.gdnative.godot_variant_new_array, from)


