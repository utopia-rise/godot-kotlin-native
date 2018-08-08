package kotlin.godot.core

import godot.*
import kotlinx.cinterop.*

class Variant {
    var godotVariant = cValue<godot_variant> {
        godot_variant_new_nil(this.ptr)
    }

    //TODO: Other casts + other constructors

    fun booleanize(): Boolean = godotVariant.useContents { godot_variant_booleanize(this.ptr) }

    fun toBoolean(): Boolean = godotVariant.useContents { godot_variant_as_bool(this.ptr) }

    fun toInt(): Int = this.toLong().toInt()

    fun toLong(): Long = godotVariant.useContents { godot_variant_as_int(this.ptr) }

    fun toGodotString(): GodotString {
        val newString = GodotString()
        newString.godotString = godotVariant.useContents { godot_variant_as_string(this.ptr) }
        return newString
    }

    override fun toString(): String = this.toGodotString().toString()

    fun toDouble(): Double = godotVariant.useContents { godot_variant_as_real(this.ptr) }

    fun toFloat(): Float = this.toDouble().toFloat()

    fun toDictionary(): Dictionary {
        val newDict = Dictionary()
        newDict.godotDictionary = godotVariant.useContents { godot_variant_as_dictionary(this.ptr) }
        return newDict
    }

    fun toGodotArray(): GodotArray {
        val newArray = GodotArray()
        newArray.godotArray = godotVariant.useContents { godot_variant_as_array(this.ptr) }
        return newArray
    }

    fun getType(): godot_variant_type = godotVariant.useContents { godot_variant_get_type(this.ptr) } //TODO: Normal return type

    fun call(str: GodotString, args: Variant, count: Int) { //TODO: double pointer
        //val newVar = Variant()
        //newVar.godotVariant = Utils.useContents(godotVariant, str.godotString) { a, b ->
        //    args.godotVariant.useContents {
        //        godot_variant_call(a.ptr, b.ptr, this.ptr, count, null)
        //    }
        //}
    }

    fun hasMethod(method: GodotString): Boolean = Utils.useContents(godotVariant, method.godotString) { a, b ->
        godot_variant_has_method(a.ptr, b.ptr)
    }

    fun hasMethod(method: String): Boolean {
        val godotStr = GodotString(method)
        return Utils.useContents(godotVariant, godotStr.godotString) { a, b ->
            godot_variant_has_method(a.ptr, b.ptr)
        }
    }

    override fun equals(other: Any?): Boolean =
        if(other is Variant) Utils.useContents(godotVariant, other.godotVariant) { a, b ->
            godot_variant_operator_equal(a.ptr, b.ptr) }
        else false

    fun hashCompare(other: Variant): Boolean = Utils.useContents(godotVariant, other.godotVariant) { a, b ->
        godot_variant_hash_compare(a.ptr, b.ptr)
    }

    operator fun compareTo(other: Variant) =
            if (this == other) 0
            else if( Utils.useContents(godotVariant, other.godotVariant) { a, b ->
                        godot_variant_operator_less(a.ptr, b.ptr)
                    }) -1
            else 1
}
