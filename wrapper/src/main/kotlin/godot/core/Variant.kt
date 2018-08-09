package kotlin.godot.core

import godot.*
import kotlinx.cinterop.*

class Variant: CoreType {
    internal var nativeValue = cValue<godot_variant> { godot_variant_new_nil(this.ptr) }

    constructor()

    internal constructor(native: CValue<godot_variant>){
        nativeValue = nativeValue.copy { godot_variant_new_copy(this.ptr, native) }
    }

    constructor(other: Variant) {
        nativeValue = nativeValue.copy { godot_variant_new_copy(this.ptr, other.nativeValue) }
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

    fun toLong(): Long = godot_variant_as_int(nativeValue)

    fun toGodotString(): GodotString = GodotString(godot_variant_as_string(nativeValue))

    override fun toString(): String = this.toGodotString().toString()

    fun toDouble(): Double = godot_variant_as_real(nativeValue)

    fun toFloat(): Float = this.toDouble().toFloat()

    fun toDictionary(): Dictionary = Dictionary(godot_variant_as_dictionary(nativeValue))

    fun toGodotArray(): GodotArray = GodotArray(godot_variant_as_array(nativeValue))

    fun toNodePath(): NodePath = NodePath(godot_variant_as_node_path(nativeValue))

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
