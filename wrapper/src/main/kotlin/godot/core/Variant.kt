package kotlin.godot.core

import godot.*
import kotlinx.cinterop.*
import kotlin.godot.Object

class Variant: CoreType {
    internal var nativeValue = cValue<godot_variant> { godot_variant_new_nil(this.ptr) }

    constructor()

    internal constructor(native: CValue<godot_variant>) {
        nativeValue = nativeValue.copy { godot_variant_new_copy(this.ptr, native) }
    }

    internal constructor(mem: COpaquePointer) {
        this.setRawMemory(mem)
    }

    constructor(other: Variant) {
        nativeValue = nativeValue.copy { godot_variant_new_copy(this.ptr, other.nativeValue) }
    }

    constructor(other: Boolean) {
        nativeValue = nativeValue.copy { godot_variant_new_bool(this.ptr, other) }
    }

    constructor(other: Byte) {
        nativeValue = nativeValue.copy { godot_variant_new_int(this.ptr, other.toLong()) }
    }

    constructor(other: Long) {
        nativeValue = nativeValue.copy { godot_variant_new_int(this.ptr, other) }
    }

    constructor(other: Int) {
        nativeValue = nativeValue.copy { godot_variant_new_int(this.ptr, other.toLong()) }
    }

    constructor(other: Short) {
        nativeValue = nativeValue.copy { godot_variant_new_int(this.ptr, other.toLong()) }
    }

    constructor(other: Float) {
        nativeValue = nativeValue.copy { godot_variant_new_real(this.ptr, other.toDouble()) }
    }

    constructor(other: Double) {
        nativeValue = nativeValue.copy { godot_variant_new_real(this.ptr, other) }
    }

    constructor(other: String) {
        nativeValue = nativeValue.copy { godot_variant_new_string(this.ptr, GodotString(other).nativeValue) }
    }

    constructor(other: GodotString) {
        nativeValue = nativeValue.copy { godot_variant_new_string(this.ptr, other.nativeValue) }
    }

    constructor(other: GodotArray) {
        nativeValue = nativeValue.copy { godot_variant_new_array(this.ptr, other.nativeValue) }
    }

    constructor(other: PoolByteArray) {
        nativeValue = nativeValue.copy { godot_variant_new_pool_byte_array(this.ptr, other.nativeValue) }
    }

    constructor(other: PoolIntArray) {
        nativeValue = nativeValue.copy { godot_variant_new_pool_int_array(this.ptr, other.nativeValue) }
    }

    constructor(other: PoolColorArray) {
        nativeValue = nativeValue.copy { godot_variant_new_pool_color_array(this.ptr, other.nativeValue) }
    }

    constructor(other: PoolRealArray) {
        nativeValue = nativeValue.copy { godot_variant_new_pool_real_array(this.ptr, other.nativeValue) }
    }

    constructor(other: PoolStringArray) {
        nativeValue = nativeValue.copy { godot_variant_new_pool_string_array(this.ptr, other.nativeValue) }
    }

    constructor(other: PoolVector2Array) {
        nativeValue = nativeValue.copy { godot_variant_new_pool_vector2_array(this.ptr, other.nativeValue) }
    }

    constructor(other: PoolVector3Array) {
        nativeValue = nativeValue.copy { godot_variant_new_pool_vector3_array(this.ptr, other.nativeValue) }
    }

    constructor(other: RID) {
        nativeValue = nativeValue.copy { godot_variant_new_rid(this.ptr, other.nativeValue) }
    }

    constructor(other: Dictionary) {
        nativeValue = nativeValue.copy { godot_variant_new_dictionary(this.ptr, other.nativeValue) }
    }

    constructor(other: NodePath) {
        nativeValue = nativeValue.copy { godot_variant_new_node_path(this.ptr, other.nativeValue) }
    }

    constructor(other: Basis) {
        memScoped {
            nativeValue = nativeValue.copy { godot_variant_new_rid(this.ptr, other.getRawMemory(memScope).reinterpret()) }
        }
    }

    constructor(other: Color) {
        memScoped {
            nativeValue = nativeValue.copy { godot_variant_new_color(this.ptr, other.getRawMemory(memScope).reinterpret()) }
        }
    }

    constructor(other: Vector2) {
        memScoped {
            nativeValue = nativeValue.copy { godot_variant_new_vector2(this.ptr, other.getRawMemory(memScope).reinterpret()) }
        }
    }

    constructor(other: Vector3) {
        memScoped {
            nativeValue = nativeValue.copy { godot_variant_new_vector3(this.ptr, other.getRawMemory(memScope).reinterpret()) }
        }
    }

    constructor(other: Quat) {
        memScoped {
            nativeValue = nativeValue.copy { godot_variant_new_quat(this.ptr, other.getRawMemory(memScope).reinterpret()) }
        }
    }

    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return nativeValue.getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        nativeValue = mem.reinterpret<godot_variant>().pointed.readValue()
    }


    //TODO: Other casts + other constructors

    fun booleanize(): Boolean = godot_variant_booleanize(nativeValue)

    fun toBoolean(): Boolean = godot_variant_as_bool(nativeValue)

    fun toInt(): Int = this.toLong().toInt()

    fun toObject(): Object {
        TODO()
    }

    fun toLong(): Long = godot_variant_as_int(nativeValue)

    fun toGodotString(): GodotString = GodotString(godot_variant_as_string(nativeValue))

    fun toKString(): String = this.toGodotString().toString()

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

    fun getType(): Int = godot_variant_get_type(nativeValue).value

    fun call(str: GodotString, args: Array<Variant>): Variant {
        val newVar = Variant()
        memScoped {
            val arr = allocArray<CPointerVar<godot_variant>>(args.size)
            for((idx,arg) in args.withIndex()){
                arr[idx] = arg.nativeValue.useContents { this.ptr }
            }
            newVar.nativeValue = godot_variant_call(nativeValue, str.nativeValue, arr, args.size, null)
        }
        return newVar
    }

    fun hasMethod(method: GodotString): Boolean = godot_variant_has_method(nativeValue, method.nativeValue)

    fun hasMethod(method: String): Boolean = godot_variant_has_method(nativeValue, GodotString(method).nativeValue)

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

}
