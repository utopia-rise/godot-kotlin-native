@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class BitMap : Resource {
    constructor() : super("BitMap")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: Resource): BitMap = BitMap("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): BitMap = BitMap("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): BitMap = BitMap("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): BitMap = fromVariant(BitMap(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val createMethodBind: CPointer<godot_method_bind> by lazy { getMB("BitMap", "create") }
    open fun create(size: Vector2) {
        _icall_Unit_Vector2(createMethodBind, this.rawMemory, size)
    }


    private val createFromImageAlphaMethodBind: CPointer<godot_method_bind> by lazy { getMB("BitMap", "create_from_image_alpha") }
    open fun createFromImageAlpha(image: Image, threshold: Float = 0.1f) {
        _icall_Unit_Object_Float(createFromImageAlphaMethodBind, this.rawMemory, image, threshold)
    }


    private val setBitMethodBind: CPointer<godot_method_bind> by lazy { getMB("BitMap", "set_bit") }
    open fun setBit(position: Vector2, bit: Boolean) {
        _icall_Unit_Vector2_Boolean(setBitMethodBind, this.rawMemory, position, bit)
    }


    private val getBitMethodBind: CPointer<godot_method_bind> by lazy { getMB("BitMap", "get_bit") }
    open fun getBit(position: Vector2): Boolean {
        return _icall_Boolean_Vector2(getBitMethodBind, this.rawMemory, position)
    }


    private val setBitRectMethodBind: CPointer<godot_method_bind> by lazy { getMB("BitMap", "set_bit_rect") }
    open fun setBitRect(pRect: Rect2, bit: Boolean) {
        _icall_Unit_Rect2_Boolean(setBitRectMethodBind, this.rawMemory, pRect, bit)
    }


    private val getTrueBitCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("BitMap", "get_true_bit_count") }
    open fun getTrueBitCount(): Int {
        return _icall_Int(getTrueBitCountMethodBind, this.rawMemory)
    }


    private val getSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("BitMap", "get_size") }
    open fun getSize(): Vector2 {
        return _icall_Vector2(getSizeMethodBind, this.rawMemory)
    }


    open fun _set_data(arg0: Dictionary) {
    }


    open fun _get_data(): Dictionary {
        throw NotImplementedError("_get_data is not implemented for BitMap")
    }


}
