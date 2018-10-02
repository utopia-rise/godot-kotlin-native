@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class StyleBoxTexture : StyleBox {
    constructor() : super("StyleBoxTexture")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class AxisStretchMode(val id: Long) {
        AXIS_STRETCH_MODE_STRETCH(0),
        AXIS_STRETCH_MODE_TILE(1),
        AXIS_STRETCH_MODE_TILE_FIT(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
            const val TEXTURE_CHANGED: String = "texture_changed"
        }
    }


    companion object {
        infix fun from(other: StyleBox): StyleBoxTexture = StyleBoxTexture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): StyleBoxTexture = StyleBoxTexture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): StyleBoxTexture = StyleBoxTexture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): StyleBoxTexture = StyleBoxTexture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): StyleBoxTexture = fromVariant(StyleBoxTexture(""), other)


        // Constants
        const val AXIS_STRETCH_MODE_STRETCH: Long = 0
        const val AXIS_STRETCH_MODE_TILE: Long = 1
        const val AXIS_STRETCH_MODE_TILE_FIT: Long = 2


    }


    // Properties
    open var texture: Texture
        get() = _icall_Texture(getTextureMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setTextureMethodBind, this.rawMemory, value)


    open var normalMap: Texture
        get() = _icall_Texture(getNormalMapMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setNormalMapMethodBind, this.rawMemory, value)


    open var regionRect: Rect2
        get() = _icall_Rect2(getRegionRectMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Rect2(setRegionRectMethodBind, this.rawMemory, value)
    open fun regionRect(shedule: (Rect2) -> Unit): Rect2 = regionRect.apply {
        shedule(this)
        regionRect = this
    }


    open var marginLeft: Double
        get() = _icall_Double_Long(getMarginSizeMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Long_Double(setMarginSizeMethodBind, this.rawMemory, 0, value)


    open var marginRight: Double
        get() = _icall_Double_Long(getMarginSizeMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Long_Double(setMarginSizeMethodBind, this.rawMemory, 2, value)


    open var marginTop: Double
        get() = _icall_Double_Long(getMarginSizeMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Long_Double(setMarginSizeMethodBind, this.rawMemory, 1, value)


    open var marginBottom: Double
        get() = _icall_Double_Long(getMarginSizeMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Long_Double(setMarginSizeMethodBind, this.rawMemory, 3, value)


    open var expandMarginLeft: Double
        get() = _icall_Double_Long(getExpandMarginSizeMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Long_Double(setExpandMarginSizeMethodBind, this.rawMemory, 0, value)


    open var expandMarginRight: Double
        get() = _icall_Double_Long(getExpandMarginSizeMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Long_Double(setExpandMarginSizeMethodBind, this.rawMemory, 2, value)


    open var expandMarginTop: Double
        get() = _icall_Double_Long(getExpandMarginSizeMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Long_Double(setExpandMarginSizeMethodBind, this.rawMemory, 1, value)


    open var expandMarginBottom: Double
        get() = _icall_Double_Long(getExpandMarginSizeMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Long_Double(setExpandMarginSizeMethodBind, this.rawMemory, 3, value)


    open var axisStretchHorizontal: Long
        get() = _icall_Long(getHAxisStretchModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setHAxisStretchModeMethodBind, this.rawMemory, value)


    open var axisStretchVertical: Long
        get() = _icall_Long(getVAxisStretchModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setVAxisStretchModeMethodBind, this.rawMemory, value)


    open var modulateColor: Color
        get() = _icall_Color(getModulateMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Color(setModulateMethodBind, this.rawMemory, value)
    open fun modulateColor(shedule: (Color) -> Unit): Color = modulateColor.apply {
        shedule(this)
        modulateColor = this
    }


    open var drawCenter: Boolean
        get() = _icall_Boolean(isDrawCenterEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setDrawCenterMethodBind, this.rawMemory, value)




    // Methods
    private val setTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxTexture", "set_texture") }
    open fun setTexture(texture: Texture) {
        _icall_Unit_Object(setTextureMethodBind, this.rawMemory, texture)
    }


    private val getTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxTexture", "get_texture") }
    open fun getTexture(): Texture {
        return _icall_Texture(getTextureMethodBind, this.rawMemory)
    }


    private val setNormalMapMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxTexture", "set_normal_map") }
    open fun setNormalMap(normalMap: Texture) {
        _icall_Unit_Object(setNormalMapMethodBind, this.rawMemory, normalMap)
    }


    private val getNormalMapMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxTexture", "get_normal_map") }
    open fun getNormalMap(): Texture {
        return _icall_Texture(getNormalMapMethodBind, this.rawMemory)
    }


    private val setMarginSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxTexture", "set_margin_size") }
    open fun setMarginSize(margin: Long, size: Double) {
        _icall_Unit_Long_Double(setMarginSizeMethodBind, this.rawMemory, margin, size)
    }


    private val getMarginSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxTexture", "get_margin_size") }
    open fun getMarginSize(margin: Long): Double {
        return _icall_Double_Long(getMarginSizeMethodBind, this.rawMemory, margin)
    }


    private val setExpandMarginSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxTexture", "set_expand_margin_size") }
    open fun setExpandMarginSize(margin: Long, size: Double) {
        _icall_Unit_Long_Double(setExpandMarginSizeMethodBind, this.rawMemory, margin, size)
    }


    private val setExpandMarginAllMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxTexture", "set_expand_margin_all") }
    open fun setExpandMarginAll(size: Double) {
        _icall_Unit_Double(setExpandMarginAllMethodBind, this.rawMemory, size)
    }


    private val setExpandMarginIndividualMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxTexture", "set_expand_margin_individual") }
    open fun setExpandMarginIndividual(sizeLeft: Double, sizeTop: Double, sizeRight: Double, sizeBottom: Double) {
        _icall_Unit_Double_Double_Double_Double(setExpandMarginIndividualMethodBind, this.rawMemory, sizeLeft, sizeTop, sizeRight, sizeBottom)
    }


    private val getExpandMarginSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxTexture", "get_expand_margin_size") }
    open fun getExpandMarginSize(margin: Long): Double {
        return _icall_Double_Long(getExpandMarginSizeMethodBind, this.rawMemory, margin)
    }


    private val setRegionRectMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxTexture", "set_region_rect") }
    open fun setRegionRect(region: Rect2) {
        _icall_Unit_Rect2(setRegionRectMethodBind, this.rawMemory, region)
    }


    private val getRegionRectMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxTexture", "get_region_rect") }
    open fun getRegionRect(): Rect2 {
        return _icall_Rect2(getRegionRectMethodBind, this.rawMemory)
    }


    private val setDrawCenterMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxTexture", "set_draw_center") }
    open fun setDrawCenter(enable: Boolean) {
        _icall_Unit_Boolean(setDrawCenterMethodBind, this.rawMemory, enable)
    }


    private val isDrawCenterEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxTexture", "is_draw_center_enabled") }
    open fun isDrawCenterEnabled(): Boolean {
        return _icall_Boolean(isDrawCenterEnabledMethodBind, this.rawMemory)
    }


    private val setModulateMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxTexture", "set_modulate") }
    open fun setModulate(color: Color) {
        _icall_Unit_Color(setModulateMethodBind, this.rawMemory, color)
    }


    private val getModulateMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxTexture", "get_modulate") }
    open fun getModulate(): Color {
        return _icall_Color(getModulateMethodBind, this.rawMemory)
    }


    private val setHAxisStretchModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxTexture", "set_h_axis_stretch_mode") }
    open fun setHAxisStretchMode(mode: Long) {
        _icall_Unit_Long(setHAxisStretchModeMethodBind, this.rawMemory, mode)
    }


    private val getHAxisStretchModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxTexture", "get_h_axis_stretch_mode") }
    open fun getHAxisStretchMode(): StyleBoxTexture.AxisStretchMode {
        return StyleBoxTexture.AxisStretchMode.fromInt(_icall_Long(getHAxisStretchModeMethodBind, this.rawMemory))
    }


    private val setVAxisStretchModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxTexture", "set_v_axis_stretch_mode") }
    open fun setVAxisStretchMode(mode: Long) {
        _icall_Unit_Long(setVAxisStretchModeMethodBind, this.rawMemory, mode)
    }


    private val getVAxisStretchModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxTexture", "get_v_axis_stretch_mode") }
    open fun getVAxisStretchMode(): StyleBoxTexture.AxisStretchMode {
        return StyleBoxTexture.AxisStretchMode.fromInt(_icall_Long(getVAxisStretchModeMethodBind, this.rawMemory))
    }


}
