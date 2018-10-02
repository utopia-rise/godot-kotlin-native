@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class DynamicFont : Font {
    constructor() : super("DynamicFont")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class SpacingType(val id: Long) {
        SPACING_TOP(0),
        SPACING_BOTTOM(1),
        SPACING_CHAR(2),
        SPACING_SPACE(3),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: Font): DynamicFont = DynamicFont("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): DynamicFont = DynamicFont("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): DynamicFont = DynamicFont("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): DynamicFont = DynamicFont("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): DynamicFont = fromVariant(DynamicFont(""), other)


        // Constants
        const val SPACING_TOP: Long = 0
        const val SPACING_BOTTOM: Long = 1
        const val SPACING_CHAR: Long = 2
        const val SPACING_SPACE: Long = 3


    }


    // Properties
    open var size: Long
        get() = _icall_Long(getSizeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setSizeMethodBind, this.rawMemory, value)


    open var outlineSize: Long
        get() = _icall_Long(getOutlineSizeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setOutlineSizeMethodBind, this.rawMemory, value)


    open var outlineColor: Color
        get() = _icall_Color(getOutlineColorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Color(setOutlineColorMethodBind, this.rawMemory, value)
    open fun outlineColor(shedule: (Color) -> Unit): Color = outlineColor.apply {
        shedule(this)
        outlineColor = this
    }


    open var useMipmaps: Boolean
        get() = _icall_Boolean(getUseMipmapsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setUseMipmapsMethodBind, this.rawMemory, value)


    open var useFilter: Boolean
        get() = _icall_Boolean(getUseFilterMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setUseFilterMethodBind, this.rawMemory, value)


    open var extraSpacingTop: Long
        get() = _icall_Long_Long(getSpacingMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Long_Long(setSpacingMethodBind, this.rawMemory, 0, value)


    open var extraSpacingBottom: Long
        get() = _icall_Long_Long(getSpacingMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Long_Long(setSpacingMethodBind, this.rawMemory, 1, value)


    open var extraSpacingChar: Long
        get() = _icall_Long_Long(getSpacingMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Long_Long(setSpacingMethodBind, this.rawMemory, 2, value)


    open var extraSpacingSpace: Long
        get() = _icall_Long_Long(getSpacingMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Long_Long(setSpacingMethodBind, this.rawMemory, 3, value)


    open var fontData: DynamicFontData
        get() = _icall_DynamicFontData(getFontDataMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setFontDataMethodBind, this.rawMemory, value)




    // Methods
    private val setFontDataMethodBind: CPointer<godot_method_bind> by lazy { getMB("DynamicFont", "set_font_data") }
    open fun setFontData(data: DynamicFontData) {
        _icall_Unit_Object(setFontDataMethodBind, this.rawMemory, data)
    }


    private val getFontDataMethodBind: CPointer<godot_method_bind> by lazy { getMB("DynamicFont", "get_font_data") }
    open fun getFontData(): DynamicFontData {
        return _icall_DynamicFontData(getFontDataMethodBind, this.rawMemory)
    }


    private val setSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("DynamicFont", "set_size") }
    open fun setSize(data: Long) {
        _icall_Unit_Long(setSizeMethodBind, this.rawMemory, data)
    }


    private val getSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("DynamicFont", "get_size") }
    open fun getSize(): Long {
        return _icall_Long(getSizeMethodBind, this.rawMemory)
    }


    private val setOutlineSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("DynamicFont", "set_outline_size") }
    open fun setOutlineSize(size: Long) {
        _icall_Unit_Long(setOutlineSizeMethodBind, this.rawMemory, size)
    }


    private val getOutlineSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("DynamicFont", "get_outline_size") }
    open fun getOutlineSize(): Long {
        return _icall_Long(getOutlineSizeMethodBind, this.rawMemory)
    }


    private val setOutlineColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("DynamicFont", "set_outline_color") }
    open fun setOutlineColor(color: Color) {
        _icall_Unit_Color(setOutlineColorMethodBind, this.rawMemory, color)
    }


    private val getOutlineColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("DynamicFont", "get_outline_color") }
    open fun getOutlineColor(): Color {
        return _icall_Color(getOutlineColorMethodBind, this.rawMemory)
    }


    private val setUseMipmapsMethodBind: CPointer<godot_method_bind> by lazy { getMB("DynamicFont", "set_use_mipmaps") }
    open fun setUseMipmaps(enable: Boolean) {
        _icall_Unit_Boolean(setUseMipmapsMethodBind, this.rawMemory, enable)
    }


    private val getUseMipmapsMethodBind: CPointer<godot_method_bind> by lazy { getMB("DynamicFont", "get_use_mipmaps") }
    open fun getUseMipmaps(): Boolean {
        return _icall_Boolean(getUseMipmapsMethodBind, this.rawMemory)
    }


    private val setUseFilterMethodBind: CPointer<godot_method_bind> by lazy { getMB("DynamicFont", "set_use_filter") }
    open fun setUseFilter(enable: Boolean) {
        _icall_Unit_Boolean(setUseFilterMethodBind, this.rawMemory, enable)
    }


    private val getUseFilterMethodBind: CPointer<godot_method_bind> by lazy { getMB("DynamicFont", "get_use_filter") }
    open fun getUseFilter(): Boolean {
        return _icall_Boolean(getUseFilterMethodBind, this.rawMemory)
    }


    private val setSpacingMethodBind: CPointer<godot_method_bind> by lazy { getMB("DynamicFont", "set_spacing") }
    open fun setSpacing(type: Long, value: Long) {
        _icall_Unit_Long_Long(setSpacingMethodBind, this.rawMemory, type, value)
    }


    private val getSpacingMethodBind: CPointer<godot_method_bind> by lazy { getMB("DynamicFont", "get_spacing") }
    open fun getSpacing(type: Long): Long {
        return _icall_Long_Long(getSpacingMethodBind, this.rawMemory, type)
    }


    private val addFallbackMethodBind: CPointer<godot_method_bind> by lazy { getMB("DynamicFont", "add_fallback") }
    open fun addFallback(data: DynamicFontData) {
        _icall_Unit_Object(addFallbackMethodBind, this.rawMemory, data)
    }


    private val setFallbackMethodBind: CPointer<godot_method_bind> by lazy { getMB("DynamicFont", "set_fallback") }
    open fun setFallback(idx: Long, data: DynamicFontData) {
        _icall_Unit_Long_Object(setFallbackMethodBind, this.rawMemory, idx, data)
    }


    private val getFallbackMethodBind: CPointer<godot_method_bind> by lazy { getMB("DynamicFont", "get_fallback") }
    open fun getFallback(idx: Long): DynamicFontData {
        return _icall_DynamicFontData_Long(getFallbackMethodBind, this.rawMemory, idx)
    }


    private val removeFallbackMethodBind: CPointer<godot_method_bind> by lazy { getMB("DynamicFont", "remove_fallback") }
    open fun removeFallback(idx: Long) {
        _icall_Unit_Long(removeFallbackMethodBind, this.rawMemory, idx)
    }


    private val getFallbackCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("DynamicFont", "get_fallback_count") }
    open fun getFallbackCount(): Long {
        return _icall_Long(getFallbackCountMethodBind, this.rawMemory)
    }


}
