@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class NinePatchRect : Control {
    constructor() : super("NinePatchRect")
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
        infix fun from(other: Control): NinePatchRect = NinePatchRect("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): NinePatchRect = NinePatchRect("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): NinePatchRect = NinePatchRect("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): NinePatchRect = NinePatchRect("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): NinePatchRect = fromVariant(NinePatchRect(""), other)


        // Constants
        const val AXIS_STRETCH_MODE_STRETCH: Long = 0
        const val AXIS_STRETCH_MODE_TILE: Long = 1
        const val AXIS_STRETCH_MODE_TILE_FIT: Long = 2


    }


    // Properties
    open var texture: Texture
        get() = _icall_Texture(getTextureMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setTextureMethodBind, this.rawMemory, value)


    open var drawCenter: Boolean
        get() = _icall_Boolean(isDrawCenterEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setDrawCenterMethodBind, this.rawMemory, value)


    open var regionRect: Rect2
        get() = _icall_Rect2(getRegionRectMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Rect2(setRegionRectMethodBind, this.rawMemory, value)
    open fun regionRect(shedule: (Rect2) -> Unit): Rect2 = regionRect.apply {
        shedule(this)
        regionRect = this
    }


    open var patchMarginLeft: Long
        get() = _icall_Long_Long(getPatchMarginMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Long_Long(setPatchMarginMethodBind, this.rawMemory, 0, value)


    open var patchMarginTop: Long
        get() = _icall_Long_Long(getPatchMarginMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Long_Long(setPatchMarginMethodBind, this.rawMemory, 1, value)


    open var patchMarginRight: Long
        get() = _icall_Long_Long(getPatchMarginMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Long_Long(setPatchMarginMethodBind, this.rawMemory, 2, value)


    open var patchMarginBottom: Long
        get() = _icall_Long_Long(getPatchMarginMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Long_Long(setPatchMarginMethodBind, this.rawMemory, 3, value)


    open var axisStretchHorizontal: Long
        get() = _icall_Long(getHAxisStretchModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setHAxisStretchModeMethodBind, this.rawMemory, value)


    open var axisStretchVertical: Long
        get() = _icall_Long(getVAxisStretchModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setVAxisStretchModeMethodBind, this.rawMemory, value)




    // Methods
    private val setTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("NinePatchRect", "set_texture") }
    open fun setTexture(texture: Texture) {
        _icall_Unit_Object(setTextureMethodBind, this.rawMemory, texture)
    }


    private val getTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("NinePatchRect", "get_texture") }
    open fun getTexture(): Texture {
        return _icall_Texture(getTextureMethodBind, this.rawMemory)
    }


    private val setPatchMarginMethodBind: CPointer<godot_method_bind> by lazy { getMB("NinePatchRect", "set_patch_margin") }
    open fun setPatchMargin(margin: Long, value: Long) {
        _icall_Unit_Long_Long(setPatchMarginMethodBind, this.rawMemory, margin, value)
    }


    private val getPatchMarginMethodBind: CPointer<godot_method_bind> by lazy { getMB("NinePatchRect", "get_patch_margin") }
    open fun getPatchMargin(margin: Long): Long {
        return _icall_Long_Long(getPatchMarginMethodBind, this.rawMemory, margin)
    }


    private val setRegionRectMethodBind: CPointer<godot_method_bind> by lazy { getMB("NinePatchRect", "set_region_rect") }
    open fun setRegionRect(rect: Rect2) {
        _icall_Unit_Rect2(setRegionRectMethodBind, this.rawMemory, rect)
    }


    private val getRegionRectMethodBind: CPointer<godot_method_bind> by lazy { getMB("NinePatchRect", "get_region_rect") }
    open fun getRegionRect(): Rect2 {
        return _icall_Rect2(getRegionRectMethodBind, this.rawMemory)
    }


    private val setDrawCenterMethodBind: CPointer<godot_method_bind> by lazy { getMB("NinePatchRect", "set_draw_center") }
    open fun setDrawCenter(drawCenter: Boolean) {
        _icall_Unit_Boolean(setDrawCenterMethodBind, this.rawMemory, drawCenter)
    }


    private val isDrawCenterEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("NinePatchRect", "is_draw_center_enabled") }
    open fun isDrawCenterEnabled(): Boolean {
        return _icall_Boolean(isDrawCenterEnabledMethodBind, this.rawMemory)
    }


    private val setHAxisStretchModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("NinePatchRect", "set_h_axis_stretch_mode") }
    open fun setHAxisStretchMode(mode: Long) {
        _icall_Unit_Long(setHAxisStretchModeMethodBind, this.rawMemory, mode)
    }


    private val getHAxisStretchModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("NinePatchRect", "get_h_axis_stretch_mode") }
    open fun getHAxisStretchMode(): NinePatchRect.AxisStretchMode {
        return NinePatchRect.AxisStretchMode.fromInt(_icall_Long(getHAxisStretchModeMethodBind, this.rawMemory))
    }


    private val setVAxisStretchModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("NinePatchRect", "set_v_axis_stretch_mode") }
    open fun setVAxisStretchMode(mode: Long) {
        _icall_Unit_Long(setVAxisStretchModeMethodBind, this.rawMemory, mode)
    }


    private val getVAxisStretchModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("NinePatchRect", "get_v_axis_stretch_mode") }
    open fun getVAxisStretchMode(): NinePatchRect.AxisStretchMode {
        return NinePatchRect.AxisStretchMode.fromInt(_icall_Long(getVAxisStretchModeMethodBind, this.rawMemory))
    }


}
