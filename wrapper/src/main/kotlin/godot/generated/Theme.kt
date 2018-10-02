@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Theme : Resource {
    constructor() : super("Theme")
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
        infix fun from(other: Resource): Theme = Theme("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): Theme = Theme("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Theme = Theme("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Theme = fromVariant(Theme(""), other)


        // Constants


    }


    // Properties
    open var defaultFont: Font
        get() = _icall_Font(getDefaultFontMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setDefaultFontMethodBind, this.rawMemory, value)




    // Methods
    private val setIconMethodBind: CPointer<godot_method_bind> by lazy { getMB("Theme", "set_icon") }
    open fun setIcon(name: String, type: String, texture: Texture) {
        _icall_Unit_String_String_Object(setIconMethodBind, this.rawMemory, name, type, texture)
    }


    private val getIconMethodBind: CPointer<godot_method_bind> by lazy { getMB("Theme", "get_icon") }
    open fun getIcon(name: String, type: String): Texture {
        return _icall_Texture_String_String(getIconMethodBind, this.rawMemory, name, type)
    }


    private val hasIconMethodBind: CPointer<godot_method_bind> by lazy { getMB("Theme", "has_icon") }
    open fun hasIcon(name: String, type: String): Boolean {
        return _icall_Boolean_String_String(hasIconMethodBind, this.rawMemory, name, type)
    }


    private val clearIconMethodBind: CPointer<godot_method_bind> by lazy { getMB("Theme", "clear_icon") }
    open fun clearIcon(name: String, type: String) {
        _icall_Unit_String_String(clearIconMethodBind, this.rawMemory, name, type)
    }


    private val getIconListMethodBind: CPointer<godot_method_bind> by lazy { getMB("Theme", "get_icon_list") }
    open fun getIconList(type: String): PoolStringArray {
        return _icall_PoolStringArray_String(getIconListMethodBind, this.rawMemory, type)
    }


    private val setStyleboxMethodBind: CPointer<godot_method_bind> by lazy { getMB("Theme", "set_stylebox") }
    open fun setStylebox(name: String, type: String, texture: StyleBox) {
        _icall_Unit_String_String_Object(setStyleboxMethodBind, this.rawMemory, name, type, texture)
    }


    private val getStyleboxMethodBind: CPointer<godot_method_bind> by lazy { getMB("Theme", "get_stylebox") }
    open fun getStylebox(name: String, type: String): StyleBox {
        return _icall_StyleBox_String_String(getStyleboxMethodBind, this.rawMemory, name, type)
    }


    private val hasStyleboxMethodBind: CPointer<godot_method_bind> by lazy { getMB("Theme", "has_stylebox") }
    open fun hasStylebox(name: String, type: String): Boolean {
        return _icall_Boolean_String_String(hasStyleboxMethodBind, this.rawMemory, name, type)
    }


    private val clearStyleboxMethodBind: CPointer<godot_method_bind> by lazy { getMB("Theme", "clear_stylebox") }
    open fun clearStylebox(name: String, type: String) {
        _icall_Unit_String_String(clearStyleboxMethodBind, this.rawMemory, name, type)
    }


    private val getStyleboxListMethodBind: CPointer<godot_method_bind> by lazy { getMB("Theme", "get_stylebox_list") }
    open fun getStyleboxList(type: String): PoolStringArray {
        return _icall_PoolStringArray_String(getStyleboxListMethodBind, this.rawMemory, type)
    }


    private val getStyleboxTypesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Theme", "get_stylebox_types") }
    open fun getStyleboxTypes(): PoolStringArray {
        return _icall_PoolStringArray(getStyleboxTypesMethodBind, this.rawMemory)
    }


    private val setFontMethodBind: CPointer<godot_method_bind> by lazy { getMB("Theme", "set_font") }
    open fun setFont(name: String, type: String, font: Font) {
        _icall_Unit_String_String_Object(setFontMethodBind, this.rawMemory, name, type, font)
    }


    private val getFontMethodBind: CPointer<godot_method_bind> by lazy { getMB("Theme", "get_font") }
    open fun getFont(name: String, type: String): Font {
        return _icall_Font_String_String(getFontMethodBind, this.rawMemory, name, type)
    }


    private val hasFontMethodBind: CPointer<godot_method_bind> by lazy { getMB("Theme", "has_font") }
    open fun hasFont(name: String, type: String): Boolean {
        return _icall_Boolean_String_String(hasFontMethodBind, this.rawMemory, name, type)
    }


    private val clearFontMethodBind: CPointer<godot_method_bind> by lazy { getMB("Theme", "clear_font") }
    open fun clearFont(name: String, type: String) {
        _icall_Unit_String_String(clearFontMethodBind, this.rawMemory, name, type)
    }


    private val getFontListMethodBind: CPointer<godot_method_bind> by lazy { getMB("Theme", "get_font_list") }
    open fun getFontList(type: String): PoolStringArray {
        return _icall_PoolStringArray_String(getFontListMethodBind, this.rawMemory, type)
    }


    private val setColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("Theme", "set_color") }
    open fun setColor(name: String, type: String, color: Color) {
        _icall_Unit_String_String_Color(setColorMethodBind, this.rawMemory, name, type, color)
    }


    private val getColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("Theme", "get_color") }
    open fun getColor(name: String, type: String): Color {
        return _icall_Color_String_String(getColorMethodBind, this.rawMemory, name, type)
    }


    private val hasColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("Theme", "has_color") }
    open fun hasColor(name: String, type: String): Boolean {
        return _icall_Boolean_String_String(hasColorMethodBind, this.rawMemory, name, type)
    }


    private val clearColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("Theme", "clear_color") }
    open fun clearColor(name: String, type: String) {
        _icall_Unit_String_String(clearColorMethodBind, this.rawMemory, name, type)
    }


    private val getColorListMethodBind: CPointer<godot_method_bind> by lazy { getMB("Theme", "get_color_list") }
    open fun getColorList(type: String): PoolStringArray {
        return _icall_PoolStringArray_String(getColorListMethodBind, this.rawMemory, type)
    }


    private val setConstantMethodBind: CPointer<godot_method_bind> by lazy { getMB("Theme", "set_constant") }
    open fun setConstant(name: String, type: String, constant: Int) {
        _icall_Unit_String_String_Int(setConstantMethodBind, this.rawMemory, name, type, constant)
    }


    private val getConstantMethodBind: CPointer<godot_method_bind> by lazy { getMB("Theme", "get_constant") }
    open fun getConstant(name: String, type: String): Int {
        return _icall_Int_String_String(getConstantMethodBind, this.rawMemory, name, type)
    }


    private val hasConstantMethodBind: CPointer<godot_method_bind> by lazy { getMB("Theme", "has_constant") }
    open fun hasConstant(name: String, type: String): Boolean {
        return _icall_Boolean_String_String(hasConstantMethodBind, this.rawMemory, name, type)
    }


    private val clearConstantMethodBind: CPointer<godot_method_bind> by lazy { getMB("Theme", "clear_constant") }
    open fun clearConstant(name: String, type: String) {
        _icall_Unit_String_String(clearConstantMethodBind, this.rawMemory, name, type)
    }


    private val getConstantListMethodBind: CPointer<godot_method_bind> by lazy { getMB("Theme", "get_constant_list") }
    open fun getConstantList(type: String): PoolStringArray {
        return _icall_PoolStringArray_String(getConstantListMethodBind, this.rawMemory, type)
    }


    private val setDefaultFontMethodBind: CPointer<godot_method_bind> by lazy { getMB("Theme", "set_default_font") }
    open fun setDefaultFont(font: Font) {
        _icall_Unit_Object(setDefaultFontMethodBind, this.rawMemory, font)
    }


    private val getDefaultFontMethodBind: CPointer<godot_method_bind> by lazy { getMB("Theme", "get_default_font") }
    open fun getDefaultFont(): Font {
        return _icall_Font(getDefaultFontMethodBind, this.rawMemory)
    }


    private val getTypeListMethodBind: CPointer<godot_method_bind> by lazy { getMB("Theme", "get_type_list") }
    open fun getTypeList(type: String): PoolStringArray {
        return _icall_PoolStringArray_String(getTypeListMethodBind, this.rawMemory, type)
    }


    open fun _emit_theme_changed() {
    }


    private val copyDefaultThemeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Theme", "copy_default_theme") }
    open fun copyDefaultTheme() {
        _icall_Unit(copyDefaultThemeMethodBind, this.rawMemory)
    }


}
