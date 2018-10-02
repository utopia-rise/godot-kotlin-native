@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class StyleBoxFlat : StyleBox {
    constructor() : super("StyleBoxFlat")
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
        infix fun from(other: StyleBox): StyleBoxFlat = StyleBoxFlat("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): StyleBoxFlat = StyleBoxFlat("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): StyleBoxFlat = StyleBoxFlat("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): StyleBoxFlat = StyleBoxFlat("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): StyleBoxFlat = fromVariant(StyleBoxFlat(""), other)


        // Constants


    }


    // Properties
    open var bgColor: Color
        get() = _icall_Color(getBgColorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Color(setBgColorMethodBind, this.rawMemory, value)
    open fun bgColor(shedule: (Color) -> Unit): Color = bgColor.apply {
        shedule(this)
        bgColor = this
    }


    open var drawCenter: Boolean
        get() = _icall_Boolean(isDrawCenterEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setDrawCenterMethodBind, this.rawMemory, value)


    open var borderWidthLeft: Long
        get() = _icall_Long_Long(getBorderWidthMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Long_Long(setBorderWidthMethodBind, this.rawMemory, 0, value)


    open var borderWidthTop: Long
        get() = _icall_Long_Long(getBorderWidthMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Long_Long(setBorderWidthMethodBind, this.rawMemory, 1, value)


    open var borderWidthRight: Long
        get() = _icall_Long_Long(getBorderWidthMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Long_Long(setBorderWidthMethodBind, this.rawMemory, 2, value)


    open var borderWidthBottom: Long
        get() = _icall_Long_Long(getBorderWidthMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Long_Long(setBorderWidthMethodBind, this.rawMemory, 3, value)


    open var borderColor: Color
        get() = _icall_Color(getBorderColorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Color(setBorderColorMethodBind, this.rawMemory, value)
    open fun borderColor(shedule: (Color) -> Unit): Color = borderColor.apply {
        shedule(this)
        borderColor = this
    }


    open var borderBlend: Boolean
        get() = _icall_Boolean(getBorderBlendMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setBorderBlendMethodBind, this.rawMemory, value)


    open var cornerRadiusTopLeft: Long
        get() = _icall_Long_Long(getCornerRadiusMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Long_Long(setCornerRadiusMethodBind, this.rawMemory, 0, value)


    open var cornerRadiusTopRight: Long
        get() = _icall_Long_Long(getCornerRadiusMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Long_Long(setCornerRadiusMethodBind, this.rawMemory, 1, value)


    open var cornerRadiusBottomRight: Long
        get() = _icall_Long_Long(getCornerRadiusMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Long_Long(setCornerRadiusMethodBind, this.rawMemory, 2, value)


    open var cornerRadiusBottomLeft: Long
        get() = _icall_Long_Long(getCornerRadiusMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Long_Long(setCornerRadiusMethodBind, this.rawMemory, 3, value)


    open var cornerDetail: Long
        get() = _icall_Long(getCornerDetailMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setCornerDetailMethodBind, this.rawMemory, value)


    open var expandMarginLeft: Double
        get() = _icall_Double_Long(getExpandMarginMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Long_Double(setExpandMarginMethodBind, this.rawMemory, 0, value)


    open var expandMarginRight: Double
        get() = _icall_Double_Long(getExpandMarginMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Long_Double(setExpandMarginMethodBind, this.rawMemory, 2, value)


    open var expandMarginTop: Double
        get() = _icall_Double_Long(getExpandMarginMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Long_Double(setExpandMarginMethodBind, this.rawMemory, 1, value)


    open var expandMarginBottom: Double
        get() = _icall_Double_Long(getExpandMarginMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Long_Double(setExpandMarginMethodBind, this.rawMemory, 3, value)


    open var shadowColor: Color
        get() = _icall_Color(getShadowColorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Color(setShadowColorMethodBind, this.rawMemory, value)
    open fun shadowColor(shedule: (Color) -> Unit): Color = shadowColor.apply {
        shedule(this)
        shadowColor = this
    }


    open var shadowSize: Long
        get() = _icall_Long(getShadowSizeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setShadowSizeMethodBind, this.rawMemory, value)


    open var antiAliasing: Boolean
        get() = _icall_Boolean(isAntiAliasedMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setAntiAliasedMethodBind, this.rawMemory, value)


    open var antiAliasingSize: Long
        get() = _icall_Long(getAaSizeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setAaSizeMethodBind, this.rawMemory, value)




    // Methods
    private val setBgColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxFlat", "set_bg_color") }
    open fun setBgColor(color: Color) {
        _icall_Unit_Color(setBgColorMethodBind, this.rawMemory, color)
    }


    private val getBgColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxFlat", "get_bg_color") }
    open fun getBgColor(): Color {
        return _icall_Color(getBgColorMethodBind, this.rawMemory)
    }


    private val setBorderColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxFlat", "set_border_color") }
    open fun setBorderColor(color: Color) {
        _icall_Unit_Color(setBorderColorMethodBind, this.rawMemory, color)
    }


    private val getBorderColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxFlat", "get_border_color") }
    open fun getBorderColor(): Color {
        return _icall_Color(getBorderColorMethodBind, this.rawMemory)
    }


    private val setBorderWidthAllMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxFlat", "set_border_width_all") }
    open fun setBorderWidthAll(width: Long) {
        _icall_Unit_Long(setBorderWidthAllMethodBind, this.rawMemory, width)
    }


    private val getBorderWidthMinMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxFlat", "get_border_width_min") }
    open fun getBorderWidthMin(): Long {
        return _icall_Long(getBorderWidthMinMethodBind, this.rawMemory)
    }


    private val setBorderWidthMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxFlat", "set_border_width") }
    open fun setBorderWidth(margin: Long, width: Long) {
        _icall_Unit_Long_Long(setBorderWidthMethodBind, this.rawMemory, margin, width)
    }


    private val getBorderWidthMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxFlat", "get_border_width") }
    open fun getBorderWidth(margin: Long): Long {
        return _icall_Long_Long(getBorderWidthMethodBind, this.rawMemory, margin)
    }


    private val setBorderBlendMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxFlat", "set_border_blend") }
    open fun setBorderBlend(blend: Boolean) {
        _icall_Unit_Boolean(setBorderBlendMethodBind, this.rawMemory, blend)
    }


    private val getBorderBlendMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxFlat", "get_border_blend") }
    open fun getBorderBlend(): Boolean {
        return _icall_Boolean(getBorderBlendMethodBind, this.rawMemory)
    }


    private val setCornerRadiusIndividualMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxFlat", "set_corner_radius_individual") }
    open fun setCornerRadiusIndividual(radiusTopLeft: Long, radiusTopRight: Long, radiusBottomRight: Long, radiusBottomLeft: Long) {
        _icall_Unit_Long_Long_Long_Long(setCornerRadiusIndividualMethodBind, this.rawMemory, radiusTopLeft, radiusTopRight, radiusBottomRight, radiusBottomLeft)
    }


    private val setCornerRadiusAllMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxFlat", "set_corner_radius_all") }
    open fun setCornerRadiusAll(radius: Long) {
        _icall_Unit_Long(setCornerRadiusAllMethodBind, this.rawMemory, radius)
    }


    private val setCornerRadiusMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxFlat", "set_corner_radius") }
    open fun setCornerRadius(corner: Long, radius: Long) {
        _icall_Unit_Long_Long(setCornerRadiusMethodBind, this.rawMemory, corner, radius)
    }


    private val getCornerRadiusMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxFlat", "get_corner_radius") }
    open fun getCornerRadius(corner: Long): Long {
        return _icall_Long_Long(getCornerRadiusMethodBind, this.rawMemory, corner)
    }


    private val setExpandMarginMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxFlat", "set_expand_margin") }
    open fun setExpandMargin(margin: Long, size: Double) {
        _icall_Unit_Long_Double(setExpandMarginMethodBind, this.rawMemory, margin, size)
    }


    private val setExpandMarginAllMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxFlat", "set_expand_margin_all") }
    open fun setExpandMarginAll(size: Double) {
        _icall_Unit_Double(setExpandMarginAllMethodBind, this.rawMemory, size)
    }


    private val setExpandMarginIndividualMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxFlat", "set_expand_margin_individual") }
    open fun setExpandMarginIndividual(sizeLeft: Double, sizeTop: Double, sizeRight: Double, sizeBottom: Double) {
        _icall_Unit_Double_Double_Double_Double(setExpandMarginIndividualMethodBind, this.rawMemory, sizeLeft, sizeTop, sizeRight, sizeBottom)
    }


    private val getExpandMarginMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxFlat", "get_expand_margin") }
    open fun getExpandMargin(margin: Long): Double {
        return _icall_Double_Long(getExpandMarginMethodBind, this.rawMemory, margin)
    }


    private val setDrawCenterMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxFlat", "set_draw_center") }
    open fun setDrawCenter(drawCenter: Boolean) {
        _icall_Unit_Boolean(setDrawCenterMethodBind, this.rawMemory, drawCenter)
    }


    private val isDrawCenterEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxFlat", "is_draw_center_enabled") }
    open fun isDrawCenterEnabled(): Boolean {
        return _icall_Boolean(isDrawCenterEnabledMethodBind, this.rawMemory)
    }


    private val setShadowColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxFlat", "set_shadow_color") }
    open fun setShadowColor(color: Color) {
        _icall_Unit_Color(setShadowColorMethodBind, this.rawMemory, color)
    }


    private val getShadowColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxFlat", "get_shadow_color") }
    open fun getShadowColor(): Color {
        return _icall_Color(getShadowColorMethodBind, this.rawMemory)
    }


    private val setShadowSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxFlat", "set_shadow_size") }
    open fun setShadowSize(size: Long) {
        _icall_Unit_Long(setShadowSizeMethodBind, this.rawMemory, size)
    }


    private val getShadowSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxFlat", "get_shadow_size") }
    open fun getShadowSize(): Long {
        return _icall_Long(getShadowSizeMethodBind, this.rawMemory)
    }


    private val setAntiAliasedMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxFlat", "set_anti_aliased") }
    open fun setAntiAliased(antiAliased: Boolean) {
        _icall_Unit_Boolean(setAntiAliasedMethodBind, this.rawMemory, antiAliased)
    }


    private val isAntiAliasedMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxFlat", "is_anti_aliased") }
    open fun isAntiAliased(): Boolean {
        return _icall_Boolean(isAntiAliasedMethodBind, this.rawMemory)
    }


    private val setAaSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxFlat", "set_aa_size") }
    open fun setAaSize(size: Long) {
        _icall_Unit_Long(setAaSizeMethodBind, this.rawMemory, size)
    }


    private val getAaSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxFlat", "get_aa_size") }
    open fun getAaSize(): Long {
        return _icall_Long(getAaSizeMethodBind, this.rawMemory)
    }


    private val setCornerDetailMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxFlat", "set_corner_detail") }
    open fun setCornerDetail(detail: Long) {
        _icall_Unit_Long(setCornerDetailMethodBind, this.rawMemory, detail)
    }


    private val getCornerDetailMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxFlat", "get_corner_detail") }
    open fun getCornerDetail(): Long {
        return _icall_Long(getCornerDetailMethodBind, this.rawMemory)
    }


}
