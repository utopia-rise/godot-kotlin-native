@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import godot.Object

expect class Variant {
    constructor()
    constructor(other: Variant)
    constructor(other: Boolean)
    constructor(other: Byte)
    constructor(other: Long)
    constructor(other: Int)
    constructor(other: Short)
    constructor(other: Double)
    constructor(other: Float)
    constructor(other: String)
    constructor(other: GDArray)
    constructor(other: PoolByteArray)
    constructor(other: PoolColorArray)
    constructor(other: PoolIntArray)
    constructor(other: PoolRealArray)
    constructor(other: PoolStringArray)
    constructor(other: PoolVector2Array)
    constructor(other: PoolVector3Array)
    constructor(other: RID)
    constructor(other: Dictionary)
    constructor(other: NodePath)
    constructor(other: Basis)
    constructor(other: Color)
    constructor(other: Vector2)
    constructor(other: Vector3)
    constructor(other: Quat)
    constructor(other: AABB)
    constructor(other: Transform)
    constructor(other: Transform2D)
    constructor(other: Rect2)
    constructor(other: Plane)
    constructor(other: Object?)

    companion object

    fun dispose()
    fun booleanize(): Boolean
    fun toBoolean(): Boolean
    fun toInt(): Int
    fun toObject(): Object
    fun toLong(): Long
    fun toFloat(): Float
    fun toDouble(): Double
    fun toDictionary(): Dictionary
    fun toGDArray(): GDArray
    fun toNodePath(): NodePath
    fun toPoolByteArray(): PoolByteArray
    fun toPoolIntArray(): PoolIntArray
    fun toPoolColorArray(): PoolColorArray
    fun toPoolRealArray(): PoolRealArray
    fun toPoolStringArray(): PoolStringArray
    fun toPoolVector2Array(): PoolVector2Array
    fun toPoolVector3Array(): PoolVector3Array
    fun toBasis(): Basis
    fun toRID(): RID
    fun toQuat(): Quat
    fun toVector2(): Vector2
    fun toVector3(): Vector3
    fun toAABB(): AABB
    fun toPlane(): Plane
    fun toRect2(): Rect2
    fun toTransform(): Transform
    fun toTransform2D(): Transform2D
    fun getType(): Type
    fun call(str: String, args: Array<Variant> = arrayOf()): Variant
    fun hasMethod(method: String): Boolean
    fun hashCompare(other: Variant): Boolean

    enum class Type {
        NIL,

        BOOL,
        INT,
        REAL,
        STRING,

        VECTOR2, // 5
        RECT2,
        VECTOR3,
        TRANSFORM2D,
        PLANE,
        QUAT, // 10
        RECT3,
        BASIS,
        TRANSFORM,

        COLOR,
        NODE_PATH, // 15
        _RID,
        OBJECT,
        DICTIONARY,
        ARRAY,

        POOL_BYTE_ARRAY, // 20
        POOL_INT_ARRAY,
        POOL_REAL_ARRAY,
        POOL_STRING_ARRAY,
        POOL_VECTOR2_ARRAY,
        POOL_VECTOR3_ARRAY, // 25
        POOL_COLOR_ARRAY,

        VARIANT_MAX;

        companion object {
            fun fromInt(value: Long): Type
        }
    }

    enum class Operator {
        OP_EQUAL,
        OP_NOT_EQUAL,
        OP_LESS,
        OP_LESS_EQUAL,
        OP_GREATER,
        OP_GREATER_EQUAL,

        OP_ADD,
        OP_SUBSTRACT,
        OP_MULTIPLY,
        OP_DIVIDE,
        OP_NEGATE,
        OP_POSITIVE,
        OP_MODULE,
        OP_STRING_CONCAT,

        OP_SHIFT_LEFT,
        OP_SHIFT_RIGHT,
        OP_BIT_AND,
        OP_BIT_OR,
        OP_BIT_XOR,
        OP_BIT_NEGATE,

        OP_AND,
        OP_OR,
        OP_XOR,
        OP_NOT,

        OP_IN,
        OP_MAX;

        companion object {
            fun fromInt(value: Long): Operator
        }

    }
}

infix fun Variant.Companion.from(value: Any?): Variant = when (value) {
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
    else -> throw Exception("Cannot create Variant from $value")
}
