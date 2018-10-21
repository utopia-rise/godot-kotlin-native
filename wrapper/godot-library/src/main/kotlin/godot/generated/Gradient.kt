@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Gradient : Resource {
    constructor() : super("Gradient")
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
        infix fun from(other: Resource): Gradient = Gradient("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): Gradient = Gradient("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Gradient = Gradient("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Gradient = fromVariant(Gradient(""), other)


        // Constants


    }


    // Properties
    open var offsets: PoolRealArray
        get() = _icall_PoolRealArray(getOffsetsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_PoolRealArray(setOffsetsMethodBind, this.rawMemory, value)


    open var colors: PoolColorArray
        get() = _icall_PoolColorArray(getColorsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_PoolColorArray(setColorsMethodBind, this.rawMemory, value)




    // Methods
    private val addPointMethodBind: CPointer<godot_method_bind> by lazy { getMB("Gradient", "add_point") }
    open fun addPoint(offset: Double, color: Color) {
        _icall_Unit_Double_Color(addPointMethodBind, this.rawMemory, offset, color)
    }


    private val removePointMethodBind: CPointer<godot_method_bind> by lazy { getMB("Gradient", "remove_point") }
    open fun removePoint(offset: Long) {
        _icall_Unit_Long(removePointMethodBind, this.rawMemory, offset)
    }


    private val setOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("Gradient", "set_offset") }
    open fun setOffset(point: Long, offset: Double) {
        _icall_Unit_Long_Double(setOffsetMethodBind, this.rawMemory, point, offset)
    }


    private val getOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("Gradient", "get_offset") }
    open fun getOffset(point: Long): Double {
        return _icall_Double_Long(getOffsetMethodBind, this.rawMemory, point)
    }


    private val setColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("Gradient", "set_color") }
    open fun setColor(point: Long, color: Color) {
        _icall_Unit_Long_Color(setColorMethodBind, this.rawMemory, point, color)
    }


    private val getColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("Gradient", "get_color") }
    open fun getColor(point: Long): Color {
        return _icall_Color_Long(getColorMethodBind, this.rawMemory, point)
    }


    private val interpolateMethodBind: CPointer<godot_method_bind> by lazy { getMB("Gradient", "interpolate") }
    open fun interpolate(offset: Double): Color {
        return _icall_Color_Double(interpolateMethodBind, this.rawMemory, offset)
    }


    private val getPointCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("Gradient", "get_point_count") }
    open fun getPointCount(): Long {
        return _icall_Long(getPointCountMethodBind, this.rawMemory)
    }


    private val setOffsetsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Gradient", "set_offsets") }
    open fun setOffsets(offsets: PoolRealArray) {
        _icall_Unit_PoolRealArray(setOffsetsMethodBind, this.rawMemory, offsets)
    }


    private val getOffsetsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Gradient", "get_offsets") }
    open fun getOffsets(): PoolRealArray {
        return _icall_PoolRealArray(getOffsetsMethodBind, this.rawMemory)
    }


    private val setColorsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Gradient", "set_colors") }
    open fun setColors(colors: PoolColorArray) {
        _icall_Unit_PoolColorArray(setColorsMethodBind, this.rawMemory, colors)
    }


    private val getColorsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Gradient", "get_colors") }
    open fun getColors(): PoolColorArray {
        return _icall_PoolColorArray(getColorsMethodBind, this.rawMemory)
    }


}
