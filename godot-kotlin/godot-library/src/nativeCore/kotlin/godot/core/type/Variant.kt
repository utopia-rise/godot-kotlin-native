package godot.core.type

import godot.core.*
import godot.gdnative.godot_variant
import godot.gdnative.godot_variant_type
import kotlinx.cinterop.*

inline class Variant(internal val _handle: CValue<godot_variant>) {
    //CONSTANT
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

        fun wrapUnsafe(obj: Any?): CValue<godot_variant> {
            if (obj == null) {
                return Variant()._handle
            }
            val ret = when (obj) {
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
            return ret._handle
        }

        internal fun buildNil(block: CPointer<CFunction<(CPointer<godot_variant>?) -> Unit>>?): Variant {
            return Variant(
                memScoped {
                    cValue<godot_variant> {
                        checkNotNull(block)(this.ptr)
                    }
                }
            )
        }

        internal fun <T> buildAny(
            block: CPointer<CFunction<(CPointer<godot_variant>?, T) -> Unit>>?,
            value: T
        ): Variant {
            return Variant(
                memScoped {
                    cValue<godot_variant> {
                        checkNotNull(block)(this.ptr, value)
                    }
                }
            )
        }
    }

    fun <T> unwrap(): T {
        TODO()
    }

    fun asString(): String {
        TODO()
    }

    fun asInt(): Int {
        TODO()
    }

    fun <T> asVariantArray(): VariantArray<T> {
        TODO()
    }


    fun getRawMemory(memScope: MemScope): COpaquePointer {
        return _handle.getPointer(memScope)
    }
}

//FAKE CONSTRUCTORS. Necessary because inline classes don't support secondary constructors yet.
fun Variant() = Variant.buildNil(Godot.gdnative.godot_variant_new_nil)

fun Variant(from: Boolean) = Variant.buildAny(Godot.gdnative.godot_variant_new_bool, from)

fun Variant(from: Int) = Variant.buildAny(Godot.gdnative.godot_variant_new_int, from.toLong())
fun Variant(from: Long) = Variant.buildAny(Godot.gdnative.godot_variant_new_int, from)

fun Variant(from: Float) = Variant.buildAny(Godot.gdnative.godot_variant_new_real, from.toDouble())
fun Variant(from: Double) = Variant.buildAny(Godot.gdnative.godot_variant_new_real, from)

fun Variant(from: String) = from.asGDString { Variant.buildAny(Godot.gdnative.godot_variant_new_string, it.ptr) }

fun Variant(from: Object) = Variant.buildAny(Godot.gdnative.godot_variant_new_object, from.ptr)

